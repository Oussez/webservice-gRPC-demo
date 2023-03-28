package com.Oussez.client;

import com.Oussez.stubs.Bank;
import com.Oussez.stubs.BankServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Timer;
import java.util.TimerTask;

public class BankClient4 {
    /**                               Client Streaming MODEL          1:30           **/
    public static void main(String[] args) throws IOException {
        //Declarer un canal de communication
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",9999)
                                        .usePlaintext()
                                        .build();

        BankServiceGrpc.BankServiceStub asyncStub = BankServiceGrpc.newStub(managedChannel); //communication asynchrone(non bloquante que pour le cas UNARY MODEL
        Bank.ConvertCurrencyRequest currencyRequest = Bank.ConvertCurrencyRequest.newBuilder()
                .setCurrencyTo("MAD")
                .setCurrencyFrom("USD")
                .setAmount(Math.random()*100)
                .build();

        //la partie de streaming des reponses de serveur
        StreamObserver<Bank.ConvertCurrencyRequest> responseObservable =
                asyncStub.convertStreamCltSrv(new StreamObserver<Bank.ConvertCurrencyResponse>() {
                    //traitement sur les réponses envoyées par le serveur en mode streaming
                    int nbr_msg = 0;
                    @Override
                    public void onNext(Bank.ConvertCurrencyResponse convertCurrencyResponse) {
                        nbr_msg++;
                        System.out.println(">> Server response ["+nbr_msg+"]: "+convertCurrencyResponse);

                    }

                    @Override
                    public void onError(Throwable throwable) {

                    }

                    @Override
                    public void onCompleted() {
                        System.out.println(">> Server has ended the communication [ Total responses : "+nbr_msg+" ]");
                    }
                });

            Timer timer = new Timer();
        timer.schedule(new TimerTask() {
                int total_request;
                @Override
                public void run() {
                    responseObservable.onNext(currencyRequest); //send the request to the server
                    total_request++;
                    if(total_request ==4){
                        responseObservable.onCompleted();
                        System.out.println(">> Client stopped the communication [ Total requests : "+total_request+" ]");
                        timer.cancel();
                    }

                }
            }, 2000,2000);

        System.out.println(">> Reponse de serveur \n");
        System.in.read(); //permet de bloquer le thread jusqu"à qu'il lit la méthode Next() ou Complete()
    }

}
