package com.remoteanwalt;

import com.remoteanwalt.domain.jaxb.NpType;
import org.eclipse.microprofile.graphql.GraphQLApi;

import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.List;

@GraphQLApi
public class DsgvoResource {

    public List<NpType> getAllNps() throws JAXBException {
        NpType np = new NpType();
        np.setId("1");
        np.setP("String");
        List<NpType> nps = new ArrayList<>();
        nps.add(np);
        return nps;
    }
}
