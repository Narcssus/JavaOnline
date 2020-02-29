package service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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


    public static final String BASE_PATH = "D:\\";


    public static boolean compiler(String filePath) {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int result = compiler.run(null, null, null, filePath);
        return result == 0;
    }

    public static void exec(String className, Object... args) {
        //通过反射运行编译好的类
        try {
            URL url = new URL("file:/" + BASE_PATH);
            URLClassLoader loader = new URLClassLoader(new URL[]{url});
            Class c = loader.loadClass(className);
            Object o = c.newInstance();
            //调用加载类的main方法
            Method m = c.getMethod("twoSum", int[].class, int.class);
            Object res = m.invoke(o, args);

//            Method m = c.getMethod("main", String[].class);
//            Object res = m.invoke(null, (Object)new String[]{});

            System.out.println(JSON.toJSON(res));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {


        //通过字符串动态编译:将字符串存储成一个临时文件(io流)，然后调用动态编译方法
//        String str="public class Hi {public static void main(String[] args){System.out.println(\"HaHa,sxt!\");}}";

        String className = "Solution";

        boolean result = compiler(BASE_PATH + className + ".java");
        System.out.println(result);

        //用于传递输入输出
        JSONObject input = new JSONObject();
        input.put("key", "value123");
        int[] nums = new int[]{1, 2, 3};
        int target = 3;
        exec(className, nums, target);

    }


}
