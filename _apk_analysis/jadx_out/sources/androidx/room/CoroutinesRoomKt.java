package androidx.room;

import androidx.annotation.RestrictTo;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p000do.h0;
import p000do.l1;

/* JADX INFO: compiled from: CoroutinesRoom.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/room/RoomDatabase;", "Ldo/h0;", "getQueryDispatcher", "getTransactionDispatcher", "(Landroidx/room/RoomDatabase;)Ldo/h0;", "transactionDispatcher", "room-ktx_release"}, k = 2, mv = {1, 7, 1})
public final class CoroutinesRoomKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final h0 getQueryDispatcher(@NotNull RoomDatabase roomDatabase) {
        tn.p.k(roomDatabase, "<this>");
        Map<String, Object> backingFieldMap = roomDatabase.getBackingFieldMap();
        Object objB = backingFieldMap.get("QueryDispatcher");
        if (objB == null) {
            objB = l1.b(roomDatabase.getQueryExecutor());
            backingFieldMap.put("QueryDispatcher", objB);
        }
        tn.p.i(objB, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (h0) objB;
    }

    @NotNull
    public static final h0 getTransactionDispatcher(@NotNull RoomDatabase roomDatabase) {
        tn.p.k(roomDatabase, "<this>");
        Map<String, Object> backingFieldMap = roomDatabase.getBackingFieldMap();
        Object objB = backingFieldMap.get("TransactionDispatcher");
        if (objB == null) {
            objB = l1.b(roomDatabase.getTransactionExecutor());
            backingFieldMap.put("TransactionDispatcher", objB);
        }
        tn.p.i(objB, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (h0) objB;
    }
}
