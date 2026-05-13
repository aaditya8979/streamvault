package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4965mg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f67296a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5015og f67297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f67298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xo f67299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f67300e;

    public C4965mg(Context context, xo xoVar) {
        this.f67300e = context;
        this.f67299d = xoVar;
        this.f67297b = xoVar.b();
        this.f67298c = xoVar.c();
    }

    public final void a() {
        if (this.f67298c) {
            return;
        }
        Context context = this.f67300e;
        Pa paA = C5214wg.a(context, C5009oa.I.f67421d.a());
        InterfaceC5139tg interfaceC5139tg = (InterfaceC5139tg) new C4785fg(this, new C5214wg(paA), new Aa(context), new C5239xg(context)).f66785f.getValue();
        try {
            paA.a(interfaceC5139tg);
        } catch (Throwable th2) {
            interfaceC5139tg.a(th2);
        }
    }

    public final synchronized void a(C5015og c5015og) {
        Iterator it = this.f67296a.iterator();
        while (it.hasNext()) {
            ((C5065qg) it.next()).a(c5015og);
        }
    }

    public final synchronized void a(C5065qg c5065qg) {
        this.f67296a.add(c5065qg);
        if (this.f67298c) {
            c5065qg.a(this.f67297b);
        }
    }
}
