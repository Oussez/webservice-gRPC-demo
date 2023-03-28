package com.Oussez.client;

import com.Oussez.stubs.Bank;
import com.Oussez.stubs.BankServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class BankClient2 {
    /**                               Server Streaming MODEL          1:30           **/
    public static void main(String[] args) throws IOException {
        //Declarer un canal de communication
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",9999)
                                        .usePlaintext()
                                        .build();

        BankServiceGrpc.BankServiceStub asyncStub = BankServiceGrpc.newStub(managedChannel); //communication asynchrone(non bloquante )
        Bank.ConvertCurrencyRequest currencyRequest = Bank.ConvertCurrencyRequest.newBuilder()
                .setCurrencyTo("MAD")
                .setCurrencyFrom("USD")
                .setAmount(351)
                .build();

        //Faire appeler le service de serveur en mode streaming
        asyncStub.convertStreamServer(currencyRequest, new StreamObserver<Bank.ConvertCurrencyResponse>() {

            @Override
            public void onNext(Bank.ConvertCurrencyResponse convertCurrencyResponse) { //response sent from server
                System.out.println(">> [SERVER RESPONSE] :\n "+convertCurrencyResponse);
            }

            @Override
            public void onError(Throwable throwable) { //response sent from server
                System.out.println(">> [ERROR]: "+throwable.getMessage());
            }

            @Override
            public void onCompleted() {//response sent from server
                System.out.println(">> SERVER has end the communication streaming]");
            }
        });

        System.out.println(">> Reponse de serveur \n");
        System.in.read();

    }

}
