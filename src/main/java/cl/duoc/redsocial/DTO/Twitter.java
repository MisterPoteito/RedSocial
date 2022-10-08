package cl.duoc.redsocial.DTO;

import java.time.LocalDate;

public class Twitter extends RedSocial {
    private int id;
    private String noticia;
    private LocalDate fecha;
    
public Twitter(){
    this.id= 0;
    this.noticia= "";
    this.fecha= LocalDate.now();
}

public Twitter(int id, String noticia, LocalDate fecha){
    this.id= id;
    this.noticia= noticia;
    this.fecha= fecha;
    super.getUsuario();
    super.getPassword();
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }


}
