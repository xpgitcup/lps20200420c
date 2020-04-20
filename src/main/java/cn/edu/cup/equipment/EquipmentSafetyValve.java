package cn.edu.cup.equipment;

import cn.edu.cup.hydraulic.HydraulicUnit;
import cn.edu.cup.hydraulic.HydraulicUnitType;

public class EquipmentSafetyValve extends HydraulicUnit {
    public EquipmentSafetyValve(String s) {
        super(s);
        setHydraulicUnitType(HydraulicUnitType.SafetyValve);
        setName(getHydraulicUnitType().toString());
    }
}
