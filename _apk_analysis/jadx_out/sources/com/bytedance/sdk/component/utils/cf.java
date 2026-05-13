package com.bytedance.sdk.component.utils;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes4.dex */
public final class cf {
    private static final byte[] ouw = ouw("VP8X");

    public static boolean ouw(byte[] bArr) {
        boolean z10;
        try {
            byte[] bArr2 = ouw;
            if (bArr2 == null || bArr == null || bArr2.length + 12 > bArr.length) {
                z10 = false;
                break;
            }
            for (int i10 = 0; i10 < bArr2.length; i10++) {
                if (bArr[i10 + 12] != bArr2[i10]) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
            if (bArr.length <= 20) {
                return false;
            }
            return z10 && ((bArr[20] & 2) == 2);
        } catch (Throwable th2) {
            ko.ouw("ImageLoadUtils", th2);
            return false;
        }
    }

    private static byte[] ouw(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new byte[1];
        }
    }
}
