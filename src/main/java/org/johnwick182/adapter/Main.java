package org.johnwick182.adapter;

import org.johnwick182.adapter.aus.AustralianPlug;
import org.johnwick182.adapter.aus.AustralianPlugConnector;
import org.johnwick182.adapter.br.BrazilianEletricalSocket;

public class Main {
    public static void main(String[] args) {
        //create socket - tomada brasileira
        BrazilianEletricalSocket brazilianEletricalSocket = new BrazilianEletricalSocket();

        //australian plug - 3 pins
        AustralianPlugConnector australianPlug = new AustralianPlug();

        //adapter aus to brazil
        AuToBrPlugAdapter adapter = new AuToBrPlugAdapter(australianPlug);

        //plugIn AUadapter inside br socket
        System.out.println(brazilianEletricalSocket.plugIn(adapter));
    }
}
