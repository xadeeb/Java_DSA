import java.util.*;

public class arrays_arguments {

    public static void array_update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }
    public static void main(String[] args) {
        
        int marks[] = {97, 98, 99, 100};

        array_update(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

    }
}