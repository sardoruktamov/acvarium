import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class FishRunnable implements Runnable{

    private Aquarium aquarium;
    private final Fish fish;

    // Constructor
    public FishRunnable(Aquarium aquarium, Fish fish) {
        this.aquarium = aquarium;
        this.fish = fish;
    }

    @Override
    public void run() {
        while (true) {
            // agar baliqlar bitta aKvariumga solinsa, ya`ni aKvarium qiymati teng bo'lsa ular urug`lanadi
            if (fish.getAquarium() == aquarium.getName()) {
                try {
                    Thread.sleep(2000);
                    System.out.println("Urug'lanish jarayoni kuzatilmoqda!!!");


                    System.out.println(aquarium.getName() + "-akvariumda "
                                        +fish.getName()+fish.getGender()+ " va " +aquarium.getFish().getName()+
                                        "lar uchrashdi");
                    Thread.sleep(3000);
                    aquarium.interactWithFish();
                    Thread.sleep(3000);
                    aquarium.removeFish(fish);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            try {
                
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
