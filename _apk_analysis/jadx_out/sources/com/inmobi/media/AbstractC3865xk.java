package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.xk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC3865xk {
    public static int a(String str) {
        if (bo.a0.W(str, "track_", false, 2, null)) {
            str = str.substring(6);
            tn.p.j(str, "substring(...)");
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
