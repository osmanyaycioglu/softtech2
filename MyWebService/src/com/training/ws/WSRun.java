package com.training.ws;

import javax.xml.ws.Endpoint;

public class WSRun {

    public static void main(final String[] args) {
        Endpoint.publish("http://127.0.0.1/myws",
                         new MyWS());
    }
}
