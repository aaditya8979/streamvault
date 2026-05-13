package androidx.compose.runtime.snapshots;

import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\"\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/snapshots/StateObject;", "", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "Lbn/r;", "prependStateRecord", "previous", VideoLookHistoryEntry.CURRNET, "applied", "mergeRecords", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "runtime_release"}, k = 1, mv = {1, 6, 0})
public interface StateObject {

    /* JADX INFO: compiled from: Snapshot.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @Nullable
        public static StateRecord mergeRecords(@NotNull StateObject stateObject, @NotNull StateRecord stateRecord, @NotNull StateRecord stateRecord2, @NotNull StateRecord stateRecord3) {
            p.k(stateRecord, "previous");
            p.k(stateRecord2, VideoLookHistoryEntry.CURRNET);
            p.k(stateRecord3, "applied");
            return StateObject.super.mergeRecords(stateRecord, stateRecord2, stateRecord3);
        }
    }

    @NotNull
    StateRecord getFirstStateRecord();

    @Nullable
    default StateRecord mergeRecords(@NotNull StateRecord previous, @NotNull StateRecord current, @NotNull StateRecord applied) {
        p.k(previous, "previous");
        p.k(current, VideoLookHistoryEntry.CURRNET);
        p.k(applied, "applied");
        return null;
    }

    void prependStateRecord(@NotNull StateRecord stateRecord);
}
