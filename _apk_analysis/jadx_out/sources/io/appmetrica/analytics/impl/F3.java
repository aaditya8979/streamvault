package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class F3 extends SimpleThreadSafeToggle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4655af f65233a;

    public F3(@NotNull C4655af c4655af) {
        super(c4655af.e(), "[ClientApiTrackingStatusToggle]");
        this.f65233a = c4655af;
    }

    public final void a(boolean z10) {
        updateState(z10);
        this.f65233a.f(z10);
    }
}
