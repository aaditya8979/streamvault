package com.yandex.div.storage.templates;

import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.DivStorage;
import com.yandex.div.storage.histogram.HistogramRecorder;
import com.yandex.div2.DivTemplate;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.a;

/* JADX INFO: compiled from: TemplatesContainer.kt */
/* JADX INFO: loaded from: classes3.dex */
final class CommonTemplatesPool {

    @NotNull
    private final ConcurrentHashMap<String, DivTemplate> commonTemplates = new ConcurrentHashMap<>();

    @NotNull
    private final DivStorage divStorage;

    @NotNull
    private final DivParsingEnvironment env;

    @Nullable
    private final String histogramComponent;

    @NotNull
    private final HistogramRecorder histogramRecorder;

    @NotNull
    private final a<DivParsingHistogramProxy> parsingHistogramProxy;

    public CommonTemplatesPool(@NotNull DivStorage divStorage, @NotNull ParsingErrorLogger parsingErrorLogger, @Nullable String str, @NotNull HistogramRecorder histogramRecorder, @NotNull a<DivParsingHistogramProxy> aVar) {
        this.divStorage = divStorage;
        this.histogramComponent = str;
        this.histogramRecorder = histogramRecorder;
        this.parsingHistogramProxy = aVar;
        this.env = TemplatesContainerKt.createEmptyEnv(parsingErrorLogger);
    }
}
