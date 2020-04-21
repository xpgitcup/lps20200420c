package cn.edu.cup.hydraulic;

import com.alibaba.fastjson.JSON;

public class Pipe extends HydraulicUnit {

    private double outsideDiameter;
    private double thickness;
    private double length;
    private double[] mileage;
    private double[] altitude;

    public Pipe(String s) {
        super(s);
        setHydraulicUnitType(HydraulicUnitType.Pipe);
        setName(getHydraulicUnitType().toString());
    }

    @Override
    protected void setupRawData() {
        super.setupRawData();
        getRawData().newScalar("外径", "mm", "600");
        getRawData().newScalar("壁厚", "mm", "8");
        getRawData().newScalar("长度", "km", "1");
        getRawData().newVector("里程", "km");
        getRawData().newVector("高程", "m");
    }

    public void updateProperties() {
        outsideDiameter = getKeyDouble("外径");
        thickness = getKeyDouble("壁厚");
        length = getKeyDouble("长度");
    }

    public void exportProperties() {
        setKeyValue("里程", JSON.toJSONString(mileage));
        setKeyValue("高程", JSON.toJSONString(altitude));
    }

    public void fillSampleProfile(int k) {
        mileage = null;
        mileage = new double[k];
        altitude = null;
        altitude = new double[k];

        double dx = length / (k - 1);
        for (int i = 0; i < k; i++) {
            mileage[i] = i * dx;
            altitude[i] = 100 * Math.random();
        }

        System.out.println(JSON.toJSONString(mileage));
        System.out.println(JSON.toJSONString(altitude));

        exportProperties();
    }

    public double getOutsideDiameter() {
        return outsideDiameter;
    }

    public double getThickness() {
        return thickness;
    }

    public double getLength() {
        return length;
    }

    public double[] getMileage() {
        return mileage;
    }

    public double[] getAltitude() {
        return altitude;
    }
}
