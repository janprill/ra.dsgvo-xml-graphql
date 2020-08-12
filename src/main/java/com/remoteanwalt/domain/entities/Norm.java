package com.remoteanwalt.domain.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "norms")
public class Norm extends PanacheEntity {
    private String no;
    private String title;
    private String subtitle;

    @OneToMany(mappedBy = "norm")
    private List<Paragraph> paragraphs;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="lex_section")
    private LexSection lexSection;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
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

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }
}
