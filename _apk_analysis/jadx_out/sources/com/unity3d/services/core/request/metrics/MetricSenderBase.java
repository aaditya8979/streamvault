package com.unity3d.services.core.request.metrics;

import bn.h;
import cn.p0;
import com.unity3d.services.core.properties.InitializationStatusReader;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: MetricSenderBase.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class MetricSenderBase implements SDKMetricsSender {

    @NotNull
    private final InitializationStatusReader _initStatusReader;

    public MetricSenderBase(@NotNull InitializationStatusReader initializationStatusReader) {
        p.k(initializationStatusReader, "_initStatusReader");
        this._initStatusReader = initializationStatusReader;
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(@NotNull String str) {
        SDKMetricsSender.DefaultImpls.sendEvent(this, str);
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetricWithInitState(@NotNull Metric metric) {
        p.k(metric, "metric");
        sendMetric(Metric.copy$default(metric, null, null, a.q(metric.getTags(), p0.g(h.a("state", this._initStatusReader.getInitializationStateString(SdkProperties.getCurrentInitializationState())))), 3, null));
    }
}
