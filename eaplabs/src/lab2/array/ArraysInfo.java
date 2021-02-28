package lab2.array;

import java.util.Arrays;

public class ArraysInfo {

    public static void main(String[] args) {

        // doua feluri de initializare arrays
        // la creare se stabileste numarul de elemente, si nu poate fi schimbat pe parcursul executiei
        // elementele vor fi initializate cu valoarea default a tipului de date

        int[] intArrayWithNew = new int[5]; // un array cu 5 de 0 - default-ul tipului de date integer
        int[] intArrayWithBraces = {1, 2, 3};
        Integer[] arrayWithObjects = new Integer[5];
        System.out.println(arrayWithObjects[0]); // null - default pentru referinte

        //tablou anonim
        method(new int[]{1, 5, 3});

        // tablouri multidimensionale
        int[][] bidimensional = new int[4][];
        bidimensional[0] = new int[]{1, 2};
        bidimensional[1] = new int[]{1, 2, 3};
        bidimensional[2] = new int[]{1, 2, 3, 4};
        bidimensional[3] = new int[]{1, 2, 3, 4, 5};

        int[][] matrix = new int[3][3];

        //Exercitiu: sa se rastoarne matricea: output: [[1,4,7],[2,5,8],[3,6,9]]
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        // clasa Arrays
        // Arrays.sort(ref)
        char[] word = {'h', 'o', 'm', 'e'};
        Arrays.sort(word);  // {'e', 'h', 'm', 'o'} - doar pentru array-uri unidimensionale si care contin date comparabile
        int[] numbers = new int[]{10, 5, 8, 40, 3, 5};
        Arrays.sort(numbers, 2, 5); // [10, 5, 3, 8, 40, 5] - toIndex nu este luat in considerare

        //Arrays.binarySearch(array, value)
        // tabloul trebuie sa fie sortat
        // daca sunt mai multe elemente egale, rezultatul nu este garantat
        Arrays.binarySearch(new int[]{5, 6, 7, 8}, 7); // index 2
        Arrays.binarySearch(new int[]{5, 6, 7, 8}, 1, 3, 7); // index 2

        //Arrays.copyOf
        Arrays.copyOf(new int[]{10, 11, 12, 13}, 5); // creaza un tablou nou de marime 5 si copiaza toate elementele din tabloul vechi - rezultat [10, 11, 12, 13, 0]
        Arrays.copyOfRange(new int[]{10, 11, 12, 13}, 1, 4);  // copiaza un interval din tabloul initial - rez [11, 12, 13]

        //Arrays.equals(tablou1, tablou2), Arrays.deepEquals(tablou1, tablou2)
        char[][] text = {{'J', 'a', 'v', 'a', ' '}, {'i', 's', ' '}, {'c', 'o', 'o', 'l'}};
        char[][] sameText = {{'J', 'a', 'v', 'a', ' '}, {'i', 's', ' '}, {'c', 'o', 'o', 'l'}};
        char[][] textWithoutSpace = {{'J', 'a', 'v', 'a'}, {'i', 's'}, {'c', 'o', 'o', 'l'}};
        Arrays.equals(text, sameText); // false pentru ca sunt comparate referintele elementelor din tablou
        Arrays.equals(text[0], sameText[0]); // true

        Arrays.deepEquals(text, sameText); // true
        Arrays.deepEquals(text, textWithoutSpace); // false

        //Exercitiu: Sa se afiseze indexul lui 652 din urmatorul array
        int[] numbers2 = {255, 452, 652, 8541, 5246, 555};


        //Exercitiu: sa se afiseze elementele duplicate din fiecare tablou
            int[][] elements = {{1, 5, 6, 8, 5}, {1, 8, 9, 8, 1}, {2, 3, 5, 2}};


    }

    public static int[] method(int[] array) {
        // do something with the array and return
        return array;
    }
}
