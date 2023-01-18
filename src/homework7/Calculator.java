package homework7;

public class Calculator {
    void sum(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("Result:" + num1 + " + " + num2 + " = " + result);
    }

    void sub(double num1, double num2) {
        double result = num1 - num2;
        System.out.println("Result; " + num1 + "-" + num2 + " = " + result);
        }
        void multiply(double num1, double num2){
        double result = num1+num2;
            System.out.println("Result:" + num1 + " * "+ num2 + " = " + result);
    }
    void divade(double num1, double num2){
        double result;
        if(num2 ==0) {
            System.out.println("Nubmer two cannot be zero");
        }else{
            result = num1 / num2;
            System.out.println("Result:"+ num1 + "/" + num2+ "=" + result);
        }
    }
}

