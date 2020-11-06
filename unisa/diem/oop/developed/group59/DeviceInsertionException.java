package it.unisa.diem.oop.developed.group59;

/**
 * @author Cristian Mandara
 * @author Marco Venere
 * @author Mario Pellegrino
 * @author Mirco Rispoli
 */

/**
 * Eccezione non controllata (estende {@link RuntimeException}.
 * Viene sollevata in caso di errori relativi all'inserimento di un dispositivo già presente.
 */
public class DeviceInsertionException extends RuntimeException{
    public DeviceInsertionException() {
    }

    public DeviceInsertionException(String errorMessage) {
        super(errorMessage);
    }
}
