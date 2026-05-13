package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4292v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f34236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<NetworkSettings> f34237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4201pa f34238c;

    /* JADX WARN: Multi-variable type inference failed */
    public C4292v0(@Nullable String str, @NotNull List<? extends NetworkSettings> list, @NotNull C4201pa c4201pa) {
        tn.p.k(list, "providerList");
        tn.p.k(c4201pa, "publisherDataHolder");
        this.f34236a = str;
        this.f34237b = list;
        this.f34238c = c4201pa;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4292v0 a(C4292v0 c4292v0, String str, List list, C4201pa c4201pa, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4292v0.f34236a;
        }
        if ((i10 & 2) != 0) {
            list = c4292v0.f34237b;
        }
        if ((i10 & 4) != 0) {
            c4201pa = c4292v0.f34238c;
        }
        return c4292v0.a(str, list, c4201pa);
    }

    @NotNull
    public final C4292v0 a(@Nullable String str, @NotNull List<? extends NetworkSettings> list, @NotNull C4201pa c4201pa) {
        tn.p.k(list, "providerList");
        tn.p.k(c4201pa, "publisherDataHolder");
        return new C4292v0(str, list, c4201pa);
    }

    @Nullable
    public final String a() {
        return this.f34236a;
    }

    @NotNull
    public final List<NetworkSettings> b() {
        return this.f34237b;
    }

    @NotNull
    public final C4201pa c() {
        return this.f34238c;
    }

    @NotNull
    public final List<NetworkSettings> d() {
        return this.f34237b;
    }

    @NotNull
    public final C4201pa e() {
        return this.f34238c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4292v0)) {
            return false;
        }
        C4292v0 c4292v0 = (C4292v0) obj;
        return tn.p.f(this.f34236a, c4292v0.f34236a) && tn.p.f(this.f34237b, c4292v0.f34237b) && tn.p.f(this.f34238c, c4292v0.f34238c);
    }

    @Nullable
    public final String f() {
        return this.f34236a;
    }

    public int hashCode() {
        String str = this.f34236a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.f34237b.hashCode()) * 31) + this.f34238c.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdUnitCommonData(userId=" + this.f34236a + ", providerList=" + this.f34237b + ", publisherDataHolder=" + this.f34238c + ")";
    }
}
