package com.YozziBeens.rivostaxi.solicitud;

public class SolicitudSaberSiEsAeropuerto {

    public SolicitudSaberSiEsAeropuerto(String latitude, String longitude) {
        Latitude = latitude;
        Longitude = longitude;
    }

    public SolicitudSaberSiEsAeropuerto() {
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    private String Latitude;
    private String Longitude;







}
