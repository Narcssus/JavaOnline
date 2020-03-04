package com.common;

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
     * 删除指定位置的文件或目录
     *
     * @param file 文件
     */
    public static void delete(File file) {
        if (file.isDirectory()) {
            //如果是目录，删除目录下的所有文件
            deleteAllFile(file.listFiles());
        }
        //删除文件
        if (!file.delete()) {
            log.error("文件删除失败，file:{}", file.getAbsolutePath());
        }
    }

    /**
     * 删除指定位置文件夹下的所有文件，不删除本目录
     *
     * @param dirPath 文件夹路径
     */
    public static void deleteDir(String dirPath) {
        File file = new File(dirPath);
        if (file.isDirectory()) {
            //删除文件夹下的所有文件
            deleteAllFile(file.listFiles());
        }
    }

    /**
     * 删除多个文件(包含目录)
     *
     * @param files 文件列表(包含目录)
     */
    public static void deleteAllFile(File[] files) {
        if (files == null || files.length == 0) {
            log.info("删除文件为空");
            return;
        }
        for (File f : files) {
            delete(f);
        }
    }
}
