package com.yandex.div.histogram.reporter;

import bn.r;
import com.yandex.div.histogram.HistogramCallTypeProvider;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.histogram.TaskExecutor;
import com.yandex.div.histogram.util.HistogramUtils;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.a;
import zn.n;

/* JADX INFO: compiled from: HistogramReporterDelegateImpl.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class HistogramReporterDelegateImpl implements HistogramReporterDelegate {

    @NotNull
    private final HistogramCallTypeProvider histogramCallTypeProvider;

    @NotNull
    private final HistogramRecordConfiguration histogramRecordConfig;

    @NotNull
    private final a<HistogramRecorder> histogramRecorder;

    @NotNull
    private final a<TaskExecutor> taskExecutor;

    public HistogramReporterDelegateImpl(@NotNull a<HistogramRecorder> aVar, @NotNull HistogramCallTypeProvider histogramCallTypeProvider, @NotNull HistogramRecordConfiguration histogramRecordConfiguration, @NotNull a<TaskExecutor> aVar2) {
        this.histogramRecorder = aVar;
        this.histogramCallTypeProvider = histogramCallTypeProvider;
        this.histogramRecordConfig = histogramRecordConfiguration;
        this.taskExecutor = aVar2;
    }

    @Override // com.yandex.div.histogram.reporter.HistogramReporterDelegate
    public void reportDuration(@NotNull final String str, final long j10, @Nullable String str2) {
        final String histogramCallType = str2 == null ? this.histogramCallTypeProvider.getHistogramCallType(str) : str2;
        if (HistogramUtils.INSTANCE.shouldRecordHistogram(histogramCallType, this.histogramRecordConfig)) {
            this.taskExecutor.get().post(new sn.a<r>() { // from class: com.yandex.div.histogram.reporter.HistogramReporterDelegateImpl.reportDuration.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // sn.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ((HistogramRecorder) HistogramReporterDelegateImpl.this.histogramRecorder.get()).recordShortTimeHistogram(str + '.' + histogramCallType, n.f(j10, 1L), TimeUnit.MILLISECONDS);
                }
            });
        }
    }
}
