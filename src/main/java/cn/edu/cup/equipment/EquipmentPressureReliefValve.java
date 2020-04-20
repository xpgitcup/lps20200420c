package cn.edu.cup.equipment;

import cn.edu.cup.hydraulic.HydraulicUnit;
import cn.edu.cup.hydraulic.HydraulicUnitType;

public class EquipmentPressureReliefValve extends HydraulicUnit {
    public EquipmentPressureReliefValve(String s) {
        super(s);
        setHydraulicUnitType(HydraulicUnitType.PressureReliefValve);
        setName(getHydraulicUnitType().toString());
    }
}
