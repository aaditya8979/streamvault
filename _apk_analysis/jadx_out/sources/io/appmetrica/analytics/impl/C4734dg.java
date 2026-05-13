package io.appmetrica.analytics.impl;

import androidx.annotation.WorkerThread;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4734dg implements InterfaceC5139tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4785fg f66611a;

    public C4734dg(C4785fg c4785fg) {
        this.f66611a = c4785fg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5139tg
    @WorkerThread
    public final void a(@Nullable C5015og c5015og) {
        C4785fg c4785fg = this.f66611a;
        C4785fg.a(c4785fg, c5015og, (Xf) c4785fg.f66784e.getValue());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5139tg
    @WorkerThread
    public final void a(@NotNull Throwable th2) {
        C4785fg c4785fg = this.f66611a;
        C4785fg.a(c4785fg, null, (Xf) c4785fg.f66784e.getValue());
    }
}
