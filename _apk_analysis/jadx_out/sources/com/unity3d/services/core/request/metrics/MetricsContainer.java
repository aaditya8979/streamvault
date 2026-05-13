package com.unity3d.services.core.request.metrics;

import cn.p0;
import cn.x;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.Session;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: MetricsContainer.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class MetricsContainer {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String METRICS_CONTAINER = "m";

    @NotNull
    private static final String METRICS_CONTAINER_TAGS = "t";

    @NotNull
    private static final String METRIC_CONTAINER_API_LEVEL = "apil";

    @NotNull
    private static final String METRIC_CONTAINER_DEVICE_MAKE = "deviceMake";

    @NotNull
    private static final String METRIC_CONTAINER_DEVICE_MODEL = "deviceModel";

    @NotNull
    private static final String METRIC_CONTAINER_DEVICE_NAME = "deviceName";

    @NotNull
    private static final String METRIC_CONTAINER_GAME_ID = "gameId";

    @NotNull
    private static final String METRIC_CONTAINER_SAMPLE_RATE = "msr";

    @NotNull
    private static final String METRIC_CONTAINER_SESSION_TOKEN = "sTkn";

    @NotNull
    private static final String METRIC_CONTAINER_SHARED_SESSION_ID = "shSid";

    @NotNull
    private final String apiLevel;

    @NotNull
    private final MetricCommonTags commonTags;
    private final String deviceManufacturer;
    private final String deviceModel;
    private final String deviceName;
    private final String gameId;

    @NotNull
    private final String metricSampleRate;

    @NotNull
    private final List<Metric> metrics;

    @Nullable
    private final String sTkn;

    @NotNull
    private final String shSid;

    /* JADX INFO: compiled from: MetricsContainer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public MetricsContainer(@NotNull String str, @NotNull MetricCommonTags metricCommonTags, @NotNull List<Metric> list, @Nullable String str2) {
        p.k(str, "metricSampleRate");
        p.k(metricCommonTags, "commonTags");
        p.k(list, "metrics");
        this.metricSampleRate = str;
        this.commonTags = metricCommonTags;
        this.metrics = list;
        this.sTkn = str2;
        this.shSid = Session.Default.getId();
        this.apiLevel = String.valueOf(Device.getApiLevel());
        this.deviceModel = Device.getModel();
        this.deviceName = Device.getDevice();
        this.deviceManufacturer = Device.getManufacturer();
        this.gameId = ClientProperties.getGameId();
    }

    @NotNull
    public final Map<String, Object> toMap() {
        List<Metric> list = this.metrics;
        ArrayList arrayList = new ArrayList(x.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Metric) it.next()).toMap());
        }
        Map mapD = p0.d();
        mapD.put(METRIC_CONTAINER_SAMPLE_RATE, this.metricSampleRate);
        mapD.put("m", arrayList);
        mapD.put(METRICS_CONTAINER_TAGS, this.commonTags.toMap());
        mapD.put(METRIC_CONTAINER_SHARED_SESSION_ID, this.shSid);
        mapD.put(METRIC_CONTAINER_API_LEVEL, this.apiLevel);
        String str = this.sTkn;
        if (str != null) {
            mapD.put(METRIC_CONTAINER_SESSION_TOKEN, str);
        }
        String str2 = this.deviceModel;
        if (str2 != null) {
            p.j(str2, "deviceModel");
            mapD.put("deviceModel", str2);
        }
        String str3 = this.deviceName;
        if (str3 != null) {
            p.j(str3, METRIC_CONTAINER_DEVICE_NAME);
            mapD.put(METRIC_CONTAINER_DEVICE_NAME, str3);
        }
        String str4 = this.deviceManufacturer;
        if (str4 != null) {
            p.j(str4, "deviceManufacturer");
            mapD.put(METRIC_CONTAINER_DEVICE_MAKE, str4);
        }
        String str5 = this.gameId;
        if (str5 != null) {
            p.j(str5, "gameId");
            mapD.put("gameId", str5);
        }
        return p0.c(mapD);
    }
}
