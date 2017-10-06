package primeiraaplicacao;

public class PrimeiraAplicacao {

    public static void main(String[] args) {
//        //System.out.println("Olá Mundo");
//        int a = 10;
//        int b = 20;
//
//        System.out.println("a+b = " + (a + b));
//        System.out.println("a+a = " + (a + a));
//        System.out.println("b-a = " + (b - a));
//
//        /**
//         * Calcular as operações abaixo Declarar as Variáveis int a = 10; int b
//         * = 20; Saída: 30 (a+b) 20 (a+a) 10 (b-a)
//         */
        Carro meuCarro = new Carro();
        meuCarro.setChassi("A123B");
        meuCarro.setCor("AZUL");
        meuCarro.setModelo("BMW M3 E46");
        System.out.println("CHASSI: " + meuCarro.chassi);
        meuCarro.cor = "AMARELO";
        System.out.println("COR: " + meuCarro.cor);
    }

}
