package io.bidmachine.rendering.ad.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.rendering.ad.view.AdView;
import io.bidmachine.rendering.internal.a0;
import io.bidmachine.rendering.internal.animation.i;
import io.bidmachine.rendering.internal.b0;
import io.bidmachine.rendering.internal.c0;
import io.bidmachine.rendering.internal.controller.c;
import io.bidmachine.rendering.internal.controller.e;
import io.bidmachine.rendering.internal.h;
import io.bidmachine.rendering.internal.n;
import io.bidmachine.rendering.internal.o;
import io.bidmachine.rendering.internal.view.d;
import io.bidmachine.rendering.internal.view.f;
import io.bidmachine.rendering.internal.z;
import io.bidmachine.rendering.model.AdParams;
import io.bidmachine.rendering.model.Background;
import io.bidmachine.rendering.model.Border;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.Orientation;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.utils.Tag;
import io.bidmachine.util.UiUtils;
import io.bidmachine.util.ViewUtils;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\n\u0012B\u0017\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0017\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\u0018\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u0002H\u0014J\b\u0010\u001e\u001a\u00020\u0002H\u0014J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0014J\u0006\u0010%\u001a\u00020$J\u0006\u0010&\u001a\u00020\u0002J\b\u0010(\u001a\u0004\u0018\u00010'J\u0006\u0010)\u001a\u00020\u0002J\b\u0010+\u001a\u00020*H\u0016R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00109R\u0016\u0010=\u001a\u0004\u0018\u00010;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010<R$\u0010D\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0016\u0010F\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010E¨\u0006M"}, d2 = {"Lio/bidmachine/rendering/ad/view/AdView;", "Landroid/widget/FrameLayout;", "Lbn/r;", "j", "Lio/bidmachine/rendering/model/Error;", "error", "c", CampaignEx.JSON_KEY_AD_K, "Lio/bidmachine/rendering/internal/controller/e;", "adPhaseController", "a", "d", "o", "n", "l", InneractiveMediationDefs.GENDER_MALE, "Lio/bidmachine/rendering/model/PrivacySheetParams;", "privacySheetParams", "b", "Lio/bidmachine/rendering/internal/view/f;", "placeholderView", "p", "h", "i", "g", "e", InneractiveMediationDefs.GENDER_FEMALE, "Lio/bidmachine/rendering/model/BrokenCreativeEvent;", "brokenCreativeEvent", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/View;", "changedView", "", "visibility", "onVisibilityChanged", "", "isLoaded", "load", "Lio/bidmachine/rendering/model/Orientation;", "getRequiredOrientation", "destroy", "", "toString", "Lio/bidmachine/rendering/utils/Tag;", "Lio/bidmachine/rendering/utils/Tag;", "tag", "Lio/bidmachine/rendering/internal/state/a;", "Lio/bidmachine/rendering/internal/state/a;", "adState", "Lio/bidmachine/rendering/internal/controller/a;", "Lio/bidmachine/rendering/internal/controller/a;", "adController", "Lio/bidmachine/rendering/internal/view/d;", "Lio/bidmachine/rendering/internal/view/d;", "loadingView", "Lio/bidmachine/rendering/internal/b0;", "Lio/bidmachine/rendering/internal/b0;", "visibilityTracker", "Lio/bidmachine/rendering/internal/z;", "Lio/bidmachine/rendering/internal/z;", "viewBackgroundSetter", "Lio/bidmachine/rendering/ad/view/AdViewListener;", "Lio/bidmachine/rendering/ad/view/AdViewListener;", "getAdViewListener", "()Lio/bidmachine/rendering/ad/view/AdViewListener;", "setAdViewListener", "(Lio/bidmachine/rendering/ad/view/AdViewListener;)V", "adViewListener", "Z", "isAttachedToWindow", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lio/bidmachine/rendering/model/AdParams;", "adParams", "<init>", "(Landroid/content/Context;Lio/bidmachine/rendering/model/AdParams;)V", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final class AdView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Tag tag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final io.bidmachine.rendering.internal.state.a adState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final io.bidmachine.rendering.internal.controller.a adController;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d loadingView;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b0 visibilityTracker;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final z viewBackgroundSetter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private AdViewListener adViewListener;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isAttachedToWindow;

    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f70025a;

        public a(AdView adView) {
            p.k(adView, "adView");
            this.f70025a = new WeakReference(adView);
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void a() {
            AdView adView = (AdView) this.f70025a.get();
            if (adView != null) {
                adView.p();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void a(io.bidmachine.rendering.internal.controller.a aVar) {
            p.k(aVar, "adController");
            AdView adView = (AdView) this.f70025a.get();
            if (adView != null) {
                adView.f();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void a(io.bidmachine.rendering.internal.controller.a aVar, Error error) {
            p.k(aVar, "adController");
            p.k(error, "error");
            AdView adView = (AdView) this.f70025a.get();
            if (adView != null) {
                adView.c(error);
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void a(e eVar) {
            p.k(eVar, "adPhaseController");
            AdView adView = (AdView) this.f70025a.get();
            if (adView != null) {
                adView.a(eVar);
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void a(e eVar, Error error) {
            p.k(error, "error");
            AdView adView = (AdView) this.f70025a.get();
            if (adView != null) {
                adView.d(error);
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void a(f fVar) {
            p.k(fVar, "placeholderView");
            AdView adView = (AdView) this.f70025a.get();
            if (adView != null) {
                adView.b(fVar);
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void a(BrokenCreativeEvent brokenCreativeEvent) {
            p.k(brokenCreativeEvent, "brokenCreativeEvent");
            AdView adView = (AdView) this.f70025a.get();
            if (adView != null) {
                adView.a(brokenCreativeEvent);
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void a(PrivacySheetParams privacySheetParams) {
            p.k(privacySheetParams, "privacySheetParams");
            AdView adView = (AdView) this.f70025a.get();
            if (adView != null) {
                adView.b(privacySheetParams);
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void b() {
            AdView adView = (AdView) this.f70025a.get();
            if (adView != null) {
                adView.a();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void b(io.bidmachine.rendering.internal.controller.a aVar) {
            p.k(aVar, "adController");
            AdView adView = (AdView) this.f70025a.get();
            if (adView != null) {
                adView.j();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void b(f fVar) {
            p.k(fVar, "placeholderView");
            AdView adView = (AdView) this.f70025a.get();
            if (adView != null) {
                adView.a(fVar);
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void c() {
            AdView adView = (AdView) this.f70025a.get();
            if (adView != null) {
                adView.b();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void c(io.bidmachine.rendering.internal.controller.a aVar) {
            p.k(aVar, "adController");
            AdView adView = (AdView) this.f70025a.get();
            if (adView != null) {
                adView.i();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void d() {
            AdView adView = (AdView) this.f70025a.get();
            if (adView != null) {
                adView.k();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void e() {
            AdView adView = (AdView) this.f70025a.get();
            if (adView != null) {
                adView.b(new Error("Ad loading timeout after display"));
                adView.a();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void onAdClicked() {
            AdView adView = (AdView) this.f70025a.get();
            if (adView != null) {
                adView.d();
            }
        }
    }

    public static final class b implements b0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f70026a;

        public b(AdView adView) {
            p.k(adView, "adView");
            this.f70026a = new WeakReference(adView);
        }

        @Override // io.bidmachine.rendering.internal.b0.a
        public void a() {
            AdView adView = (AdView) this.f70026a.get();
            if (adView != null) {
                adView.l();
            }
        }

        @Override // io.bidmachine.rendering.internal.b0.a
        public void b() {
            AdView adView = (AdView) this.f70026a.get();
            if (adView != null) {
                adView.m();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdView(@NotNull Context context, @NotNull AdParams adParams) {
        z zVarA;
        super(context);
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(adParams, "adParams");
        Tag tag = new Tag("AdView");
        this.tag = tag;
        h hVarA = h.f70435i.a();
        String string = tag.toString();
        p.j(string, "tag.toString()");
        io.bidmachine.rendering.internal.state.c cVar = new io.bidmachine.rendering.internal.state.c(string, hVarA);
        this.adState = cVar;
        io.bidmachine.rendering.internal.state.b bVarO = cVar.o();
        this.adController = new io.bidmachine.rendering.internal.controller.b(context, adParams, new a(this), new i(bVarO, hVarA));
        d dVar = new d(context);
        this.loadingView = dVar;
        addView(dVar, ViewUtils.createMatchParentParams());
        dVar.a();
        this.visibilityTracker = new c0(this, adParams.getVisibilityParams(), new b(this));
        Background background = adParams.getBackground();
        if (background != null) {
            Context applicationContext = context.getApplicationContext();
            p.j(applicationContext, "context.applicationContext");
            Context applicationContext2 = context.getApplicationContext();
            p.j(applicationContext2, "context.applicationContext");
            zVarA = a0.a(background, applicationContext, new io.bidmachine.rendering.internal.repository.b(applicationContext2, bVarO, hVarA));
        } else {
            zVarA = null;
        }
        this.viewBackgroundSetter = zVarA;
        this.isAttachedToWindow = false;
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AdView adView) {
        p.k(adView, "this$0");
        adView.removeAllViews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AdView adView, f fVar) {
        p.k(adView, "this$0");
        p.k(fVar, "$placeholderView");
        adView.removeView(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AdView adView, BrokenCreativeEvent brokenCreativeEvent) {
        p.k(adView, "this$0");
        p.k(brokenCreativeEvent, "$brokenCreativeEvent");
        AdViewListener adViewListener = adView.adViewListener;
        if (adViewListener != null) {
            adViewListener.onBrokenCreativeEvent(adView, brokenCreativeEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AdView adView, Error error) {
        p.k(adView, "this$0");
        p.k(error, "$error");
        AdViewListener adViewListener = adView.adViewListener;
        if (adViewListener != null) {
            adViewListener.onAdFailToLoad(adView, error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AdView adView, PrivacySheetParams privacySheetParams) {
        p.k(adView, "this$0");
        p.k(privacySheetParams, "$privacySheetParams");
        AdViewListener adViewListener = adView.adViewListener;
        if (adViewListener != null) {
            adViewListener.onOpenPrivacySheet(adView, privacySheetParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final e eVar) {
        o.b(this.tag, "onPreparingForShowComplete", new Object[0]);
        UiUtils.onUiThread(new n() { // from class: gk.k
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                AdView.a(eVar, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(e eVar, AdView adView) {
        p.k(eVar, "$adPhaseController");
        p.k(adView, "this$0");
        if (eVar.a(adView)) {
            adView.b();
            adView.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final f fVar) {
        o.b(this.tag, "hidePlaceholder (%s)", fVar);
        UiUtils.onUiThread(new n() { // from class: gk.l
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                AdView.a(this.f62445b, fVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(f fVar, AdView adView) {
        p.k(fVar, "$placeholderView");
        p.k(adView, "this$0");
        if (fVar.getParent() == adView) {
            return;
        }
        Utils.removeFromParent(fVar);
        adView.addView(fVar, ViewUtils.createMatchParentParams());
        fVar.bringToFront();
        fVar.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final BrokenCreativeEvent brokenCreativeEvent) {
        if (this.adState.h()) {
            return;
        }
        UiUtils.onUiThread(new Runnable() { // from class: gk.m
            @Override // java.lang.Runnable
            public final void run() {
                AdView.a(this.f62447b, brokenCreativeEvent);
            }
        });
    }

    private final void a(final Error error) {
        if (this.adState.a(false)) {
            o.a(this.tag, "notifyAdFailToLoad - %s", error);
            UiUtils.onUiThread(new Runnable() { // from class: gk.f
                @Override // java.lang.Runnable
                public final void run() {
                    AdView.a(this.f62436b, error);
                }
            });
        }
    }

    private final void a(final PrivacySheetParams privacySheetParams) {
        UiUtils.onUiThread(new Runnable() { // from class: gk.d
            @Override // java.lang.Runnable
            public final void run() {
                AdView.a(this.f62433b, privacySheetParams);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        this.loadingView.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AdView adView) {
        p.k(adView, "this$0");
        AdViewListener adViewListener = adView.adViewListener;
        if (adViewListener != null) {
            adViewListener.onAdAppeared(adView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AdView adView, Error error) {
        p.k(adView, "this$0");
        p.k(error, "$error");
        AdViewListener adViewListener = adView.adViewListener;
        if (adViewListener != null) {
            adViewListener.onAdFailToShow(adView, error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(final f fVar) {
        o.b(this.tag, "showPlaceholder (%s)", fVar);
        UiUtils.onUiThread(new n() { // from class: gk.g
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                AdView.a(fVar, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(final Error error) {
        if (this.adState.f()) {
            o.a(this.tag, "notifyAdFailToShow - %s", error);
            UiUtils.onUiThread(new Runnable() { // from class: gk.a
                @Override // java.lang.Runnable
                public final void run() {
                    AdView.b(this.f62429b, error);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(PrivacySheetParams privacySheetParams) {
        o.b(this.tag, "onOpenPrivacySheet", new Object[0]);
        a(privacySheetParams);
    }

    private final void c() {
        if (this.adState.b(true)) {
            o.b(this.tag, "notifyAdAppeared", new Object[0]);
            UiUtils.onUiThread(new Runnable() { // from class: gk.o
                @Override // java.lang.Runnable
                public final void run() {
                    AdView.b(this.f62450b);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(AdView adView) {
        p.k(adView, "this$0");
        AdViewListener adViewListener = adView.adViewListener;
        if (adViewListener != null) {
            adViewListener.onAdClicked(adView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Error error) {
        a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        this.adState.e();
        o.b(this.tag, "notifyAdClicked", new Object[0]);
        UiUtils.onUiThread(new Runnable() { // from class: gk.b
            @Override // java.lang.Runnable
            public final void run() {
                AdView.c(this.f62431b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AdView adView) {
        p.k(adView, "this$0");
        AdViewListener adViewListener = adView.adViewListener;
        if (adViewListener != null) {
            adViewListener.onAdDisappeared(adView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Error error) {
        o.a(this.tag, "onPreparingForShowFail - %s", error);
        b(new Error("No phase loaded"));
    }

    private final void e() {
        if (this.adState.b(false)) {
            o.b(this.tag, "notifyAdDisappeared", new Object[0]);
            UiUtils.onUiThread(new Runnable() { // from class: gk.j
                @Override // java.lang.Runnable
                public final void run() {
                    AdView.d(this.f62442b);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(AdView adView) {
        p.k(adView, "this$0");
        AdViewListener adViewListener = adView.adViewListener;
        if (adViewListener != null) {
            adViewListener.onAdExpired(adView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        if (this.adState.k()) {
            o.b(this.tag, "notifyAdExpired", new Object[0]);
            UiUtils.onUiThread(new Runnable() { // from class: gk.n
                @Override // java.lang.Runnable
                public final void run() {
                    AdView.e(this.f62449b);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(AdView adView) {
        p.k(adView, "this$0");
        AdViewListener adViewListener = adView.adViewListener;
        if (adViewListener != null) {
            adViewListener.onAdFinished(adView);
        }
    }

    private final void g() {
        if (this.adState.j()) {
            o.b(this.tag, "notifyAdFinished", new Object[0]);
            UiUtils.onUiThread(new Runnable() { // from class: gk.c
                @Override // java.lang.Runnable
                public final void run() {
                    AdView.f(this.f62432b);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(AdView adView) {
        p.k(adView, "this$0");
        AdViewListener adViewListener = adView.adViewListener;
        if (adViewListener != null) {
            adViewListener.onAdLoaded(adView);
        }
    }

    private final void h() {
        if (this.adState.a(true)) {
            o.b(this.tag, "notifyAdLoaded", new Object[0]);
            UiUtils.onUiThread(new Runnable() { // from class: gk.i
                @Override // java.lang.Runnable
                public final void run() {
                    AdView.g(this.f62441b);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(AdView adView) {
        p.k(adView, "this$0");
        AdViewListener adViewListener = adView.adViewListener;
        if (adViewListener != null) {
            adViewListener.onAdShown(adView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        if (this.adState.i()) {
            o.b(this.tag, "notifyAdShown", new Object[0]);
            UiUtils.onUiThread(new Runnable() { // from class: gk.h
                @Override // java.lang.Runnable
                public final void run() {
                    AdView.h(this.f62440b);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        o.b(this.tag, "onPreparingForShowStarted", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        o.b(this.tag, "onViewOnScreen", new Object[0]);
        this.adController.d();
        this.adController.onShown();
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        o.b(this.tag, "onViewOutOfScreen", new Object[0]);
        n();
    }

    private final void n() {
        this.visibilityTracker.stop();
        this.adController.f();
        e();
    }

    private final void o() {
        if (this.isAttachedToWindow && ViewUtils.isViewVisible(this)) {
            this.adState.l();
            this.visibilityTracker.start();
            if (this.visibilityTracker.b()) {
                l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        this.loadingView.c();
    }

    public final void destroy() {
        o.b(this.tag, "destroy", new Object[0]);
        this.adViewListener = null;
        this.adController.a();
        this.visibilityTracker.a();
        UiUtils.onUiThread(new n() { // from class: gk.e
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                AdView.a(this.f62435b);
            }
        });
        this.adState.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public final AdViewListener getAdViewListener() {
        return this.adViewListener;
    }

    @Nullable
    public final Orientation getRequiredOrientation() {
        return this.adController.b();
    }

    public final boolean isLoaded() {
        return this.adState.b();
    }

    public final void load() {
        if (this.adState.c()) {
            z zVar = this.viewBackgroundSetter;
            if (zVar != null) {
                z.a(zVar, this, (Integer) null, (Border) null, 6, (Object) null);
            }
            this.adController.c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        o.b(this.tag, "onAttachedToWindow", new Object[0]);
        this.isAttachedToWindow = true;
        o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o.b(this.tag, "onDetachedFromWindow", new Object[0]);
        this.isAttachedToWindow = false;
        n();
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
    public void onVisibilityChanged(View view, int i10) {
        p.k(view, "changedView");
        super.onVisibilityChanged(view, i10);
        o.b(this.tag, "onVisibilityChanged - %s", io.bidmachine.rendering.utils.UiUtils.toString(i10));
        if (io.bidmachine.rendering.utils.UiUtils.isViewVisible(i10)) {
            o();
        } else {
            n();
        }
    }

    public final void setAdViewListener(@Nullable AdViewListener adViewListener) {
        this.adViewListener = adViewListener;
    }

    @Override // android.view.View
    @NotNull
    public String toString() {
        String string = this.tag.toString();
        p.j(string, "tag.toString()");
        return string;
    }
}
