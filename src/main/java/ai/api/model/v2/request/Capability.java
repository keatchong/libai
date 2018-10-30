
package ai.api.model.v2.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Capability {

    @SerializedName("name")
    @Expose
    private String name;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Capability() {
    }

    /**
     * 
     * @param name
     */
    public Capability(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
