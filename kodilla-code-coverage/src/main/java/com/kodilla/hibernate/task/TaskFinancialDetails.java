package com.kodilla.hibernate.task;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "TASKSFINANCIALDETAILS")
public class TaskFinancialDetails {
    private int id;
    private BigDecimal price;
    private boolean paid;

    public TaskFinancialDetails(int id, BigDecimal price, boolean paid) {
        this.id = id;
        this.price = price;
        this.paid = paid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    @Id
    public int getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public boolean isPaid() {
        return paid;
    }
}
