package com.sebastopol.myrecyclerviewejemplo;

import androidx.fragment.app.Fragment;

public class Personaje extends Fragment {

    private int imagen;
    private String texto;
    private String des;

    public Personaje(int imagen, String texto, String des) {
        this.imagen = imagen;
        this.texto = texto;
        this.des = des;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
