package ifpb.edu.br.asynctask_listener.ifpb.edu.br.Nutri.asynctask;

public class Pessoa {

    private String peso;
    private String altura;
    private String Entrevista;
    private int nivelEsporte;
    private int nasc;

    public Pessoa(){

    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getEntrevista() {
        return Entrevista;
    }

    public void setEntrevista(String entrevista) {
        this.Entrevista = entrevista;
    }

    public int getNivelEsporte() {
        return nivelEsporte;
    }

    public void setNivelEsporte(int nivelEsporte) {
        this.nivelEsporte = nivelEsporte;
    }

    public int getNasc() {
        return nasc;
    }

    public void setNasc(int nasc) {
        this.nasc = nasc;
    }
}
