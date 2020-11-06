package it.unisa.diem.oop.developed.group59;
import java.util.Comparator;

/**
 * @author Cristian Mandara
 * @author Marco Venere
 * @author Mario Pellegrino
 * @author Mirco Rispoli
 */

/**
*La classe DeviceReleaseDateComparator implementa l'interfaccia {@link java.util.Comparator<Device>}
*e fornisce un criterio di ordinamento per i Device.
*/
public class DeviceReleaseDateComparator  implements Comparator<Device> {

/**
* Il metodo compare confronta il tipo di oggetto Device basato sulla data di rilascio in maniera
* crescente. Per due dispositivi aventi la stessa data di rilascio 
* va preservata la relazione d’ordine dei Device basata sul numero di serie.
*
*/
    public int compare(Device o1 , Device o2){
        if(o1.getReleaseDate().equals(o2.getReleaseDate()))
            return o1.compareTo(o2);
    else
        return o1.getReleaseDate().compareTo(o2.getReleaseDate());
    }
}
