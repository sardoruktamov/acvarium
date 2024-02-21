import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int numMaleFish = random.nextInt(10); // erkak baliqlar soni
        int numFemaleFish = random.nextInt(10); // urg'ochi baliqlar soni

        Aquarium aquarium = new Aquarium();

        // Akvariumga erkak baliqlarni qo'shish va yaratish
        for (int i = 1; i < numMaleFish; i++) {
            Fish maleFish = new Fish(i + "-Erkak baliq", random.nextInt(10), "Erkak");
            aquarium.addFish(maleFish);
            Thread maleThread = new Thread(new FishRunnable(aquarium, maleFish));
            maleThread.start();
        }

        // Akvariumga urg'ochi baliqlarni qo'shish va yaratish
        for (int i = 1; i < numFemaleFish; i++) {
            Fish femaleFish = new Fish(i + "-Urg'ochi baliq", random.nextInt(10), "Urgochi");
            aquarium.addFish(femaleFish);
            Thread femaleThread = new Thread(new FishRunnable(aquarium, femaleFish));
            femaleThread.start();
        }


    }
}