package com.unity3d.ads.beta;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: InterstitialAd.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class InterstitialAd {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final AdObject adObject;

    @NotNull
    private final LoadOptions loadOptions;

    /* JADX INFO: compiled from: InterstitialAd.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final void load(@NotNull LoadOptions loadOptions, @NotNull LoadListener<InterstitialAd> loadListener) {
            p.k(loadOptions, "options");
            p.k(loadListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
    }

    public InterstitialAd(@NotNull AdObject adObject, @NotNull LoadOptions loadOptions) {
        p.k(adObject, "adObject");
        p.k(loadOptions, HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
        this.adObject = adObject;
        this.loadOptions = loadOptions;
    }

    public static final void load(@NotNull LoadOptions loadOptions, @NotNull LoadListener<InterstitialAd> loadListener) {
        Companion.load(loadOptions, loadListener);
    }

    public final void show(@NotNull Activity activity, @Nullable ShowOptions showOptions, @NotNull ShowListener<InterstitialAd> showListener) {
        p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        p.k(showListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }
}
