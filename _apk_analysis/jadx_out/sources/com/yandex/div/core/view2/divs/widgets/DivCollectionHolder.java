package com.yandex.div.core.view2.divs.widgets;

import com.yandex.div.internal.core.DivItemBuilderResult;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivCollectionHolder.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface DivCollectionHolder {
    @Nullable
    List<DivItemBuilderResult> getItems();

    void setItems(@Nullable List<DivItemBuilderResult> list);
}
