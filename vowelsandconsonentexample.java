
public class Main {
    public static void main(String[] args) {

        String s = "hello world";

        int vowels= 0;
        int consonant = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u')
            {

                vowels++;
            }
            else{

                consonant++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonant);
    }
}
}