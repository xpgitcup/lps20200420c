package cn.edu.cup.equipment;

import cn.edu.cup.hydraulic.HydraulicUnit;
import cn.edu.cup.hydraulic.HydraulicUnitType;

public class EquipmentRegulatingValve extends HydraulicUnit {
    public EquipmentRegulatingValve(String s) {
        super(s);
        setHydraulicUnitType(HydraulicUnitType.RegulatingValve);
        setName(getHydraulicUnitType().toString());
    }
}
