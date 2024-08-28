package dev.yanferreira.encurtaurl.links;

import java.time.LocalDateTime;

public class LinksResponse {
  private Long id;
  private String urlLonga;
  private String urlEncurtada;
  private LocalDateTime urlCriadaEm;

  public LinksResponse(Long id, String urlLonga, String urlEncurtada, LocalDateTime urlCriadaEm) {
    this.id = id;
    this.urlLonga = urlLonga;
    this.urlEncurtada = urlEncurtada;
    this.urlCriadaEm = urlCriadaEm;
  }

public LinksResponse(Long id) {
    this.id = id;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
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
