package com.unity3d.ads.beta;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: BannerAd.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class BannerAd {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final AdObject adObject;

    @NotNull
    private final BannerLoadOptions loadOptions;

    /* JADX INFO: compiled from: BannerAd.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final void load(@NotNull BannerLoadOptions bannerLoadOptions, @NotNull LoadListener<BannerAd> loadListener) {
            p.k(bannerLoadOptions, "options");
            p.k(loadListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
    }

    public BannerAd(@NotNull AdObject adObject, @NotNull BannerLoadOptions bannerLoadOptions) {
        p.k(adObject, "adObject");
        p.k(bannerLoadOptions, HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
        this.adObject = adObject;
        this.loadOptions = bannerLoadOptions;
    }

    public static final void load(@NotNull BannerLoadOptions bannerLoadOptions, @NotNull LoadListener<BannerAd> loadListener) {
        Companion.load(bannerLoadOptions, loadListener);
    }
}
