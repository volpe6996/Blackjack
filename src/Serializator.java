import java.io.*;

public class Serializator {
    public static void serialize(Stats stats, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(stats);
            System.out.println("Zapisano statystyki do pliku: " + filePath);
        } catch (IOException e) {
            System.err.println("Błąd podczas serializacji: " + e.getMessage());
        }
    }

    public static Stats deserialize(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Stats stats = (Stats) ois.readObject();
            System.out.println("Odczytano statystyki z pliku: " + filePath);
            return stats;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Błąd podczas deserializacji: " + e.getMessage());
            return new Stats();
        }
    }
}
