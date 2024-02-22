import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Fish {

    Random random = new Random();
    private String name;
  // baliqning yashash muddati xozirgi vaqtga  1 dan 10 gacha bo'lgan sekunt qo'shilganiga teng qilib olindi
    private long lifespan = (new Date().getTime()) + TimeUnit.SECONDS.toSeconds(random.nextInt(10) + 1);
    private String gender;

    private int aquarium;

    public Fish(String name, long lifespan, String gender) {
        this.name = name;
        this.lifespan = lifespan;
        this.gender = gender;
    }

    public int getAquarium() {
        Random random = new Random();
        return aquarium = random.nextInt(2) + 1;
    }

    public void setAquarium(int aquarium) {
        this.aquarium = aquarium;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public long getLifespan() {
        return lifespan;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return String.format("Baliq nomi: %s   yashash muddati: %.1f   jinsi: %s  ",
                name, lifespan, gender);
    }


}
