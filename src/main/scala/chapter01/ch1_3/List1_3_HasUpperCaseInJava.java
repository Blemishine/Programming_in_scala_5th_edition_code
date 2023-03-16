package chapter01.ch1_3;

public class List1_3_HasUpperCaseInJava {

    public static void main(String[] args) {
        String name = "Blemishine";
        boolean nameHasUpperCase = false;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isUpperCase(name.charAt(i))) {
                nameHasUpperCase = true;
                break;
            }
        }
        assert nameHasUpperCase = true;
    }
}
