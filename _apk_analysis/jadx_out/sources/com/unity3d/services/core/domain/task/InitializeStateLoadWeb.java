package com.unity3d.services.core.domain.task;

import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import hn.c;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: InitializeStateLoadWeb.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class InitializeStateLoadWeb extends MetricTask<Params, LoadWebResult> {

    @NotNull
    private final ISDKDispatchers dispatchers;

    @NotNull
    private final HttpClientProvider httpClientProvider;

    @NotNull
    private final InitializeStateNetworkError initializeStateNetworkError;

    /* JADX INFO: compiled from: InitializeStateLoadWeb.kt */
    public static final class LoadWebResult {

        @NotNull
        private final Configuration config;

        @NotNull
        private final String webViewDataString;

        public LoadWebResult(@NotNull Configuration configuration, @NotNull String str) {
            p.k(configuration, "config");
            p.k(str, "webViewDataString");
            this.config = configuration;
            this.webViewDataString = str;
        }

        public static /* synthetic */ LoadWebResult copy$default(LoadWebResult loadWebResult, Configuration configuration, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                configuration = loadWebResult.config;
            }
            if ((i10 & 2) != 0) {
                str = loadWebResult.webViewDataString;
            }
            return loadWebResult.copy(configuration, str);
        }

        @NotNull
        public final Configuration component1() {
            return this.config;
        }

        @NotNull
        public final String component2() {
            return this.webViewDataString;
        }

        @NotNull
        public final LoadWebResult copy(@NotNull Configuration configuration, @NotNull String str) {
            p.k(configuration, "config");
            p.k(str, "webViewDataString");
            return new LoadWebResult(configuration, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadWebResult)) {
                return false;
            }
            LoadWebResult loadWebResult = (LoadWebResult) obj;
            return p.f(this.config, loadWebResult.config) && p.f(this.webViewDataString, loadWebResult.webViewDataString);
        }

        @NotNull
        public final Configuration getConfig() {
            return this.config;
        }

        @NotNull
        public final String getWebViewDataString() {
            return this.webViewDataString;
        }

        public int hashCode() {
            return (this.config.hashCode() * 31) + this.webViewDataString.hashCode();
        }

        @NotNull
        public String toString() {
            return "LoadWebResult(config=" + this.config + ", webViewDataString=" + this.webViewDataString + ')';
        }
    }

    /* JADX INFO: compiled from: InitializeStateLoadWeb.kt */
    public static final class Params implements BaseParams {

        @NotNull
        private final Configuration config;

        public Params(@NotNull Configuration configuration) {
            p.k(configuration, "config");
            this.config = configuration;
        }

        public static /* synthetic */ Params copy$default(Params params, Configuration configuration, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                configuration = params.config;
            }
            return params.copy(configuration);
        }

        @NotNull
        public final Configuration component1() {
            return this.config;
        }

        @NotNull
        public final Params copy(@NotNull Configuration configuration) {
            p.k(configuration, "config");
            return new Params(configuration);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Params) && p.f(this.config, ((Params) obj).config);
        }

        @NotNull
        public final Configuration getConfig() {
            return this.config;
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        @NotNull
        public String toString() {
            return "Params(config=" + this.config + ')';
        }
    }

    public InitializeStateLoadWeb(@NotNull ISDKDispatchers iSDKDispatchers, @NotNull InitializeStateNetworkError initializeStateNetworkError, @NotNull HttpClientProvider httpClientProvider) {
        p.k(iSDKDispatchers, "dispatchers");
        p.k(initializeStateNetworkError, "initializeStateNetworkError");
        p.k(httpClientProvider, "httpClientProvider");
        this.dispatchers = iSDKDispatchers;
        this.initializeStateNetworkError = initializeStateNetworkError;
        this.httpClientProvider = httpClientProvider;
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: doWork-gIAlu-s */
    public /* bridge */ /* synthetic */ Object mo7252doWorkgIAlus(BaseParams baseParams, c cVar) {
        return m7266doWorkgIAlus((Params) baseParams, (c<? super Result<LoadWebResult>>) cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m7266doWorkgIAlus(@org.jetbrains.annotations.NotNull com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params r6, @org.jetbrains.annotations.NotNull hn.c<? super kotlin.Result<com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1 r0 = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1 r0 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.c.b(r7)
            com.unity3d.services.core.domain.ISDKDispatchers r7 = r5.dispatchers
            do.h0 r7 = r7.getDefault()
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2 r2 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2
            r4 = 0
            r2.<init>(r6, r5, r4)
            r0.label = r3
            java.lang.Object r7 = p000do.g.g(r7, r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.m7542unboximpl()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadWeb.m7266doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params, hn.c):java.lang.Object");
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    @NotNull
    public String getMetricName() {
        return getMetricNameForInitializeTask("download_web_view");
    }
}
