
package ai.api.model.v2.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;




public class AIWebhookRequest {

    @SerializedName("responseId")
    @Expose
    private String responseId;
    @SerializedName("queryResult")
    @Expose
    private QueryResult queryResult;
    @SerializedName("originalDetectIntentRequest")
    @Expose
    private OriginalDetectIntentRequest originalDetectIntentRequest;
    @SerializedName("session")
    @Expose
    private String session;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AIWebhookRequest() {
    }

    /**
     * 
     * @param responseId
     * @param session
     * @param queryResult
     * @param originalDetectIntentRequest
     */
    public AIWebhookRequest(String responseId, QueryResult queryResult, OriginalDetectIntentRequest originalDetectIntentRequest, String session) {
        super();
        this.responseId = responseId;
        this.queryResult = queryResult;
        this.originalDetectIntentRequest = originalDetectIntentRequest;
        this.session = session;
    }

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public QueryResult getQueryResult() {
        return queryResult;
    }

    public void setQueryResult(QueryResult queryResult) {
        this.queryResult = queryResult;
    }

    public OriginalDetectIntentRequest getOriginalDetectIntentRequest() {
        return originalDetectIntentRequest;
    }

    public void setOriginalDetectIntentRequest(OriginalDetectIntentRequest originalDetectIntentRequest) {
        this.originalDetectIntentRequest = originalDetectIntentRequest;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

}
