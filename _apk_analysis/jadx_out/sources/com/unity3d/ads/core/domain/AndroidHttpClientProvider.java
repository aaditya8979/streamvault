package com.unity3d.ads.core.domain;

import android.content.Context;
import bn.h;
import cn.p0;
import com.google.android.gms.net.CronetProviderInstaller;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.CronetClient;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.OkHttp3Client;
import hn.c;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import jn.d;
import jn.f;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mo.g;
import okhttp3.OkHttpClient;
import org.chromium.net.CronetEngine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.k;
import p000do.l1;
import tn.p;

/* JADX INFO: compiled from: AndroidHttpClientProvider.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class AndroidHttpClientProvider implements HttpClientProvider {

    @NotNull
    private final AlternativeFlowReader alternativeFlowReader;

    @Nullable
    private HttpClient cachedClient;

    @NotNull
    private final Context context;

    @NotNull
    private final CronetEngineBuilderFactory cronetEngineBuilderFactory;

    @NotNull
    private final ISDKDispatchers dispatchers;

    @NotNull
    private final MediationTraitsMetadataReader mediationTraitsMetadataReader;

    @NotNull
    private final mo.a mutex;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHttpClientProvider$createHttpClient$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHttpClientProvider.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider", f = "AndroidHttpClientProvider.kt", l = {74}, m = "createHttpClient")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public long J$0;
        public Object L$0;
        public Object L$1;
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
            return AndroidHttpClientProvider.this.createHttpClient(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidHttpClientProvider.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider", f = "AndroidHttpClientProvider.kt", l = {134, 57}, m = "invoke")
    public static final class C44711 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C44711(c<? super C44711> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHttpClientProvider.this.invoke(this);
        }
    }

    public AndroidHttpClientProvider(@NotNull AlternativeFlowReader alternativeFlowReader, @NotNull ISDKDispatchers iSDKDispatchers, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull Context context, @NotNull CronetEngineBuilderFactory cronetEngineBuilderFactory, @NotNull MediationTraitsMetadataReader mediationTraitsMetadataReader) {
        p.k(alternativeFlowReader, "alternativeFlowReader");
        p.k(iSDKDispatchers, "dispatchers");
        p.k(sendDiagnosticEvent, "sendDiagnosticEvent");
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(cronetEngineBuilderFactory, "cronetEngineBuilderFactory");
        p.k(mediationTraitsMetadataReader, "mediationTraitsMetadataReader");
        this.alternativeFlowReader = alternativeFlowReader;
        this.dispatchers = iSDKDispatchers;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.context = context;
        this.cronetEngineBuilderFactory = cronetEngineBuilderFactory;
        this.mediationTraitsMetadataReader = mediationTraitsMetadataReader;
        this.mutex = g.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object buildNetworkClient(final Context context, final ISDKDispatchers iSDKDispatchers, final HttpClientSelection httpClientSelection, c<? super HttpClient> cVar) {
        final kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        cVar2.K();
        CronetProviderInstaller.installProvider(context).addOnCompleteListener(l1.a(iSDKDispatchers.getIo()), new OnCompleteListener() { // from class: com.unity3d.ads.core.domain.AndroidHttpClientProvider$buildNetworkClient$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(@NotNull Task<Void> task) {
                String str;
                String message;
                p.k(task, "it");
                str = "Errored without message.";
                if (!task.isSuccessful()) {
                    SendDiagnosticEvent sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                    Exception exception = task.getException();
                    if (exception != null && (message = exception.getMessage()) != null) {
                        str = message;
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_cronet_install_error", null, p0.g(h.a("reason", str)), null, null, null, 58, null);
                    k<HttpClient> kVar = cVar2;
                    Result.a aVar = Result.Companion;
                    kVar.resumeWith(Result.m7534constructorimpl(this.this$0.getOkHttp3Client()));
                    return;
                }
                try {
                    CronetEngine.Builder builderCreateCronetEngineBuilder = this.this$0.cronetEngineBuilderFactory.createCronetEngineBuilder(context);
                    if (httpClientSelection == HttpClientSelection.CRONET_WITH_QUIC) {
                        builderCreateCronetEngineBuilder.enableQuic(true);
                        builderCreateCronetEngineBuilder.addQuicHint(ServiceProvider.GATEWAY_HOST, 443, 443);
                        builderCreateCronetEngineBuilder.addQuicHint(ServiceProvider.CDN_CREATIVES_HOST, 443, 443);
                    }
                    CronetEngine cronetEngineBuild = builderCreateCronetEngineBuilder.build();
                    k<HttpClient> kVar2 = cVar2;
                    Result.a aVar2 = Result.Companion;
                    p.j(cronetEngineBuild, "cronetEngine");
                    kVar2.resumeWith(Result.m7534constructorimpl(new CronetClient(cronetEngineBuild, iSDKDispatchers)));
                } catch (Throwable th2) {
                    SendDiagnosticEvent sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
                    String message2 = th2.getMessage();
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_cronet_engine_error", null, p0.g(h.a("reason", message2 != null ? message2 : "Errored without message.")), null, null, null, 58, null);
                    k<HttpClient> kVar3 = cVar2;
                    Result.a aVar3 = Result.Companion;
                    kVar3.resumeWith(Result.m7534constructorimpl(this.this$0.getOkHttp3Client()));
                }
            }
        });
        Object objB = cVar2.B();
        if (objB == in.a.g()) {
            f.c(cVar);
        }
        return objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createHttpClient(hn.c<? super com.unity3d.services.core.network.core.HttpClient> r14) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.createHttpClient(hn.c):java.lang.Object");
    }

    @NotNull
    public final OkHttp3Client getOkHttp3Client() {
        return new OkHttp3Client(this.dispatchers, new OkHttpClient());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.HttpClientProvider
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull hn.c<? super com.unity3d.services.core.network.core.HttpClient> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.AndroidHttpClientProvider.C44711
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidHttpClientProvider.C44711) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.L$1
            mo.a r1 = (mo.a) r1
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.AndroidHttpClientProvider r0 = (com.unity3d.ads.core.domain.AndroidHttpClientProvider) r0
            kotlin.c.b(r7)     // Catch: java.lang.Throwable -> L35
            goto L77
        L35:
            r7 = move-exception
            goto L82
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3f:
            java.lang.Object r2 = r0.L$1
            mo.a r2 = (mo.a) r2
            java.lang.Object r4 = r0.L$0
            com.unity3d.ads.core.domain.AndroidHttpClientProvider r4 = (com.unity3d.ads.core.domain.AndroidHttpClientProvider) r4
            kotlin.c.b(r7)
            r7 = r2
            goto L5f
        L4c:
            kotlin.c.b(r7)
            mo.a r7 = r6.mutex
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r2 = r7.c(r5, r0)
            if (r2 != r1) goto L5e
            return r1
        L5e:
            r4 = r6
        L5f:
            com.unity3d.services.core.network.core.HttpClient r2 = r4.cachedClient     // Catch: java.lang.Throwable -> L7f
            if (r2 == 0) goto L67
            r7.d(r5)
            return r2
        L67:
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L7f
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L7f
            r0.label = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r0 = r4.createHttpClient(r0)     // Catch: java.lang.Throwable -> L7f
            if (r0 != r1) goto L74
            return r1
        L74:
            r1 = r7
            r7 = r0
            r0 = r4
        L77:
            com.unity3d.services.core.network.core.HttpClient r7 = (com.unity3d.services.core.network.core.HttpClient) r7     // Catch: java.lang.Throwable -> L35
            r0.cachedClient = r7     // Catch: java.lang.Throwable -> L35
            r1.d(r5)
            return r7
        L7f:
            r0 = move-exception
            r1 = r7
            r7 = r0
        L82:
            r1.d(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.invoke(hn.c):java.lang.Object");
    }
}
