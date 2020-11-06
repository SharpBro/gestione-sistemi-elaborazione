package it.unisa.diem.oop.developed.group59;
import it.unisa.diem.oop.provided.DeviceFilter;

/**
 * @author Cristian Mandara
 * @author Marco Venere
 * @author Mario Pellegrino
 * @author Mirco Rispoli
 */

public class NotebookFilter implements DeviceFilter {

    /**
     * @param d il dispositivo dal controllare
     * @return true se d è un'istanza di Notebook, falso altrimenti
     * si controlla che l'oggetto device non sia null: in tal caso si restituisce false
     */
    @Override
    public boolean checkDevice(Device d) {
        if(d == null)
            return false;
        return (d instanceof Notebook);
    }
}
