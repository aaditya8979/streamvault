package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.LifecycleOwnerKt;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C4377a;
import com.moloco.sdk.internal.ortb.model.C4378b;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.ForegroundMonitor;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z0;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KFunction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
public final class MraidActivity extends ComponentActivity {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f48294i = "MraidActivity";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final l0 f48296a = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getMain());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final bn.g f48297b = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a
        @Override // sn.a
        public final Object invoke() {
            return MraidActivity.b();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a f48298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public b0 f48299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f48300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.p f48301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f48292g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f48293h = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final go.k<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b> f48295j = go.q.b(0, 0, null, 7, null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (intent == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.D);
            context.startActivity(intent);
        }

        public final boolean c(@NotNull n nVar, @NotNull b0 b0Var, @NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n nVar2, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @Nullable sn.a<bn.r> aVar, @Nullable sn.a<bn.r> aVar2, @NotNull sn.a<bn.r> aVar3, @NotNull sn.a<bn.r> aVar4, @Nullable String str, @NotNull com.moloco.sdk.acm.recorder.a aVar5) {
            tn.p.k(nVar, "adData");
            tn.p.k(b0Var, "controller");
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            tn.p.k(nVar2, "options");
            tn.p.k(aVar3, "onShowListenerClick");
            tn.p.k(aVar4, "onCloseOrSkipButtonShown");
            tn.p.k(aVar5, "metricsRecorder");
            if (!d(b0Var)) {
                return false;
            }
            j jVar = j.f48377a;
            jVar.d(nVar);
            jVar.h(e0Var);
            jVar.j(nVar2.a());
            jVar.k(nVar2.e());
            jVar.i(aVar);
            jVar.e(b0Var);
            jVar.o(aVar2);
            jVar.q(aVar3);
            jVar.m(aVar4);
            C4377a c4377aB = nVar2.b();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVar6 = null;
            jVar.g(c4377aB != null ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b(c4377aB.b(), c4377aB.c()) : null);
            C4378b c4378bC = nVar2.c();
            if (c4378bC != null) {
                boolean zE = c4378bC.e();
                String strC = c4378bC.c();
                String strA = c4378bC.a();
                Boolean boolD = c4378bC.d();
                aVar6 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a(true, zE, strC, strA, boolD != null ? boolD.booleanValue() : true);
            }
            jVar.f(aVar6);
            jVar.c(aVar5);
            Intent intent = new Intent(context, (Class<?>) MraidActivity.class);
            z0.b(intent, nVar2.d());
            z0.f(intent, nVar2.f());
            if (str != null) {
                z0.n(intent, str);
            }
            intent.setFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            return true;
        }

        public final boolean d(b0 b0Var) {
            WebView webViewC;
            j jVar = j.f48377a;
            b0 b0VarZ = jVar.z();
            if (b0VarZ != null && !tn.p.f(b0VarZ, b0Var)) {
                return false;
            }
            jVar.e(null);
            ViewParent parent = (b0VarZ == null || (webViewC = b0VarZ.c()) == null) ? null : webViewC.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(b0VarZ.c());
            }
            jVar.j(null);
            jVar.d(null);
            jVar.h(null);
            Activity activityY = jVar.y();
            if (activityY != null) {
                activityY.finish();
            }
            jVar.b(null);
            return true;
        }

        public final boolean e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
            return tn.p.f(bVar, b.e.f49994a);
        }

        public final boolean g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
            return bVar instanceof b.f;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48302a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.f48425b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.f48426c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.f48427d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f48302a = iArr;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity$onCreate$1", f = "MraidActivity.kt", l = {160}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements sn.p<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f48304b;

        public c(hn.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, hn.c<? super bn.r> cVar) {
            return ((c) create(bVar, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            c cVar2 = MraidActivity.this.new c(cVar);
            cVar2.f48304b = obj;
            return cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar;
            Object objG = in.a.g();
            int i10 = this.f48303a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.f48304b;
                go.k kVar = MraidActivity.f48295j;
                this.f48304b = bVar2;
                this.f48303a = 1;
                if (kVar.emit(bVar2, this) == objG) {
                    return objG;
                }
                bVar = bVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.f48304b;
                kotlin.c.b(obj);
            }
            if (bVar instanceof b.a) {
                j.f48377a.w().invoke();
            } else {
                a aVar = MraidActivity.f48292g;
                if (aVar.g(bVar)) {
                    MraidActivity.this.finish();
                } else if (aVar.e(bVar)) {
                    MraidActivity.this.f48300e = true;
                    MraidActivity.this.finish();
                }
            }
            return bn.r.f5635a;
        }
    }

    public static final class d implements sn.p<Composer, Integer, bn.r> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a f48307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b0 f48308d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ sn.b<Context, WebView, Integer, go.l<Boolean>, sn.l<? super a.AbstractC0696a.c, bn.r>, sn.a<bn.r>, sn.a<bn.r>, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0, Dp, Boolean, View> f48309e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ sn.p<Composer, Integer, sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r>> f48310f;

        public /* synthetic */ class a extends FunctionReferenceImpl implements sn.a<bn.r> {
            public a(Object obj) {
                super(0, obj, b0.class, "onSkipOrClose", "onSkipOrClose()V", 0);
            }

            public final void a() {
                ((b0) this.receiver).B();
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ bn.r invoke() {
                a();
                return bn.r.f5635a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar, b0 b0Var, sn.b<? super Context, ? super WebView, ? super Integer, ? super go.l<Boolean>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super sn.a<bn.r>, ? super sn.a<bn.r>, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0, ? super Dp, ? super Boolean, ? extends View> bVar, sn.p<? super Composer, ? super Integer, ? extends sn.c<? super BoxScope, ? super Boolean, ? super Boolean, ? super sn.a<bn.r>, ? super sn.l<? super a.AbstractC0696a.c, bn.r>, ? super Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super Composer, ? super Integer, bn.r>> pVar) {
            this.f48307c = aVar;
            this.f48308d = b0Var;
            this.f48309e = bVar;
            this.f48310f = pVar;
        }

        public static final bn.r a() {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, MraidActivity.f48294i, "Skip button shown in MraidActivity", null, false, 12, null);
            j.f48377a.u().invoke();
            return bn.r.f5635a;
        }

        public static final bn.r b(a.AbstractC0696a.c cVar) {
            tn.p.k(cVar, "it");
            return bn.r.f5635a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void c(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1048815572, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.onCreate.<anonymous> (MraidActivity.kt:173)");
            }
            MraidActivity mraidActivity = MraidActivity.this;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.f48307c;
            WebView webViewC = this.f48308d.c();
            Intent intent = MraidActivity.this.getIntent();
            tn.p.j(intent, "getIntent(...)");
            int iZ = z0.z(intent);
            composer.startReplaceableGroup(-674019340);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c
                    @Override // sn.l
                    public final Object invoke(Object obj) {
                        return MraidActivity.d.b((a.AbstractC0696a.c) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            sn.l lVar = (sn.l) objRememberedValue;
            composer.endReplaceableGroup();
            b0 b0Var = this.f48308d;
            composer.startReplaceableGroup(-674017291);
            boolean zChanged = composer.changed(b0Var);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new a(b0Var);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            sn.a aVar2 = (sn.a) ((KFunction) objRememberedValue2);
            sn.b<Context, WebView, Integer, go.l<Boolean>, sn.l<? super a.AbstractC0696a.c, bn.r>, sn.a<bn.r>, sn.a<bn.r>, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0, Dp, Boolean, View> bVar = this.f48309e;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0VarX = j.f48377a.x();
            sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r> cVarMo2invoke = this.f48310f.mo2invoke(composer, 0);
            sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r> cVarC = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.p.c(null, null, 0L, 0L, 0L, null, null, null, composer, 0, 255);
            composer.startReplaceableGroup(-674006789);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.d
                    @Override // sn.a
                    public final Object invoke() {
                        return MraidActivity.d.a();
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b.l(mraidActivity, aVar, webViewC, iZ, lVar, aVar2, bVar, e0VarX, cVarMo2invoke, cVarC, (sn.a) objRememberedValue3, composer, 24576, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ bn.r mo2invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return bn.r.f5635a;
        }
    }

    public /* synthetic */ class e extends AdaptedFunctionReference implements sn.p<e0.f, hn.c<? super bn.r>, Object> {
        public e(Object obj) {
            super(2, obj, MraidActivity.class, "setOrientation", "setOrientation(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/MraidJsCommand$SetOrientationProperties;)V", 4);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(e0.f fVar, hn.c<? super bn.r> cVar) {
            return MraidActivity.b((MraidActivity) this.receiver, fVar, cVar);
        }
    }

    public static final void a(MraidActivity mraidActivity, ActivityResult activityResult) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.p pVar = mraidActivity.f48301f;
        if (pVar == null) {
            tn.p.C("storeInstallerImpl");
            pVar = null;
        }
        pVar.a(activityResult.getResultCode());
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a b() {
        return b.k.f47680a.b();
    }

    public static final /* synthetic */ Object b(MraidActivity mraidActivity, e0.f fVar, hn.c cVar) {
        mraidActivity.a(fVar);
        return bn.r.f5635a;
    }

    public final Integer a(p pVar) {
        int i10 = b.f48302a[pVar.ordinal()];
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

    public final void a(e0.f fVar) {
        p pVarD;
        Integer numA;
        if (fVar == null || (pVarD = fVar.d()) == null || (numA = a(pVarD)) == null) {
            return;
        }
        setRequestedOrientation(numA.intValue());
    }

    public final void a(go.u<e0.f> uVar) {
        a(uVar.getValue());
        go.f.D(go.f.G(uVar, new e(this)), this.f48296a);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a c() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a) this.f48297b.getValue();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.D, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.p pVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVarA;
        super.onCreate(bundle);
        com.moloco.sdk.internal.android_context.b.a(getApplicationContext());
        ForegroundMonitor foregroundMonitor = ForegroundMonitor.f48960b;
        foregroundMonitor.a();
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MraidActivity.a(this.f48311a, (ActivityResult) obj);
            }
        });
        tn.p.j(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f48301f = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m(this, activityResultLauncherRegisterForActivityResult, LifecycleOwnerKt.getLifecycleScope(this), foregroundMonitor.b(), 0L, null, null, 112, null);
        w0 w0VarF = b.h.f47664a.f();
        j jVar = j.f48377a;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b bVarN = jVar.n();
        boolean zA = bVarN != null ? bVarN.a() : false;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVarL = jVar.l();
        boolean zB = aVarL != null ? aVarL.b() : false;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVarL2 = jVar.l();
        boolean zE = aVarL2 != null ? aVarL2.e() : false;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVarL3 = jVar.l();
        boolean zD = aVarL3 != null ? aVarL3.d() : true;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVarL4 = jVar.l();
        String strA = aVarL4 != null ? aVarL4.a() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVarL5 = jVar.l();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l(zA, zB, zE, zD, strA, aVarL5 != null ? aVarL5.c() : null, jVar.r());
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.p pVar2 = this.f48301f;
        if (pVar2 == null) {
            tn.p.C("storeInstallerImpl");
            pVar = null;
        } else {
            pVar = pVar2;
        }
        Intent intent = getIntent();
        tn.p.j(intent, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVarA = lVar.a(w0VarF, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k(pVar, z0.y(intent), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.d(), jVar.n(), jVar.l(), jVar.r()));
        jVar.b(this);
        sn.p<Composer, Integer, sn.c<BoxScope, Boolean, Boolean, sn.a<bn.r>, sn.l<? super a.AbstractC0696a.c, bn.r>, Boolean, bn.k, bn.k, sn.a<bn.r>, Composer, Integer, bn.r>> pVarP = jVar.p();
        sn.b<Context, WebView, Integer, go.l<Boolean>, sn.l<? super a.AbstractC0696a.c, bn.r>, sn.a<bn.r>, sn.a<bn.r>, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0, Dp, Boolean, View> bVarS = jVar.s();
        if (bVarS == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, f48294i, "can't display ad: MraidRenderer is missing", null, false, 12, null);
            finish();
            return;
        }
        b0 b0VarZ = jVar.z();
        if (b0VarZ == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, f48294i, "can't display ad: mraid controller is missing", null, false, 12, null);
            finish();
            return;
        }
        n nVarA = jVar.a();
        if (nVarA != null) {
            Intent intent2 = getIntent();
            tn.p.j(intent2, "getIntent(...)");
            aVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.a(nVarA, w0VarF, this, b0VarZ, z0.A(intent2), c(), oVarA);
        } else {
            aVarA = null;
        }
        if (aVarA == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, f48294i, "can't display ad: mraid ad data is missing", null, false, 12, null);
            finish();
            return;
        }
        b0VarZ.f(oVarA);
        a(b0VarZ.e());
        go.f.D(go.f.G(aVarA.a(), new c(null)), this.f48296a);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1048815572, true, new d(aVarA, b0VarZ, bVarS, pVarP)), 1, null);
        aVarA.d();
        this.f48298c = aVarA;
        this.f48299d = b0VarZ;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        sn.a<bn.r> aVarV;
        super.onDestroy();
        if (!this.f48300e && (aVarV = j.f48377a.v()) != null) {
            aVarV.invoke();
        }
        sn.a<bn.r> aVarT = j.f48377a.t();
        if (aVarT != null) {
            aVarT.invoke();
        }
        f48292g.d(this.f48299d);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.f48298c;
        if (aVar != null) {
            aVar.destroy();
        }
        this.f48298c = null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.p pVar = this.f48301f;
        if (pVar == null) {
            tn.p.C("storeInstallerImpl");
            pVar = null;
        }
        pVar.cancel();
        kotlinx.coroutines.d.e(this.f48296a, null, 1, null);
    }
}
