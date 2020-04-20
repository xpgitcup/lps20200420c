package cn.edu.cup.equipment;

import cn.edu.cup.hydraulic.HydraulicUnit;
import cn.edu.cup.hydraulic.HydraulicUnitType;

public class EquipmentSink extends HydraulicUnit {
    public EquipmentSink(String s) {
        super(s);
        setHydraulicUnitType(HydraulicUnitType.Sink);
        setName(getHydraulicUnitType().toString());
    }
}
