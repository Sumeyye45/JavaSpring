package com.turkcell.productservice.dtos.responses;

import org.springframework.http.HttpStatusCode;

import java.util.Date;

public class ListProductResponse  {

    private int id;
    private String name;
    private String prodChar;
    private String serviceAdress;
    private Date startDate;

    public ListProductResponse(int id, String name, String prodChar, String serviceAdress, Date startDate) {
        this.id = id;
        this.name = name;
        this.prodChar = prodChar;
        this.serviceAdress = serviceAdress;
        this.startDate = startDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProdChar() {
        return prodChar;
    }

    public void setProdChar(String prodChar) {
        this.prodChar = prodChar;
    }

    public String getServiceAdress() {
        return serviceAdress;
    }

    public void setServiceAdress(String serviceAdress) {
        this.serviceAdress = serviceAdress;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
