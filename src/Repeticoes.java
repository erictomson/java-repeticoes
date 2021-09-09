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

//        for(int i = 0; i < 10; i++) {
//            System.out.println("Valor de i: " + i);
//        }

//        for(String mensagem = "valor de i: "; i < 10;) {
//            System.out.println(mensagem + i);
//            i++;
//        }

        int somaPar=0;
        int somaImpar=0;

        //Soma dos 10 números pares e soma dos 10 números ímpares
        for(int i=0;i<20;i++) {
            if(i % 2 == 0) {
                somaPar = somaPar + i;
            } else {
                somaImpar = somaImpar + i;
            }
        }

        System.out.println("Soma dos pares..: " + somaPar);
        System.out.println("Soma dos ímpares: " + somaImpar);

    }

//    private static boolean retornaValorCondicao(int i) {
//        return i < 10;
//    }

}
