package com.yandex.div.core.view2.logging.bind;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SimpleRebindReporter.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface SimpleRebindReporter extends ForceRebindReporter {
    default void onSimpleRebindException(@NotNull Exception exc) {
    }

    default void onSimpleRebindFatalNoState() {
    }

    default void onSimpleRebindNoChild() {
    }

    default void onSimpleRebindSuccess() {
    }
}
