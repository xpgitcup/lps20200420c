package cn.edu.cup.equipment;

import cn.edu.cup.hydraulic.HydraulicUnit;
import cn.edu.cup.hydraulic.HydraulicUnitType;

public class EquipmentCentrifugalPump extends HydraulicUnit {
    public EquipmentCentrifugalPump(String s) {
        super(s);
        setHydraulicUnitType(HydraulicUnitType.CentrifugalPump);
        setName(getHydraulicUnitType().toString());
    }
}
