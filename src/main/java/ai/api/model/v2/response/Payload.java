package ai.api.model.v2.response;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Payload implements Serializable
{

    @SerializedName("google")
    @Expose
    private Google google;
    @SerializedName("facebook")
    @Expose
    private Facebook facebook;
    @SerializedName("slack")
    @Expose
    private Slack slack;
    private final static long serialVersionUID = -3694225850552987684L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Payload() {
    }

    /**
     * 
     * @param google
     * @param facebook
     * @param slack
     */
    public Payload(Google google, Facebook facebook, Slack slack) {
        super();
        this.google = google;
        this.facebook = facebook;
        this.slack = slack;
    }

    public Google getGoogle() {
        return google;
    }

    public void setGoogle(Google google) {
        this.google = google;
    }

    public Facebook getFacebook() {
        return facebook;
    }

    public void setFacebook(Facebook facebook) {
        this.facebook = facebook;
    }

    public Slack getSlack() {
        return slack;
    }

    public void setSlack(Slack slack) {
        this.slack = slack;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("google", google).append("facebook", facebook).append("slack", slack).toString();
    }

}
