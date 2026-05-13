package com.yandex.div.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CompositeDisposable.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class CompositeDisposableKt {
    public static final void plusAssign(@NotNull CompositeDisposable compositeDisposable, @NotNull Disposable disposable) {
        compositeDisposable.add(disposable);
    }
}
