package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class Wc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f30634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final N3 f30635b;

    public Wc(long j10, @NotNull N3 n32) {
        tn.p.k(n32, Ne.f29954n1);
        this.f30634a = j10;
        this.f30635b = n32;
    }

    public /* synthetic */ Wc(long j10, N3 n32, int i10, tn.i iVar) {
        this(j10, (i10 & 2) != 0 ? N3.Second : n32);
    }

    public final long a() {
        return this.f30634a;
    }

    @NotNull
    public final N3 b() {
        return this.f30635b;
    }

    @NotNull
    public String toString() {
        return "PacingCappingConfig(timeInterval=" + this.f30634a + " unit=" + this.f30635b + ")";
    }
}
