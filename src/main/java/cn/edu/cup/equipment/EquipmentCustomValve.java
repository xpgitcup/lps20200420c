package cn.edu.cup.equipment;

import cn.edu.cup.hydraulic.HydraulicUnit;
import cn.edu.cup.hydraulic.HydraulicUnitType;

public class EquipmentCustomValve extends HydraulicUnit {
    public EquipmentCustomValve(String s) {
        super(s);
        setHydraulicUnitType(HydraulicUnitType.CustomValve);
        setName(getHydraulicUnitType().toString());
    }
}
