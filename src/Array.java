import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int numbers[] = {1, 2, 3, 4, 5};
        String words[] = {"Hello", "How", "Are", "You", "Today", "My", "Friend"};
        char character[] = {'H', 'e', 'l', 'l', 'o'};
        boolean bool[] = {true, false};

        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Strings: " + Arrays.toString(words));
        System.out.println("Characters: " + Arrays.toString(character));
        System.out.println("Booleans: " + Arrays.toString(bool));
    }
}
