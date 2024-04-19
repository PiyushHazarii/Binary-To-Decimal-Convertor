import java.util.*;

public class Binary_To_Decimal {

    public static void  main(String args[])
    {
        Scanner sc = new Scanner(System.in);                          // Take the Input From Scanner Class.                  

        System.out.println("Enter a Binary Number");

        int binaryNumber = sc.nextInt();                              // Take the input of binaryNumber From Scanner class.

        int temp = binaryNumber;                                      // create a temporary variable take has the value of binaryNumber.
        int decimalNumber = 0;                                        // Initially the decimalNumber has zero value and will increment in further step.
        int index = 0;                                                // Initially the index value is Zero and will Increment in further step.


        while(temp != 0)                                              // while the temp variable is not zero the furthe program will execute.
        {
 
           int result = temp % 10;                                                      // result will store the modulus value of temp.
           temp = temp / 10;                                                            // tenp will store the value of  temp divided by temp.
           decimalNumber = decimalNumber + result * (int) Math.pow(2 , index++);        // decimalNumber will store the converted value of the binary to decimal.

        }

                  
        System.out.println("The Decimal Equivalent Of "+ binaryNumber+" is "+decimalNumber);     // It will print the decimal value of the binary number.
    }
}
    

