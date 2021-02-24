package lab1;

public class Instructions {

    public static void main(String[] args) {
         /*
    Controlul executiei se face prin:
        - instructiuni decizionale: simpla "if", multipla "switch"
        - instructiuni repetitive: for, while, do...while
    */

        // if
        short x = 10;
        short y = 20;

        if (x > y){
            System.out.println("x e mai mare ca y");
        }

        if(x > y) {
            System.out.println("x e mai mare ca y");
        } else {
            System.out.println("y e mai mare ca x");
        }

        if(x > y){
            System.out.println("x e mai mare ca y");
        } else if (x == y){
            System.out.println("x e egal y");
        } else {
            System.out.println("x e mai mic ca y");
        }

        // switch
        // "default" prinde toate valorile expresiei care nu se regasesc explicit sub forma de case-uri. este optionala
        // pentru primitive expresia se evalueaza cu "=="
        // pentru String si alte referinte se foloseste methoda "equals()"

        String var1 = "text";
        String var2 = "text";
        System.out.println(var1 == var2); // string pool - ambele variabile au aceeasi referinta

        String var3 = new String("text");
        String var4 = new String("text");
        System.out.println(var3 == var4);
        System.out.println(var3.equals(var4));
        System.out.println(var1.equalsIgnoreCase(var2));

        switch (var3) {
            case "text":
                System.out.println("suntem egale");
                break;
            case "Text" :
                System.out.println("nu suntem egale");
                break;
        }




        //while si do..while()
        // do...while() se executa cel putin o data

        while(x > 0) {
            System.out.println(x);
            x++;
        }

        do {
            System.out.println("Ma execut o data");
            x++;
        } while(x > 10);

        // for si for..each

        int[] tablou = {1,2,3};
        for(int element : tablou) {
            System.out.println(element);
        }

        // modificarea iterarii: break si continue
        // incheiere prematura a unei bucle: break
//         saltul la finalul iteratiei curente: continue

        for(int i=0; i <= 10; i++) {
            System.out.println(i);
            if(i == 1) continue;
            System.out.println(i);
            if(i == 2) break;
        }

        forExterior: for(int j=0; j<= 10; j++) {
            for (int m = 10; m >= 0; m--) {
                if(m == j) break forExterior;
            }
        }
    }

}
