package com.ironsource;

import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C3978d4;
import com.ironsource.C4324wf;
import com.ironsource.E0;
import com.ironsource.InterfaceC4349y6;
import com.ironsource.Za;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4173o0 extends C4320wb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final IronSource.a f33124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4324wf.b f33125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final E5 f33126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final L8 f33127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f33128f;

    /* JADX INFO: renamed from: com.ironsource.o0$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f33129a = new a();

        private a() {
        }

        @NotNull
        public static final C4173o0 a(@NotNull IronSource.a aVar, @NotNull E0.b bVar) {
            tn.p.k(aVar, "adFormat");
            tn.p.k(bVar, AppLovinEventTypes.USER_COMPLETED_LEVEL);
            return new C4173o0(aVar, bVar);
        }
    }

    public C4173o0(@NotNull IronSource.a aVar, @NotNull E0.b bVar) {
        tn.p.k(aVar, "adFormat");
        tn.p.k(bVar, AppLovinEventTypes.USER_COMPLETED_LEVEL);
        this.f33127e = Lb.f29764s.d().e();
        this.f33128f = TimeUnit.HOURS.toMillis(1L);
        this.f33124b = aVar;
        this.f33126d = new E5(aVar, bVar, null, null, 12, null);
        C4324wf.b bVarB = C4324wf.b(aVar);
        tn.p.j(bVarB, "createLogFactory(adFormat)");
        this.f33125c = bVarB;
    }

    public C4173o0(@NotNull C4173o0 c4173o0, @NotNull E0.b bVar) {
        tn.p.k(c4173o0, "adTools");
        tn.p.k(bVar, AppLovinEventTypes.USER_COMPLETED_LEVEL);
        this.f33127e = Lb.f29764s.d().e();
        this.f33128f = TimeUnit.HOURS.toMillis(1L);
        IronSource.a aVar = c4173o0.f33124b;
        this.f33124b = aVar;
        this.f33125c = c4173o0.f33125c;
        this.f33126d = new E5(aVar, bVar, c4173o0.f33126d.c(), null, 8, null);
    }

    public static /* synthetic */ String a(C4173o0 c4173o0, String str, String str2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c4173o0.a(str, str2);
    }

    @Nullable
    public final C4041gd a(@NotNull LevelPlay.AdFormat adFormat, @Nullable String str) {
        C3931ab c3931abA;
        tn.p.k(adFormat, "adFormat");
        if (str == null || (c3931abA = this.f33127e.a()) == null) {
            return null;
        }
        return c3931abA.c(adFormat, str);
    }

    @NotNull
    public final C4041gd a(@NotNull String str) {
        tn.p.k(str, "placementName");
        C3931ab c3931abA = this.f33127e.a();
        if (c3931abA == null) {
            throw new IllegalStateException("Error getting sdk configurations");
        }
        C4041gd c4041gdC = c3931abA.c(LevelPlay.AdFormat.BANNER, str);
        if (c4041gdC != null) {
            return c4041gdC;
        }
        throw new IllegalStateException("Error getting placement");
    }

    @NotNull
    public final ISBannerSize a(@NotNull LevelPlayAdSize levelPlayAdSize) {
        tn.p.k(levelPlayAdSize, C3978d4.i.O);
        return new C4117l0().b(levelPlayAdSize);
    }

    @NotNull
    public final String a(@Nullable String str, @Nullable String str2) {
        String strA = this.f33125c.a(str, str2);
        tn.p.j(strA, "logFactory.createLogMessage(message, suffix)");
        return strA;
    }

    public final void a(@NotNull Map<String, Object> map, @NotNull ISBannerSize iSBannerSize) {
        tn.p.k(map, "data");
        tn.p.k(iSBannerSize, "size");
        com.ironsource.mediationsdk.l.a(map, iSBannerSize);
    }

    public final long b(@NotNull LevelPlay.AdFormat adFormat) {
        tn.p.k(adFormat, "adFormat");
        C3931ab c3931abA = this.f33127e.a();
        return c3931abA != null ? c3931abA.b(adFormat) : this.f33128f;
    }

    @NotNull
    public final com.ironsource.lifecycle.b b() {
        com.ironsource.lifecycle.b bVarD = com.ironsource.lifecycle.b.d();
        tn.p.j(bVarD, "getInstance()");
        return bVarD;
    }

    @NotNull
    public final InterfaceC4349y6.a b(@NotNull LevelPlay.AdFormat adFormat, @NotNull String str) {
        tn.p.k(adFormat, "adFormat");
        tn.p.k(str, "adUnitId");
        C3931ab c3931abA = this.f33127e.a();
        if (c3931abA != null) {
            return c3931abA.b(adFormat, str);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    @NotNull
    public final String b(@Nullable String str) {
        return a(this, str, (String) null, 2, (Object) null);
    }

    @NotNull
    public final C4041gd c(@NotNull String str) {
        tn.p.k(str, "placementName");
        C3931ab c3931abA = this.f33127e.a();
        if (c3931abA == null) {
            throw new IllegalStateException("Error getting sdk configurations");
        }
        C4041gd c4041gdC = c3931abA.c(LevelPlay.AdFormat.NATIVE_AD, str);
        if (c4041gdC != null) {
            return c4041gdC;
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    @NotNull
    public final String c() {
        return a(this, (String) null, (String) null, 3, (Object) null);
    }

    @NotNull
    public final Za.a d(@NotNull String str) {
        tn.p.k(str, "adUnitId");
        C3931ab c3931abA = this.f33127e.a();
        if (c3931abA != null) {
            return c3931abA.a(str);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    @NotNull
    public final IronSource.a d() {
        return this.f33124b;
    }

    @NotNull
    public final E5 e() {
        return this.f33126d;
    }

    public final int f() {
        return Lb.f29764s.d().s().a(this.f33124b);
    }

    public final boolean g() {
        return Lb.f29764s.d().e().c();
    }
}
