package com.kaiyuan.dfb.mobilecenter.commons.util;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.LinkedMultiValueMap;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/7/26
 */
public class MobileUtil {

    private static final Logger logger = LoggerFactory.getLogger(MobileUtil.class);

    public static Date date2gmt8(Date date) throws ParseException {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR, c.get(Calendar.HOUR) + 8);
        return c.getTime();
    }

    public static Date date2gmt8(String date) throws Exception {
        LocalDateTime time = LocalDateTime.parse(date, DateTimeFormatter.ISO_DATE_TIME);
        return Date.from(time.toInstant(ZoneOffset.of("-08:00")));
    }

    /**
     * 当天显示时间，否则显示日期
     *
     * @param time
     * @return
     */
    public static String formatTime(@NotNull String time) {
        LocalDate date = LocalDate.parse(time, DateTimeFormatter.ISO_DATE_TIME);
        LocalTime tm = LocalTime.parse(time, DateTimeFormatter.ISO_DATE_TIME).withNano(0);
        return date.equals(LocalDate.now()) ? tm.toString() : date.toString();
    }

    public static String formatTime(@NotNull Date time) {
        return formatTime(dateToString(time));
    }

    public static String dateToString(@NotNull Date time) {
        LocalDateTime date = LocalDateTime.ofInstant(time.toInstant(), ZoneId.systemDefault()).withNano(0);
        return date.format(DateTimeFormatter.ISO_DATE_TIME);
    }

    /**
     * 将时间格式化
     *
     * @param date
     * @param srcDateFormat
     * @param destFormat
     * @return
     */
    public static String dateFormat(String date, String srcDateFormat, String destFormat) {
        try {
            SimpleDateFormat src = new SimpleDateFormat(srcDateFormat);
            Date d = src.parse(date);
            SimpleDateFormat dest = new SimpleDateFormat(destFormat);
            return dest.format(d);
        } catch (Exception e) {
            logger.error("###日期格式化出错,错误原因:", e);
        }
        return "";
    }

    /**
     * 将时间格式化
     *
     * @param date
     * @param destFormat
     * @return
     */
    public static Date dateFormat(Date date, String destFormat) {
        try {
            SimpleDateFormat src = new SimpleDateFormat(destFormat);
            String d = src.format(date);
            SimpleDateFormat dest = new SimpleDateFormat(destFormat);
            return dest.parse(d);
        } catch (Exception e) {
            logger.error("###日期格式化出错,错误原因:", e);
        }
        return null;
    }

    /**
     * 将时间格式化
     *
     * @param date
     * @param destFormat
     * @return
     */
    public static String dateFormat2Str(Date date, String destFormat) {
        try {
            SimpleDateFormat src = new SimpleDateFormat(destFormat);
            return src.format(date);
        } catch (Exception e) {
            logger.error("###日期格式化出错,错误原因:", e);
        }
        return null;
    }

    /**
     * 乘以1w
     *
     * @param value
     * @return
     */
    public static Long mul1w(String value) {
        BigDecimal aBigDecimal = new BigDecimal(value);
        aBigDecimal = aBigDecimal.multiply(BigDecimal.valueOf(10000L));
        return aBigDecimal.longValue();
    }

    /**
     * 除以1w
     *
     * @param value
     * @return
     */
    public static String div1w(Long value) {
        BigDecimal aBigDecimal = new BigDecimal(value);
        aBigDecimal = aBigDecimal.divide(BigDecimal.valueOf(10000L));
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(aBigDecimal);
    }

    /**
     * 除以1w，返回long
     * @param value
     * @return
     */
    public static long div1wInt(long value){
        return value/10000;
    }

    /**
     * 除以1W
     *
     * @param value
     * @return
     */
    public static String div1w(String value) {
        BigDecimal aBigDecimal = new BigDecimal(value);
        aBigDecimal = aBigDecimal.divide(BigDecimal.valueOf(10000L));
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(aBigDecimal);
    }


    public static String strDiv1w(String strValue) {
        BigDecimal bigDecimal = new BigDecimal(strValue);
        BigDecimal result = bigDecimal.divide(new BigDecimal(10000));
        return decimalFormat(result);
    }

    /**
     * 数字格式化
     *
     * @param decimal
     * @param format
     * @return
     */
    public static String decimalFormat(String decimal, String format) {
        BigDecimal bigDecimal = new BigDecimal(decimal);
        DecimalFormat df = new DecimalFormat(format);
        return df.format(bigDecimal);
    }

    @NotNull
    public static String getQueryString(@NotNull Map<String, String[]> params) {
        String queryString = "";
        for (String key : params.keySet()) {
            String[] values = params.get(key);
            for (String value : values) {
                queryString += key + "=" + value + "&";
            }
        }
        queryString = queryString.substring(0, queryString.length() - 1);
        return queryString;
    }

    @NotNull
    public static LinkedMultiValueMap<String, String> getQueryMap(@NotNull Map<String, String[]> params) {
        Map<String, List<String>> collect = params.entrySet()
                .stream().collect(Collectors.toMap(Map.Entry::getKey, e -> Arrays.asList(e.getValue())));
        return new LinkedMultiValueMap(collect);
    }

    /**
     * 数字格式化成199.00这种模式
     *
     * @param number
     * @return
     */
    public static String decimalFormat(String number) {
        logger.debug("###传入的参数number={}###", number);
        if (NumberUtils.isNumber(number)) {
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            Double d = Double.parseDouble(number);
            return decimalFormat.format(d);
        }
        logger.error("###传入的参数number={}并非数字类型,所以返回了0.00###");
        return "0.00";
    }

    /**
     * 数字格式化成199.00这种模式
     *
     * @param number
     * @return
     */
    public static String decimalFormat(BigDecimal number) {
        logger.debug("###传入的参数number={}###", number);
        return new DecimalFormat("0.00").format(number);
    }

    /**
     * 获取月
     *
     * @param date
     * @param dateFormat
     * @return
     * @throws ParseException
     */
    public static Integer getMonth(String date, String dateFormat) {
        try {
            SimpleDateFormat format = new SimpleDateFormat(dateFormat);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(format.parse(date));
            return calendar.get(Calendar.MONTH) + 1;
        } catch (ParseException e) {
            logger.error("###从日期中获取月失败,错误信息:", e);
            return null;
        }
    }

    /**
     * 获取日
     *
     * @param date
     * @param dateFormat
     * @return
     * @throws ParseException
     */
    public static String getDay(String date, String dateFormat) {
        try {
            SimpleDateFormat format = new SimpleDateFormat(dateFormat);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(format.parse(date));
            return String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
        } catch (ParseException e) {
            logger.error("###从日期中获取当月的天数失败,错误信息:", e);
            return null;
        }
    }

    public static void main(String[] args) {
//        SimpleDateFormat src = new SimpleDateFormat("yyyy-MM-dd");
//        try {
//            Date d = src.parse(null);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        System.out.println(div1w(10000L));
//        System.out.println(getDay("2016-11-12","yyyy-MM-dd"));
//        System.out.println(strDiv1w("192200"));
//        String str=MobileUtil.dateFormat(new Date(),"yyyy-MM-dd").toString();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String str = simpleDateFormat.format(new Date());
        System.out.println("---str---" + str);
    }

}
