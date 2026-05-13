package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader;

import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.g0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k;
import go.l;
import go.u;
import go.v;
import hn.c;
import jn.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;
import tn.i;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
public final class a implements k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final C0622a f48610g = new C0622a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f48611h = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f48612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final l0 f48613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b f48614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final l<Boolean> f48615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final u<Boolean> f48616f;

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a$a, reason: collision with other inner class name */
    public static final class C0622a {
        public C0622a() {
        }

        public /* synthetic */ C0622a(i iVar) {
            this();
        }
    }

    @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.WebViewAdLoad$load$1", f = "WebviewAdLoad.kt", l = {21}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements p<l0, c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48617a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f48619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k.a f48620d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, k.a aVar, c<? super b> cVar) {
            super(2, cVar);
            this.f48619c = j10;
            this.f48620d = aVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, c<? super r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return a.this.new b(this.f48619c, this.f48620d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f48617a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b bVarA = a.this.a();
                String str = a.this.f48612b;
                long j10 = this.f48619c;
                this.f48617a = 1;
                obj = bVarA.c(str, j10, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            g0 g0Var = (g0) obj;
            if (g0Var instanceof g0.b) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "WebViewAdLoad", "WebViewAdLoad: load success", null, false, 12, null);
                a.this.f48615e.setValue(jn.a.a(true));
                k.a aVar = this.f48620d;
                if (aVar != null) {
                    aVar.a();
                }
            } else {
                if (!(g0Var instanceof g0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "WebViewAdLoad", "WebViewAdLoad: load failure", null, false, 12, null);
                a.this.f48615e.setValue(jn.a.a(false));
                k.a aVar2 = this.f48620d;
                if (aVar2 != null) {
                    aVar2.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((g0.a) g0Var).a());
                }
            }
            return r.f5635a;
        }
    }

    public a(@NotNull String str, @NotNull l0 l0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b bVar) {
        tn.p.k(str, "adm");
        tn.p.k(l0Var, "scope");
        tn.p.k(bVar, "webView");
        this.f48612b = str;
        this.f48613c = l0Var;
        this.f48614d = bVar;
        l<Boolean> lVarA = v.a(Boolean.FALSE);
        this.f48615e = lVarA;
        this.f48616f = lVarA;
    }

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b a() {
        return this.f48614d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void i(long j10, @Nullable k.a aVar) {
        p000do.i.d(this.f48613c, null, null, new b(j10, aVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    @NotNull
    public u<Boolean> isLoaded() {
        return this.f48616f;
    }
}
