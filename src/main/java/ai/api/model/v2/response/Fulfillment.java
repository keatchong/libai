package ai.api.model.v2.response;

import java.io.Serializable;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Fulfillment implements Serializable
{

    @SerializedName("fulfillmentText")
    @Expose
    private String fulfillmentText;
    @SerializedName("fulfillmentMessages")
    @Expose
    private List<FulfillmentMessage> fulfillmentMessages = null;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("payload")
    @Expose
    private Payload payload;
    @SerializedName("outputContexts")
    @Expose
    private List<OutputContext> outputContexts = null;
    @SerializedName("followupEventInput")
    @Expose
    private FollowupEventInput followupEventInput;
    private final static long serialVersionUID = -85333291329155834L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fulfillment() {
    }

    /**
     * 
     * @param followupEventInput
     * @param outputContexts
     * @param source
     * @param payload
     * @param fulfillmentText
     * @param fulfillmentMessages
     */
    public Fulfillment(String fulfillmentText, List<FulfillmentMessage> fulfillmentMessages, String source, Payload payload, List<OutputContext> outputContexts, FollowupEventInput followupEventInput) {
        super();
        this.fulfillmentText = fulfillmentText;
        this.fulfillmentMessages = fulfillmentMessages;
        this.source = source;
        this.payload = payload;
        this.outputContexts = outputContexts;
        this.followupEventInput = followupEventInput;
    }

    public String getFulfillmentText() {
        return fulfillmentText;
    }

    public void setFulfillmentText(String fulfillmentText) {
        this.fulfillmentText = fulfillmentText;
    }

    public List<FulfillmentMessage> getFulfillmentMessages() {
        return fulfillmentMessages;
    }

    public void setFulfillmentMessages(List<FulfillmentMessage> fulfillmentMessages) {
        this.fulfillmentMessages = fulfillmentMessages;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    public List<OutputContext> getOutputContexts() {
        return outputContexts;
    }

    public void setOutputContexts(List<OutputContext> outputContexts) {
        this.outputContexts = outputContexts;
    }

    public FollowupEventInput getFollowupEventInput() {
        return followupEventInput;
    }

    public void setFollowupEventInput(FollowupEventInput followupEventInput) {
        this.followupEventInput = followupEventInput;
    }

    @Override
    public String toString() {
      return new ToStringBuilder(this).append("fulfillmentText", fulfillmentText).append("fulfillmentMessages", fulfillmentMessages).append("source", source).append("payload", payload).append("outputContexts", outputContexts).append("followupEventInput", followupEventInput).toString();
    }

}
