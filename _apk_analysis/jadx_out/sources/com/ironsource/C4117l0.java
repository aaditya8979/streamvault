package com.ironsource;

import android.content.Context;
import com.ironsource.C4324wf;
import com.ironsource.E0;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlayAdSize;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4117l0 extends C4320wb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final E5 f32184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4324wf.b f32185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final L8 f32186d;

    public C4117l0() {
        IronSource.a aVar = IronSource.a.BANNER;
        this.f32184b = new E5(aVar, E0.b.MEDIATION, null, null, 12, null);
        C4324wf.b bVarB = C4324wf.b(aVar);
        tn.p.j(bVarB, "createLogFactory(IronSource.AD_UNIT.BANNER)");
        this.f32185c = bVarB;
        this.f32186d = Lb.f29764s.d().e();
    }

    private final ISBannerSize a(LevelPlayAdSize levelPlayAdSize) {
        LevelPlayAdSize fallbackAdSize$mediationsdk_release = levelPlayAdSize.getFallbackAdSize$mediationsdk_release();
        if (fallbackAdSize$mediationsdk_release == null) {
            fallbackAdSize$mediationsdk_release = LevelPlayAdSize.BANNER;
        }
        ISBannerSize iSBannerSizeB = b(fallbackAdSize$mediationsdk_release);
        iSBannerSizeB.setAdaptive(true);
        com.ironsource.mediationsdk.o.f32720a.a(iSBannerSizeB, new Y7(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()));
        return iSBannerSizeB;
    }

    public static /* synthetic */ String a(C4117l0 c4117l0, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c4117l0.a(str, str2);
    }

    private final ISBannerSize c(LevelPlayAdSize levelPlayAdSize) {
        return tn.p.f(levelPlayAdSize, LevelPlayAdSize.LARGE) ? new ISBannerSize(com.ironsource.mediationsdk.l.f32636b, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : tn.p.f(levelPlayAdSize, LevelPlayAdSize.MEDIUM_RECTANGLE) ? new ISBannerSize(com.ironsource.mediationsdk.l.f32637c, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : tn.p.f(levelPlayAdSize, LevelPlayAdSize.LEADERBOARD) ? new ISBannerSize(com.ironsource.mediationsdk.l.f32639e, 0, 0) : tn.p.f(levelPlayAdSize, LevelPlayAdSize.Companion.createCustomSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight())) ? new ISBannerSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : new ISBannerSize("BANNER", levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
    }

    private final Float c() {
        C3931ab c3931abA = this.f32186d.a();
        Float fValueOf = c3931abA != null ? Float.valueOf(c3931abA.j()) : null;
        if (fValueOf != null) {
            return fValueOf;
        }
        this.f32184b.h().f("MaxScreenSizePercentageForBannerHeight is null: Error getting sdk configurations");
        return null;
    }

    public final int a(int i10) {
        return com.ironsource.mediationsdk.l.a(i10);
    }

    @NotNull
    public final String a(@Nullable String str, @Nullable String str2) {
        String strA = this.f32185c.a(str, str2);
        tn.p.j(strA, "logFactory.createLogMessage(message, suffix)");
        return strA;
    }

    @NotNull
    public final ISBannerSize b(@NotNull LevelPlayAdSize levelPlayAdSize) {
        tn.p.k(levelPlayAdSize, "size");
        boolean zIsAdaptive = levelPlayAdSize.isAdaptive();
        if (zIsAdaptive) {
            return a(levelPlayAdSize);
        }
        if (zIsAdaptive) {
            throw new NoWhenBranchMatchedException();
        }
        return c(levelPlayAdSize);
    }

    @Nullable
    public final Integer b(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        Float fC = c();
        if (fC != null) {
            return Integer.valueOf(vn.c.d(fC.floatValue() * C3997e5.f31533a.a(context)));
        }
        return null;
    }

    @NotNull
    public final List<LevelPlayAdSize> b() {
        C3931ab c3931abA = this.f32186d.a();
        if (c3931abA != null) {
            return c3931abA.i();
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final boolean d() {
        return Lb.f29764s.d().e().c();
    }
}
