package com.coder520.POI.common.Utils;

import java.util.Stack;
import java.util.UUID;

public   class uuIdUtil {

    public static String getUuid(){
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }
}
