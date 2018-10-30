
package ai.api.model.v2.response;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class FulfillmentMessage implements Serializable
{

    @SerializedName("card")
    @Expose
    private Card card;
    private final static long serialVersionUID = 437182230765752526L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FulfillmentMessage() {
    }

    /**
     * 
     * @param card
     */
    public FulfillmentMessage(Card card) {
        super();
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

   @Override
   public String toString() {
      return new ToStringBuilder(this).append("card", card).toString();
    }

}
