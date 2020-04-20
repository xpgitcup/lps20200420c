package cn.edu.cup.equipment;

import cn.edu.cup.hydraulic.HydraulicUnit;
import cn.edu.cup.hydraulic.HydraulicUnitType;

public class EquipmentTank extends HydraulicUnit {
    public EquipmentTank(String s) {
        super(s);
        setHydraulicUnitType(HydraulicUnitType.Tank);
        setName(getHydraulicUnitType().toString());
    }
}
