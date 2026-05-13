package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4722d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4673b7 f66566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5134tb f66567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5159ub f66568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4652ac f66569d;

    public C4722d4(File file) {
        this.f66566a = new C4673b7(file);
    }

    public final synchronized Ia a(Context context) {
        C5159ub c5159ub;
        c5159ub = this.f66568c;
        if (c5159ub == null) {
            c5159ub = new C5159ub(c(context));
            this.f66568c = c5159ub;
        }
        return c5159ub;
    }

    public final synchronized Ia b(Context context) {
        return c(context);
    }

    public final Ia c(Context context) {
        C4652ac c4652ac;
        C5134tb c5134tb = this.f66567b;
        if (c5134tb == null) {
            synchronized (this) {
                c4652ac = this.f66569d;
                if (c4652ac == null) {
                    C4673b7 c4673b7 = this.f66566a;
                    String strA = new C4647a7(c4673b7.f66430a, c4673b7.f66431b, true).a(context, new O3());
                    N6 n62 = AbstractC5228x5.f67930c;
                    n62.getClass();
                    HashMap map = new HashMap();
                    map.put("preferences", InterfaceC5153u5.f67769a);
                    C4869in c4869in = n62.f65626c;
                    X6 x62 = n62.f65624a;
                    T6 t62 = x62.f66152c;
                    U6 u62 = x62.f66153d;
                    C5059qa c5059qa = new C5059qa(false);
                    c5059qa.a(112, new P3());
                    C4947ln c4947ln = new C4947ln("service database", map);
                    c4869in.getClass();
                    c4652ac = new C4652ac(context, strA, new Z9(strA), new C4895jn(t62, u62, c5059qa, c4947ln));
                    this.f66569d = c4652ac;
                }
            }
            c5134tb = new C5134tb(c4652ac);
            this.f66567b = c5134tb;
        }
        return c5134tb;
    }
}
