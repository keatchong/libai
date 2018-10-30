
package ai.api.model.v2.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RawInput {

    @SerializedName("query")
    @Expose
    private String query;
    @SerializedName("inputType")
    @Expose
    private String inputType;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RawInput() {
    }

    /**
     * 
     * @param query
     * @param inputType
     */
    public RawInput(String query, String inputType) {
        super();
        this.query = query;
        this.inputType = inputType;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

}
