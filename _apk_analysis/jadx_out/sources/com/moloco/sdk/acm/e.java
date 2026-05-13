package com.moloco.sdk.acm;

import com.ironsource.C3978d4;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    @NotNull
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.services.d f45777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f45778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<c> f45779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f45780d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final e a(@NotNull String str) {
            p.k(str, C3978d4.i.f31344j0);
            return new e(str, new com.moloco.sdk.acm.services.d(new com.moloco.sdk.acm.services.g()), null);
        }
    }

    public e(String str, com.moloco.sdk.acm.services.d dVar) {
        this.f45777a = dVar;
        this.f45779c = new ArrayList();
        this.f45780d = str;
    }

    public /* synthetic */ e(String str, com.moloco.sdk.acm.services.d dVar, tn.i iVar) {
        this(str, dVar);
    }

    @NotNull
    public List<c> a() {
        return this.f45779c;
    }

    @NotNull
    public String b() {
        return this.f45780d;
    }

    public final long c() {
        return this.f45778b;
    }

    public final void d() {
        this.f45777a.b();
    }

    public final void e() {
        if (this.f45778b == 0) {
            this.f45778b = this.f45777a.a();
        }
    }

    @NotNull
    public e f(@NotNull String str, @NotNull String str2) {
        p.k(str, "key");
        p.k(str2, "value");
        if (a().size() < 10 && str.length() <= 50 && str2.length() <= 50) {
            a().add(new c(str, str2));
        }
        return this;
    }

    @NotNull
    public final e g(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Count cannot be negative".toString());
        }
        this.f45778b = j10;
        return this;
    }
}
