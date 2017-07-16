package com.company;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        double avgPoint = 0;
        final byte pointCount = 7;
        Random random = new Random();
        byte[] pointArray = new byte[pointCount];
        int sum = 0;
        for(int i=0; i < pointCount; i++){
            pointArray[i] = (byte)(random.nextInt(7));
            sum=sum+pointArray[i];
        }
        System.out.println("Введите номер Вашего лотерейного билета.");
        Scanner scanner = new Scanner(System.in);
        byte Lucky = scanner.nextByte();
        System.out.println("Сегодняшнее число выигрыша: " + sum);
        if (sum == Lucky)
            System.out.println("Поздравляем, Вы выиграли!");
        else {
            System.out.println("К сожалению Ваш номер не выиграл. Не отчаивайтесь, Вам обязательно повезет в следующий раз!");
    }

    }
}


