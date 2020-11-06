package it.unisa.diem.oop.developed.group59;

import it.unisa.diem.oop.provided.MobileCPUType;

import java.util.Locale;
/**
 * @author Cristian Mandara
 * @author Marco Venere
 * @author Mario Pellegrino
 * @author Mirco Rispoli
 */


/**
*La classe Smartphone estende la classe {@link Device} aggiungendo gli attributi:
* cpu di tipo MobileCPUType(indica il modello di cpu del dispositivo mobile)
* e screenSizeInch di tipo float(indica la dimensione della diagonale dello schermo in pollici).
*/

public class Smartphone extends Device {
    private final MobileCPUType cpu;
    private final float screenSizeInch;
/**
*Il costruttore Smartphone definisce i seguenti parametri:
*@param cpu indica il modello di cpu del dispositivo mobile;
*@param screenSizeInch indica la dimensione della diagonale dello schermo in pollici;
*@param serialNumber indica il numero seriale del dispositivo;
*@param year indica anno di rilascio;
*@param month indica mese di rilascio;
*@param dayOfMonth indica giorno di rilascio;
*@param RAMsize indica dimensione memoria RAM;
*@parama storageCapacity indica dimensione memoria di massa;
*/
    public Smartphone (MobileCPUType cpu, float screenSizeInch,String serialNumber , int year , int month , int dayOfMonth , int RAMsize, int storageCapacity ){
        super(serialNumber, year , month , dayOfMonth, RAMsize , storageCapacity);
        this.cpu = cpu;
        this.screenSizeInch = screenSizeInch;
    }
//il metodo getCpu restituisce il tipo di CPU
    public MobileCPUType getCpu() {
        return cpu;
    }
//il metodo getScreenSizeInch restituisce la dimensione della diagonale dello schermo in pollici
    public float getScreenSizeInch() {
        return screenSizeInch;
    }
/**
*Il metodo toString rappresenta lo smartphone con una stringa;
*
*/
    @Override
    public String toString() {
        return String.format(Locale.US,"Smartphone\n%sCPU= %s\nscreenSizeInch= %.1f\n", super.toString(), cpu, screenSizeInch);
    }
//il metodo hasTouchScreen restituisce la disponibilità dello schermo tattile.
    public boolean hasTouchScreen(){
        return true;
    }

}
