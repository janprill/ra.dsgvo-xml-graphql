package com.remoteanwalt.application;

import com.remoteanwalt.domain.consolidated.Consideration;
import com.remoteanwalt.domain.consolidated.Item;
import com.remoteanwalt.domain.jaxb_orig.*;

import javax.xml.bind.JAXBElement;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public class ExtractionService {
    public ExtractionService(final ACTType act) {
        extract(act);
    }

    private static Item apply(Serializable c) {
        if (c.getClass().equals(String.class)) {
            Item item = new Item();
            item.setType(Item.Key.STRING);
            item.getData().put("content", c.toString());
            return item;
        } else {
            JAXBElement element = (JAXBElement) c;
            if (element.getDeclaredType().equals(DATEType.class)) {
                DATEType date = (DATEType) element.getValue();
                Item item = new Item();
                item.setType(Item.Key.DATE);
                item.getData().put("iso", date.getISO());
                item.getData().put("value", date.getValue());
                return item;
            } else if (element.getDeclaredType().equals(NOTEType.class)) {
                NOTEType note = (NOTEType) element.getValue();
                Item item = new Item();
                item.setType(Item.Key.NOTE);
                List<Item> collected = note.getP().getContent().stream().map(ExtractionService::apply).collect(Collectors.toList());
                item.setItems(collected);
                return item;
            } else if (element.getDeclaredType().equals(QUOTSTARTType.class)) {
                QUOTSTARTType start = (QUOTSTARTType) element.getValue();
                System.out.println(start.getCODE());
                Item item = new Item();
                item.setType(Item.Key.QUOTSTART);
                item.getData().put("code", start.getCODE());
                item.getData().put("id", start.getID());
                item.getData().put("value", start.getValue());
                return item;
            } else if (element.getDeclaredType().equals(QUOTENDType.class)) {
                QUOTENDType end = (QUOTENDType) element.getValue();
                Item item = new Item();
                item.setType(Item.Key.QUOTEND);
                item.getData().put("code", end.getCODE());
                item.getData().put("id", end.getID());
                item.getData().put("value", end.getValue());
                return item;
            }
        }
        return new Item();
    }

    private void extract(ACTType act) {
        List<Consideration> collect = act.getPREAMBLE().getGRCONSID().getCONSID().stream().map(consid -> {
            Consideration consideration = new Consideration();
            NPType np = consid.getNP();
            consideration.setNo(np.getNOP());
            consideration.setItems(content(np.getTXT()));
            return consideration;
        }).collect(Collectors.toList());
        System.out.println(collect);
    }

    private List<Item> content(TXTType txtType) {
        List<Serializable> content = txtType.getContent();
        List<Item> items = content.stream().map(ExtractionService::apply).collect(Collectors.toList());

        return items;
    }
}
