package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4748e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f66651a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f66652b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f66653c;

    public C4748e5(Context context) {
        this.f66653c = context.getApplicationContext();
    }

    public final Ha a(R4 r42, C5053q4 c5053q4, P7 p72, HashMap map) {
        Ha ha2 = (Ha) map.get(r42.toString());
        if (ha2 != null) {
            ha2.a(c5053q4);
            return ha2;
        }
        Ha haA = p72.a(this.f66653c, r42, c5053q4);
        map.put(r42.toString(), haA);
        return haA;
    }
}
