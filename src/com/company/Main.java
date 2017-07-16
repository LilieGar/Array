package com.company;

import java.util.Random;

        public class Main {
            public static void main(String[] args) {
                final byte pointCount = 6;
                Random random = new Random();
                byte[] pointArray = new byte[6];
                for(int i=0; i < pointCount; i++){
                    pointArray[i] = (byte)(random.nextInt(6));
                    System.out.println((i+1) + pointArray[i]);
                }
            }
        }