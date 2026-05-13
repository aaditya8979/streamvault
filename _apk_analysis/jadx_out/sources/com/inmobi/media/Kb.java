package com.inmobi.media;

import android.util.Log;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Kb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static byte f25807a;

    public static final void a(byte b10, String str, String str2) {
        tn.p.k(str, "tag");
        if (str2 == null) {
            return;
        }
        if (b10 == 1) {
            byte b11 = f25807a;
            if (2 == b11 || 1 == b11 || 3 == b11) {
                Log.e("[InMobi]", str2);
                return;
            }
            return;
        }
        if (b10 != 2) {
            if (b10 == 3) {
                a(str, str2);
            }
        } else {
            byte b12 = f25807a;
            if (2 == b12 || 3 == b12) {
                Log.d("[InMobi]", str2);
            }
        }
    }

    public static void a(String str, String str2) {
        if (str2.length() <= 4000) {
            Log.d(str, str2);
            return;
        }
        String strSubstring = str2.substring(0, 4000);
        tn.p.j(strSubstring, "substring(...)");
        Log.d(str, strSubstring);
        String strSubstring2 = str2.substring(4000);
        tn.p.j(strSubstring2, "substring(...)");
        a(str, strSubstring2);
    }
}
