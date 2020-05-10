package main.gen;

public class Output {
    public static void main(String[] args) {

        int a = 1;

        String yes = "caseOne";

        String str = "caseTwo";

        String def = "defaultCase";

        switch (a) {

            case 1:

                System.out.println(yes);

                break;

            case 2:

                System.out.println(str);

                break;

            default:

                System.out.println(def);

                break;
        }
    }
}
