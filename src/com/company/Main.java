package com.company;

public class Main {
                                                //Program steps:
    public static void main(String[] args) {    //1
        //Think Java - Exercise 4.3 (Opg. 1,2)
        System.out.print("No, I ");             //2
        zoop();                                 //3
        System.out.print("I ");                 //23
        baffle();                               //24
    }                                           //32

        public static void zoop() {             //4
            baffle();                           //5
            System.out.print("You wugga ");     //13
            baffle();                           //14
    }                                           //22

        public static void baffle() {           //6 //15 //25
            System.out.print("wug");            //7 //16 //26
            ping();                             //8 //17 //27
    }                                           //12 //21 //31

        public static void ping() {             //9 //18 //28
            System.out.println(".");            //10 //19 //29
    }                                           //11 //20 //30
}                                               //33

                                                //Opg. 2.
                                                //Out put er:
                                                //No, I wug.
                                                //You wugga wug.
                                                //I wug.
