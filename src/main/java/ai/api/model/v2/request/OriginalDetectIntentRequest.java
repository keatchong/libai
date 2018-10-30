
package ai.api.model.v2.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OriginalDetectIntentRequest {

    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("payload")
    @Expose
    private Payload payload;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OriginalDetectIntentRequest() {
    }

    /**
     * 
     * @param source
     * @param payload
     * @param version
     */
    public OriginalDetectIntentRequest(String source, String version, Payload payload) {
        super();
        this.source = source;
        this.version = version;
        this.payload = payload;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

}
