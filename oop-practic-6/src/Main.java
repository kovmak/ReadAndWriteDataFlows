import domain.User;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        SerializationHandler serializationHandler = new SerializationHandler("data.txt");

        // Створення та серіалізація об'єкта User
        User userToSerialize = new User("John Doe");

        try {
            // Серіалізація об'єкта
            serializationHandler.serialize(userToSerialize);

            // Десеріалізація об'єкта
            User deserializedUser = serializationHandler.serialize(User.class);
            System.out.println("Deserialized User: " + deserializedUser);

            // Запис десеріалізованих даних у текстовий файл
            writeToTextFile(deserializedUser.toString(), "deserializedData.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToTextFile(String content, String filePath) throws IOException {
        Files.writeString(Path.of(filePath), content);
        System.out.println("Data written to " + filePath);
    }

    private static class SerializationHandler {
        public SerializationHandler(String file) {
        }

        public void serialize(User userToSerialize) {
        }

        public User serialize(Class<User> userClass) {
            return null;
        }
    }
}