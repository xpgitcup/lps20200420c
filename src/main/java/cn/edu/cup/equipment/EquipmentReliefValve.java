package cn.edu.cup.equipment;

import cn.edu.cup.hydraulic.HydraulicUnit;
import cn.edu.cup.hydraulic.HydraulicUnitType;

public class EquipmentReliefValve extends HydraulicUnit {
    public EquipmentReliefValve(String s) {
        super(s);
        setHydraulicUnitType(HydraulicUnitType.ReliefValve);
        setName(getHydraulicUnitType().toString());
    }
}
