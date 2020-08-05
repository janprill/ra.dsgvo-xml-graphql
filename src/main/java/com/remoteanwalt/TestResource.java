package com.remoteanwalt;

import com.remoteanwalt.domain.jaxb.ACTType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.InputStream;

@Path("/raw")
public class TestResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Object hello() throws JAXBException {
        InputStream inputStream = getClass()
                .getClassLoader().getResourceAsStream("data/dsgvo.xml");
        JAXBContext context = JAXBContext.newInstance(ACTType.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Source source = new StreamSource(inputStream);
        JAXBElement<ACTType> root = unmarshaller.unmarshal(source, ACTType.class);
        ACTType act = root.getValue();

        return act;
    }


}