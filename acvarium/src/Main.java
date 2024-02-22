import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        String arr[] = {"urg`ochi", "erkak"};

        int numFish = random.nextInt(10); // erkak va ur`ochi baliqlar soni

        Aquarium aquarium = new Aquarium();

        // Akvariumga erkak va urg`ochi baliqlarni qo'shish va yaratish
        for (int i = 1; i < numFish; i++) {
            Fish fish = new Fish(i + "- ", random.nextInt(10), arr[random.nextInt(arr.length)]);
            aquarium.addFish(fish);
            Thread maleThread = new Thread(new FishRunnable(aquarium, fish));
            maleThread.start();
        }

    }
}