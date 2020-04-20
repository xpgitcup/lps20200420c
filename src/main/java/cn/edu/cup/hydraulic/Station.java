package cn.edu.cup.hydraulic;

public class Station extends HydraulicUnit {

    public Station(String s) {
        super(s);
        setHydraulicUnitType(HydraulicUnitType.Station);
        setName(getHydraulicUnitType().toString());
    }
}
