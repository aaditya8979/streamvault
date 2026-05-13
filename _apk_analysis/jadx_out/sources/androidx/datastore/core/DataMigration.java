package androidx.datastore.core;

import bn.r;
import hn.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DataMigration.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006J\u0013\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/datastore/core/DataMigration;", "T", "", "currentData", "", "shouldMigrate", "(Ljava/lang/Object;Lhn/c;)Ljava/lang/Object;", "migrate", "Lbn/r;", "cleanUp", "(Lhn/c;)Ljava/lang/Object;", "datastore-core"}, k = 1, mv = {1, 5, 1})
public interface DataMigration<T> {
    @Nullable
    Object cleanUp(@NotNull c<? super r> cVar);

    @Nullable
    Object migrate(T t10, @NotNull c<? super T> cVar);

    @Nullable
    Object shouldMigrate(T t10, @NotNull c<? super Boolean> cVar);
}
