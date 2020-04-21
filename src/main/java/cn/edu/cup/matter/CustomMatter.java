package cn.edu.cup.matter;

import cn.edu.cup.data.CustomObject;

public class CustomMatter extends CustomObject {

    private MatterType matterType;

    public CustomMatter(String s) {
        super();
        matterType = MatterType.Undefined;
        setModel(s);
    }

    @Override
    public String getDataFileName() {
        return getDataPath() + "/" + getModel() + "." + getMatterType().toString() + ".json";
    }

    @Override
    public void updateProperties() {

    }

    public MatterType getMatterType() {
        return matterType;
    }

    protected void setMatterType(MatterType matterType) {
        this.matterType = matterType;
    }
}
