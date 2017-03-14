package de.goeri.learning;

import java.util.Date;

public class RequestData {
    private long created;
    private String elementId;
    private String countId;
    private boolean isDone;

    public RequestData() {
        created = new Date().getTime();
    }

    public RequestData(String elementId, String countId) {
        this();
        this.setElementId(elementId);
        this.setCountId(countId);
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public long getDelta() {
        return new Date().getTime() - created;
    }

    public String getElementId() {
        return elementId;
    }

    public void setElementId(String elementId) {
        this.elementId = elementId;
    }

    public String getCountId() {
        return countId;
    }

    public void setCountId(String countId) {
        this.countId = countId;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

}
