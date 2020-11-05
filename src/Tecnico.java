import com.sun.nio.sctp.AbstractNotificationHandler;

public class Tecnico extends AbstractDipendente{
    private String sede;

    public Tecnico(int matricola) {
        super(matricola);
    }

    public Tecnico(String nome, int matricola,String sede) {
        super(nome, matricola);
        this.sede = sede;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    @Override
    public String toString() {
        return String.format("%s - Sede: %s", super.toString(),sede);
    }
}
