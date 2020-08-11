package com.remoteanwalt;

import com.remoteanwalt.application.repos.LegislationRepo;
import com.remoteanwalt.domain.entities.Legislation;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Path("/hibernate")
public class HibernateResource {

    @Inject
    LegislationRepo repo;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Legislation> hello() {
        return repo.findAll().stream().collect(Collectors.toList());
    }


}