package com.remoteanwalt.domain.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;

@Entity
@Table(name = "paragraphs")
public class Paragraph extends PanacheEntity {
    private String no;
    private String title;
    private String raw;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="norm")
    private Norm norm;

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

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }
}
