package aula06Mesa;

public class AdotaCachorro {
    private String nome;
    private boolean registrado;
    private String apto;
    private String raca;
    private int anoAprox;
    private  double peso;
    private String possuiChip;
    private boolean ferido;



    public AdotaCachorro(String nome, String raca){
        this.nome = nome;
        this.registrado = true;
        this.apto = "";
        this.raca = raca;
        this.anoAprox = 0;
        this.peso = 0;
        this.possuiChip = "";
        this.ferido = true;

    }

    public boolean registro(boolean estaRegistrado){
        if (estaRegistrado == true){
            this.registrado = true;
        }
        else {
            this.registrado = false;
        }
        System.out.println(this.nome + " " + this.registrado + " está registrado(a)");
        return this.registrado;
    }

    public int idade(int ano){
        this.anoAprox = (2022 - ano);
        System.out.println(this.nome + " é da raça " + this.raca + " e tem " + this.anoAprox + " anos");
       return this.anoAprox;

    }


    public void informaPeso(double kg) {
        this.peso = kg;

    }

    public String validachip(boolean chip){
        if(chip == true){
            this.possuiChip = " possui chip";
        }
        else{
            this.possuiChip = " não possui chip";
        }
        System.out.println(this.nome + this.possuiChip + " e pesa " + this.peso + " quilos");
        return  this.possuiChip;

    }

    public boolean animalFerido(boolean estaFerido){
        if(estaFerido == true){
            this.ferido = true;
        }
        else{
            this.ferido = false;
        }
        return  this.ferido;
    }


    public String aptoParaAdocao(){
        if(this.peso >= 5 && !this.ferido){

            this.apto = " está apto para adoção";
        }
        else {
            this.apto = " não está apto para adoção";
        }
        System.out.println(this.nome + this.ferido + " está ferido e " + this.apto);
            return this.apto;
        }

}


