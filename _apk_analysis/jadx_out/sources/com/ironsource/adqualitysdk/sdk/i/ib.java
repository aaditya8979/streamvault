package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.Cif;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class ib {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f2471;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ig f2472;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Cif f2473;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Context f2474;

    public ib(Context context, String str, String str2) {
        this.f2474 = context.getApplicationContext();
        this.f2471 = str2;
        this.f2472 = new ig(this.f2474, str);
        this.f2473 = new Cif(id.f2475, this.f2474.getPackageName(), ik.m6582(this.f2474), this.f2471);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m6533(String str) {
        try {
            this.f2472.m6559(str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m6534(String str) {
        try {
            String strM6560 = this.f2472.m6560(str);
            if (strM6560 == null || TextUtils.isEmpty(strM6560)) {
                return strM6560;
            }
            try {
                return this.f2473.m6553(strM6560);
            } catch (Cif.e unused) {
                return "";
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final HashMap<String, String> m6535(String str, int i10) {
        try {
            HashMap<String, String> mapM6557 = this.f2472.m6557(str, i10);
            HashMap<String, String> map = new HashMap<>();
            for (String str2 : mapM6557.keySet()) {
                String str3 = mapM6557.get(str2);
                if (str3 != null && !TextUtils.isEmpty(str3)) {
                    try {
                        map.put(str2, this.f2473.m6553(str3));
                    } catch (Cif.e unused) {
                    }
                }
            }
            return map;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m6536(String str) {
        try {
            return this.f2472.m6556(str);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m6537(String str, String str2) {
        try {
            this.f2472.m6558(str, this.f2473.m6552(str2));
        } catch (Throwable unused) {
        }
    }
}
