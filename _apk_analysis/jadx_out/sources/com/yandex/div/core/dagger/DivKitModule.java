package com.yandex.div.core.dagger;

import android.content.Context;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.internal.viewpool.ViewCreator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivKitModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivKitModule {

    @NotNull
    public static final DivKitModule INSTANCE = new DivKitModule();

    private DivKitModule() {
    }

    @Nullable
    public static final xf.b provideSendBeaconManager(@NotNull Context context, @Nullable xf.a aVar) {
        if (aVar == null) {
            return null;
        }
        return new xf.b(context, aVar);
    }

    @NotNull
    public static final ViewCreator provideViewCreator(@NotNull CpuUsageHistogramReporter cpuUsageHistogramReporter) {
        return new ViewCreator(cpuUsageHistogramReporter);
    }
}
