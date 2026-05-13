package com.yandex.div.internal.parser;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JsonTopologicalSorting.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CyclicDependencyException extends Exception {
    public CyclicDependencyException(@NotNull String str) {
        super(str);
    }
}
