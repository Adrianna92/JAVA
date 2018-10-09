public class Exercise2 {

    public static void main(String[] args) {

        int[] tablica = {9, 4, 13, 7};
        int wynik = 0;

        for (int a: tablica){
            if (a == 13)
                break;

            wynik += a;

        }
            System.out.println(wynik);
    }
}
