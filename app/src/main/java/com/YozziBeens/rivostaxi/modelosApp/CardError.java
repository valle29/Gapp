package com.YozziBeens.rivostaxi.modelosApp;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table CLIENT.
 */
public class CardError {


    public CardError() {
    }

    private String message_to_purchaser;
    private String type;
    private String params;

    public String getMessage_to_purchaser() {
        return message_to_purchaser;
    }

    public void setMessage_to_purchaser(String message_to_purchaser) {
        this.message_to_purchaser = message_to_purchaser;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public CardError(String message_to_purchaser, String type, String params) {
        this.message_to_purchaser = message_to_purchaser;
        this.type = type;
        this.params = params;
    }
}
