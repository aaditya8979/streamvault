package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final char[] f48155a;

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        tn.p.j(charArray, "toCharArray(...)");
        f48155a = charArray;
    }

    @NotNull
    public static final String a(@NotNull byte[] bArr) {
        tn.p.k(bArr, "<this>");
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f48155a;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }
}
