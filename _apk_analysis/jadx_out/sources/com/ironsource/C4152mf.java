package com.ironsource;

import com.ironsource.C3978d4;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4152mf implements T8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final H3 f32984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private ConcurrentHashMap<String, Integer> f32985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private ConcurrentHashMap<String, Long> f32986c;

    public C4152mf(@NotNull H3 h32) {
        tn.p.k(h32, C3978d4.a.f31215k);
        this.f32984a = h32;
        this.f32985b = new ConcurrentHashMap<>();
        this.f32986c = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.T8
    public int a(@NotNull String str) {
        tn.p.k(str, "identifier");
        Integer num = this.f32985b.get(str);
        if (num != null) {
            return num.intValue();
        }
        Integer numC = this.f32984a.c(str);
        if (numC == null) {
            this.f32985b.put(str, 0);
            return 0;
        }
        int iIntValue = numC.intValue();
        this.f32985b.put(str, Integer.valueOf(iIntValue));
        return iIntValue;
    }

    @Override // com.ironsource.T8
    public void a(int i10, @NotNull String str) {
        tn.p.k(str, "identifier");
        this.f32985b.put(str, Integer.valueOf(i10));
        this.f32984a.a(str, i10);
    }

    @Override // com.ironsource.T8
    public void a(long j10, @NotNull String str) {
        tn.p.k(str, "identifier");
        this.f32986c.put(str, Long.valueOf(j10));
        this.f32984a.b(str, j10);
    }

    @Override // com.ironsource.T8
    @Nullable
    public Long b(@NotNull String str) {
        tn.p.k(str, "identifier");
        Long l10 = this.f32986c.get(str);
        if (l10 != null) {
            return l10;
        }
        Long lA = this.f32984a.a(str);
        if (lA == null) {
            return null;
        }
        long jLongValue = lA.longValue();
        this.f32986c.put(str, Long.valueOf(jLongValue));
        return Long.valueOf(jLongValue);
    }
}
