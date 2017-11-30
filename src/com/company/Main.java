package com.company;

import java.util.Random;

public class Main {
    //1 2 3 4 5 /6/7/    8 9 10 11 12 /13/ /14/ 15 16 17 18 19 /20/ /21
    public final static int WORK_DAYS = 30;

    public final static int START_WORK = 8;
    public final static int END_WORK = 21;

    final static int RANDOM_AMOUNT_VISITORS = 10;
    final static int RANDOM_AMOUNT_BUY = 10;

    public static int holidaysCounter = 1;

    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i < WORK_DAYS + 1; i++) {
            System.out.println("\n------Day: " + i + "------");
            if (holidaysCounter >= 1 && holidaysCounter <= 5)
                System.out.println("-----Work Day-----");
                if (holidaysCounter == 6 || holidaysCounter == 7) {
                    System.out.println("-----Day off-----");
                    System.out.println("-------Наценка в выходной 15%-------->>");
                    System.out.println(" ");
                }
                if (holidaysCounter == 7) {
                    holidaysCounter = 0;
                }
                holidaysCounter++;
                for (int j = START_WORK; j < END_WORK + 1; j++) {
                    System.out.println("Time: " + j + ":00");
                    Random random = new Random();
                    int vizitors = random.nextInt(RANDOM_AMOUNT_VISITORS) + 1;
                    System.out.println("Amount visitors:" + vizitors);
                    for (int k = 1; k < vizitors + 1; k++) {
                        int amountBuy = random.nextInt(RANDOM_AMOUNT_BUY);
                        System.out.println("Vizitor: " + k + " Buy: " + amountBuy + " Amount");
                    }
                }
                System.out.println("End of the day.");
                System.out.println("Purchase of goods where less than 10");
            }
        }
    }

