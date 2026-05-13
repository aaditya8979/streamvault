package io.bidmachine.iab.mraid;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.CacheControl;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.measurer.MraidAdMeasurer;
import io.bidmachine.iab.mraid.MraidView;
import io.bidmachine.iab.utils.IabClickCallback;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.util.UiUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class MraidInterstitial {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicInteger f69236j = new AtomicInteger(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ boolean f69237k = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MraidView f69240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MraidInterstitialListener f69241d;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final int f69247id = f69236j.getAndIncrement();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f69242e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f69243f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f69244g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f69245h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f69246i = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f69238a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MraidViewListener f69239b = new b();

    public class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MraidView.Builder f69248a = new MraidView.Builder(MraidPlacementType.INTERSTITIAL);

        public Builder() {
        }

        public MraidInterstitial build(@NonNull Context context) {
            this.f69248a.setListener(MraidInterstitial.this.f69239b);
            MraidInterstitial.this.f69240c = this.f69248a.build(context);
            return MraidInterstitial.this;
        }

        public Builder forceUseNativeCloseButton(boolean z10) {
            this.f69248a.forceUseNativeCloseButton(z10);
            return this;
        }

        public Builder setAdMeasurer(@Nullable MraidAdMeasurer mraidAdMeasurer) {
            this.f69248a.setAdMeasurer(mraidAdMeasurer);
            return this;
        }

        public Builder setAllowedNativeFeatures(@Nullable String[] strArr) {
            this.f69248a.setAllowedNativeFeatures(strArr);
            return this;
        }

        public Builder setBaseUrl(String str) {
            this.f69248a.setBaseUrl(str);
            return this;
        }

        public Builder setCacheControl(@NonNull CacheControl cacheControl) {
            this.f69248a.setCacheControl(cacheControl);
            return this;
        }

        public Builder setCloseStyle(@Nullable IabElementStyle iabElementStyle) {
            this.f69248a.setCloseStyle(iabElementStyle);
            return this;
        }

        public Builder setCloseTime(float f10) {
            this.f69248a.setCloseTimeSec(f10);
            return this;
        }

        public Builder setCountDownStyle(@Nullable IabElementStyle iabElementStyle) {
            this.f69248a.setCountDownStyle(iabElementStyle);
            return this;
        }

        public Builder setDurationSec(float f10) {
            this.f69248a.setDurationSec(f10);
            return this;
        }

        public Builder setIsTag(boolean z10) {
            this.f69248a.setIsTag(z10);
            return this;
        }

        public Builder setListener(MraidInterstitialListener mraidInterstitialListener) {
            MraidInterstitial.this.f69241d = mraidInterstitialListener;
            return this;
        }

        public Builder setLoadingStyle(@Nullable IabElementStyle iabElementStyle) {
            this.f69248a.setLoadingStyle(iabElementStyle);
            return this;
        }

        public Builder setPageFinishedScript(String str) {
            this.f69248a.setPageFinishedScript(str);
            return this;
        }

        public Builder setPlaceholderTimeoutSec(float f10) {
            this.f69248a.setPlaceholderTimeoutSec(f10);
            return this;
        }

        public Builder setProductLink(String str) {
            this.f69248a.setProductLink(str);
            return this;
        }

        public Builder setProgressStyle(@Nullable IabElementStyle iabElementStyle) {
            this.f69248a.setProgressStyle(iabElementStyle);
            return this;
        }

        public Builder setR1(boolean z10) {
            this.f69248a.setR1(z10);
            return this;
        }

        public Builder setR2(boolean z10) {
            this.f69248a.setR2(z10);
            return this;
        }
    }

    public class b implements MraidViewListener {
        private b() {
        }

        @Override // io.bidmachine.iab.mraid.MraidViewListener
        public void onCalendarEvent(MraidView mraidView, String str, IabClickCallback iabClickCallback) {
            MraidLog.d("MraidInterstitial", "ViewListener - onCalendarEvent (%s)", str);
            if (MraidInterstitial.this.f69241d != null) {
                MraidInterstitial.this.f69241d.onCalendarEvent(MraidInterstitial.this, str, iabClickCallback);
            }
        }

        @Override // io.bidmachine.iab.mraid.MraidViewListener
        public void onClose(MraidView mraidView) {
            MraidLog.d("MraidInterstitial", "ViewListener - onClose", new Object[0]);
            MraidInterstitial.this.a();
            MraidInterstitial.this.b();
        }

        @Override // io.bidmachine.iab.mraid.MraidViewListener
        public void onExpand(MraidView mraidView) {
        }

        @Override // io.bidmachine.iab.mraid.MraidViewListener
        public void onExpired(MraidView mraidView, IabError iabError) {
            MraidLog.d("MraidInterstitial", "ViewListener - onExpired (%s)", iabError);
            if (MraidInterstitial.this.f69241d != null) {
                MraidInterstitial.this.f69241d.onExpired(MraidInterstitial.this, iabError);
            }
        }

        @Override // io.bidmachine.iab.mraid.MraidViewListener
        public void onLoadFailed(MraidView mraidView, IabError iabError) {
            MraidLog.d("MraidInterstitial", "ViewListener - onLoadFailed (%s)", iabError);
            MraidInterstitial.this.a();
            MraidInterstitial.this.a(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidViewListener
        public void onLoaded(MraidView mraidView) {
            MraidLog.d("MraidInterstitial", "ViewListener - onLoaded", new Object[0]);
            MraidInterstitial.this.c();
        }

        @Override // io.bidmachine.iab.mraid.MraidViewListener
        public void onOpenPrivacySheet(MraidView mraidView, PrivacySheetParams privacySheetParams) {
            MraidLog.d("MraidInterstitial", "ViewListener - onOpenPrivacySheet (%s)", privacySheetParams.toString());
            if (MraidInterstitial.this.f69241d != null) {
                MraidInterstitial.this.f69241d.onOpenPrivacySheet(MraidInterstitial.this, privacySheetParams);
            }
        }

        @Override // io.bidmachine.iab.mraid.MraidViewListener
        public void onOpenUrl(MraidView mraidView, String str, IabClickCallback iabClickCallback) {
            MraidLog.d("MraidInterstitial", "ViewListener - onOpenBrowser (%s)", str);
            if (MraidInterstitial.this.f69241d != null) {
                MraidInterstitial.this.f69241d.onOpenUrl(MraidInterstitial.this, str, iabClickCallback);
            }
        }

        @Override // io.bidmachine.iab.mraid.MraidViewListener
        public void onPlayVideo(MraidView mraidView, String str) {
            MraidLog.d("MraidInterstitial", "ViewListener - onPlayVideo (%s)", str);
            if (MraidInterstitial.this.f69241d != null) {
                MraidInterstitial.this.f69241d.onPlayVideo(MraidInterstitial.this, str);
            }
        }

        @Override // io.bidmachine.iab.mraid.MraidViewListener
        public void onShowFailed(MraidView mraidView, IabError iabError) {
            MraidLog.d("MraidInterstitial", "ViewListener - onShowFailed (%s)", iabError);
            MraidInterstitial.this.a();
            MraidInterstitial.this.b(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidViewListener
        public void onShown(MraidView mraidView) {
            MraidLog.d("MraidInterstitial", "ViewListener - onShown", new Object[0]);
            MraidInterstitial.this.d();
        }

        @Override // io.bidmachine.iab.mraid.MraidViewListener
        public void onStorePicture(MraidView mraidView, String str, IabClickCallback iabClickCallback) {
            MraidLog.d("MraidInterstitial", "ViewListener - onCalendarEvent (%s)", str);
            if (MraidInterstitial.this.f69241d != null) {
                MraidInterstitial.this.f69241d.onStorePicture(MraidInterstitial.this, str, iabClickCallback);
            }
        }
    }

    private MraidInterstitial() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        MraidView mraidView;
        Activity activityPeekActivity;
        if (!this.f69246i || (mraidView = this.f69240c) == null || (activityPeekActivity = mraidView.peekActivity()) == null) {
            return;
        }
        UiUtils.finishActivityWithoutAnimation(activityPeekActivity);
    }

    @NonNull
    public static Builder newBuilder() {
        return new MraidInterstitial().new Builder();
    }

    public void a(Activity activity, ViewGroup viewGroup, boolean z10, boolean z11) {
        if (!isReady()) {
            if (activity != null && z10) {
                UiUtils.finishActivityWithoutAnimation(activity);
            }
            c(IabError.incorrectState("Interstitial is not ready"));
            MraidLog.w("MraidInterstitial", "Show failed: interstitial is not ready", new Object[0]);
            return;
        }
        if (!f69237k && this.f69240c == null) {
            throw new AssertionError();
        }
        this.f69245h = z11;
        this.f69246i = z10;
        Utils.removeFromParent(this.f69240c);
        viewGroup.addView(this.f69240c, new ViewGroup.LayoutParams(-1, -1));
        this.f69240c.show(activity);
    }

    public void a(Activity activity, boolean z10) {
        a(activity, (ViewGroup) activity.findViewById(R.id.content), true, z10);
    }

    public void a(IabError iabError) {
        this.f69242e = false;
        this.f69244g = true;
        MraidInterstitialListener mraidInterstitialListener = this.f69241d;
        if (mraidInterstitialListener != null) {
            mraidInterstitialListener.onLoadFailed(this, iabError);
        }
    }

    public void b() {
        if (isClosed()) {
            return;
        }
        this.f69243f = true;
        MraidInterstitialListener mraidInterstitialListener = this.f69241d;
        if (mraidInterstitialListener != null) {
            mraidInterstitialListener.onClose(this);
        }
        if (this.f69245h) {
            destroy();
        }
    }

    public void b(IabError iabError) {
        this.f69242e = false;
        this.f69244g = true;
        c(iabError);
    }

    public void c() {
        this.f69242e = true;
        MraidInterstitialListener mraidInterstitialListener = this.f69241d;
        if (mraidInterstitialListener != null) {
            mraidInterstitialListener.onLoaded(this);
        }
    }

    public void c(IabError iabError) {
        MraidInterstitialListener mraidInterstitialListener = this.f69241d;
        if (mraidInterstitialListener != null) {
            mraidInterstitialListener.onShowFailed(this, iabError);
        }
    }

    public boolean canBeClosed() {
        MraidView mraidView = this.f69240c;
        return mraidView == null || mraidView.canBeClosed() || isReceivedError();
    }

    public void d() {
        this.f69238a.set(true);
        MraidInterstitialListener mraidInterstitialListener = this.f69241d;
        if (mraidInterstitialListener != null) {
            mraidInterstitialListener.onShown(this);
        }
    }

    public void destroy() {
        MraidLog.d("MraidInterstitial", "destroy", new Object[0]);
        this.f69242e = false;
        this.f69241d = null;
        MraidView mraidView = this.f69240c;
        if (mraidView != null) {
            mraidView.destroy();
            this.f69240c = null;
        }
    }

    public void dispatchClose() {
        if (this.f69240c == null || !canBeClosed()) {
            return;
        }
        this.f69240c.f();
    }

    public boolean isClosed() {
        return this.f69243f;
    }

    public boolean isReady() {
        return this.f69242e && this.f69240c != null;
    }

    public boolean isReceivedError() {
        return this.f69244g;
    }

    public boolean isShown() {
        return this.f69238a.get();
    }

    public void load(@Nullable String str) {
        MraidView mraidView = this.f69240c;
        if (mraidView == null) {
            throw new IllegalStateException("MraidView not created (mraidView == null)");
        }
        mraidView.load(str);
    }

    @Nullable
    public Context peekContext() {
        MraidView mraidView = this.f69240c;
        if (mraidView == null) {
            return null;
        }
        return mraidView.peekContext();
    }

    public void show(@Nullable Context context, @Nullable MraidType mraidType) {
        MraidActivity.show(context, this, mraidType);
    }

    public void showInView(@NonNull ViewGroup viewGroup, boolean z10) {
        a(null, viewGroup, false, z10);
    }
}
