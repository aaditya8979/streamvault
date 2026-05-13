package com.yandex.div.core.view2;

import com.yandex.div.DivDataTag;
import com.yandex.div2.DivData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ViewBindingProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class Binding {

    @Nullable
    private final DivData data;

    @NotNull
    private final DivDataTag tag;

    public Binding(@NotNull DivDataTag divDataTag, @Nullable DivData divData) {
        this.tag = divDataTag;
        this.data = divData;
    }

    @Nullable
    public final DivData getData() {
        return this.data;
    }

    @NotNull
    public final DivDataTag getTag() {
        return this.tag;
    }
}
