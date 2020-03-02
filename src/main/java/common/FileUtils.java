package common;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 文件处理类
 *
 * @author : Narcssus
 * @date : 2020/3/2 21:27
 */
@Slf4j
public class FileUtils {


    public static void write(String filePath, String fileContent) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            File file = new File(filePath);
            File dir = file.getParentFile();
            if (!dir.exists() && !dir.mkdirs()) {
                log.error("创建文件目录失败,dir:{}", dir.getAbsolutePath());
                return;
            }
            if (!file.exists() && !file.createNewFile()) {
                log.error("创建文件失败,file:{}", file.getAbsolutePath());
                return;
            }
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(fileContent);
        } catch (IOException e) {
            log.error("写入文件失败", e);
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                log.error("关闭文件流失败", e);
            }
        }
    }

    /**
     * 删除指定位置的文件，禁止删除整个目录
     *
     * @param filePath 文件路径
     */
    public static void delete(String filePath) {
        File file = new File(filePath);
        if (file.isFile()) {
            if (!file.delete()) {
                log.error("文件删除失败，file:{}", filePath);
            }
        } else {
            log.error("请勿调用此方法删除目录");
        }
    }


}
