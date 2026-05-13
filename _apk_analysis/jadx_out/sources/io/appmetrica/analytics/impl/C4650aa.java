package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4650aa {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4650aa f66359c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f66360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f66361b = new HashMap();

    public C4650aa(Context context) {
        this.f66360a = context;
    }

    public static final C4650aa a(Context context) {
        if (f66359c == null) {
            synchronized (tn.t.b(C4650aa.class)) {
                if (f66359c == null) {
                    f66359c = new C4650aa(context);
                }
                bn.r rVar = bn.r.f5635a;
            }
        }
        C4650aa c4650aa = f66359c;
        if (c4650aa != null) {
            return c4650aa;
        }
        tn.p.C("INSTANCE");
        return null;
    }

    public final synchronized void a(String str) {
        this.f66361b.remove(str);
    }

    public final synchronized C5257y9 b(String str) {
        Object c5257y9;
        HashMap map = this.f66361b;
        c5257y9 = map.get(str);
        if (c5257y9 == null) {
            c5257y9 = new C5257y9(this.f66360a, str);
            map.put(str, c5257y9);
        }
        return (C5257y9) c5257y9;
    }
}
