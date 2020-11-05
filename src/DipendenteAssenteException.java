public class DipendenteAssenteException extends Exception {
    Dipendente d;

    public DipendenteAssenteException(Dipendente d) {
        this.d = d;
    }
}
