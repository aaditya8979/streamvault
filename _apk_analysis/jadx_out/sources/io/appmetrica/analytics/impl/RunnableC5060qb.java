package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC5060qb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f67574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f67575b;

    public RunnableC5060qb(Handler handler, J2 j22) {
        this.f67574a = new WeakReference(handler);
        this.f67575b = new WeakReference(j22);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = (Handler) this.f67574a.get();
        J2 j22 = (J2) this.f67575b.get();
        if (handler == null || j22 == null) {
            return;
        }
        boolean z10 = !j22.f65393b.f();
        if (z10) {
            PublicLogger publicLogger = j22.f65394c;
            Set set = AbstractC5232x9.f67933a;
            EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
            N3 n32 = new N3("", "", 3, 0, publicLogger);
            C5241xi c5241xi = j22.f65399h;
            Gh gh2 = j22.f65393b;
            c5241xi.getClass();
            c5241xi.a(C5241xi.a(n32, gh2), gh2, 1, (Map) null);
        }
        if (z10) {
            C5035pb.a(handler, j22, this);
        }
    }
}
