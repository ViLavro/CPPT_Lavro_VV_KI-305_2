import java.io.*;

public class RandomAccessFileExample {

    public static void main(String[] args) {
        // Шлях до файлу
        String filePath = "example.txt";

        // Записуємо дані в файл
        writeToFile(filePath, "Hello, World!");

        // Читаємо дані з файлу та виводимо їх
        String content = readFromFile(filePath);
        System.out.println("File Content: " + content);
    }

    // Метод для запису даних в файл
    private static void writeToFile(String filePath, String data) {
        try (RandomAccessFile file = new RandomAccessFile(filePath, "rw")) {
            // Записуємо дані в кінець файлу
            file.seek(file.length());
            file.writeUTF(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для читання даних з файлу
    private static String readFromFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (RandomAccessFile file = new RandomAccessFile(filePath, "r")) {
            // Читаємо дані з файлу
            while (file.getFilePointer() < file.length()) {
                content.append(file.readUTF());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
