package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import cn.f0;
import cn.v0;
import com.moloco.sdk.internal.MolocoLogger;
import go.p;
import go.q;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p000do.l0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class d implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final l0 f48802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final go.k<r> f48803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final p<r> f48804c;

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.CloseHandler$handleEvent$1", f = "CloseHandler.kt", l = {29}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48805a;

        public a(hn.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return d.this.new a(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f48805a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                go.k kVar = d.this.f48803b;
                r rVar = r.f5635a;
                this.f48805a = 1;
                if (kVar.emit(rVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f5635a;
        }
    }

    public d(@NotNull l0 l0Var) {
        tn.p.k(l0Var, "scope");
        this.f48802a = l0Var;
        go.k<r> kVarB = q.b(0, 0, null, 7, null);
        this.f48803b = kVarB;
        this.f48804c = go.f.b(kVarB);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    @NotNull
    public Set<String> a() {
        return v0.d("close");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(@NotNull JSONObject jSONObject) {
        tn.p.k(jSONObject, "event");
        if (tn.p.f(jSONObject.getString("event"), f0.s0(a()))) {
            p000do.i.d(this.f48802a, null, null, new a(null), 3, null);
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, b(), "Event not supported: " + jSONObject.getString("event"), false, 4, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    @NotNull
    public String b() {
        return "CloseHandler";
    }

    @NotNull
    public final p<r> c() {
        return this.f48804c;
    }
}
