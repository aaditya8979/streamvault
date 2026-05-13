package com.yandex.div.storage;

import androidx.annotation.UiThread;
import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: RawJsonRepository.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface RawJsonRepository {

    /* JADX INFO: compiled from: RawJsonRepository.kt */
    public static final class Payload {

        @NotNull
        private final DivDataRepository.ActionOnError actionOnError;

        @NotNull
        private final List<RawJson> jsons;

        /* JADX WARN: Multi-variable type inference failed */
        public Payload(@NotNull List<? extends RawJson> list, @NotNull DivDataRepository.ActionOnError actionOnError) {
            this.jsons = list;
            this.actionOnError = actionOnError;
        }

        public /* synthetic */ Payload(List list, DivDataRepository.ActionOnError actionOnError, int i10, i iVar) {
            this(list, (i10 & 2) != 0 ? DivDataRepository.ActionOnError.ABORT_TRANSACTION : actionOnError);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj;
            return p.f(this.jsons, payload.jsons) && this.actionOnError == payload.actionOnError;
        }

        @NotNull
        public final DivDataRepository.ActionOnError getActionOnError() {
            return this.actionOnError;
        }

        @NotNull
        public final List<RawJson> getJsons() {
            return this.jsons;
        }

        public int hashCode() {
            return (this.jsons.hashCode() * 31) + this.actionOnError.hashCode();
        }

        @NotNull
        public String toString() {
            return "Payload(jsons=" + this.jsons + ", actionOnError=" + this.actionOnError + ')';
        }
    }

    @UiThread
    @NotNull
    RawJsonRepositoryResult get(@NotNull List<String> list);

    @UiThread
    @NotNull
    RawJsonRepositoryResult put(@NotNull Payload payload);

    @UiThread
    @NotNull
    RawJsonRepositoryRemoveResult remove(@NotNull l<? super RawJson, Boolean> lVar);
}
