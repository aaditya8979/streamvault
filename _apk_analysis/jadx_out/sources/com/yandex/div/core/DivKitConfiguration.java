package com.yandex.div.core;

import com.yandex.div.core.DivRequestExecutor;
import com.yandex.div.core.dagger.ExternalOptional;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.storage.DivStorageComponent;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import ym.a;

/* JADX INFO: compiled from: DivKitConfiguration.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivKitConfiguration {

    @NotNull
    private final a<DivRequestExecutor> divRequestExecutor;

    @Nullable
    private final a<DivStorageComponent> divStorageComponent;

    @NotNull
    private final ExecutorService executorService;

    @NotNull
    private final a<HistogramConfiguration> histogramConfiguration;

    @Nullable
    private final a<xf.a> sendBeaconConfiguration;

    /* JADX INFO: compiled from: DivKitConfiguration.kt */
    public static final class Builder {

        @Nullable
        private a<DivStorageComponent> divStorageComponent;

        @Nullable
        private ExecutorService executorService;

        @Nullable
        private a<xf.a> sendBeaconConfiguration;

        @NotNull
        private a<HistogramConfiguration> histogramConfiguration = new a() { // from class: ag.c
            @Override // ym.a
            public final Object get() {
                return HistogramConfiguration.DEFAULT;
            }
        };

        @NotNull
        private a<DivRequestExecutor> divRequestExecutor = new a() { // from class: ag.d
            @Override // ym.a
            public final Object get() {
                return DivRequestExecutor.STUB;
            }
        };

        @NotNull
        public final DivKitConfiguration build() {
            a<xf.a> aVar = this.sendBeaconConfiguration;
            ExecutorService executorServiceNewSingleThreadExecutor = this.executorService;
            if (executorServiceNewSingleThreadExecutor == null) {
                executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            }
            return new DivKitConfiguration(aVar, executorServiceNewSingleThreadExecutor, this.histogramConfiguration, this.divStorageComponent, this.divRequestExecutor, null);
        }
    }

    private DivKitConfiguration(a<xf.a> aVar, ExecutorService executorService, a<HistogramConfiguration> aVar2, a<DivStorageComponent> aVar3, a<DivRequestExecutor> aVar4) {
        this.sendBeaconConfiguration = aVar;
        this.executorService = executorService;
        this.histogramConfiguration = aVar2;
        this.divStorageComponent = aVar3;
        this.divRequestExecutor = aVar4;
    }

    public /* synthetic */ DivKitConfiguration(a aVar, ExecutorService executorService, a aVar2, a aVar3, a aVar4, i iVar) {
        this(aVar, executorService, aVar2, aVar3, aVar4);
    }

    @NotNull
    public final CpuUsageHistogramReporter cpuUsageHistogramReporter() {
        return this.histogramConfiguration.get().getCpuUsageHistogramReporter().get();
    }

    @NotNull
    public final DivRequestExecutor divRequestExecutor() {
        return this.divRequestExecutor.get();
    }

    @NotNull
    public final ExecutorService executorService() {
        return this.executorService;
    }

    @NotNull
    public final ExternalOptional<DivStorageComponent> externalDivStorageComponent() {
        ExternalOptional.Companion companion = ExternalOptional.Companion;
        a<DivStorageComponent> aVar = this.divStorageComponent;
        return companion.ofNullable(aVar != null ? aVar.get() : null);
    }

    @NotNull
    public final HistogramConfiguration histogramConfiguration() {
        return this.histogramConfiguration.get();
    }

    @NotNull
    public final HistogramRecordConfiguration histogramRecordConfiguration() {
        return this.histogramConfiguration.get();
    }

    @NotNull
    public final HistogramRecorder histogramRecorder() {
        return new HistogramRecorder(this.histogramConfiguration.get().getHistogramBridge().get());
    }

    @Nullable
    public final xf.a sendBeaconConfiguration() {
        a<xf.a> aVar = this.sendBeaconConfiguration;
        if (aVar != null) {
            return aVar.get();
        }
        return null;
    }
}
