package com.remoteanwalt.application;

import com.remoteanwalt.domain.jaxb.ACTType;
import com.remoteanwalt.domain.jaxb.DATEType;
import com.remoteanwalt.domain.jaxb.NOTEType;
import com.remoteanwalt.domain.jaxb.QUOTSTARTType;

import javax.xml.bind.JAXBElement;

public class ExtractionService {
    public ExtractionService(final ACTType act) {
        act.getPREAMBLE().getGRCONSID().getCONSID().stream().forEach(consid -> {
            System.out.println(consid.getNP().getNOP());
            consid.getNP().getTXT().getContent().stream().forEach(content -> {
                System.out.println("============================");
                if (content.getClass().equals(String.class)) {
                    System.out.println(content);
                } else {
                    JAXBElement element = (JAXBElement) content;
                    if (element.getDeclaredType().equals(NOTEType.class)) {
                        NOTEType note = (NOTEType) element.getValue();
                        System.out.println("NOTE: " + note.getTYPE() + " " + note.getP().getContent());
                    } else if (element.getDeclaredType().equals(DATEType.class)) {
                        DATEType date = (DATEType) element.getValue();
                        System.out.println(date.getISO());
                    } else if (element.getDeclaredType().equals(QUOTSTARTType.class)) {
                        QUOTSTARTType start = (QUOTSTARTType) element.getValue();
                        System.out.println(start.getCODE());
                    } else {
                        System.out.println(content);
                    }
                }

            });
        });

        act.getENACTINGTERMS().getDIVISION().stream().forEach(division -> {
            System.out.println(division.getTITLE().getTI());
            System.out.println(division.getTITLE().getSTI().getP().getContent());
            System.out.println("==========================================");
            division.getARTICLE().stream().forEach(article -> {
                System.out.println(article.getIDENTIFIER());
                System.out.println(article.getTIART());
                System.out.println(article.getSTIART().getContent());
            });
        });
    }
}
