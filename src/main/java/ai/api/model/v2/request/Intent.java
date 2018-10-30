
package ai.api.model.v2.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Intent {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("displayName")
    @Expose
    private String displayName;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Intent() {
    }

    /**
     * 
     * @param name
     * @param displayName
     */
    public Intent(String name, String displayName) {
        super();
        this.name = name;
        this.displayName = displayName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

}
