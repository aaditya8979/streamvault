package com.inmobi.media;

import java.util.Iterator;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes7.dex */
public final class N8 extends wn.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O8 f26018a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N8(Df df2, O8 o82) {
        super(df2);
        this.f26018a = o82;
    }

    @Override // wn.b
    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        tn.p.k(kProperty, "property");
        Df df2 = (Df) obj2;
        if (Ef.a((Df) obj) == Ef.a(df2)) {
            return;
        }
        Iterator it = this.f26018a.f26074b.iterator();
        while (it.hasNext()) {
            ((Gf) it.next()).a(df2);
        }
    }
}
