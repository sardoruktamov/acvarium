import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Aquarium {
    Random random = new Random();
    private int name = random.nextInt(2)+1;  // akvarium nomi 1 chi va 2 chi nomlar bilan nomlanishi belgilandi

    private List<Fish> fishList;
    private Fish fish;

    // akvariumga baliq qo'shish
    public synchronized void addFish(Fish fish) {
        fishList.add(fish);
        System.out.println(fish.getName() +" "+ fish.getGender()+ " baliq  " +this.name+ " - akvariumga qo`shildi!");
    }

    // akvariumdan baliqni o'chirish
    public synchronized void removeFish(Fish fish) {
        // baliqning yashash muddati 1 dan 10 gacha sekunt o'tgandan keyin tekshirib ko'rilmoqda
        if (fish.getLifespan() == new Date().getTime()){
            fishList.remove(fish);
            System.out.println("***** " + fish.getName() + " nomli baliq vafot etganligi sababli o`chirildi!");
        }

    }

    // baliqlar bitta akvariumga solinganda urug'lanish jarayoni
    public void interactWithFish() {
        String arr[] = {"urg`ochi", "erkak"};
        Random ran = new Random();
        Fish fish = new Fish(
                random.nextInt(10) + "-",
                random.nextInt(10),
                arr[ran.nextInt(arr.length)]);
        System.out.println("*****YANGI "+ fish.getGender() +" BALIQ TUG`ILDI!!!");
        addFish(fish);
    }

    public Aquarium() {
        this.fishList = new ArrayList<>();
    }

    public Aquarium(int name, List<Fish> fishList) {
        this.name = name;
        this.fishList = fishList;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public Fish getFish() {
        Random random = new Random();
        return fish = new Fish(
                random.nextInt(2)+1 + "-Erkak baliq",
                TimeUnit.SECONDS.toSeconds(random.nextInt(10) + 1), "urg'ochi");
    }

    public void setFish(Fish fish) {
        this.fish = fish;
    }
}
