package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import bn.r;
import com.ironsource.C4157n2;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z0;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import go.l;
import go.v;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KFunction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;
import tn.i;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
public final class StaticAdActivity extends ComponentActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f48520b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static sn.b<? super Context, ? super WebView, ? super Integer, ? super l<Boolean>, ? super sn.l<? super a.AbstractC0696a.c, r>, ? super sn.a<r>, ? super sn.a<r>, ? super e0, ? super Dp, ? super Boolean, ? extends View> f48521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a f48522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static StaticAdActivity f48523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static sn.a<r> f48524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static sn.a<r> f48525g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static e0 f48527i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f48519a = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final l<Boolean> f48526h = v.a(Boolean.FALSE);

    public static final class a {

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a$a, reason: collision with other inner class name */
        @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$Companion", f = "StaticAdActivity.kt", l = {104}, m = C4157n2.f33013v)
        public static final class C0615a extends ContinuationImpl {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f48528a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f48529b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f48531d;

            public C0615a(hn.c<? super C0615a> cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f48529b = obj;
                this.f48531d |= Integer.MIN_VALUE;
                return a.this.a(null, null, null, null, null, null, this);
            }
        }

        @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$Companion$show$3", f = "StaticAdActivity.kt", l = {}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements p<Boolean, hn.c<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f48532a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ boolean f48533b;

            public b(hn.c<? super b> cVar) {
                super(2, cVar);
            }

            public final Object a(boolean z10, hn.c<? super Boolean> cVar) {
                return ((b) create(Boolean.valueOf(z10), cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<r> create(Object obj, hn.c<?> cVar) {
                b bVar = new b(cVar);
                bVar.f48533b = ((Boolean) obj).booleanValue();
                return bVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo2invoke(Boolean bool, hn.c<? super Boolean> cVar) {
                return a(bool.booleanValue(), cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f48532a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                return jn.a.a(this.f48533b);
            }
        }

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

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(@org.jetbrains.annotations.NotNull android.content.Context r7, @org.jetbrains.annotations.NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a r8, @org.jetbrains.annotations.NotNull sn.a<bn.r> r9, @org.jetbrains.annotations.NotNull sn.a<bn.r> r10, @org.jetbrains.annotations.NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n r11, @org.jetbrains.annotations.NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 r12, @org.jetbrains.annotations.NotNull hn.c<? super bn.r> r13) {
            /*
                r6 = this;
                boolean r0 = r13 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a.C0615a
                if (r0 == 0) goto L13
                r0 = r13
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a.C0615a) r0
                int r1 = r0.f48531d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f48531d = r1
                goto L18
            L13:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a$a
                r0.<init>(r13)
            L18:
                java.lang.Object r13 = r0.f48529b
                java.lang.Object r1 = in.a.g()
                int r2 = r0.f48531d
                r3 = 0
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L37
                if (r2 != r4) goto L2f
                java.lang.Object r7 = r0.f48528a
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a r7 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a) r7
                kotlin.c.b(r13)     // Catch: java.lang.Throwable -> L9f
                goto L77
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                kotlin.c.b(r13)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a(r12)     // Catch: java.lang.Throwable -> L9f
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a(r8)     // Catch: java.lang.Throwable -> L9f
                sn.b r8 = r11.a()     // Catch: java.lang.Throwable -> L9f
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a(r8)     // Catch: java.lang.Throwable -> L9f
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a(r9)     // Catch: java.lang.Throwable -> L9f
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.b(r10)     // Catch: java.lang.Throwable -> L9f
                android.content.Intent r8 = new android.content.Intent     // Catch: java.lang.Throwable -> L9f
                java.lang.Class<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity> r9 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.class
                r8.<init>(r7, r9)     // Catch: java.lang.Throwable -> L9f
                int r9 = r11.d()     // Catch: java.lang.Throwable -> L9f
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z0.b(r8, r9)     // Catch: java.lang.Throwable -> L9f
                r9 = 268435456(0x10000000, float:2.524355E-29)
                r8.setFlags(r9)     // Catch: java.lang.Throwable -> L9f
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(r7, r8)     // Catch: java.lang.Throwable -> L9f
                go.l r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.b()     // Catch: java.lang.Throwable -> L9f
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a$b r8 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a$b     // Catch: java.lang.Throwable -> L9f
                r8.<init>(r5)     // Catch: java.lang.Throwable -> L9f
                r0.f48528a = r6     // Catch: java.lang.Throwable -> L9f
                r0.f48531d = r4     // Catch: java.lang.Throwable -> L9f
                java.lang.Object r13 = go.f.w(r7, r8, r0)     // Catch: java.lang.Throwable -> L9f
                if (r13 != r1) goto L77
                return r1
            L77:
                java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> L9f
                r13.booleanValue()     // Catch: java.lang.Throwable -> L9f
                go.l r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.b()
                java.lang.Boolean r8 = jn.a.a(r3)
                r7.setValue(r8)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a(r5)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.b(r5)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a(r5)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a(r5)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a()
                if (r7 == 0) goto L9c
                r7.finish()
            L9c:
                bn.r r7 = bn.r.f5635a
                return r7
            L9f:
                r7 = move-exception
                go.l r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.b()
                java.lang.Boolean r9 = jn.a.a(r3)
                r8.setValue(r9)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a(r5)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.b(r5)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a(r5)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a(r5)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a()
                if (r8 == 0) goto Lc0
                r8.finish()
            Lc0:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.a.a(android.content.Context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a, sn.a, sn.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0, hn.c):java.lang.Object");
        }

        public final void b() {
            StaticAdActivity.f48526h.setValue(Boolean.TRUE);
        }

        public final void e(a.AbstractC0696a.c cVar) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar = StaticAdActivity.f48522d;
            if (aVar != null) {
                aVar.l(cVar);
            }
        }
    }

    public static final class b implements p<Composer, Integer, r> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a f48535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ sn.b<Context, WebView, Integer, l<Boolean>, sn.l<? super a.AbstractC0696a.c, r>, sn.a<r>, sn.a<r>, e0, Dp, Boolean, View> f48536d;

        public /* synthetic */ class a extends FunctionReferenceImpl implements sn.l<a.AbstractC0696a.c, r> {
            public a(Object obj) {
                super(1, obj, a.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0);
            }

            public final void a(a.AbstractC0696a.c cVar) {
                tn.p.k(cVar, "p0");
                ((a) this.receiver).e(cVar);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(a.AbstractC0696a.c cVar) {
                a(cVar);
                return r.f5635a;
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$b$b, reason: collision with other inner class name */
        public /* synthetic */ class C0616b extends FunctionReferenceImpl implements sn.a<r> {
            public C0616b(Object obj) {
                super(0, obj, a.class, "dismiss", "dismiss()V", 0);
            }

            public final void a() {
                ((a) this.receiver).b();
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ r invoke() {
                a();
                return r.f5635a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar, sn.b<? super Context, ? super WebView, ? super Integer, ? super l<Boolean>, ? super sn.l<? super a.AbstractC0696a.c, r>, ? super sn.a<r>, ? super sn.a<r>, ? super e0, ? super Dp, ? super Boolean, ? extends View> bVar) {
            this.f48535c = aVar;
            this.f48536d = bVar;
        }

        public static final r a() {
            sn.a aVar = StaticAdActivity.f48525g;
            if (aVar != null) {
                aVar.invoke();
            }
            return r.f5635a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1193619358, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.onCreate.<anonymous> (StaticAdActivity.kt:38)");
            }
            StaticAdActivity staticAdActivity = StaticAdActivity.this;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar = this.f48535c;
            Intent intent = staticAdActivity.getIntent();
            tn.p.j(intent, "getIntent(...)");
            int iZ = z0.z(intent);
            a aVar2 = StaticAdActivity.f48519a;
            composer.startReplaceableGroup(-1212657475);
            boolean zChanged = composer.changed(aVar2);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new a(aVar2);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            sn.l lVar = (sn.l) ((KFunction) objRememberedValue);
            composer.startReplaceableGroup(-1212655916);
            boolean zChanged2 = composer.changed(aVar2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new C0616b(aVar2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            sn.a aVar3 = (sn.a) ((KFunction) objRememberedValue2);
            sn.b<Context, WebView, Integer, l<Boolean>, sn.l<? super a.AbstractC0696a.c, r>, sn.a<r>, sn.a<r>, e0, Dp, Boolean, View> bVar = this.f48536d;
            e0 e0Var = StaticAdActivity.f48527i;
            composer.startReplaceableGroup(-1212651224);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.b
                    @Override // sn.a
                    public final Object invoke() {
                        return StaticAdActivity.b.a();
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b.k(staticAdActivity, aVar, iZ, lVar, aVar3, bVar, e0Var, (sn.a) objRememberedValue3, composer, 12582912);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return r.f5635a;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(g.D, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        com.moloco.sdk.internal.android_context.b.a(getApplicationContext());
        f48523e = this;
        sn.b<? super Context, ? super WebView, ? super Integer, ? super l<Boolean>, ? super sn.l<? super a.AbstractC0696a.c, r>, ? super sn.a<r>, ? super sn.a<r>, ? super e0, ? super Dp, ? super Boolean, ? extends View> bVar = f48521c;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar = f48522d;
        if (aVar == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "StaticAdActivity", "can't display ad: WebView is missing", null, false, 12, null);
            f48519a.b();
        } else if (bVar != null) {
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1193619358, true, new b(aVar, bVar)), 1, null);
        } else {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "StaticAdActivity", "can't display ad: StaticRenderer is missing", null, false, 12, null);
            f48519a.b();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        sn.a<r> aVar = f48524f;
        if (aVar != null) {
            aVar.invoke();
        }
        f48523e = null;
    }
}
