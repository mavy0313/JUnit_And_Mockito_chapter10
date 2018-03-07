package exercises.stack;

public class Stack {

    private final int size;
    private int[] array;
    private int currentIndex = -1;

    public Stack(int size) {
        this.size = size;
        array = new int[size];
    }

    public int size() {
        return size;
    }

    public void push(int i) {
        currentIndex++;
        array[currentIndex] = i;
    }

//    public boolean contains(int element) {
//        for (int i = 0; i < size; i++) {
//            if (element == array[i]) {
//                return true;
//            }
//        }
//        return false;
//    }

    public int pop() {
        int result = array[currentIndex];
        currentIndex--;
        return result;
    }
}
