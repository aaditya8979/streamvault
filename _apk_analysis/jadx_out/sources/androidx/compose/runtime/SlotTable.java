package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bn.r;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C3978d4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.n;
import tn.p;
import un.a;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b \b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b`\u0010aJ\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\u000e\u001a\u00020\u0004*\u00060\nj\u0002`\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0002J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0002J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0002J-\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00028\u00000\u0016H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00028\u00000\u0016H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ\u0006\u0010\u001d\u001a\u00020\u0017J\u0006\u0010\u001e\u001a\u00020\u001bJ\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010\"\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fJ\u0016\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fJ\u0017\u0010)\u001a\u00020&2\u0006\u0010%\u001a\u00020\u0017H\u0000¢\u0006\u0004\b'\u0010(JW\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u00042\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.2\u0006\u00101\u001a\u00020\u00042\u0016\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u001f02j\b\u0012\u0004\u0012\u00020\u001f`3H\u0000¢\u0006\u0004\b'\u00105JO\u00108\u001a\u00020&2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u00042\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.2\u0006\u00101\u001a\u00020\u00042\u0016\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u001f02j\b\u0012\u0004\u0012\u00020\u001f`3H\u0000¢\u0006\u0004\b6\u00107J\u001f\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f2\u0006\u00109\u001a\u00020\u0004H\u0000¢\u0006\u0004\b:\u0010;J\u0006\u0010=\u001a\u00020&J\u0006\u0010?\u001a\u00020>J\u001f\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b@\u0010;J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00030BH\u0096\u0002R$\u0010,\u001a\u00020+2\u0006\u0010D\u001a\u00020+8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010E\u001a\u0004\bF\u0010GR$\u0010-\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010H\u001a\u0004\bI\u0010JR4\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.2\u000e\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u0010K\u001a\u0004\bL\u0010MR$\u00101\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u0010H\u001a\u0004\bN\u0010JR\u0016\u0010O\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010HR$\u0010*\u001a\u00020\b2\u0006\u0010D\u001a\u00020\b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b*\u0010P\u001a\u0004\bQ\u0010RR\"\u0010S\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010H\u001a\u0004\bT\u0010J\"\u0004\bU\u0010VR2\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u001f02j\b\u0012\u0004\u0012\u00020\u001f`38\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010RR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006b"}, d2 = {"Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "", "group", "Landroidx/compose/runtime/RecomposeScopeImpl;", "findEffectiveRecomposeScope", "", "invalidateGroup", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "index", AppLovinEventTypes.USER_COMPLETED_LEVEL, "emitGroup", "", "keys", "nodes", "parentIndexes", "dataIndexes", "groupSizes", "T", "Lkotlin/Function1;", "Landroidx/compose/runtime/SlotReader;", "block", "read", "(Lsn/l;)Ljava/lang/Object;", "Landroidx/compose/runtime/SlotWriter;", "write", "openReader", "openWriter", "Landroidx/compose/runtime/Anchor;", "anchor", "anchorIndex", "ownsAnchor", "groupIndex", "groupContainsAnchor", "reader", "Lbn/r;", "close$runtime_release", "(Landroidx/compose/runtime/SlotReader;)V", "close", "writer", "", "groups", "groupsSize", "", "", "slots", "slotsSize", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "(Landroidx/compose/runtime/SlotWriter;[II[Ljava/lang/Object;ILjava/util/ArrayList;)V", "setTo$runtime_release", "([II[Ljava/lang/Object;ILjava/util/ArrayList;)V", "setTo", TypedValues.AttributesType.S_TARGET, "invalidateGroupsWithKey$runtime_release", "(I)Ljava/util/List;", "invalidateGroupsWithKey", "verifyWellFormed", "", "asString", "slotsOf$runtime_release", "slotsOf", "", "iterator", "<set-?>", "[I", "getGroups", "()[I", "I", "getGroupsSize", "()I", "[Ljava/lang/Object;", "getSlots", "()[Ljava/lang/Object;", "getSlotsSize", "readers", "Z", "getWriter$runtime_release", "()Z", "version", "getVersion$runtime_release", "setVersion$runtime_release", "(I)V", "Ljava/util/ArrayList;", "getAnchors$runtime_release", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "isEmpty", "getCompositionGroups", "()Ljava/lang/Iterable;", "compositionGroups", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, a {
    private int groupsSize;
    private int readers;
    private int slotsSize;
    private int version;
    private boolean writer;

    @NotNull
    private int[] groups = new int[0];

    @NotNull
    private Object[] slots = new Object[0];

    @NotNull
    private ArrayList<Anchor> anchors = new ArrayList<>();

    private final List<Integer> dataIndexes() {
        return SlotTableKt.dataAnchors(this.groups, this.groupsSize * 5);
    }

    private final int emitGroup(StringBuilder sb2, int i10, int i11) {
        boolean z10 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(' ');
        }
        sb2.append("Group(");
        sb2.append(i10);
        sb2.append(") key=");
        sb2.append(SlotTableKt.key(this.groups, i10));
        int iGroupSize = SlotTableKt.groupSize(this.groups, i10);
        sb2.append(", nodes=");
        sb2.append(SlotTableKt.nodeCount(this.groups, i10));
        sb2.append(", size=");
        sb2.append(iGroupSize);
        if (SlotTableKt.hasMark(this.groups, i10)) {
            sb2.append(", mark");
        }
        if (SlotTableKt.containsMark(this.groups, i10)) {
            sb2.append(", contains mark");
        }
        int iEmitGroup$dataIndex = emitGroup$dataIndex(this, i10);
        int iEmitGroup = i10 + 1;
        int iEmitGroup$dataIndex2 = emitGroup$dataIndex(this, iEmitGroup);
        if (iEmitGroup$dataIndex >= 0 && iEmitGroup$dataIndex <= iEmitGroup$dataIndex2) {
            z10 = true;
        }
        if (!z10 || iEmitGroup$dataIndex2 > this.slotsSize) {
            sb2.append(", *invalid data offsets " + iEmitGroup$dataIndex + '-' + iEmitGroup$dataIndex2 + '*');
        } else {
            if (SlotTableKt.hasObjectKey(this.groups, i10)) {
                sb2.append(" objectKey=" + this.slots[SlotTableKt.objectKeyIndex(this.groups, i10)]);
            }
            if (SlotTableKt.isNode(this.groups, i10)) {
                sb2.append(" node=" + this.slots[SlotTableKt.nodeIndex(this.groups, i10)]);
            }
            if (SlotTableKt.hasAux(this.groups, i10)) {
                sb2.append(" aux=" + this.slots[SlotTableKt.auxIndex(this.groups, i10)]);
            }
            int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i10);
            if (iSlotAnchor < iEmitGroup$dataIndex2) {
                sb2.append(", slots=[");
                sb2.append(iSlotAnchor);
                sb2.append(": ");
                for (int i13 = iSlotAnchor; i13 < iEmitGroup$dataIndex2; i13++) {
                    if (i13 != iSlotAnchor) {
                        sb2.append(", ");
                    }
                    sb2.append(String.valueOf(this.slots[i13]));
                }
                sb2.append(C3978d4.j.f31385e);
            }
        }
        sb2.append('\n');
        int i14 = i10 + iGroupSize;
        while (iEmitGroup < i14) {
            iEmitGroup += emitGroup(sb2, iEmitGroup, i11 + 1);
        }
        return iGroupSize;
    }

    private static final int emitGroup$dataIndex(SlotTable slotTable, int i10) {
        return i10 >= slotTable.groupsSize ? slotTable.slotsSize : SlotTableKt.dataAnchor(slotTable.groups, i10);
    }

    private final RecomposeScopeImpl findEffectiveRecomposeScope(int group) {
        while (group > 0) {
            for (Object obj : new DataIterator(this, group)) {
                if (obj instanceof RecomposeScopeImpl) {
                    return (RecomposeScopeImpl) obj;
                }
            }
            group = SlotTableKt.parentAnchor(this.groups, group);
        }
        return null;
    }

    private final List<Integer> groupSizes() {
        return SlotTableKt.groupSizes(this.groups, this.groupsSize * 5);
    }

    private final boolean invalidateGroup(int group) {
        while (group >= 0) {
            for (Object obj : new DataIterator(this, group)) {
                if (obj instanceof RecomposeScopeImpl) {
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                    recomposeScopeImpl.setRequiresRecompose(true);
                    return recomposeScopeImpl.invalidateForResult(null) != InvalidationResult.IGNORED;
                }
            }
            group = SlotTableKt.parentAnchor(this.groups, group);
        }
        return false;
    }

    /* JADX INFO: renamed from: invalidateGroupsWithKey$lambda-14$scanGroup, reason: not valid java name */
    private static final void m1272invalidateGroupsWithKey$lambda14$scanGroup(SlotReader slotReader, int i10, List<Anchor> list, Ref$BooleanRef ref$BooleanRef, SlotTable slotTable, List<RecomposeScopeImpl> list2) {
        if (slotReader.getGroupKey() != i10) {
            slotReader.startGroup();
            while (!slotReader.isGroupEnd()) {
                m1272invalidateGroupsWithKey$lambda14$scanGroup(slotReader, i10, list, ref$BooleanRef, slotTable, list2);
            }
            slotReader.endGroup();
            return;
        }
        list.add(SlotReader.anchor$default(slotReader, 0, 1, null));
        if (ref$BooleanRef.element) {
            RecomposeScopeImpl recomposeScopeImplFindEffectiveRecomposeScope = slotTable.findEffectiveRecomposeScope(slotReader.getCurrent());
            if (recomposeScopeImplFindEffectiveRecomposeScope != null) {
                list2.add(recomposeScopeImplFindEffectiveRecomposeScope);
            } else {
                ref$BooleanRef.element = false;
                list2.clear();
            }
        }
        slotReader.skipGroup();
    }

    private final List<Integer> keys() {
        return SlotTableKt.keys(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> nodes() {
        return SlotTableKt.nodeCounts(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> parentIndexes() {
        return SlotTableKt.parentAnchors(this.groups, this.groupsSize * 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    private static final int verifyWellFormed$validateGroup(Ref$IntRef ref$IntRef, SlotTable slotTable, int i10, int i11) {
        int i12 = ref$IntRef.element;
        int i13 = i12 + 1;
        ref$IntRef.element = i13;
        int iParentAnchor = SlotTableKt.parentAnchor(slotTable.groups, i12);
        if ((iParentAnchor == i10) != true) {
            throw new IllegalStateException(("Invalid parent index detected at " + i12 + ", expected parent index to be " + i10 + " found " + iParentAnchor).toString());
        }
        int iGroupSize = SlotTableKt.groupSize(slotTable.groups, i12) + i12;
        if ((iGroupSize <= slotTable.groupsSize) != true) {
            throw new IllegalStateException(("A group extends past the end of the table at " + i12).toString());
        }
        if ((iGroupSize <= i11) != true) {
            throw new IllegalStateException(("A group extends past its parent group at " + i12).toString());
        }
        int iDataAnchor = SlotTableKt.dataAnchor(slotTable.groups, i12);
        int iDataAnchor2 = i12 >= slotTable.groupsSize - 1 ? slotTable.slotsSize : SlotTableKt.dataAnchor(slotTable.groups, i13);
        if ((iDataAnchor2 <= slotTable.slots.length) != true) {
            throw new IllegalStateException(("Slots for " + i12 + " extend past the end of the slot table").toString());
        }
        if ((iDataAnchor <= iDataAnchor2) != true) {
            throw new IllegalStateException(("Invalid data anchor at " + i12).toString());
        }
        if ((SlotTableKt.slotAnchor(slotTable.groups, i12) <= iDataAnchor2) != true) {
            throw new IllegalStateException(("Slots start out of range at " + i12).toString());
        }
        if ((iDataAnchor2 - iDataAnchor >= ((SlotTableKt.isNode(slotTable.groups, i12) ? 1 : 0) + (SlotTableKt.hasObjectKey(slotTable.groups, i12) ? 1 : 0)) + (SlotTableKt.hasAux(slotTable.groups, i12) ? 1 : 0)) != true) {
            throw new IllegalStateException(("Not enough slots added for group " + i12).toString());
        }
        boolean zIsNode = SlotTableKt.isNode(slotTable.groups, i12);
        if (((zIsNode && slotTable.slots[SlotTableKt.nodeIndex(slotTable.groups, i12)] == null) ? false : true) != true) {
            throw new IllegalStateException(("No node recorded for a node group at " + i12).toString());
        }
        int iVerifyWellFormed$validateGroup = 0;
        while (ref$IntRef.element < iGroupSize) {
            iVerifyWellFormed$validateGroup += verifyWellFormed$validateGroup(ref$IntRef, slotTable, i12, iGroupSize);
        }
        int iNodeCount = SlotTableKt.nodeCount(slotTable.groups, i12);
        int iGroupSize2 = SlotTableKt.groupSize(slotTable.groups, i12);
        if ((iNodeCount == iVerifyWellFormed$validateGroup) != true) {
            throw new IllegalStateException(("Incorrect node count detected at " + i12 + ", expected " + iNodeCount + ", received " + iVerifyWellFormed$validateGroup).toString());
        }
        int i14 = ref$IntRef.element - i12;
        if ((iGroupSize2 == i14) != true) {
            throw new IllegalStateException(("Incorrect slot count detected at " + i12 + ", expected " + iGroupSize2 + ", received " + i14).toString());
        }
        if (SlotTableKt.containsAnyMark(slotTable.groups, i12)) {
            if (!(i12 <= 0 || SlotTableKt.containsMark(slotTable.groups, i10))) {
                throw new IllegalStateException(("Expected group " + i10 + " to record it contains a mark because " + i12 + " does").toString());
            }
        }
        if (zIsNode) {
            return 1;
        }
        return iVerifyWellFormed$validateGroup;
    }

    @NotNull
    public final Anchor anchor(int index) {
        if (!(!this.writer)) {
            ComposerKt.composeRuntimeError("use active SlotWriter to create an anchor location instead ".toString());
            throw new KotlinNothingValueException();
        }
        boolean z10 = false;
        if (index >= 0 && index < this.groupsSize) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException("Parameter index is out of range".toString());
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int iSearch = SlotTableKt.search(arrayList, index, this.groupsSize);
        if (iSearch < 0) {
            Anchor anchor = new Anchor(index);
            arrayList.add(-(iSearch + 1), anchor);
            return anchor;
        }
        Anchor anchor2 = arrayList.get(iSearch);
        p.j(anchor2, "get(location)");
        return anchor2;
    }

    public final int anchorIndex(@NotNull Anchor anchor) {
        p.k(anchor, "anchor");
        if (!(!this.writer)) {
            ComposerKt.composeRuntimeError("Use active SlotWriter to determine anchor location instead".toString());
            throw new KotlinNothingValueException();
        }
        if (anchor.getValid()) {
            return anchor.getLocation();
        }
        throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
    }

    @NotNull
    public final String asString() {
        if (this.writer) {
            return super.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append('\n');
        int i10 = this.groupsSize;
        if (i10 > 0) {
            int iEmitGroup = 0;
            while (iEmitGroup < i10) {
                iEmitGroup += emitGroup(sb2, iEmitGroup, 0);
            }
        } else {
            sb2.append("<EMPTY>");
        }
        String string = sb2.toString();
        p.j(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void close$runtime_release(@NotNull SlotReader reader) {
        p.k(reader, "reader");
        if (!(reader.getTable() == this && this.readers > 0)) {
            throw new IllegalArgumentException("Unexpected reader close()".toString());
        }
        this.readers--;
    }

    public final void close$runtime_release(@NotNull SlotWriter writer, @NotNull int[] groups, int groupsSize, @NotNull Object[] slots, int slotsSize, @NotNull ArrayList<Anchor> anchors) {
        p.k(writer, "writer");
        p.k(groups, "groups");
        p.k(slots, "slots");
        p.k(anchors, "anchors");
        if (!(writer.getTable() == this && this.writer)) {
            throw new IllegalArgumentException("Unexpected writer close()".toString());
        }
        this.writer = false;
        setTo$runtime_release(groups, groupsSize, slots, slotsSize, anchors);
    }

    @NotNull
    public final ArrayList<Anchor> getAnchors$runtime_release() {
        return this.anchors;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @NotNull
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    @NotNull
    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    @NotNull
    public final Object[] getSlots() {
        return this.slots;
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    /* JADX INFO: renamed from: getVersion$runtime_release, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: getWriter$runtime_release, reason: from getter */
    public final boolean getWriter() {
        return this.writer;
    }

    public final boolean groupContainsAnchor(int groupIndex, @NotNull Anchor anchor) {
        p.k(anchor, "anchor");
        if (!(!this.writer)) {
            ComposerKt.composeRuntimeError("Writer is active".toString());
            throw new KotlinNothingValueException();
        }
        if (!(groupIndex >= 0 && groupIndex < this.groupsSize)) {
            ComposerKt.composeRuntimeError("Invalid group index".toString());
            throw new KotlinNothingValueException();
        }
        if (ownsAnchor(anchor)) {
            int iGroupSize = SlotTableKt.groupSize(this.groups, groupIndex) + groupIndex;
            int location = anchor.getLocation();
            if (groupIndex <= location && location < iGroupSize) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release(int target) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        SlotReader slotReaderOpenReader = openReader();
        try {
            m1272invalidateGroupsWithKey$lambda14$scanGroup(slotReaderOpenReader, target, arrayList, ref$BooleanRef, this, arrayList2);
            r rVar = r.f5635a;
            slotReaderOpenReader.close();
            SlotWriter slotWriterOpenWriter = openWriter();
            try {
                slotWriterOpenWriter.startGroup();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Anchor anchor = (Anchor) arrayList.get(i10);
                    if (anchor.toIndexFor(slotWriterOpenWriter) >= slotWriterOpenWriter.getCurrentGroup()) {
                        slotWriterOpenWriter.seek(anchor);
                        slotWriterOpenWriter.bashGroup$runtime_release();
                    }
                }
                slotWriterOpenWriter.skipToGroupEnd();
                slotWriterOpenWriter.endGroup();
                slotWriterOpenWriter.close();
                if (ref$BooleanRef.element) {
                    return arrayList2;
                }
                return null;
            } catch (Throwable th2) {
                slotWriterOpenWriter.close();
                throw th2;
            }
        } catch (Throwable th3) {
            slotReaderOpenReader.close();
            throw th3;
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    @NotNull
    public final SlotReader openReader() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.readers++;
        return new SlotReader(this);
    }

    @NotNull
    public final SlotWriter openWriter() {
        if (!(!this.writer)) {
            ComposerKt.composeRuntimeError("Cannot start a writer when another writer is pending".toString());
            throw new KotlinNothingValueException();
        }
        if (!(this.readers <= 0)) {
            ComposerKt.composeRuntimeError("Cannot start a writer when a reader is pending".toString());
            throw new KotlinNothingValueException();
        }
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    }

    public final boolean ownsAnchor(@NotNull Anchor anchor) {
        p.k(anchor, "anchor");
        if (anchor.getValid()) {
            int iSearch = SlotTableKt.search(this.anchors, anchor.getLocation(), this.groupsSize);
            if (iSearch >= 0 && p.f(this.anchors.get(iSearch), anchor)) {
                return true;
            }
        }
        return false;
    }

    public final <T> T read(@NotNull l<? super SlotReader, ? extends T> block) {
        p.k(block, "block");
        SlotReader slotReaderOpenReader = openReader();
        try {
            return block.invoke(slotReaderOpenReader);
        } finally {
            n.b(1);
            slotReaderOpenReader.close();
            n.a(1);
        }
    }

    public final void setAnchors$runtime_release(@NotNull ArrayList<Anchor> arrayList) {
        p.k(arrayList, "<set-?>");
        this.anchors = arrayList;
    }

    public final void setTo$runtime_release(@NotNull int[] groups, int groupsSize, @NotNull Object[] slots, int slotsSize, @NotNull ArrayList<Anchor> anchors) {
        p.k(groups, "groups");
        p.k(slots, "slots");
        p.k(anchors, "anchors");
        this.groups = groups;
        this.groupsSize = groupsSize;
        this.slots = slots;
        this.slotsSize = slotsSize;
        this.anchors = anchors;
    }

    public final void setVersion$runtime_release(int i10) {
        this.version = i10;
    }

    @NotNull
    public final List<Object> slotsOf$runtime_release(int group) {
        int iDataAnchor = SlotTableKt.dataAnchor(this.groups, group);
        int i10 = group + 1;
        return cn.r.G0(this.slots).subList(iDataAnchor, i10 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i10) : this.slots.length);
    }

    public final void verifyWellFormed() {
        int i10;
        int i11;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        int i12 = -1;
        if (this.groupsSize > 0) {
            while (true) {
                i10 = ref$IntRef.element;
                i11 = this.groupsSize;
                if (i10 >= i11) {
                    break;
                } else {
                    verifyWellFormed$validateGroup(ref$IntRef, this, -1, i10 + SlotTableKt.groupSize(this.groups, i10));
                }
            }
            if (!(i10 == i11)) {
                throw new IllegalStateException(("Incomplete group at root " + ref$IntRef.element + " expected to be " + this.groupsSize).toString());
            }
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            int indexFor = arrayList.get(i13).toIndexFor(this);
            if (!(indexFor >= 0 && indexFor <= this.groupsSize)) {
                throw new IllegalArgumentException("Location out of bound".toString());
            }
            if (!(i12 < indexFor)) {
                throw new IllegalArgumentException("Anchor is out of order".toString());
            }
            i13++;
            i12 = indexFor;
        }
    }

    public final <T> T write(@NotNull l<? super SlotWriter, ? extends T> block) {
        p.k(block, "block");
        SlotWriter slotWriterOpenWriter = openWriter();
        try {
            return block.invoke(slotWriterOpenWriter);
        } finally {
            n.b(1);
            slotWriterOpenWriter.close();
            n.a(1);
        }
    }
}
