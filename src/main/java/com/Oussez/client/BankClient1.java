package com.Oussez.client;

import com.Oussez.stubs.Bank;
import com.Oussez.stubs.BankServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class BankClient1 {
    /**                               UNARY MODEL                     **/
    public static void main(String[] args) {
        //Declarer un canal de communication
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",9999)
                                        .usePlaintext()
                                        .build();

        BankServiceGrpc.BankServiceBlockingStub blockingStub = BankServiceGrpc.newBlockingStub(managedChannel); //communication bloquante que pour le cas UNARY MODEL
        //Initialisation de message requete
        Bank.ConvertCurrencyRequest currencyRequest = Bank.ConvertCurrencyRequest.newBuilder()
                .setCurrencyTo("MAD")
                .setCurrencyFrom("USD")
                .setAmount(351)
                .build();

        Bank.ConvertCurrencyResponse currencyResponse = blockingStub.convert(currencyRequest);//faire appel à le service 'convert(requete_de_client)'
        System.out.println(currencyResponse);

    }

}
