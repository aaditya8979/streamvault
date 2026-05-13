package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.bk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC3313bk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ea f26875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f26876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Integer f26877c;

    static {
        Ea eaA;
        Context context = Ji.f25747a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f25372b;
            eaA = Da.a(context, "imtelemetrydboverflow");
        } else {
            eaA = null;
        }
        f26875a = eaA;
        f26876b = -1;
    }

    public static int a() {
        if (f26876b == -1) {
            Ea ea2 = f26875a;
            int i10 = 0;
            if (ea2 != null) {
                tn.p.k("count", "key");
                i10 = ea2.f25373a.getInt("count", 0);
            }
            f26876b = i10;
        }
        return f26876b;
    }
}
