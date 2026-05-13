package com.yandex.div.core.view2.errors;

import com.yandex.div.DivDataTag;
import com.yandex.div2.DivData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ErrorCollectors.kt */
/* JADX INFO: loaded from: classes3.dex */
public class ErrorCollectors {

    @NotNull
    private final Map<String, ErrorCollector> collectors = new LinkedHashMap();

    @NotNull
    public ErrorCollector getOrCreate(@NotNull DivDataTag divDataTag, @Nullable DivData divData) {
        ErrorCollector errorCollector;
        synchronized (this.collectors) {
            Map<String, ErrorCollector> map = this.collectors;
            String id2 = divDataTag.getId();
            ErrorCollector errorCollector2 = map.get(id2);
            if (errorCollector2 == null) {
                errorCollector2 = new ErrorCollector();
                map.put(id2, errorCollector2);
            }
            errorCollector2.attachParsingErrors(divData);
            errorCollector = errorCollector2;
        }
        return errorCollector;
    }

    @Nullable
    public ErrorCollector getOrNull(@NotNull DivDataTag divDataTag, @Nullable DivData divData) {
        ErrorCollector errorCollector;
        synchronized (this.collectors) {
            errorCollector = this.collectors.get(divDataTag.getId());
            if (errorCollector != null) {
                errorCollector.attachParsingErrors(divData);
            } else {
                errorCollector = null;
            }
        }
        return errorCollector;
    }
}
