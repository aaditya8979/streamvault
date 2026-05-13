package com.yandex.div.storage;

import cn.f0;
import cn.w;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: RawJsonRepositoryResult.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class RawJsonRepositoryResult {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final RawJsonRepositoryResult EMPTY = new RawJsonRepositoryResult(w.m(), w.m());

    @NotNull
    private final List<RawJsonRepositoryException> errors;

    @NotNull
    private final List<RawJson> resultData;

    /* JADX INFO: compiled from: RawJsonRepositoryResult.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final RawJsonRepositoryResult getEMPTY() {
            return RawJsonRepositoryResult.EMPTY;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RawJsonRepositoryResult(@NotNull List<? extends RawJson> list, @NotNull List<RawJsonRepositoryException> list2) {
        this.resultData = list;
        this.errors = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RawJsonRepositoryResult copy$default(RawJsonRepositoryResult rawJsonRepositoryResult, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = rawJsonRepositoryResult.resultData;
        }
        if ((i10 & 2) != 0) {
            list2 = rawJsonRepositoryResult.errors;
        }
        return rawJsonRepositoryResult.copy(list, list2);
    }

    @NotNull
    public final RawJsonRepositoryResult addData(@NotNull Collection<? extends RawJson> collection) {
        return copy$default(this, f0.O0(this.resultData, collection), null, 2, null);
    }

    @NotNull
    public final RawJsonRepositoryResult copy(@NotNull List<? extends RawJson> list, @NotNull List<RawJsonRepositoryException> list2) {
        return new RawJsonRepositoryResult(list, list2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RawJsonRepositoryResult)) {
            return false;
        }
        RawJsonRepositoryResult rawJsonRepositoryResult = (RawJsonRepositoryResult) obj;
        return p.f(this.resultData, rawJsonRepositoryResult.resultData) && p.f(this.errors, rawJsonRepositoryResult.errors);
    }

    @NotNull
    public final List<RawJsonRepositoryException> getErrors() {
        return this.errors;
    }

    @NotNull
    public final List<RawJson> getResultData() {
        return this.resultData;
    }

    public int hashCode() {
        return (this.resultData.hashCode() * 31) + this.errors.hashCode();
    }

    @NotNull
    public String toString() {
        return "RawJsonRepositoryResult(resultData=" + this.resultData + ", errors=" + this.errors + ')';
    }
}
