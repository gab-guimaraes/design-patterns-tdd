package org.johnwick182.adapter;

import org.johnwick182.adapter.aus.AustralianPlugConnector;
import org.johnwick182.adapter.br.BrazilianPlugConnector;

public class AuToBrPlugAdapter implements BrazilianPlugConnector {

    private AustralianPlugConnector plug;

    public AuToBrPlugAdapter(AustralianPlugConnector plug) {
        this.plug = plug;
    }

    @Override
    public String provideElectricity() {
       return plug.giveElectricity();
    }
}
