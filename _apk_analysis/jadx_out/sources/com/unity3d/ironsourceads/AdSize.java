package com.unity3d.ironsourceads;

import com.ironsource.mediationsdk.l;
import com.vungle.ads.internal.protos.Sdk;
import org.jetbrains.annotations.NotNull;
import tn.i;

/* JADX INFO: loaded from: classes9.dex */
public final class AdSize {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f53400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f53401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f53402c;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final AdSize banner() {
            return new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, "BANNER", null);
        }

        @NotNull
        public final AdSize large() {
            return new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 90, l.f32636b, null);
        }

        @NotNull
        public final AdSize leaderboard() {
            return new AdSize(728, 90, l.f32638d, null);
        }

        @NotNull
        public final AdSize mediumRectangle() {
            return new AdSize(300, 250, l.f32641g, null);
        }
    }

    private AdSize(int i10, int i11, String str) {
        this.f53400a = i10;
        this.f53401b = i11;
        this.f53402c = str;
    }

    public /* synthetic */ AdSize(int i10, int i11, String str, i iVar) {
        this(i10, i11, str);
    }

    @NotNull
    public static final AdSize banner() {
        return Companion.banner();
    }

    @NotNull
    public static final AdSize large() {
        return Companion.large();
    }

    @NotNull
    public static final AdSize leaderboard() {
        return Companion.leaderboard();
    }

    @NotNull
    public static final AdSize mediumRectangle() {
        return Companion.mediumRectangle();
    }

    public final int getHeight() {
        return this.f53401b;
    }

    @NotNull
    public final String getSizeDescription() {
        return this.f53402c;
    }

    public final int getWidth() {
        return this.f53400a;
    }
}
