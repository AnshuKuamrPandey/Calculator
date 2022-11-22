import java.util.Scanner;

class CalculatorByAnshu{
    public static void main(String[] args) {
     Scanner sc= new Scanner (System .in);
     System.out.println("Enter 1 for add ");
     System.out.println("Enter 2 for sub");
     System.out.println("Enter 3 for mul");
     System.out.println("Enter 4 for div");
     System.out.println("Enter 5 for square");
     
     int num = sc.nextInt();
     switch (num){
            case 1: System.out.println("Addition of your  number is:: "+sum());
            break;
            case 2: System.out.println("Subtraction of your given number:: " + sub());
            break;
            case 3: System.out .println("Multiply of your numbers is :: " +mul());
            break;
            case 4: System.out.println ("division of your given numbers is::  "+div());
            break;
            case 5: System.out.println("Square of your num is:: " + square());



        }
    }





    static int  sum(){ //Method for sum;
      Scanner input = new Scanner(System.in);
      System.out.println("How much number do want to add ::");
      int n = input.nextInt ();
      int temp [] = new int [n];
      int a = 0;
      int total= 0;
      while (n-->0){
        System.out.print("Enter your number :::");
        temp [a++] = input.nextInt();
    }
    for (int ele:temp){
        total = total + ele;
    }
    //System.out.println(total);;
    return total;

       
 }
   static int sub(){ ///Method for sub////
    Scanner input = new Scanner (System.in);
    int num1,num2;
    System.out.print("Enter your first number :::");
    num1= input.nextInt ();
    System.out.print("Enter your second  number :::");
    num2= input.nextInt ();
    return num1-num2;////////////////
}



  static int mul(){    //Method for multiply;
    Scanner input = new Scanner (System.in);

    System.out.println("How much numbers do you want to Multiply:::::");
    int n = input.nextInt ();
    int[] temp = new int[n];
    int a = 0; 
    int total = 1;
      while (n-->0){
        System.out.print("Enter your numbers::");
        temp[a++] = input.nextInt();

    }
    for (int ele:temp){
        total = ele*total;
    }
       return total ;  //////////////////////





    
} 
        static int div(){ //Method for div;;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your first number :::");
            int num1= input.nextInt ();
            System.out.print("Enter your second  number :::");

            int num2= input.nextInt ();
            System.out.println("first num/second num:::");
            return num1/num2;  
        } ////////////////


        
         static int square (){ ///Method for square ;;;
            System.out.println("Enter your number :::");
            Scanner input= new Scanner (System.in);
            int a = input.nextInt ();
            int result = a*a;
            return result ;
        }
        }  

    
      

                
                
                
                
                
                
            
                




            



