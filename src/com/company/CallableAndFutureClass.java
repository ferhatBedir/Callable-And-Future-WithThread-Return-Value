package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFutureClass {

    static Operations operations = new Operations();
    List<Integer> list = new ArrayList<>();
    ExecutorService executor = Executors.newFixedThreadPool(4);

    public List<Integer> returnValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayısı giriniz..");
        int number1 = Integer.parseInt(scanner.nextLine());
        list.add(number1);
        System.out.println("İkinci sayıyı giriniz..");
        int number2 = Integer.parseInt(scanner.nextLine());
        list.add(number2);
        return list;
    }

    public void callableadd() {

        Future<?> futureAdd = executor.submit(() -> {
            int result;
            result = operations.add(list.get(0), list.get(1));
            System.out.println("Thread topluyor....");
            Thread.sleep(1000);
            return result;

        });

        try {
            System.out.println("Toplama işlemi sonucu--> " + futureAdd.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

    public void callableProfit() {


        Future<?> futureProfit = executor.submit(() -> {
            int result;
            result = operations.profit(list.get(0), list.get(1));
            System.out.println("Thread Çıkarıyor....");
            Thread.sleep(2000);
            return result;
        });

        try

        {
            System.out.println("Çıkarma işlemi sonucu--> " + futureProfit.get());
        } catch (
                InterruptedException e)

        {
            e.printStackTrace();
        } catch (
                ExecutionException e)

        {
            e.printStackTrace();
        }
    }

    public void callableMultiplication() {

        Future<?> futureMultiplication = executor.submit(() -> {
            int result;
            result = operations.multiplication(list.get(0), list.get(1));
            System.out.println("Thread Çarpıyor....");
            Thread.sleep(3000);
            return result;
        });

        try

        {
            System.out.println("Çarpma işlemi sonucu--> " + futureMultiplication.get());
        } catch (
                InterruptedException e)

        {
            e.printStackTrace();
        } catch (
                ExecutionException e)

        {
            e.printStackTrace();
        }
    }

    public void callAbleDivision() {

        Future<?> futureDivision = executor.submit(() -> {
            int result;
            result = operations.division(list.get(0), list.get(1));
            System.out.println("Thread bölüyor....");
            Thread.sleep(4000);
            return result;
        });

        try

        {
            System.out.println("Bölme işlemi sonucu--> " + futureDivision.get());
        } catch (
                InterruptedException e)

        {
            e.printStackTrace();
        } catch (
                ExecutionException e)

        {
            e.printStackTrace();
        }


        executor.shutdown();
    }

}
