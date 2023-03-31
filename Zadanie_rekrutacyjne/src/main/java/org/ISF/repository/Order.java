package org.ISF.repository;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;

public class Order {
    private String orderId;
    private BigDecimal orderValue;
    private Duration pickingTime;
    private LocalTime completeBy;
    public Order (String orderId, BigDecimal orderValue, Duration pickingTime, LocalTime completeBy){
        this.orderId = orderId;
        this.orderValue = orderValue;
        this.pickingTime = pickingTime;
        this.completeBy = completeBy;
    }
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(BigDecimal orderValue) {
        this.orderValue = orderValue;
    }

    public Duration getPickingTime() {
        return pickingTime;
    }

    public void setPickingTime(Duration pickingTime) {
        this.pickingTime = pickingTime;
    }

    public LocalTime getCompleteBy() {
        return completeBy;
    }

    public void setCompleteBy(LocalTime completeBy) {
        this.completeBy = completeBy;
    }
}
