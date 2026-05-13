package io.bidmachine.iab.mraid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.IabSettings;
import io.bidmachine.iab.bridge.JsBridgeHandler;
import io.bidmachine.iab.mraid.MraidWebViewController;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.utils.PrivacySheetParamsParser;
import io.bidmachine.util.Executable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"ViewConstructor"})
public class MraidAdView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MraidPlacementType f69183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f69185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f69186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f69187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f69188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f69189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f69190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f69191i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f69192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f69193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final GestureDetector f69194l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final MraidScreenMetrics f69195m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ViewOnScreenObserver f69196n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final MraidNativeFeatureManager f69197o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final MraidNativeFeatureSchemeValidator f69198p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final fi.g f69199q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final MraidWebViewController f69200r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Listener f69201s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private MraidWebViewController f69202t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private MraidViewState f69203u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Runnable f69204v;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f69205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MraidPlacementType f69206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Listener f69207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f69208d = IabSettings.DEF_BASE_URL;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f69209e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f69210f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f69211g;

        public Builder(@NonNull Context context, @Nullable MraidPlacementType mraidPlacementType, @NonNull Listener listener) {
            this.f69205a = context;
            this.f69206b = mraidPlacementType;
            this.f69207c = listener;
        }

        public MraidAdView build() {
            return new MraidAdView(this.f69205a, this.f69206b, this.f69208d, this.f69211g, this.f69209e, this.f69210f, this.f69207c);
        }

        public Builder setAllowedNativeFeatures(@Nullable List<String> list) {
            this.f69209e = list;
            return this;
        }

        public Builder setAllowedNativeFeatures(@Nullable String[] strArr) {
            this.f69209e = strArr != null ? Arrays.asList(strArr) : null;
            return this;
        }

        public Builder setBaseUrl(@Nullable String str) {
            this.f69208d = str;
            return this;
        }

        public Builder setPageFinishedScript(@Nullable String str) {
            this.f69210f = str;
            return this;
        }

        public Builder setProductLink(@Nullable String str) {
            this.f69211g = str;
            return this;
        }
    }

    public interface Listener {
        void onCalendarEventIntention(@NonNull MraidAdView mraidAdView, @NonNull String str);

        void onChangeOrientationIntention(@NonNull MraidAdView mraidAdView, @NonNull MraidOrientationProperties mraidOrientationProperties);

        void onCloseIntention(@NonNull MraidAdView mraidAdView);

        boolean onExpandIntention(@NonNull MraidAdView mraidAdView, @NonNull WebView webView, @Nullable MraidOrientationProperties mraidOrientationProperties, boolean z10);

        void onExpanded(@NonNull MraidAdView mraidAdView);

        void onMraidAdViewExpired(@NonNull MraidAdView mraidAdView, @NonNull IabError iabError);

        void onMraidAdViewLoadFailed(@NonNull MraidAdView mraidAdView, @NonNull IabError iabError);

        void onMraidAdViewPageLoaded(@NonNull MraidAdView mraidAdView, @NonNull String str, @NonNull WebView webView, boolean z10);

        void onMraidAdViewShowFailed(@NonNull MraidAdView mraidAdView, @NonNull IabError iabError);

        void onMraidAdViewShown(@NonNull MraidAdView mraidAdView);

        void onMraidLoadedIntention(@NonNull MraidAdView mraidAdView);

        void onOpenPrivacySheet(@NonNull MraidAdView mraidAdView, @NonNull PrivacySheetParams privacySheetParams);

        void onOpenUrlIntention(@NonNull MraidAdView mraidAdView, @NonNull String str);

        void onPlayVideoIntention(@NonNull MraidAdView mraidAdView, @NonNull String str);

        boolean onResizeIntention(@NonNull MraidAdView mraidAdView, @NonNull WebView webView, @NonNull MraidResizeProperties mraidResizeProperties, @NonNull MraidScreenMetrics mraidScreenMetrics);

        void onStorePictureIntention(@NonNull MraidAdView mraidAdView, @NonNull String str);

        void onSyncCustomCloseIntention(@NonNull MraidAdView mraidAdView, boolean z10);
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f69212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f69213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f69214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f69215d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MraidWebViewController f69216e;

        /* JADX INFO: renamed from: io.bidmachine.iab.mraid.MraidAdView$a$a, reason: collision with other inner class name */
        public class RunnableC0800a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Point f69218a;

            /* JADX INFO: renamed from: io.bidmachine.iab.mraid.MraidAdView$a$a$a, reason: collision with other inner class name */
            public class RunnableC0801a implements Runnable {
                public RunnableC0801a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    MraidAdView.this.c();
                }
            }

            public RunnableC0800a(Point point) {
                this.f69218a = point;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC0801a runnableC0801a = new RunnableC0801a();
                a aVar = a.this;
                MraidAdView mraidAdView = MraidAdView.this;
                Point point = this.f69218a;
                mraidAdView.b(point.x, point.y, aVar.f69216e, runnableC0801a);
            }
        }

        public a(int i10, int i11, int i12, int i13, MraidWebViewController mraidWebViewController) {
            this.f69212a = i10;
            this.f69213b = i11;
            this.f69214c = i12;
            this.f69215d = i13;
            this.f69216e = mraidWebViewController;
        }

        @Override // java.lang.Runnable
        public void run() {
            Point clickPoint = Utils.getClickPoint(this.f69212a, this.f69213b, this.f69214c, this.f69215d);
            MraidAdView.this.a(clickPoint.x, clickPoint.y, this.f69216e, new RunnableC0800a(clickPoint));
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f69221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f69222b;

        public b(View view, Runnable runnable) {
            this.f69221a = view;
            this.f69222b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            MraidAdView.this.a(this.f69221a);
            Runnable runnable = this.f69222b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MraidAdView.this.f69202t.applySupportedServices(MraidAdView.this.f69197o);
            if (MraidAdView.this.f69183a != null) {
                MraidAdView.this.f69202t.applyPlacement(MraidAdView.this.f69183a);
            }
            MraidAdView.this.f69202t.applyViewable(MraidAdView.this.f69202t.isViewable());
            MraidAdView.this.f69202t.applyState(MraidAdView.this.f69203u);
            MraidAdView.this.f69202t.b(MraidAdView.this.f69185c);
            MraidAdView.this.f69202t.notifyReady();
        }
    }

    public static class d extends GestureDetector.SimpleOnGestureListener {
        private d() {
        }

        public /* synthetic */ d(a aVar) {
            this();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(@Nullable MotionEvent motionEvent, @NonNull MotionEvent motionEvent2, float f10, float f11) {
            return true;
        }
    }

    public abstract class e implements MraidWebViewController.Callback {
        private e() {
        }

        public /* synthetic */ e(MraidAdView mraidAdView, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str) {
            MraidAdView.this.f69201s.onCalendarEventIntention(MraidAdView.this, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            MraidAdView.this.f69201s.onStorePictureIntention(MraidAdView.this, str);
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onCalendarEvent(@Nullable String str) {
            MraidLog.d("MraidAdView", "Callback - onCalendarEvent: %s", str);
            String strA = MraidAdView.this.f69199q.a(str);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            MraidAdView.this.a(strA, new Executable() { // from class: fi.b
                @Override // io.bidmachine.util.Executable
                public final void execute(Object obj) {
                    this.f61718a.a((String) obj);
                }
            });
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onClose() {
            MraidLog.d("MraidAdView", "Callback - onClose", new Object[0]);
            MraidAdView.this.a();
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onError(@NonNull IabError iabError) {
            MraidLog.d("MraidAdView", "Callback - onError: %s", iabError);
            MraidAdView.this.a(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onExpand(@Nullable String str) {
            MraidLog.d("MraidAdView", "Callback - onExpand: %s", str);
            if (MraidAdView.this.isInterstitial()) {
                return;
            }
            MraidAdView.this.a(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onLoaded() {
            MraidLog.d("MraidAdView", "Callback - onLoaded", new Object[0]);
            MraidAdView.this.b();
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onOpen(@NonNull String str) {
            MraidLog.d("MraidAdView", "Callback - onOpen: %s", str);
            MraidAdView.this.c(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onOpenPrivacySheet(@NonNull String str) {
            MraidLog.d("MraidAdView", "Callback - onOpenPrivacySheet: %s", str);
            MraidAdView.this.b(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onOrientation(@NonNull MraidOrientationProperties mraidOrientationProperties) {
            MraidLog.d("MraidAdView", "Callback - onOrientation: %s", mraidOrientationProperties);
            if (MraidAdView.this.isInterstitial() || MraidAdView.this.f69203u == MraidViewState.EXPANDED) {
                MraidAdView.this.f69201s.onChangeOrientationIntention(MraidAdView.this, mraidOrientationProperties);
            }
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public abstract /* synthetic */ void onPageFinished(@NonNull String str);

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onPlayVideo(@Nullable String str) {
            MraidLog.d("MraidAdView", "Callback - onPlayVideo: %s", str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                MraidAdView.this.f69201s.onPlayVideoIntention(MraidAdView.this, URLDecoder.decode(str, "UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                MraidLog.e("MraidAdView", e10);
            }
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onResize(@NonNull MraidResizeProperties mraidResizeProperties) {
            MraidLog.d("MraidAdView", "Callback - onResize: %s", mraidResizeProperties);
            MraidAdView.this.a(mraidResizeProperties);
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onStorePicture(@Nullable String str) {
            MraidLog.d("MraidAdView", "Callback - onStorePicture: %s", str);
            String strB = MraidAdView.this.f69199q.b(str);
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            MraidAdView.this.a(strB, new Executable() { // from class: fi.c
                @Override // io.bidmachine.util.Executable
                public final void execute(Object obj) {
                    this.f61719a.b((String) obj);
                }
            });
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public abstract /* synthetic */ void onUseCustomClose(boolean z10);

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public abstract /* synthetic */ void onViewableChanged(boolean z10);
    }

    public class f extends e {
        private f() {
            super(MraidAdView.this, null);
        }

        public /* synthetic */ f(MraidAdView mraidAdView, a aVar) {
            this();
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.e, io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onPageFinished(@NonNull String str) {
            MraidAdView.this.d(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.e, io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onUseCustomClose(boolean z10) {
            Listener listener = MraidAdView.this.f69201s;
            MraidAdView mraidAdView = MraidAdView.this;
            listener.onSyncCustomCloseIntention(mraidAdView, mraidAdView.f69200r.isUseCustomClose());
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.e, io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onViewableChanged(boolean z10) {
            if (z10) {
                MraidAdView.this.f();
                MraidAdView.this.g();
            }
        }
    }

    public class g extends e {
        private g() {
            super(MraidAdView.this, null);
        }

        public /* synthetic */ g(MraidAdView mraidAdView, a aVar) {
            this();
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.e, io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onPageFinished(@NonNull String str) {
            MraidAdView.this.d();
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.e, io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onUseCustomClose(boolean z10) {
            if (MraidAdView.this.f69202t != null) {
                Listener listener = MraidAdView.this.f69201s;
                MraidAdView mraidAdView = MraidAdView.this;
                listener.onSyncCustomCloseIntention(mraidAdView, mraidAdView.f69202t.isUseCustomClose());
            }
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.e, io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onViewableChanged(boolean z10) {
        }
    }

    public MraidAdView(@NonNull Context context, @Nullable MraidPlacementType mraidPlacementType, @Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3, @NonNull Listener listener) {
        super(context);
        this.f69199q = new fi.g();
        this.f69183a = mraidPlacementType;
        this.f69184b = str;
        this.f69186d = str2;
        this.f69185c = str3;
        this.f69201s = listener;
        this.f69187e = new AtomicBoolean(false);
        this.f69188f = new AtomicBoolean(false);
        this.f69189g = new AtomicBoolean(false);
        this.f69190h = new AtomicBoolean(false);
        this.f69191i = new AtomicBoolean(false);
        this.f69192j = new AtomicBoolean(false);
        this.f69193k = new AtomicBoolean(false);
        a aVar = null;
        this.f69194l = new GestureDetector(context, new d(aVar));
        this.f69195m = new MraidScreenMetrics(context);
        this.f69196n = new ViewOnScreenObserver();
        MraidNativeFeatureManager mraidNativeFeatureManager = new MraidNativeFeatureManager(context, list);
        this.f69197o = mraidNativeFeatureManager;
        this.f69198p = new MraidNativeFeatureSchemeValidator(mraidNativeFeatureManager);
        MraidWebViewController mraidWebViewController = new MraidWebViewController(context, new f(this, aVar));
        this.f69200r = mraidWebViewController;
        addView(mraidWebViewController.getWebView(), new FrameLayout.LayoutParams(-1, -1, 17));
        this.f69203u = MraidViewState.LOADING;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f69201s.onCloseIntention(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11, MraidWebViewController mraidWebViewController, Runnable runnable) {
        if (isRedirectProcessed()) {
            return;
        }
        a(mraidWebViewController.getWebView(), i10, i11);
        this.f69204v = runnable;
        postDelayed(runnable, 150L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        Context context = getContext();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f69195m.a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        int[] iArr = new int[2];
        View viewObtainRootView = MraidUtils.obtainRootView(context, this);
        viewObtainRootView.getLocationOnScreen(iArr);
        this.f69195m.c(iArr[0], iArr[1], viewObtainRootView.getWidth(), viewObtainRootView.getHeight());
        getLocationOnScreen(iArr);
        this.f69195m.b(iArr[0], iArr[1], getWidth(), getHeight());
        view.getLocationOnScreen(iArr);
        this.f69195m.a(iArr[0], iArr[1], view.getWidth(), view.getHeight());
        this.f69200r.applyScreenMetrics(this.f69195m);
        MraidWebViewController mraidWebViewController = this.f69202t;
        if (mraidWebViewController != null) {
            mraidWebViewController.applyScreenMetrics(this.f69195m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IabError iabError) {
        if (!isLoaded()) {
            this.f69201s.onMraidAdViewLoadFailed(this, iabError);
        } else if (e()) {
            this.f69201s.onMraidAdViewShowFailed(this, iabError);
        } else {
            this.f69201s.onMraidAdViewExpired(this, iabError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MraidResizeProperties mraidResizeProperties) {
        MraidViewState mraidViewState = this.f69203u;
        if (mraidViewState == MraidViewState.LOADING || mraidViewState == MraidViewState.HIDDEN || mraidViewState == MraidViewState.EXPANDED || isInterstitial()) {
            MraidLog.d("MraidAdView", "Callback: onResize (invalidate state: %s)", this.f69203u);
        } else if (this.f69201s.onResizeIntention(this, this.f69200r.getWebView(), mraidResizeProperties, this.f69195m)) {
            setViewState(MraidViewState.RESIZED);
        }
    }

    private void a(MraidWebView mraidWebView, int i10, int i11) {
        mraidWebView.dispatchTouchEvent(Utils.obtainMotionEvent(0, i10, i11));
        mraidWebView.dispatchTouchEvent(Utils.obtainMotionEvent(1, i10, i11));
    }

    private void a(MraidWebViewController mraidWebViewController, int i10, int i11, int i12, int i13) {
        if (this.f69192j.compareAndSet(false, true)) {
            this.f69193k.set(false);
            a aVar = new a(i10, i11, i12, i13, mraidWebViewController);
            Point defaultClickPoint = Utils.getDefaultClickPoint(i10, i11);
            a(defaultClickPoint.x, defaultClickPoint.y, mraidWebViewController, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        MraidWebViewController mraidWebViewController;
        if (isInterstitial()) {
            return;
        }
        MraidViewState mraidViewState = this.f69203u;
        if (mraidViewState == MraidViewState.DEFAULT || mraidViewState == MraidViewState.RESIZED) {
            if (str == null) {
                mraidWebViewController = this.f69200r;
            } else {
                try {
                    String strDecode = URLDecoder.decode(str, "UTF-8");
                    if (!io.bidmachine.util.Utils.isHttpUrl(strDecode)) {
                        strDecode = this.f69184b + strDecode;
                    }
                    MraidWebViewController mraidWebViewController2 = new MraidWebViewController(getContext(), new g(this, null));
                    this.f69202t = mraidWebViewController2;
                    mraidWebViewController2.load(strDecode);
                    mraidWebViewController = mraidWebViewController2;
                } catch (UnsupportedEncodingException unused) {
                    return;
                }
            }
            if (this.f69201s.onExpandIntention(this, mraidWebViewController.getWebView(), mraidWebViewController.getLastOrientationProperties(), mraidWebViewController.isUseCustomClose())) {
                setViewState(MraidViewState.EXPANDED);
                this.f69201s.onExpanded(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Executable executable) {
        this.f69191i.set(true);
        this.f69192j.set(false);
        this.f69193k.set(true);
        removeCallbacks(this.f69204v);
        if (this.f69198p.a(str)) {
            executable.execute(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f69201s.onMraidLoadedIntention(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i10, int i11, MraidWebViewController mraidWebViewController, Runnable runnable) {
        if (isRedirectProcessed()) {
            return;
        }
        mraidWebViewController.applyClick(i10, i11);
        this.f69204v = runnable;
        postDelayed(runnable, 150L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        PrivacySheetParams json = PrivacySheetParamsParser.parseJson(str);
        if (json == null) {
            MraidLog.e("MraidAdView", "Callback - can't parse privacy sheet", new Object[0]);
        } else {
            this.f69201s.onOpenPrivacySheet(this, json);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (isRedirectProcessed() || TextUtils.isEmpty(this.f69186d)) {
            return;
        }
        c(this.f69186d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        a(str, new Executable() { // from class: fi.a
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                this.f61717a.e((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.f69202t == null) {
            return;
        }
        updateMetrics(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        if (this.f69203u == MraidViewState.LOADING && this.f69187e.compareAndSet(false, true)) {
            this.f69200r.applySupportedServices(this.f69197o);
            MraidPlacementType mraidPlacementType = this.f69183a;
            if (mraidPlacementType != null) {
                this.f69200r.applyPlacement(mraidPlacementType);
            }
            MraidWebViewController mraidWebViewController = this.f69200r;
            mraidWebViewController.applyViewable(mraidWebViewController.isViewable());
            this.f69200r.b(this.f69185c);
            a(this.f69200r.getWebView());
            setViewState(MraidViewState.DEFAULT);
            f();
            this.f69201s.onMraidAdViewPageLoaded(this, str, this.f69200r.getWebView(), this.f69200r.isUseCustomClose());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(String str) {
        this.f69201s.onOpenUrlIntention(this, str);
    }

    private boolean e() {
        return this.f69189g.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f69188f.compareAndSet(false, true)) {
            this.f69200r.notifyReady();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f69190h.compareAndSet(false, true)) {
            this.f69201s.onMraidAdViewShown(this);
        }
    }

    @NonNull
    private MraidWebViewController getCurrentMraidWebViewController() {
        MraidWebViewController mraidWebViewController = this.f69202t;
        return mraidWebViewController != null ? mraidWebViewController : this.f69200r;
    }

    public void close() {
        setViewState(MraidViewState.HIDDEN);
    }

    public void closeExpanded() {
        MraidWebViewController mraidWebViewController = this.f69202t;
        if (mraidWebViewController != null) {
            mraidWebViewController.destroy();
            this.f69202t = null;
        } else {
            addView(this.f69200r.getWebView());
        }
        setViewState(MraidViewState.DEFAULT);
    }

    public void closeResized() {
        addView(this.f69200r.getWebView());
        setViewState(MraidViewState.DEFAULT);
    }

    public void destroy() {
        this.f69196n.cancelLastRequest();
        this.f69200r.destroy();
        MraidWebViewController mraidWebViewController = this.f69202t;
        if (mraidWebViewController != null) {
            mraidWebViewController.destroy();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public String getBaseUrl() {
        return this.f69184b;
    }

    @Nullable
    public MraidOrientationProperties getLastOrientationProperties() {
        return this.f69200r.getLastOrientationProperties();
    }

    @NonNull
    public MraidViewState getMraidViewState() {
        return this.f69203u;
    }

    @NonNull
    public WebView getWebView() {
        return this.f69200r.getWebView();
    }

    public void handleRedirect(int i10, int i11, int i12, int i13) {
        a(getCurrentMraidWebViewController(), i10, i11, i12, i13);
    }

    public void handleRedirectScreen(int i10, int i11) {
        Rect rectE = this.f69195m.e();
        handleRedirect(rectE.width(), rectE.height(), i10, i11);
    }

    public void handleRedirectView() {
        MraidWebView webView = getCurrentMraidWebViewController().getWebView();
        handleRedirect(webView.getMeasuredWidth(), webView.getMeasuredHeight(), 17, 17);
    }

    public boolean isInterstitial() {
        return this.f69183a == MraidPlacementType.INTERSTITIAL;
    }

    public boolean isLoaded() {
        return this.f69187e.get();
    }

    public boolean isOpenNotified() {
        return this.f69191i.get();
    }

    public boolean isReceivedJsError() {
        return this.f69200r.isReceivedJsError();
    }

    public boolean isRedirectProcessed() {
        return this.f69193k.get();
    }

    public boolean isUseCustomClose() {
        return this.f69200r.isUseCustomClose();
    }

    public void load(@Nullable String str) {
        if (str == null) {
            a(IabError.noRequiredArguments("Html data are null"));
        } else {
            this.f69200r.load(this.f69184b, String.format("<script type='application/javascript'>%s</script>%s%s", MraidUtils.b(), JsBridgeHandler.obtainJs(), MraidUtils.processRawHtml(str)), "text/html", "UTF-8");
            this.f69200r.applyLogLevel(MraidLog.getLoggingLevel());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f69194l.onTouchEvent(motionEvent)) {
            motionEvent.setAction(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    @VisibleForTesting
    public void setViewState(@NonNull MraidViewState mraidViewState) {
        this.f69203u = mraidViewState;
        this.f69200r.applyState(mraidViewState);
        MraidWebViewController mraidWebViewController = this.f69202t;
        if (mraidWebViewController != null) {
            mraidWebViewController.applyState(mraidViewState);
        }
        if (mraidViewState != MraidViewState.HIDDEN) {
            updateMetrics(null);
        }
    }

    public void show() {
        if (this.f69189g.compareAndSet(false, true) && isLoaded()) {
            f();
        }
    }

    public void updateMetrics(@Nullable Runnable runnable) {
        MraidWebViewController mraidWebViewController = this.f69202t;
        if (mraidWebViewController == null) {
            mraidWebViewController = this.f69200r;
        }
        MraidWebView webView = mraidWebViewController.getWebView();
        this.f69196n.wait(this, webView).start(new b(webView, runnable));
    }
}
