
package ai.api.model.v2.response;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class SimpleResponse implements Serializable
{

    @SerializedName("textToSpeech")
    @Expose
    private String textToSpeech;
    private final static long serialVersionUID = -5624370272608056902L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SimpleResponse() {
    }

    /**
     * 
     * @param textToSpeech
     */
    public SimpleResponse(String textToSpeech) {
        super();
        this.textToSpeech = textToSpeech;
    }

    public String getTextToSpeech() {
        return textToSpeech;
    }

    public void setTextToSpeech(String textToSpeech) {
        this.textToSpeech = textToSpeech;
    }

   @Override
   public String toString() {
        return new ToStringBuilder(this).append("textToSpeech", textToSpeech).toString();
    }

}
