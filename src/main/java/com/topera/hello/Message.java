package com.topera.hello;

/**
 * Created by topera on 30/07/17.
 */
class Message {

    private String content;

    Message(String content) {
        this.content = content;
    }

    @SuppressWarnings("unused") // used by Jackson
    public String getContent() {
        return content;
    }

}
