package Strings.Tasks;

import java.util.Arrays;

class Sun {
    public static void main(String[] args) {
        System.out.println("Arguments in Sun: " + Arrays.toString(args));
        for (String a : args) {
            System.out.println(a);
        }
    }
}

class Moon {
    public static void main(String[] args) {
        String[] s = {"Hello", "World"};
        System.out.println("Arguments in Moon: " + Arrays.toString(args));
        Sun.main(s); // Calling Sun.main() with predefined arguments
    }
}
