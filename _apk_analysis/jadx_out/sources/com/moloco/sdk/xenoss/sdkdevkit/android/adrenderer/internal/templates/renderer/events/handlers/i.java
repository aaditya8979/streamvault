package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import cn.w0;
import com.moloco.sdk.internal.MolocoLogger;
import go.p;
import go.q;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p000do.l0;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
public final class i implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final l0 f48836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final go.k<Boolean> f48837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final p<Boolean> f48838c;

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.RequiredContentEventHandler$handleEvent$1", f = "RequiredContentEventHandler.kt", l = {33}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48839a;

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
            return i.this.new a(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f48839a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, i.this.b(), "Content loaded event emitting", null, false, 12, null);
                go.k kVar = i.this.f48837b;
                Boolean boolA = jn.a.a(true);
                this.f48839a = 1;
                if (kVar.emit(boolA, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, i.this.b(), "Content loaded event emitted", null, false, 12, null);
            return r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.RequiredContentEventHandler$handleEvent$2", f = "RequiredContentEventHandler.kt", l = {39}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48841a;

        public b(hn.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return i.this.new b(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f48841a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                go.k kVar = i.this.f48837b;
                Boolean boolA = jn.a.a(false);
                this.f48841a = 1;
                if (kVar.emit(boolA, this) == objG) {
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

    public i(@NotNull l0 l0Var) {
        tn.p.k(l0Var, "scope");
        this.f48836a = l0Var;
        go.k<Boolean> kVarB = q.b(1, 0, null, 6, null);
        this.f48837b = kVarB;
        this.f48838c = kVarB;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    @NotNull
    public Set<String> a() {
        return w0.j("requiredContentLoaded", "requiredContentError");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(@NotNull JSONObject jSONObject) throws JSONException {
        tn.p.k(jSONObject, "event");
        String string = jSONObject.getString("event");
        if (tn.p.f(string, "requiredContentLoaded")) {
            p000do.i.d(this.f48836a, null, null, new a(null), 3, null);
            return;
        }
        if (tn.p.f(string, "requiredContentError")) {
            p000do.i.d(this.f48836a, null, null, new b(null), 3, null);
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, b(), "Event not handled: " + string, false, 4, null);
        r rVar = r.f5635a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    @NotNull
    public String b() {
        return "RequiredContentEventHandler";
    }

    @NotNull
    public final p<Boolean> c() {
        return this.f48838c;
    }
}
