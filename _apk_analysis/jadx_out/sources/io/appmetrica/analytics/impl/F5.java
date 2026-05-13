package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class F5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4998o f65234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IReporter f65235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f65236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E5 f65237d;

    public F5(C4998o c4998o) {
        this(c4998o, 0);
    }

    public /* synthetic */ F5(C4998o c4998o, int i10) {
        this(c4998o, AbstractC5249y1.a());
    }

    public F5(C4998o c4998o, IReporter iReporter) {
        this.f65234a = c4998o;
        this.f65235b = iReporter;
        this.f65237d = new E5(this);
    }

    public final synchronized Context a() {
        return this.f65236c;
    }

    public final synchronized void a(Context context) {
        if (this.f65236c == null) {
            Context applicationContext = context.getApplicationContext();
            this.f65234a.a(applicationContext);
            this.f65234a.registerListener(this.f65237d, ActivityEvent.RESUMED, ActivityEvent.PAUSED);
            this.f65236c = applicationContext;
        }
    }
}
