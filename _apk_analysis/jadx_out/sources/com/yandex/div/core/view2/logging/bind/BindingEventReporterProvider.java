package com.yandex.div.core.view2.logging.bind;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Log;
import com.yandex.div2.DivData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BindingEventReporterProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BindingEventReporterProvider {

    @NotNull
    private final Div2View div2View;

    public BindingEventReporterProvider(@NotNull Div2View div2View) {
        this.div2View = div2View;
    }

    @NotNull
    public final BindingEventReporter get(@Nullable DivData divData, @Nullable DivData divData2) {
        return Log.isEnabled() ? new BindingEventReporterImpl(this.div2View, divData, divData2) : BindingEventReporter.Companion.getSTUB();
    }
}
