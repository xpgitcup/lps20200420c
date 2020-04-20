package cn.edu.cup.equipment;

import cn.edu.cup.hydraulic.HydraulicUnit;
import cn.edu.cup.hydraulic.HydraulicUnitType;

public class EquipmentIdealPump extends HydraulicUnit {
    public EquipmentIdealPump(String s) {
        super(s);
        setHydraulicUnitType(HydraulicUnitType.IdealPump);
        setName(getHydraulicUnitType().toString());
    }
}
