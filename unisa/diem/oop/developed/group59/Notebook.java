package it.unisa.diem.oop.developed.group59;

import it.unisa.diem.oop.provided.CPUType;
import it.unisa.diem.oop.provided.NBScreenType;

/**
 * @author Cristian Mandara
 * @author Marco Venere
 * @author Mario Pellegrino
 * @author Mirco Rispoli
 */

/**
 * La classe rappresenta un Notebook e concretizza un {@link Device}.
 * Ha le seguenti proprietà univoche:
 * - type rappresenta il modello di CPU, definito attraverso l'enumerazione {@link CPUType}
 * - screenType rappresenta una tipologia di schermo, definito attraverso l'enumerazione {@link NBScreenType}
 * -touchScreen indica se il Notebook è dotato di uno schermo tattile e assume un valore booleano.
 * le proprietà sopracitate sono in sola lettura.
 *
 */

public class Notebook extends Device{
    private final CPUType type;
    private final NBScreenType screenType;
    private final boolean touchScreen;

    /**
     *  Costruttore per Notebook privi di schermo tattile;
     *  l'attributo touchScreen viene impostato a false.
     * @param type modello CPU
     * @param screenType tipologia Schermo
     * @param serialNumber numero seriale del Notebook
     * @param year anno di rilascio
     * @param month mese di rilascio
     * @param dayOfMonth giorno di rilascio
     * @param RAMsize dimensione della memoria RAM
     * @param storageCapacity capacità della memoria di massa
     */
   public Notebook(CPUType type, NBScreenType screenType,String serialNumber,int year,int month,int dayOfMonth,int RAMsize,int storageCapacity) {
       super(serialNumber,year,month,dayOfMonth,RAMsize,storageCapacity);
       this.type = type;
       this.screenType = screenType;
       this.touchScreen = false;
   }

    /**
     * Costruttore di un Notebook che prevede la disponibilità di uno schermo tattile.
     * @param type modello CPU
     * @param screenType tipologia Schermo
     * @param touchScreen se il dispositivo possiede uno schermo tattile
     * @param serialNumber numero seriale del Notebook
     * @param year anno di rilascio
     * @param month mese di rilascio
     * @param dayOfMonth giorno di rilascio
     * @param RAMsize dimensione della memoria RAM
     * @param storageCapacity capacità della memoria di massa
     */
    public Notebook(CPUType type, NBScreenType screenType, boolean touchScreen,String serialNumber,int year,int month,int dayOfMonth,int RAMsize,int storageCapacity) {
        super(serialNumber,year,month,dayOfMonth,RAMsize,storageCapacity);
        this.type = type;
        this.screenType = screenType;
        this.touchScreen = touchScreen;
    }

    /**
     * @return modello della CPU
     */
    public CPUType getType() {
        return type;
    }

    /**
     * @return modello dello schermo
     */
    public NBScreenType getScreenType() {
        return screenType;
    }

    public boolean hasTouchScreen() {
        return touchScreen;
    }

    /**
     * Sovrascrive il metodo {@link Device#toString()}
     *
     * @return una stringa nel formato:
     * Notebook
     * serialNumber= serialNumber
     * releaseDate= releaseDate
     * RAMsize= RAMsize
     * storageCapacity= storageCapacity
     * CPU= type
     * screenType=screenType
     * touchScreen available / NULL
     */
    @Override
    public String toString() {
        return String.format("Notebook\n%sCPU=%s\nscreenType=%s\n%s",super.toString(),getType(),getScreenType(),(touchScreen) ? "touchScreen available\n" : "");
    }
}
