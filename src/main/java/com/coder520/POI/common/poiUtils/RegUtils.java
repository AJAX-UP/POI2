package com.coder520.POI.common.poiUtils;

import org.springframework.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegUtils {
    /**
     * 邮箱
     */
    public static final String EMAIL = "^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$";
    /**
     * 手机号码
     */
    public static final String PHONE = "^(1[3-9]([0-9]{9}))$";
    /**
     * 仅中文
     */
    public static final String CHINESE = "^[\\u4E00-\\u9FA5\\uF900-\\uFA2D]+$";
    /**
     * 整数
     */
    public static final String INTEGER = "^-?[1-9]\\d*$";
    /**
     * 数字
     */
    public static final String NUMBER = "^([+-]?)\\d*\\.?\\d+$";
    /**
     * 正整数
     */
    public static final String INTEGER_POS = "^[1-9]\\d*$";
    /**
     * 浮点数
     */
    public static final String FLOAT = "^([+-]?)\\d*\\.\\d+$";
    /**
     * 正浮点数
     */
    public static final String FLOAT_POS = "^[1-9]\\d*.\\d*|0.\\d*[1-9]\\d*$";
    /**
     * 是否为正整数数字，包括0（00，01非数字）
     */
    public static final String INTEGER_WITH_ZERO_POS = "^(([0-9])|([1-9]([0-9]+)))$";
    /**
     * 是否为整数数字，包括正、负整数，包括0（00，01非数字）
     */
    public static final String NUMBER_WITH_ZERO = "^((-)?(([0-9])|([1-9]([0-9]+))))$";
    /**
     * 是否为数字字符串
     */
    public static final String NUMBER_TEXT = "^([0-9]+)$";
    /**
     * 数字(整数、0、浮点数），可以判断是否金额，也可以是负数
     */
    public static final String NUMBER_ALL = "^((-)?(([0-9])|([1-9][0-9]+))(\\.([0-9]+))?)$";
    /**
     * QQ，5-14位
     */
    public static final String QQ = "^[1-9][0-9]{4,13}$";
    /**
     * IP地址
     */
    public static final String IP = "((?:(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d)\\.){3}(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d))";
    /**
     * 邮编
     */
    public static final String POST_CODE = "[1-9]\\d{5}(?!\\d)";
    /**
     * 普通日期
     */
    public static final String DATE = "^[1-9]\\d{3}-((0[1-9])|(1[0-2]))-((0[1-9])|([1-2][0-9])|(3[0-1]))$";
    /**
     * 复杂日期，不区分闰年的2月
     * 日期格式：2017-10-19
     * 或2017/10/19
     * 或2017.10.19
     * 或2017年10月19日
     * 最大31天的月份：(((01|03|05|07|08|10|12))-((0[1-9])|([1-2][0-9])|(3[0-1])))
     * 最大30天的月份：(((04|06|11))-((0[1-9])|([1-2][0-9])|(30)))
     * 最大29天的月份：(02-((0[1-9])|([1-2][0-9])))
     */
    public static final String DATE_COMPLEX = "^(([1-2]\\d{3})(-|/|.|年)((((01|03|05|07|08|10|12))(-|/|.|月)((0[1-9])|([1-2][0-9])|(3[0-1])))|(((04|06|11))(-|/|.|月)((0[1-9])|([1-2][0-9])|(30)))|(02-((0[1-9])|([1-2][0-9]))))(日)?)$";

    /**
     * 复杂的日期，区分闰年的2月
     * 这个日期校验能区分闰年的2月，格式如下：2017-10-19
     * （见：http://www.jb51.net/article/50905.htm）
     * ^((?!0000)[0-9]{4}-((0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-8])|(0[13-9]|1[0-2])-(29|30)|(0[13578]|1[02])-31)|([0-9]{2}(0[48]|[2468][048]|[13579][26])|(0[48]|[2468][048]|[13579][26])00)-02-29)$
     */
    public static final String DATE_COMPLEX_LEAP_YEAR = "^(?:(?!0000)[0-9]{4}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)-02-29)$";


    /**
     * 正则表达式校验,符合返回True
     * @param regex 正则表达式
     * @param content 校验的内容
     * @return
     */
    public static boolean isMatch(String regex, CharSequence content){
        return Pattern.matches(regex, content);
    }


    /**
     * 校验手机号码
     * @param mobile
     * @return
     */
    public static final boolean isMoblie(String mobile){
        boolean flag = false;
        if (null != mobile && !mobile.trim().equals("") && mobile.trim().length() == 11) {
            Pattern pattern = Pattern.compile(PHONE);
            Matcher matcher = pattern.matcher(mobile.trim());
            flag = matcher.matches();
        }
        return flag;
    }


    /**
     * 校验邮箱
     * @param value
     * @return
     */
    public static final boolean isEmail(String value){
        boolean flag = false;
        if (null != value && !value.trim().equals("")) {
            Pattern pattern = Pattern.compile(EMAIL);
            Matcher matcher = pattern.matcher(value.trim());
            flag = matcher.matches();
        }
        return flag;
    }


    /**
     * 校验密码
     * @param password
     * @return 长度符合返回true，否则为false
     */
    public static final boolean isPassword(String password){
        boolean flag = false;
        if (null != password && !password.trim().equals("")) {
            password = password.trim();
            if(password.length() >= 6 && password.length() <= 30){
                return true;
            }
        }
        return flag;
    }


    /**
     * 校验手机验证码
     * @param value
     * @return 符合正则表达式返回true，否则返回false
     */
    public static final boolean isPhoneValidateCode(String value){
        boolean flag = false;
        if (null != value && !value.trim().equals("")) {
            Pattern pattern = Pattern.compile("^8\\d{5}$");
            Matcher matcher = pattern.matcher(value.trim());
            flag = matcher.matches();
        }
        return flag;
    }


    /**
     * 判断是否全部大写字母
     * @param str
     * @return
     */
    public static boolean isUpperCase(String str){
        if(StringUtils.isEmpty(str)){
            return false;
        }
        String reg = "^[A-Z]$";
        return isMatch(reg,str);
    }


    /**
     * 判断是否全部小写字母
     * @param str
     * @return
     */
    public static boolean isLowercase(String str){
        if(StringUtils.isEmpty(str)){
            return false;
        }
        String reg = "^[a-z]$";
        return isMatch(reg,str);
    }


    /**
     * 是否ip地址
     * @param str
     * @return
     */
    public static boolean isIP(String str){
        if(StringUtils.isEmpty(str)){
            return false;
        }
        return isMatch(IP, str);
    }

    /**
     * 符合返回true，区分30、31天和闰年的2月份（最严格的校验），格式为2017-10-19
     * @param str
     * @return
     */
    public static boolean isDate(String str){
        if(StringUtils.isEmpty(str)){
            return false;
        }
        return isMatch(DATE_COMPLEX_LEAP_YEAR, str);
    }


    /**
     * 简单日期校验，不那么严格
     * @param str
     * @return
     */
    public static boolean isDateSimple(String str){
        if(StringUtils.isEmpty(str)){
            return false;
        }
        return isMatch(DATE, str);
    }


    /**
     * 区分30、31天，但没有区分闰年的2月份
     * @param str
     * @return
     */
    public static boolean isDateComplex(String str){
        if(StringUtils.isEmpty(str)){
            return false;
        }
        return isMatch(DATE_COMPLEX, str);
    }


    /**
     * 判断是否为数字字符串，如0011，10101，01
     * @param str
     * @return
     */
    public static boolean isNumberText(String str){
        if(StringUtils.isEmpty(str)){
            return false;
        }
        return isMatch(NUMBER_TEXT, str);
    }


    /**
     * 判断所有类型的数字，数字(整数、0、浮点数），可以判断是否金额，也可以是负数
     * @param str
     * @return
     */
    public static boolean isNumberAll(String str){
        if(StringUtils.isEmpty(str)){
            return false;
        }
        return isMatch(NUMBER_ALL, str);
    }


    /**
     * 是否为正整数数字，包括0（00，01非数字）
     * @param str
     * @return
     */
    public static boolean isIntegerWithZeroPos(String str){
        if(StringUtils.isEmpty(str)){
            return false;
        }
        return isMatch(INTEGER_WITH_ZERO_POS, str);
    }


    /**
     * 是否为整数，包括正、负整数，包括0（00，01非数字）
     * @param str
     * @return
     */
    public static boolean isIntegerWithZero(String str){
        if(StringUtils.isEmpty(str)){
            return false;
        }
        return isMatch(NUMBER_WITH_ZERO, str);
    }


    /**
     * 符合返回true,QQ，5-14位
     * @param str
     * @return
     */
    public static boolean isQQ(String str){
        if(StringUtils.isEmpty(str)){
            return false;
        }
        return isMatch(QQ, str);
    }


    public static void main(String[] args) {
        System.out.println(isMoblie("13430800244"));
        System.out.println(isMoblie("17730800244"));
        System.out.println(isMoblie("17630800244"));
        System.out.println(isMoblie("14730800244"));
        System.out.println(isMoblie("18330800244"));
        System.out.println(isMoblie("19330800244"));
        System.out.println(isMoblie("1333000244"));
    }
}
