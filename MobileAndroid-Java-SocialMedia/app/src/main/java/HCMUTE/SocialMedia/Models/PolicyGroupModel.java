package HCMUTE.SocialMedia.Models;

public class PolicyGroupModel {
    private int id;
    private String groupName;

    public PolicyGroupModel(int id, String groupName) {
        this.id = id;
        this.groupName = groupName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
