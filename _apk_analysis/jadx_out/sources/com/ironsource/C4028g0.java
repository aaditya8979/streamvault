package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.f;
import com.unity3d.mediation.LevelPlay;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C4028g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSource.a f31758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final UUID f31759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f31760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private C4041gd f31761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Hf f31762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Double f31763f;

    /* JADX INFO: renamed from: com.ironsource.g0$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31764a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f31764a = iArr;
        }
    }

    public C4028g0(@NotNull IronSource.a aVar, @NotNull UUID uuid, @NotNull String str, @Nullable C4041gd c4041gd, @Nullable Hf hf2, @Nullable Double d10) {
        tn.p.k(aVar, "adFormat");
        tn.p.k(uuid, f.b.f33716c);
        tn.p.k(str, "adUnitId");
        this.f31758a = aVar;
        this.f31759b = uuid;
        this.f31760c = str;
        this.f31761d = c4041gd;
        this.f31762e = hf2;
        this.f31763f = d10;
    }

    public /* synthetic */ C4028g0(IronSource.a aVar, UUID uuid, String str, C4041gd c4041gd, Hf hf2, Double d10, int i10, tn.i iVar) {
        this(aVar, uuid, str, (i10 & 8) != 0 ? null : c4041gd, (i10 & 16) != 0 ? null : hf2, (i10 & 32) != 0 ? null : d10);
    }

    @NotNull
    public final IronSource.a a() {
        return this.f31758a;
    }

    public final void a(@Nullable C4041gd c4041gd) {
        this.f31761d = c4041gd;
    }

    @NotNull
    public final UUID b() {
        return this.f31759b;
    }

    @NotNull
    public final String c() {
        return this.f31760c;
    }

    @Nullable
    public final Double d() {
        return this.f31763f;
    }

    @NotNull
    public final LevelPlay.AdFormat e() {
        int i10 = a.f31764a[this.f31758a.ordinal()];
        if (i10 == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i10 == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i10 == 3) {
            return LevelPlay.AdFormat.BANNER;
        }
        if (i10 == 4) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    public final C4041gd f() {
        return this.f31761d;
    }

    @Nullable
    public final Hf g() {
        return this.f31762e;
    }
}
