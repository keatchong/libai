
package ai.api.model.v2.response;

import java.io.Serializable;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Button implements Serializable
{

    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("postback")
    @Expose
    private String postback;
    private final static long serialVersionUID = -6010668482859510519L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Button() {
    }

    /**
     * 
     * @param text
     * @param postback
     */
    public Button(String text, String postback) {
        super();
        this.text = text;
        this.postback = postback;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPostback() {
        return postback;
    }

    public void setPostback(String postback) {
        this.postback = postback;
    }

    @Override
    public String toString() {
      return new ToStringBuilder(this).append("text", text).append("postback", postback).toString();
    }

}
