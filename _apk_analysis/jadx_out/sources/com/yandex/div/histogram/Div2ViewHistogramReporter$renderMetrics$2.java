package com.yandex.div.histogram;

import com.yandex.div.histogram.metrics.RenderMetrics;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import sn.a;

/* JADX INFO: compiled from: Div2ViewHistogramReporter.kt */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class Div2ViewHistogramReporter$renderMetrics$2 extends FunctionReferenceImpl implements a<RenderMetrics> {
    public static final Div2ViewHistogramReporter$renderMetrics$2 INSTANCE = new Div2ViewHistogramReporter$renderMetrics$2();

    public Div2ViewHistogramReporter$renderMetrics$2() {
        super(0, RenderMetrics.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sn.a
    @NotNull
    public final RenderMetrics invoke() {
        return new RenderMetrics();
    }
}
