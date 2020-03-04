package com.service.impl;

import com.alibaba.fastjson.JSON;
import com.common.FileUtils;
import org.springframework.stereotype.Service;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;


/**
 * @author : Narcssus
 * @date : 2020/2/29 16:27
 */
@Service
@SuppressWarnings("unchecked")
public class CompileServiceImpl {


    private static final String BASE_PATH = "D:\\WorkPlace\\";


    public static boolean compiler(String... filePath) {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int result = compiler.run(null, null, null, filePath);
        return result == 0;
    }


    public static Object exec(String className, Object... args) {
        //通过反射运行编译好的类
        try {
            URL url = new URL("file:/" + BASE_PATH);
            URLClassLoader loader = new URLClassLoader(new URL[]{url});
            Class c = loader.loadClass(className);
            Object o = c.newInstance();
            //调用加载类的main方法
            Method m = c.getMethod("runTest");
            Object res = m.invoke(o, args);

            return res;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        String className = "Solution";

        String filePath = BASE_PATH + className + ".java";
        String classPath = BASE_PATH + className + ".class";

        FileUtils.write(filePath,
                "public class Solution {\n" +
                        "    public int[] twoSum(int[] nums, int target) {\n" +
                        "        for (int i = 0; i < nums.length; i++) {\n" +
                        "            for (int j = i + 1; j < nums.length; j++) {\n" +
                        "                if (nums[j] == target - nums[i]) {\n" +
                        "                    return new int[]{i, j};\n" +
                        "                }\n" +
                        "            }\n" +
                        "        }\n" +
                        "        return null;\n" +
                        "    }\n" +
                        "}\n" +
                        "\n");

        String testPath = BASE_PATH + "TestSet" + ".java";
        String testClassPath = BASE_PATH + "TestSet" + ".class";
        FileUtils.write(testPath,
                "public class TestSet {\n" +
                        "    public String runTest(){\n" +
                        "        int[] nums = new int[]{1, 2, 3};\n" +
                        "        int target = 3;\n" +
                        "        Solution s = new Solution();\n" +
                        "        int[] res = s.twoSum(nums,target);\n" +
                        "        if(res.length == 2){\n" +
                        "            return \"yes\";\n" +
                        "        }\n" +
                        "        return \"no\";\n" +
                        "    }\n" +
                        "}");
        Boolean result = compiler(filePath,testPath);
        System.out.println(result);
        Object res = exec("TestSet");
        System.out.println(JSON.toJSON(res));
        FileUtils.deleteDir(BASE_PATH);
    }


}
