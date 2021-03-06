package org.dima.bdapro.jmx;

public class Metrics implements MetricsMBean {

    private Double processingTimeLatency;
    private Double eventTimeLatency;
    private Integer totalNumTransactions;
    private Integer totalNumberMessagesIn;


    public Metrics (){
        processingTimeLatency = 0.0;
        eventTimeLatency = 0.0;
        totalNumTransactions = 0;
        totalNumberMessagesIn = 0;
    }

    @Override
    public Double getProcessingTimeLatency() {
        return processingTimeLatency;
    }

    @Override
    public Double getEventTimeLatency() {
        return eventTimeLatency;
    }

    @Override
    public Integer getTotalNumTransactions() {
        return totalNumTransactions;
    }

    @Override
    public void setProcessingTimeLatency(Double processingTimeLatency) {
        this.processingTimeLatency = processingTimeLatency;
    }

    @Override
    public void setEventTimeLatency(Double eventTimeLatency) {
        this.eventTimeLatency = eventTimeLatency;
    }

    @Override
    public void setTotalNumTransactions(Integer totalNumTransactions) {
        this.totalNumTransactions = totalNumTransactions;
    }


    @Override
    public void incTotalNumTransactions() {
        this.totalNumTransactions++;
    }

    @Override
    public Integer getTotalNumberMessagesIn() {
        return totalNumberMessagesIn;
    }

    @Override
    public void addMessage() {
        totalNumberMessagesIn++;
    }
}
