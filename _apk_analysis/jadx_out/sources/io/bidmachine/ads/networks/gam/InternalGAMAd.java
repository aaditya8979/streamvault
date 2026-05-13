package io.bidmachine.ads.networks.gam;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import io.bidmachine.AdsFormat;
import io.bidmachine.ExpirationHandler;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public abstract class InternalGAMAd implements ExpirationHandler.Listener {

    @NonNull
    private final AdsFormat adsFormat;

    @NonNull
    private final ExpirationHandler expirationHandler;

    @NonNull
    private final GAMLoader gamLoader;

    @NonNull
    private final GAMUnitData gamUnitData;

    @Nullable
    private volatile Status status = Status.Idle;

    @NonNull
    private final Tag tag;

    @Nullable
    private WeakReference<InternalGAMAdPresentListener> weakAdPresentListener;

    public enum Status {
        Idle,
        Loading,
        Loaded,
        Showing,
        Shown,
        Expired
    }

    public InternalGAMAd(@NonNull GAMLoader gAMLoader, @NonNull AdsFormat adsFormat, @NonNull GAMUnitData gAMUnitData) {
        this.tag = new Tag(gAMLoader.getNetworkName() + VastTagName.AD);
        this.gamLoader = gAMLoader;
        this.adsFormat = adsFormat;
        this.gamUnitData = gAMUnitData;
        this.expirationHandler = new ExpirationHandler(gAMLoader.getExpirationTimeMs(), this);
    }

    private void destroy(boolean z10) {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: qh.q
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f78271a.lambda$destroy$3();
            }
        });
        WeakReference<InternalGAMAdPresentListener> weakReference = this.weakAdPresentListener;
        if (weakReference != null) {
            weakReference.clear();
            this.weakAdPresentListener = null;
        }
        this.expirationHandler.stop();
        this.gamLoader.onGAMAdDestroy(this, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$destroy$3() {
        return String.format("destroy (%s)", this.gamUnitData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$load$4() {
        return String.format("load (%s)", this.gamUnitData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$5(Context context, InternalLoadListener internalLoadListener) {
        try {
            setStatus(Status.Loading);
            loadAd(context, internalLoadListener);
        } catch (Throwable th2) {
            Logger.w(th2);
            internalLoadListener.onAdLoadFailed(this, BMError.throwable("Exception loading InternalGAM object", th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$onAdLoaded$0() {
        return String.format("onAdLoaded (%s)", this.gamUnitData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$onAdShown$1() {
        return String.format("onAdShown (%s)", this.gamUnitData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$onExpired$2() {
        return String.format("onExpired (%s)", this.gamUnitData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$6() {
        try {
            destroyAd();
        } catch (Throwable th2) {
            Logger.w(th2);
        }
    }

    public void destroy() {
        destroy(isShown());
    }

    @UiThread
    public abstract void destroyAd() throws Throwable;

    @Nullable
    public InternalGAMAdPresentListener getAdPresentListener() {
        WeakReference<InternalGAMAdPresentListener> weakReference = this.weakAdPresentListener;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @NonNull
    public String getAdUnitId() {
        return getGamUnitData().getAdUnitId();
    }

    @NonNull
    public AdsFormat getAdsFormat() {
        return this.adsFormat;
    }

    @NonNull
    public GAMLoader getGamLoader() {
        return this.gamLoader;
    }

    @NonNull
    public GAMUnitData getGamUnitData() {
        return this.gamUnitData;
    }

    public float getScope() {
        return getGamUnitData().getScore();
    }

    public boolean isExpired() {
        return this.status == Status.Expired;
    }

    public boolean isLoaded() {
        return this.status == Status.Loaded;
    }

    public boolean isShown() {
        Status status = this.status;
        return status != null && status.ordinal() >= Status.Shown.ordinal();
    }

    public final void load(@NonNull Context context, @NonNull final InternalLoadListener internalLoadListener) {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: qh.s
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f78273a.lambda$load$4();
            }
        });
        final Context applicationContext = context.getApplicationContext();
        Utils.onUiThread(new Runnable() { // from class: qh.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f78274b.lambda$load$5(applicationContext, internalLoadListener);
            }
        });
    }

    @UiThread
    public abstract void loadAd(@NonNull Context context, @NonNull InternalLoadListener internalLoadListener) throws Throwable;

    public void onAdLoaded() {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: qh.w
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f78279a.lambda$onAdLoaded$0();
            }
        });
        setStatus(Status.Loaded);
        this.expirationHandler.start();
    }

    public void onAdShown() {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: qh.v
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f78278a.lambda$onAdShown$1();
            }
        });
        this.gamLoader.onGAMAdShown(this);
        setStatus(Status.Shown);
        this.expirationHandler.stop();
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        if (isShown()) {
            return;
        }
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: qh.r
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f78272a.lambda$onExpired$2();
            }
        });
        setStatus(Status.Expired);
        InternalGAMAdPresentListener adPresentListener = getAdPresentListener();
        if (adPresentListener != null) {
            adPresentListener.onAdExpired();
        }
        destroy(true);
        this.gamLoader.load(this.adsFormat);
    }

    public final void release() {
        Utils.onUiThread(new Runnable() { // from class: qh.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f78277b.lambda$release$6();
            }
        });
    }

    public void setAdPresentListener(@Nullable InternalGAMAdPresentListener internalGAMAdPresentListener) {
        this.weakAdPresentListener = new WeakReference<>(internalGAMAdPresentListener);
    }

    public void setStatus(@NonNull Status status) {
        this.status = status;
    }

    @NonNull
    public String toString() {
        return this.tag + ", " + getGamUnitData();
    }
}
