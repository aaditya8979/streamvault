package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5233xa implements HostRetryInfoProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4655af f67943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ud f67944b;

    public C5233xa(@NotNull C4655af c4655af, @NotNull Ud ud2) {
        this.f67943a = c4655af;
        this.f67944b = ud2;
    }

    @NotNull
    public final Ud a() {
        return this.f67944b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final long getLastAttemptTimeSeconds() {
        return this.f67943a.a(this.f67944b, 0L);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final int getNextSendAttemptNumber() {
        return this.f67943a.a(this.f67944b, 1);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveLastAttemptTimeSeconds(long j10) {
        this.f67943a.b(this.f67944b, j10).b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveNextSendAttemptNumber(int i10) {
        this.f67943a.b(this.f67944b, i10).b();
    }
}
