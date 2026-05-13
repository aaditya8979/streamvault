package com.yandex.div.core.dagger;

import android.content.Context;
import com.yandex.div.core.DivKitConfiguration;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivKitComponent.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface DivKitComponent {

    /* JADX INFO: compiled from: DivKitComponent.kt */
    public interface Builder {
        @NotNull
        Builder applicationContext(@NotNull Context context);

        @NotNull
        DivKitComponent build();

        @NotNull
        Builder configuration(@NotNull DivKitConfiguration divKitConfiguration);
    }

    @NotNull
    Div2Component.Builder div2Component();

    @NotNull
    HistogramRecordConfiguration getHistogramRecordConfiguration();
}
