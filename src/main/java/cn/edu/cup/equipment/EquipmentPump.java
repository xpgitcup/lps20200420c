package cn.edu.cup.equipment;

import cn.edu.cup.hydraulic.HydraulicUnit;
import cn.edu.cup.hydraulic.HydraulicUnitType;

public class EquipmentPump extends HydraulicUnit {
    public EquipmentPump(String s) {
        super(s);
        setHydraulicUnitType(HydraulicUnitType.Pump);
        setName(getHydraulicUnitType().toString());
    }
}
