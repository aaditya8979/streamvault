package com.yandex.div.storage;

import androidx.annotation.AnyThread;
import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.database.ExecutionResult;
import com.yandex.div.storage.database.StorageException;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: DivStorage.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface DivStorage {

    /* JADX INFO: compiled from: DivStorage.kt */
    public static class LoadDataResult<T> {

        @NotNull
        private final List<StorageException> errors;

        @NotNull
        private final List<T> restoredData;

        /* JADX WARN: Multi-variable type inference failed */
        public LoadDataResult(@NotNull List<? extends T> list, @NotNull List<? extends StorageException> list2) {
            this.restoredData = list;
            this.errors = list2;
        }

        @NotNull
        public final List<T> component1() {
            return getRestoredData();
        }

        @NotNull
        public final List<StorageException> component2() {
            return getErrors();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadDataResult)) {
                return false;
            }
            LoadDataResult loadDataResult = (LoadDataResult) obj;
            return p.f(getRestoredData(), loadDataResult.getRestoredData()) && p.f(getErrors(), loadDataResult.getErrors());
        }

        @NotNull
        public List<StorageException> getErrors() {
            return this.errors;
        }

        @NotNull
        public List<T> getRestoredData() {
            return this.restoredData;
        }

        public int hashCode() {
            return (getRestoredData().hashCode() * 31) + getErrors().hashCode();
        }

        @NotNull
        public String toString() {
            return "LoadDataResult(restoredData=" + getRestoredData() + ", errors=" + getErrors() + ')';
        }
    }

    /* JADX INFO: compiled from: DivStorage.kt */
    public static final class RemoveResult {

        @NotNull
        private final List<StorageException> errors;

        @NotNull
        private final Set<String> ids;

        /* JADX WARN: Multi-variable type inference failed */
        public RemoveResult(@NotNull Set<String> set, @NotNull List<? extends StorageException> list) {
            this.ids = set;
            this.errors = list;
        }

        @NotNull
        public final Set<String> component1() {
            return this.ids;
        }

        @NotNull
        public final List<StorageException> component2() {
            return this.errors;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoveResult)) {
                return false;
            }
            RemoveResult removeResult = (RemoveResult) obj;
            return p.f(this.ids, removeResult.ids) && p.f(this.errors, removeResult.errors);
        }

        public int hashCode() {
            return (this.ids.hashCode() * 31) + this.errors.hashCode();
        }

        @NotNull
        public String toString() {
            return "RemoveResult(ids=" + this.ids + ", errors=" + this.errors + ')';
        }
    }

    @AnyThread
    @NotNull
    LoadDataResult<RawJson> readRawJsons(@NotNull Set<String> set);

    @AnyThread
    @NotNull
    RemoveResult removeRawJsons(@NotNull l<? super RawJson, Boolean> lVar);

    @AnyThread
    @NotNull
    ExecutionResult saveRawJsons(@NotNull List<? extends RawJson> list, @NotNull DivDataRepository.ActionOnError actionOnError);
}
