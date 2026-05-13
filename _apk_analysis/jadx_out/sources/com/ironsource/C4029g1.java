package com.ironsource;

import java.util.Calendar;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4029g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final EnumC4025ff f31765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final W7 f31766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f31767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f31768d;

    public C4029g1(@NotNull EnumC4025ff enumC4025ff, @NotNull W7 w72, @NotNull String str) {
        tn.p.k(enumC4025ff, "recordType");
        tn.p.k(w72, "adProvider");
        tn.p.k(str, "adInstanceId");
        this.f31765a = enumC4025ff;
        this.f31766b = w72;
        this.f31767c = str;
        this.f31768d = Calendar.getInstance().getTimeInMillis() / ((long) 1000);
    }

    @NotNull
    public final String a() {
        return this.f31767c;
    }

    @NotNull
    public final W7 b() {
        return this.f31766b;
    }

    @NotNull
    public final Map<String, Object> c() {
        return kotlin.collections.a.m(bn.h.a(C4336xa.f34378c, Integer.valueOf(this.f31766b.b())), bn.h.a("ts", String.valueOf(this.f31768d)));
    }

    @NotNull
    public final Map<String, Object> d() {
        return kotlin.collections.a.m(bn.h.a(C4336xa.f34377b, this.f31767c), bn.h.a(C4336xa.f34378c, Integer.valueOf(this.f31766b.b())), bn.h.a("ts", String.valueOf(this.f31768d)), bn.h.a("rt", Integer.valueOf(this.f31765a.ordinal())));
    }

    @NotNull
    public final EnumC4025ff e() {
        return this.f31765a;
    }

    public final long f() {
        return this.f31768d;
    }
}
