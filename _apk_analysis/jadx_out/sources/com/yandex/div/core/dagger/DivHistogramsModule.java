package com.yandex.div.core.dagger;

import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivHistogramsModule.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivHistogramsModule {

    @NotNull
    public static final DivHistogramsModule INSTANCE = new DivHistogramsModule();

    private DivHistogramsModule() {
    }

    @NotNull
    public final HistogramReporter provideHistogramReporter(@NotNull HistogramReporterDelegate histogramReporterDelegate) {
        return DivHistogramsModuleKt.createHistogramReporter(histogramReporterDelegate);
    }
}
