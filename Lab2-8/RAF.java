import java.io.IOException;
import java.io.RandomAccessFile;

public class RAF {
    public static void main(String[] args) {
        String fileName = "products.txt";

        try (RandomAccessFile file = new RandomAccessFile(fileName, "rw")) {

            //Зчитуємо увесь вміст файлу
            long length = file.length();
            byte[] originalContent = new byte[(int) length];
            file.readFully(originalContent);
            StringBuilder newContent = new StringBuilder();

            //Вставляємо заголовок на початку
            newContent.append("Products List\n");

            //Вставляємо перші 35 символів зі старого тексту
            int insertPos = Math.min(35, originalContent.length);
            newContent.append(new String(originalContent, 0, insertPos));

            //Вставляємо новий товар у середину
            newContent.append("\nNewProduct = 100 UAH\n");

            //Додаємо решту старого тексту
            if (insertPos < originalContent.length) {
                newContent.append(new String(originalContent, insertPos, originalContent.length - insertPos));
            }

            //Ще один товар в кінець
            newContent.append("\nNewProduct = 80 UAH\n");

            //Очищаємо файл і перезаписуємо його
            file.setLength(0);
            file.seek(0);
            file.writeBytes(newContent.toString());

            System.out.println("Файл оновлено.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}