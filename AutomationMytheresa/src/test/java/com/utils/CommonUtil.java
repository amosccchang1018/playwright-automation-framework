package com.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Description: Common functions
 * @Author: Chi-Chun Chang
 * @Date: 2023/07/22
 */
public class CommonUtil {

    public static String getTimestamp() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
}
