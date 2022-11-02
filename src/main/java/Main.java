import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {

        int num1, num2, sum = 0;
        System.out.println("Please enter your numbers");
        Scanner input = new Scanner (System.in);
        num1 = input.nextInt();

        for (int i  = 0; i <= num1; i++){
            num2 = input.nextInt();
            sum = num1 + num2;
            System.out.println("The sum is " + sum);
            break;
        }
        
    }



    
    int sumOfNumbers(int n) {
        return 0;
    }
    
    // for Extra Credit
    int gaussianSumOfNumbers(int n) {
        return 0;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    
}
