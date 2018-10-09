public class Exercise3 {

    public static void main(String[] args) {

        int[] tablica = {5,6,7,1,2,3,7};

        for(int i = 0; i < tablica.length - 3; i++){
            if(tablica[i] == 1 && tablica[i+1] == 2 && tablica[i+2] == 3){

                System.out.println("true");
                break;
            }

        }
    }
}
