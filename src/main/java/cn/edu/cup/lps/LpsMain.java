package cn.edu.cup.lps;

import cn.edu.cup.hydraulic.Pipeline;

import java.util.Arrays;

public class LpsMain {

    public static void main(String[] args) {

        System.out.println("LpsMain.main");

        String dataPath = "e:/temp/test20200419B";
        String dataFileName = "格拉线";

        // 创建
        Pipeline pipeLine = new Pipeline(dataFileName);
        pipeLine.setDataPath(dataPath);
        pipeLine.importFromFile();
        pipeLine.autoCreatePipe();

        System.out.println("获取：\"" + pipeLine.getModel() + "\"数据 ok.");

        pipeLine.setModel("格拉线副本");
        pipeLine.exportToFile();

    }
}
