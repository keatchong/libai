
package ai.api.model.v2.request;

import java.util.Map;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OutputContext {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("lifespanCount")
    @Expose
    private Integer lifespanCount;

    @SerializedName("parameters")
    @Expose
    private Map<String, String> parameters;
    
    /**
     * No args constructor for use in serialization
     * 
     */
    public OutputContext() {
    }

    /**
     * 
     * @param name
     * @param parameters
     * @param lifespanCount
     */
    public OutputContext(String name, Integer lifespanCount, Map<String, String> parameters) {
        super();
        this.name = name;
        this.lifespanCount = lifespanCount;
        this.parameters = parameters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLifespanCount() {
        return lifespanCount;
    }

    public void setLifespanCount(Integer lifespanCount) {
        this.lifespanCount = lifespanCount;
    }

	public Map<String, String> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}

    
}
