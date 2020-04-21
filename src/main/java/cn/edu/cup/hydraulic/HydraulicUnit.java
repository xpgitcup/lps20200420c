package cn.edu.cup.hydraulic;

import cn.edu.cup.data.CustomObject;
import cn.edu.cup.equipment.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class HydraulicUnit extends CustomObject {

    private HydraulicUnitType hydraulicUnitType;
    private List<HydraulicUnit> hydralicChildren;

    public HydraulicUnit(String s) {
        super();
        hydraulicUnitType = HydraulicUnitType.Undefined;
        setModel(s);
        hydralicChildren = new ArrayList<>();
    }

    public void updateChildren() {
        String childrenString = "";
        for (int i = 0; i < getHydralicChildren().size(); i++) {
            childrenString += getHydralicChildren().get(i).toString();
            if (i < getHydralicChildren().size() - 1) {
                childrenString += " ";
            }
        }
        getRawData().getDataItems().get("子节点列表").setValueString(childrenString);
    }

    @Override
    public void importFromFile() {
        super.importFromFile();
        String[] children = getChildren();
        if ((children != null) && (children.length > 1)) {
            processChildren(children);
        }
    }

    private void processChildren(String[] children) {
        for (String e : children) {
            logger.log(Level.INFO, "创建：" + e);
            hydralicChildren.add(createHydraulicUnit(e));
        }
    }

    private HydraulicUnit createHydraulicUnit(String e) {
        String[] config = e.split(":");
        HydraulicUnitType hydraulicUnitType = HydraulicUnitType.valueOf(config[0]);
        HydraulicUnit hydraulicUnit = null;
        switch (hydraulicUnitType) {
            case Undefined:
                break;
            case Pipeline:
                hydraulicUnit = new Pipeline(config[1]);
                break;
            case Station:
                hydraulicUnit = new Station(config[1]);
                break;
            case Pipe:
                hydraulicUnit = new Pipe(config[1]);
                break;
            case Source:
                hydraulicUnit = new EquipmentSource(config[1]);
                break;
            case Sink:
                hydraulicUnit = new EquipmentSink(config[1]);
                break;
            case IdealPump:
                hydraulicUnit = new EquipmentIdealPump(config[1]);
                break;
            case Pump:
                hydraulicUnit = new EquipmentPump(config[1]);
                break;
            case CentrifugalPump:
                hydraulicUnit = new EquipmentCentrifugalPump(config[1]);
                break;
            case ReciprocatingPump:
                hydraulicUnit = new EquipmentReciprocatingPump(config[1]);
                break;
            case CustomValve:
                hydraulicUnit = new EquipmentCustomValve(config[1]);
                break;
            case RegulatingValve:
                hydraulicUnit = new EquipmentRegulatingValve(config[1]);
                break;
            case CutOffValve:
                hydraulicUnit = new EquipmentCutOffValve(config[1]);
                break;
            case PressureReliefValve:
                hydraulicUnit = new EquipmentPressureReliefValve(config[1]);
                break;
            case SafetyValve:
                hydraulicUnit = new EquipmentSafetyValve(config[1]);
                break;
            case ReliefValve:
                hydraulicUnit = new EquipmentReliefValve(config[1]);
                break;
            case Heater:
                hydraulicUnit = new EquipmentHeater(config[1]);
                break;
            case Flowmeter:
                hydraulicUnit = new EquipmentFlowmeter(config[1]);
                break;
            case Tank:
                hydraulicUnit = new EquipmentTank(config[1]);
                break;
            default:
                break;
        }

        if (hydraulicUnit != null) {
            hydraulicUnit.setDataPath(getDataPath());
            hydraulicUnit.importFromFile();
        }

        return hydraulicUnit;
    }

    @Override
    public String getDataFileName() {
        return getDataPath() + "/" + getModel() + "." + getHydraulicUnitType().toString() + ".json";
    }

    @Override
    public void updateProperties() {}

    public HydraulicUnitType getHydraulicUnitType() {
        return hydraulicUnitType;
    }

    public List<HydraulicUnit> getHydralicChildren() {
        return hydralicChildren;
    }

    protected void setHydraulicUnitType(HydraulicUnitType hydraulicUnitType) {
        this.hydraulicUnitType = hydraulicUnitType;
    }
}
