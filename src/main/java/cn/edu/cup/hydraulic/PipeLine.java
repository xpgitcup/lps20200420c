package cn.edu.cup.hydraulic;

public class PipeLine extends HydraulicUnit {

    public PipeLine(String s) {
        super(s);
        setHydraulicUnitType(HydraulicUnitType.PipeLine);
        setName(getHydraulicUnitType().toString());
    }

}
