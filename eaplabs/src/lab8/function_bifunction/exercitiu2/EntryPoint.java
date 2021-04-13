package lab8.function_bifunction.exercitiu2;

public class EntryPoint {
    /*
    I. Sa se scrie un serviciu care extrage contentul din urmatorul string:
    <h1>   This is the title </h1>
    rezultat asteptat "This is the title"
    Operatii:
    1. scoaterea tagurilor de htlm
    2. scoaterea spatiilor (trim() din clasa String)
    Fiecare operatie sa fie o functie pura

    II. Sa se reimplementeze exercitiul compunand cele 2 operatii intr-o singura Function<T,R>
     */

    public static void main(String[] args) {
    String text = "<h1>   This is the title </h1>";
        ExtractService service = new ExtractService();
        System.out.println(service.extractStringFromHtml(text));
        System.out.println(service.extractWithCompose(text));
    }
}
