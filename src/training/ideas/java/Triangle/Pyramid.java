package training.ideas.java.Triangle;

/**
 * Created by idncpa on 20-08-2014.
 */
public class Pyramid {
    public static void main(String agrs[]) {
        String pattern = "CHETAN";
        String output = "";
        String space;
        System.out.println("The Pattern of Chetan is");

        for (int i = 0; i < pattern.length(); i++) {
            space = "";

            String substr = pattern.substring(i, i + 1);

            output = substr + output + substr;

            for (int j = pattern.length() - 1; j > i; j--) {
                space = space + " ";
            }
            System.out.println(space + output + space);

            /*for (int m = 0; m < pattern.length(); m++)
            {
                space = "";

                String substr1 = pattern.substring(m, m - 1);

                output = substr + output + substr;

            }*/

        }

    }
}