package academy.devonline.java.section001_classes;

public class GC {
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            int [] array = new int [100];
        }
        int [] array = new int [100];
    }
}
