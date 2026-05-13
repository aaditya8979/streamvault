package com.ironsource;

import com.ironsource.C4240s;
import com.ironsource.C4322wd;
import com.ironsource.InterfaceC4349y6;
import com.ironsource.T2;
import com.ironsource.Za;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3931ab extends C4131le {

    /* JADX INFO: renamed from: com.ironsource.ab$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30945a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f30945a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3931ab(@NotNull C4131le c4131le) {
        super(c4131le);
        tn.p.k(c4131le, "sdkConfig");
    }

    private final InterfaceC4349y6.c a(LevelPlay.AdFormat adFormat, String str) {
        C4240s.d dVarB;
        C4254sd c4254sdG;
        Map<String, C4240s.d> mapA;
        C4240s.d dVar;
        C4254sd c4254sdG2;
        boolean z10 = adFormat == LevelPlay.AdFormat.REWARDED;
        C4240s c4240s = g().a().a().get(adFormat);
        InterfaceC4349y6.c cVarA = null;
        InterfaceC4349y6.c cVarA2 = (c4240s == null || (mapA = c4240s.a()) == null || (dVar = mapA.get(str)) == null || (c4254sdG2 = dVar.g()) == null) ? null : c4254sdG2.a();
        if (c4240s != null && (dVarB = c4240s.b()) != null && (c4254sdG = dVarB.g()) != null) {
            cVarA = c4254sdG.a();
        }
        if (cVarA2 == null) {
            cVarA2 = cVarA;
        }
        return cVarA2 != null ? cVarA2 : z10 ? InterfaceC4349y6.c.PROGRESSIVE_ON_SHOW_SUCCESS : InterfaceC4349y6.c.SINGLE;
    }

    @NotNull
    public final Za.a a(@NotNull String str) {
        tn.p.k(str, "adUnitId");
        T2 t2C = g().a().c();
        T2.b bVar = t2C.a().get(str);
        return new Za.a(bVar != null ? bVar.e() : t2C.b().e(), bVar != null ? bVar.c() : t2C.b().c(), bVar != null ? bVar.d() : t2C.b().d());
    }

    @NotNull
    public final C4275u0 a(@NotNull C4320wb c4320wb) {
        tn.p.k(c4320wb, "tools");
        return new C4275u0(c4320wb, g().a().a());
    }

    @NotNull
    public final List<String> a(@NotNull LevelPlay.AdFormat adFormat) {
        Map<String, C4322wd.b> mapA;
        Set<String> setKeySet;
        List<String> listG1;
        tn.p.k(adFormat, "adFormat");
        C4322wd.a aVar = g().d().a().get(adFormat);
        return (aVar == null || (mapA = aVar.a()) == null || (setKeySet = mapA.keySet()) == null || (listG1 = cn.f0.g1(setKeySet)) == null) ? cn.w.m() : listG1;
    }

    public final boolean a(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat) {
        Map<String, C4322wd.b> mapA;
        tn.p.k(str, "adUnitId");
        tn.p.k(adFormat, "adFormat");
        C4322wd.a aVar = g().d().a().get(adFormat);
        return (aVar == null || (mapA = aVar.a()) == null || !mapA.containsKey(str)) ? false : true;
    }

    public final long b(@NotNull LevelPlay.AdFormat adFormat) {
        C4240s.d dVarB;
        Long lD;
        tn.p.k(adFormat, "adFormat");
        C4240s c4240s = g().a().a().get(adFormat);
        long jLongValue = (c4240s == null || (dVarB = c4240s.b()) == null || (lD = dVarB.d()) == null) ? 60L : lD.longValue();
        return jLongValue > 0 ? TimeUnit.MINUTES.toMillis(jLongValue) : jLongValue;
    }

    @NotNull
    public final C4094jd b(@NotNull C4320wb c4320wb) {
        tn.p.k(c4320wb, "tools");
        return new C4094jd(c4320wb, g().a().a());
    }

    @NotNull
    public final InterfaceC4349y6.a b(@NotNull LevelPlay.AdFormat adFormat, @NotNull String str) {
        tn.p.k(adFormat, "adFormat");
        tn.p.k(str, "adUnitId");
        return new InterfaceC4349y6.a(a(adFormat, str));
    }

    @NotNull
    public final Jd c(@NotNull C4320wb c4320wb) {
        tn.p.k(c4320wb, "tools");
        C4240s c4240s = g().a().a().get(LevelPlay.AdFormat.REWARDED);
        return new Jd(c4320wb, c4240s != null ? c4240s.a() : null, c4240s != null ? c4240s.c() : null);
    }

    @Nullable
    public final C4041gd c(@NotNull LevelPlay.AdFormat adFormat, @Nullable String str) {
        C4041gd c4041gdA;
        M9 m9A;
        String str2;
        tn.p.k(adFormat, "adFormat");
        int i10 = a.f30945a[adFormat.ordinal()];
        if (i10 == 1) {
            Zd zdF = d().c().f();
            if (zdF == null || (c4041gdA = zdF.a(str)) == null) {
                return null;
            }
            tn.p.j(c4041gdA, "getRewardedVideoPlacement(placementName)");
            return new C4041gd(c4041gdA.b(), c4041gdA.c(), c4041gdA.d(), c4041gdA.f(), c4041gdA.e(), c4041gdA.a());
        }
        if (i10 == 2) {
            H9 h9D = d().c().d();
            if (h9D == null || (m9A = h9D.a(str)) == null) {
                return null;
            }
            tn.p.j(m9A, "getInterstitialPlacement(placementName)");
            return new C4041gd(m9A);
        }
        if (i10 == 3) {
            U2 u2C = d().c().c();
            if (u2C == null) {
                throw new IllegalStateException("Error getting " + adFormat + " configurations");
            }
            C4049h3 c4049h3A = u2C.a(str);
            if (c4049h3A == null) {
                c4049h3A = u2C.i();
                str2 = "config.defaultBannerPlacement";
            } else {
                str2 = "config.getBannerPlacemen…ig.defaultBannerPlacement";
            }
            tn.p.j(c4049h3A, str2);
            return new C4041gd(c4049h3A);
        }
        if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Qb qbE = d().c().e();
        if (qbE != null && str != null) {
            C3950bc c3950bcA = qbE.a(str);
            if (c3950bcA == null) {
                c3950bcA = qbE.e();
            }
            if (c3950bcA != null) {
                return new C4041gd(c3950bcA);
            }
        }
        throw new IllegalStateException("Error getting " + adFormat + " configurations");
    }

    @NotNull
    public final List<C4355yc> c(@NotNull LevelPlay.AdFormat adFormat) {
        Map<String, C4322wd.b> mapA;
        Set<String> setKeySet;
        List<C4355yc> listK0;
        tn.p.k(adFormat, "adFormat");
        C4322wd.a aVar = g().d().a().get(adFormat);
        if (aVar != null && (mapA = aVar.a()) != null && (setKeySet = mapA.keySet()) != null) {
            ArrayList arrayList = new ArrayList(cn.x.x(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(d(adFormat, (String) it.next()));
            }
            List listZ = cn.x.z(arrayList);
            if (listZ != null && (listK0 = cn.f0.k0(listZ)) != null) {
                return listK0;
            }
        }
        return cn.w.m();
    }

    @NotNull
    public final List<C4355yc> d(@NotNull LevelPlay.AdFormat adFormat, @NotNull String str) {
        Map<String, C4322wd.b> mapA;
        C4322wd.b bVar;
        List<String> listA;
        tn.p.k(adFormat, "adFormat");
        tn.p.k(str, "adUnitId");
        C4322wd.a aVar = g().d().a().get(adFormat);
        if (aVar == null || (mapA = aVar.a()) == null || (bVar = mapA.get(str)) == null || (listA = bVar.a()) == null) {
            return cn.w.m();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            C4355yc c4355yc = g().e().a().get((String) it.next());
            if (c4355yc != null) {
                arrayList.add(c4355yc);
            }
        }
        return arrayList;
    }

    @Nullable
    public final String h() {
        return g().a().b().c().a();
    }

    @NotNull
    public final List<LevelPlayAdSize> i() {
        List<String> listA = g().a().c().b().a();
        ArrayList arrayList = new ArrayList(cn.x.x(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release((String) it.next()));
        }
        return arrayList;
    }

    public final float j() {
        return g().a().c().b().b();
    }

    public final boolean k() {
        com.ironsource.mediationsdk.adquality.a aVarA = d().c().a();
        return aVarA != null && aVarA.b();
    }

    public final boolean l() {
        return g().a().b().e();
    }
}
