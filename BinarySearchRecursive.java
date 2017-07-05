public class BinarySearchRecursive<T extends Comparable<T>> {

    public int search(T[] data, T ob, int low, int high) {
        if(high < low) {
            return -1;
        }
        int mid = (low + high) / 2;
        if(data[mid].compareTo(ob) > 0) {
            return search(data, ob, low, mid - 1);
        } else if (data[mid].compareTo(ob) < 0) {
            return search(data, ob, mid + 1, high);
        } else {
            return mid;
        }
    }

}
