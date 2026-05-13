package androidx.compose.foundation.lazy;

import androidx.compose.ui.unit.IntOffset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyListItemPlacementAnimator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R%\u0010\b\u001a\u00020\tX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/ItemInfo;", "", "index", "", "(I)V", "getIndex", "()I", "setIndex", "notAnimatableDelta", "Landroidx/compose/ui/unit/IntOffset;", "getNotAnimatableDelta-nOcc-ac", "()J", "setNotAnimatableDelta--gyyYBs", "(J)V", "J", "placeables", "", "Landroidx/compose/foundation/lazy/PlaceableInfo;", "getPlaceables", "()Ljava/util/List;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class ItemInfo {
    private int index;
    private long notAnimatableDelta = IntOffset.INSTANCE.m3954getZeronOccac();

    @NotNull
    private final List<PlaceableInfo> placeables = new ArrayList();

    public ItemInfo(int i10) {
        this.index = i10;
    }

    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: getNotAnimatableDelta-nOcc-ac, reason: not valid java name and from getter */
    public final long getNotAnimatableDelta() {
        return this.notAnimatableDelta;
    }

    @NotNull
    public final List<PlaceableInfo> getPlaceables() {
        return this.placeables;
    }

    public final void setIndex(int i10) {
        this.index = i10;
    }

    /* JADX INFO: renamed from: setNotAnimatableDelta--gyyYBs, reason: not valid java name */
    public final void m513setNotAnimatableDeltagyyYBs(long j10) {
        this.notAnimatableDelta = j10;
    }
}
