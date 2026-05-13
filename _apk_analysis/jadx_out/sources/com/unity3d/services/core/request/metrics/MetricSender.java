package com.unity3d.services.core.request.metrics;

import bn.r;
import bo.d0;
import cn.v;
import com.safedk.android.utils.i;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.properties.InitializationStatusReader;
import hn.c;
import java.util.List;
import java.util.Map;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i0;
import p000do.l0;
import sn.p;
import tn.t;

/* JADX INFO: compiled from: MetricSender.kt */
/* JADX INFO: loaded from: classes5.dex */
public class MetricSender extends MetricSenderBase implements IServiceComponent {

    @NotNull
    private final MetricCommonTags commonTags;

    @NotNull
    private final ISDKDispatchers dispatchers;

    @NotNull
    private final HttpClientProvider httpClientProvider;

    @NotNull
    private final Logger logger;

    @Nullable
    private final String metricEndPoint;

    @NotNull
    private final String metricSampleRate;

    @NotNull
    private final l0 scope;
    private final String sessionToken;

    /* JADX INFO: renamed from: com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1, reason: invalid class name */
    /* JADX INFO: compiled from: MetricSender.kt */
    @d(c = "com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1", f = "MetricSender.kt", l = {66, 66}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ List<Metric> $metrics;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<Metric> list, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$metrics = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return MetricSender.this.new AnonymousClass1(this.$metrics, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00eb  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r32) {
            /*
                Method dump skipped, instruction units count: 276
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.request.metrics.MetricSender.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSender(@NotNull Configuration configuration, @NotNull InitializationStatusReader initializationStatusReader, @NotNull Logger logger) {
        super(initializationStatusReader);
        tn.p.k(configuration, i.f53156c);
        tn.p.k(initializationStatusReader, "initializationStatusReader");
        tn.p.k(logger, "logger");
        this.logger = logger;
        MetricCommonTags metricCommonTags = new MetricCommonTags();
        metricCommonTags.updateWithConfig(configuration);
        this.commonTags = metricCommonTags;
        this.metricSampleRate = String.valueOf(vn.c.c(configuration.getMetricSampleRate()));
        this.sessionToken = configuration.getSessionToken();
        ISDKDispatchers iSDKDispatchers = (ISDKDispatchers) getServiceProvider().getRegistry().getService("", t.b(ISDKDispatchers.class));
        this.dispatchers = iSDKDispatchers;
        this.httpClientProvider = (HttpClientProvider) getServiceProvider().getRegistry().getService("", t.b(HttpClientProvider.class));
        this.scope = kotlinx.coroutines.d.a(iSDKDispatchers.getIo());
        this.metricEndPoint = configuration.getMetricsUrl();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    @Nullable
    public String getMetricEndPoint() {
        return this.metricEndPoint;
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    @NotNull
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(@NotNull String str, @Nullable String str2, @NotNull Map<String, String> map) {
        tn.p.k(str, "event");
        tn.p.k(map, "tags");
        if (!(str.length() == 0)) {
            sendMetrics(v.e(new Metric(str, str2, map)));
            return;
        }
        Logger.DefaultImpls.trace$default(this.logger, "Metric event not sent due to being null or empty: " + str, null, 2, null);
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetric(@NotNull Metric metric) {
        tn.p.k(metric, "metric");
        sendMetrics(v.e(metric));
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetrics(@NotNull List<Metric> list) {
        tn.p.k(list, "metrics");
        if (list.isEmpty()) {
            Logger.DefaultImpls.trace$default(this.logger, "Metrics event not send due to being empty", null, 2, null);
            return;
        }
        String metricEndPoint = getMetricEndPoint();
        if (!(metricEndPoint == null || d0.u0(metricEndPoint))) {
            p000do.i.d(this.scope, new MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1(i0.D8, this, list), null, new AnonymousClass1(list, null), 2, null);
            return;
        }
        Logger.DefaultImpls.trace$default(this.logger, "Metrics: " + list + " was not sent to null or empty endpoint: " + getMetricEndPoint(), null, 2, null);
    }

    public final void shutdown() {
        this.commonTags.shutdown();
    }
}
