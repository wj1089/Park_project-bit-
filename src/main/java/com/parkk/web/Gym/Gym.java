package com.parkk.web.Gym;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity(name="gym")
@Component
public class Gym {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gymNo;
    @Column(length = 550) private String ser_Num;
    @Column(length = 50) private String open_YN;
    @Column(length = 50) private String number;
    @Column(length = 350) private String address;
    @Column(length = 10) private String mailing_address;
    @Column(length = 200) private String name;

    public Gym(){}

    public Long getGymNo() {
        return gymNo;
    }

    public void setGymNo(Long gymNo) {
        this.gymNo = gymNo;
    }


    public String getSer_Num() {
        return ser_Num;
    }

    public void setSer_Num(String ser_Num) {
        this.ser_Num = ser_Num;
    }

    public String getOpen_YN() {
        return open_YN;
    }

    public void setOpen_YN(String open_YN) {
        this.open_YN = open_YN;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMailing_address() {
        return mailing_address;
    }

    public void setMailing_address(String mailing_address) {
        this.mailing_address = mailing_address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
