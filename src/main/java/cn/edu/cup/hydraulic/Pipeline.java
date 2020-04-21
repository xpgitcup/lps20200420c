package cn.edu.cup.hydraulic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pipeline extends HydraulicUnit {

    public Pipeline(String s) {
        super(s);
        setHydraulicUnitType(HydraulicUnitType.Pipeline);
        setName(getHydraulicUnitType().toString());
    }

    @Override
    public void exportToFile() {
        super.exportToFile();
        for (HydraulicUnit e: getHydralicChildren()) {
            e.exportToFile();
        }
    }

    public void fillSampleData(int k) {
        for (HydraulicUnit e: getHydralicChildren()) {
            if (e instanceof Pipe) {
                ((Pipe) e).fillSampleProfile(k);
            }
        }
    }

    public void autoCreatePipe() {
        int n = getHydralicChildren().size();
        HydraulicUnit e, ee, p;
        Map<HydraulicUnit, HydraulicUnit> pipes = new HashMap<>();
        String pmode;
        String sname;

        for (int i = 0; i < n - 1; i++) {
            e = getHydralicChildren().get(i);
            ee = getHydralicChildren().get(i + 1);
            if ((e instanceof Station) && (ee instanceof Station)) {
                sname = e.getModel();
                pmode = sname + "-" + ee.getModel();
                p = new Pipe(pmode);
                p.setDataPath(getDataPath());
                pipes.put(ee, p);

                System.out.println(p);
            }
        }

        for (HydraulicUnit es : pipes.keySet()) {
            int i = getHydralicChildren().indexOf(es);
            System.out.println("站点：" + es);
            getHydralicChildren().add(i, pipes.get(es));
        }

        System.out.println(getHydralicChildren());

        updateChildren();
    }
}
