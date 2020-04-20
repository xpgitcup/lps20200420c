package cn.edu.cup.equipment;

import cn.edu.cup.hydraulic.HydraulicUnit;
import cn.edu.cup.hydraulic.HydraulicUnitType;

public class EquipmentReciprocatingPump extends HydraulicUnit {
    public EquipmentReciprocatingPump(String s) {
        super(s);
        setHydraulicUnitType(HydraulicUnitType.ReciprocatingPump);
        setName(getHydraulicUnitType().toString());
    }
}
