package yads;

import android.view.View;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class aw implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lv f87816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uz1 f87817b;

    public aw(lv lvVar, uz1 uz1Var) {
        this.f87816a = lvVar;
        this.f87817b = uz1Var;
    }

    @Override // yads.o0
    public final Object a(View view, m0 m0Var, u0 u0Var) {
        this.f87817b.f95882a.a();
        lv lvVar = this.f87816a;
        co2 co2Var = co2.f88551u;
        lvVar.getClass();
        lvVar.f92118d.a(lvVar.a(co2Var, new HashMap()));
        return new o01(false, null);
    }
}
