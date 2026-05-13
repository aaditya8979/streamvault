package com.yandex.div.histogram;

import bn.g;
import kotlin.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivParsingHistogramReporter.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface DivParsingHistogramReporter {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: DivParsingHistogramReporter.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final g<DefaultDivParsingHistogramReporter> DEFAULT$delegate = b.b(DivParsingHistogramReporter$Companion$DEFAULT$2.INSTANCE);

        private Companion() {
        }

        @NotNull
        public final DivParsingHistogramReporter getDEFAULT() {
            return DEFAULT$delegate.getValue();
        }
    }
}
