package com.moloco.sdk.internal.services.bidtoken;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.g0;
import io.ktor.client.HttpClient;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f47136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HttpClient f47137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final l f47138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final j f47139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f47140e;

    @jn.d(c = "com.moloco.sdk.internal.services.bidtoken.BidTokenApiImpl$fetchBidToken$2", f = "BidTokenApi.kt", l = {80, 127}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<l0, hn.c<? super g0<n, com.moloco.sdk.internal.q>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f47141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f47142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f47143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f47144d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f47145e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f47146f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f47147g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f47148h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f47150j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.acm.recorder.a aVar, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f47150j = aVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super g0<n, com.moloco.sdk.internal.q>> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return c.this.new a(this.f47150j, cVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0209  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0253  */
        /* JADX WARN: Type inference failed for: r11v1, types: [T, com.moloco.sdk.internal.g0, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v0, types: [T, com.moloco.sdk.internal.g0$a] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x01ff -> B:30:0x0203). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 598
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.services.bidtoken.BidTokenApiImpl", f = "BidTokenApi.kt", l = {209, 210}, m = "fetchBidTokenWork")
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f47151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f47152b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f47154d;

        public b(hn.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47152b = obj;
            this.f47154d |= Integer.MIN_VALUE;
            return c.this.e(null, this);
        }
    }

    public c(@NotNull String str, @NotNull HttpClient httpClient, @NotNull l lVar, @NotNull j jVar) {
        tn.p.k(str, "sdkVersion");
        tn.p.k(httpClient, "httpClient");
        tn.p.k(lVar, "httpRequestInfo");
        tn.p.k(jVar, "deviceRequestInfo");
        this.f47136a = str;
        this.f47137b = httpClient;
        this.f47138c = lVar;
        this.f47139d = jVar;
        this.f47140e = "BidTokenApi";
    }

    public static final bn.r b(c cVar, gl.n nVar) {
        tn.p.k(nVar, "$this$headers");
        com.moloco.sdk.internal.r.b(nVar, cVar.f47136a, cVar.f47139d.a(), null, 4, null);
        return bn.r.f5635a;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.e
    @Nullable
    public Object a(@NotNull com.moloco.sdk.acm.recorder.a aVar, @NotNull hn.c<? super g0<n, com.moloco.sdk.internal.q>> cVar) {
        return p000do.g.g(com.moloco.sdk.internal.scheduling.c.a().getIo(), new a(aVar, null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0107 A[Catch: InvalidProtocolBufferException -> 0x0030, TryCatch #4 {InvalidProtocolBufferException -> 0x0030, blocks: (B:12:0x002b, B:58:0x0107, B:59:0x0131, B:60:0x0138, B:50:0x00e7, B:54:0x00f5), top: B:82:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0131 A[Catch: InvalidProtocolBufferException -> 0x0030, TryCatch #4 {InvalidProtocolBufferException -> 0x0030, blocks: (B:12:0x002b, B:58:0x0107, B:59:0x0131, B:60:0x0138, B:50:0x00e7, B:54:0x00f5), top: B:82:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r10, hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.internal.services.bidtoken.n, com.moloco.sdk.internal.q>> r11) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.c.e(java.lang.String, hn.c):java.lang.Object");
    }

    public final byte[] f() {
        byte[] byteArray = com.moloco.sdk.c.b().build().toByteArray();
        tn.p.j(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
