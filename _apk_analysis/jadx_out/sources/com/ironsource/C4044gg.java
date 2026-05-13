package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.gg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4044gg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4262t4 f31817a;

    public C4044gg(@NotNull InterfaceC4262t4 interfaceC4262t4) {
        tn.p.k(interfaceC4262t4, "currentTimeProvider");
        this.f31817a = interfaceC4262t4;
    }

    public final boolean a(long j10, long j11) {
        long jA = this.f31817a.a();
        return j11 <= 0 || j10 <= 0 || jA < j10 || jA - j10 > j11;
    }
}
