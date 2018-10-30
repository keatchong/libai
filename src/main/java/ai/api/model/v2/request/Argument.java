
package ai.api.model.v2.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Argument {

    @SerializedName("rawText")
    @Expose
    private String rawText;
    @SerializedName("textValue")
    @Expose
    private String textValue;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Argument() {
    }

    /**
     * 
     * @param rawText
     * @param name
     * @param textValue
     */
    public Argument(String rawText, String textValue, String name) {
        super();
        this.rawText = rawText;
        this.textValue = textValue;
        this.name = name;
    }

    public String getRawText() {
        return rawText;
    }

    public void setRawText(String rawText) {
        this.rawText = rawText;
    }

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
