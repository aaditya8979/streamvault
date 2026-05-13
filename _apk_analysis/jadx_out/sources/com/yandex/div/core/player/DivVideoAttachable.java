package com.yandex.div.core.player;

import com.yandex.div2.DivVideoScale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivVideoAttachable.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface DivVideoAttachable {
    default void attach(@NotNull DivPlayer divPlayer) {
    }

    default void detach() {
    }

    @Nullable
    default DivPlayer getAttachedPlayer() {
        return null;
    }

    default void setScale(@NotNull DivVideoScale divVideoScale) {
    }

    default void setVisibleOnScreen(boolean z10) {
    }
}
