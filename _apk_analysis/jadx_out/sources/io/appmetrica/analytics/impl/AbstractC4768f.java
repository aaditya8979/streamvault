package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC4768f implements InterfaceC4799g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f66717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cg f66718b;

    public AbstractC4768f(@NonNull Context context, @NonNull Cg cg2) {
        this.f66717a = context.getApplicationContext();
        this.f66718b = cg2;
        cg2.a(this);
        C5009oa.k().n().b(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4799g4
    public final void a() {
        this.f66718b.b(this);
        C5009oa.I.m().a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4799g4
    public final void a(@NonNull Q5 q52, @NonNull C5053q4 c5053q4) {
        b(q52, c5053q4);
    }

    @NonNull
    public final Cg b() {
        return this.f66718b;
    }

    public abstract void b(@NonNull Q5 q52, @NonNull C5053q4 c5053q4);

    @NonNull
    public final Context c() {
        return this.f66717a;
    }
}
