package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.impl.Tb;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class Tb implements Qb, ToggleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f65931a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f65932b = C5009oa.k().w().b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Ln f65933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f65934d;

    public static final void a(Tb tb2, LocationControllerObserver locationControllerObserver, boolean z10) {
        tb2.f65931a.add(locationControllerObserver);
        if (z10) {
            if (tb2.f65934d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    public static final void a(Tb tb2, boolean z10) {
        if (tb2.f65934d != z10) {
            tb2.f65934d = z10;
            sn.l lVar = z10 ? Rb.f65833a : Sb.f65876a;
            Iterator it = tb2.f65931a.iterator();
            while (it.hasNext()) {
                lVar.invoke((LocationControllerObserver) it.next());
            }
        }
    }

    public final void a(@Nullable Toggle toggle) {
        Ln ln2 = new Ln(toggle);
        this.f65933c = ln2;
        ln2.f65547c.registerObserver(this, true);
    }

    public final void a(@NotNull final LocationControllerObserver locationControllerObserver, final boolean z10) {
        this.f65932b.execute(new Runnable() { // from class: mh.q
            @Override // java.lang.Runnable
            public final void run() {
                Tb.a(this.f74285b, locationControllerObserver, z10);
            }
        });
    }

    public final void a(@NotNull Object obj) {
        Ln ln2 = this.f65933c;
        if (ln2 == null) {
            tn.p.C("togglesHolder");
            ln2 = null;
        }
        ln2.f65546b.a(obj);
    }

    public final void a(boolean z10) {
        Ln ln2 = this.f65933c;
        if (ln2 == null) {
            tn.p.C("togglesHolder");
            ln2 = null;
        }
        ln2.f65545a.a(z10);
    }

    public final void b(@NotNull Object obj) {
        Ln ln2 = this.f65933c;
        if (ln2 == null) {
            tn.p.C("togglesHolder");
            ln2 = null;
        }
        ln2.f65546b.b(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(final boolean z10) {
        this.f65932b.execute(new Runnable() { // from class: mh.p
            @Override // java.lang.Runnable
            public final void run() {
                Tb.a(this.f74282b, z10);
            }
        });
    }
}
