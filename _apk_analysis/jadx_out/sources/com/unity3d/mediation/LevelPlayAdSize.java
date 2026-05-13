package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.C3978d4;
import com.ironsource.C4011f1;
import com.ironsource.C4117l0;
import com.ironsource.Z7;
import com.ironsource.mediationsdk.l;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes9.dex */
public final class LevelPlayAdSize {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f53482f = 320;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f53483g = 50;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f53484h = 320;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f53485i = 90;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f53486j = 300;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f53487k = 250;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f53489m = 90;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f53492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f53493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final LevelPlayAdSize f53494e;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final LevelPlayAdSize BANNER = new LevelPlayAdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, "BANNER", false, null, 16, null);

    @NotNull
    public static final LevelPlayAdSize MEDIUM_RECTANGLE = new LevelPlayAdSize(300, 250, l.f32641g, false, null, 16, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f53488l = 728;

    @NotNull
    public static final LevelPlayAdSize LEADERBOARD = new LevelPlayAdSize(f53488l, 90, l.f32638d, false, null, 16, null);

    @NotNull
    public static final LevelPlayAdSize LARGE = new LevelPlayAdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 90, l.f32636b, false, null, 16, null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public static /* synthetic */ LevelPlayAdSize createAdaptiveAdSize$default(Companion companion, Context context, Integer num, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                num = null;
            }
            return companion.createAdaptiveAdSize(context, num);
        }

        @NotNull
        public final LevelPlayAdSize createAdSize$mediationsdk_release(@NotNull String str) {
            p.k(str, C3978d4.i.O);
            int iHashCode = str.hashCode();
            if (iHashCode != -96588539) {
                if (iHashCode != 72205083) {
                    if (iHashCode != 446888797) {
                        if (iHashCode == 1951953708 && str.equals("BANNER")) {
                            return LevelPlayAdSize.BANNER;
                        }
                    } else if (str.equals(l.f32638d)) {
                        return LevelPlayAdSize.LEADERBOARD;
                    }
                } else if (str.equals(l.f32636b)) {
                    return LevelPlayAdSize.LARGE;
                }
            } else if (str.equals(l.f32641g)) {
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            throw new IllegalArgumentException("Wrong Ad Size");
        }

        @Nullable
        public final LevelPlayAdSize createAdaptiveAdSize(@NotNull Context context) {
            p.k(context, GAMConfig.KEY_CONTEXT);
            return createAdaptiveAdSize$default(this, context, null, 2, null);
        }

        @Nullable
        public final LevelPlayAdSize createAdaptiveAdSize(@NotNull Context context, @Nullable Integer num) {
            p.k(context, GAMConfig.KEY_CONTEXT);
            return new C4011f1(new C4117l0()).a(context, num);
        }

        @NotNull
        public final LevelPlayAdSize createCustomSize(int i10, int i11) {
            return new LevelPlayAdSize(i10, i11, "CUSTOM", false, null, 16, null);
        }
    }

    public LevelPlayAdSize(int i10, int i11, @Nullable String str, boolean z10, @Nullable LevelPlayAdSize levelPlayAdSize) {
        this.f53490a = i10;
        this.f53491b = i11;
        this.f53492c = str;
        this.f53493d = z10;
        this.f53494e = levelPlayAdSize;
    }

    public /* synthetic */ LevelPlayAdSize(int i10, int i11, String str, boolean z10, LevelPlayAdSize levelPlayAdSize, int i12, i iVar) {
        this(i10, i11, (i12 & 4) != 0 ? null : str, z10, (i12 & 16) != 0 ? null : levelPlayAdSize);
    }

    @Nullable
    public static final LevelPlayAdSize createAdaptiveAdSize(@NotNull Context context) {
        return Companion.createAdaptiveAdSize(context);
    }

    @Nullable
    public static final LevelPlayAdSize createAdaptiveAdSize(@NotNull Context context, @Nullable Integer num) {
        return Companion.createAdaptiveAdSize(context, num);
    }

    @NotNull
    public static final LevelPlayAdSize createCustomSize(int i10, int i11) {
        return Companion.createCustomSize(i10, i11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.f(LevelPlayAdSize.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p.i(obj, "null cannot be cast to non-null type com.unity3d.mediation.LevelPlayAdSize");
        LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
        return this.f53490a == levelPlayAdSize.f53490a && this.f53491b == levelPlayAdSize.f53491b && p.f(this.f53492c, levelPlayAdSize.f53492c);
    }

    @NotNull
    public final String getDescription() {
        return String.valueOf(this.f53492c);
    }

    @Nullable
    public final LevelPlayAdSize getFallbackAdSize$mediationsdk_release() {
        return this.f53494e;
    }

    public final int getHeight() {
        return this.f53491b;
    }

    public final int getWidth() {
        return this.f53490a;
    }

    public int hashCode() {
        int i10 = ((this.f53490a * 31) + this.f53491b) * 31;
        String str = this.f53492c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isAdaptive() {
        return this.f53493d;
    }

    @NotNull
    public String toString() {
        return this.f53492c + Z7.f30794r + this.f53490a + VastAttributes.HORIZONTAL_POSITION + this.f53491b;
    }
}
