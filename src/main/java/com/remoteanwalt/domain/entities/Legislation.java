package com.remoteanwalt.domain.entities;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "legislations")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class Legislation {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private String title;
    private String subtitle;
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private Object raw;

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

    public List<LexSection> getLexSections() {
        return lexSections;
    }

    public Object getRaw() {
        return raw;
    }

    public void setRaw(Object raw) {
        this.raw = raw;
    }
}
