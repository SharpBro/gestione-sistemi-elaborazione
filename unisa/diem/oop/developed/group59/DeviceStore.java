package it.unisa.diem.oop.developed.group59;

import it.unisa.diem.oop.provided.DeviceFilter;
import it.unisa.diem.oop.provided.Filterable;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Cristian Mandara
 * @author Marco Venere
 * @author Mario Pellegrino
 * @author Mirco Rispoli
 */

/**
 * Questa classe implementa l'interfaccia {@link Filterable}.
 * Definisce l'entità store, di tipo {@link Set<Device>} e la proprietà name, di tipo {@link String}.
 */
public class DeviceStore implements Filterable {

    private final String name;
    private final Set<Device> store;

    /**
     * Crea un nuovo {@link DeviceStore} costituito da un sottoinsieme degli elementi presenti nel {@link DeviceStore}
     * di partenza, selezionati in accordo al filtro specificato dall'oggetto di tipo {@link DeviceFilter} passato.
     * @param d un oggetto di tipo {@link DeviceFilter}
     * @param c un oggetto di tipo {@link Comparator<Device>}. Se è null, viene preservata la relazione d'ordine naturale.
     * @return un nuovo oggetto di tipo {@link DeviceStore}.
     */
    @Override
    public DeviceStore filter(DeviceFilter d, Comparator<Device> c) {
        //ATTENZIONE: se c == null, il costruttore del TreeSet utilizza la relazione d'ordine naturale per i Device.
        DeviceStore newStore = new DeviceStore(name +" custom view" , c);
        for(Device dev : store)
            if(d.checkDevice(dev))
                newStore.addDevice(dev);
        return newStore;
    }

    /**
     * Questo costruttore crea un oggetto di tipo {@link DeviceStore}
     * su cui vale la relazione d'ordine naturale prevista per i {@link Device}.
     * @param name il nome del {@link DeviceStore}, di tipo {@link String}.
     */
    public DeviceStore(String name) {
        this.name = name;
        store = new TreeSet<>();
    }

    /**
     * Questo costruttore consente di imporre una relazione d'ordine diversa
     * da quella naturale, specificata mediante un {@link Comparator<Device>}.
     * @param name il nome del {@link DeviceStore}, di tipo {@link String}.
     * @param c il comparatore, di tipo {@link Comparator<Device>}.
     */
    public DeviceStore(String name, Comparator<Device> c ) {
        //ATTENZIONE: se c == null, il costruttore del TreeSet utilizza la relazione d'ordine naturale per i Device.
        this.name = name;
        this.store = new TreeSet<>(c);
    }

    /**
     * Aggiunge un {@link Device} allo store.
     * @param d un oggetto di tipo {@link Device} da aggiungere.
     * @throws DeviceInsertionException un'eccezione non controllata, se il dispositivo è già presente.
     */
    public void addDevice(Device d) {
        if(store.add(d) == false)
            throw new DeviceInsertionException();
    }

    /**
     * @return una rappresentazione sotto forma di {@link String} del {@link DeviceStore}.
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name + " contains " + store.size() + " items.\nPrinting:\n");
        for(Device d : store) {
            builder.append("*****\n" + d);
        }
        return builder.toString();
    }
}
