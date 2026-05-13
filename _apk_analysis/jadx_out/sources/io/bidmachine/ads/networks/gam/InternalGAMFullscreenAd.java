package io.bidmachine.ads.networks.gam;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam.InternalGAMAd;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.utils.BMError;

/* JADX INFO: loaded from: classes6.dex */
public abstract class InternalGAMFullscreenAd extends InternalGAMAd {
    public InternalGAMFullscreenAd(@NonNull GAMLoader gAMLoader, @NonNull AdsFormat adsFormat, @NonNull GAMUnitData gAMUnitData) {
        super(gAMLoader, adsFormat, gAMUnitData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$0(Activity activity, InternalGAMFullscreenAdPresentListener internalGAMFullscreenAdPresentListener) {
        try {
            setStatus(InternalGAMAd.Status.Showing);
            showAd(activity, internalGAMFullscreenAdPresentListener);
        } catch (Throwable th2) {
            Logger.w(th2);
            internalGAMFullscreenAdPresentListener.onAdShowFailed(BMError.throwable("Exception showing InternalGAM object", th2));
        }
    }

    public final void show(@NonNull final Activity activity, @NonNull final InternalGAMFullscreenAdPresentListener internalGAMFullscreenAdPresentListener) {
        Utils.onUiThread(new Runnable() { // from class: qh.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f78280b.lambda$show$0(activity, internalGAMFullscreenAdPresentListener);
            }
        });
    }

    @UiThread
    public abstract void showAd(@NonNull Activity activity, @NonNull InternalGAMFullscreenAdPresentListener internalGAMFullscreenAdPresentListener) throws Throwable;
}
