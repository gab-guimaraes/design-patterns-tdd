package org.johnwick182.adapter;

import org.johnwick182.adapter.aus.AustralianPlug;
import org.johnwick182.adapter.aus.AustralianPlugConnector;
import org.johnwick182.adapter.br.BrazilianEletricalSocket;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Client {
    @Test
    public void testPlugIn() {
        BrazilianEletricalSocket brazilianEletricalSocket = new BrazilianEletricalSocket();
        AustralianPlugConnector australianPlugConnector = new AustralianPlug();
        AuToBrPlugAdapter adapter = new AuToBrPlugAdapter(australianPlugConnector);
        String conn = brazilianEletricalSocket.plugIn(adapter);
        assertEquals("CONNECT", conn);
    }
}