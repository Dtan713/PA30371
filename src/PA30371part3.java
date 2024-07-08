import java.util.Arrays;

public class PA30371part3 {
    public static void main(String[] args) {
        String[] array = {"red", "green", "blue", "yellow" };
        System.out.println(array.length);
        String[] newArray = array.clone();
        System.out.println(Arrays.deepToString(newArray));

    }

}
