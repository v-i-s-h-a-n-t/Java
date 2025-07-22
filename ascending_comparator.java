import java.util.Comparator;

public class ascending_comparator implements Comparator<Integer> {

    public int compare(Integer a, Integer b) {
        return a - b; // ascending order
    }

}
