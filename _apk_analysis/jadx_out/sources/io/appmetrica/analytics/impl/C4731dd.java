package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.impl.C4731dd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4731dd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f66604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5194vl f66605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f66607d;

    public C4731dd(IHandlerExecutor iHandlerExecutor, AbstractC5286zd abstractC5286zd, String str, SystemTimeProvider systemTimeProvider) {
        this.f66604a = iHandlerExecutor;
        this.f66605b = abstractC5286zd;
        this.f66606c = str;
        this.f66607d = systemTimeProvider;
    }

    public static final void a(C4731dd c4731dd, List list) {
        Rj rj2 = AbstractC5043pj.f67535a;
        C4782fd c4782fd = new C4782fd(c4731dd.f66605b, c4731dd.f66606c, c4731dd.f66607d, list);
        rj2.getClass();
        rj2.a(new Fj(c4782fd));
    }

    public final void a(final ArrayList arrayList) {
        this.f66604a.execute(new Runnable() { // from class: mh.c0
            @Override // java.lang.Runnable
            public final void run() {
                C4731dd.a(this.f74258b, arrayList);
            }
        });
    }
}
