package util;

public class NavUtil {
    //生成导航代码
    public static String getNavCode(String str){
        StringBuffer navCode = new StringBuffer();
        navCode.append("你现在的位置");
        navCode.append("<a href='index'>首页</a>&nbsp;");
        navCode.append("&gt;");
        navCode.append(str);
        return navCode.toString();
    }
}
