package com.zee.models;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Voucher {
    private long id;
    private String desciption;
    private List<VoucherEntry> entries;
    private Date date;
    private Date lastModifiedDate;
    private Date lastCreatedDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public List<VoucherEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<VoucherEntry> entries) {
        this.entries = entries;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Date getLastCreatedDate() {
        return lastCreatedDate;
    }

    public void setLastCreatedDate(Date lastCreatedDate) {
        this.lastCreatedDate = lastCreatedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voucher voucher = (Voucher) o;
        return id == voucher.id &&
                Objects.equals(desciption, voucher.desciption) &&
                Objects.equals(date, voucher.date) &&
                Objects.equals(lastModifiedDate, voucher.lastModifiedDate) &&
                Objects.equals(lastCreatedDate, voucher.lastCreatedDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, desciption, date, lastModifiedDate, lastCreatedDate);
    }
}

