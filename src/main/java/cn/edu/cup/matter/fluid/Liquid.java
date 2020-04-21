package cn.edu.cup.matter.fluid;

import cn.edu.cup.data.CustomObject;
import cn.edu.cup.matter.CustomMatter;
import cn.edu.cup.matter.MatterType;

public class Liquid extends CustomMatter {

    public Liquid(String s) {
        super(s);
        setMatterType(MatterType.Liquid);
    }

    @Override
    protected void setupRawData() {
        super.setupRawData();
        getRawData().newVector("密度", "kg/m3", "1000.0");
        getRawData().newVector("粘度", "Pa.s", "1e-3");
        getRawData().newVector("压缩系数", "MPa", "1e-3");
        getRawData().newVector("饱和蒸汽压", "MPa", "0.004");
        getRawData().newVector("热容", "j/(kg.k)", "1852");
    }
}
