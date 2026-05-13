package io.appmetrica.analytics.impl;

import android.util.SparseArray;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C5019ok extends Kc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xo f67466a;

    public C5019ok() {
        this(C5009oa.k().D().b());
    }

    public C5019ok(xo xoVar) {
        this.f67466a = xoVar;
    }

    @Override // io.appmetrica.analytics.impl.Kc
    public final void a(int i10) {
        xo xoVar = this.f67466a;
        synchronized (xoVar) {
            zo zoVar = xoVar.f67993a;
            zoVar.a(zoVar.a().put("last_migration_api_level", i10));
        }
    }

    @Override // io.appmetrica.analytics.impl.Kc
    public final int b() {
        int iOptInt;
        xo xoVar = this.f67466a;
        synchronized (xoVar) {
            iOptInt = xoVar.f67993a.a().optInt("last_migration_api_level", -1);
        }
        return iOptInt;
    }

    @Override // io.appmetrica.analytics.impl.Kc
    public final SparseArray<Jc> c() {
        SparseArray<Jc> sparseArray = new SparseArray<>(1);
        sparseArray.put(112, new C5044pk(this.f67466a));
        sparseArray.put(115, new C5069qk());
        sparseArray.put(116, new C5143tk());
        return sparseArray;
    }
}
