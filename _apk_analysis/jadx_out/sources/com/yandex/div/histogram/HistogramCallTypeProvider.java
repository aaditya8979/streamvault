package com.yandex.div.histogram;

import org.jetbrains.annotations.NotNull;
import sn.a;

/* JADX INFO: compiled from: HistogramCallTypeProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class HistogramCallTypeProvider extends HistogramCallTypeChecker {

    @NotNull
    private final a<HistogramColdTypeChecker> histogramColdTypeChecker;

    public HistogramCallTypeProvider(@NotNull a<HistogramColdTypeChecker> aVar) {
        this.histogramColdTypeChecker = aVar;
    }

    @NotNull
    public final String getHistogramCallType(@NotNull String str) {
        if (!this.histogramColdTypeChecker.invoke().addReported(str)) {
            return addReported(str) ? "Cool" : "Warm";
        }
        addReported(str);
        return "Cold";
    }
}
