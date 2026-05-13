package com.yandex.div.storage;

import bn.e;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.l;
import tn.p;

/* JADX INFO: compiled from: DivStorageImpl.kt */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class DivStorageImpl$openHelper$1 implements DatabaseOpenHelper.CreateCallback, l {
    public final /* synthetic */ DivStorageImpl $tmp0;

    public DivStorageImpl$openHelper$1(DivStorageImpl divStorageImpl) {
        this.$tmp0 = divStorageImpl;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof DatabaseOpenHelper.CreateCallback) && (obj instanceof l)) {
            return p.f(getFunctionDelegate(), ((l) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // tn.l
    @NotNull
    public final e<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.$tmp0, DivStorageImpl.class, "onCreate", "onCreate(Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.yandex.div.storage.database.DatabaseOpenHelper.CreateCallback
    public final void onCreate(@NotNull DatabaseOpenHelper.Database database) {
        this.$tmp0.onCreate(database);
    }
}
