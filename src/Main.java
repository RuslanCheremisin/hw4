import java.sql.SQLOutput;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        //Задача 1 про возраст учёбы и работы
        int age = 18;
        if(age>=18){
            System.out.println("Welcome to the real world\n");
        }else{
            System.out.println("Stay a while and listen...\n");
        }

        int vozrast = 4;
        boolean detSad = vozrast>=2 && vozrast <7;
        boolean poraVShkolu = vozrast>=7 && vozrast<18;
        boolean poraVUniver = vozrast>=18 && vozrast<24;
        boolean poraNaJob = vozrast>=24;
        if(poraVShkolu){
            System.out.println("Welcome to school, kid\n");
        }
        else if(poraVUniver){
            System.out.println("Welcome to university, bro\n");
        }else if(poraNaJob){
            System.out.println("Why don't you get a job?\n");
        }else if(detSad){
            System.out.println("Детский садик Тормозок, группа Педалька\n");
        }

        //Задача 2 про места в вагоне
        int seats=32;
        if(seats<=60){
            System.out.println("Please, take a seat\n");
        }else{
            System.out.println("Sorry, you have to stand\n");
        }

        //Задача 3 про аттракцион

        int kidAge = 12;
        boolean canNotRide = kidAge<5;
        boolean rideWithAdult = kidAge>=5 && kidAge<14;

        if(canNotRide){
            System.out.println("Access denied!\n");
        } else if (rideWithAdult) {
            System.out.println("Only with daddy\n");
        }else{
            System.out.println("God speed!\n");
        }

        //Задача 4 про 3 числа

        int one = 1;
        int two = 2;
        int three = 3;
        if(one>two && one>three){
            System.out.println(one+"\n");
        } else if (two>one && two>three) {
            System.out.println(two+"\n");
        }else{
            System.out.println(three+"\n");
        }

        //Доп задача 1 про чётные и нечётные числа

        int number = 13;
        if (number%2==0 && number!=0){
            System.out.println("Number "+number+" is even\n");
        }else{
            System.out.println("Number "+number+" is odd\n");
        }

        //Доп задача 2 про числа, ближайшие к 10

        float p = 7.3f;
        float d = 11.13f;

        if(Math.abs(10-p)<Math.abs(10-d)){
            System.out.println(p+"\n");
        }else{
            System.out.println(d+"\n");
        }

        //Доп задача 3

        Random random = new Random();
        int min = 3;
        int max = 158;
        int diff = max-min;
        int i = random.nextInt(diff+1)+min;
        if (i>=22 && i<=99){
            System.out.println(i+" is within the range\n");
        }else{
            System.out.println(i+" is out of range\n");
        }

        //Доп задача 4

        min = 100;
        max = 999;
        diff = max-min;
        i = random.nextInt(diff+1)+min;
        System.out.println(i);
        int lastDigit = i-i/10*10;
        int middleDigit = (i - i/100*100)/10;
        int firstDigit=i/100;
        if (lastDigit>middleDigit && lastDigit>firstDigit){
            System.out.println(lastDigit+"\n");
        }else if(middleDigit>lastDigit && middleDigit>firstDigit){
            System.out.println(middleDigit+"\n");
        }else if (firstDigit>lastDigit && firstDigit>middleDigit){
            System.out.println(firstDigit+"\n");
        }

        //доп задача 5

        int a = -5;
        int b = -77;
        int c = -888;

        if(a<b && a<c){
            if(b<c){
                System.out.println(a+" "+b+" "+c+"\n");
            }else{
                System.out.println(a+" "+c+" "+b+"\n");
            }
        }else if(b<a && b<c){
            if(a<c){
                System.out.println(b+" "+a+" "+c+"\n");
            }else {
                System.out.println(b+" "+c+" "+a+"\n");
            }
        }else if(c<a && c<b) {
            if(a<b){
                System.out.println(c+" "+a+" "+b+"\n");
            }else{
                System.out.println(c+" "+b+" "+a+"\n");
            }
        }

        //Доп задача 6

        int seconds = ThreadLocalRandom.current().nextInt(28801);
        int hours = seconds/3600;
        hours = 8-hours;
        System.out.println("current time is "+seconds+" seconds");
        System.out.println(28800-seconds+" seconds left");
        System.out.println(hours+" hours left\n");

        //Доп задача 7
        taskHard6();
        hardTask7();

    }
    public static void taskHard6() {
        int age = 24;
        int salary = 80_000;
        float credit = 0f;
        if (age > 23) {
            credit = salary * 3;
            if (salary >= 50_000) {
                credit = credit * 1.2f;
            } else if (salary >= 80_000) {
                credit = credit* 1.5f;
            }
        } else {
            credit = salary * 2;
            if (salary >= 50_000) {
                credit = credit * 1.2f;
            } else if (salary >= 80_000) {
                credit = credit * 1.5f;
            }
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом "+credit+" рублей");
    }
    public static void hardTask7(){
        int age = 25;
        int salary = 60_000;
        int wantedSum = 330_000;
        float credit = 0f;
        float coef=10f;
        credit=wantedSum+wantedSum/100*coef;
        float monthlyPayment = credit/12;
        if(age<23){
            coef+=1;

        } else if (age<30 && age>=23) {
            coef+=0.5;
        }
        if(salary>80_000){
            coef-=0.7;
        }
        if(monthlyPayment>(salary/2)){
            System.out.println("Максимальный платеж при ЗП "+salary+" равен "+salary/2+" рублей. Платеж по кредиту "+monthlyPayment+" рублей. Отказано");
        }else{
            System.out.println("Максимальный платеж при ЗП "+salary+" равен "+salary/2+" рублей. Платеж по кредиту "+monthlyPayment+" рублей. Одобрено");
        }

    }

}