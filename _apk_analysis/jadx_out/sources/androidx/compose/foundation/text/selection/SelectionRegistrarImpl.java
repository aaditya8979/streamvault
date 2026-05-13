package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import bn.r;
import cn.a0;
import fn.b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.q;
import sn.s;
import tn.p;

/* JADX INFO: compiled from: SelectionRegistrarImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\be\u0010fJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0016J-\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0016J=\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001f\u001a\u00020\u0005H\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0016R\"\u0010!\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010/\u001a\u00060-j\u0002`.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R0\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u0001018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R?\u00109\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0005\u0018\u0001088\u0000@\u0000X\u0080\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R0\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u0001018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u00103\u001a\u0004\b@\u00105\"\u0004\bA\u00107RK\u0010C\u001a(\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001a\u0018\u00010B8\u0000@\u0000X\u0080\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR*\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010I8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR0\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u0001018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u00103\u001a\u0004\bQ\u00105\"\u0004\bR\u00107R0\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u0001018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u00103\u001a\u0004\bT\u00105\"\u0004\bU\u00107RC\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020W0V2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020W0V8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR \u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020V8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bc\u0010\\\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006g"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "Landroidx/compose/foundation/text/selection/Selectable;", "selectable", "subscribe", "Lbn/r;", "unsubscribe", "", "nextSelectableId", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerLayoutCoordinates", "", "sort", "selectableId", "notifyPositionChange", "layoutCoordinates", "Landroidx/compose/ui/geometry/Offset;", "startPosition", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "notifySelectionUpdateStart-d-4ec7I", "(Landroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "notifySelectionUpdateStart", "notifySelectionUpdateSelectAll", "newPosition", "previousPosition", "", "isStartHandle", "notifySelectionUpdate-5iVPX68", "(Landroidx/compose/ui/layout/LayoutCoordinates;JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "notifySelectionUpdate", "notifySelectionUpdateEnd", "notifySelectableChange", "sorted", "Z", "getSorted$foundation_release", "()Z", "setSorted$foundation_release", "(Z)V", "", "_selectables", "Ljava/util/List;", "", "_selectableMap", "Ljava/util/Map;", "Ljava/util/concurrent/atomic/AtomicLong;", "Landroidx/compose/foundation/AtomicLong;", "incrementId", "Ljava/util/concurrent/atomic/AtomicLong;", "Lkotlin/Function1;", "onPositionChangeCallback", "Lsn/l;", "getOnPositionChangeCallback$foundation_release", "()Lsn/l;", "setOnPositionChangeCallback$foundation_release", "(Lsn/l;)V", "Lkotlin/Function3;", "onSelectionUpdateStartCallback", "Lsn/q;", "getOnSelectionUpdateStartCallback$foundation_release", "()Lsn/q;", "setOnSelectionUpdateStartCallback$foundation_release", "(Lsn/q;)V", "onSelectionUpdateSelectAll", "getOnSelectionUpdateSelectAll$foundation_release", "setOnSelectionUpdateSelectAll$foundation_release", "Lkotlin/Function5;", "onSelectionUpdateCallback", "Lsn/s;", "getOnSelectionUpdateCallback$foundation_release", "()Lsn/s;", "setOnSelectionUpdateCallback$foundation_release", "(Lsn/s;)V", "Lkotlin/Function0;", "onSelectionUpdateEndCallback", "Lsn/a;", "getOnSelectionUpdateEndCallback$foundation_release", "()Lsn/a;", "setOnSelectionUpdateEndCallback$foundation_release", "(Lsn/a;)V", "onSelectableChangeCallback", "getOnSelectableChangeCallback$foundation_release", "setOnSelectableChangeCallback$foundation_release", "afterSelectableUnsubscribe", "getAfterSelectableUnsubscribe$foundation_release", "setAfterSelectableUnsubscribe$foundation_release", "", "Landroidx/compose/foundation/text/selection/Selection;", "<set-?>", "subselections$delegate", "Landroidx/compose/runtime/MutableState;", "getSubselections", "()Ljava/util/Map;", "setSubselections", "(Ljava/util/Map;)V", "subselections", "getSelectables$foundation_release", "()Ljava/util/List;", "selectables", "getSelectableMap$foundation_release", "selectableMap", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class SelectionRegistrarImpl implements SelectionRegistrar {

    @Nullable
    private l<? super Long, r> afterSelectableUnsubscribe;

    @Nullable
    private l<? super Long, r> onPositionChangeCallback;

    @Nullable
    private l<? super Long, r> onSelectableChangeCallback;

    @Nullable
    private s<? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> onSelectionUpdateCallback;

    @Nullable
    private sn.a<r> onSelectionUpdateEndCallback;

    @Nullable
    private l<? super Long, r> onSelectionUpdateSelectAll;

    @Nullable
    private q<? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, r> onSelectionUpdateStartCallback;
    private boolean sorted;

    @NotNull
    private final List<Selectable> _selectables = new ArrayList();

    @NotNull
    private final Map<Long, Selectable> _selectableMap = new LinkedHashMap();

    @NotNull
    private AtomicLong incrementId = new AtomicLong(1);

    /* JADX INFO: renamed from: subselections$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState subselections = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(kotlin.collections.a.j(), null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sort$lambda-2, reason: not valid java name */
    public static final int m846sort$lambda2(LayoutCoordinates layoutCoordinates, Selectable selectable, Selectable selectable2) {
        p.k(layoutCoordinates, "$containerLayoutCoordinates");
        p.k(selectable, "a");
        p.k(selectable2, "b");
        LayoutCoordinates layoutCoordinates2 = selectable.getLayoutCoordinates();
        LayoutCoordinates layoutCoordinates3 = selectable2.getLayoutCoordinates();
        long jMo3115localPositionOfR5De75A = layoutCoordinates2 != null ? layoutCoordinates.mo3115localPositionOfR5De75A(layoutCoordinates2, Offset.INSTANCE.m1399getZeroF1C5BW0()) : Offset.INSTANCE.m1399getZeroF1C5BW0();
        long jMo3115localPositionOfR5De75A2 = layoutCoordinates3 != null ? layoutCoordinates.mo3115localPositionOfR5De75A(layoutCoordinates3, Offset.INSTANCE.m1399getZeroF1C5BW0()) : Offset.INSTANCE.m1399getZeroF1C5BW0();
        return (Offset.m1384getYimpl(jMo3115localPositionOfR5De75A) > Offset.m1384getYimpl(jMo3115localPositionOfR5De75A2) ? 1 : (Offset.m1384getYimpl(jMo3115localPositionOfR5De75A) == Offset.m1384getYimpl(jMo3115localPositionOfR5De75A2) ? 0 : -1)) == 0 ? b.d(Float.valueOf(Offset.m1383getXimpl(jMo3115localPositionOfR5De75A)), Float.valueOf(Offset.m1383getXimpl(jMo3115localPositionOfR5De75A2))) : b.d(Float.valueOf(Offset.m1384getYimpl(jMo3115localPositionOfR5De75A)), Float.valueOf(Offset.m1384getYimpl(jMo3115localPositionOfR5De75A2)));
    }

    @Nullable
    public final l<Long, r> getAfterSelectableUnsubscribe$foundation_release() {
        return this.afterSelectableUnsubscribe;
    }

    @Nullable
    public final l<Long, r> getOnPositionChangeCallback$foundation_release() {
        return this.onPositionChangeCallback;
    }

    @Nullable
    public final l<Long, r> getOnSelectableChangeCallback$foundation_release() {
        return this.onSelectableChangeCallback;
    }

    @Nullable
    public final s<LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean> getOnSelectionUpdateCallback$foundation_release() {
        return this.onSelectionUpdateCallback;
    }

    @Nullable
    public final sn.a<r> getOnSelectionUpdateEndCallback$foundation_release() {
        return this.onSelectionUpdateEndCallback;
    }

    @Nullable
    public final l<Long, r> getOnSelectionUpdateSelectAll$foundation_release() {
        return this.onSelectionUpdateSelectAll;
    }

    @Nullable
    public final q<LayoutCoordinates, Offset, SelectionAdjustment, r> getOnSelectionUpdateStartCallback$foundation_release() {
        return this.onSelectionUpdateStartCallback;
    }

    @NotNull
    public final Map<Long, Selectable> getSelectableMap$foundation_release() {
        return this._selectableMap;
    }

    @NotNull
    public final List<Selectable> getSelectables$foundation_release() {
        return this._selectables;
    }

    /* JADX INFO: renamed from: getSorted$foundation_release, reason: from getter */
    public final boolean getSorted() {
        return this.sorted;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    @NotNull
    public Map<Long, Selection> getSubselections() {
        return (Map) this.subselections.getValue();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public long nextSelectableId() {
        long andIncrement = this.incrementId.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.incrementId.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifyPositionChange(long j10) {
        this.sorted = false;
        l<? super Long, r> lVar = this.onPositionChangeCallback;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j10));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectableChange(long j10) {
        l<? super Long, r> lVar = this.onSelectableChangeCallback;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j10));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* JADX INFO: renamed from: notifySelectionUpdate-5iVPX68 */
    public boolean mo844notifySelectionUpdate5iVPX68(@NotNull LayoutCoordinates layoutCoordinates, long newPosition, long previousPosition, boolean isStartHandle, @NotNull SelectionAdjustment adjustment) {
        p.k(layoutCoordinates, "layoutCoordinates");
        p.k(adjustment, "adjustment");
        s<? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> sVar = this.onSelectionUpdateCallback;
        if (sVar != null) {
            return sVar.invoke(layoutCoordinates, Offset.m1372boximpl(newPosition), Offset.m1372boximpl(previousPosition), Boolean.valueOf(isStartHandle), adjustment).booleanValue();
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateEnd() {
        sn.a<r> aVar = this.onSelectionUpdateEndCallback;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateSelectAll(long j10) {
        l<? super Long, r> lVar = this.onSelectionUpdateSelectAll;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j10));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* JADX INFO: renamed from: notifySelectionUpdateStart-d-4ec7I */
    public void mo845notifySelectionUpdateStartd4ec7I(@NotNull LayoutCoordinates layoutCoordinates, long startPosition, @NotNull SelectionAdjustment adjustment) {
        p.k(layoutCoordinates, "layoutCoordinates");
        p.k(adjustment, "adjustment");
        q<? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, r> qVar = this.onSelectionUpdateStartCallback;
        if (qVar != null) {
            qVar.invoke(layoutCoordinates, Offset.m1372boximpl(startPosition), adjustment);
        }
    }

    public final void setAfterSelectableUnsubscribe$foundation_release(@Nullable l<? super Long, r> lVar) {
        this.afterSelectableUnsubscribe = lVar;
    }

    public final void setOnPositionChangeCallback$foundation_release(@Nullable l<? super Long, r> lVar) {
        this.onPositionChangeCallback = lVar;
    }

    public final void setOnSelectableChangeCallback$foundation_release(@Nullable l<? super Long, r> lVar) {
        this.onSelectableChangeCallback = lVar;
    }

    public final void setOnSelectionUpdateCallback$foundation_release(@Nullable s<? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> sVar) {
        this.onSelectionUpdateCallback = sVar;
    }

    public final void setOnSelectionUpdateEndCallback$foundation_release(@Nullable sn.a<r> aVar) {
        this.onSelectionUpdateEndCallback = aVar;
    }

    public final void setOnSelectionUpdateSelectAll$foundation_release(@Nullable l<? super Long, r> lVar) {
        this.onSelectionUpdateSelectAll = lVar;
    }

    public final void setOnSelectionUpdateStartCallback$foundation_release(@Nullable q<? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, r> qVar) {
        this.onSelectionUpdateStartCallback = qVar;
    }

    public final void setSorted$foundation_release(boolean z10) {
        this.sorted = z10;
    }

    public void setSubselections(@NotNull Map<Long, Selection> map) {
        p.k(map, "<set-?>");
        this.subselections.setValue(map);
    }

    @NotNull
    public final List<Selectable> sort(@NotNull final LayoutCoordinates containerLayoutCoordinates) {
        p.k(containerLayoutCoordinates, "containerLayoutCoordinates");
        if (!this.sorted) {
            a0.D(this._selectables, new Comparator() { // from class: androidx.compose.foundation.text.selection.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return SelectionRegistrarImpl.m846sort$lambda2(containerLayoutCoordinates, (Selectable) obj, (Selectable) obj2);
                }
            });
            this.sorted = true;
        }
        return getSelectables$foundation_release();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    @NotNull
    public Selectable subscribe(@NotNull Selectable selectable) {
        p.k(selectable, "selectable");
        if (!(selectable.getSelectableId() != 0)) {
            throw new IllegalArgumentException(("The selectable contains an invalid id: " + selectable.getSelectableId()).toString());
        }
        if (!this._selectableMap.containsKey(Long.valueOf(selectable.getSelectableId()))) {
            this._selectableMap.put(Long.valueOf(selectable.getSelectableId()), selectable);
            this._selectables.add(selectable);
            this.sorted = false;
            return selectable;
        }
        throw new IllegalArgumentException(("Another selectable with the id: " + selectable + ".selectableId has already subscribed.").toString());
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void unsubscribe(@NotNull Selectable selectable) {
        p.k(selectable, "selectable");
        if (this._selectableMap.containsKey(Long.valueOf(selectable.getSelectableId()))) {
            this._selectables.remove(selectable);
            this._selectableMap.remove(Long.valueOf(selectable.getSelectableId()));
            l<? super Long, r> lVar = this.afterSelectableUnsubscribe;
            if (lVar != null) {
                lVar.invoke(Long.valueOf(selectable.getSelectableId()));
            }
        }
    }
}
