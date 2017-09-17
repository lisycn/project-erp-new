package utils;

import java.util.Collection;

public class CommonUtils {

	public static final Integer ACCOUNT_MASTER = 1;

	public static boolean isListNullOrEmpty(Collection data) {
        return (data == null || data.isEmpty());
    }

    public static boolean isObjectNullOrEmpty(Object value) {
        return (value == null || (value instanceof String ? (((String) value).isEmpty() || "".equals(((String) value).trim()) || "null".equals(value) || "undefined".equals(value)) : false));
    }
    
}