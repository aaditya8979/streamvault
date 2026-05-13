package com.inmobi.media;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Kf {
    public static final boolean a(Context context, String str) {
        tn.p.k(str, "permission");
        if (context == null) {
            return false;
        }
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
