
package ai.api.model.v2.response;

import java.io.Serializable;
import java.util.Map;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class FollowupEventInput implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("languageCode")
    @Expose
    private String languageCode;
    
    @SerializedName("parameters")
    @Expose
    private Map<String, String> parameters;
    
    private final static long serialVersionUID = -83961048210197169L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FollowupEventInput() {
    }

    /**
     * 
     * @param languageCode
     * @param name
     * @param parameters
     */
    public FollowupEventInput(String name, String languageCode, Map<String, String> parameters) {
        super();
        this.name = name;
        this.languageCode = languageCode;
        this.parameters = parameters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("languageCode", languageCode).append("parameters", parameters).toString();
    }

}
