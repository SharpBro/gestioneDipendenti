import java.util.Objects;

public abstract class AbstractDipendente implements Dipendente{
    private String nome;
    private int matricola;

    public AbstractDipendente(int matricola) {
        this.matricola = matricola;
    }

    public AbstractDipendente(String nome, int matricola) {
        this.nome = nome;
        this.matricola = matricola;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getMatricola() {
        return matricola;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractDipendente that = (AbstractDipendente) o;
        return Objects.equals(getMatricola(), that.getMatricola());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricola());
    }

    @Override
    public String toString() {
        return String.format("%s - matricola: %d", nome,matricola);
    }
}
