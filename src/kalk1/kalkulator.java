package kalk1;


import java.util.Scanner;

public class Main {
   
     public static void main(String[] args)
        {
           int pierwsza_l;  // dwie liczby, na kt�rych b�dziemy wykonywa� operacj�
           int druga_l;
           char znak;      // zmienna przechowuj�ca symbol operacji do wykonania
           Scanner wej = new Scanner(System.in);   // wczytywanie zmiennych
           System.out.println("Podaj pierwsz� liczb�:"); // przy pomocy Scanner za pomoc� klaw.
           pierwsza_l = wej.nextInt();
           System.out.println("Podaj drug� liczb�:");
           druga_l = wej.nextInt();
     
           System.out.println("Dodawanie dw�ch liczb - wci�nij +");
           System.out.println("Odejmowanie dw�ch liczb - wci�nij -");
           System.out.println("Mno�enie dw�ch liczb - wci�nij *");
           System.out.println("Dzielenie dw�ch liczb - wci�nij /");
           System.out.println("Operacaja modulo - wci�nij %");
     
           znak = wej.next().charAt(0);  // pobieramy symbol operacji od u�ytkownika
           switch(znak)     // w zale�no�ci od wyboru wykonujemy dan� operacj�
           {
         
               case '+':    // dodawanie dw�ch zmiennych
               {
                   System.out.println(pierwsza_l + druga_l);
                   break;
               }
               case '-':    // odejmowanie dw�ch zmiennych
               {
                   System.out.println(pierwsza_l - druga_l);
                   break;
               }
               case '*':    // mno�enie dw�ch zmiennych
               {
                   System.out.println(pierwsza_l * druga_l);
                   break;
               }
               case '/':   // sprawdzenie, czy druga zmienna nie jest zerem oraz
               {           // dzielenie dw�ch zmiennych
                   if(druga_l !=0)
                   {
                     System.out.println(pierwsza_l / druga_l + "oraz reszty: " +
                             pierwsza_l % druga_l);
                   }
                   else
                   {
                       System.out.println("Nie dzielimy przez zero!!!");
                   }
                   break;
               }
               case '%':  // jw. ale tym razem operacja modulo
               {
                   if(druga_l !=0)  // r�wnie� sprawdzenie warunku dzielenia przez 0
                   {
                       System.out.println(pierwsza_l % druga_l);
                   }
                   else
                   {
                       System.out.println("Nie dzielimy przez zero!!");
                   }
               }
     
           }
     
        }
}