package lesson02;

public class DataTypes {
    //комментарии - вся строка после слешей
        /*
        многострочный
        комментарий
         */
    public static void main(String[] args) {
        //точка входа в приложение
        System.out.println("console output");
        //тип данных имяПеременой
        int yearOfBirth;
        int length, height;

        yearOfBirth = 1991;
        length = 20;
        height = 15;
        System.out.println(yearOfBirth);
        System.out.println(length);

        //примитивные типы данных
        //ссылочные типы данных

        byte readByte = 56;
        short userAge = 35;
        long temp = 12, planetAge = 4000_000_000L;
        //L явно указывает на тип Long

        float outSideTemp = - 12.5F, catAge = 5.5F; //F указывает на тип данных float
        double weight = 100.5;

        boolean isConnected = true;
        boolean isActive = false;

        char aLetter = 'a';

        //приведение типов данных.

        int numberOfStones01 = 12_000;
        long numberOfStones02 = numberOfStones01;
        System.out.println(numberOfStones02);
        System.out.println(numberOfStones01);

        int distance = 1000;
        byte smallDistance = (byte) distance;
        System.out.println(smallDistance);

        //объявление переменных через var (доступно с java 10)

        var version = 10;
        var bigNumber = 10L;
        var connected = true;
        var balance = 4000.8;
        var string = "string";


    }
}
