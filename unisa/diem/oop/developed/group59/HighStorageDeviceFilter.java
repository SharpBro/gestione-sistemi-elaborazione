package it.unisa.diem.oop.developed.group59;
import it.unisa.diem.oop.provided.DeviceFilter;

/**
 * @author Cristian Mandara
 * @author Marco Venere
 * @author Mario Pellegrino
 * @author Mirco Rispoli
 */

/**
 * Implementa l'interfaccia {@link DeviceFilter} attraverso il
 * metodo boolean checkDevice(Device d).
 */
public class HighStorageDeviceFilter implements DeviceFilter {

    private final int minSize;

    /**
     * Costruttore dell'oggetto di tipo {@link HighStorageDeviceFilter}.
     * @param minSize dimensione minima della memoria di massa per il device da considerare.
     */
    public HighStorageDeviceFilter(int minSize) {
        this.minSize = minSize;
    }

    /**
      * @param d un oggetto di tipo {@link Device}.
     * @return true se la dimensione di memoria di massa è almeno pari
     * al valore specificato attraverso il costruttore del filtro, false altrimenti.
     */
    @Override
    public boolean checkDevice(Device d) {
        return (d.getStorageCapacity() >= minSize);
    }
}
