package com.mbridge.msdk.util;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBConfiguration;

/* JADX INFO: compiled from: CommonUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Boolean f41166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Boolean f41167b;

    public static boolean a() {
        if (f41166a == null) {
            try {
                Boolean boolValueOf = Boolean.valueOf(Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 2);
                f41166a = boolValueOf;
                return boolValueOf.booleanValue();
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonUtils", "isChina", e10);
                }
            }
        }
        return f41166a != null && f41166a.booleanValue();
    }

    public static boolean b() {
        if (f41167b == null) {
            try {
                Boolean boolValueOf = Boolean.valueOf(Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 1);
                f41167b = boolValueOf;
                return boolValueOf.booleanValue();
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonUtils", "isOversea", e10);
                }
            }
        }
        return f41167b != null && f41167b.booleanValue();
    }
}
