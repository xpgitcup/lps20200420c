package cn.edu.cup.lps;

import cn.edu.cup.hydraulic.PipeLine;

import java.util.Arrays;

public class LpsMain {

    public static void main(String[] args) {
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("LpsMain.main");
        System.out.println("Hello world.");

        String dataPath = "e:/temp/test20200419B";
        String dataFileName = "格拉线";

        // 创建
        PipeLine pipeLine = new PipeLine(dataFileName);
        pipeLine.setDataPath(dataPath);
        pipeLine.importFromFile();

        System.out.println("获取：\"" + pipeLine.getModel() + "\"数据.");
    }
}
