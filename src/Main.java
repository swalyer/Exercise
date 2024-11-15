import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello world!" + " " + "hell yeah");

        double firstOperand = 0.0;
        System.out.println("Enter first value");
        try {
            firstOperand = in.nextDouble();
        } catch (Exception e) {
            in.close();
            throw new Exception("Invalid input");
        }

        int firstOperandInt = (int) firstOperand;
        StringBuilder result = new StringBuilder();
        int secondOperand = 0;

        if (firstOperandInt == 0) {

            System.out.println("Value is 0");
        }
        else{
            int temp = firstOperandInt;
            while (temp > 0) {
             secondOperand  = temp % 16 ;
             if (secondOperand < 10){
                 result.append(secondOperand);

             }else{
                 switch(secondOperand){
                     case 10:
                         result.append("A");
                     break;
                     case 11:
                         result.append("B");
                         break;
                     case 12:
                         result.append("C");
                         break;
                     case 13:
                         result.append("D");
                         break;
                     case 14:
                         result.append("E");
                         break;
                     case 15:
                         result.append("F");
                         break;

                 }

             }
                temp /= 16;
            }
            if(firstOperandInt < 0){
                result.append("-");
            }
          String resultReversed = result.reverse().toString();
            System.out.println(resultReversed);




    }
        in.close();
}}