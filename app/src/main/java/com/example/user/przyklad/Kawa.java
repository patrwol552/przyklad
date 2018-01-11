package com.example.user.przyklad;

/**
 * Created by User on 11.01.2018.
 */

public class Kawa {
    private String nazwa;
    private String cena;

    public Kawa(String nazwa, String cena)
    {
        this.nazwa=nazwa;
        this.cena=cena;
    }

    public String getNazwa()
    {
        return this.nazwa;
    }

    public void setNazwa(String nazwa)
    {
        this.nazwa=nazwa;
    }

    public String getCena()
    {
        return this.cena;
    }

    public void setCena(String cena)
    {
        this.cena=cena;
    }
}
