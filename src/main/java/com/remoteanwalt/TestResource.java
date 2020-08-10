package com.remoteanwalt;

import com.remoteanwalt.application.ExtractionService;
import com.remoteanwalt.domain.jaxb.DsgvoType;
import com.remoteanwalt.domain.jaxb_orig.ACTType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

@Path("/raw")
public class TestResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Object hello() throws Exception {
        InputStream inputStream = getClass()
                .getClassLoader().getResourceAsStream("data/dsgvo.xml");
        JAXBContext context = JAXBContext.newInstance(ACTType.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Source source = new StreamSource(inputStream);
        JAXBElement<ACTType> root = unmarshaller.unmarshal(source, ACTType.class);
        ACTType act = root.getValue();

        new ExtractionService(act);

        transform();

        return act;
    }

    public void transform() throws Exception {
        ByteArrayOutputStream resultStream = new ByteArrayOutputStream();
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = null;
        StreamSource fileStreamSource = new StreamSource(getClass().getClassLoader().getResourceAsStream("data/dsgvo.xml"));
        StreamSource xsltStreamSource = new StreamSource(getClass().getClassLoader().getResourceAsStream("data/dsgvo.xslt"));
        transformer = transformerFactory.newTransformer(xsltStreamSource);
        transformer.transform(fileStreamSource, new StreamResult(resultStream));
        // System.out.println(resultStream.toString());

        JAXBContext context = JAXBContext.newInstance(DsgvoType.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Source source = new StreamSource(resultStream.toString());
        JAXBElement<DsgvoType> root = unmarshaller.unmarshal(source, DsgvoType.class);
        DsgvoType dsgvo = root.getValue();


    }
}