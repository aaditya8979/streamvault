package com.yandex.div.histogram;

import org.jetbrains.annotations.NotNull;
import ym.a;

/* JADX INFO: compiled from: HistogramRecordConfiguration.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface HistogramRecordConfiguration {
    @NotNull
    a<RenderConfiguration> getRenderConfiguration();

    boolean isColdRecordingEnabled();

    boolean isCoolRecordingEnabled();

    boolean isSizeRecordingEnabled();

    boolean isWarmRecordingEnabled();
}
