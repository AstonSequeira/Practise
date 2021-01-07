/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning1;

/**
 *
 * @author abc
 */
public class Learning1 {

    public static void main(String[] args) {

//        String alph="b";
//        
//        if(alph=="A" || alph=="E" || alph=="I" || alph=="O" || alph=="U" || alph=="a" || alph=="e" || alph=="i" || alph=="o" || alph=="u" ) {
//            System.out.println("You have entered a Vowel");
//        
//        }
//        else{
//            System.out.println("You have entered a Consonant");
//        }
//        
//        int i;
//        System.out.println("The first 10 natural numbers are: ");
//        for(i=1;i<=10;i++){
//            System.out.println(i);
//            
//        }
//       
//        int num1=5;
//        int num2=5;
//        int num3=5;
//        int num4=5;
//        int num5=5;
//        int sum=0;
//        int avg=0;
//        
//       sum = num1 + num2 + num3 + num4 + num5;
//       avg =(num1 + num2 + num3 + num4 + num5)/5;
//       
//        System.out.println("The Sum of 5 Numbers is " + sum);
//        System.out.println("The Average of 5 Numbers is " + avg);
//        
//        
//        int cube;
//        for(cube=1;cube<=5;cube++){
//            System.out.println("The cude of "+cube+" is "+(cube*cube*cube));
//    }
//        
//        int inputNo=5;
//        int z;
//        for(z=0;z<=5;z++){
//            System.out.println(inputNo+"X"+z+"="+(inputNo*z));
//        
//        }
//        
//        int odd;
//        for(odd=1;odd<=5;odd++){
//            System.out.println(2*odd-1);
//            
//        }
        int row, column, noOfRows = 5;
        int value = 1;
        int initialTabs = 0;
        
        // ROW
        for (row = 1; row <= noOfRows; row++) {
            
            initialTabs = noOfRows - row;

            // (For Printing Initial Tabs)
            for(int tabCtr = 1; tabCtr <= initialTabs; tabCtr++){
                System.out.print(" ");
            }

            // COLUMN 
            // (PRINTING VALUE)
            for(column = 1; column <= row ; column++){
                System.out.print(row);
                System.out.print(" ");
            }
            
            System.out.println();
        }
        
       
    }

}
