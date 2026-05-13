package com.yandex.div.storage.database;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ExecutionResult.kt */
/* JADX INFO: loaded from: classes3.dex */
public class ExecutionResult {

    @NotNull
    private final List<StorageException> errors;

    /* JADX WARN: Multi-variable type inference failed */
    public ExecutionResult(@NotNull List<? extends StorageException> list) {
        this.errors = list;
    }

    @NotNull
    public List<StorageException> getErrors() {
        return this.errors;
    }
}
