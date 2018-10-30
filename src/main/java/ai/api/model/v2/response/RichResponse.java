
package ai.api.model.v2.response;

import java.io.Serializable;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class RichResponse implements Serializable
{

    @SerializedName("items")
    @Expose
    private List<Item> items = null;
    private final static long serialVersionUID = 6679391122379804287L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RichResponse() {
    }

    /**
     * 
     * @param items
     */
    public RichResponse(List<Item> items) {
        super();
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("items", items).toString();
    }

}
