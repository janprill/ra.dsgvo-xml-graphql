package com.remoteanwalt;

import com.remoteanwalt.domain.jaxb.DsgvoType;
import com.remoteanwalt.domain.jaxb.NpType;
import org.eclipse.microprofile.graphql.GraphQLApi;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.InputStream;
import java.util.List;

@GraphQLApi
public class DsgvoResource {

    public List<NpType> getAllNps() throws JAXBException {
        InputStream inputStream = getClass()
                .getClassLoader().getResourceAsStream("data/output.xml");
        JAXBContext context = JAXBContext.newInstance(DsgvoType.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Source source = new StreamSource(inputStream);
        JAXBElement<DsgvoType> root = unmarshaller.unmarshal(source, DsgvoType.class);
        DsgvoType value = root.getValue();
        return value.getPreamble().getNp();
    }
}
