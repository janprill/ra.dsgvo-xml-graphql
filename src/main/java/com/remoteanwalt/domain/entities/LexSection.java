package com.remoteanwalt.domain.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "lex_sections")
public class LexSection {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String subtitle;
    private String raw;
    private String sorting;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="legislation")
    private Legislation legislation;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="lex_section")
    private LexSection lexSection;
    @OneToMany(mappedBy = "lexSection")
    private List<LexSection> lexSections;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
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

    public String getSorting() {
        return sorting;
    }

    public void setSorting(String sorting) {
        this.sorting = sorting;
    }

}
