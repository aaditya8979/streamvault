package com.mbridge.msdk.foundation.controller;

import android.annotation.SuppressLint;
import com.mbridge.msdk.foundation.controller.a;

/* JADX INFO: compiled from: MBSDKContext.java */
/* JADX INFO: loaded from: classes12.dex */
public class c extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile c f37397t;

    private c() {
    }

    public static c n() {
        if (f37397t == null) {
            synchronized (c.class) {
                if (f37397t == null) {
                    f37397t = new c();
                }
            }
        }
        return f37397t;
    }

    @Override // com.mbridge.msdk.foundation.controller.a
    public void a(a.e eVar) {
    }
}
