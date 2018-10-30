
package ai.api.model.v2.response;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Slack implements Serializable
{

    @SerializedName("text")
    @Expose
    private String text;
    private final static long serialVersionUID = 101611519406357662L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Slack() {
    }

    /**
     * 
     * @param text
     */
    public Slack(String text) {
        super();
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("text", text).toString();
    }

}
