package com.YozziBeens.rivostaxi.modelo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table IMAGE_PERFIL.
 */
public class ImagePerfil {

    private Long id;
    private byte[] Image;

    public ImagePerfil() {
    }

    public ImagePerfil(Long id) {
        this.id = id;
    }

    public ImagePerfil(Long id, byte[] Image) {
        this.id = id;
        this.Image = Image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getImage() {
        return Image;
    }

    public void setImage(byte[] Image) {
        this.Image = Image;
    }

}