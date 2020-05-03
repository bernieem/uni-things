
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovoX230
 */
public class Pascal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = 0;
        ArrayList<Integer> first = new ArrayList();
        ArrayList <Integer> second = new ArrayList();
        
        System.out.println("Enter rows: ");
        rows = scan.nextInt();
        
        for(int i = 0; i <= rows; i++){
            for(int j = (rows - i+1); j > 0; j--){   
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){ // k = 0 till it reaches current row
              BigInteger temp = new BigInteger(factorial(k)+ "");
              temp = temp.multiply(new BigInteger(factorial(i-k)+""));
              BigInteger row = new BigInteger(factorial(i) + "");
              BigInteger result = new BigInteger(row.divide(temp)+"");
               // System.out.print(result);
              if(result.mod(new BigInteger("2")).equals(BigInteger.ZERO))
                    System.out.print("  ");
                         
                else
                 System.out.print(" *");     
            }
            System.out.println();
            //System.out.println(i);
        }
    }
    
    
    public static BigInteger factorial(long input){
        BigInteger result = new BigInteger("1");
       // System.out.println(input);
        for(int i = 1;  i <= input; i++) 
        {   result = result.multiply(new BigInteger(i +""));
        }
        
        return result;
    }
 }


