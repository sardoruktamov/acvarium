import java.util.Date;

public class FishRunnable implements Runnable{

    private Aquarium aquarium;
    private Fish fish;

    // Constructor
    public FishRunnable(Aquarium aquarium, Fish fish) {
        this.aquarium = aquarium;
        this.fish = fish;
    }

    @Override
    public void run() {
        while (true) {
            // agar baliqlar bitta acvariumga solinsa, ya`ni acvarium qiymati teng bo'lsa ular urug`lanadi
            if (fish.getAquarium() == aquarium.getName()) {
                try {
                    Thread.sleep(2000);
                    System.out.println("Urug'lanish jarayoni kuzatilmoqda!!!");


                    System.out.println(aquarium.getName() + "-akvariumda "
                                        +fish.getName()+ " va " +aquarium.getFish().getName()+
                                        "lar uchrashdi"+ fish.getGender()+"<<+++>>"+aquarium.getFish().getGender());
                    aquarium.interactWithFish(fish);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fish.getLifespan() == new Date().getTime()){
                aquarium.removeFish(fish);
                System.out.println("***** " + fish.getName() + " nomli baliq vafot etganligi sababli o`chirildi!");
            }


            try {
                
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
