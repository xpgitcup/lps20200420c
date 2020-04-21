package cn.edu.cup.data;

import java.util.HashMap;
import java.util.Map;

public class RawData {
    private final Map<String, DataItem> dataItems;

    public RawData() {
        this.dataItems = new HashMap<>();
    }

    public Map<String, DataItem> getDataItems() {
        return dataItems;
    }

    public void newChild(String typeNameAndName) {
        newItem("子节点列表", DataValueType.object, "", typeNameAndName);
    }

    public void setValue(String key, String value) {
        dataItems.get(key).setValueString(value);
    }

    public void newVector2D(String key, String unit) {
        newItem(key, DataValueType.vector2D, unit, "0.0, 0.0");
    }

    public void newVector2D(String key, String unit, String valueString) {
        newItem(key, DataValueType.vector2D, unit, valueString);
    }

    public void newVector(String key, String unit) {
        newItem(key, DataValueType.vector, unit, "0.0");
    }

    public void newVector(String key, String unit, String valueString) {
        newItem(key, DataValueType.vector, unit, valueString);
    }

    public void newScalar(String key, String unit, String valueString) {
        newItem(key, DataValueType.scalar, unit, valueString);
    }

    public void newScalar(String key, String unit) {
        newItem(key, DataValueType.scalar, unit, "0.0");
    }

    public void newItem(String key, DataValueType dataValueType, String unit, String valueString) {
        dataItems.put(key, new DataItem(dataValueType, unit, valueString));
    }

}
