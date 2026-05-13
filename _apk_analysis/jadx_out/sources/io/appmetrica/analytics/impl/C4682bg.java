package io.appmetrica.analytics.impl;

import androidx.annotation.WorkerThread;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4682bg implements Xf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4785fg f66438a;

    public C4682bg(C4785fg c4785fg) {
        this.f66438a = c4785fg;
    }

    @Override // io.appmetrica.analytics.impl.Xf
    @WorkerThread
    public final void a() {
        C4785fg c4785fg = this.f66438a;
        ArrayList arrayList = c4785fg.f66786g;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C5015og c5015og = (C5015og) obj;
            c4785fg.f66782c.getClass();
            String str = c5015og != null ? c5015og.f67460a : null;
            if (!(str == null || str.length() == 0)) {
                arrayList2.add(obj);
            }
        }
        c4785fg.a(c4785fg.f66782c.a(cn.f0.q0(arrayList2)));
    }
}
