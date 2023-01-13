import java.util.ArrayList;

public class Calendario {
    private String nome;
    private ArrayList<Feriado> feriados;

    public Calendario(String nome) {
        this.nome = nome;
        this.feriados = new ArrayList<Feriado>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Feriado> getFeriados() {
        return feriados;
    }

    public void addFeriado(Feriado feriado) {
        this.feriados.add(feriado);
    }

    public ArrayList<Feriado> getFeriados(String data) {
        ArrayList<Feriado> feriados = new ArrayList<Feriado>();
        for (Feriado feriado : this.feriados) {
            if (feriado.getData().equals(data)) {
                feriados.add(feriado);
            }
        }
        return feriados;
    }
}
