package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC5199w1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f67872a;

    public RunnableC5199w1(Context context) {
        this.f67872a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rj rj2 = AbstractC5043pj.f67535a;
        Context context = this.f67872a;
        synchronized (rj2) {
            if (rj2.f65843b == null) {
                rj2.f65843b = AbstractC5017oi.f67464a.a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
                Iterator it = rj2.f65842a.iterator();
                while (it.hasNext()) {
                    ((Ra) it.next()).a(rj2.f65843b);
                }
                rj2.f65842a.clear();
            }
        }
    }
}
