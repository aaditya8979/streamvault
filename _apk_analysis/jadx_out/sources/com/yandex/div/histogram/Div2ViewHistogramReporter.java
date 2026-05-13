package com.yandex.div.histogram;

import android.os.SystemClock;
import androidx.annotation.MainThread;
import bn.g;
import com.yandex.div.histogram.metrics.RenderMetrics;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import kotlin.LazyThreadSafetyMode;
import kotlin.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;

/* JADX INFO: compiled from: Div2ViewHistogramReporter.kt */
/* JADX INFO: loaded from: classes8.dex */
@MainThread
public final class Div2ViewHistogramReporter {

    @Nullable
    private Long bindingPausedTime;

    @Nullable
    private Long bindingResumedTime;

    @Nullable
    private Long bindingStartedTime;

    @Nullable
    private String component;

    @Nullable
    private Long drawStartedTime;

    @NotNull
    private final a<HistogramReporter> histogramReporter;

    @Nullable
    private Long layoutStartedTime;

    @Nullable
    private Long measureStartedTime;

    @Nullable
    private Long rebindingStartedTime;

    @NotNull
    private final a<RenderConfiguration> renderConfig;

    @NotNull
    private final g renderMetrics$delegate = b.a(LazyThreadSafetyMode.NONE, Div2ViewHistogramReporter$renderMetrics$2.INSTANCE);
    private boolean renderStarted;

    /* JADX WARN: Multi-variable type inference failed */
    public Div2ViewHistogramReporter(@NotNull a<? extends HistogramReporter> aVar, @NotNull a<RenderConfiguration> aVar2) {
        this.histogramReporter = aVar;
        this.renderConfig = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getCurrentUptime() {
        return SystemClock.uptimeMillis();
    }

    private final RenderMetrics getRenderMetrics() {
        return (RenderMetrics) this.renderMetrics$delegate.getValue();
    }

    private final void reportRenderMetrics(RenderMetrics renderMetrics) {
        HistogramReporter histogramReporterInvoke = this.histogramReporter.invoke();
        RenderConfiguration renderConfigurationInvoke = this.renderConfig.invoke();
        HistogramReporter.reportDuration$default(histogramReporterInvoke, "Div.Render.Total", renderMetrics.getTotalMs(), this.component, null, renderConfigurationInvoke.getTotalFilter(), 8, null);
        HistogramReporter.reportDuration$default(histogramReporterInvoke, "Div.Render.Measure", renderMetrics.getMeasureMs(), this.component, null, renderConfigurationInvoke.getMeasureFilter(), 8, null);
        HistogramReporter.reportDuration$default(histogramReporterInvoke, "Div.Render.Layout", renderMetrics.getLayoutMs(), this.component, null, renderConfigurationInvoke.getLayoutFilter(), 8, null);
        HistogramReporter.reportDuration$default(histogramReporterInvoke, "Div.Render.Draw", renderMetrics.getDrawMs(), this.component, null, renderConfigurationInvoke.getDrawFilter(), 8, null);
    }

    private final void resetRenderMetrics() {
        this.renderStarted = false;
        this.layoutStartedTime = null;
        this.measureStartedTime = null;
        this.drawStartedTime = null;
        getRenderMetrics().reset();
    }

    private final long toTimePassed(long j10) {
        return getCurrentUptime() - j10;
    }

    @Nullable
    public final String getComponent() {
        return this.component;
    }

    public final void onBindingFinished() {
        String str;
        long currentUptime;
        Long l10 = this.bindingStartedTime;
        Long l11 = this.bindingPausedTime;
        Long l12 = this.bindingResumedTime;
        RenderMetrics renderMetrics = getRenderMetrics();
        if (l10 == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                str = "start time of Div.Binding is null";
                Assert.fail(str);
            }
        } else {
            if (l11 != null && l12 != null) {
                currentUptime = ((getCurrentUptime() - l12.longValue()) + l11.longValue()) - l10.longValue();
            } else if (l11 == null && l12 == null) {
                currentUptime = getCurrentUptime() - l10.longValue();
            } else {
                KAssert kAssert2 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    str = "when Div.Binding has paused time it should have resumed time and otherwise";
                    Assert.fail(str);
                }
            }
            renderMetrics.binding(currentUptime);
            HistogramReporter.reportDuration$default((HistogramReporter) this.histogramReporter.invoke(), "Div.Binding", currentUptime, getComponent(), null, null, 24, null);
        }
        this.bindingStartedTime = null;
        this.bindingPausedTime = null;
        this.bindingResumedTime = null;
    }

    public final void onBindingPaused() {
        this.bindingPausedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onBindingResumed() {
        this.bindingResumedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onBindingStarted() {
        this.bindingStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onDrawFinished() {
        Long l10 = this.drawStartedTime;
        if (l10 != null) {
            getRenderMetrics().addDraw(toTimePassed(l10.longValue()));
        }
        if (this.renderStarted) {
            reportRenderMetrics(getRenderMetrics());
        }
        resetRenderMetrics();
    }

    public final void onDrawStarted() {
        this.drawStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onLayoutFinished() {
        Long l10 = this.layoutStartedTime;
        if (l10 != null) {
            getRenderMetrics().addLayout(toTimePassed(l10.longValue()));
        }
    }

    public final void onLayoutStarted() {
        this.layoutStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onMeasureFinished() {
        Long l10 = this.measureStartedTime;
        if (l10 != null) {
            getRenderMetrics().addMeasure(toTimePassed(l10.longValue()));
        }
    }

    public final void onMeasureStarted() {
        this.measureStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onRebindingFinished() {
        Long l10 = this.rebindingStartedTime;
        RenderMetrics renderMetrics = getRenderMetrics();
        if (l10 == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("start time of Div.Rebinding is null");
            }
        } else {
            long currentUptime = getCurrentUptime() - l10.longValue();
            renderMetrics.rebinding(currentUptime);
            HistogramReporter.reportDuration$default((HistogramReporter) this.histogramReporter.invoke(), "Div.Rebinding", currentUptime, getComponent(), null, null, 24, null);
        }
        this.rebindingStartedTime = null;
    }

    public final void onRebindingStarted() {
        this.rebindingStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onRenderStarted() {
        this.renderStarted = true;
    }

    public final void setComponent(@Nullable String str) {
        this.component = str;
    }
}
