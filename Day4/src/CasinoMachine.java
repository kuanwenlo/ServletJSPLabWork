import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by kualo on 8/5/2016.
 */
public enum CasinoMachine {
    BAR, MEDAL, COIN, TRIPLE_BAR, CHERRY;

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(CasinoMachine.values()[ThreadLocalRandom.current().nextInt(CasinoMachine.values().length)]);
        }
    }

}
