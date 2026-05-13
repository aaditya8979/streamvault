package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public abstract class S9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Ea f26291a;

    public static final Ea a() {
        Ea eaA;
        if (f26291a == null) {
            Context context = Ji.f25747a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                eaA = Da.a(context, "CrashSession-store");
            } else {
                eaA = null;
            }
            f26291a = eaA;
        }
        return f26291a;
    }
}
