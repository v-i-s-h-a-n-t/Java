import java.util.Comparator;

public class descending_comparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return b - a; // descending order
    }
}
