public class Repeticoes {

    public static void main(String[] args) {

//        int i = 0;

//        while(retornaValorCondicao(i)) {
//            System.out.println("Passando por um laço de repetição do while");
//        }

//        while(i < 10) {
//            System.out.println("Valor de i: " + i);
//            i++;
//        }

//        do {
//            System.out.println("Valor de i: " + i);
//            i++;
//        } while(i < 10);

        for(int i = 0; i < 10; i++) {
            System.out.println("Valor de i: " + i);
        }

    }

    private static boolean retornaValorCondicao(int i) {
        return i < 10;
    }

}
