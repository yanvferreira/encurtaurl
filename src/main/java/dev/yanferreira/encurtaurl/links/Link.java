package dev.yanferreira.encurtaurl.links;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String urlLonga;
    private String urlEncurtada;
    private LocalDateTime urlCriadaEm;

    public Link() {
    }

    public Link(Long id, String urlLonga, String urlEncurtada, LocalDateTime urlCriadaEm) {
        this.id = id;
        this.urlLonga = urlLonga;
        this.urlEncurtada = urlEncurtada;
        this.urlCriadaEm = urlCriadaEm;
    }
    
    public Long getId() {
        return id;
    }
    public String getUrlLonga() {
        return urlLonga;
    }
    public void setUrlLonga(String urlLonga) {
        this.urlLonga = urlLonga;
    }
    public String getUrlEncurtada() {
        return urlEncurtada;
    }
    public void setUrlEncurtada(String urlEncurtada) {
        this.urlEncurtada = urlEncurtada;
    }
    public LocalDateTime getUrlCriadaEm() {
        return urlCriadaEm;
    }
    public void setUrlCriadaEm(LocalDateTime urlCriadaEm) {
        this.urlCriadaEm = urlCriadaEm;
    }

    
}
