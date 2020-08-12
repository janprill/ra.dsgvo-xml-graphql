package com.remoteanwalt.application.repos;

import com.remoteanwalt.domain.entities.LexSection;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LexSectionRepo  implements PanacheRepository<LexSection> {

    public LexSection findByName(String name) {
        return find("name", name).firstResult();
    }

}
