package com.unity3d.ads.core.utils;

import bo.z;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetMemoryValueFromString.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetMemoryValueFromStringKt {
    public static final long getMemoryValueFromString(@Nullable String str) {
        Long lT;
        if (str == null) {
            return -1L;
        }
        Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
        String strGroup = null;
        while (matcher.find()) {
            strGroup = matcher.group(1);
        }
        if (strGroup == null || (lT = z.t(strGroup)) == null) {
            return -1L;
        }
        return lT.longValue();
    }
}
