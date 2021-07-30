package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期格式的处理
 */
public class DateUtil {
    //当前日期格式化
    public static String getCurrentDate(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyytMMddhhmmss");
        return sdf.format(date);
    }
    //带有格式的字符串进行格式化
    public static Date formatString(String str, String format) throws ParseException {
        if(StringUtil.isEmpty(str)){
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(str);
    }
}
