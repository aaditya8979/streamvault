package io.bidmachine.iab.mraid;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.iab.CacheControl;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.IabSettings;
import io.bidmachine.iab.measurer.MraidAdMeasurer;
import io.bidmachine.iab.mraid.MraidAdView;
import io.bidmachine.iab.utils.Assets;
import io.bidmachine.iab.utils.IabClickCallback;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.iab.utils.IabLoadingWrapper;
import io.bidmachine.iab.utils.IabProgressWrapper;
import io.bidmachine.iab.utils.IabTimerHelper;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.iab.view.CloseableLayout;
import io.bidmachine.rendering.model.PrivacySheetParams;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"ViewConstructor"})
public class MraidView extends CloseableLayout implements CloseableLayout.OnCloseClickListener, IabClickCallback {
    private final IabElementStyle A;
    private final IabElementStyle B;
    private final IabElementStyle C;
    private final IabElementStyle D;
    private boolean E;
    private IabTimerHelper F;
    private IabProgressWrapper G;
    private Integer H;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final MutableContextWrapper f69273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MraidAdView f69274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CloseableLayout f69275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CloseableLayout f69276k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private IabLoadingWrapper f69277l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private WeakReference f69278m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f69279n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MraidViewListener f69280o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final MraidAdMeasurer f69281p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final CacheControl f69282q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final float f69283r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final float f69284s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f69285t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f69286u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f69287v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f69288w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final boolean f69289x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final AtomicBoolean f69290y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final CloseableLayout.OnCloseClickListener f69291z;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MraidPlacementType f69292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CacheControl f69293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f69294c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f69295d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f69296e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String[] f69297f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private IabElementStyle f69298g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private IabElementStyle f69299h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private IabElementStyle f69300i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private IabElementStyle f69301j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f69302k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f69303l;

        @VisibleForTesting
        public MraidViewListener listener;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f69304m;
        public MraidAdMeasurer mraidAdMeasurer;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f69305n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f69306o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f69307p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f69308q;

        public Builder() {
            this(MraidPlacementType.INLINE);
        }

        public Builder(MraidPlacementType mraidPlacementType) {
            this.f69297f = null;
            this.f69302k = 3.0f;
            this.f69303l = 0.0f;
            this.f69304m = 0.0f;
            this.f69292a = mraidPlacementType;
            this.f69293b = CacheControl.FullLoad;
            this.f69294c = IabSettings.DEF_BASE_URL;
        }

        public MraidView build(@NonNull Context context) {
            return new MraidView(context, this, null);
        }

        public Builder forceUseNativeCloseButton(boolean z10) {
            this.f69306o = z10;
            return this;
        }

        public Builder setAdMeasurer(@Nullable MraidAdMeasurer mraidAdMeasurer) {
            this.mraidAdMeasurer = mraidAdMeasurer;
            return this;
        }

        public Builder setAllowedNativeFeatures(@Nullable String[] strArr) {
            this.f69297f = strArr;
            return this;
        }

        public Builder setBaseUrl(String str) {
            this.f69294c = str;
            return this;
        }

        public Builder setCacheControl(@NonNull CacheControl cacheControl) {
            this.f69293b = cacheControl;
            return this;
        }

        public Builder setCloseStyle(IabElementStyle iabElementStyle) {
            this.f69298g = iabElementStyle;
            return this;
        }

        public Builder setCloseTimeSec(float f10) {
            this.f69303l = f10;
            return this;
        }

        public Builder setCountDownStyle(IabElementStyle iabElementStyle) {
            this.f69299h = iabElementStyle;
            return this;
        }

        public Builder setDurationSec(float f10) {
            this.f69304m = f10;
            return this;
        }

        public Builder setIsTag(boolean z10) {
            this.f69305n = z10;
            return this;
        }

        public Builder setListener(MraidViewListener mraidViewListener) {
            this.listener = mraidViewListener;
            return this;
        }

        public Builder setLoadingStyle(IabElementStyle iabElementStyle) {
            this.f69300i = iabElementStyle;
            return this;
        }

        public Builder setPageFinishedScript(String str) {
            this.f69296e = str;
            return this;
        }

        public Builder setPlaceholderTimeoutSec(float f10) {
            this.f69302k = f10;
            return this;
        }

        public Builder setProductLink(String str) {
            this.f69295d = str;
            return this;
        }

        public Builder setProgressStyle(IabElementStyle iabElementStyle) {
            this.f69301j = iabElementStyle;
            return this;
        }

        public Builder setR1(boolean z10) {
            this.f69307p = z10;
            return this;
        }

        public Builder setR2(boolean z10) {
            this.f69308q = z10;
            return this;
        }
    }

    public class a implements IabTimerHelper.TimerHelperCallback {
        public a() {
        }

        @Override // io.bidmachine.iab.utils.IabTimerHelper.TimerHelperCallback
        public void onTimerFinish() {
            if (MraidView.this.G != null) {
                MraidView.this.G.detach();
            }
            if (MraidView.this.f69274i.isOpenNotified() || !MraidView.this.f69289x || MraidView.this.f69285t <= 0.0f) {
                return;
            }
            MraidView.this.g();
        }

        @Override // io.bidmachine.iab.utils.IabTimerHelper.TimerHelperCallback
        public void onTimerTick(float f10, long j10, long j11) {
            int i10 = (int) (j11 / 1000);
            int i11 = (int) (j10 / 1000);
            if (MraidView.this.G != null) {
                MraidView.this.G.changePercentage(f10, i11, i10);
            }
        }
    }

    public class b implements CloseableLayout.OnCloseClickListener {
        public b() {
        }

        @Override // io.bidmachine.iab.view.CloseableLayout.OnCloseClickListener
        public void onCloseClick() {
            MraidView.this.c(IabError.placeholder("Close button clicked"));
            MraidView.this.j();
        }

        @Override // io.bidmachine.iab.view.CloseableLayout.OnCloseClickListener
        public void onCountDownFinish() {
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MraidViewState mraidViewState = MraidView.this.f69274i.getMraidViewState();
            if (mraidViewState == MraidViewState.RESIZED) {
                MraidView.this.e();
                return;
            }
            if (mraidViewState == MraidViewState.EXPANDED) {
                MraidView.this.d();
            } else if (MraidView.this.h()) {
                MraidView.this.f69274i.close();
                MraidView.this.j();
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MraidView.this.f69274i.updateMetrics(null);
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69313a;

        static {
            int[] iArr = new int[CacheControl.values().length];
            f69313a = iArr;
            try {
                iArr[CacheControl.FullLoad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69313a[CacheControl.Stream.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69313a[CacheControl.PartialLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class f implements MraidAdView.Listener {
        private f() {
        }

        public /* synthetic */ f(MraidView mraidView, a aVar) {
            this();
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onCalendarEventIntention(MraidAdView mraidAdView, String str) {
            MraidView.this.b(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onChangeOrientationIntention(MraidAdView mraidAdView, MraidOrientationProperties mraidOrientationProperties) {
            MraidView.this.a(mraidOrientationProperties);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onCloseIntention(MraidAdView mraidAdView) {
            MraidView.this.f();
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public boolean onExpandIntention(MraidAdView mraidAdView, WebView webView, MraidOrientationProperties mraidOrientationProperties, boolean z10) {
            return MraidView.this.a(webView, mraidOrientationProperties, z10);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onExpanded(MraidAdView mraidAdView) {
            MraidView.this.k();
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onMraidAdViewExpired(MraidAdView mraidAdView, IabError iabError) {
            MraidView.this.a(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onMraidAdViewLoadFailed(MraidAdView mraidAdView, IabError iabError) {
            MraidView.this.b(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onMraidAdViewPageLoaded(MraidAdView mraidAdView, String str, WebView webView, boolean z10) {
            MraidView.this.a(str, webView, z10);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onMraidAdViewShowFailed(MraidAdView mraidAdView, IabError iabError) {
            MraidView.this.c(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onMraidAdViewShown(MraidAdView mraidAdView) {
            MraidView.this.m();
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onMraidLoadedIntention(MraidAdView mraidAdView) {
            MraidView.this.l();
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onOpenPrivacySheet(MraidAdView mraidAdView, PrivacySheetParams privacySheetParams) {
            MraidView.this.a(privacySheetParams);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onOpenUrlIntention(MraidAdView mraidAdView, String str) {
            MraidView.this.c(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onPlayVideoIntention(MraidAdView mraidAdView, String str) {
            MraidView.this.a(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public boolean onResizeIntention(MraidAdView mraidAdView, WebView webView, MraidResizeProperties mraidResizeProperties, MraidScreenMetrics mraidScreenMetrics) {
            return MraidView.this.a(webView, mraidResizeProperties, mraidScreenMetrics);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onStorePictureIntention(MraidAdView mraidAdView, String str) {
            MraidView.this.d(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onSyncCustomCloseIntention(MraidAdView mraidAdView, boolean z10) {
            if (MraidView.this.f69287v) {
                return;
            }
            if (z10 && !MraidView.this.E) {
                MraidView.this.E = true;
            }
            MraidView.this.a(z10);
        }
    }

    private MraidView(@NonNull Context context, @NonNull Builder builder) {
        super(context);
        this.f69290y = new AtomicBoolean(false);
        this.E = false;
        this.f69273h = new MutableContextWrapper(context);
        this.f69280o = builder.listener;
        this.f69282q = builder.f69293b;
        this.f69283r = builder.f69302k;
        this.f69284s = builder.f69303l;
        float f10 = builder.f69304m;
        this.f69285t = f10;
        this.f69286u = builder.f69305n;
        this.f69287v = builder.f69306o;
        this.f69288w = builder.f69307p;
        this.f69289x = builder.f69308q;
        MraidAdMeasurer mraidAdMeasurer = builder.mraidAdMeasurer;
        this.f69281p = mraidAdMeasurer;
        this.A = builder.f69298g;
        this.B = builder.f69299h;
        this.C = builder.f69300i;
        IabElementStyle iabElementStyle = builder.f69301j;
        this.D = iabElementStyle;
        MraidAdView mraidAdViewBuild = new MraidAdView.Builder(context.getApplicationContext(), builder.f69292a, new f(this, null)).setBaseUrl(builder.f69294c).setProductLink(builder.f69295d).setAllowedNativeFeatures(builder.f69297f).setPageFinishedScript(builder.f69296e).build();
        this.f69274i = mraidAdViewBuild;
        addView(mraidAdViewBuild, new FrameLayout.LayoutParams(-1, -1, 17));
        if (f10 > 0.0f) {
            IabProgressWrapper iabProgressWrapper = new IabProgressWrapper(null);
            this.G = iabProgressWrapper;
            iabProgressWrapper.attach(context, this, iabElementStyle);
            IabTimerHelper iabTimerHelper = new IabTimerHelper(this, new a());
            this.F = iabTimerHelper;
            iabTimerHelper.setTime(f10);
        }
        this.f69291z = new b();
        setCloseClickListener(this);
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.registerAdContainer(this);
            mraidAdMeasurer.registerAdView(mraidAdViewBuild.getWebView());
        }
    }

    public /* synthetic */ MraidView(Context context, Builder builder, a aVar) {
        this(context, builder);
    }

    private void a(Activity activity) {
        Integer num = this.H;
        if (num != null) {
            activity.setRequestedOrientation(num.intValue());
            this.H = null;
        }
    }

    private void a(View view) {
        if (view == null) {
            return;
        }
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
        }
        Utils.removeFromParent(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IabError iabError) {
        MraidAdMeasurer mraidAdMeasurer = this.f69281p;
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.onError(iabError);
        }
        MraidViewListener mraidViewListener = this.f69280o;
        if (mraidViewListener != null) {
            mraidViewListener.onExpired(this, iabError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MraidOrientationProperties mraidOrientationProperties) {
        if (mraidOrientationProperties == null) {
            return;
        }
        Activity activityPeekActivity = peekActivity();
        MraidLog.d("MraidView", "applyOrientation: %s", mraidOrientationProperties);
        if (activityPeekActivity == null) {
            MraidLog.d("MraidView", "no any interacted activities", new Object[0]);
        } else {
            b(activityPeekActivity);
            activityPeekActivity.setRequestedOrientation(mraidOrientationProperties.obtainTargetActivityOrientation(activityPeekActivity));
        }
    }

    private void a(MraidResizeProperties mraidResizeProperties, MraidScreenMetrics mraidScreenMetrics) {
        MraidLog.d("MraidView", "setResizedViewSizeAndPosition: %s", mraidResizeProperties);
        if (this.f69275j == null) {
            return;
        }
        int iDpToPx = Utils.dpToPx(getContext(), mraidResizeProperties.width);
        int iDpToPx2 = Utils.dpToPx(getContext(), mraidResizeProperties.height);
        int iDpToPx3 = Utils.dpToPx(getContext(), mraidResizeProperties.offsetX);
        int iDpToPx4 = Utils.dpToPx(getContext(), mraidResizeProperties.offsetY);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPx, iDpToPx2);
        Rect rectB = mraidScreenMetrics.b();
        int i10 = rectB.left + iDpToPx3;
        int i11 = rectB.top + iDpToPx4;
        layoutParams.leftMargin = i10;
        layoutParams.topMargin = i11;
        this.f69275j.setLayoutParams(layoutParams);
    }

    private void a(CloseableLayout closeableLayout, boolean z10) {
        setCloseClickListener(this);
        closeableLayout.setCloseStyle(this.A);
        closeableLayout.setCountDownStyle(this.B);
        a(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(PrivacySheetParams privacySheetParams) {
        MraidViewListener mraidViewListener = this.f69280o;
        if (mraidViewListener == null) {
            return;
        }
        mraidViewListener.onOpenPrivacySheet(this, privacySheetParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        MraidViewListener mraidViewListener = this.f69280o;
        if (mraidViewListener != null) {
            mraidViewListener.onPlayVideo(this, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, WebView webView, boolean z10) {
        setLoadingVisible(false);
        if (h()) {
            a((CloseableLayout) this, z10);
        }
        MraidAdMeasurer mraidAdMeasurer = this.f69281p;
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.onAdViewReady(webView);
        }
        if (this.f69282q != CacheControl.FullLoad || this.f69286u || str.equals("data:text/html,<html></html>")) {
            return;
        }
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        boolean z11 = !z10 || this.f69287v;
        CloseableLayout closeableLayout = this.f69275j;
        if (closeableLayout != null || (closeableLayout = this.f69276k) != null) {
            closeableLayout.setCloseVisibility(z11, this.f69284s);
        } else if (h()) {
            setCloseVisibility(z11, this.E ? 0.0f : this.f69284s);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, MraidOrientationProperties mraidOrientationProperties, boolean z10) {
        CloseableLayout closeableLayout = this.f69276k;
        if (closeableLayout == null || closeableLayout.getParent() == null) {
            View topmostView = MraidUtils.getTopmostView(peekContext(), this);
            if (!(topmostView instanceof ViewGroup)) {
                MraidLog.e("MraidView", "Can't add resized view because can't find required parent", new Object[0]);
                return false;
            }
            CloseableLayout closeableLayout2 = new CloseableLayout(getContext());
            this.f69276k = closeableLayout2;
            closeableLayout2.setCloseClickListener(this);
            ((ViewGroup) topmostView).addView(this.f69276k);
        }
        Utils.removeFromParent(webView);
        this.f69276k.addView(webView);
        a(this.f69276k, z10);
        a(mraidOrientationProperties);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, MraidResizeProperties mraidResizeProperties, MraidScreenMetrics mraidScreenMetrics) {
        CloseableLayout closeableLayout = this.f69275j;
        if (closeableLayout == null || closeableLayout.getParent() == null) {
            View topmostView = MraidUtils.getTopmostView(peekContext(), this);
            if (!(topmostView instanceof ViewGroup)) {
                MraidLog.e("MraidView", "Can't add resized view because can't find required parent", new Object[0]);
                return false;
            }
            CloseableLayout closeableLayout2 = new CloseableLayout(getContext());
            this.f69275j = closeableLayout2;
            closeableLayout2.setCloseClickListener(this);
            ((ViewGroup) topmostView).addView(this.f69275j);
        }
        Utils.removeFromParent(webView);
        this.f69275j.addView(webView);
        IabElementStyle iabElementStyleResolveDefCloseStyle = Assets.resolveDefCloseStyle(getContext(), this.A);
        iabElementStyleResolveDefCloseStyle.setHorizontalPosition(Integer.valueOf(mraidResizeProperties.customClosePosition.getGravity() & 7));
        iabElementStyleResolveDefCloseStyle.setVerticalPosition(Integer.valueOf(mraidResizeProperties.customClosePosition.getGravity() & 112));
        this.f69275j.setCloseStyle(iabElementStyleResolveDefCloseStyle);
        this.f69275j.setCloseVisibility(false, this.f69284s);
        a(mraidResizeProperties, mraidScreenMetrics);
        return true;
    }

    private void b(Activity activity) {
        this.H = Integer.valueOf(activity.getRequestedOrientation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(IabError iabError) {
        MraidAdMeasurer mraidAdMeasurer = this.f69281p;
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.onError(iabError);
        }
        MraidViewListener mraidViewListener = this.f69280o;
        if (mraidViewListener != null) {
            mraidViewListener.onLoadFailed(this, iabError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (this.f69280o == null) {
            return;
        }
        setLoadingVisible(true);
        MraidAdMeasurer mraidAdMeasurer = this.f69281p;
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.onAdClicked();
        }
        this.f69280o.onCalendarEvent(this, str, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(IabError iabError) {
        MraidAdMeasurer mraidAdMeasurer = this.f69281p;
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.onError(iabError);
        }
        MraidViewListener mraidViewListener = this.f69280o;
        if (mraidViewListener != null) {
            mraidViewListener.onShowFailed(this, iabError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (this.f69280o == null) {
            return;
        }
        setLoadingVisible(true);
        MraidAdMeasurer mraidAdMeasurer = this.f69281p;
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.onAdClicked();
        }
        this.f69280o.onOpenUrl(this, str, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        a((View) this.f69276k);
        this.f69276k = null;
        Activity activityPeekActivity = peekActivity();
        if (activityPeekActivity != null) {
            a(activityPeekActivity);
        }
        this.f69274i.closeExpanded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        if (this.f69280o == null) {
            return;
        }
        setLoadingVisible(true);
        MraidAdMeasurer mraidAdMeasurer = this.f69281p;
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.onAdClicked();
        }
        this.f69280o.onStorePicture(this, str, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        a((View) this.f69275j);
        this.f69275j = null;
        this.f69274i.closeResized();
    }

    private void e(String str) {
        this.f69274i.load(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        IabElementStyle iabElementStyleResolveDefCloseStyle = Assets.resolveDefCloseStyle(getContext(), this.A);
        this.f69274i.handleRedirectScreen(iabElementStyleResolveDefCloseStyle.getHorizontalPosition().intValue(), iabElementStyleResolveDefCloseStyle.getVerticalPosition().intValue());
    }

    private boolean i() {
        return this.f69274i.isLoaded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        MraidViewListener mraidViewListener = this.f69280o;
        if (mraidViewListener != null) {
            mraidViewListener.onClose(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        MraidViewListener mraidViewListener = this.f69280o;
        if (mraidViewListener != null) {
            mraidViewListener.onExpand(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        MraidViewListener mraidViewListener;
        if (this.f69290y.getAndSet(true) || (mraidViewListener = this.f69280o) == null) {
            return;
        }
        mraidViewListener.onLoaded(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        MraidAdMeasurer mraidAdMeasurer = this.f69281p;
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.onAdShown();
        }
        MraidViewListener mraidViewListener = this.f69280o;
        if (mraidViewListener != null) {
            mraidViewListener.onShown(this);
        }
    }

    private void n() {
        setCloseClickListener(this.f69291z);
        setCloseVisibility(true, this.f69283r);
    }

    @Override // io.bidmachine.iab.view.CloseableLayout
    public boolean canBeClosed() {
        if (getOnScreenTimeMs() > MraidUtils.MAX_ON_SCREEN_TIME_MS || this.f69274i.isReceivedJsError()) {
            return true;
        }
        if (this.f69287v || !this.f69274i.isUseCustomClose()) {
            return super.canBeClosed();
        }
        return false;
    }

    @Override // io.bidmachine.iab.utils.IabClickCallback
    public void clickHandleCanceled() {
        setLoadingVisible(false);
    }

    @Override // io.bidmachine.iab.utils.IabClickCallback
    public void clickHandleError() {
        setLoadingVisible(false);
    }

    @Override // io.bidmachine.iab.utils.IabClickCallback
    public void clickHandled() {
        setLoadingVisible(false);
    }

    public void destroy() {
        this.f69280o = null;
        this.f69278m = null;
        Activity activityPeekActivity = peekActivity();
        if (activityPeekActivity != null) {
            a(activityPeekActivity);
        }
        a((View) this.f69275j);
        a((View) this.f69276k);
        this.f69274i.destroy();
        IabTimerHelper iabTimerHelper = this.F;
        if (iabTimerHelper != null) {
            iabTimerHelper.detach();
        }
    }

    @Override // io.bidmachine.iab.view.CloseableLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void f() {
        if (this.f69274i.isOpenNotified() || !this.f69288w) {
            Utils.onUiThread(new c());
        } else {
            g();
        }
    }

    public boolean h() {
        return this.f69274i.isInterstitial();
    }

    public void load(@Nullable String str) {
        MraidAdMeasurer mraidAdMeasurer = this.f69281p;
        if (mraidAdMeasurer != null && str != null) {
            str = mraidAdMeasurer.prepareCreativeForMeasure(str);
        }
        int i10 = e.f69313a[this.f69282q.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                this.f69279n = str;
                l();
                return;
            } else if (i10 != 3) {
                return;
            } else {
                l();
            }
        }
        e(str);
    }

    @Override // io.bidmachine.iab.view.CloseableLayout.OnCloseClickListener
    public void onCloseClick() {
        f();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MraidLog.d("MraidView", "onConfigurationChanged: %s", Utils.orientationToString(configuration.orientation));
        Utils.onUiThread(new d());
    }

    @Override // io.bidmachine.iab.view.CloseableLayout.OnCloseClickListener
    public void onCountDownFinish() {
        if (!this.f69274i.isOpenNotified() && this.f69289x && this.f69285t == 0.0f) {
            g();
        }
    }

    @Override // io.bidmachine.iab.view.CloseableLayout, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Nullable
    public Activity peekActivity() {
        WeakReference weakReference = this.f69278m;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    @NonNull
    public Context peekContext() {
        Activity activityPeekActivity = peekActivity();
        return activityPeekActivity == null ? getContext() : activityPeekActivity;
    }

    public void setLastInteractedActivity(@Nullable Activity activity) {
        if (activity != null) {
            this.f69278m = new WeakReference(activity);
            this.f69273h.setBaseContext(activity);
        }
    }

    public void setLoadingVisible(boolean z10) {
        if (!z10) {
            IabLoadingWrapper iabLoadingWrapper = this.f69277l;
            if (iabLoadingWrapper != null) {
                iabLoadingWrapper.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f69277l == null) {
            IabLoadingWrapper iabLoadingWrapper2 = new IabLoadingWrapper(null);
            this.f69277l = iabLoadingWrapper2;
            iabLoadingWrapper2.attach(getContext(), this, this.C);
        }
        this.f69277l.setVisibility(0);
        this.f69277l.bringToFront();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void show(@androidx.annotation.Nullable android.app.Activity r3) {
        /*
            r2 = this;
            int[] r0 = io.bidmachine.iab.mraid.MraidView.e.f69313a
            io.bidmachine.iab.CacheControl r1 = r2.f69282q
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L3d
            r1 = 2
            if (r0 == r1) goto L2b
            r1 = 3
            if (r0 == r1) goto L14
            goto L4c
        L14:
            boolean r0 = r2.i()
            if (r0 == 0) goto L21
            boolean r0 = r2.h()
            if (r0 == 0) goto L4c
            goto L43
        L21:
            boolean r0 = r2.h()
            if (r0 == 0) goto L4c
            r2.n()
            goto L4c
        L2b:
            boolean r0 = r2.h()
            if (r0 == 0) goto L34
            r2.n()
        L34:
            java.lang.String r0 = r2.f69279n
            r2.e(r0)
            r0 = 0
            r2.f69279n = r0
            goto L4c
        L3d:
            boolean r0 = r2.h()
            if (r0 == 0) goto L4c
        L43:
            io.bidmachine.iab.mraid.MraidAdView r0 = r2.f69274i
            boolean r0 = r0.isUseCustomClose()
            r2.a(r2, r0)
        L4c:
            io.bidmachine.iab.mraid.MraidAdView r0 = r2.f69274i
            r0.show()
            r2.setLastInteractedActivity(r3)
            io.bidmachine.iab.mraid.MraidAdView r3 = r2.f69274i
            io.bidmachine.iab.mraid.MraidOrientationProperties r3 = r3.getLastOrientationProperties()
            r2.a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.iab.mraid.MraidView.show(android.app.Activity):void");
    }
}
