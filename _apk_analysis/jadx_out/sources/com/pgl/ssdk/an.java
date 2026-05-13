package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import com.mgs.carparking.dbtable.AdNumShowEntry;

/* JADX INFO: loaded from: classes10.dex */
public class an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f51345a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f51346b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f51347c = "api16-access-ttp.tiktokpangle.us";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f51348d = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f51349e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f51350f = "";

    public static String a() {
        return f51345a == 1 ? "VA" : "SG";
    }

    public static String a(Context context) {
        if (!TextUtils.isEmpty(f51346b)) {
            return f51346b;
        }
        try {
            if (f51349e == Integer.MIN_VALUE) {
                f51349e = ax.a(context, "domain_index", 0);
            }
            String[] strArr = f51348d;
            return strArr[f51349e % strArr.length];
        } catch (Throwable unused) {
            return f51347c;
        }
    }

    public static void a(int i10) {
        f51345a = i10;
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f51346b = str;
    }

    public static String b() {
        return f51350f;
    }

    public static void b(Context context) {
        if (TextUtils.isEmpty(f51346b)) {
            au.a(AdNumShowEntry.UPDATEINDEX);
            int i10 = f51349e;
            if (i10 >= Integer.MAX_VALUE) {
                f51349e = 0;
                return;
            }
            int i11 = i10 + 1;
            f51349e = i11;
            ax.b(context, "domain_index", i11);
        }
    }

    public static void b(String str) {
        f51350f = str;
    }
}
