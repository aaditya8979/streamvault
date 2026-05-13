package com.unity3d.services.core.request.metrics;

import android.text.TextUtils;
import bn.g;
import cn.v;
import cn.w;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.InitializationStatusReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import tn.p;

/* JADX INFO: compiled from: MetricSenderWithBatch.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class MetricSenderWithBatch extends MetricSenderBase {

    @NotNull
    private final g _logger$delegate;

    @NotNull
    private SDKMetricsSender _original;

    @NotNull
    private final LinkedBlockingQueue<Metric> _queue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSenderWithBatch(@NotNull SDKMetricsSender sDKMetricsSender, @NotNull InitializationStatusReader initializationStatusReader) {
        super(initializationStatusReader);
        p.k(sDKMetricsSender, "_original");
        p.k(initializationStatusReader, "initializationStatusReader");
        this._original = sDKMetricsSender;
        this._queue = new LinkedBlockingQueue<>();
        this._logger$delegate = b.b(new a<Logger>() { // from class: com.unity3d.services.core.request.metrics.MetricSenderWithBatch$_logger$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            public final Logger invoke() {
                return (Logger) Utilities.getService(Logger.class);
            }
        });
    }

    private final Logger get_logger() {
        Object value = this._logger$delegate.getValue();
        p.j(value, "<get-_logger>(...)");
        return (Logger) value;
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    @Nullable
    public String getMetricEndPoint() {
        return this._original.getMetricEndPoint();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(@NotNull String str, @Nullable String str2, @NotNull Map<String, String> map) {
        p.k(str, "event");
        p.k(map, "tags");
        if (!(str.length() == 0)) {
            sendMetrics(v.e(new Metric(str, str2, map)));
            return;
        }
        get_logger().debug("Metric event not sent due to being empty: " + str);
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetric(@NotNull Metric metric) {
        p.k(metric, "metric");
        sendMetrics(v.e(metric));
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public synchronized void sendMetrics(@NotNull List<Metric> list) {
        p.k(list, "metrics");
        this._queue.addAll(list);
        if (!TextUtils.isEmpty(this._original.getMetricEndPoint()) && this._queue.size() > 0) {
            ArrayList arrayList = new ArrayList();
            this._queue.drainTo(arrayList);
            this._original.sendMetrics(arrayList);
        }
    }

    public final void sendQueueIfNeeded() {
        sendMetrics(w.m());
    }

    public final void updateOriginal(@NotNull SDKMetricsSender sDKMetricsSender) {
        p.k(sDKMetricsSender, "metrics");
        this._original = sDKMetricsSender;
    }
}
