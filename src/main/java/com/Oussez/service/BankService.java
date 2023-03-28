package com.Oussez.service;

import com.Oussez.stubs.Bank;
import com.Oussez.stubs.BankServiceGrpc;
import io.grpc.stub.StreamObserver;
import java.util.Timer;
import java.util.TimerTask;


public class BankService extends BankServiceGrpc.BankServiceImplBase {
    @Override
    public void convert(Bank.ConvertCurrencyRequest request,
                        StreamObserver<com.Oussez.stubs.Bank.ConvertCurrencyResponse> responseObserver) {

            //initialisation des attributs de message de réponse.
            double amount = request.getAmount();
            String currencyFrom = request.getCurrencyFrom();
            String currencyTo = request.getCurrencyTo();

            double result=amount*10.3;

            Bank.ConvertCurrencyResponse convertCurrencyResponse = Bank.ConvertCurrencyResponse.newBuilder() //declaration de la réponse à envoyer
                    .setCurrencyFrom(currencyFrom)
                    .setCurrencyTo(currencyTo)
                    .setAmount(amount)
                    .setResult(result)
                    .build();//Creation de message de réponse

            responseObserver.onNext(convertCurrencyResponse); //envoyer la réponse au client
            responseObserver.onCompleted(); //notifier le client que le serveur à arreter la communication.
        }

    @Override
    /**Methode de Server Streaming Model**/
    public void convertStreamServer(Bank.ConvertCurrencyRequest request, StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
        //initialisation des attributs de message de réponse.
        double amount = request.getAmount();
        String currencyFrom = request.getCurrencyFrom();
        String currencyTo = request.getCurrencyTo();

        Timer timer = new Timer();

        //Rendre le renvoie de réponse répététive après chaque 2000ms
        timer.schedule(new TimerTask() {
            int nbr_msg;
            @Override
            public void run() {
//                if(Context.current().isCancelled()){
//                    System.out.println(">> User has cancelled the communication");
//                    timer.cancel();}

                Bank.ConvertCurrencyResponse response = Bank.ConvertCurrencyResponse.newBuilder()
                        .setCurrencyFrom(currencyFrom)
                        .setCurrencyTo(currencyTo)
                        .setAmount(amount)
                        .setResult(amount*10)
                        .build();

                responseObserver.onNext(response);

                System.out.println("*** MSG ["+nbr_msg+"] has been sent");
                ++nbr_msg;

                if(nbr_msg == 3){
                    responseObserver.onCompleted();
                    timer.cancel();
                }
            }
        },2000,2000);


    }

    /**Methode de Client Streaming Model**/
    @Override
    public StreamObserver<Bank.ConvertCurrencyRequest> convertStreamClient(StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
        return new StreamObserver<Bank.ConvertCurrencyRequest>() {
            double total_amount=0;
            @Override
            public void onNext(Bank.ConvertCurrencyRequest convertCurrencyRequest) {
                System.out.println(">> MSG ["+total_amount+"] --> "+convertCurrencyRequest.getAmount()+"$");
                total_amount+=convertCurrencyRequest.getAmount();
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                Bank.ConvertCurrencyResponse response = Bank.ConvertCurrencyResponse.newBuilder()
                        .setAmount(total_amount)
                        .build();

                responseObserver.onNext(response);
                responseObserver.onCompleted();
                System.out.println(">> FIN ");


            }
        };
    }

    /** Bi-Directional Stream Model**/

    public StreamObserver<Bank.ConvertCurrencyRequest> convertStreamCltSrv(StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
        return new StreamObserver<Bank.ConvertCurrencyRequest>() {
            double somme;
            int total_request;
            @Override
            public void onNext(Bank.ConvertCurrencyRequest convertCurrencyRequest) {
                total_request++;
                somme += convertCurrencyRequest.getAmount();
            Bank.ConvertCurrencyResponse response = Bank.ConvertCurrencyResponse.newBuilder()
                    .setResult(somme)
                    .build();

                System.out.println(">> Client request ["+total_request+"]");
            responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void getListAccount(Bank.listAccountRequest request, StreamObserver<Bank.listAccount> responseObserver) {
        Bank.listAccount.Builder listAccount = Bank.listAccount.newBuilder();
        //List<Bank.AccountTransaction> performedTransactions=new ArrayList<>();
        for(int i=1;i<=request.getTotalAccount();i++) {
            Bank.Account account = Bank.Account.newBuilder()
                    .setId(i)
                    .setName("Client_" + i)
                    .setAmount(Math.random() * 500)
                    .setStatus("Activated")
                    .build();

            listAccount.addAccount(account);
        };
        responseObserver.onNext(listAccount.build());
        responseObserver.onCompleted();
    }
}
