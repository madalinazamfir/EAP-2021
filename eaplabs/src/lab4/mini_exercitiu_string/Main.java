package lab4.mini_exercitiu_string;

public class Main {

    // StringBuilder si StringBuffer
    public static void main(String[] args) {
        // sa se inverseze ordinea cuvintelor, expectedOutput = "mere are Ana"
        String input = "Ana are mere";
        String[] cuvinte = input.split(" ");
        String output= "";
        for (int i=cuvinte.length -1; i >= 0; i--) {
            output = output.concat(cuvinte[i]).concat(" ");
        }

        System.out.println(output);
        // sa se verifice daca un String e polindrom
        String inputP = "anna";
        char[] chars = inputP.toCharArray();
        boolean x = true;
        for (int i = chars.length -1; i >= 0 && x; i--) {
            if(inputP.charAt(i) != inputP.charAt(chars.length - 1 - i)) {
                x = false;
            }
        }
        System.out.println(x);
        StringBuilder reverse = new StringBuilder(inputP);
        reverse.reverse();
        if(inputP.equals(reverse.toString())) {
            System.out.println("este polindrom");
        }

        // sa se inlocuiasca "journey" cu "walk"
        String title = "A journey of a thousand miles begins with a single step";
        String output2 = title.replace("journey", "walk");
        System.out.println(title);
        System.out.println(output2);

        //sa se ascunda parola cu *****
        String command = "curl -u mzamfir:superSecret -X GET http://something.ro";
        String substring = command.substring(command.indexOf("-u ") + 3);
        String password = substring.substring(substring.indexOf(":")+1, substring.indexOf(" "));
        String commandOutput = command.replace(password, "*****");
        System.out.println(commandOutput);

        StringBuilder exSB = new StringBuilder("A journey of a thousand miles begins with a single step");
        exSB.reverse();
        System.out.println(exSB);

        String exS =  new String("A journey of a thousand miles begins with a single step");
        exS.concat("alabala");
        System.out.println(exS);

        // == versus equals
        String string1 = "test";
        String string2 = "test";
        System.out.println(string1 == string2);

        String string3 = new String("test");
        String string4 = new String("test");
        System.out.println(string3 == string4);

        StringBuffer buffer = new StringBuffer("test");
    }
}
