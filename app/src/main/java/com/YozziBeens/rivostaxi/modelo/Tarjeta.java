package com.YozziBeens.rivostaxi.modelo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table TARJETA.
 */
public class Tarjeta {

    private Long id;
    private String Card_Id;
    private String Number_Card;
    private String Month;
    private String Year;
    private String Name_Card;

    public Tarjeta() {
    }

    public Tarjeta(Long id) {
        this.id = id;
    }

    public Tarjeta(Long id, String Card_Id, String Number_Card, String Month, String Year, String Name_Card) {
        this.id = id;
        this.Card_Id = Card_Id;
        this.Number_Card = Number_Card;
        this.Month = Month;
        this.Year = Year;
        this.Name_Card = Name_Card;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCard_Id() {
        return Card_Id;
    }

    public void setCard_Id(String Card_Id) {
        this.Card_Id = Card_Id;
    }

    public String getNumber_Card() {
        return Number_Card;
    }

    public void setNumber_Card(String Number_Card) {
        this.Number_Card = Number_Card;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String Month) {
        this.Month = Month;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getName_Card() {
        return Name_Card;
    }

    public void setName_Card(String Name_Card) {
        this.Name_Card = Name_Card;
    }

}
