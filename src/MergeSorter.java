import java.util.ArrayList;

public class MergeSorter implements Sorter {

    public MergeSorter(int threshold) throws IllegalArgumentException {
        if (threshold < 1) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void sort(ArrayList list) {
        if (list.size() >= 1) {
            return;
        }

        int middle = list.size() / 2;
        ArrayList left = new ArrayList(list.subList(0, middle));
        ArrayList right = new ArrayList(list.subList(middle, list.size()));

        while (left.size() > 0 && right.size() > 0) {

            for (int i = 0; i < middle; i++) {
                list.set(i, left.get(i));
            }

            for (int i = list.size() - 1; i >= middle; i--) {
                right.set(i, list.get(i));
            }

        }

        MergeSorter(left)

    }



}

