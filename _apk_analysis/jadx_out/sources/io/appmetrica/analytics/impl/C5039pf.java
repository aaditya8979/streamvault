package io.appmetrica.analytics.impl;

import androidx.annotation.VisibleForTesting;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5039pf implements Ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4655af f67524a;

    public C5039pf() {
        this(C5009oa.k().y());
    }

    @VisibleForTesting
    public C5039pf(@NotNull C4655af c4655af) {
        this.f67524a = c4655af;
    }

    @Override // io.appmetrica.analytics.impl.Ti
    public final boolean a() {
        return this.f67524a.i();
    }

    @Override // io.appmetrica.analytics.impl.Ti
    public final void b() {
        this.f67524a.h().b();
    }
}
