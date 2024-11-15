import java.util.Scanner;

public class Main {

    public static void main(String []args) throws Exception {
        int secondOperand = 0;
        int firstOperand = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("insert first value");
        try{
            firstOperand = in.nextInt();}catch (Exception e){
            throw new Exception("Value is invalid");
        }
        System.out.println("insert second value");
        try{
            secondOperand = in.nextInt();
        } catch (Exception e) {
            throw new Exception("Value is invalid");
        }

        System.out.println(firstOperand + secondOperand);
    }
}