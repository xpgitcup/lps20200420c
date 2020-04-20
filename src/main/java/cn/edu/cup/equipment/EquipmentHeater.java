package cn.edu.cup.equipment;

import cn.edu.cup.hydraulic.HydraulicUnit;
import cn.edu.cup.hydraulic.HydraulicUnitType;

public class EquipmentHeater extends HydraulicUnit {
    public EquipmentHeater(String s) {
        super(s);
        setHydraulicUnitType(HydraulicUnitType.Heater);
        setName(getHydraulicUnitType().toString());
    }
}
