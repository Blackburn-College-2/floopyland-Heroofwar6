package emptyjavaproject;

import com.pauliankline.floopyconnector.Floopy;

/**
 *
 * @author paul.kline
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Floopy floop = new Floopy(new ConcreteController());
        floop.begin(5);
    }
    
}
