package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import hn.c;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: ConfigFileFromLocalStorage.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ConfigFileFromLocalStorage extends MetricTask<Params, Configuration> {

    @NotNull
    private final ISDKDispatchers dispatchers;

    /* JADX INFO: compiled from: ConfigFileFromLocalStorage.kt */
    public static final class Params implements BaseParams {

        @NotNull
        private final Configuration defaultConfiguration;

        /* JADX WARN: Multi-variable type inference failed */
        public Params() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Params(@NotNull Configuration configuration) {
            p.k(configuration, "defaultConfiguration");
            this.defaultConfiguration = configuration;
        }

        public /* synthetic */ Params(Configuration configuration, int i10, i iVar) {
            this((i10 & 1) != 0 ? new Configuration() : configuration);
        }

        @NotNull
        public final Configuration getDefaultConfiguration() {
            return this.defaultConfiguration;
        }
    }

    public ConfigFileFromLocalStorage(@NotNull ISDKDispatchers iSDKDispatchers) {
        p.k(iSDKDispatchers, "dispatchers");
        this.dispatchers = iSDKDispatchers;
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: doWork-gIAlu-s */
    public /* bridge */ /* synthetic */ Object mo7252doWorkgIAlus(BaseParams baseParams, c cVar) {
        return m7255doWorkgIAlus((Params) baseParams, (c<? super Result<? extends Configuration>>) cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m7255doWorkgIAlus(@org.jetbrains.annotations.NotNull com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.Params r6, @org.jetbrains.annotations.NotNull hn.c<? super kotlin.Result<? extends com.unity3d.services.core.configuration.Configuration>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$1 r0 = (com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$1 r0 = new com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$1
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
            do.h0 r7 = r7.getIo()
            com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$2 r2 = new com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$2
            r4 = 0
            r2.<init>(r6, r4)
            r0.label = r3
            java.lang.Object r7 = p000do.g.g(r7, r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.m7542unboximpl()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.m7255doWorkgIAlus(com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$Params, hn.c):java.lang.Object");
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    @NotNull
    public String getMetricName() {
        return getMetricNameForInitializeTask("read_local_config");
    }
}
