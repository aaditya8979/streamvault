package com.yandex.div.storage;

import com.yandex.div.storage.database.StorageException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RawJsonRepositoryException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class RawJsonRepositoryException extends Exception {

    @Nullable
    private final String jsonId;

    public RawJsonRepositoryException(@NotNull StorageException storageException) {
        super(storageException.getMessage(), storageException);
        this.jsonId = storageException.getCardId();
    }

    @Nullable
    public final String getJsonId() {
        return this.jsonId;
    }
}
