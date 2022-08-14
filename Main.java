package aula06Mesa;

public class Main {
    public static void main(String[] args) {

        AdotaCachorro adocao1 = new AdotaCachorro("Belinha", "Poodle");

            adocao1.registro(true);
            adocao1.idade(2019);
            adocao1.informaPeso(5);
            adocao1.validachip(false);
            adocao1.animalFerido(false);
            adocao1.aptoParaAdocao();

        System.out.println(" ");

        AdotaCachorro adocao2 = new AdotaCachorro("Marley", "Shitzu");

            adocao2.registro(true);
            adocao2.idade(2020);
            adocao2.informaPeso(2.5);
            adocao2.validachip(true);
            adocao2.animalFerido(true);
            adocao2.aptoParaAdocao();
    
        }

}

