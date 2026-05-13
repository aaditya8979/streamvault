package com.yandex.div.storage.templates;

import bn.g;
import com.yandex.div.histogram.DivParsingHistogramReporter;
import kotlin.b;
import org.jetbrains.annotations.NotNull;
import sn.a;

/* JADX INFO: compiled from: DivParsingHistogramProxy.kt */
/* JADX INFO: loaded from: classes9.dex */
public class DivParsingHistogramProxy {

    @NotNull
    private final g reporter$delegate;

    public DivParsingHistogramProxy(@NotNull a<? extends DivParsingHistogramReporter> aVar) {
        this.reporter$delegate = b.b(aVar);
    }
}
