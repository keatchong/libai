
package ai.api.model.v2.response;

import java.io.Serializable;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Item implements Serializable
{

    @SerializedName("simpleResponse")
    @Expose
    private SimpleResponse simpleResponse;
    private final static long serialVersionUID = 6566075172825239802L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param simpleResponse
     */
    public Item(SimpleResponse simpleResponse) {
        super();
        this.simpleResponse = simpleResponse;
    }

    public SimpleResponse getSimpleResponse() {
        return simpleResponse;
    }

    public void setSimpleResponse(SimpleResponse simpleResponse) {
        this.simpleResponse = simpleResponse;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("simpleResponse", simpleResponse).toString();
    }

}
