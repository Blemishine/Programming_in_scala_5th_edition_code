package chapter01.ch1_3;

public class List1_5_HasUpperCaseInJavaWithStream {

    public static void main(String[] args) {
        String name = "Blemishine";
        boolean nameHasUpperCase = name.chars().anyMatch(
                (int ch) -> Character.isUpperCase((char) ch)
        );
        assert nameHasUpperCase == true;
    }
}
