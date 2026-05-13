package com.vungle.ads;

import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.events.CrashEvent;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.VungleHeader;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.ActivityManager;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: AnalyticsClient.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002klB\t\b\u0002¢\u0006\u0004\bj\u0010=J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J2\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0002J2\u0010\u0014\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u0015\u001a\u00020\nH\u0002J\b\u0010\u0016\u001a\u00020\nH\u0003J\b\u0010\u0017\u001a\u00020\nH\u0003J/\u0010\"\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!J+\u0010%\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b#\u0010$J9\u0010(\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b&\u0010'J/\u0010(\u001a\u00020\n2\u0006\u0010*\u001a\u00020)2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b&\u0010+J/\u0010(\u001a\u00020\n2\u0006\u0010-\u001a\u00020,2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b&\u0010.J/\u0010(\u001a\u00020\n2\u0006\u00100\u001a\u00020/2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b&\u00101J/\u0010(\u001a\u00020\n2\u0006\u00103\u001a\u0002022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b&\u00104R\u0014\u00105\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00106R&\u00108\u001a\b\u0012\u0004\u0012\u00020\b078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u0010=\u001a\u0004\b:\u0010;R&\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0012078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b>\u00109\u0012\u0004\b@\u0010=\u001a\u0004\b?\u0010;R&\u0010A\u001a\b\u0012\u0004\u0012\u00020\b078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bA\u00109\u0012\u0004\bC\u0010=\u001a\u0004\bB\u0010;R&\u0010D\u001a\b\u0012\u0004\u0012\u00020\u0012078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bD\u00109\u0012\u0004\bF\u0010=\u001a\u0004\bE\u0010;R\u0014\u0010G\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u0010JR*\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010K\u0012\u0004\bP\u0010=\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR*\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010Q\u0012\u0004\bV\u0010=\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR(\u0010\u001f\u001a\u00020\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010W\u0012\u0004\b\\\u0010=\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0016\u0010^\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R(\u0010`\u001a\u00020\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b`\u0010W\u0012\u0004\bc\u0010=\u001a\u0004\ba\u0010Y\"\u0004\bb\u0010[R \u0010e\u001a\u00020d8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\be\u0010f\u0012\u0004\bi\u0010=\u001a\u0004\bg\u0010h¨\u0006m"}, d2 = {"Lcom/vungle/ads/AnalyticsClient;", "", "Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;", "reason", "", "message", "Lcom/vungle/ads/internal/util/LogEntry;", "entry", "Lcom/vungle/ads/internal/protos/Sdk$SDKError$Builder;", "genSDKError", "Lbn/r;", "logErrorInSameThread", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;", "metricType", "", "metricValue", "logEntry", "metaData", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$Builder;", "genMetric", "logMetricInSameThread", CrashEvent.f52788e, "flushMetrics", "flushErrors", "Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "executor", "", "errorLogLevel", "", "metricsEnabled", "initOrUpdate$vungle_ads_release", "(Lcom/vungle/ads/internal/network/VungleApiClient;Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;IZ)V", "initOrUpdate", "logError$vungle_ads_release", "(Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;Ljava/lang/String;Lcom/vungle/ads/internal/util/LogEntry;)V", "logError", "logMetric$vungle_ads_release", "(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;JLcom/vungle/ads/internal/util/LogEntry;Ljava/lang/String;)V", "logMetric", "Lcom/vungle/ads/SingleValueMetric;", "singleValueMetric", "(Lcom/vungle/ads/SingleValueMetric;Lcom/vungle/ads/internal/util/LogEntry;Ljava/lang/String;)V", "Lcom/vungle/ads/OneShotSingleValueMetric;", "oneShotSingleValueMetric", "(Lcom/vungle/ads/OneShotSingleValueMetric;Lcom/vungle/ads/internal/util/LogEntry;Ljava/lang/String;)V", "Lcom/vungle/ads/TimeIntervalMetric;", "timeIntervalMetric", "(Lcom/vungle/ads/TimeIntervalMetric;Lcom/vungle/ads/internal/util/LogEntry;Ljava/lang/String;)V", "Lcom/vungle/ads/OneShotTimeIntervalMetric;", "oneShotTimeIntervalMetric", "(Lcom/vungle/ads/OneShotTimeIntervalMetric;Lcom/vungle/ads/internal/util/LogEntry;Ljava/lang/String;)V", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/BlockingQueue;", "errors", "Ljava/util/concurrent/BlockingQueue;", "getErrors$vungle_ads_release", "()Ljava/util/concurrent/BlockingQueue;", "getErrors$vungle_ads_release$annotations", "()V", "metrics", "getMetrics$vungle_ads_release", "getMetrics$vungle_ads_release$annotations", "pendingErrors", "getPendingErrors$vungle_ads_release", "getPendingErrors$vungle_ads_release$annotations", "pendingMetrics", "getPendingMetrics$vungle_ads_release", "getPendingMetrics$vungle_ads_release$annotations", "REFRESH_TIME_MILLIS", "J", "MAX_BATCH_SIZE", "I", "Lcom/vungle/ads/internal/network/VungleApiClient;", "getVungleApiClient$vungle_ads_release", "()Lcom/vungle/ads/internal/network/VungleApiClient;", "setVungleApiClient$vungle_ads_release", "(Lcom/vungle/ads/internal/network/VungleApiClient;)V", "getVungleApiClient$vungle_ads_release$annotations", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "getExecutor$vungle_ads_release", "()Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "setExecutor$vungle_ads_release", "(Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;)V", "getExecutor$vungle_ads_release$annotations", "Z", "getMetricsEnabled$vungle_ads_release", "()Z", "setMetricsEnabled$vungle_ads_release", "(Z)V", "getMetricsEnabled$vungle_ads_release$annotations", "Lcom/vungle/ads/AnalyticsClient$LogLevel;", "logLevel", "Lcom/vungle/ads/AnalyticsClient$LogLevel;", "refreshEnabled", "getRefreshEnabled$vungle_ads_release", "setRefreshEnabled$vungle_ads_release", "getRefreshEnabled$vungle_ads_release$annotations", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized$vungle_ads_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized$vungle_ads_release$annotations", "<init>", "LogLevel", "RequestListener", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class AnalyticsClient {
    private static final int MAX_BATCH_SIZE = 20;
    private static final long REFRESH_TIME_MILLIS = 5000;

    @NotNull
    private static final String TAG = "AnalyticsClient";

    @Nullable
    private static VungleThreadPoolExecutor executor;
    private static boolean metricsEnabled;

    @Nullable
    private static VungleApiClient vungleApiClient;

    @NotNull
    public static final AnalyticsClient INSTANCE = new AnalyticsClient();

    @NotNull
    private static final BlockingQueue<Sdk.SDKError.Builder> errors = new LinkedBlockingQueue();

    @NotNull
    private static final BlockingQueue<Sdk.SDKMetric.Builder> metrics = new LinkedBlockingQueue();

    @NotNull
    private static final BlockingQueue<Sdk.SDKError.Builder> pendingErrors = new LinkedBlockingQueue();

    @NotNull
    private static final BlockingQueue<Sdk.SDKMetric.Builder> pendingMetrics = new LinkedBlockingQueue();

    @NotNull
    private static LogLevel logLevel = LogLevel.ERROR_LOG_LEVEL_ERROR;
    private static boolean refreshEnabled = true;

    @NotNull
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);

    /* JADX INFO: compiled from: AnalyticsClient.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/AnalyticsClient$LogLevel;", "", AppLovinEventTypes.USER_COMPLETED_LEVEL, "", "(Ljava/lang/String;II)V", "getLevel", "()I", "ERROR_LOG_LEVEL_OFF", "ERROR_LOG_LEVEL_ERROR", "ERROR_LOG_LEVEL_DEBUG", VastTagName.COMPANION, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum LogLevel {
        ERROR_LOG_LEVEL_OFF(0),
        ERROR_LOG_LEVEL_ERROR(1),
        ERROR_LOG_LEVEL_DEBUG(2);


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final int level;

        /* JADX INFO: compiled from: AnalyticsClient.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/AnalyticsClient$LogLevel$Companion;", "", "()V", "fromValue", "Lcom/vungle/ads/AnalyticsClient$LogLevel;", "logLevel", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @NotNull
            public final LogLevel fromValue(int logLevel) {
                LogLevel logLevel2 = LogLevel.ERROR_LOG_LEVEL_DEBUG;
                if (logLevel == logLevel2.getLevel()) {
                    return logLevel2;
                }
                LogLevel logLevel3 = LogLevel.ERROR_LOG_LEVEL_ERROR;
                if (logLevel == logLevel3.getLevel()) {
                    return logLevel3;
                }
                LogLevel logLevel4 = LogLevel.ERROR_LOG_LEVEL_OFF;
                return logLevel == logLevel4.getLevel() ? logLevel4 : logLevel3;
            }
        }

        LogLevel(int i10) {
            this.level = i10;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    /* JADX INFO: compiled from: AnalyticsClient.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/AnalyticsClient$RequestListener;", "", "Lbn/r;", "onSuccess", "onFailure", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public interface RequestListener {
        void onFailure();

        void onSuccess();
    }

    private AnalyticsClient() {
    }

    @WorkerThread
    private final void flushErrors() {
        VungleApiClient vungleApiClient2;
        Logger.Companion companion = Logger.INSTANCE;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Sending ");
        BlockingQueue<Sdk.SDKError.Builder> blockingQueue = errors;
        sb2.append(blockingQueue.size());
        sb2.append(" errors");
        companion.d(TAG, sb2.toString());
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        blockingQueue.drainTo(linkedBlockingQueue);
        if (linkedBlockingQueue.isEmpty() || (vungleApiClient2 = vungleApiClient) == null) {
            return;
        }
        vungleApiClient2.reportErrors(linkedBlockingQueue, new RequestListener() { // from class: com.vungle.ads.AnalyticsClient.flushErrors.1
            @Override // com.vungle.ads.AnalyticsClient.RequestListener
            public void onFailure() {
                Logger.INSTANCE.d(AnalyticsClient.TAG, "Failed to send " + linkedBlockingQueue.size() + " errors");
                AnalyticsClient.INSTANCE.getErrors$vungle_ads_release().addAll(linkedBlockingQueue);
            }

            @Override // com.vungle.ads.AnalyticsClient.RequestListener
            public void onSuccess() {
                Logger.INSTANCE.d(AnalyticsClient.TAG, "Sent " + linkedBlockingQueue.size() + " errors");
            }
        });
    }

    @WorkerThread
    private final void flushMetrics() {
        VungleApiClient vungleApiClient2;
        Logger.Companion companion = Logger.INSTANCE;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Sending ");
        BlockingQueue<Sdk.SDKMetric.Builder> blockingQueue = metrics;
        sb2.append(blockingQueue.size());
        sb2.append(" metrics");
        companion.d(TAG, sb2.toString());
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        blockingQueue.drainTo(linkedBlockingQueue);
        if (linkedBlockingQueue.isEmpty() || (vungleApiClient2 = vungleApiClient) == null) {
            return;
        }
        vungleApiClient2.reportMetrics(linkedBlockingQueue, new RequestListener() { // from class: com.vungle.ads.AnalyticsClient.flushMetrics.1
            @Override // com.vungle.ads.AnalyticsClient.RequestListener
            public void onFailure() {
                Logger.INSTANCE.d(AnalyticsClient.TAG, "Failed to send " + linkedBlockingQueue.size() + " metrics");
                AnalyticsClient.INSTANCE.getMetrics$vungle_ads_release().addAll(linkedBlockingQueue);
            }

            @Override // com.vungle.ads.AnalyticsClient.RequestListener
            public void onSuccess() {
                Logger.INSTANCE.d(AnalyticsClient.TAG, "Sent " + linkedBlockingQueue.size() + " metrics");
            }
        });
    }

    private final Sdk.SDKMetric.Builder genMetric(Sdk.SDKMetric.SDKMetricType metricType, long metricValue, LogEntry logEntry, String metaData) {
        String placementRefId$vungle_ads_release;
        String creativeId$vungle_ads_release;
        String eventId$vungle_ads_release;
        String headerUa;
        String adSource$vungle_ads_release;
        Boolean adoEnabled$vungle_ads_release;
        Boolean partialDownloadEnabled$vungle_ads_release;
        String vmVersion$vungle_ads_release;
        Sdk.SDKMetric.Builder value = Sdk.SDKMetric.newBuilder().setType(metricType).setValue(metricValue);
        String str = Build.MANUFACTURER;
        Sdk.SDKMetric.Builder osVersion = value.setMake(str).setModel(Build.MODEL).setOs(p.f("Amazon", str) ? "amazon" : "android").setOsVersion(String.valueOf(Build.VERSION.SDK_INT));
        String str2 = "";
        if (logEntry == null || (placementRefId$vungle_ads_release = logEntry.getPlacementRefId()) == null) {
            placementRefId$vungle_ads_release = "";
        }
        Sdk.SDKMetric.Builder placementReferenceId = osVersion.setPlacementReferenceId(placementRefId$vungle_ads_release);
        if (logEntry == null || (creativeId$vungle_ads_release = logEntry.getCreativeId()) == null) {
            creativeId$vungle_ads_release = "";
        }
        Sdk.SDKMetric.Builder creativeId = placementReferenceId.setCreativeId(creativeId$vungle_ads_release);
        if (logEntry == null || (eventId$vungle_ads_release = logEntry.getEventId()) == null) {
            eventId$vungle_ads_release = "";
        }
        Sdk.SDKMetric.Builder eventId = creativeId.setEventId(eventId$vungle_ads_release);
        if (metaData == null) {
            metaData = "";
        }
        Sdk.SDKMetric.Builder meta = eventId.setMeta(metaData);
        if (logEntry == null || (headerUa = logEntry.getMediationName()) == null) {
            headerUa = VungleHeader.INSTANCE.getHeaderUa();
        }
        Sdk.SDKMetric.Builder mediationName = meta.setMediationName(headerUa);
        if (logEntry == null || (adSource$vungle_ads_release = logEntry.getAdSource()) == null) {
            adSource$vungle_ads_release = "";
        }
        Sdk.SDKMetric.Builder adSource = mediationName.setAdSource(adSource$vungle_ads_release);
        if (logEntry != null && (vmVersion$vungle_ads_release = logEntry.getVmVersion()) != null) {
            str2 = vmVersion$vungle_ads_release;
        }
        Sdk.SDKMetric.Builder appState = adSource.setVmVersion(str2).setAppState(ActivityManager.INSTANCE.isForeground() ? 0L : 2L);
        if (logEntry != null && (partialDownloadEnabled$vungle_ads_release = logEntry.getPartialDownloadEnabled()) != null) {
            appState.setIsPartialDownloadEnabled(partialDownloadEnabled$vungle_ads_release.booleanValue());
        }
        if (logEntry != null && (adoEnabled$vungle_ads_release = logEntry.getAdoEnabled()) != null) {
            appState.setIsAdoEnabled(adoEnabled$vungle_ads_release.booleanValue());
        }
        p.j(appState, "newBuilder()\n           …abled(it) }\n            }");
        return appState;
    }

    public static /* synthetic */ Sdk.SDKMetric.Builder genMetric$default(AnalyticsClient analyticsClient, Sdk.SDKMetric.SDKMetricType sDKMetricType, long j10, LogEntry logEntry, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        return analyticsClient.genMetric(sDKMetricType, j10, (i10 & 4) != 0 ? null : logEntry, (i10 & 8) != 0 ? null : str);
    }

    private final Sdk.SDKError.Builder genSDKError(Sdk.SDKError.Reason reason, String message, LogEntry entry) {
        String placementRefId$vungle_ads_release;
        String creativeId$vungle_ads_release;
        String eventId$vungle_ads_release;
        String adSource$vungle_ads_release;
        String headerUa;
        Boolean adoEnabled$vungle_ads_release;
        Boolean partialDownloadEnabled$vungle_ads_release;
        String vmVersion$vungle_ads_release;
        Sdk.SDKError.Builder builderNewBuilder = Sdk.SDKError.newBuilder();
        String str = Build.MANUFACTURER;
        Sdk.SDKError.Builder at2 = builderNewBuilder.setOs(p.f("Amazon", str) ? "amazon" : "android").setOsVersion(String.valueOf(Build.VERSION.SDK_INT)).setMake(str).setModel(Build.MODEL).setReason(reason).setMessage(message).setAt(System.currentTimeMillis());
        String str2 = "";
        if (entry == null || (placementRefId$vungle_ads_release = entry.getPlacementRefId()) == null) {
            placementRefId$vungle_ads_release = "";
        }
        Sdk.SDKError.Builder placementReferenceId = at2.setPlacementReferenceId(placementRefId$vungle_ads_release);
        if (entry == null || (creativeId$vungle_ads_release = entry.getCreativeId()) == null) {
            creativeId$vungle_ads_release = "";
        }
        Sdk.SDKError.Builder creativeId = placementReferenceId.setCreativeId(creativeId$vungle_ads_release);
        if (entry == null || (eventId$vungle_ads_release = entry.getEventId()) == null) {
            eventId$vungle_ads_release = "";
        }
        Sdk.SDKError.Builder eventId = creativeId.setEventId(eventId$vungle_ads_release);
        if (entry == null || (adSource$vungle_ads_release = entry.getAdSource()) == null) {
            adSource$vungle_ads_release = "";
        }
        Sdk.SDKError.Builder adSource = eventId.setAdSource(adSource$vungle_ads_release);
        if (entry != null && (vmVersion$vungle_ads_release = entry.getVmVersion()) != null) {
            str2 = vmVersion$vungle_ads_release;
        }
        Sdk.SDKError.Builder vmVersion = adSource.setVmVersion(str2);
        if (entry == null || (headerUa = entry.getMediationName()) == null) {
            headerUa = VungleHeader.INSTANCE.getHeaderUa();
        }
        Sdk.SDKError.Builder appState = vmVersion.setMediationName(headerUa).setAppState(ActivityManager.INSTANCE.isForeground() ? 0L : 2L);
        if (entry != null && (partialDownloadEnabled$vungle_ads_release = entry.getPartialDownloadEnabled()) != null) {
            appState.setIsPartialDownloadEnabled(partialDownloadEnabled$vungle_ads_release.booleanValue());
        }
        if (entry != null && (adoEnabled$vungle_ads_release = entry.getAdoEnabled()) != null) {
            appState.setIsAdoEnabled(adoEnabled$vungle_ads_release.booleanValue());
        }
        p.j(appState, "newBuilder()\n           …abled(it) }\n            }");
        return appState;
    }

    public static /* synthetic */ Sdk.SDKError.Builder genSDKError$default(AnalyticsClient analyticsClient, Sdk.SDKError.Reason reason, String str, LogEntry logEntry, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            logEntry = null;
        }
        return analyticsClient.genSDKError(reason, str, logEntry);
    }

    @VisibleForTesting
    public static /* synthetic */ void getErrors$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getExecutor$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMetrics$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMetricsEnabled$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPendingErrors$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPendingMetrics$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getRefreshEnabled$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getVungleApiClient$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initOrUpdate$lambda-1, reason: not valid java name */
    public static final void m7272initOrUpdate$lambda1(VungleThreadPoolExecutor vungleThreadPoolExecutor) {
        p.k(vungleThreadPoolExecutor, "$executor");
        vungleThreadPoolExecutor.execute(new Runnable() { // from class: com.vungle.ads.c
            @Override // java.lang.Runnable
            public final void run() {
                AnalyticsClient.m7273initOrUpdate$lambda1$lambda0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initOrUpdate$lambda-1$lambda-0, reason: not valid java name */
    public static final void m7273initOrUpdate$lambda1$lambda0() {
        INSTANCE.report();
    }

    @VisibleForTesting
    public static /* synthetic */ void isInitialized$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: logError$lambda-2, reason: not valid java name */
    public static final void m7274logError$lambda2(Sdk.SDKError.Reason reason, String str, LogEntry logEntry) {
        p.k(reason, "$reason");
        p.k(str, "$message");
        INSTANCE.logErrorInSameThread(reason, str, logEntry);
    }

    public static /* synthetic */ void logError$vungle_ads_release$default(AnalyticsClient analyticsClient, Sdk.SDKError.Reason reason, String str, LogEntry logEntry, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            logEntry = null;
        }
        analyticsClient.logError$vungle_ads_release(reason, str, logEntry);
    }

    private final synchronized void logErrorInSameThread(final Sdk.SDKError.Reason reason, final String str, LogEntry logEntry) {
        if (logLevel == LogLevel.ERROR_LOG_LEVEL_OFF) {
            return;
        }
        try {
            final Sdk.SDKError.Builder builderGenSDKError = genSDKError(reason, str, logEntry);
            BlockingQueue<Sdk.SDKError.Builder> blockingQueue = errors;
            blockingQueue.put(builderGenSDKError);
            Logger.INSTANCE.w(TAG, new sn.a<String>() { // from class: com.vungle.ads.AnalyticsClient.logErrorInSameThread.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // sn.a
                @NotNull
                public final String invoke() {
                    return "Logging error: " + reason + " with message: " + str + ", mediation: " + builderGenSDKError.getMediationName();
                }
            });
            if (blockingQueue.size() >= 20) {
                report();
            }
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "Cannot logError", e10);
        }
    }

    public static /* synthetic */ void logErrorInSameThread$default(AnalyticsClient analyticsClient, Sdk.SDKError.Reason reason, String str, LogEntry logEntry, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            logEntry = null;
        }
        analyticsClient.logErrorInSameThread(reason, str, logEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: logMetric$lambda-6, reason: not valid java name */
    public static final void m7275logMetric$lambda6(Sdk.SDKMetric.SDKMetricType sDKMetricType, long j10, LogEntry logEntry, String str) {
        p.k(sDKMetricType, "$metricType");
        INSTANCE.logMetricInSameThread(sDKMetricType, j10, logEntry, str);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, OneShotSingleValueMetric oneShotSingleValueMetric, LogEntry logEntry, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            logEntry = null;
        }
        if ((i10 & 4) != 0) {
            str = oneShotSingleValueMetric.getMeta();
        }
        analyticsClient.logMetric$vungle_ads_release(oneShotSingleValueMetric, logEntry, str);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, OneShotTimeIntervalMetric oneShotTimeIntervalMetric, LogEntry logEntry, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            logEntry = null;
        }
        if ((i10 & 4) != 0) {
            str = oneShotTimeIntervalMetric.getMeta();
        }
        analyticsClient.logMetric$vungle_ads_release(oneShotTimeIntervalMetric, logEntry, str);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, SingleValueMetric singleValueMetric, LogEntry logEntry, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            logEntry = null;
        }
        if ((i10 & 4) != 0) {
            str = singleValueMetric.getMeta();
        }
        analyticsClient.logMetric$vungle_ads_release(singleValueMetric, logEntry, str);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, TimeIntervalMetric timeIntervalMetric, LogEntry logEntry, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            logEntry = null;
        }
        if ((i10 & 4) != 0) {
            str = timeIntervalMetric.getMeta();
        }
        analyticsClient.logMetric$vungle_ads_release(timeIntervalMetric, logEntry, str);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, Sdk.SDKMetric.SDKMetricType sDKMetricType, long j10, LogEntry logEntry, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        analyticsClient.logMetric$vungle_ads_release(sDKMetricType, j10, (i10 & 4) != 0 ? null : logEntry, (i10 & 8) != 0 ? null : str);
    }

    private final synchronized void logMetricInSameThread(final Sdk.SDKMetric.SDKMetricType sDKMetricType, final long j10, final LogEntry logEntry, String str) {
        if (metricsEnabled) {
            try {
                final Sdk.SDKMetric.Builder builderGenMetric = genMetric(sDKMetricType, j10, logEntry, str);
                BlockingQueue<Sdk.SDKMetric.Builder> blockingQueue = metrics;
                blockingQueue.put(builderGenMetric);
                Logger.INSTANCE.w(TAG, new sn.a<String>() { // from class: com.vungle.ads.AnalyticsClient.logMetricInSameThread.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // sn.a
                    @NotNull
                    public final String invoke() {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Logging Metric ");
                        sb2.append(sDKMetricType);
                        sb2.append(" with value ");
                        sb2.append(j10);
                        sb2.append(" for placement ");
                        LogEntry logEntry2 = logEntry;
                        sb2.append(logEntry2 != null ? logEntry2.getPlacementRefId() : null);
                        sb2.append(" mediation:");
                        sb2.append(builderGenMetric.getMediationName());
                        return sb2.toString();
                    }
                });
                if (blockingQueue.size() >= 20) {
                    report();
                }
            } catch (Exception e10) {
                Logger.INSTANCE.e(TAG, "Cannot logMetrics", e10);
            }
        }
    }

    public static /* synthetic */ void logMetricInSameThread$default(AnalyticsClient analyticsClient, Sdk.SDKMetric.SDKMetricType sDKMetricType, long j10, LogEntry logEntry, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        analyticsClient.logMetricInSameThread(sDKMetricType, j10, (i10 & 4) != 0 ? null : logEntry, (i10 & 8) != 0 ? null : str);
    }

    private final synchronized void report() {
        if (logLevel != LogLevel.ERROR_LOG_LEVEL_OFF && errors.size() > 0) {
            flushErrors();
        }
        if (metricsEnabled && metrics.size() > 0) {
            flushMetrics();
        }
    }

    @NotNull
    public final BlockingQueue<Sdk.SDKError.Builder> getErrors$vungle_ads_release() {
        return errors;
    }

    @Nullable
    public final VungleThreadPoolExecutor getExecutor$vungle_ads_release() {
        return executor;
    }

    @NotNull
    public final BlockingQueue<Sdk.SDKMetric.Builder> getMetrics$vungle_ads_release() {
        return metrics;
    }

    public final boolean getMetricsEnabled$vungle_ads_release() {
        return metricsEnabled;
    }

    @NotNull
    public final BlockingQueue<Sdk.SDKError.Builder> getPendingErrors$vungle_ads_release() {
        return pendingErrors;
    }

    @NotNull
    public final BlockingQueue<Sdk.SDKMetric.Builder> getPendingMetrics$vungle_ads_release() {
        return pendingMetrics;
    }

    public final boolean getRefreshEnabled$vungle_ads_release() {
        return refreshEnabled;
    }

    @Nullable
    public final VungleApiClient getVungleApiClient$vungle_ads_release() {
        return vungleApiClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007a A[Catch: Exception -> 0x0080, all -> 0x00a2, TRY_LEAVE, TryCatch #0 {Exception -> 0x0080, blocks: (B:24:0x0071, B:26:0x007a), top: B:38:0x0071, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[Catch: all -> 0x00a2, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x001f, B:12:0x0041, B:14:0x0049, B:17:0x0054, B:18:0x0058, B:20:0x0061, B:24:0x0071, B:26:0x007a, B:30:0x008a, B:32:0x008e, B:29:0x0081, B:23:0x0068, B:6:0x0025, B:8:0x002e, B:9:0x0034, B:11:0x003c), top: B:40:0x0001, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void initOrUpdate$vungle_ads_release(@org.jetbrains.annotations.NotNull com.vungle.ads.internal.network.VungleApiClient r8, @org.jetbrains.annotations.NotNull final com.vungle.ads.internal.executor.VungleThreadPoolExecutor r9, int r10, boolean r11) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "vungleApiClient"
            tn.p.k(r8, r0)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = "executor"
            tn.p.k(r9, r0)     // Catch: java.lang.Throwable -> La2
            com.vungle.ads.AnalyticsClient$LogLevel$Companion r0 = com.vungle.ads.AnalyticsClient.LogLevel.INSTANCE     // Catch: java.lang.Throwable -> La2
            com.vungle.ads.AnalyticsClient$LogLevel r0 = r0.fromValue(r10)     // Catch: java.lang.Throwable -> La2
            com.vungle.ads.AnalyticsClient.logLevel = r0     // Catch: java.lang.Throwable -> La2
            com.vungle.ads.AnalyticsClient.metricsEnabled = r11     // Catch: java.lang.Throwable -> La2
            com.vungle.ads.AnalyticsClient$LogLevel r11 = com.vungle.ads.AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_DEBUG     // Catch: java.lang.Throwable -> La2
            int r11 = r11.getLevel()     // Catch: java.lang.Throwable -> La2
            r0 = 1
            if (r10 != r11) goto L25
            com.vungle.ads.internal.util.Logger$Companion r10 = com.vungle.ads.internal.util.Logger.INSTANCE     // Catch: java.lang.Throwable -> La2
            r10.enable(r0)     // Catch: java.lang.Throwable -> La2
            goto L41
        L25:
            com.vungle.ads.AnalyticsClient$LogLevel r11 = com.vungle.ads.AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_ERROR     // Catch: java.lang.Throwable -> La2
            int r11 = r11.getLevel()     // Catch: java.lang.Throwable -> La2
            r1 = 0
            if (r10 != r11) goto L34
            com.vungle.ads.internal.util.Logger$Companion r10 = com.vungle.ads.internal.util.Logger.INSTANCE     // Catch: java.lang.Throwable -> La2
            r10.enable(r1)     // Catch: java.lang.Throwable -> La2
            goto L41
        L34:
            com.vungle.ads.AnalyticsClient$LogLevel r11 = com.vungle.ads.AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_OFF     // Catch: java.lang.Throwable -> La2
            int r11 = r11.getLevel()     // Catch: java.lang.Throwable -> La2
            if (r10 != r11) goto L41
            com.vungle.ads.internal.util.Logger$Companion r10 = com.vungle.ads.internal.util.Logger.INSTANCE     // Catch: java.lang.Throwable -> La2
            r10.enable(r1)     // Catch: java.lang.Throwable -> La2
        L41:
            java.util.concurrent.atomic.AtomicBoolean r10 = com.vungle.ads.AnalyticsClient.isInitialized     // Catch: java.lang.Throwable -> La2
            boolean r10 = r10.getAndSet(r0)     // Catch: java.lang.Throwable -> La2
            if (r10 == 0) goto L54
            com.vungle.ads.internal.util.Logger$Companion r8 = com.vungle.ads.internal.util.Logger.INSTANCE     // Catch: java.lang.Throwable -> La2
            java.lang.String r9 = "AnalyticsClient"
            java.lang.String r10 = "AnalyticsClient already initialized"
            r8.d(r9, r10)     // Catch: java.lang.Throwable -> La2
            monitor-exit(r7)
            return
        L54:
            com.vungle.ads.AnalyticsClient.executor = r9     // Catch: java.lang.Throwable -> La2
            com.vungle.ads.AnalyticsClient.vungleApiClient = r8     // Catch: java.lang.Throwable -> La2
            java.util.concurrent.BlockingQueue<com.vungle.ads.internal.protos.Sdk$SDKError$Builder> r8 = com.vungle.ads.AnalyticsClient.pendingErrors     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> La2
            boolean r10 = r8.isEmpty()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> La2
            r10 = r10 ^ r0
            if (r10 == 0) goto L71
            java.util.concurrent.BlockingQueue<com.vungle.ads.internal.protos.Sdk$SDKError$Builder> r10 = com.vungle.ads.AnalyticsClient.errors     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> La2
            r8.drainTo(r10)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> La2
            goto L71
        L67:
            r8 = move-exception
            com.vungle.ads.internal.util.Logger$Companion r10 = com.vungle.ads.internal.util.Logger.INSTANCE     // Catch: java.lang.Throwable -> La2
            java.lang.String r11 = "AnalyticsClient"
            java.lang.String r1 = "Failed to add pendingErrors to errors queue."
            r10.e(r11, r1, r8)     // Catch: java.lang.Throwable -> La2
        L71:
            java.util.concurrent.BlockingQueue<com.vungle.ads.internal.protos.Sdk$SDKMetric$Builder> r8 = com.vungle.ads.AnalyticsClient.pendingMetrics     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La2
            boolean r10 = r8.isEmpty()     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La2
            r10 = r10 ^ r0
            if (r10 == 0) goto L8a
            java.util.concurrent.BlockingQueue<com.vungle.ads.internal.protos.Sdk$SDKMetric$Builder> r10 = com.vungle.ads.AnalyticsClient.metrics     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La2
            r8.drainTo(r10)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La2
            goto L8a
        L80:
            r8 = move-exception
            com.vungle.ads.internal.util.Logger$Companion r10 = com.vungle.ads.internal.util.Logger.INSTANCE     // Catch: java.lang.Throwable -> La2
            java.lang.String r11 = "AnalyticsClient"
            java.lang.String r0 = "Failed to add pendingMetrics to metrics queue."
            r10.e(r11, r0, r8)     // Catch: java.lang.Throwable -> La2
        L8a:
            boolean r8 = com.vungle.ads.AnalyticsClient.refreshEnabled     // Catch: java.lang.Throwable -> La2
            if (r8 == 0) goto La0
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()     // Catch: java.lang.Throwable -> La2
            com.vungle.ads.d r1 = new com.vungle.ads.d     // Catch: java.lang.Throwable -> La2
            r1.<init>()     // Catch: java.lang.Throwable -> La2
            r2 = 5000(0x1388, double:2.4703E-320)
            r4 = 5000(0x1388, double:2.4703E-320)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> La2
            r0.scheduleWithFixedDelay(r1, r2, r4, r6)     // Catch: java.lang.Throwable -> La2
        La0:
            monitor-exit(r7)
            return
        La2:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.AnalyticsClient.initOrUpdate$vungle_ads_release(com.vungle.ads.internal.network.VungleApiClient, com.vungle.ads.internal.executor.VungleThreadPoolExecutor, int, boolean):void");
    }

    @NotNull
    public final AtomicBoolean isInitialized$vungle_ads_release() {
        return isInitialized;
    }

    public final synchronized void logError$vungle_ads_release(@NotNull final Sdk.SDKError.Reason reason, @NotNull final String message, @Nullable final LogEntry entry) {
        VungleThreadPoolExecutor vungleThreadPoolExecutor;
        p.k(reason, "reason");
        p.k(message, "message");
        try {
            vungleThreadPoolExecutor = executor;
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "Cannot logError " + reason + ", " + message + ", " + entry, e10);
        }
        if (vungleThreadPoolExecutor == null) {
            pendingErrors.put(genSDKError(reason, message, entry));
        } else {
            if (vungleThreadPoolExecutor != null) {
                vungleThreadPoolExecutor.execute(new Runnable() { // from class: com.vungle.ads.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnalyticsClient.m7274logError$lambda2(reason, message, entry);
                    }
                });
            }
        }
    }

    public final synchronized void logMetric$vungle_ads_release(@NotNull OneShotSingleValueMetric oneShotSingleValueMetric, @Nullable LogEntry logEntry, @Nullable String metaData) {
        p.k(oneShotSingleValueMetric, "oneShotSingleValueMetric");
        if (!oneShotSingleValueMetric.getAlreadyLogged()) {
            logMetric$vungle_ads_release((SingleValueMetric) oneShotSingleValueMetric, logEntry, metaData);
            oneShotSingleValueMetric.markLogged();
        }
    }

    public final synchronized void logMetric$vungle_ads_release(@NotNull OneShotTimeIntervalMetric oneShotTimeIntervalMetric, @Nullable LogEntry logEntry, @Nullable String metaData) {
        p.k(oneShotTimeIntervalMetric, "oneShotTimeIntervalMetric");
        if (!oneShotTimeIntervalMetric.getAlreadyLogged()) {
            logMetric$vungle_ads_release((TimeIntervalMetric) oneShotTimeIntervalMetric, logEntry, metaData);
            oneShotTimeIntervalMetric.markLogged();
        }
    }

    public final synchronized void logMetric$vungle_ads_release(@NotNull SingleValueMetric singleValueMetric, @Nullable LogEntry logEntry, @Nullable String metaData) {
        p.k(singleValueMetric, "singleValueMetric");
        logMetric$vungle_ads_release(singleValueMetric.getMetricType(), singleValueMetric.getValue(), logEntry, metaData);
    }

    public final synchronized void logMetric$vungle_ads_release(@NotNull TimeIntervalMetric timeIntervalMetric, @Nullable LogEntry logEntry, @Nullable String metaData) {
        p.k(timeIntervalMetric, "timeIntervalMetric");
        logMetric$vungle_ads_release(timeIntervalMetric.getMetricType(), timeIntervalMetric.getValue(), logEntry, metaData);
    }

    public final synchronized void logMetric$vungle_ads_release(@NotNull final Sdk.SDKMetric.SDKMetricType metricType, final long metricValue, @Nullable final LogEntry logEntry, @Nullable final String metaData) {
        VungleThreadPoolExecutor vungleThreadPoolExecutor;
        p.k(metricType, "metricType");
        try {
            vungleThreadPoolExecutor = executor;
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "Cannot logMetric " + metricType + ", " + metricValue + ", " + logEntry + ", " + metaData, e10);
        }
        if (vungleThreadPoolExecutor == null) {
            pendingMetrics.put(genMetric(metricType, metricValue, logEntry, metaData));
        } else {
            if (vungleThreadPoolExecutor != null) {
                vungleThreadPoolExecutor.execute(new Runnable() { // from class: com.vungle.ads.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnalyticsClient.m7275logMetric$lambda6(metricType, metricValue, logEntry, metaData);
                    }
                });
            }
        }
    }

    public final void setExecutor$vungle_ads_release(@Nullable VungleThreadPoolExecutor vungleThreadPoolExecutor) {
        executor = vungleThreadPoolExecutor;
    }

    public final void setMetricsEnabled$vungle_ads_release(boolean z10) {
        metricsEnabled = z10;
    }

    public final void setRefreshEnabled$vungle_ads_release(boolean z10) {
        refreshEnabled = z10;
    }

    public final void setVungleApiClient$vungle_ads_release(@Nullable VungleApiClient vungleApiClient2) {
        vungleApiClient = vungleApiClient2;
    }
}
