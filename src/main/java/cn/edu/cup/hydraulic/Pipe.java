package cn.edu.cup.hydraulic;

public class Pipe extends HydraulicUnit {
    public Pipe(String s) {
        super(s);
        setHydraulicUnitType(HydraulicUnitType.Pipe);
        setName(getHydraulicUnitType().toString());
    }
}
