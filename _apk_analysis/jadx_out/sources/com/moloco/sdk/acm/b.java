package com.moloco.sdk.acm;

import com.ironsource.C3978d4;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    @NotNull
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<c> f45734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f45735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45736c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public b(@NotNull String str) {
        p.k(str, C3978d4.i.f31344j0);
        this.f45734a = new ArrayList();
        this.f45735b = str;
        this.f45736c = 1;
    }

    public final int a() {
        return this.f45736c;
    }

    @NotNull
    public List<c> b() {
        return this.f45734a;
    }

    @NotNull
    public String c() {
        return this.f45735b;
    }

    @NotNull
    public final b d(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Count cannot be negative".toString());
        }
        this.f45736c = i10;
        return this;
    }

    @NotNull
    public b e(@NotNull String str, @NotNull String str2) {
        p.k(str, "key");
        p.k(str2, "value");
        if (b().size() < 10 && str.length() <= 50 && str2.length() <= 50) {
            b().add(new c(str, str2));
        }
        return this;
    }
}
