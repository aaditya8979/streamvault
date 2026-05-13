package com.ironsource;

import com.ironsource.C3978d4;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class Yc implements M7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final H3 f30737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private ConcurrentHashMap<String, Long> f30738b;

    public Yc(@NotNull H3 h32) {
        tn.p.k(h32, C3978d4.a.f31215k);
        this.f30737a = h32;
        this.f30738b = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.M7
    @Nullable
    public Long a(@NotNull String str) {
        tn.p.k(str, "identifier");
        Long l10 = this.f30738b.get(str);
        if (l10 != null) {
            return l10;
        }
        Long lB = this.f30737a.b(str);
        if (lB == null) {
            return null;
        }
        long jLongValue = lB.longValue();
        this.f30738b.put(str, Long.valueOf(jLongValue));
        return Long.valueOf(jLongValue);
    }

    @Override // com.ironsource.M7
    public void a(long j10, @NotNull String str) {
        tn.p.k(str, "identifier");
        this.f30738b.put(str, Long.valueOf(j10));
        this.f30737a.a(str, j10);
    }
}
