package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4258t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC4191p0 f34041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final LevelPlayAdInfo f34042b;

    public C4258t0(@NotNull AbstractC4191p0 abstractC4191p0, @Nullable LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(abstractC4191p0, "adUnit");
        this.f34041a = abstractC4191p0;
        this.f34042b = levelPlayAdInfo;
    }

    public /* synthetic */ C4258t0(AbstractC4191p0 abstractC4191p0, LevelPlayAdInfo levelPlayAdInfo, int i10, tn.i iVar) {
        this(abstractC4191p0, (i10 & 2) != 0 ? null : levelPlayAdInfo);
    }

    public static /* synthetic */ C4258t0 a(C4258t0 c4258t0, AbstractC4191p0 abstractC4191p0, LevelPlayAdInfo levelPlayAdInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC4191p0 = c4258t0.f34041a;
        }
        if ((i10 & 2) != 0) {
            levelPlayAdInfo = c4258t0.f34042b;
        }
        return c4258t0.a(abstractC4191p0, levelPlayAdInfo);
    }

    @NotNull
    public final AbstractC4191p0 a() {
        return this.f34041a;
    }

    @NotNull
    public final C4258t0 a(@NotNull AbstractC4191p0 abstractC4191p0, @Nullable LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(abstractC4191p0, "adUnit");
        return new C4258t0(abstractC4191p0, levelPlayAdInfo);
    }

    @Nullable
    public final LevelPlayAdInfo b() {
        return this.f34042b;
    }

    @Nullable
    public final LevelPlayAdInfo c() {
        return this.f34042b;
    }

    @NotNull
    public final AbstractC4191p0 d() {
        return this.f34041a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4258t0)) {
            return false;
        }
        C4258t0 c4258t0 = (C4258t0) obj;
        return tn.p.f(this.f34041a, c4258t0.f34041a) && tn.p.f(this.f34042b, c4258t0.f34042b);
    }

    public int hashCode() {
        int iHashCode = this.f34041a.hashCode() * 31;
        LevelPlayAdInfo levelPlayAdInfo = this.f34042b;
        return iHashCode + (levelPlayAdInfo == null ? 0 : levelPlayAdInfo.hashCode());
    }

    @NotNull
    public String toString() {
        return "AdUnitCallback(adUnit=" + this.f34041a + ", adInfo=" + this.f34042b + ")";
    }
}
