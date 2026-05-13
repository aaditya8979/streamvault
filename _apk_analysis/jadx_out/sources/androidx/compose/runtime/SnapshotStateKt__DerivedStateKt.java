package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import bn.h;
import bn.r;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import sn.a;
import sn.l;
import tn.n;
import tn.p;

/* JADX INFO: compiled from: DerivedState.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a0\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0082\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u001aL\u0010\u0010\u001a\u00020\r\"\u0004\b\u0000\u0010\u00002\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\r0\f2\u0016\u0010\u000f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0000\"P\u0010\u0015\u001a>\u0012:\u00128\u00124\u00122\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\r0\f\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\r0\f0\u0013j\u0002`\u00140\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016*d\b\u0002\u0010\u0019\".\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\r0\f\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\r0\f0\u00132.\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\r0\f\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\r0\f0\u0013¨\u0006\u001a"}, d2 = {"R", "Landroidx/compose/runtime/DerivedState;", "derivedState", "Lkotlin/Function0;", "block", "notifyObservers$SnapshotStateKt__DerivedStateKt", "(Landroidx/compose/runtime/DerivedState;Lsn/a;)Ljava/lang/Object;", "notifyObservers", "T", "calculation", "Landroidx/compose/runtime/State;", "derivedStateOf", "Lkotlin/Function1;", "Lbn/r;", "start", "done", "observeDerivedStateRecalculations", "Landroidx/compose/runtime/SnapshotThreadLocal;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Lkotlin/Pair;", "Landroidx/compose/runtime/DerivedStateObservers;", "derivedStateObservers", "Landroidx/compose/runtime/SnapshotThreadLocal;", "", "isCalculationBlockRunning", "DerivedStateObservers", "runtime_release"}, k = 5, mv = {1, 6, 0}, xs = "androidx/compose/runtime/SnapshotStateKt")
final /* synthetic */ class SnapshotStateKt__DerivedStateKt {

    @NotNull
    private static final SnapshotThreadLocal<PersistentList<Pair<l<DerivedState<?>, r>, l<DerivedState<?>, r>>>> derivedStateObservers = new SnapshotThreadLocal<>();

    @NotNull
    private static final SnapshotThreadLocal<Boolean> isCalculationBlockRunning = new SnapshotThreadLocal<>();

    @NotNull
    public static final <T> State<T> derivedStateOf(@NotNull a<? extends T> aVar) {
        p.k(aVar, "calculation");
        return new DerivedSnapshotState(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <R> R notifyObservers$SnapshotStateKt__DerivedStateKt(DerivedState<?> derivedState, a<? extends R> aVar) {
        PersistentList persistentListPersistentListOf = (PersistentList) derivedStateObservers.get();
        if (persistentListPersistentListOf == null) {
            persistentListPersistentListOf = ExtensionsKt.persistentListOf();
        }
        int size = persistentListPersistentListOf.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            ((l) ((Pair) persistentListPersistentListOf.get(i11)).component1()).invoke(derivedState);
        }
        try {
            return aVar.invoke();
        } finally {
            n.b(1);
            int size2 = persistentListPersistentListOf.size();
            while (i10 < size2) {
                ((l) ((Pair) persistentListPersistentListOf.get(i10)).component2()).invoke(derivedState);
                i10++;
            }
            n.a(1);
        }
    }

    public static final <R> void observeDerivedStateRecalculations(@NotNull l<? super State<?>, r> lVar, @NotNull l<? super State<?>, r> lVar2, @NotNull a<? extends R> aVar) {
        p.k(lVar, "start");
        p.k(lVar2, "done");
        p.k(aVar, "block");
        SnapshotThreadLocal<PersistentList<Pair<l<DerivedState<?>, r>, l<DerivedState<?>, r>>>> snapshotThreadLocal = derivedStateObservers;
        PersistentList<Pair<l<DerivedState<?>, r>, l<DerivedState<?>, r>>> persistentList = snapshotThreadLocal.get();
        try {
            PersistentList<Pair<l<DerivedState<?>, r>, l<DerivedState<?>, r>>> persistentListPersistentListOf = snapshotThreadLocal.get();
            if (persistentListPersistentListOf == null) {
                persistentListPersistentListOf = ExtensionsKt.persistentListOf();
            }
            snapshotThreadLocal.set(persistentListPersistentListOf.add(h.a(lVar, lVar2)));
            aVar.invoke();
            snapshotThreadLocal.set(persistentList);
        } catch (Throwable th2) {
            derivedStateObservers.set(persistentList);
            throw th2;
        }
    }
}
