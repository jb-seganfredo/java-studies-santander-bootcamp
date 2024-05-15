public class MinhaClasse {
    // public static void main (String [] args) {

    //     int idade = 20;
    //     double altura = 1.70;
    //     String nome = "Júlia";
    //     boolean estudante = true;
    //     System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e " + altura + " de altura e sou estudante: " + estudante + ".");
    // }

    public static void main (String [] args) {
        System.out.println(nomeCompleto("Júlia", "Silva"));
        System.out.println(somar(10, 20));
    }

    public static String nomeCompleto (String nome, String sobrenome) {
        return "Meu nome é " + nome.concat(" ").concat(sobrenome);

    }

    public static int somar (int a, int b) {
        return a + b;
    }

}