package com.yandex.div.core;

import android.os.SystemClock;
import com.yandex.div.histogram.reporter.HistogramReporter;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import tn.i;

/* JADX INFO: compiled from: DivCreationTracker.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivCreationTracker {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final AtomicBoolean isColdContextCreate = new AtomicBoolean(true);

    @NotNull
    private static final AtomicBoolean isColdViewCreate = new AtomicBoolean(true);

    @NotNull
    private final String contextCreateCallType;
    private long contextCreatedTime = -1;

    @NotNull
    private final AtomicBoolean contextCreationReported = new AtomicBoolean(false);
    private final long contextCreationStarted;

    @NotNull
    private final AtomicBoolean isFirstViewCreate;

    /* JADX INFO: compiled from: DivCreationTracker.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final long getCurrentUptimeMillis() {
            return SystemClock.uptimeMillis();
        }
    }

    public DivCreationTracker(long j10) {
        this.contextCreationStarted = j10;
        this.contextCreateCallType = isColdContextCreate.compareAndSet(true, false) ? "Cold" : "Cool";
        this.isFirstViewCreate = new AtomicBoolean(true);
    }

    private final void sendContextCreationHistogram(HistogramReporter histogramReporter) {
        long j10 = this.contextCreatedTime;
        if (j10 < 0) {
            return;
        }
        HistogramReporter.reportDuration$default(histogramReporter, "Div.Context.Create", j10 - this.contextCreationStarted, null, this.contextCreateCallType, null, 20, null);
        this.contextCreatedTime = -1L;
    }

    @NotNull
    public final String getViewCreateCallType() {
        return this.isFirstViewCreate.compareAndSet(true, false) ? isColdViewCreate.compareAndSet(true, false) ? "Cold" : "Cool" : "Warm";
    }

    public final void onContextCreationFinished() {
        if (this.contextCreatedTime >= 0) {
            return;
        }
        this.contextCreatedTime = Companion.getCurrentUptimeMillis();
    }

    public final void sendHistograms(long j10, long j11, @NotNull HistogramReporter histogramReporter, @NotNull String str) {
        if (j11 < 0) {
            return;
        }
        HistogramReporter.reportDuration$default(histogramReporter, "Div.View.Create", j11 - j10, null, str, null, 20, null);
        if (this.contextCreationReported.compareAndSet(false, true)) {
            sendContextCreationHistogram(histogramReporter);
        }
    }
}
