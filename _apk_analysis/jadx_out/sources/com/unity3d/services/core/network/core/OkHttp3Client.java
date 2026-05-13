package com.unity3d.services.core.network.core;

import bn.r;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.vungle.ads.internal.ui.AdActivity;
import hn.c;
import in.a;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.g;
import p000do.l0;
import sn.p;
import tn.i;

/* JADX INFO: compiled from: OkHttp3Client.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class OkHttp3Client implements HttpClient {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String MSG_CONNECTION_FAILED = "Network request failed";

    @NotNull
    public static final String MSG_CONNECTION_TIMEOUT = "Network request timeout";

    @NotNull
    public static final String NETWORK_CLIENT_OKHTTP = "refactored-okhttp";

    @NotNull
    private final OkHttpClient client;

    @NotNull
    private final ISDKDispatchers dispatchers;

    /* JADX INFO: compiled from: OkHttp3Client.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.OkHttp3Client$execute$1, reason: invalid class name */
    /* JADX INFO: compiled from: OkHttp3Client.kt */
    @d(c = "com.unity3d.services.core.network.core.OkHttp3Client", f = "OkHttp3Client.kt", l = {134}, m = "execute")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OkHttp3Client.this.execute(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: OkHttp3Client.kt */
    @d(c = "com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1", f = "OkHttp3Client.kt", l = {37}, m = "invokeSuspend")
    public static final class C45371 extends SuspendLambda implements p<l0, c<? super HttpResponse>, Object> {
        public final /* synthetic */ HttpRequest $request;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45371(HttpRequest httpRequest, c<? super C45371> cVar) {
            super(2, cVar);
            this.$request = httpRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return OkHttp3Client.this.new C45371(this.$request, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super HttpResponse> cVar) {
            return ((C45371) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                OkHttp3Client okHttp3Client = OkHttp3Client.this;
                HttpRequest httpRequest = this.$request;
                this.label = 1;
                obj = HttpClient.DefaultImpls.execute$default(okHttp3Client, httpRequest, false, this, 2, null);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return obj;
        }
    }

    public OkHttp3Client(@NotNull ISDKDispatchers iSDKDispatchers, @NotNull OkHttpClient okHttpClient) {
        tn.p.k(iSDKDispatchers, "dispatchers");
        tn.p.k(okHttpClient, "client");
        this.dispatchers = iSDKDispatchers;
        this.client = okHttpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.services.core.network.core.HttpClient
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(@org.jetbrains.annotations.NotNull com.unity3d.services.core.network.model.HttpRequest r11, boolean r12, @org.jetbrains.annotations.NotNull hn.c<? super com.unity3d.services.core.network.model.HttpResponse> r13) throws com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.core.OkHttp3Client.execute(com.unity3d.services.core.network.model.HttpRequest, boolean, hn.c):java.lang.Object");
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    @NotNull
    public HttpResponse executeBlocking(@NotNull HttpRequest httpRequest) {
        tn.p.k(httpRequest, AdActivity.REQUEST_KEY_EXTRA);
        return (HttpResponse) g.e(this.dispatchers.getIo(), new C45371(httpRequest, null));
    }
}
