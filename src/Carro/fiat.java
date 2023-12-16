package Carro;

public class fiat {
    public String nome;
    public String cor;
    public String modelo;
    public double peso;

    public java.lang.String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public fiat(String nome, String cor, String modelo, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.modelo = modelo;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "fiat{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                '}';
    }

    public fiat() {
        super();
    }

    public String freio(){
        System.out.println("");
        return "";
    }

    public String alerta(){
        System.out.println("");
        //return alerta();
        return "piscar alerta";
    }

    //public String alerta;
    //public String freio;
}

