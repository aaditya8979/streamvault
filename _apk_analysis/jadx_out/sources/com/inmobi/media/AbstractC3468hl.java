package com.inmobi.media;

import android.os.Build;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.hl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3468hl {
    public static final C3900z5 a(List list) {
        tn.p.k(list, "<this>");
        return list.size() != 2 ? new C3900z5(0, 0) : new C3900z5(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }

    public static final String a(String str) {
        tn.p.k(str, "url");
        return Build.VERSION.SDK_INT >= 33 ? URLEncoder.encode(str, Charset.defaultCharset()) : URLEncoder.encode(str);
    }
}
