package com.inmobi.media;

import android.net.Uri;

/* JADX INFO: loaded from: classes7.dex */
public abstract class G3 {
    public static final boolean a(String str) {
        if (str == null || bo.d0.u0(str)) {
            return false;
        }
        String scheme = Uri.parse(str).getScheme();
        return !(scheme == null || scheme.length() == 0);
    }
}
