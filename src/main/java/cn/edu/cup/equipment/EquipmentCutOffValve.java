package cn.edu.cup.equipment;

import cn.edu.cup.hydraulic.HydraulicUnit;
import cn.edu.cup.hydraulic.HydraulicUnitType;

public class EquipmentCutOffValve extends HydraulicUnit {
    public EquipmentCutOffValve(String s) {
        super(s);
        setHydraulicUnitType(HydraulicUnitType.CutOffValve);
        setName(getHydraulicUnitType().toString());
    }
}
