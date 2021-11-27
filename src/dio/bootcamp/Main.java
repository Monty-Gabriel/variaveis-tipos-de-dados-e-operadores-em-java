package dio.bootcamp;

/*

 **Exemplos para exercicios da Aula Variáveis, Tipos de Dados e Operadores Matemáticos em java.

 */

public class Main {

    public static void main(String[] args) {

        int i;
        //    int i; **Não pode ter o mesmo nome
        int I;
        //    int 1a; **Não pode começar com número
        int _1a;  // ** Não e uma boa prática começar com underline '_'
        int $aq; // ** Não e uma boa prática começar com Cifrão '$'

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        //    j = 15;  **Não pode mudar por que já está definida com 'final' e é uma constante
        int asrn24678md;
        //    int asrn246 78md;  **Não pode ter espaços
        int asrn2$4678_md;  // ** Não e uma boa prática começar com Cifrão '$' nem underline '_'
        //    int asrn246%78_md  **Não pode ter caracteres especiais como o Percentagem '%'

        asrn24678md = 100;
        asrn2$4678_md = 10;


        int quantidadeProduto = 50;
        //    int QuantidadeProduto; ** Não e uma boa prática começar variável 'final' com Maiúsculas
        final int NUMERO_TENTATIVAS = 5; /* Boa prática toda em Maiúscula e separado por Underline '_' */
        //    final int numeroTentativas = 5; ** Não e uma boa prática 'final'
        int QUANTIDADE_OPCOES = 25; // ** Não e uma boa prática, ela não é 'final'
        //    int qtdProd; ** Não e uma boa prática, ela não é expressiva


        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);







    }

}
