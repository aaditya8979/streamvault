package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class Bo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f65060b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xo f65061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xo f65062d;

    public Bo(Context context) {
        this.f65059a = context;
        C4702ca c4702ca = new C4702ca(context, "appmetrica_vital.dat");
        this.f65061c = new xo(C5009oa.k().y(), c4702ca);
        this.f65062d = new xo(new C4655af(C5009oa.k().B().e(context)), c4702ca);
    }

    public final xo a() {
        return this.f65061c;
    }

    public final xo b() {
        return this.f65062d;
    }
}
