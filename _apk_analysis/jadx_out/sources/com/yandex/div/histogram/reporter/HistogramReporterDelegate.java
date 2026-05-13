package com.yandex.div.histogram.reporter;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HistogramReporterDelegate.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface HistogramReporterDelegate {

    /* JADX INFO: compiled from: HistogramReporterDelegate.kt */
    public static final class NoOp implements HistogramReporterDelegate {

        @NotNull
        public static final NoOp INSTANCE = new NoOp();

        private NoOp() {
        }

        @Override // com.yandex.div.histogram.reporter.HistogramReporterDelegate
        public void reportDuration(@NotNull String str, long j10, @Nullable String str2) {
        }
    }

    void reportDuration(@NotNull String str, long j10, @Nullable String str2);
}
