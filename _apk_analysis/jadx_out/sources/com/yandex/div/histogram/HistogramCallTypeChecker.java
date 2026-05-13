package com.yandex.div.histogram;

import bn.g;
import bn.r;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.b;
import org.jetbrains.annotations.NotNull;
import sn.a;

/* JADX INFO: compiled from: HistogramCallTypeChecker.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class HistogramCallTypeChecker {

    @NotNull
    private final g reportedHistograms$delegate = b.b(new a<ConcurrentHashMap<String, r>>() { // from class: com.yandex.div.histogram.HistogramCallTypeChecker$reportedHistograms$2
        @Override // sn.a
        @NotNull
        public final ConcurrentHashMap<String, r> invoke() {
            return new ConcurrentHashMap<>();
        }
    });

    private final ConcurrentHashMap<String, r> getReportedHistograms() {
        return (ConcurrentHashMap) this.reportedHistograms$delegate.getValue();
    }

    public final boolean addReported(@NotNull String str) {
        return !getReportedHistograms().containsKey(str) && getReportedHistograms().putIfAbsent(str, r.f5635a) == null;
    }
}
