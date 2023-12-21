import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int size = 0;
        System.out.print("Enter size\t");
        Scanner scanner_in = new Scanner(System.in);
        BufferedWriter writer = new BufferedWriter((new FileWriter("MyFile.txt")));
        while (true) {
            try {
                size = scanner_in.nextInt(); // вводимо розмір матриці з клавіатури
                if (size <= 3)// перевіряємо чи наша матриця є більшої розмірності ніж 3
                {
                    System.out.print("The size of the matrix is less than 3!\nRepeat the input\t\t");// якщо ні то
                    // виводимо
                    // відповідний
                    // текст і просимо
                    // повторити ввід
                    size = scanner_in.nextInt();// вводимо розмір матриці з клавіатури
                    scanner_in.nextLine();
                }
                break;
            } catch (Exception e) {
                System.out.println("Incorrect input of int. Try again. ");
                System.out.print("Enter size\t");
                scanner_in.nextLine();
            }
        }
        scanner_in.nextLine();
        String filler;
        System.out.print("Enter fill character\t");
        filler = scanner_in.nextLine();// вводимо символ заповнювач з клавіатури)
        while (true) {
            if (filler.length() != 1) {
                System.out.println("fill character must be one character!");
                System.out.print("Enter fill character\t");
                filler = scanner_in.nextLine();
            } else
                break;
        }

        // -2 тобто пропускаємо першу і оснанню лінію
        char[][] arr = new char[size - 2][];

        for (int i = 0; i < arr.length; i++) {
            // перша і остання лінії мають бути довжиною як інпут тільки без першого і
            // останнього символу
            // всі інші мають мати тільки 2 символи по краям
            arr[i] = new char[i == 0 || i == arr.length - 1 ? size - 2 : 2];
        }

        // заповнюєм наш зубчастий масив
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (char) filler.codePointAt(0);
            }
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            char[] row = arr[i];

            System.out.print(" ");

            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j]);

                if (row.length == 2 && j == 0) {
                    for (int k = 0; k < arr.length - 2; k++) {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }

        System.out.println();

        scanner_in.close();
        writer.flush();
        writer.close();
    }
}
