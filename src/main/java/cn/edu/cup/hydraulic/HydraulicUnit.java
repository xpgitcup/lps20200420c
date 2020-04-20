package cn.edu.cup.hydraulic;

import cn.edu.cup.data.CustomObject;

import java.util.List;

public class HydraulicUnit extends CustomObject {

    private HydraulicUnitType hydraulicUnitType;
    private List<HydraulicUnit> hydralicChildren;

    public HydraulicUnit(String s) {
        super();
        hydraulicUnitType = HydraulicUnitType.Undefined;
        setModel(s);
        hydralicChildren = null;
    }

    @Override
    public String getDataFileName() {
        return getDataPath() + "/" + getModel() + "." + getHydraulicUnitType().toString() + ".json";
    }

    public HydraulicUnitType getHydraulicUnitType() {
        return hydraulicUnitType;
    }

    public List<HydraulicUnit> getHydralicChildren() {
        return hydralicChildren;
    }

    protected void setHydraulicUnitType(HydraulicUnitType hydraulicUnitType) {
        this.hydraulicUnitType = hydraulicUnitType;
    }
}
