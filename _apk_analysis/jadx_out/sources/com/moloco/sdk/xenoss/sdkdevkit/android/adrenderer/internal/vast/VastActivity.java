package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C4377a;
import com.moloco.sdk.internal.ortb.model.C4378b;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.ForegroundMonitor;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 0)
public final class VastActivity extends ComponentActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f49300f = "VastActivity";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a f49303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static sn.p<? super Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, ? extends View> f49304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static sn.a<bn.r> f49305k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static kotlinx.coroutines.g f49306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public static e0 f49307m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public static com.moloco.sdk.acm.recorder.a f49308n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a f49309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final l0 f49310b = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getMain());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.p f49311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f49298d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f49299e = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final go.k<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b> f49301g = go.q.b(0, 0, null, 7, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static WeakReference<VastActivity> f49302h = new WeakReference<>(null);

    public static final class a {

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a, reason: collision with other inner class name */
        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2", f = "VastActivity.kt", l = {247}, m = "invokeSuspend")
        public static final class C0650a extends SuspendLambda implements sn.p<l0, hn.c<? super kotlinx.coroutines.g>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f49312a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a f49313b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d0 f49314c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ sn.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, bn.r> f49315d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Context f49316e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f49317f;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a, reason: collision with other inner class name */
            @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1", f = "VastActivity.kt", l = {}, m = "invokeSuspend")
            public static final class C0651a extends SuspendLambda implements sn.p<l0, hn.c<? super kotlinx.coroutines.g>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f49318a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public /* synthetic */ Object f49319b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ sn.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, bn.r> f49320c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Context f49321d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ d0 f49322e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ String f49323f;

                /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$a, reason: collision with other inner class name */
                @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1$1", f = "VastActivity.kt", l = {254}, m = "invokeSuspend")
                public static final class C0652a extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public int f49324a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ sn.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, bn.r> f49325b;

                    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$a$a, reason: collision with other inner class name */
                    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1$1$1", f = "VastActivity.kt", l = {}, m = "invokeSuspend")
                    public static final class C0653a extends SuspendLambda implements sn.p<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, hn.c<? super bn.r>, Object> {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public int f49326a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public /* synthetic */ Object f49327b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ sn.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, bn.r> f49328c;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C0653a(sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, bn.r> lVar, hn.c<? super C0653a> cVar) {
                            super(2, cVar);
                            this.f49328c = lVar;
                        }

                        @Override // sn.p
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Object mo2invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, hn.c<? super bn.r> cVar) {
                            return ((C0653a) create(bVar, cVar)).invokeSuspend(bn.r.f5635a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                            C0653a c0653a = new C0653a(this.f49328c, cVar);
                            c0653a.f49327b = obj;
                            return c0653a;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            in.a.g();
                            if (this.f49326a != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.c.b(obj);
                            this.f49328c.invoke((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.f49327b);
                            return bn.r.f5635a;
                        }
                    }

                    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$a$b */
                    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1$1$2", f = "VastActivity.kt", l = {}, m = "invokeSuspend")
                    public static final class b extends SuspendLambda implements sn.p<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, hn.c<? super Boolean>, Object> {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public int f49329a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public /* synthetic */ Object f49330b;

                        public b(hn.c<? super b> cVar) {
                            super(2, cVar);
                        }

                        @Override // sn.p
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Object mo2invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, hn.c<? super Boolean> cVar) {
                            return ((b) create(bVar, cVar)).invokeSuspend(bn.r.f5635a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                            b bVar = new b(cVar);
                            bVar.f49330b = obj;
                            return bVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            in.a.g();
                            if (this.f49329a != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.c.b(obj);
                            return jn.a.a(VastActivity.f49298d.g((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.f49330b));
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0652a(sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, bn.r> lVar, hn.c<? super C0652a> cVar) {
                        super(2, cVar);
                        this.f49325b = lVar;
                    }

                    @Override // sn.p
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
                        return ((C0652a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                        return new C0652a(this.f49325b, cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objG = in.a.g();
                        int i10 = this.f49324a;
                        if (i10 == 0) {
                            kotlin.c.b(obj);
                            go.d dVarG = go.f.G(VastActivity.f49301g, new C0653a(this.f49325b, null));
                            b bVar = new b(null);
                            this.f49324a = 1;
                            if (go.f.y(dVarG, bVar, this) == objG) {
                                return objG;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.c.b(obj);
                        }
                        return bn.r.f5635a;
                    }
                }

                /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$b */
                @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1$2", f = "VastActivity.kt", l = {}, m = "invokeSuspend")
                public static final class b extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public int f49331a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Context f49332b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ d0 f49333c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ String f49334d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(Context context, d0 d0Var, String str, hn.c<? super b> cVar) {
                        super(2, cVar);
                        this.f49332b = context;
                        this.f49333c = d0Var;
                        this.f49334d = str;
                    }

                    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
                        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
                        if (intent == null) {
                            return;
                        }
                        BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.D);
                        context.startActivity(intent);
                    }

                    @Override // sn.p
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
                        return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                        return new b(this.f49332b, this.f49333c, this.f49334d, cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Boolean boolD;
                        String strA;
                        in.a.g();
                        if (this.f49331a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.b(obj);
                        Context context = this.f49332b;
                        Intent intent = new Intent(this.f49332b, (Class<?>) VastActivity.class);
                        d0 d0Var = this.f49333c;
                        String str = this.f49334d;
                        z0.v(intent, d0Var.i());
                        z0.b(intent, d0Var.e());
                        z0.f(intent, d0Var.f());
                        z0.c(intent, d0Var.g());
                        z0.k(intent, d0Var.h());
                        z0.s(intent, d0Var.d());
                        z0.q(intent, d0Var.c());
                        C4377a c4377aA = d0Var.a();
                        if (c4377aA != null) {
                            z0.o(intent, c4377aA.b());
                        }
                        C4377a c4377aA2 = d0Var.a();
                        if (c4377aA2 != null) {
                            z0.l(intent, c4377aA2.c());
                        }
                        if (d0Var.b() != null) {
                            z0.e(intent, true);
                        }
                        C4378b c4378bB = d0Var.b();
                        if (c4378bB != null) {
                            z0.m(intent, c4378bB.e());
                        }
                        C4378b c4378bB2 = d0Var.b();
                        if (c4378bB2 != null) {
                            z0.g(intent, c4378bB2.c());
                        }
                        C4378b c4378bB3 = d0Var.b();
                        if (c4378bB3 != null && (strA = c4378bB3.a()) != null) {
                            z0.d(intent, strA);
                        }
                        C4378b c4378bB4 = d0Var.b();
                        if (c4378bB4 != null && (boolD = c4378bB4.d()) != null) {
                            z0.h(intent, boolD.booleanValue());
                        }
                        if (str != null) {
                            z0.n(intent, str);
                        }
                        intent.setFlags(268435456);
                        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                        return bn.r.f5635a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0651a(sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, bn.r> lVar, Context context, d0 d0Var, String str, hn.c<? super C0651a> cVar) {
                    super(2, cVar);
                    this.f49320c = lVar;
                    this.f49321d = context;
                    this.f49322e = d0Var;
                    this.f49323f = str;
                }

                @Override // sn.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo2invoke(l0 l0Var, hn.c<? super kotlinx.coroutines.g> cVar) {
                    return ((C0651a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                    C0651a c0651a = new C0651a(this.f49320c, this.f49321d, this.f49322e, this.f49323f, cVar);
                    c0651a.f49319b = obj;
                    return c0651a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    in.a.g();
                    if (this.f49318a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    l0 l0Var = (l0) this.f49319b;
                    a aVar = VastActivity.f49298d;
                    VastActivity.f49306l = p000do.i.d(l0Var, null, null, new C0652a(this.f49320c, null), 3, null);
                    return p000do.i.d(l0Var, null, null, new b(this.f49321d, this.f49322e, this.f49323f, null), 3, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0650a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, d0 d0Var, sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, bn.r> lVar, Context context, String str, hn.c<? super C0650a> cVar) {
                super(2, cVar);
                this.f49313b = aVar;
                this.f49314c = d0Var;
                this.f49315d = lVar;
                this.f49316e = context;
                this.f49317f = str;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(l0 l0Var, hn.c<? super kotlinx.coroutines.g> cVar) {
                return ((C0650a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new C0650a(this.f49313b, this.f49314c, this.f49315d, this.f49316e, this.f49317f, cVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objG = in.a.g();
                int i10 = this.f49312a;
                try {
                    if (i10 == 0) {
                        kotlin.c.b(obj);
                        a aVar = VastActivity.f49298d;
                        VastActivity.f49303i = this.f49313b;
                        VastActivity.f49304j = this.f49314c.j();
                        C0651a c0651a = new C0651a(this.f49315d, this.f49316e, this.f49314c, this.f49317f, null);
                        this.f49312a = 1;
                        obj = kotlinx.coroutines.d.f(c0651a, this);
                        if (obj == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.b(obj);
                    }
                    return (kotlinx.coroutines.g) obj;
                } finally {
                    a aVar2 = VastActivity.f49298d;
                    VastActivity vastActivityH = aVar2.h();
                    if (vastActivityH != null) {
                        vastActivityH.finish();
                    }
                    VastActivity.f49305k = null;
                    VastActivity.f49303i = null;
                    VastActivity.f49308n = null;
                    VastActivity.f49304j = null;
                    aVar2.b();
                }
            }
        }

        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @Nullable
        public final Object a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, @NotNull Context context, @NotNull d0 d0Var, @NotNull sn.a<bn.r> aVar2, @NotNull e0 e0Var, @Nullable String str, @NotNull com.moloco.sdk.acm.recorder.a aVar3, @NotNull sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, bn.r> lVar, @NotNull hn.c<? super bn.r> cVar) {
            VastActivity.f49307m = e0Var;
            VastActivity.f49305k = aVar2;
            VastActivity.f49308n = aVar3;
            Object objG = p000do.g.g(com.moloco.sdk.internal.scheduling.c.a().getMain(), new C0650a(aVar, d0Var, lVar, context, str, null), cVar);
            return objG == in.a.g() ? objG : bn.r.f5635a;
        }

        public final void b() {
            kotlinx.coroutines.g gVar = VastActivity.f49306l;
            if (gVar == null || !gVar.isActive()) {
                return;
            }
            kotlinx.coroutines.g gVar2 = VastActivity.f49306l;
            if (gVar2 != null) {
                g.a.a(gVar2, null, 1, null);
            }
            VastActivity.f49306l = null;
        }

        public final void e(VastActivity vastActivity) {
            VastActivity.f49302h = new WeakReference(vastActivity);
            if (vastActivity == null) {
                b();
            }
        }

        public final boolean g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
            return (bVar instanceof b.f) || tn.p.f(bVar, b.e.f49994a);
        }

        public final VastActivity h() {
            return (VastActivity) VastActivity.f49302h.get();
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$onCreate$1", f = "VastActivity.kt", l = {170}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f49336b;

        public b(hn.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, hn.c<? super bn.r> cVar) {
            return ((b) create(bVar, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            b bVar = VastActivity.this.new b(cVar);
            bVar.f49336b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar;
            Object objG = in.a.g();
            int i10 = this.f49335a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.f49336b;
                MolocoLogger.info$default(MolocoLogger.INSTANCE, VastActivity.f49300f, "VastActivity received event: " + bVar2, null, false, 12, null);
                go.k kVar = VastActivity.f49301g;
                this.f49336b = bVar2;
                this.f49335a = 1;
                if (kVar.emit(bVar2, this) == objG) {
                    return objG;
                }
                bVar = bVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.f49336b;
                kotlin.c.b(obj);
            }
            if (VastActivity.f49298d.g(bVar)) {
                VastActivity.this.finish();
            }
            return bn.r.f5635a;
        }
    }

    public static final class c implements sn.p<Composer, Integer, bn.r> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a f49339c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ sn.p<Context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, View> f49340d;

        /* JADX WARN: Multi-variable type inference failed */
        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar, sn.p<? super Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, ? extends View> pVar) {
            this.f49339c = aVar;
            this.f49340d = pVar;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1009520481, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.onCreate.<anonymous> (VastActivity.kt:177)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.c.c(VastActivity.this, this.f49339c, this.f49340d, VastActivity.f49307m, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ bn.r mo2invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return bn.r.f5635a;
        }
    }

    public static final void a(VastActivity vastActivity, ActivityResult activityResult) {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, f49300f, "Activity result received: resultCode=" + activityResult.getResultCode(), null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, f49300f, "Activity result received: resultData=" + activityResult.getData(), null, false, 12, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.p pVar = vastActivity.f49311c;
        if (pVar == null) {
            tn.p.C("storeInstallerImpl");
            pVar = null;
        }
        pVar.a(activityResult.getResultCode());
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.D, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.p pVar;
        super.onCreate(bundle);
        com.moloco.sdk.internal.android_context.b.a(getApplicationContext());
        ForegroundMonitor foregroundMonitor = ForegroundMonitor.f48960b;
        foregroundMonitor.a();
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                VastActivity.a(this.f49341a, (ActivityResult) obj);
            }
        });
        tn.p.j(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        w0 w0VarF = b.h.f47664a.f();
        this.f49311c = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m(this, activityResultLauncherRegisterForActivityResult, LifecycleOwnerKt.getLifecycleScope(this), foregroundMonitor.b(), 0L, null, null, 112, null);
        Intent intent = getIntent();
        tn.p.j(intent, "getIntent(...)");
        boolean zT = z0.t(intent);
        Intent intent2 = getIntent();
        tn.p.j(intent2, "getIntent(...)");
        boolean zI = z0.i(intent2);
        Intent intent3 = getIntent();
        tn.p.j(intent3, "getIntent(...)");
        boolean zR = z0.r(intent3);
        Intent intent4 = getIntent();
        tn.p.j(intent4, "getIntent(...)");
        boolean zP = z0.p(intent4);
        Intent intent5 = getIntent();
        tn.p.j(intent5, "getIntent(...)");
        String strA = z0.a(intent5);
        Intent intent6 = getIntent();
        tn.p.j(intent6, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l(zT, zI, zR, zP, strA, z0.j(intent6), f49308n);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.p pVar2 = this.f49311c;
        if (pVar2 == null) {
            tn.p.C("storeInstallerImpl");
            pVar = null;
        } else {
            pVar = pVar2;
        }
        Intent intent7 = getIntent();
        tn.p.j(intent7, "getIntent(...)");
        String strY = z0.y(intent7);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.d dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.d();
        Intent intent8 = getIntent();
        tn.p.j(intent8, "getIntent(...)");
        boolean zT2 = z0.t(intent8);
        Intent intent9 = getIntent();
        tn.p.j(intent9, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b(zT2, z0.u(intent9));
        Intent intent10 = getIntent();
        tn.p.j(intent10, "getIntent(...)");
        boolean zI2 = z0.i(intent10);
        Intent intent11 = getIntent();
        tn.p.j(intent11, "getIntent(...)");
        boolean zR2 = z0.r(intent11);
        Intent intent12 = getIntent();
        tn.p.j(intent12, "getIntent(...)");
        String strJ = z0.j(intent12);
        Intent intent13 = getIntent();
        tn.p.j(intent13, "getIntent(...)");
        String strA2 = z0.a(intent13);
        Intent intent14 = getIntent();
        tn.p.j(intent14, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVarA = lVar.a(w0VarF, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k(pVar, strY, dVar, bVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a(zI2, zR2, strJ, strA2, z0.p(intent14)), f49308n));
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar = f49303i;
        if (aVar == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, f49300f, "ad is missing", null, false, 12, null);
            finish();
            return;
        }
        sn.p<? super Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, ? extends View> pVar3 = f49304j;
        if (pVar3 == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, f49300f, "VastRenderer is missing", null, false, 12, null);
            finish();
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVarB = b.k.f47680a.b();
        Intent intent15 = getIntent();
        tn.p.j(intent15, "getIntent(...)");
        boolean zD = z0.D(intent15);
        Intent intent16 = getIntent();
        tn.p.j(intent16, "getIntent(...)");
        Boolean boolB = z0.B(intent16);
        Intent intent17 = getIntent();
        tn.p.j(intent17, "getIntent(...)");
        int iC = z0.C(intent17);
        Intent intent18 = getIntent();
        tn.p.j(intent18, "getIntent(...)");
        int iZ = z0.z(intent18);
        Intent intent19 = getIntent();
        tn.p.j(intent19, "getIntent(...)");
        int iA = z0.A(intent19);
        Intent intent20 = getIntent();
        tn.p.j(intent20, "getIntent(...)");
        boolean zX = z0.x(intent20);
        Intent intent21 = getIntent();
        tn.p.j(intent21, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVarB2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.b(aVar, w0VarF, this, aVarB, zD, boolB, iC, iZ, iA, zX, z0.w(intent21), oVarA);
        this.f49309a = aVarB2;
        f49298d.e(this);
        go.f.D(go.f.G(aVarB2.a(), new b(null)), this.f49310b);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1009520481, true, new c(aVarB2, pVar3)), 1, null);
        aVarB2.d();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        sn.a<bn.r> aVar = f49305k;
        if (aVar != null) {
            aVar.invoke();
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar2 = this.f49309a;
        if (aVar2 != null) {
            aVar2.destroy();
        }
        this.f49309a = null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.p pVar = this.f49311c;
        if (pVar == null) {
            tn.p.C("storeInstallerImpl");
            pVar = null;
        }
        pVar.cancel();
        kotlinx.coroutines.d.e(this.f49310b, null, 1, null);
        f49298d.e(null);
    }
}
