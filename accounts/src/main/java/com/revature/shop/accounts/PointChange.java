package com.revature.shop.accounts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "point_history")
public final class PointChange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "fk_account")
    private Account account;

    private String cause;
    private int change;
    private LocalDate date;

    public PointChange() {}

    public PointChange(String cause, int change) {
        this.cause = cause;
        this.change = change;

        date = LocalDate.now();
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public int getChange() {
        return change;
    }

    public void setChange(int change) {
        this.change = change;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setAccount(Account account){
        this.account = account;
    }

    @Override
    public String toString() {
        return "PointChange{" +
                "cause='" + cause + '\'' +
                ", change=" + change +
                ", date=" + date +
                '}';
    }
}