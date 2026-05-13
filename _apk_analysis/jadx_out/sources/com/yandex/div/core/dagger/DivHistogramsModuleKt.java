package com.yandex.div.core.dagger;

import com.yandex.div.histogram.HistogramCallTypeProvider;
import com.yandex.div.histogram.HistogramColdTypeChecker;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.histogram.reporter.HistogramReporterDelegateImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivHistogramsModule.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivHistogramsModuleKt {
    @NotNull
    public static final HistogramReporter createHistogramReporter(@NotNull HistogramReporterDelegate histogramReporterDelegate) {
        return new HistogramReporter(histogramReporterDelegate);
    }

    @NotNull
    public static final HistogramReporterDelegate createHistogramReporterDelegate(@NotNull HistogramConfiguration histogramConfiguration, @NotNull ym.a<HistogramRecorder> aVar, @NotNull ym.a<HistogramColdTypeChecker> aVar2) {
        return !histogramConfiguration.isReportingEnabled() ? HistogramReporterDelegate.NoOp.INSTANCE : new HistogramReporterDelegateImpl(aVar, new HistogramCallTypeProvider(new DivHistogramsModuleKt$createHistogramReporterDelegate$histogramCallTypeProvider$1(aVar2)), histogramConfiguration, histogramConfiguration.getTaskExecutorProvider());
    }
}
