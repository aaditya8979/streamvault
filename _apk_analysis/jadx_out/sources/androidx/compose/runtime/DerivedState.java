package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import bn.r;
import cn.w0;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: renamed from: androidx.compose.runtime.DerivedSnapshotState, reason: from toString */
/* JADX INFO: compiled from: DerivedState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001&B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b$\u0010%J2\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000e\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010#\u001a\u0004\u0018\u00018\u00008G¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0019¨\u0006'"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState;", "T", "Landroidx/compose/runtime/snapshots/StateObject;", "Landroidx/compose/runtime/DerivedState;", "Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "readable", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "Lkotlin/Function0;", "calculation", "currentRecord", "", "displayValue", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "Lbn/r;", "prependStateRecord", "toString", "Lsn/a;", "first", "Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getValue", "()Ljava/lang/Object;", "getCurrentValue", "currentValue", "", "getDependencies", "()Ljava/util/Set;", "dependencies", "getDebuggerDisplayValue", "getDebuggerDisplayValue$annotations", "()V", "debuggerDisplayValue", "<init>", "(Lsn/a;)V", "ResultRecord", "runtime_release"}, k = 1, mv = {1, 6, 0})
final class DerivedState<T> implements StateObject, androidx.compose.runtime.DerivedState<T> {

    @NotNull
    private final a<T> calculation;

    @NotNull
    private ResultRecord<T> first;

    /* JADX INFO: renamed from: androidx.compose.runtime.DerivedSnapshotState$ResultRecord */
    /* JADX INFO: compiled from: DerivedState.kt */
    @Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0002\u0018\u0000 '*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0001'B\u0007¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\n\u001a\u00020\tJ\u001a\u0010\u000e\u001a\u00020\r2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\n\u001a\u00020\tR6\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006("}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "Lbn/r;", "assign", "create", "Landroidx/compose/runtime/DerivedState;", "derivedState", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "", "isValid", "", "readableHash", "Ljava/util/HashSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "Lkotlin/collections/HashSet;", "dependencies", "Ljava/util/HashSet;", "getDependencies", "()Ljava/util/HashSet;", "setDependencies", "(Ljava/util/HashSet;)V", "", "result", "Ljava/lang/Object;", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "resultHash", "I", "getResultHash", "()I", "setResultHash", "(I)V", "<init>", "()V", VastTagName.COMPANION, "runtime_release"}, k = 1, mv = {1, 6, 0})
    public static final class ResultRecord<T> extends StateRecord {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final Object Unset = new Object();

        @Nullable
        private HashSet<StateObject> dependencies;

        @Nullable
        private Object result = Unset;
        private int resultHash;

        /* JADX INFO: renamed from: androidx.compose.runtime.DerivedSnapshotState$ResultRecord$Companion, reason: from kotlin metadata */
        /* JADX INFO: compiled from: DerivedState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord$Companion;", "", "()V", "Unset", "getUnset", "()Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @NotNull
            public final Object getUnset() {
                return ResultRecord.Unset;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@NotNull StateRecord stateRecord) {
            p.k(stateRecord, "value");
            ResultRecord resultRecord = (ResultRecord) stateRecord;
            this.dependencies = resultRecord.dependencies;
            this.result = resultRecord.result;
            this.resultHash = resultRecord.resultHash;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create() {
            return new ResultRecord();
        }

        @Nullable
        public final HashSet<StateObject> getDependencies() {
            return this.dependencies;
        }

        @Nullable
        public final Object getResult() {
            return this.result;
        }

        public final int getResultHash() {
            return this.resultHash;
        }

        public final boolean isValid(@NotNull androidx.compose.runtime.DerivedState<?> derivedState, @NotNull Snapshot snapshot) {
            p.k(derivedState, "derivedState");
            p.k(snapshot, "snapshot");
            return this.result != Unset && this.resultHash == readableHash(derivedState, snapshot);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int readableHash(@NotNull androidx.compose.runtime.DerivedState<?> derivedState, @NotNull Snapshot snapshot) {
            HashSet<StateObject> hashSet;
            p.k(derivedState, "derivedState");
            p.k(snapshot, "snapshot");
            synchronized (SnapshotKt.getLock()) {
                hashSet = this.dependencies;
            }
            int iIdentityHashCode = 7;
            if (hashSet != null) {
                PersistentList persistentListPersistentListOf = (PersistentList) SnapshotStateKt__DerivedStateKt.derivedStateObservers.get();
                if (persistentListPersistentListOf == null) {
                    persistentListPersistentListOf = ExtensionsKt.persistentListOf();
                }
                int size = persistentListPersistentListOf.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    ((l) ((Pair) persistentListPersistentListOf.get(i11)).component1()).invoke(derivedState);
                }
                try {
                    for (StateObject stateObject : hashSet) {
                        StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                        p.j(stateObject, "stateObject");
                        StateRecord stateRecord = SnapshotKt.readable(firstStateRecord, stateObject, snapshot);
                        iIdentityHashCode = (((iIdentityHashCode * 31) + ActualJvm_jvmKt.identityHashCode(stateRecord)) * 31) + stateRecord.getSnapshotId();
                    }
                    r rVar = r.f5635a;
                } finally {
                    int size2 = persistentListPersistentListOf.size();
                    while (i10 < size2) {
                        ((l) ((Pair) persistentListPersistentListOf.get(i10)).component2()).invoke(derivedState);
                        i10++;
                    }
                }
            }
            return iIdentityHashCode;
        }

        public final void setDependencies(@Nullable HashSet<StateObject> hashSet) {
            this.dependencies = hashSet;
        }

        public final void setResult(@Nullable Object obj) {
            this.result = obj;
        }

        public final void setResultHash(int i10) {
            this.resultHash = i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedState(@NotNull a<? extends T> aVar) {
        p.k(aVar, "calculation");
        this.calculation = aVar;
        this.first = new ResultRecord<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ResultRecord<T> currentRecord(ResultRecord<T> resultRecord, Snapshot snapshot, a<? extends T> aVar) {
        Snapshot.Companion companion;
        ResultRecord<T> resultRecord2;
        if (resultRecord.isValid(this, snapshot)) {
            return resultRecord;
        }
        Boolean bool = (Boolean) SnapshotStateKt__DerivedStateKt.isCalculationBlockRunning.get();
        int i10 = 0;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        final HashSet<StateObject> hashSet = new HashSet<>();
        PersistentList persistentListPersistentListOf = (PersistentList) SnapshotStateKt__DerivedStateKt.derivedStateObservers.get();
        if (persistentListPersistentListOf == null) {
            persistentListPersistentListOf = ExtensionsKt.persistentListOf();
        }
        int size = persistentListPersistentListOf.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((l) ((Pair) persistentListPersistentListOf.get(i11)).component1()).invoke(this);
        }
        if (!zBooleanValue) {
            try {
                SnapshotStateKt__DerivedStateKt.isCalculationBlockRunning.set(Boolean.TRUE);
            } finally {
                int size2 = persistentListPersistentListOf.size();
                while (i10 < size2) {
                    ((l) ((Pair) persistentListPersistentListOf.get(i10)).component2()).invoke(this);
                    i10++;
                }
            }
        }
        Object objObserve = Snapshot.INSTANCE.observe(new l<Object, r>(this) { // from class: androidx.compose.runtime.DerivedSnapshotState$currentRecord$result$1$result$1
            public final /* synthetic */ DerivedState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                p.k(obj, "it");
                if (obj == this.this$0) {
                    throw new IllegalStateException("A derived state calculation cannot read itself".toString());
                }
                if (obj instanceof StateObject) {
                    hashSet.add(obj);
                }
            }
        }, null, aVar);
        if (!zBooleanValue) {
            SnapshotStateKt__DerivedStateKt.isCalculationBlockRunning.set(Boolean.FALSE);
        }
        synchronized (SnapshotKt.getLock()) {
            companion = Snapshot.INSTANCE;
            Snapshot current = companion.getCurrent();
            resultRecord2 = (ResultRecord) SnapshotKt.newWritableRecord(this.first, this, current);
            resultRecord2.setDependencies(hashSet);
            resultRecord2.setResultHash(resultRecord2.readableHash(this, current));
            resultRecord2.setResult(objObserve);
        }
        if (!zBooleanValue) {
            companion.notifyObjectsInitialized();
        }
        return resultRecord2;
    }

    private final String displayValue() {
        ResultRecord<T> resultRecord = this.first;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        ResultRecord resultRecord2 = (ResultRecord) SnapshotKt.current(resultRecord, companion.getCurrent());
        return resultRecord2.isValid(this, companion.getCurrent()) ? String.valueOf(resultRecord2.getResult()) : "<Not calculated>";
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    @Override // androidx.compose.runtime.DerivedState
    public T getCurrentValue() {
        ResultRecord<T> resultRecord = this.first;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        return (T) currentRecord((ResultRecord) SnapshotKt.current(resultRecord, companion.getCurrent()), companion.getCurrent(), this.calculation).getResult();
    }

    @Nullable
    public final T getDebuggerDisplayValue() {
        ResultRecord<T> resultRecord = this.first;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        ResultRecord resultRecord2 = (ResultRecord) SnapshotKt.current(resultRecord, companion.getCurrent());
        if (resultRecord2.isValid(this, companion.getCurrent())) {
            return (T) resultRecord2.getResult();
        }
        return null;
    }

    @Override // androidx.compose.runtime.DerivedState
    @NotNull
    public Set<StateObject> getDependencies() {
        ResultRecord<T> resultRecord = this.first;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        HashSet<StateObject> dependencies = currentRecord((ResultRecord) SnapshotKt.current(resultRecord, companion.getCurrent()), companion.getCurrent(), this.calculation).getDependencies();
        return dependencies != null ? dependencies : w0.f();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.first;
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        l<Object, r> readObserver$runtime_release = Snapshot.INSTANCE.getCurrent().getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(this);
        }
        return getCurrentValue();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord stateRecord) {
        p.k(stateRecord, "value");
        this.first = (ResultRecord) stateRecord;
    }

    @NotNull
    public String toString() {
        return "DerivedState(value=" + displayValue() + ")@" + hashCode();
    }
}
