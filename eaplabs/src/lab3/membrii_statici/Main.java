package lab3.membrii_statici;


public class Main {

    public static void main(String[] args) {
        System.out.println(B.metodaStatica()); // nu este polimorfism pentru ca membrii statici nu se mostenesc
        System.out.println(B.CAMP_STATIC);

    }
}
