public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.nome = "Carlos"; g.nasc = "1980"; g.salario = 8000; g.projeto = "Gestão";

        Programador p = new Programador();
        p.nome = "Ana"; p.nasc = "1990"; p.salario = 5000; p.linguagem = "Java";

        System.out.println(g.nome); g.informarSalario(); g.informarProjeto();
        System.out.println("Idade: " + g.calcularIdade());

        System.out.println(p.nome); p.informarSalario(); p.informarLinguagem();
        System.out.println("Idade: " + p.calcularIdade());
    }
}