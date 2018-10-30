
package ai.api.model.v2.request;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QueryResult {

    @SerializedName("queryText")
    @Expose
    private String queryText;
    @SerializedName("action")
    @Expose
    private String action;
    
    @SerializedName("parameters")
    @Expose
    private Map<String, String> parameters;
    
    @SerializedName("allRequiredParamsPresent")
    @Expose
    private Boolean allRequiredParamsPresent;
    @SerializedName("outputContexts")
    @Expose
    private List<OutputContext> outputContexts = null;
    @SerializedName("intent")
    @Expose
    private Intent intent;
    @SerializedName("intentDetectionConfidence")
    @Expose
    private Integer intentDetectionConfidence;
    @SerializedName("diagnosticInfo")
    @Expose
    private DiagnosticInfo diagnosticInfo;
    @SerializedName("languageCode")
    @Expose
    private String languageCode;

    /**
     * No args constructor for use in serialization
     * 
     */
    public QueryResult() {
    }

    /**
     * 
     * @param languageCode
     * @param intentDetectionConfidence
     * @param outputContexts
     * @param allRequiredParamsPresent
     * @param action
     * @param parameters
     * @param queryText
     * @param diagnosticInfo
     * @param intent
     */
    public QueryResult(String queryText, String action, Map<String, String> parameters, Boolean allRequiredParamsPresent, List<OutputContext> outputContexts, Intent intent, Integer intentDetectionConfidence, DiagnosticInfo diagnosticInfo, String languageCode) {
        super();
        this.queryText = queryText;
        this.action = action;
        this.parameters = parameters;
        this.allRequiredParamsPresent = allRequiredParamsPresent;
        this.outputContexts = outputContexts;
        this.intent = intent;
        this.intentDetectionConfidence = intentDetectionConfidence;
        this.diagnosticInfo = diagnosticInfo;
        this.languageCode = languageCode;
    }

    public String getQueryText() {
        return queryText;
    }

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    

    public Map<String, String> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}

	public Boolean getAllRequiredParamsPresent() {
        return allRequiredParamsPresent;
    }

    public void setAllRequiredParamsPresent(Boolean allRequiredParamsPresent) {
        this.allRequiredParamsPresent = allRequiredParamsPresent;
    }

    public List<OutputContext> getOutputContexts() {
        return outputContexts;
    }

    public void setOutputContexts(List<OutputContext> outputContexts) {
        this.outputContexts = outputContexts;
    }

    public Intent getIntent() {
        return intent;
    }

    public void setIntent(Intent intent) {
        this.intent = intent;
    }

    public Integer getIntentDetectionConfidence() {
        return intentDetectionConfidence;
    }

    public void setIntentDetectionConfidence(Integer intentDetectionConfidence) {
        this.intentDetectionConfidence = intentDetectionConfidence;
    }

    public DiagnosticInfo getDiagnosticInfo() {
        return diagnosticInfo;
    }

    public void setDiagnosticInfo(DiagnosticInfo diagnosticInfo) {
        this.diagnosticInfo = diagnosticInfo;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

}
