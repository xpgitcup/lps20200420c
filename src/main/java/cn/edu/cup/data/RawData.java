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

    public void newItem(String key, DataValueType dataValueType, String isoUnit, String defaultString) {
        dataItems.put(key, new DataItem(dataValueType, isoUnit, defaultString));
    }
}
