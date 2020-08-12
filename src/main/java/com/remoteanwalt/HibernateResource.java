package com.remoteanwalt;

import com.remoteanwalt.application.repos.LegislationRepo;
import com.remoteanwalt.application.repos.LexSectionRepo;
import com.remoteanwalt.domain.entities.Legislation;
import com.remoteanwalt.domain.entities.LexSection;

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
    LegislationRepo legislationRepo;
    @Inject
    LexSectionRepo lexSectionRepo;


    @GET
    @Path("1")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Legislation> hello() {
        return legislationRepo.findAll().stream().collect(Collectors.toList());
    }

    @GET
    @Path("lex")
    @Produces(MediaType.APPLICATION_JSON)
    public List<LexSection> lexSections() {
        return lexSectionRepo.findAll().stream().collect(Collectors.toList());
    }

}