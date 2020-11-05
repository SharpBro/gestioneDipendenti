public class DipendenteDuplicatoException extends Exception {
    Dipendente d;

    public DipendenteDuplicatoException(Dipendente d) {
        this.d = d;
    }
}
