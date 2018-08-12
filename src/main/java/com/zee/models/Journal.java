package com.zee.models;

import java.util.Date;
import java.util.Objects;

public class Journal {
    private long id;
    private String desciption;
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
        Journal journal = (Journal) o;
        return id == journal.id &&
                Objects.equals(desciption, journal.desciption) &&
                Objects.equals(date, journal.date) &&
                Objects.equals(lastModifiedDate, journal.lastModifiedDate) &&
                Objects.equals(lastCreatedDate, journal.lastCreatedDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, desciption, date, lastModifiedDate, lastCreatedDate);
    }
}

