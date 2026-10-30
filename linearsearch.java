
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int a[] = {6, 4, 5, 3, 2, 1};
        int key = 3;
        int found = -1;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == key) {
                found = i;
                break;
            }
        }

        if (found != -1) {
            System.out.println("Element found at index: " + found);
        }
        else {
            System.out.println("Element not found");
        }
    }
}
