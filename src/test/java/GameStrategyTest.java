import com.lss.sample.GameStrategy1;
import com.lss.sample.GameStrategy2;
import com.lss.sample.ThreeAndFiveGame;
import org.junit.Test;

/**
 * @author lss
 * @date 2018/06/21
 */
public class GameStrategyTest {

    @Test
    public void printTest1() {
        long start = System.currentTimeMillis();
        ThreeAndFiveGame game = new GameStrategy1();
        for ( int i = 1; i <= 100; i++) {
            game.print(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(" The work costs " + (end - start) + "ms");
    }

    @Test
    public void printTest2() {
        long start = System.currentTimeMillis();
        ThreeAndFiveGame game = new GameStrategy2();
        for ( int i = 1; i <= 100; i++) {
            game.print(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(" The work costs " + (end - start) + "ms");
    }
}
