package org.johnwick182.adapter.aus;

public class AustralianPlug implements AustralianPlugConnector {
    @Override
    public String giveElectricity() {
        return "CONNECT";
    }
}
