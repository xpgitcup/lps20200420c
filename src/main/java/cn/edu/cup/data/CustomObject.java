package cn.edu.cup.data;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CustomObject {

    private String dataPath;
    private RawData rawData;

    /**
     * 定义日志记录器
     */
    public static final Logger logger = Logger.getLogger("LPS 2020");

    /**
     * 构造函数
     */
    public CustomObject() {
        rawData = new RawData();
        setupRawData();
    }

    protected void setupRawData() {
        rawData.newItem("名称", DataValueType.scalar, "", "通用对象");
        rawData.newItem("型号", DataValueType.scalar, "", "");
        rawData.newChild("");
    }

    public String toString() {
        return getName() + ":" + getModel();
    }

    public abstract String getDataFileName();

    public void exportToFile() {
        String fileName = getDataFileName();
        logger.log(Level.INFO, "export to file: {0}...", fileName);
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            writeToFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void importFromFile() {
        String fileName = getDataFileName();
        logger.log(Level.INFO, "import from file: {0}...", fileName);

        File file = new File(fileName);
        if (file.exists()) {
            logger.log(Level.INFO, "发现文件: {0}...", fileName);
            RawData items = readFromFile(file);
            // 保存数据
            rawData.getDataItems().putAll(items.getDataItems());
            // 对比关键字
            if (!items.getDataItems().keySet().equals(rawData.getDataItems().keySet())) {
                logger.log(Level.INFO, "不一样啊..." + this.getClass().getSimpleName());
                file.delete();
                writeToFile(file);
            }
        } else {
            logger.log(Level.INFO, "创建示例文件: {0}...", fileName);
            writeToFile(file);
        }

    }

    private void writeToFile(File file) {
        try {
            file.createNewFile();
            try (PrintWriter printWriter = new PrintWriter(file, "utf-8")) {
                String rawDataString = JSON.toJSONString(getRawData(), SerializerFeature.PrettyFormat);
                printWriter.println(rawDataString);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private RawData readFromFile(File file) {
        InputStreamReader inputStreamReader;
        BufferedReader reader = null;
        String laststr = "";
        RawData items = null;

        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            reader = new BufferedReader(inputStreamReader);
            String tempString = null;
            while ((tempString = reader.readLine()) != null) {
                laststr += tempString;
            }
            reader.close();

            items = JSON.parseObject(laststr, RawData.class);
//            System.out.println("读入的原始数据：");
//            System.out.println(laststr);
//            System.out.println("转化后：");
//            System.out.println(items);
//            System.out.println("转化后--JSON：");
//            System.out.println(JSON.toJSONString(items));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return items;
    }

    public String[] getChildren() {
        String item = rawData.getDataItems().get("子节点列表").getValueString();
        if ((item == null) || item.isEmpty()) {
            return null;
        } else {
            return item.split(" ");
        }
    }

    public void setName(String s) {
        rawData.getDataItems().get("名称").setValueString(s);
    }

    public void setModel(String s) {
        rawData.getDataItems().get("型号").setValueString(s);
    }

    public String getName() {
        return rawData.getDataItems().get("名称").getValueString();
    }

    public String getModel() {
        return rawData.getDataItems().get("型号").getValueString();
    }

    public String getDataPath() {
        return dataPath;
    }

    public void setDataPath(String dataPath) {
        this.dataPath = dataPath;
    }

    public RawData getRawData() {
        return rawData;
    }

    public void setRawData(RawData rawData) {
        this.rawData = rawData;
    }

    public static Logger getLogger() {
        return logger;
    }

}
