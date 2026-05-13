package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import cn.v0;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.f0;
import go.q;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p000do.l0;
import sn.p;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class b implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final f0 f48790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final l0 f48791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final go.k<r> f48792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final go.k<r> f48793d;

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.ClickthroughEventHandler$handleEvent$1", f = "ClickthroughEventHandler.kt", l = {34}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48794a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48796c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f48796c = str;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return b.this.new a(this.f48796c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f48794a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                f0 f0Var = b.this.f48790a;
                String str = this.f48796c;
                tn.p.h(str);
                go.k<r> kVar = b.this.f48792c;
                this.f48794a = 1;
                if (f0Var.b(str, kVar, this) == objG) {
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

    public b(@NotNull f0 f0Var, @NotNull l0 l0Var) {
        tn.p.k(f0Var, "clickthroughService");
        tn.p.k(l0Var, "scope");
        this.f48790a = f0Var;
        this.f48791b = l0Var;
        go.k<r> kVarB = q.b(0, 0, null, 7, null);
        this.f48792c = kVarB;
        this.f48793d = kVarB;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    @NotNull
    public Set<String> a() {
        return v0.d("clickthrough");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(@NotNull JSONObject jSONObject) throws JSONException {
        tn.p.k(jSONObject, "event");
        if (!tn.p.f(jSONObject.getString("event"), cn.f0.s0(a()))) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, b(), "Event not supported: " + jSONObject.getString("event"), false, 4, null);
            return;
        }
        String string = jSONObject.getString("contentType");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, b(), "Ad clicked on " + string, false, 4, null);
        p000do.i.d(this.f48791b, null, null, new a(jSONObject.getString("url"), null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    @NotNull
    public String b() {
        return "ClickthroughEventHandler";
    }

    @NotNull
    public final go.k<r> c() {
        return this.f48793d;
    }
}
