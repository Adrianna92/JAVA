public class Exercise1 {

    public static void main(String[] args) {

        int a = 9;
        int b = 14;
        boolean teen = false;

       if(a >= 13 && a <= 19)
           teen = true;

        if(b >= 13 && b <= 19){

            teen = !teen;

       }

       if(teen)
           System.out.println("teen");


    }
}
