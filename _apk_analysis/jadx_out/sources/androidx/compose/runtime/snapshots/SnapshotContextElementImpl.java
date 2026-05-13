package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ExperimentalComposeApi;
import androidx.compose.runtime.snapshots.SnapshotContextElement;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.k2;
import tn.p;

/* JADX INFO: compiled from: SnapshotContextElement.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016R\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotContextElementImpl;", "Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "Ldo/k2;", "Landroidx/compose/runtime/snapshots/Snapshot;", "Lkotlin/coroutines/d;", GAMConfig.KEY_CONTEXT, "updateThreadContext", "oldState", "Lbn/r;", "restoreThreadContext", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "Lkotlin/coroutines/d$c;", "getKey", "()Lkotlin/coroutines/d$c;", "key", "<init>", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "runtime_release"}, k = 1, mv = {1, 6, 0})
@ExperimentalComposeApi
final class SnapshotContextElementImpl implements SnapshotContextElement, k2<Snapshot> {

    @NotNull
    private final Snapshot snapshot;

    public SnapshotContextElementImpl(@NotNull Snapshot snapshot) {
        p.k(snapshot, "snapshot");
        this.snapshot = snapshot;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.d
    public <R> R fold(R r10, @NotNull sn.p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) SnapshotContextElement.DefaultImpls.fold(this, r10, pVar);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.d.b, kotlin.coroutines.d
    @Nullable
    public <E extends d.b> E get(@NotNull d.c<E> cVar) {
        return (E) SnapshotContextElement.DefaultImpls.get(this, cVar);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.d.b
    @NotNull
    public d.c<?> getKey() {
        return SnapshotContextElement.INSTANCE;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.d
    @NotNull
    public d minusKey(@NotNull d.c<?> cVar) {
        return SnapshotContextElement.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.d
    @NotNull
    public d plus(@NotNull d dVar) {
        return SnapshotContextElement.DefaultImpls.plus(this, dVar);
    }

    @Override // p000do.k2
    public void restoreThreadContext(@NotNull d dVar, @Nullable Snapshot snapshot) {
        p.k(dVar, GAMConfig.KEY_CONTEXT);
        this.snapshot.unsafeLeave(snapshot);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000do.k2
    @Nullable
    public Snapshot updateThreadContext(@NotNull d context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return this.snapshot.unsafeEnter();
    }
}
