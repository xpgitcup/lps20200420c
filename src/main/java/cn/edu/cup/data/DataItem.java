package cn.edu.cup.data;

public class DataItem {

    private DataValueType dataValueType;
    private String isoUnit;
    private String valueString;

    public DataItem(DataValueType dataValueType, String isoUnit, String valueString) {
        this.dataValueType = dataValueType;
        this.isoUnit = isoUnit;
        this.valueString = valueString;
    }

    public DataValueType getDataValueType() {
        return dataValueType;
    }

    public void setDataValueType(DataValueType dataValueType) {
        this.dataValueType = dataValueType;
    }

    public String getIsoUnit() {
        return isoUnit;
    }

    public void setIsoUnit(String isoUnit) {
        this.isoUnit = isoUnit;
    }

    public String getValueString() {
        return valueString;
    }

    public void setValueString(String valueString) {
        this.valueString = valueString;
    }
}
