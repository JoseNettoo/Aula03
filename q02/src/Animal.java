class Animal {
    String nome;

    Animal(String nome) {
        this.nome = nome;
    }

    void caminha() {
        System.out.println(nome + " está caminhando.");
    }
}

class Cachorro extends Animal {
    Cachorro(String nome) {
        super(nome);
    }

    void late() {
        System.out.println(nome + " está latindo.");
    }
}

class Gato extends Animal {
    Gato(String nome) {
        super(nome);
    }

    void mia() {
        System.out.println(nome + " está miando.");
    }
}