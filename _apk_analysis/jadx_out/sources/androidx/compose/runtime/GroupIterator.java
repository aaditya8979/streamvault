package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import com.ironsource.G5;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;
import un.a;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/GroupIterator;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "Lbn/r;", "validateRead", "", "hasNext", "next", "Landroidx/compose/runtime/SlotTable;", G5.Q, "Landroidx/compose/runtime/SlotTable;", "getTable", "()Landroidx/compose/runtime/SlotTable;", "", "end", "I", "getEnd", "()I", "index", "version", "start", "<init>", "(Landroidx/compose/runtime/SlotTable;II)V", "runtime_release"}, k = 1, mv = {1, 6, 0})
final class GroupIterator implements Iterator<CompositionGroup>, a {
    private final int end;
    private int index;

    @NotNull
    private final SlotTable table;
    private final int version;

    /* JADX INFO: renamed from: androidx.compose.runtime.GroupIterator$next$1, reason: invalid class name */
    /* JADX INFO: compiled from: SlotTable.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018H\u0096\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000bR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000bR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"androidx/compose/runtime/GroupIterator$next$1", "Landroidx/compose/runtime/tooling/CompositionGroup;", "", "compositionGroups", "getCompositionGroups", "()Ljava/lang/Iterable;", "data", "", "getData", "identity", "getIdentity", "()Ljava/lang/Object;", "isEmpty", "", "()Z", "key", "getKey", "node", "getNode", "sourceInfo", "", "getSourceInfo", "()Ljava/lang/String;", "iterator", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass1 implements CompositionGroup, Iterable<CompositionGroup>, a {
        public final /* synthetic */ int $group;

        public AnonymousClass1(int i10) {
            this.$group = i10;
        }

        @Override // androidx.compose.runtime.tooling.CompositionData
        @NotNull
        public Iterable<CompositionGroup> getCompositionGroups() {
            return this;
        }

        @Override // androidx.compose.runtime.tooling.CompositionGroup
        @NotNull
        public Iterable<Object> getData() {
            return new DataIterator(GroupIterator.this.getTable(), this.$group);
        }

        @Override // androidx.compose.runtime.tooling.CompositionGroup
        @NotNull
        public Object getIdentity() {
            GroupIterator.this.validateRead();
            SlotTable table = GroupIterator.this.getTable();
            int i10 = this.$group;
            SlotReader slotReaderOpenReader = table.openReader();
            try {
                return slotReaderOpenReader.anchor(i10);
            } finally {
                slotReaderOpenReader.close();
            }
        }

        @Override // androidx.compose.runtime.tooling.CompositionGroup
        @NotNull
        public Object getKey() {
            if (!SlotTableKt.hasObjectKey(GroupIterator.this.getTable().getGroups(), this.$group)) {
                return Integer.valueOf(SlotTableKt.key(GroupIterator.this.getTable().getGroups(), this.$group));
            }
            Object obj = GroupIterator.this.getTable().getSlots()[SlotTableKt.objectKeyIndex(GroupIterator.this.getTable().getGroups(), this.$group)];
            p.h(obj);
            return obj;
        }

        @Override // androidx.compose.runtime.tooling.CompositionGroup
        @Nullable
        public Object getNode() {
            if (SlotTableKt.isNode(GroupIterator.this.getTable().getGroups(), this.$group)) {
                return GroupIterator.this.getTable().getSlots()[SlotTableKt.nodeIndex(GroupIterator.this.getTable().getGroups(), this.$group)];
            }
            return null;
        }

        @Override // androidx.compose.runtime.tooling.CompositionGroup
        @Nullable
        public String getSourceInfo() {
            if (!SlotTableKt.hasAux(GroupIterator.this.getTable().getGroups(), this.$group)) {
                return null;
            }
            Object obj = GroupIterator.this.getTable().getSlots()[SlotTableKt.auxIndex(GroupIterator.this.getTable().getGroups(), this.$group)];
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }

        @Override // androidx.compose.runtime.tooling.CompositionData
        public boolean isEmpty() {
            return SlotTableKt.groupSize(GroupIterator.this.getTable().getGroups(), this.$group) == 0;
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<CompositionGroup> iterator() {
            GroupIterator.this.validateRead();
            SlotTable table = GroupIterator.this.getTable();
            int i10 = this.$group;
            return new GroupIterator(table, i10 + 1, i10 + SlotTableKt.groupSize(GroupIterator.this.getTable().getGroups(), this.$group));
        }
    }

    public GroupIterator(@NotNull SlotTable slotTable, int i10, int i11) {
        p.k(slotTable, G5.Q);
        this.table = slotTable;
        this.end = i11;
        this.index = i10;
        this.version = slotTable.getVersion();
        if (slotTable.getWriter()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateRead() {
        if (this.table.getVersion() != this.version) {
            throw new ConcurrentModificationException();
        }
    }

    public final int getEnd() {
        return this.end;
    }

    @NotNull
    public final SlotTable getTable() {
        return this.table;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.end;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @NotNull
    public CompositionGroup next() {
        validateRead();
        int i10 = this.index;
        this.index = SlotTableKt.groupSize(this.table.getGroups(), i10) + i10;
        return new AnonymousClass1(i10);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
