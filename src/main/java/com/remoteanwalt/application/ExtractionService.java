package com.remoteanwalt.application;

import com.remoteanwalt.domain.jaxb.ACTType;

public class ExtractionService {
    public ExtractionService(final ACTType act) {
        act.getPREAMBLE().getGRCONSID().getCONSID().stream().forEach(consid -> {
            consid.getNP().getTXT().getContent().stream().forEach(content -> {
                System.out.println(content);
                System.out.println("============================");
            });
        });
    }
}
