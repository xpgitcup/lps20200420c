package cn.edu.cup.data;

public class DataItem {

    private DataValueType dataValueType;
    private String unit;
    private String valueString;

    public DataItem(DataValueType dataValueType, String unit, String valueString) {
        this.dataValueType = dataValueType;
        this.unit = unit;
        this.valueString = valueString;
    }

    public DataValueType getDataValueType() {
        return dataValueType;
    }

    public void setDataValueType(DataValueType dataValueType) {
        this.dataValueType = dataValueType;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getValueString() {
        return valueString;
    }

    public void setValueString(String valueString) {
        this.valueString = valueString;
    }
}
