package com.company;

public class Main {

    public static void main(String[] args) {
	int numberOne = 27897;
    byte numberTwo = 67;
    short numberThree = -159 ;
    long numberFour = 987678965549L;
    float numberFive = 2.786f;
    double numberSix = 27.12;
    boolean numberSeven = false;

    //Ex3
    var LudmilaP = 23;
    var AnnaS = 27;
    var EkaterinaA = 30;
    var totalList = 480;

    var totalStudents = LudmilaP + AnnaS + EkaterinaA;
    var oneStudentList = totalList / totalStudents;
        System.out.println(oneStudentList);


    //Ex4
        var butilka = 16;
        var timeB = 2;
        var tame1 = 20;
        var tame2 = 1440;
        var tame3 = 4320;
        var tame4 = 43800;

        var costOne = tame1 / timeB * butilka;
        var costTwo = tame2 / timeB * butilka;
        var costThree = tame3 / timeB * butilka;
        var costFour = tame4 / timeB * butilka;


        System.out.println("За " + tame1 + " минут машины произвела бутылок " +costOne+  " штук.");
        System.out.println("За " + tame2 + " минут машины произвела бутылок " +costTwo+  " штук.");
        System.out.println("За " + tame3 + " минут машины произвела бутылок " +costThree+  " штук.");
        System.out.println("За " + tame4 + " минут машины произвела бутылок " +costFour+  " штук.");


    }
}
