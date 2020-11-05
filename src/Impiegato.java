public class Impiegato extends AbstractDipendente{

    private String cellulare;

    public Impiegato(int matricola) {
        super(matricola);
    }

    public Impiegato(String nome, int matricola,String cellulare) {
        super(nome, matricola);
        this.cellulare = cellulare;
    }

    public String getCellulare() {
        return cellulare;
    }

    public void setCellulare(String cellulare) {
        this.cellulare = cellulare;
    }

    @Override
    public String toString() {
        return String.format("%s - Cellulare: %s", super.toString(),cellulare);
    }
}
