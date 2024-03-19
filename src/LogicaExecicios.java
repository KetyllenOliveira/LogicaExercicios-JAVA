public class LogicaExecicios {

    public static void main(String[] args) {
        resolverQuestao1();
        resolverQuestao2a();
        resolverQuestao2b();
        resolverQuestao2c();
        resolverQuestao2d();
        resolverQuestao2e();
        resolverQuestao2f();

        // Métodos para resolver
    }

    public static void resolverQuestao1() {
        // Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável B.
        int A = 10;
        int B = 20;

        // A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o
        // valor que está em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados
        // nas variáveis.
        A = A + B;
        B = A - B;
        A = A - B;

        System.out.println(" ATIVIDADE 1 ");
        System.out.println("O valor de A é: " + A);
        System.out.println("O valor de B é: " + B);
    }

    public static void resolverQuestao2a(){
        // A← 10
        // B← 20
        // Escrever B
        // B+5
        // Escrever A, B

        int A = 10;
        int B = 20;
        System.out.println(" ATIVIDADE 2 - A) ");
        System.out.println("O valor de B é: " + B);
        B += 5;
        System.out.println("O valor de A é: " + A + ", e o valor de B é: " + B);

        // O Valor de B: 25
        //O valor de A: 10

    }
    public static void resolverQuestao2b() {
        /* A← 30
           B← 20
           C← A+B
           Escrever C
            B-10
           Escrever B, C
           C← A+B
           Escrever A, B, C */

        int A = 30;
        int B = 20;
        int C = A + B;

        System.out.println(" B)");

        System.out.println("O valor de C é:");
        B -= 10;
        System.out.println("B é: " + B + ", C é: " + C);
        C = A+B;
        System.out.println("A é: " + A + ", B é: " + B + " C é:" + C );


    }
    public static void resolverQuestao2c() {
        /* c)
        A← 10
        B← 20
        C← A
        B+C
        A← B
        Escrever A, B, C*/

        int A = 10;
        int B = 20;
        int C = A;
        A = B;

        System.out.println(" C)");
        System.out.println("A: " + A + ", B: " + B + ", C: " + C);
    }
    public static void resolverQuestao2d() {
        /*
    A +10
    B+ A +1
    A+B+1
    B← A+ 1
    Escrever A
    A+B+1
    Escrever A, B*/
        int A = 10;
        int B = A + 1;
        A = B + 1;

        System.out.println("D)");
        System.out.println("Valor de A é: " + A);
        System.out.println("Valor de B é: " + B);
    }
    public static void resolverQuestao2e() {
        /*
        C← A+B
        B + 20
        A← 10
        Escrever A, B, C*/


        int A = 10;
        int B = 5;
        int C = A + B;
       B = +20;

        System.out.println("E)");
        System.out.println("Valor de A é: " + A);
        System.out.println("Valor de B é: " + B);
        System.out.println("Valor de c é: " + C);
    }
    public static void resolverQuestao2f() {
        /*
        X← 1
        Y← 2
        Z←Y-X
        Escrever Z
        X← 5
        Y+X+Z
        Escrever X, Y, Z*/


        int X = 1;
        int Y = 2;
        int Z = Y - X;



        System.out.println("F)");
        System.out.println("Valor de Z é: " + Z);
        X = 5;
        int resultado = Y + X + Z;

        System.out.println("X: " + X + ", Y: " + Y + ", Z: " + Z + ", Resultado: " + resultado);
    }
