package com.yandex.div.storage;

import com.yandex.div.storage.analytics.CardErrorLoggerFactory;
import com.yandex.div.storage.histogram.HistogramNameProvider;
import com.yandex.div.storage.histogram.HistogramRecorder;
import com.yandex.div.storage.templates.DivParsingHistogramProxy;
import com.yandex.div.storage.templates.TemplatesContainer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.a;

/* JADX INFO: compiled from: DivDataRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DivDataRepositoryImpl implements DivDataRepository {

    @NotNull
    private final CardErrorLoggerFactory cardErrorFactory;

    @NotNull
    private final a<DivParsingHistogramProxy> divParsingHistogramProxy;

    @NotNull
    private final DivStorage divStorage;

    @Nullable
    private final HistogramNameProvider histogramNameProvider;

    @NotNull
    private final HistogramRecorder histogramRecorder;

    @NotNull
    private final TemplatesContainer templateContainer;

    @NotNull
    private final Map<String, Object> inMemoryData = new LinkedHashMap();

    @NotNull
    private Map<String, ? extends List<Object>> cardsWithErrors = kotlin.collections.a.j();

    public DivDataRepositoryImpl(@NotNull DivStorage divStorage, @NotNull TemplatesContainer templatesContainer, @NotNull HistogramRecorder histogramRecorder, @Nullable HistogramNameProvider histogramNameProvider, @NotNull a<DivParsingHistogramProxy> aVar, @NotNull CardErrorLoggerFactory cardErrorLoggerFactory) {
        this.divStorage = divStorage;
        this.templateContainer = templatesContainer;
        this.histogramRecorder = histogramRecorder;
        this.histogramNameProvider = histogramNameProvider;
        this.divParsingHistogramProxy = aVar;
        this.cardErrorFactory = cardErrorLoggerFactory;
    }
}
