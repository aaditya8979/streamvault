package yads;

import android.view.View;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class sc implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final id f94772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final za f94773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lv f94774c;

    public sc(id idVar, za zaVar, lv lvVar) {
        this.f94772a = idVar;
        this.f94773b = zaVar;
        this.f94774c = lvVar;
    }

    @Override // yads.o0
    public final Object a(View view, m0 m0Var, u0 u0Var) {
        rc rcVar = (rc) m0Var;
        Iterator it = rcVar.f94361d.iterator();
        while (it.hasNext()) {
            za.a(this.f94773b, (String) it.next(), k83.f91511b);
        }
        this.f94772a.a(view, rcVar);
        lv lvVar = this.f94774c;
        co2 co2Var = co2.f88540j;
        lvVar.getClass();
        lvVar.f92118d.a(lvVar.a(co2Var, new HashMap()));
        return new o01(false, null);
    }
}
