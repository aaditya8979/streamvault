package com.ironsource;

import com.ironsource.O0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3932ac extends V {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private final String f30946s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private final List<NetworkSettings> f30947t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final Qb f30948u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3932ac(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull Qb qb2) {
        super(IronSource.a.NATIVE_AD, str, list, qb2.d(), qb2.b(), (int) (qb2.c() / ((long) 1000)), qb2.a(), qb2.f(), -1, new O0(O0.a.MANUAL, qb2.d().j(), qb2.d().b(), -1L), new I0(-1L), qb2.h(), qb2.i(), qb2.k(), qb2.j(), false, 32768, null);
        tn.p.k(qb2, C4089j8.f32059p);
        this.f30946s = str;
        this.f30947t = list;
        this.f30948u = qb2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3932ac a(C3932ac c3932ac, String str, List list, Qb qb2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c3932ac.f30946s;
        }
        if ((i10 & 2) != 0) {
            list = c3932ac.f30947t;
        }
        if ((i10 & 4) != 0) {
            qb2 = c3932ac.f30948u;
        }
        return c3932ac.a(str, list, qb2);
    }

    @NotNull
    public final C3932ac a(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull Qb qb2) {
        tn.p.k(qb2, C4089j8.f32059p);
        return new C3932ac(str, list, qb2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3932ac)) {
            return false;
        }
        C3932ac c3932ac = (C3932ac) obj;
        return tn.p.f(this.f30946s, c3932ac.f30946s) && tn.p.f(this.f30947t, c3932ac.f30947t) && tn.p.f(this.f30948u, c3932ac.f30948u);
    }

    public int hashCode() {
        String str = this.f30946s;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f30947t;
        return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f30948u.hashCode();
    }

    @Override // com.ironsource.V
    @Nullable
    public List<NetworkSettings> j() {
        return this.f30947t;
    }

    @Override // com.ironsource.V
    @Nullable
    public String o() {
        return this.f30946s;
    }

    @Nullable
    public final String s() {
        return this.f30946s;
    }

    @Nullable
    public final List<NetworkSettings> t() {
        return this.f30947t;
    }

    @NotNull
    public String toString() {
        return "NativeAdManagerData(userId=" + this.f30946s + ", providerList=" + this.f30947t + ", configs=" + this.f30948u + ")";
    }

    @NotNull
    public final Qb u() {
        return this.f30948u;
    }

    @NotNull
    public final Qb v() {
        return this.f30948u;
    }
}
