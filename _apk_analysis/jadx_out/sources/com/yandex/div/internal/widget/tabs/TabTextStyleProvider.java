package com.yandex.div.internal.widget.tabs;

import com.yandex.div.core.font.DivTypefaceProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TabTextStyleProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TabTextStyleProvider {

    @NotNull
    private final DivTypefaceProvider typefaceProvider;

    public TabTextStyleProvider(@NotNull DivTypefaceProvider divTypefaceProvider) {
        this.typefaceProvider = divTypefaceProvider;
    }

    @NotNull
    public final DivTypefaceProvider getTypefaceProvider() {
        return this.typefaceProvider;
    }
}
