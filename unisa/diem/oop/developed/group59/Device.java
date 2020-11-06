package it.unisa.diem.oop.developed.group59;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Cristian Mandara
 * @author Marco Venere
 * @author Mario Pellegrino
 * @author Mirco Rispoli
 */

/**
*  Definisce l'entità di tipo {@link Device} (sistema di elaborazione)
*/
public abstract class Device implements Comparable<Device> {
    private final String serialNumber;
    private final LocalDate releaseDate;
    private final int RAMsize;
    private final int storageCapacity;

    
    /**
     * Il costruttore Device permette di istanziare un nuovo dispositivo inserendo:
     * @param serialNumber indica il numero seriale del device
     * @param year l'anno della data di rilascio
     * @param month il mese della data di rilascio
     * @param dayOfMonth il giorno della data di rilascio
     * @param RAMsize la dimensione della Ram del device
     * @param storageCapacity lo spazio di archiviazione disponibile nel device
     */
    public Device(String serialNumber,  int year, int month, int dayOfMonth, int RAMsize, int storageCapacity) {
        this.serialNumber = serialNumber;
        this.RAMsize = RAMsize;
        this.storageCapacity = storageCapacity;
        this.releaseDate= LocalDate.of(year,month,dayOfMonth);
    }
    
    /**
     * 
     * @return hashcode dell'oggetto  di tipo device
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.serialNumber.toLowerCase());
        return hash;
    }
     
    /**
     *Verifica se il device risulta uguale ad un altro oggetto con parametro di confronto il numero seriale del device
     *nel confronto tra numeri seriali vengono ignorate le maiuscole (Case Insensitive)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Device other = (Device) obj;
        if (serialNumber.equalsIgnoreCase(other.getSerialNumber())) {
            return false;
        }
        return true;
    }
    
    /**
     * definisce la relazione d'ordine naturale sul tipo Device (rispetto al numero seriale)
     * il modificatore è final in modo che il metodo
     * non possa essere sovrascritto nelle classi derivate
     * @return un intero negativo o positivo o pari a 0(in caso siano uguali)
     */
    public final int compareTo(Device o){
    return serialNumber.compareToIgnoreCase(o.getSerialNumber());
    }
    

    public String getSerialNumber() {
        return serialNumber;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public int getRAMsize() {
        return RAMsize;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }
    
    
    /**
     * 
     * @return un formato stringa relativa al device
     */
    @Override
    public String toString() {
        return String.format("serialNumber= %s\nreleaseDate= %tF\nRAMsize= %dGB\nstorageCapacity= %dGB\n", serialNumber, releaseDate, RAMsize, storageCapacity);
    }

    public abstract boolean hasTouchScreen();
    
    
    
}