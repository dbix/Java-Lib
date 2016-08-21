package com.Bixler;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by derekbixler on 4/8/16.
 */
public class Strings {

    public static String exceptionToString(Exception e) {
        StringWriter s = new StringWriter();
        e.printStackTrace(new PrintWriter(s));
        return s.toString();
    }

    public static String[] mergeStringArrays(String array1[], String array2[]) {
        if (array1 == null || array1.length == 0)
            return array2;
        if (array2 == null || array2.length == 0)
            return array1;
        List array1List = Arrays.asList(array1);
        List array2List = Arrays.asList(array2);
        List result = new ArrayList(array1List);
        List tmp = new ArrayList(array1List);
        tmp.retainAll(array2List);
        result.removeAll(tmp);
        result.addAll(array2List);
        return ((String[]) result.toArray(new String[result.size()]));
    }

    public static String[] trim(String[] values) {
        for (int i = 0, length = values.length; i < length; i++)
            if (values[i] != null)
                values[i] = values[i].trim();
        return values;

    }

    public static String nonNull(String s) {
        if (s == null)
            return "";
        else
            return s;
    }

}
