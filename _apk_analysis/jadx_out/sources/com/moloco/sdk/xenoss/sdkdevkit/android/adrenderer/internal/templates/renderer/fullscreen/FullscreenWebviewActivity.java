package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import go.f;
import go.l;
import go.u;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class FullscreenWebviewActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f48849b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f48850c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f48851d = "FullscreenWebviewActivity";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static WeakReference<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a> f48852e = new WeakReference<>(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static WeakReference<FullscreenWebviewActivity> f48853f = new WeakReference<>(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static WeakReference<com.moloco.sdk.acm.recorder.a> f48854g = new WeakReference<>(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static l<Boolean> f48855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static l<Boolean> f48856i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public OnBackPressedCallback f48857a;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (intent == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(intent, g.D);
            context.startActivity(intent);
        }

        public final void a() {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, FullscreenWebviewActivity.f48851d, "Closing ad", null, false, 12, null);
            FullscreenWebviewActivity.f48852e.clear();
            l lVar = FullscreenWebviewActivity.f48855h;
            if (lVar != null) {
                lVar.setValue(Boolean.FALSE);
            }
            FullscreenWebviewActivity.f48855h = null;
            FullscreenWebviewActivity fullscreenWebviewActivity = (FullscreenWebviewActivity) FullscreenWebviewActivity.f48853f.get();
            if (fullscreenWebviewActivity != null && !fullscreenWebviewActivity.isFinishing() && !fullscreenWebviewActivity.isDestroyed()) {
                fullscreenWebviewActivity.finish();
            }
            FullscreenWebviewActivity.f48853f.clear();
            FullscreenWebviewActivity.f48854g.clear();
        }

        public final void b(@NotNull Context context, @NotNull l<Boolean> lVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a aVar, @NotNull com.moloco.sdk.acm.recorder.a aVar2, @NotNull l<Boolean> lVar2) {
            p.k(context, GAMConfig.KEY_CONTEXT);
            p.k(lVar, "isAdDisplayingEvent");
            p.k(aVar, "webviewAd");
            p.k(aVar2, "metricsRecorder");
            p.k(lVar2, "isAdForciblyClosed");
            MolocoLogger.info$default(MolocoLogger.INSTANCE, FullscreenWebviewActivity.f48851d, "Showing ad", null, false, 12, null);
            FullscreenWebviewActivity.f48852e = new WeakReference(aVar);
            FullscreenWebviewActivity.f48855h = lVar;
            FullscreenWebviewActivity.f48856i = lVar2;
            FullscreenWebviewActivity.f48854g = new WeakReference(aVar2);
            Intent intent = new Intent(context, (Class<?>) FullscreenWebviewActivity.class);
            intent.setFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48858a;

        static {
            int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.values().length];
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.f48622b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.f48623c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.f48624d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f48858a = iArr;
        }
    }

    public /* synthetic */ class c extends AdaptedFunctionReference implements sn.p<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b, hn.c<? super r>, Object> {
        public c(Object obj) {
            super(2, obj, FullscreenWebviewActivity.class, "setOrientation", "setOrientation(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/OrientationSettings;)V", 4);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b bVar, hn.c<? super r> cVar) {
            return FullscreenWebviewActivity.b((FullscreenWebviewActivity) this.receiver, bVar, cVar);
        }
    }

    public static final r a(OnBackPressedCallback onBackPressedCallback) {
        p.k(onBackPressedCallback, "$this$addCallback");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, f48851d, "Back press detected, but disabled", false, 4, null);
        return r.f5635a;
    }

    public static /* synthetic */ void a(FullscreenWebviewActivity fullscreenWebviewActivity, u uVar, l0 l0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            l0Var = d.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        }
        fullscreenWebviewActivity.a((u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b>) uVar, l0Var);
    }

    public static final /* synthetic */ Object b(FullscreenWebviewActivity fullscreenWebviewActivity, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b bVar, hn.c cVar) {
        fullscreenWebviewActivity.a(bVar);
        return r.f5635a;
    }

    public static final r f() {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, f48851d, "WebviewAd is null in onPause, cannot call webviewBridge.viewVisible", null, false, 12, null);
        return r.f5635a;
    }

    public static final r g() {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, f48851d, "WebviewAd is null in onResume, cannot call webviewBridge.viewVisible", null, false, 12, null);
        return r.f5635a;
    }

    public final Integer a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a aVar) {
        int i10 = b.f48858a[aVar.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 0;
        }
        if (i10 == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b bVar) {
        if (bVar.a() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.f48624d) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, f48851d, "Orientation is none, not setting requested orientation", false, 4, null);
            return;
        }
        Integer numA = a(bVar.a());
        if (numA != null) {
            int iIntValue = numA.intValue();
            MolocoLogger.info$default(MolocoLogger.INSTANCE, f48851d, "Setting orientation to " + iIntValue, null, false, 12, null);
            setRequestedOrientation(iIntValue);
        }
    }

    public final void a(u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b> uVar, l0 l0Var) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, f48851d, "Starting to listen to orientation events", null, false, 12, null);
        a(uVar.getValue());
        f.D(f.G(uVar, new c(this)), l0Var);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(g.D, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        String str = f48851d;
        MolocoLogger.info$default(molocoLogger, str, "onCreate called", null, false, 12, null);
        com.moloco.sdk.acm.recorder.a aVar = f48854g.get();
        if (aVar != null) {
            aVar.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.W.c()));
        }
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        p.j(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        this.f48857a = OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.c
            @Override // sn.l
            public final Object invoke(Object obj) {
                return FullscreenWebviewActivity.a((OnBackPressedCallback) obj);
            }
        }, 2, null);
        f48853f = new WeakReference<>(this);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a aVar2 = f48852e.get();
        if (aVar2 == null) {
            MolocoLogger.error$default(molocoLogger, str, "WebviewAd is null, something went wrong", null, false, 12, null);
            finish();
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b bVarY = aVar2.y();
        if (bVarY.getParent() != null) {
            ViewParent parent = bVarY.getParent();
            p.i(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(bVarY);
        }
        setContentView(bVarY);
        l<Boolean> lVar = f48855h;
        if (lVar != null) {
            lVar.setValue(Boolean.TRUE);
        }
        MolocoLogger.info$default(molocoLogger, str, "WebView is not null, proceeding to notify viewReady and viewVisible", null, false, 12, null);
        aVar2.z().a();
        h0.a(this);
        a(this, aVar2.A(), null, 2, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, f48851d, "onDestroy called for FullscreenWebviewActivity", null, false, 12, null);
        l<Boolean> lVar = f48856i;
        if (lVar != null) {
            lVar.setValue(Boolean.TRUE);
        }
        f48856i = null;
        OnBackPressedCallback onBackPressedCallback = this.f48857a;
        if (onBackPressedCallback != null && onBackPressedCallback.isEnabled()) {
            onBackPressedCallback.remove();
        }
        f48849b.a();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a aVarZ;
        super.onPause();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        String str = f48851d;
        MolocoLogger.info$default(molocoLogger, str, "Lifecycle onPause called", null, false, 12, null);
        if (isFinishing() || isDestroyed()) {
            MolocoLogger.info$default(molocoLogger, str, "Activity is finishing or destroyed, skipping viewVisible call", null, false, 12, null);
            return;
        }
        MolocoLogger.info$default(molocoLogger, str, "Activity is not finishing or destroyed, setting viewVisible to false", null, false, 12, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a aVar = f48852e.get();
        if (aVar == null || (aVarZ = aVar.z()) == null) {
            new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.b
                @Override // sn.a
                public final Object invoke() {
                    return FullscreenWebviewActivity.f();
                }
            };
        } else {
            aVarZ.a(false);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a aVarZ;
        super.onResume();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, f48851d, "Lifecycle onResume called", null, false, 12, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a aVar = f48852e.get();
        if (aVar == null || (aVarZ = aVar.z()) == null) {
            new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.a
                @Override // sn.a
                public final Object invoke() {
                    return FullscreenWebviewActivity.g();
                }
            };
        } else {
            aVarZ.a(true);
        }
    }
}
