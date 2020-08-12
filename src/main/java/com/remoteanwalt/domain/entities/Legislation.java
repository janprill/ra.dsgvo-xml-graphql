package com.remoteanwalt.domain.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "legislations")
public class Legislation {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private String title;
    private String subtitle;
    private String raw;
    @OneToMany(mappedBy = "legislation")
    private List<LexSection> lexSections;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

    public List<LexSection> getLexSections() {
        return lexSections;
    }
}
