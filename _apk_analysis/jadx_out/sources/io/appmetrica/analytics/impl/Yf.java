package io.appmetrica.analytics.impl;

import androidx.annotation.WorkerThread;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class Yf implements InterfaceC5139tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4785fg f66264a;

    public Yf(C4785fg c4785fg) {
        this.f66264a = c4785fg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5139tg
    @WorkerThread
    public final void a(@Nullable C5015og c5015og) {
        C4785fg c4785fg = this.f66264a;
        C4785fg.a(c4785fg, c5015og, (Xf) c4785fg.f66783d.getValue());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5139tg
    @WorkerThread
    public final void a(@NotNull Throwable th2) {
        C4785fg c4785fg = this.f66264a;
        C4785fg.a(c4785fg, null, (Xf) c4785fg.f66783d.getValue());
    }
}
