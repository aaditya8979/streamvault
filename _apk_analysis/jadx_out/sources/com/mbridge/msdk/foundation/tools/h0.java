package com.mbridge.msdk.foundation.tools;

import android.net.ConnectivityManager;

/* JADX INFO: compiled from: NetManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConnectivityManager f38112a;

    public static synchronized ConnectivityManager a() {
        try {
        } catch (Exception e10) {
            q0.b("NetManager", e10.getMessage());
        }
        if (f38112a != null || com.mbridge.msdk.foundation.controller.c.n().d() == null) {
        } else {
            f38112a = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("connectivity");
        }
        return f38112a;
    }
}
