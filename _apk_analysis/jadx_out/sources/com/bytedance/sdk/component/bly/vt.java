package com.bytedance.sdk.component.bly;

import com.bytedance.sdk.component.utils.ko;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class vt {
    public static boolean ouw(List<String> list, String str) {
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                try {
                } catch (Throwable th2) {
                    ko.yu(th2.toString());
                }
                if (Pattern.matches(it.next(), str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
