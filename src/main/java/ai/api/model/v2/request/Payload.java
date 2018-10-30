
package ai.api.model.v2.request;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Payload {

    @SerializedName("isInSandbox")
    @Expose
    private Boolean isInSandbox;
    @SerializedName("surface")
    @Expose
    private Surface surface;
    @SerializedName("inputs")
    @Expose
    private List<Input> inputs = null;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("conversation")
    @Expose
    private Conversation conversation;
    @SerializedName("availableSurfaces")
    @Expose
    private List<AvailableSurface> availableSurfaces = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Payload() {
    }

    /**
     * 
     * @param surface
     * @param inputs
     * @param isInSandbox
     * @param conversation
     * @param user
     * @param availableSurfaces
     */
    public Payload(Boolean isInSandbox, Surface surface, List<Input> inputs, User user, Conversation conversation, List<AvailableSurface> availableSurfaces) {
        super();
        this.isInSandbox = isInSandbox;
        this.surface = surface;
        this.inputs = inputs;
        this.user = user;
        this.conversation = conversation;
        this.availableSurfaces = availableSurfaces;
    }

    public Boolean getIsInSandbox() {
        return isInSandbox;
    }

    public void setIsInSandbox(Boolean isInSandbox) {
        this.isInSandbox = isInSandbox;
    }

    public Surface getSurface() {
        return surface;
    }

    public void setSurface(Surface surface) {
        this.surface = surface;
    }

    public List<Input> getInputs() {
        return inputs;
    }

    public void setInputs(List<Input> inputs) {
        this.inputs = inputs;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }

    public List<AvailableSurface> getAvailableSurfaces() {
        return availableSurfaces;
    }

    public void setAvailableSurfaces(List<AvailableSurface> availableSurfaces) {
        this.availableSurfaces = availableSurfaces;
    }

}
