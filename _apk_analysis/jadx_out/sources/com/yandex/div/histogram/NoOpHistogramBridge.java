package com.yandex.div.histogram;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NoOpHistogramBridge.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class NoOpHistogramBridge implements HistogramBridge {
    @Override // com.yandex.div.histogram.HistogramBridge
    public void recordTimeHistogram(@NotNull String str, long j10, long j11, long j12, @NotNull TimeUnit timeUnit, int i10) {
    }
}
