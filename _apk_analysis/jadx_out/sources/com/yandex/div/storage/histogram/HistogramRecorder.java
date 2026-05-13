package com.yandex.div.storage.histogram;

import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HistogramRecorder.kt */
/* JADX INFO: loaded from: classes9.dex */
public class HistogramRecorder {

    @Nullable
    private final HistogramNameProvider histogramNameProvider;

    @NotNull
    private final HistogramReporter histogramReporter;

    @NotNull
    private final CopyOnWriteArraySet<String> recordedHistograms = new CopyOnWriteArraySet<>();

    public HistogramRecorder(@NotNull HistogramReporterDelegate histogramReporterDelegate, @Nullable HistogramNameProvider histogramNameProvider) {
        this.histogramNameProvider = histogramNameProvider;
        this.histogramReporter = new HistogramReporter(histogramReporterDelegate);
    }
}
