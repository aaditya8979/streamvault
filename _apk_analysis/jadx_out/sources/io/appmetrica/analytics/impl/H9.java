package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes6.dex */
public abstract class H9 {
    public static final B9 a(int i10, String str) {
        byte[] bytes;
        B9 b92 = new B9();
        b92.f65028a = i10;
        if (str == null || (bytes = str.getBytes(bo.c.f5639b)) == null) {
            bytes = b92.f65029b;
        }
        b92.f65029b = bytes;
        return b92;
    }
}
