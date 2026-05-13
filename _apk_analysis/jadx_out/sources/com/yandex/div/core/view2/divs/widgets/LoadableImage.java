package com.yandex.div.core.view2.divs.widgets;

import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoadableImage.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface LoadableImage {
    void cleanLoadingTask();

    @Nullable
    Future<?> getLoadingTask();

    void saveLoadingTask(@NotNull Future<?> future);
}
