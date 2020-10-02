package com.ws.client;

import com.training.wsclient.MyWS;
import com.training.wsclient.MyWSService;

public class WSClientRun {

    public static void main(final String[] args) {
        MyWSService myWSServiceLoc = new MyWSService();
        MyWS myWSPortLoc = myWSServiceLoc.getMyWSPort();
        String helloLoc = myWSPortLoc.hello("osman",
                                            "yaya");
        System.out.println(helloLoc);

        String goodbyeLoc = myWSPortLoc.goodbye("ali",
                                                "veli",
                                                49);
        System.out.println(goodbyeLoc);

    }
}
