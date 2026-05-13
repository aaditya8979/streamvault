package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import bn.r;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import sn.p;

/* JADX INFO: compiled from: SnapshotStateObserver.kt */
/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001-B!\u0012\u0018\u0010\u001b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0002J,\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0005H\u0002JA\u0010\r\u001a\u00020\u0002\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\t\u001a\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0007J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0001J\u001a\u0010\u0013\u001a\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0005J\u0006\u0010\u0014\u001a\u00020\u0002J\u0006\u0010\u0015\u001a\u00020\u0002J\u001c\u0010\u001a\u001a\u00020\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u0010\u001a\u00020\u0002R&\u0010\u001b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\u0004\u0012\u00020\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR,\u0010\u001e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001cR\u001e\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "Lbn/r;", "callOnChanged", "T", "Lkotlin/Function1;", "onChanged", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ApplyMap;", "ensureMap", "scope", "onValueChangedForScope", "Lkotlin/Function0;", "block", "observeReads", "(Ljava/lang/Object;Lsn/l;Lsn/a;)V", "withNoObservations", "clear", "", "predicate", "clearIf", "start", "stop", "", "changes", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "notifyChanges", "onChangedExecutor", "Lsn/l;", "Lkotlin/Function2;", "applyObserver", "Lsn/p;", "readObserver", "Landroidx/compose/runtime/collection/MutableVector;", "applyMaps", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "applyUnsubscribe", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "isPaused", "Z", "currentMap", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ApplyMap;", "<init>", "(Lsn/l;)V", "ApplyMap", "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class SnapshotStateObserver {
    public static final int $stable = 8;

    @NotNull
    private final MutableVector<ApplyMap<?>> applyMaps;

    @NotNull
    private final p<Set<? extends Object>, Snapshot, r> applyObserver;

    @Nullable
    private ObserverHandle applyUnsubscribe;

    @Nullable
    private ApplyMap<?> currentMap;
    private boolean isPaused;

    @NotNull
    private final l<a<r>, r> onChangedExecutor;

    @NotNull
    private final l<Object, r> readObserver;

    /* JADX INFO: compiled from: SnapshotStateObserver.kt */
    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u001b\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001J\u0014\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R'\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0013j\b\u0012\u0004\u0012\u00020\u0001`\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ApplyMap;", "", "T", "value", "Lbn/r;", "addValue", "", "scopes", "callOnChanged", "Lkotlin/Function1;", "onChanged", "Lsn/l;", "getOnChanged", "()Lsn/l;", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "map", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "getMap", "()Landroidx/compose/runtime/collection/IdentityScopeMap;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "invalidated", "Ljava/util/HashSet;", "getInvalidated", "()Ljava/util/HashSet;", "currentScope", "Ljava/lang/Object;", "getCurrentScope", "()Ljava/lang/Object;", "setCurrentScope", "(Ljava/lang/Object;)V", "<init>", "(Lsn/l;)V", "runtime_release"}, k = 1, mv = {1, 6, 0})
    public static final class ApplyMap<T> {

        @Nullable
        private T currentScope;

        @NotNull
        private final HashSet<Object> invalidated;

        @NotNull
        private final IdentityScopeMap<T> map;

        @NotNull
        private final l<T, r> onChanged;

        /* JADX WARN: Multi-variable type inference failed */
        public ApplyMap(@NotNull l<? super T, r> lVar) {
            tn.p.k(lVar, "onChanged");
            this.onChanged = lVar;
            this.map = new IdentityScopeMap<>();
            this.invalidated = new HashSet<>();
        }

        public final void addValue(@NotNull Object obj) {
            tn.p.k(obj, "value");
            IdentityScopeMap<T> identityScopeMap = this.map;
            T t10 = this.currentScope;
            tn.p.h(t10);
            identityScopeMap.add(obj, t10);
        }

        public final void callOnChanged(@NotNull Collection<? extends Object> collection) {
            tn.p.k(collection, "scopes");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                this.onChanged.invoke(it.next());
            }
        }

        @Nullable
        public final T getCurrentScope() {
            return this.currentScope;
        }

        @NotNull
        public final HashSet<Object> getInvalidated() {
            return this.invalidated;
        }

        @NotNull
        public final IdentityScopeMap<T> getMap() {
            return this.map;
        }

        @NotNull
        public final l<T, r> getOnChanged() {
            return this.onChanged;
        }

        public final void setCurrentScope(@Nullable T t10) {
            this.currentScope = t10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(@NotNull l<? super a<r>, r> lVar) {
        tn.p.k(lVar, "onChangedExecutor");
        this.onChangedExecutor = lVar;
        this.applyObserver = new p<Set<? extends Object>, Snapshot, r>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1
            {
                super(2);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(Set<? extends Object> set, Snapshot snapshot) {
                invoke2(set, snapshot);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Set<? extends Object> set, @NotNull Snapshot snapshot) {
                int i10;
                tn.p.k(set, "applied");
                tn.p.k(snapshot, "<anonymous parameter 1>");
                MutableVector mutableVector = this.this$0.applyMaps;
                SnapshotStateObserver snapshotStateObserver = this.this$0;
                synchronized (mutableVector) {
                    MutableVector mutableVector2 = snapshotStateObserver.applyMaps;
                    int size = mutableVector2.getSize();
                    i10 = 0;
                    if (size > 0) {
                        Object[] content = mutableVector2.getContent();
                        int i11 = 0;
                        do {
                            SnapshotStateObserver.ApplyMap applyMap = (SnapshotStateObserver.ApplyMap) content[i10];
                            HashSet<Object> invalidated = applyMap.getInvalidated();
                            IdentityScopeMap map = applyMap.getMap();
                            Iterator<? extends Object> it = set.iterator();
                            while (it.hasNext()) {
                                int iFind = map.find(it.next());
                                if (iFind >= 0) {
                                    Iterator<T> it2 = map.scopeSetAt(iFind).iterator();
                                    while (it2.hasNext()) {
                                        invalidated.add(it2.next());
                                        i11 = 1;
                                    }
                                }
                            }
                            i10++;
                        } while (i10 < size);
                        i10 = i11;
                    }
                    r rVar = r.f5635a;
                }
                if (i10 != 0) {
                    l lVar2 = this.this$0.onChangedExecutor;
                    final SnapshotStateObserver snapshotStateObserver2 = this.this$0;
                    lVar2.invoke(new a<r>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1.2
                        {
                            super(0);
                        }

                        @Override // sn.a
                        public /* bridge */ /* synthetic */ r invoke() {
                            invoke2();
                            return r.f5635a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            snapshotStateObserver2.callOnChanged();
                        }
                    });
                }
            }
        };
        this.readObserver = new l<Object, r>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$readObserver$1
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                tn.p.k(obj, "state");
                if (this.this$0.isPaused) {
                    return;
                }
                MutableVector mutableVector = this.this$0.applyMaps;
                SnapshotStateObserver snapshotStateObserver = this.this$0;
                synchronized (mutableVector) {
                    SnapshotStateObserver.ApplyMap applyMap = snapshotStateObserver.currentMap;
                    tn.p.h(applyMap);
                    applyMap.addValue(obj);
                    r rVar = r.f5635a;
                }
            }
        };
        this.applyMaps = new MutableVector<>(new ApplyMap[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void callOnChanged() {
        MutableVector<ApplyMap<?>> mutableVector = this.applyMaps;
        int size = mutableVector.getSize();
        if (size > 0) {
            int i10 = 0;
            ApplyMap<?>[] content = mutableVector.getContent();
            do {
                ApplyMap<?> applyMap = content[i10];
                HashSet<Object> invalidated = applyMap.getInvalidated();
                if (!invalidated.isEmpty()) {
                    applyMap.callOnChanged(invalidated);
                    invalidated.clear();
                }
                i10++;
            } while (i10 < size);
        }
    }

    private final <T> ApplyMap<T> ensureMap(l<? super T, r> lVar) {
        int i10;
        MutableVector<ApplyMap<?>> mutableVector = this.applyMaps;
        int size = mutableVector.getSize();
        if (size > 0) {
            ApplyMap[] content = mutableVector.getContent();
            i10 = 0;
            do {
                if (content[i10].getOnChanged() == lVar) {
                    break;
                }
                i10++;
            } while (i10 < size);
            i10 = -1;
        } else {
            i10 = -1;
        }
        if (i10 != -1) {
            return (ApplyMap) this.applyMaps.getContent()[i10];
        }
        ApplyMap<T> applyMap = new ApplyMap<>(lVar);
        this.applyMaps.add(applyMap);
        return applyMap;
    }

    public final void clear() {
        synchronized (this.applyMaps) {
            MutableVector<ApplyMap<?>> mutableVector = this.applyMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                int i10 = 0;
                ApplyMap<?>[] content = mutableVector.getContent();
                do {
                    content[i10].getMap().clear();
                    i10++;
                } while (i10 < size);
            }
            r rVar = r.f5635a;
        }
    }

    public final void clear(@NotNull Object obj) {
        tn.p.k(obj, "scope");
        synchronized (this.applyMaps) {
            MutableVector<ApplyMap<?>> mutableVector = this.applyMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                ApplyMap<?>[] content = mutableVector.getContent();
                int i10 = 0;
                do {
                    IdentityScopeMap<?> map = content[i10].getMap();
                    int size2 = map.getSize();
                    int i11 = 0;
                    for (int i12 = 0; i12 < size2; i12++) {
                        int i13 = map.getValueOrder()[i12];
                        IdentityArraySet<?> identityArraySet = map.getScopeSets()[i13];
                        tn.p.h(identityArraySet);
                        int size3 = identityArraySet.size();
                        int i14 = 0;
                        for (int i15 = 0; i15 < size3; i15++) {
                            Object obj2 = identityArraySet.getValues()[i15];
                            if (obj2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            }
                            if (!(obj2 == obj)) {
                                if (i14 != i15) {
                                    identityArraySet.getValues()[i14] = obj2;
                                }
                                i14++;
                            }
                        }
                        int size4 = identityArraySet.size();
                        for (int i16 = i14; i16 < size4; i16++) {
                            identityArraySet.getValues()[i16] = null;
                        }
                        identityArraySet.setSize(i14);
                        if (identityArraySet.size() > 0) {
                            if (i11 != i12) {
                                int i17 = map.getValueOrder()[i11];
                                map.getValueOrder()[i11] = i13;
                                map.getValueOrder()[i12] = i17;
                            }
                            i11++;
                        }
                    }
                    int size5 = map.getSize();
                    for (int i18 = i11; i18 < size5; i18++) {
                        map.getValues()[map.getValueOrder()[i18]] = null;
                    }
                    map.setSize(i11);
                    i10++;
                } while (i10 < size);
            }
            r rVar = r.f5635a;
        }
    }

    public final void clearIf(@NotNull l<Object, Boolean> lVar) {
        tn.p.k(lVar, "predicate");
        synchronized (this.applyMaps) {
            MutableVector<ApplyMap<?>> mutableVector = this.applyMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                ApplyMap<?>[] content = mutableVector.getContent();
                int i10 = 0;
                do {
                    IdentityScopeMap<?> map = content[i10].getMap();
                    int size2 = map.getSize();
                    int i11 = 0;
                    for (int i12 = 0; i12 < size2; i12++) {
                        int i13 = map.getValueOrder()[i12];
                        IdentityArraySet<?> identityArraySet = map.getScopeSets()[i13];
                        tn.p.h(identityArraySet);
                        int size3 = identityArraySet.size();
                        int i14 = 0;
                        for (int i15 = 0; i15 < size3; i15++) {
                            Object obj = identityArraySet.getValues()[i15];
                            if (obj == null) {
                                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            }
                            if (!lVar.invoke(obj).booleanValue()) {
                                if (i14 != i15) {
                                    identityArraySet.getValues()[i14] = obj;
                                }
                                i14++;
                            }
                        }
                        int size4 = identityArraySet.size();
                        for (int i16 = i14; i16 < size4; i16++) {
                            identityArraySet.getValues()[i16] = null;
                        }
                        identityArraySet.setSize(i14);
                        if (identityArraySet.size() > 0) {
                            if (i11 != i12) {
                                int i17 = map.getValueOrder()[i11];
                                map.getValueOrder()[i11] = i13;
                                map.getValueOrder()[i12] = i17;
                            }
                            i11++;
                        }
                    }
                    int size5 = map.getSize();
                    for (int i18 = i11; i18 < size5; i18++) {
                        map.getValues()[map.getValueOrder()[i18]] = null;
                    }
                    map.setSize(i11);
                    i10++;
                } while (i10 < size);
            }
            r rVar = r.f5635a;
        }
    }

    public final void notifyChanges(@NotNull Set<? extends Object> set, @NotNull Snapshot snapshot) {
        tn.p.k(set, "changes");
        tn.p.k(snapshot, "snapshot");
        this.applyObserver.mo2invoke(set, snapshot);
    }

    public final <T> void observeReads(@NotNull T scope, @NotNull l<? super T, r> onValueChangedForScope, @NotNull a<r> block) {
        ApplyMap<?> applyMapEnsureMap;
        tn.p.k(scope, "scope");
        tn.p.k(onValueChangedForScope, "onValueChangedForScope");
        tn.p.k(block, "block");
        ApplyMap<?> applyMap = this.currentMap;
        boolean z10 = this.isPaused;
        synchronized (this.applyMaps) {
            applyMapEnsureMap = ensureMap(onValueChangedForScope);
            applyMapEnsureMap.getMap().removeScope(scope);
        }
        Object currentScope = applyMapEnsureMap.getCurrentScope();
        applyMapEnsureMap.setCurrentScope(scope);
        this.currentMap = applyMapEnsureMap;
        this.isPaused = false;
        Snapshot.INSTANCE.observe(this.readObserver, null, block);
        this.currentMap = applyMap;
        applyMapEnsureMap.setCurrentScope(currentScope);
        this.isPaused = z10;
    }

    public final void start() {
        this.applyUnsubscribe = Snapshot.INSTANCE.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        ObserverHandle observerHandle = this.applyUnsubscribe;
        if (observerHandle != null) {
            observerHandle.dispose();
        }
    }

    public final void withNoObservations(@NotNull a<r> aVar) {
        tn.p.k(aVar, "block");
        boolean z10 = this.isPaused;
        this.isPaused = true;
        try {
            aVar.invoke();
        } finally {
            this.isPaused = z10;
        }
    }
}
