import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PresenzeDipendenti {
    private Map<Dipendente,Integer> m;

    public PresenzeDipendenti() {
        this.m = new HashMap<>();
    }
    public void aggiornaPresenzeDipendente(Dipendente d,int presenze) throws DipendenteAssenteException {
        if(!m.containsKey(d)){
            throw new DipendenteAssenteException(d);
        }
        m.replace(d,presenze);
    }
    public void aggiungiNuovoDipendente(Dipendente d) throws DipendenteDuplicatoException {
        if(m.containsKey(d)){
            throw new DipendenteDuplicatoException(d);
        }
        m.put(d,0); //inizialmente il dipendente ha 0 presenze
    }
    public void rimuoviDipendente(Dipendente d) throws DipendenteAssenteException {
        if(!m.containsKey(d)){
            throw new DipendenteAssenteException(d);
        }
        m.remove(d);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Presenze dipendenti\n");
       for(Dipendente d : m.keySet()) {
           sb.append(d)
                   .append(" - Presenze:")
                   .append(m.get(d)) //restituisce il valore corrispondente al dipendente d nella struttura dati, in questo caso le presenze
                   .append('\n');
       }
       return sb.toString();
    }


    public Set<Tecnico> getTecnici(){
        Set<Tecnico> tecnici = new HashSet<>();
        for(Dipendente d : m.keySet()){
            if(d instanceof Tecnico){
                tecnici.add((Tecnico)d);
            }
        }
        return tecnici;
    }
}
