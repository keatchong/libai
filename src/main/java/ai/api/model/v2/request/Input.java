
package ai.api.model.v2.request;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Input {

    @SerializedName("rawInputs")
    @Expose
    private List<RawInput> rawInputs = null;
    @SerializedName("arguments")
    @Expose
    private List<Argument> arguments = null;
    @SerializedName("intent")
    @Expose
    private String intent;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Input() {
    }

    /**
     * 
     * @param rawInputs
     * @param arguments
     * @param intent
     */
    public Input(List<RawInput> rawInputs, List<Argument> arguments, String intent) {
        super();
        this.rawInputs = rawInputs;
        this.arguments = arguments;
        this.intent = intent;
    }

    public List<RawInput> getRawInputs() {
        return rawInputs;
    }

    public void setRawInputs(List<RawInput> rawInputs) {
        this.rawInputs = rawInputs;
    }

    public List<Argument> getArguments() {
        return arguments;
    }

    public void setArguments(List<Argument> arguments) {
        this.arguments = arguments;
    }

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

}
