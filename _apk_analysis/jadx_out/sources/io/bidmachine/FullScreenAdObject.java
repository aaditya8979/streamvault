package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.AdObjectImpl;
import io.bidmachine.FullScreenAdRequest;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class FullScreenAdObject<AdRequestType extends FullScreenAdRequest<AdRequestType>> extends AdObjectImpl<AdRequestType, AdObjectParams, UnifiedFullscreenAd, UnifiedFullscreenAdCallback, UnifiedFullscreenAdRequestParams> {
    private final AtomicBoolean isShowing;
    private final b thresholdTask;

    public class a extends b {
        public a() {
            super(null);
        }

        @Override // io.bidmachine.FullScreenAdObject.b
        public void onTracked() {
            FullScreenAdObject.this.getProcessCallback().processVisibilityTrackerImpression();
        }
    }

    public static abstract class b implements Runnable {
        private b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        public void cancel() {
            Utils.cancelBackgroundThreadTask(this);
        }

        public abstract void onTracked();

        @Override // java.lang.Runnable
        public void run() {
            onTracked();
        }

        public void start(long j10) {
            Utils.onBackgroundThread(this, j10);
        }
    }

    public static final class c extends AdObjectImpl.BaseUnifiedAdCallback implements UnifiedFullscreenAdCallback {
        public c(@NonNull AdProcessCallback adProcessCallback) {
            super(adProcessCallback);
        }

        @Override // io.bidmachine.unified.UnifiedFullscreenAdCallback
        public void onAdClosed() {
            this.processCallback.processClosed();
        }

        @Override // io.bidmachine.unified.UnifiedFullscreenAdCallback
        public void onAdFinished() {
            this.processCallback.processFinished();
        }

        @Override // io.bidmachine.unified.UnifiedFullscreenAdCallback
        public void onAdLoaded() {
            this.processCallback.processLoadSuccess();
        }
    }

    public FullScreenAdObject(@NonNull ContextProvider contextProvider, @NonNull AdProcessCallback adProcessCallback, @NonNull AdRequestType adrequesttype, @NonNull AdObjectParams adObjectParams, @NonNull UnifiedFullscreenAd unifiedFullscreenAd) {
        super(contextProvider, adProcessCallback, adrequesttype, adObjectParams, unifiedFullscreenAd);
        this.isShowing = new AtomicBoolean(false);
        this.thresholdTask = new a();
    }

    private void cancelImpressionThresholdTask() {
        this.thresholdTask.cancel();
    }

    private void startImpressionThresholdTask() {
        this.thresholdTask.start(getParams().getVisibilityParams().getTimeThresholdMs());
    }

    @Override // io.bidmachine.AdObjectImpl, io.bidmachine.models.AdObject
    @NonNull
    public UnifiedFullscreenAdCallback createUnifiedCallback(@NonNull AdProcessCallback adProcessCallback) {
        return new c(adProcessCallback);
    }

    @Override // io.bidmachine.AdObjectImpl, io.bidmachine.models.AdObject
    public void onClosed(boolean z10) {
        this.isShowing.set(false);
        super.onClosed(z10);
        cancelImpressionThresholdTask();
    }

    @Override // io.bidmachine.AdObjectImpl, io.bidmachine.models.AdObject
    public void onFinished() {
        super.onFinished();
        cancelImpressionThresholdTask();
    }

    @Override // io.bidmachine.AdObjectImpl, io.bidmachine.models.AdObject
    public void onImpression() {
        super.onImpression();
        cancelImpressionThresholdTask();
    }

    @Override // io.bidmachine.AdObjectImpl, io.bidmachine.models.AdObject
    public void onShowFailed() {
        this.isShowing.set(false);
        super.onShowFailed();
    }

    @Override // io.bidmachine.AdObjectImpl, io.bidmachine.models.AdObject
    public void onShown() {
        super.onShown();
        startImpressionThresholdTask();
    }

    public void show(@NonNull ContextProvider contextProvider) throws Throwable {
        if (this.isShowing.get()) {
            Logger.d("Fullscreen ad already showing, please wait until the ad closes");
            return;
        }
        this.isShowing.set(true);
        getUnifiedAd().show(contextProvider, getUnifiedAdCallback());
        getProcessCallback().processFillAd();
    }
}
