package cn.edu.cup.equipment;

import cn.edu.cup.hydraulic.HydraulicUnit;
import cn.edu.cup.hydraulic.HydraulicUnitType;

public class EquipmentFlowmeter extends HydraulicUnit {
    public EquipmentFlowmeter(String s) {
        super(s);
        setHydraulicUnitType(HydraulicUnitType.Flowmeter);
        setName(getHydraulicUnitType().toString());
    }
}
