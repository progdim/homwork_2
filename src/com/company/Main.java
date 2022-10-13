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

    //Ex5
       var jar = 120;
       var brown = 4;
        var white = 2;
        var oneClass = brown + white;
        var ollClass = jar / oneClass;
        var whiteJar = ollClass * white;
        var brownJar = ollClass * brown;
        System.out.println("В школе, где "+ollClass+" классов, нужно "+whiteJar+" банок белой краски и "+brownJar+" банок коричневой краски.");

    //Ex6
      var bananals = 5 * 80;
      var milk = 200 * 105;
      var iskreem = 2 * 100;
      var egg = 4 * 70;
      var breakfastGram = bananals+milk+iskreem+egg;
        System.out.println("Вес спорт завтрака составил: "+breakfastGram /1000+"кг.");


    //Ex7
        var weightDifference = breakfastGram - 7;
        var option1 = weightDifference /250;
        var option2 = weightDifference / 500;
        System.out.println("Первый вариант составит "+option1+" дней, Второй вариант составит "+option2+" дня");

        //Ex8
        var Masha = 67760;
        var Denis = 83690;
        var Kristina = 76230;

        var zpMashaEar = Masha *12;
        var zpDenisEar = Denis *12;
        var zpKristinaEar = Kristina *12;

        var zpMashaNew = (((Masha * 10)/100) +Masha)*12;
        var zpDenisNew = (((Denis * 10)/100)+ Denis)*12;
        var zpKristinaNew = (((Kristina * 10)/100) + Kristina)*12;

        var differenceZpMasha = zpMashaNew -zpMashaEar;
        var differenceZpDenis = zpDenisNew - zpDenisEar;
        var differenceZpKristina = zpKristinaNew - zpKristinaEar;

        System.out.println("Годовой доход до повышения зарплаты: ");
        System.out.println("Маша "+ zpMashaEar);
        System.out.println("Денис " + zpDenisEar);
        System.out.println("Кристина "+ zpKristinaEar);

        System.out.println("После повышения зарплаты");
        System.out.println("Маша "+ zpMashaNew);
        System.out.println("Денис"+ zpDenisNew);
        System.out.println("Кристина"+ zpKristinaNew);

        System.out.println("Разница годового дохода после повышения");
        System.out.println("Маша " +differenceZpMasha);
        System.out.println("Денис " +differenceZpDenis);
        System.out.println("Кристина " +differenceZpKristina);

    }
}
