public class Computer {

    boolean isEven(int number)  {

       int lab = number%2;
       return lab == 0;

    }

    boolean isOdd(double number) {

    double lab1 = number%2;
       return !(lab1 == 0);


   }

   double circleField(double radius) {

       double lab2 = Math.PI * radius * radius;
       return lab2;


   }

   int power(int number){

        return number * number;
   }

}