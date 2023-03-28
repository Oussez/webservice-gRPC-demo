package com.Oussez.client;

import com.Oussez.stubs.Bank;
import com.Oussez.stubs.BankServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class BankClient3 {
    /**
     * Client Streaming MODEL          1:30
     **/
    public static void main(String[] args) throws IOException {
        //Declarer un canal de communication
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 9999)
                .usePlaintext()
                .build();

        BankServiceGrpc.BankServiceStub asyncStub = BankServiceGrpc.newStub(managedChannel); //communication asynchrone(non bloquante que pour le cas UNARY MODEL
        Bank.ConvertCurrencyRequest currencyRequest = Bank.ConvertCurrencyRequest.newBuilder()
                .setCurrencyTo("MAD")
                .setCurrencyFrom("USD")
                .setAmount(351)
                .build();

        //Faire appeler le service de serveur en mode streaming

        StreamObserver<Bank.ConvertCurrencyRequest> requestObservable =
                asyncStub.convertStreamClient(new StreamObserver<Bank.ConvertCurrencyResponse>() {
                    //traitement sur les réponses envoyées par le serveur en mode streaming

                    @Override
                    public void onNext(Bank.ConvertCurrencyResponse convertCurrencyResponse) {
                        System.out.println(">> Server response --> total Amount = " + convertCurrencyResponse);

                    }

                    @Override
                    public void onError(Throwable throwable) {

                    }

                    @Override
                    public void onCompleted() {
                        System.out.println(">> Server has ended the communication");
                    }
                });

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            int total_request=0;

            @Override
            public void run() {
                requestObservable.onNext(currencyRequest); //send the request to the server
                total_request++;
                System.out.println(">> Client send msg ["+total_request+"]");
                if (total_request == 3) {
                    requestObservable.onCompleted();
                    System.out.println(">> Client stopped the communication [ Total requests : " + total_request-- + " ]");
                    timer.cancel();
                }

            }
        }, 2000, 2000);

        System.out.println(">> Reponse de serveur \n");
        System.in.read(); //permet de bloquer le thread jusqu"à qu'il lit la méthode Next() ou Complete()


    }
}
