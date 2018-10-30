
package ai.api.model.v2.request;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Surface {

    @SerializedName("capabilities")
    @Expose
    private List<Capability> capabilities = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Surface() {
    }

    /**
     * 
     * @param capabilities
     */
    public Surface(List<Capability> capabilities) {
        super();
        this.capabilities = capabilities;
    }

    public List<Capability> getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(List<Capability> capabilities) {
        this.capabilities = capabilities;
    }

}
