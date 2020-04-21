package cn.edu.cup.equipment;

import cn.edu.cup.hydraulic.HydraulicUnit;
import cn.edu.cup.hydraulic.HydraulicUnitType;

public class EquipmentSource extends HydraulicUnit {
    public EquipmentSource(String s) {
        super(s);
        setHydraulicUnitType(HydraulicUnitType.Source);
        setName(getHydraulicUnitType().toString());
    }

    @Override
    protected void setupRawData() {
        super.setupRawData();

    }
}
