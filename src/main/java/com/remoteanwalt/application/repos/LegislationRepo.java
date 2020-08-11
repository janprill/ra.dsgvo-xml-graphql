package com.remoteanwalt.application.repos;

import com.remoteanwalt.domain.entities.Legislation;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LegislationRepo implements PanacheRepository<Legislation> {

    public Legislation findByName(String name) {
        return find("name", name).firstResult();
    }

}
