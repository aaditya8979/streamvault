package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import cn.w0;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l;
import gl.f;
import io.ktor.http.BadContentTypeFormatException;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p000do.l0;
import sn.p;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
public final class f implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final l f48808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final l0 f48809b;

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.HttpEventHandler$handleGetRequest$1", f = "HttpEventHandler.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48810a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48812c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f48812c = str;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return f.this.new a(this.f48812c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f48810a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            f.this.f48808a.a(this.f48812c);
            return r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.HttpEventHandler$handlePostRequest$1", f = "HttpEventHandler.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f48814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f48815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48816d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ gl.f f48817e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, f fVar, String str2, gl.f fVar2, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f48814b = str;
            this.f48815c = fVar;
            this.f48816d = str2;
            this.f48817e = fVar2;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new b(this.f48814b, this.f48815c, this.f48816d, this.f48817e, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f48813a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            byte[] bytes = this.f48814b.getBytes(bo.c.f5639b);
            tn.p.j(bytes, "getBytes(...)");
            f.a.a(this.f48815c.f48808a, this.f48816d, bytes, this.f48817e, null, 8, null);
            return r.f5635a;
        }
    }

    public f(@NotNull l lVar) {
        tn.p.k(lVar, "persistentHttpRequest");
        this.f48808a = lVar;
        this.f48809b = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getIo());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    @NotNull
    public Set<String> a() {
        return w0.j("sendGet", "sendPost");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(@NotNull JSONObject jSONObject) throws BadContentTypeFormatException, JSONException {
        tn.p.k(jSONObject, "event");
        String string = jSONObject.getString("event");
        if (tn.p.f(string, "sendGet")) {
            String string2 = jSONObject.getString("url");
            tn.p.h(string2);
            b(string2);
            return;
        }
        if (!tn.p.f(string, "sendPost")) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, b(), "Unsupported event type: " + string, null, false, 12, null);
            r rVar = r.f5635a;
            return;
        }
        String string3 = jSONObject.getString("url");
        String string4 = jSONObject.getString("body");
        f.b bVar = gl.f.f62497f;
        String strOptString = jSONObject.optString("contentType", bVar.a().toString());
        tn.p.j(strOptString, "optString(...)");
        gl.f fVarB = bVar.b(strOptString);
        tn.p.h(string3);
        tn.p.h(string4);
        c(string3, string4, fVarB);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    @NotNull
    public String b() {
        return "HttpEventHandler";
    }

    public final kotlinx.coroutines.g b(String str) {
        return p000do.i.d(this.f48809b, null, null, new a(str, null), 3, null);
    }

    public final kotlinx.coroutines.g c(String str, String str2, gl.f fVar) {
        return p000do.i.d(this.f48809b, null, null, new b(str2, this, str, fVar, null), 3, null);
    }
}
