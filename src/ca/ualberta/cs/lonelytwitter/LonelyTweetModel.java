package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class LonelyTweetModel {
    // public           anywhere
    // protected        class + subclasses + package
    // private          only current class + package
    protected String text;
    protected Date timestamp;
    
    public String getText() {
        return text;
    }
    
    public abstract void setText(String text);
    
    public abstract boolean isImportant();
    
    public Date getTimestamp() {
        return timestamp;
    }
    
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    
    public LonelyTweetModel(String text, Date timestamp) {
        super();
        this.text = text;
        this.timestamp = timestamp;
    }
    
    public LonelyTweetModel(String text) {
        super();
        this.text = text;
        this.timestamp = new Date();
    }
    
}
