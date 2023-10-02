package lesson02;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int x = 20, y = -1;
        int resultArithmetic1 = x + y;

        byte var01 = 89, var02 = 11;
        //byte byteResult01 = var01 + var02; //приводит к типу int
        byte byteResult02 = (byte) (var01 + var02);

        System.out.println(resultArithmetic1);

    }
}
