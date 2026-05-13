package com.yandex.div.storage;

import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: RawJsonRepositoryResult.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class RawJsonRepositoryRemoveResult {

    @NotNull
    private final List<RawJsonRepositoryException> errors;

    @NotNull
    private final Set<String> ids;

    public RawJsonRepositoryRemoveResult(@NotNull Set<String> set, @NotNull List<RawJsonRepositoryException> list) {
        this.ids = set;
        this.errors = list;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RawJsonRepositoryRemoveResult)) {
            return false;
        }
        RawJsonRepositoryRemoveResult rawJsonRepositoryRemoveResult = (RawJsonRepositoryRemoveResult) obj;
        return p.f(this.ids, rawJsonRepositoryRemoveResult.ids) && p.f(this.errors, rawJsonRepositoryRemoveResult.errors);
    }

    public int hashCode() {
        return (this.ids.hashCode() * 31) + this.errors.hashCode();
    }

    @NotNull
    public String toString() {
        return "RawJsonRepositoryRemoveResult(ids=" + this.ids + ", errors=" + this.errors + ')';
    }
}
