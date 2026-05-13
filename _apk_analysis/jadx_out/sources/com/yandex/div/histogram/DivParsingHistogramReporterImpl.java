package com.yandex.div.histogram;

import com.yandex.div.histogram.reporter.HistogramReporter;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import sn.a;

/* JADX INFO: compiled from: DivParsingHistogramReporter.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivParsingHistogramReporterImpl implements DivParsingHistogramReporter {

    @NotNull
    private final a<Executor> calculateSizeExecutor;

    @NotNull
    private final a<HistogramReporter> histogramReporter;

    /* JADX WARN: Multi-variable type inference failed */
    public DivParsingHistogramReporterImpl(@NotNull a<? extends HistogramReporter> aVar, @NotNull a<? extends Executor> aVar2) {
        this.histogramReporter = aVar;
        this.calculateSizeExecutor = aVar2;
    }
}
