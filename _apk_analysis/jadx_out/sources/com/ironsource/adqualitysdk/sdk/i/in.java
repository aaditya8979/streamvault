package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class in {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f2598 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2599 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2600 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f2601;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2602;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Map<String, Integer> f2603;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2604;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Map<String, Integer> f2605;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Map<String, Object> f2606;

    static {
        m6588();
        f2606 = new HashMap();
        f2603 = new HashMap();
        f2605 = new HashMap();
        int i10 = f2600 + 87;
        f2599 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m6586(Context context, String str, JSONObject jSONObject, Object... objArr) {
        ij.m6573(context).m6578(new Intent(str).putExtra(ih.f2517, jSONObject.toString()));
        int i10 = f2600 + 107;
        f2599 = i10 % 128;
        if ((i10 % 2 != 0 ? 'Q' : '\\') == '\\') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6587(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f3014) {
            char[] cArr2 = new char[cArr.length];
            n.f3013 = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i11 = n.f3013;
                if (i11 < cArr.length) {
                    cArr3[0] = cArr[i11];
                    cArr3[1] = cArr[i11 + 1];
                    int i12 = 58224;
                    for (int i13 = 0; i13 < 16; i13++) {
                        char c10 = cArr3[1];
                        char c11 = cArr3[0];
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2598)) ^ ((c11 >>> 5) + f2601)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2602) ^ ((c12 + i12) ^ ((c12 << 4) + f2604))));
                        i12 -= 40503;
                    }
                    int i14 = n.f3013;
                    cArr2[i14] = cArr3[0];
                    cArr2[i14 + 1] = cArr3[1];
                    n.f3013 = i14 + 2;
                } else {
                    str2 = new String(cArr2, 0, i10);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m6588() {
        f2598 = (char) 49744;
        f2602 = (char) 42214;
        f2601 = (char) 16025;
        f2604 = (char) 21861;
    }
}
