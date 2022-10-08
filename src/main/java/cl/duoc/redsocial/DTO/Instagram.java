package cl.duoc.redsocial.DTO;

public class Instagram extends RedSocial {
    private int id;
    private String historia;
    private boolean estado;
    
public Instagram(){
    this.id=  0;
    this.historia= "";
    this.estado= false;
}    

public Instagram(int id, String historia, boolean estado){
    this.id= id;
    this.historia= historia;
    this.estado= estado;
    super.getUsuario();
    super.getPassword();
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


}
