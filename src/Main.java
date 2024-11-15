import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    static double firtsOperand = 0.0;
    static double secondOperand = 0.0;
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter first value");
        try{
        firtsOperand = in.nextInt();
    }catch(Exception e){
            throw new Exception("Invalid input");
        }
        System.out.println("Enter second value");
        try{
            secondOperand = in.nextInt();
        }catch(Exception e){
            throw new Exception("Invalid input");
        }
        BiFunction<Double,Double,Double> add =  (firtsOperand,secondOperand) -> firtsOperand+ secondOperand;
        BiFunction<Double,Double,Double> multiply=  (firtsOperand,secondOperand) -> firtsOperand * secondOperand;
        BiFunction<Double,Double,Double> divide =  (firtsOperand,secondOperand) -> {
            if(secondOperand == 0) {
                throw new ArithmeticException("Division on zero");
            }
                return firtsOperand/secondOperand;
            };
        BiFunction<Double,Double,Double> differ =  (firtsOperand,secondOperand) -> firtsOperand - secondOperand;
        BiFunction<Double,Double,Double> mod =  (firtsOperand,secondOperand) -> firtsOperand % secondOperand;




        BiFunction<Double,Double,Double>[] operations = new BiFunction[] {add, multiply, divide, differ, mod};
        for(BiFunction<Double,Double,Double> operation :operations){
            System.out.println(operation.apply(firtsOperand,secondOperand));
        }



    }
}