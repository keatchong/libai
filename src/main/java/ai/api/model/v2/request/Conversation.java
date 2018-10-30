
package ai.api.model.v2.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Conversation {

    @SerializedName("conversationId")
    @Expose
    private String conversationId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("conversationToken")
    @Expose
    private String conversationToken;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Conversation() {
    }

    /**
     * 
     * @param conversationToken
     * @param conversationId
     * @param type
     */
    public Conversation(String conversationId, String type, String conversationToken) {
        super();
        this.conversationId = conversationId;
        this.type = type;
        this.conversationToken = conversationToken;
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getConversationToken() {
        return conversationToken;
    }

    public void setConversationToken(String conversationToken) {
        this.conversationToken = conversationToken;
    }

}
