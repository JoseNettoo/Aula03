class Funcionario {
    String nome, nasc;
    double salario;

    void informarSalario() {
        System.out.println("Salário: R$" + salario);
    }

    int calcularIdade() {
        return 2024 - Integer.parseInt(nasc);
    }
}

class Gerente extends Funcionario {
    String projeto;

    void informarProjeto() {
        System.out.println("Projeto: " + projeto);
    }
}

class Programador extends Funcionario {
    String linguagem;

    void informarLinguagem() {
        System.out.println("Linguagem: " + linguagem);
    }
}