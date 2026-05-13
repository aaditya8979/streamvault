package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes12.dex */
public class a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f51287a = 504;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f51288b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f51289c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f51290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f51291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Context f51292f;

    public static synchronized Object a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return com.pgl.ssdk.ces.a.meta(302, f51292f, bArr);
    }

    public static synchronized String a() {
        if (TextUtils.isEmpty(f51289c)) {
            f51289c = (String) com.pgl.ssdk.ces.a.meta(303, f51292f, null);
        }
        return f51289c;
    }

    public static void a(Context context, String str) {
        if (f51292f == null) {
            f51292f = context;
        }
        int i10 = f51287a;
        if (i10 == 102 || i10 == 202 || i10 == 200) {
            return;
        }
        f51291e = System.currentTimeMillis();
        f51290d = false;
        f51288b = str;
        f51287a = 102;
        ar.b(new ao(context, 301, null));
    }

    public static void b() {
        Context context = f51292f;
        if (context != null) {
            ar.b(new ao(context, 301, null));
            f51287a = 102;
            com.pgl.ssdk.ces.b bVarE = com.pgl.ssdk.ces.b.e();
            if (bVarE != null) {
                bVarE.a("");
            }
        }
    }
}
