package com.yandex.div.core.view2.reuse;

import com.yandex.div.core.view2.logging.bind.ForceRebindReporter;
import com.yandex.div.core.view2.reuse.RebindTask;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ComplexRebindReporter.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface ComplexRebindReporter extends ForceRebindReporter {
    default void onComplexRebindFatalNoState() {
    }

    default void onComplexRebindNoDivInState() {
    }

    default void onComplexRebindNoExistingParent() {
    }

    default void onComplexRebindNothingToBind() {
    }

    default void onComplexRebindSuccess() {
    }

    default void onComplexRebindUnsupportedElementException(@NotNull RebindTask.UnsupportedElementException unsupportedElementException) {
    }
}
