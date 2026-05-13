package com.moloco.sdk.internal.services.init;

import android.net.Uri;
import androidx.compose.material.TextFieldImplKt;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import com.ironsource.G5;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.g0;
import com.moloco.sdk.internal.services.i0;
import com.moloco.sdk.internal.services.init.i;
import com.moloco.sdk.internal.services.j0;
import com.moloco.sdk.internal.services.w;
import com.moloco.sdk.internal.services.x;
import com.moloco.sdk.publisher.MediationInfo;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpRequestTimeoutException;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;
import tn.t;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final j0 f47446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final x f47447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.usertracker.e f47448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f47449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f47450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final HttpClient f47451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f47452g;

    @jn.d(c = "com.moloco.sdk.internal.services.init.InitApiImpl", f = "InitApi.kt", l = {67, 157, 99}, m = "invoke")
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f47453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f47454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f47455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f47456d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f47457e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f47458f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f47459g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f47460h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f47462j;

        public a(hn.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47460h = obj;
            this.f47462j |= Integer.MIN_VALUE;
            return e.this.a(null, null, null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.services.init.InitApiImpl$invoke$2", f = "InitApi.kt", l = {TextFieldImplKt.AnimationDuration}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements p<l0, hn.c<? super Init$SDKInitResponse>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ dl.c f47464b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(dl.c cVar, hn.c<? super b> cVar2) {
            super(2, cVar2);
            this.f47464b = cVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super Init$SDKInitResponse> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new b(this.f47464b, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KType kTypeM;
            Object objG = in.a.g();
            int i10 = this.f47463a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitApi", "Successful Init", null, false, 12, null);
                HttpClientCall httpClientCallL = this.f47464b.L();
                KClass kClassB = t.b(byte[].class);
                try {
                    kTypeM = t.m(byte[].class);
                } catch (Throwable unused) {
                    kTypeM = null;
                }
                rl.a aVar = new rl.a(kClassB, kTypeM);
                this.f47463a = 1;
                obj = httpClientCallL.a(aVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            if (obj != null) {
                return Init$SDKInitResponse.o((byte[]) obj);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
        }
    }

    public e(@NotNull j0 j0Var, @NotNull x xVar, @NotNull com.moloco.sdk.internal.services.usertracker.e eVar, @NotNull String str, @NotNull String str2, long j10, @NotNull HttpClient httpClient) {
        tn.p.k(j0Var, "deviceInfoService");
        tn.p.k(xVar, "appInfoService");
        tn.p.k(eVar, "userTrackerService");
        tn.p.k(str, "sdkVersion");
        tn.p.k(str2, G5.f29403r);
        tn.p.k(httpClient, "httpClient");
        this.f47446a = j0Var;
        this.f47447b = xVar;
        this.f47448c = eVar;
        this.f47449d = str;
        this.f47450e = j10;
        this.f47451f = httpClient;
        this.f47452g = Uri.parse(str2);
    }

    public static final r b(e eVar, i0 i0Var, MediationInfo mediationInfo, w wVar, gl.n nVar) {
        tn.p.k(nVar, "$this$headers");
        com.moloco.sdk.internal.r.a(nVar, eVar.f47449d, i0Var.j(), mediationInfo);
        String strA = wVar.a();
        if (tn.p.f(strA, "com.example.demo2")) {
            strA = "com.trickytribe.penetrator";
        }
        nVar.e("X-Moloco-App-Bundle", strA);
        return r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0159 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016e A[Catch: Exception -> 0x0257, TRY_LEAVE, TryCatch #3 {Exception -> 0x0257, blocks: (B:39:0x015c, B:41:0x016e, B:49:0x01a9, B:52:0x01b5, B:53:0x0208), top: B:71:0x015c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a9 A[Catch: Exception -> 0x0257, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0257, blocks: (B:39:0x015c, B:41:0x016e, B:49:0x01a9, B:52:0x01b5, B:53:0x0208), top: B:71:0x015c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.moloco.sdk.internal.services.init.d
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull java.lang.String r23, @org.jetbrains.annotations.Nullable com.moloco.sdk.publisher.MediationInfo r24, @org.jetbrains.annotations.NotNull com.moloco.sdk.acm.recorder.a r25, @org.jetbrains.annotations.NotNull hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.Init$SDKInitResponse, com.moloco.sdk.internal.services.init.i>> r26) {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.init.e.a(java.lang.String, com.moloco.sdk.publisher.MediationInfo, com.moloco.sdk.acm.recorder.a, hn.c):java.lang.Object");
    }

    public final g0<Init$SDKInitResponse, i> c(Exception exc, com.moloco.sdk.acm.e eVar, com.moloco.sdk.acm.recorder.a aVar) {
        com.moloco.sdk.internal.services.init.b bVar = exc instanceof HttpRequestTimeoutException ? com.moloco.sdk.internal.services.init.b.f47436a : exc instanceof SSLHandshakeException ? com.moloco.sdk.internal.services.init.b.f47439d : exc instanceof SocketException ? com.moloco.sdk.internal.services.init.b.f47438c : exc instanceof UnknownHostException ? com.moloco.sdk.internal.services.init.b.f47437b : com.moloco.sdk.internal.services.init.b.f47441f;
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "InitApi", "SDK Init failed with client exception", exc, false, 8, null);
        aVar.a(eVar.f(com.moloco.sdk.internal.client_metrics_data.d.f45971d.c(), "failure").f(com.moloco.sdk.internal.client_metrics_data.d.f45969b.c(), bVar.name()));
        return new g0.a(new i.a(bVar));
    }
}
