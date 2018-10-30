
package ai.api.model.v2.response;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Google implements Serializable
{

    @SerializedName("expectUserResponse")
    @Expose
    private Boolean expectUserResponse;
    @SerializedName("richResponse")
    @Expose
    private RichResponse richResponse;
    private final static long serialVersionUID = 4756389282666701803L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Google() {
    }

    /**
     * 
     * @param richResponse
     * @param expectUserResponse
     */
    public Google(Boolean expectUserResponse, RichResponse richResponse) {
        super();
        this.expectUserResponse = expectUserResponse;
        this.richResponse = richResponse;
    }

    public Boolean getExpectUserResponse() {
        return expectUserResponse;
    }

    public void setExpectUserResponse(Boolean expectUserResponse) {
        this.expectUserResponse = expectUserResponse;
    }

    public RichResponse getRichResponse() {
        return richResponse;
    }

    public void setRichResponse(RichResponse richResponse) {
        this.richResponse = richResponse;
    }

    @Override
    public String toString() {
      return new ToStringBuilder(this).append("expectUserResponse", expectUserResponse).append("richResponse", richResponse).toString();
    }

}
