package com.yandex.div.histogram;

import org.jetbrains.annotations.NotNull;
import tn.i;

/* JADX INFO: compiled from: RenderConfiguration.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class RenderConfiguration {

    @NotNull
    private final HistogramFilter drawFilter;

    @NotNull
    private final HistogramFilter layoutFilter;

    @NotNull
    private final HistogramFilter measureFilter;

    @NotNull
    private final HistogramFilter totalFilter;

    public RenderConfiguration() {
        this(null, null, null, null, 15, null);
    }

    public RenderConfiguration(@NotNull HistogramFilter histogramFilter, @NotNull HistogramFilter histogramFilter2, @NotNull HistogramFilter histogramFilter3, @NotNull HistogramFilter histogramFilter4) {
        this.measureFilter = histogramFilter;
        this.layoutFilter = histogramFilter2;
        this.drawFilter = histogramFilter3;
        this.totalFilter = histogramFilter4;
    }

    public /* synthetic */ RenderConfiguration(HistogramFilter histogramFilter, HistogramFilter histogramFilter2, HistogramFilter histogramFilter3, HistogramFilter histogramFilter4, int i10, i iVar) {
        this((i10 & 1) != 0 ? HistogramFilter.Companion.getOFF() : histogramFilter, (i10 & 2) != 0 ? HistogramFilter.Companion.getOFF() : histogramFilter2, (i10 & 4) != 0 ? HistogramFilter.Companion.getOFF() : histogramFilter3, (i10 & 8) != 0 ? HistogramFilter.Companion.getON() : histogramFilter4);
    }

    @NotNull
    public final HistogramFilter getDrawFilter() {
        return this.drawFilter;
    }

    @NotNull
    public final HistogramFilter getLayoutFilter() {
        return this.layoutFilter;
    }

    @NotNull
    public final HistogramFilter getMeasureFilter() {
        return this.measureFilter;
    }

    @NotNull
    public final HistogramFilter getTotalFilter() {
        return this.totalFilter;
    }
}
