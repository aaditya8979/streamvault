package com.inmobi.media;

import android.util.Base64;
import android.util.Log;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes9.dex */
public abstract class X5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f26578a = 0;

    public static String a(String str, byte[] bArr) {
        byte[] bArrDoFinal;
        tn.p.k(str, "data");
        tn.p.j("X5", "TAG");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            tn.p.j(cipher, "getInstance(...)");
            cipher.init(1, secretKeySpec);
            byte[] bytes = str.getBytes(bo.c.f5639b);
            tn.p.j(bytes, "getBytes(...)");
            bArrDoFinal = cipher.doFinal(bytes);
        } catch (Throwable th2) {
            Log.d("X5", "SDK encountered unexpected error in getting encrypted AES bytes; " + th2.getMessage());
            bArrDoFinal = null;
        }
        byte[] bArrEncode = Base64.encode(bArrDoFinal, 2);
        tn.p.j(bArrEncode, "encode(...)");
        String str2 = new String(bArrEncode, bo.c.f5639b);
        tn.p.j("X5", "TAG");
        return str2;
    }

    public static byte[] a(String str) {
        int i10;
        if (str != null) {
            int length = str.length() % 4;
            i10 = length + ((((length ^ 4) & ((-length) | length)) >> 31) & 4);
        } else {
            i10 = 0;
        }
        String strValueOf = String.valueOf(str != null ? bo.f0.D1(str).toString() : null);
        for (int i11 = 0; i11 < i10; i11++) {
            strValueOf = ((Object) strValueOf) + "=";
        }
        byte[] bytes = strValueOf.getBytes(bo.c.f5639b);
        tn.p.j(bytes, "getBytes(...)");
        return Base64.decode(bytes, 2);
    }
}
