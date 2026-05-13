package com.yandex.div.histogram;

import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.internal.util.DoubleCheckProvider;
import org.jetbrains.annotations.NotNull;
import ym.a;

/* JADX INFO: compiled from: HistogramConfiguration.kt */
/* JADX INFO: loaded from: classes.dex */
public interface HistogramConfiguration extends HistogramRecordConfiguration {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public static final HistogramConfiguration DEFAULT = new DefaultHistogramConfiguration();

    /* JADX INFO: compiled from: HistogramConfiguration.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: HistogramConfiguration.kt */
    public static class DefaultHistogramConfiguration implements HistogramConfiguration {
        private final boolean isColdRecordingEnabled;
        private final boolean isCoolRecordingEnabled;
        private final boolean isReportingEnabled;
        private final boolean isSizeRecordingEnabled;
        private final boolean isWarmRecordingEnabled;

        @NotNull
        private final a<HistogramBridge> histogramBridge = new DoubleCheckProvider(HistogramConfiguration$DefaultHistogramConfiguration$histogramBridge$1.INSTANCE);

        @NotNull
        private final a<CpuUsageHistogramReporter> cpuUsageHistogramReporter = new DoubleCheckProvider(new sn.a<CpuUsageHistogramReporter>() { // from class: com.yandex.div.histogram.HistogramConfiguration$DefaultHistogramConfiguration$cpuUsageHistogramReporter$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final CpuUsageHistogramReporter invoke() {
                return new CpuUsageHistogramReporter.NoOp();
            }
        });

        @NotNull
        private final a<TaskExecutor> taskExecutorProvider = new DoubleCheckProvider(HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1.INSTANCE);

        @NotNull
        private final a<RenderConfiguration> renderConfiguration = new DoubleCheckProvider(HistogramConfiguration$DefaultHistogramConfiguration$renderConfiguration$1.INSTANCE);

        @Override // com.yandex.div.histogram.HistogramConfiguration
        @NotNull
        public a<CpuUsageHistogramReporter> getCpuUsageHistogramReporter() {
            return this.cpuUsageHistogramReporter;
        }

        @Override // com.yandex.div.histogram.HistogramConfiguration
        @NotNull
        public a<HistogramBridge> getHistogramBridge() {
            return this.histogramBridge;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        @NotNull
        public a<RenderConfiguration> getRenderConfiguration() {
            return this.renderConfiguration;
        }

        @Override // com.yandex.div.histogram.HistogramConfiguration
        @NotNull
        public a<TaskExecutor> getTaskExecutorProvider() {
            return this.taskExecutorProvider;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        public boolean isColdRecordingEnabled() {
            return this.isColdRecordingEnabled;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        public boolean isCoolRecordingEnabled() {
            return this.isCoolRecordingEnabled;
        }

        @Override // com.yandex.div.histogram.HistogramConfiguration
        public boolean isReportingEnabled() {
            return this.isReportingEnabled;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        public boolean isSizeRecordingEnabled() {
            return this.isSizeRecordingEnabled;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        public boolean isWarmRecordingEnabled() {
            return this.isWarmRecordingEnabled;
        }
    }

    @NotNull
    a<CpuUsageHistogramReporter> getCpuUsageHistogramReporter();

    @NotNull
    a<HistogramBridge> getHistogramBridge();

    @NotNull
    a<TaskExecutor> getTaskExecutorProvider();

    boolean isReportingEnabled();
}
