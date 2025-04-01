package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface RhymersFactory {

    //TODO: Usuń modyfikatory dostępu public z metod - metody w interfejsie są domyślnie publiczne i abstrakcyjne
    public DefaultCountingOutRhymer getStandardRhymer();

    public DefaultCountingOutRhymer getFalseRhymer();

    public DefaultCountingOutRhymer getFifoRhymer();

    public DefaultCountingOutRhymer getHanoiRhymer();

}
