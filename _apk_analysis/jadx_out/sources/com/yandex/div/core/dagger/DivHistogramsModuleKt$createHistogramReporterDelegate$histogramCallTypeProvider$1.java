package com.yandex.div.core.dagger;

import com.yandex.div.histogram.HistogramColdTypeChecker;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: DivHistogramsModule.kt */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class DivHistogramsModuleKt$createHistogramReporterDelegate$histogramCallTypeProvider$1 extends FunctionReferenceImpl implements sn.a<HistogramColdTypeChecker> {
    public DivHistogramsModuleKt$createHistogramReporterDelegate$histogramCallTypeProvider$1(Object obj) {
        super(0, obj, ym.a.class, "get", "get()Ljava/lang/Object;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sn.a
    public final HistogramColdTypeChecker invoke() {
        return (HistogramColdTypeChecker) ((ym.a) this.receiver).get();
    }
}
