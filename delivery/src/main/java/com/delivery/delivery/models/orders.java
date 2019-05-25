package com.delivery.delivery.models;


import javax.persistence.*;

@Entity
@Table(name = "orders")
public class orders
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int proid;

    @Column(name = "contno")
    public String contno;

    @Column(name = "address")
    public String address;


    public orders() {
    }

    public orders(String contno, String address)
    {
        this.contno = contno;
        this.address = address;
    }

    public int getProid()
    {
        return proid;
    }

    public void setProid(int proid)
    {
        this.proid = proid;
    }

    public String getContno()
    {
        return contno;
    }

    public void setContno(String contno)
    {
        this.contno = contno;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

}
