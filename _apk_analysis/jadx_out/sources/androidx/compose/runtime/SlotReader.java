package androidx.compose.runtime;

import bn.r;
import com.ironsource.G5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b'\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b^\u0010_J\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001d\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u001bJ\u0006\u0010\u001f\u001a\u00020\u001bJ\u0006\u0010 \u001a\u00020\u001bJ\u0006\u0010!\u001a\u00020\u0003J\u0006\u0010\"\u001a\u00020\u001bJ\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010$\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010%\u001a\u00020\u001bJ\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&J3\u0010-\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00032\u001a\u0010*\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u001b0)H\u0000¢\u0006\u0004\b+\u0010,J\b\u0010/\u001a\u00020.H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u0003R\u001a\u00101\u001a\u0002008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00108R$\u0010>\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b>\u00108\u001a\u0004\b?\u0010@R$\u0010A\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bA\u00108\u001a\u0004\bB\u0010@R$\u0010\b\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\bC\u0010@R\u0016\u0010D\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00108R\u0016\u0010E\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00108R\u0016\u0010F\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00108R\u0011\u0010H\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bG\u0010@R\u0011\u0010J\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bI\u0010@R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010KR\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bL\u0010@R\u0011\u0010M\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bM\u0010KR\u0011\u0010O\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bN\u0010KR\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bP\u0010@R\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bQ\u0010@R\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bR\u0010@R\u0011\u0010T\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bS\u0010@R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bW\u0010VR\u0013\u0010Y\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bX\u0010VR\u0011\u0010[\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bZ\u0010@R\u0011\u0010]\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\\\u0010@¨\u0006`"}, d2 = {"Landroidx/compose/runtime/SlotReader;", "", "", "", "index", "node", "aux", "objectKey", "parent", "", "isNode", "nodeCount", "groupSize", "groupEnd", "groupKey", "hasObjectKey", "groupObjectKey", "groupAux", "Landroidx/compose/runtime/Anchor;", "anchor", "hasMark", "containsMark", "parentOf", "get", "groupGet", "group", "next", "Lbn/r;", "beginEmpty", "endEmpty", "close", "startGroup", "startNode", "skipGroup", "skipToGroupEnd", "reposition", "restoreParent", "endGroup", "", "Landroidx/compose/runtime/KeyInfo;", "extractKeys", "Lkotlin/Function2;", "block", "forEachData$runtime_release", "(ILsn/p;)V", "forEachData", "", "toString", "Landroidx/compose/runtime/SlotTable;", G5.Q, "Landroidx/compose/runtime/SlotTable;", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "groups", "[I", "groupsSize", "I", "", "slots", "[Ljava/lang/Object;", "slotsSize", "<set-?>", "currentGroup", "getCurrentGroup", "()I", "currentEnd", "getCurrentEnd", "getParent", "emptyCount", "currentSlot", "currentSlotEnd", "getSize", "size", "getSlot", "slot", "()Z", "getNodeCount", "isGroupEnd", "getInEmpty", "inEmpty", "getGroupSize", "getGroupEnd", "getGroupKey", "getGroupSlotIndex", "groupSlotIndex", "getGroupObjectKey", "()Ljava/lang/Object;", "getGroupAux", "getGroupNode", "groupNode", "getParentNodes", "parentNodes", "getGroupSlotCount", "groupSlotCount", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class SlotReader {

    /* JADX INFO: renamed from: currentEnd, reason: from kotlin metadata and from toString */
    private int end;

    /* JADX INFO: renamed from: currentGroup, reason: from kotlin metadata and from toString */
    private int current;
    private int currentSlot;
    private int currentSlotEnd;
    private int emptyCount;

    @NotNull
    private final int[] groups;
    private final int groupsSize;
    private int parent;

    @NotNull
    private final Object[] slots;
    private final int slotsSize;

    @NotNull
    private final SlotTable table;

    public SlotReader(@NotNull SlotTable slotTable) {
        p.k(slotTable, G5.Q);
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        int groupsSize = slotTable.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = slotTable.getSlots();
        this.slotsSize = slotTable.getSlotsSize();
        this.end = groupsSize;
        this.parent = -1;
    }

    public static /* synthetic */ Anchor anchor$default(SlotReader slotReader, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = slotReader.current;
        }
        return slotReader.anchor(i10);
    }

    private final Object aux(int[] iArr, int i10) {
        return SlotTableKt.hasAux(iArr, i10) ? this.slots[SlotTableKt.auxIndex(iArr, i10)] : Composer.INSTANCE.getEmpty();
    }

    private final Object node(int[] iArr, int i10) {
        return SlotTableKt.isNode(iArr, i10) ? this.slots[SlotTableKt.nodeIndex(iArr, i10)] : Composer.INSTANCE.getEmpty();
    }

    private final Object objectKey(int[] iArr, int i10) {
        if (SlotTableKt.hasObjectKey(iArr, i10)) {
            return this.slots[SlotTableKt.objectKeyIndex(iArr, i10)];
        }
        return null;
    }

    @NotNull
    public final Anchor anchor(int index) {
        ArrayList<Anchor> anchors$runtime_release = this.table.getAnchors$runtime_release();
        int iSearch = SlotTableKt.search(anchors$runtime_release, index, this.groupsSize);
        if (iSearch < 0) {
            Anchor anchor = new Anchor(index);
            anchors$runtime_release.add(-(iSearch + 1), anchor);
            return anchor;
        }
        Anchor anchor2 = anchors$runtime_release.get(iSearch);
        p.j(anchor2, "get(location)");
        return anchor2;
    }

    public final void beginEmpty() {
        this.emptyCount++;
    }

    public final void close() {
        this.table.close$runtime_release(this);
    }

    public final boolean containsMark(int index) {
        return SlotTableKt.containsMark(this.groups, index);
    }

    public final void endEmpty() {
        int i10 = this.emptyCount;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
        }
        this.emptyCount = i10 - 1;
    }

    public final void endGroup() {
        if (this.emptyCount == 0) {
            if (!(this.current == this.end)) {
                throw new IllegalArgumentException("endGroup() not called at the end of a group".toString());
            }
            int iParentAnchor = SlotTableKt.parentAnchor(this.groups, this.parent);
            this.parent = iParentAnchor;
            this.end = iParentAnchor < 0 ? this.groupsSize : iParentAnchor + SlotTableKt.groupSize(this.groups, iParentAnchor);
        }
    }

    @NotNull
    public final List<KeyInfo> extractKeys() {
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount > 0) {
            return arrayList;
        }
        int iGroupSize = this.current;
        int i10 = 0;
        while (iGroupSize < this.end) {
            arrayList.add(new KeyInfo(SlotTableKt.key(this.groups, iGroupSize), objectKey(this.groups, iGroupSize), iGroupSize, SlotTableKt.isNode(this.groups, iGroupSize) ? 1 : SlotTableKt.nodeCount(this.groups, iGroupSize), i10));
            iGroupSize += SlotTableKt.groupSize(this.groups, iGroupSize);
            i10++;
        }
        return arrayList;
    }

    public final void forEachData$runtime_release(int group, @NotNull sn.p<? super Integer, Object, r> block) {
        p.k(block, "block");
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, group);
        int i10 = group + 1;
        int iDataAnchor = i10 < this.table.getGroupsSize() ? SlotTableKt.dataAnchor(this.table.getGroups(), i10) : this.table.getSlotsSize();
        for (int i11 = iSlotAnchor; i11 < iDataAnchor; i11++) {
            block.mo2invoke(Integer.valueOf(i11 - iSlotAnchor), this.slots[i11]);
        }
    }

    @Nullable
    public final Object get(int index) {
        int i10 = this.currentSlot + index;
        return i10 < this.currentSlotEnd ? this.slots[i10] : Composer.INSTANCE.getEmpty();
    }

    /* JADX INFO: renamed from: getCurrentEnd, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: getCurrentGroup, reason: from getter */
    public final int getCurrent() {
        return this.current;
    }

    @Nullable
    public final Object getGroupAux() {
        int i10 = this.current;
        if (i10 < this.end) {
            return aux(this.groups, i10);
        }
        return 0;
    }

    public final int getGroupEnd() {
        return this.end;
    }

    public final int getGroupKey() {
        int i10 = this.current;
        if (i10 < this.end) {
            return SlotTableKt.key(this.groups, i10);
        }
        return 0;
    }

    @Nullable
    public final Object getGroupNode() {
        int i10 = this.current;
        if (i10 < this.end) {
            return node(this.groups, i10);
        }
        return null;
    }

    @Nullable
    public final Object getGroupObjectKey() {
        int i10 = this.current;
        if (i10 < this.end) {
            return objectKey(this.groups, i10);
        }
        return null;
    }

    public final int getGroupSize() {
        return SlotTableKt.groupSize(this.groups, this.current);
    }

    public final int getGroupSlotCount() {
        int i10 = this.current;
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i10);
        int i11 = i10 + 1;
        return (i11 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i11) : this.slotsSize) - iSlotAnchor;
    }

    public final int getGroupSlotIndex() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    public final boolean getInEmpty() {
        return this.emptyCount > 0;
    }

    public final int getNodeCount() {
        return SlotTableKt.nodeCount(this.groups, this.current);
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getParentNodes() {
        int i10 = this.parent;
        if (i10 >= 0) {
            return SlotTableKt.nodeCount(this.groups, i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final int getSlot() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    @NotNull
    /* JADX INFO: renamed from: getTable$runtime_release, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    @Nullable
    public final Object groupAux(int index) {
        return aux(this.groups, index);
    }

    public final int groupEnd(int index) {
        return index + SlotTableKt.groupSize(this.groups, index);
    }

    @Nullable
    public final Object groupGet(int index) {
        return groupGet(this.current, index);
    }

    @Nullable
    public final Object groupGet(int group, int index) {
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, group);
        int i10 = group + 1;
        int i11 = iSlotAnchor + index;
        return i11 < (i10 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i10) : this.slotsSize) ? this.slots[i11] : Composer.INSTANCE.getEmpty();
    }

    public final int groupKey(int index) {
        return SlotTableKt.key(this.groups, index);
    }

    public final int groupKey(@NotNull Anchor anchor) {
        p.k(anchor, "anchor");
        if (anchor.getValid()) {
            return SlotTableKt.key(this.groups, this.table.anchorIndex(anchor));
        }
        return 0;
    }

    @Nullable
    public final Object groupObjectKey(int index) {
        return objectKey(this.groups, index);
    }

    public final int groupSize(int index) {
        return SlotTableKt.groupSize(this.groups, index);
    }

    public final boolean hasMark(int index) {
        return SlotTableKt.hasMark(this.groups, index);
    }

    public final boolean hasObjectKey(int index) {
        return SlotTableKt.hasObjectKey(this.groups, index);
    }

    public final boolean isGroupEnd() {
        return getInEmpty() || this.current == this.end;
    }

    public final boolean isNode() {
        return SlotTableKt.isNode(this.groups, this.current);
    }

    public final boolean isNode(int index) {
        return SlotTableKt.isNode(this.groups, index);
    }

    @Nullable
    public final Object next() {
        int i10;
        if (this.emptyCount > 0 || (i10 = this.currentSlot) >= this.currentSlotEnd) {
            return Composer.INSTANCE.getEmpty();
        }
        Object[] objArr = this.slots;
        this.currentSlot = i10 + 1;
        return objArr[i10];
    }

    @Nullable
    public final Object node(int index) {
        if (SlotTableKt.isNode(this.groups, index)) {
            return node(this.groups, index);
        }
        return null;
    }

    public final int nodeCount(int index) {
        return SlotTableKt.nodeCount(this.groups, index);
    }

    public final int parent(int index) {
        return SlotTableKt.parentAnchor(this.groups, index);
    }

    public final int parentOf(int index) {
        if (index >= 0 && index < this.groupsSize) {
            return SlotTableKt.parentAnchor(this.groups, index);
        }
        throw new IllegalArgumentException(("Invalid group index " + index).toString());
    }

    public final void reposition(int i10) {
        if (!(this.emptyCount == 0)) {
            throw new IllegalArgumentException("Cannot reposition while in an empty region".toString());
        }
        this.current = i10;
        int iParentAnchor = i10 < this.groupsSize ? SlotTableKt.parentAnchor(this.groups, i10) : -1;
        this.parent = iParentAnchor;
        if (iParentAnchor < 0) {
            this.end = this.groupsSize;
        } else {
            this.end = iParentAnchor + SlotTableKt.groupSize(this.groups, iParentAnchor);
        }
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void restoreParent(int i10) {
        int iGroupSize = SlotTableKt.groupSize(this.groups, i10) + i10;
        int i11 = this.current;
        if (i11 >= i10 && i11 <= iGroupSize) {
            this.parent = i10;
            this.end = iGroupSize;
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            return;
        }
        throw new IllegalArgumentException(("Index " + i10 + " is not a parent of " + i11).toString());
    }

    public final int skipGroup() {
        if (!(this.emptyCount == 0)) {
            throw new IllegalArgumentException("Cannot skip while in an empty region".toString());
        }
        int iNodeCount = SlotTableKt.isNode(this.groups, this.current) ? 1 : SlotTableKt.nodeCount(this.groups, this.current);
        int i10 = this.current;
        this.current = i10 + SlotTableKt.groupSize(this.groups, i10);
        return iNodeCount;
    }

    public final void skipToGroupEnd() {
        if (!(this.emptyCount == 0)) {
            throw new IllegalArgumentException("Cannot skip the enclosing group while in an empty region".toString());
        }
        this.current = this.end;
    }

    public final void startGroup() {
        if (this.emptyCount <= 0) {
            if (!(SlotTableKt.parentAnchor(this.groups, this.current) == this.parent)) {
                throw new IllegalArgumentException("Invalid slot table detected".toString());
            }
            int i10 = this.current;
            this.parent = i10;
            this.end = i10 + SlotTableKt.groupSize(this.groups, i10);
            int i11 = this.current;
            int i12 = i11 + 1;
            this.current = i12;
            this.currentSlot = SlotTableKt.slotAnchor(this.groups, i11);
            this.currentSlotEnd = i11 >= this.groupsSize - 1 ? this.slotsSize : SlotTableKt.dataAnchor(this.groups, i12);
        }
    }

    public final void startNode() {
        if (this.emptyCount <= 0) {
            if (!SlotTableKt.isNode(this.groups, this.current)) {
                throw new IllegalArgumentException("Expected a node group".toString());
            }
            startGroup();
        }
    }

    @NotNull
    public String toString() {
        return "SlotReader(current=" + this.current + ", key=" + getGroupKey() + ", parent=" + this.parent + ", end=" + this.end + ')';
    }
}
