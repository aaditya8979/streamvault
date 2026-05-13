package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ExperimentalComposeApi;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;

/* JADX INFO: compiled from: SnapshotContextElement.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "Lkotlin/coroutines/d$b;", "Key", "runtime_release"}, k = 1, mv = {1, 6, 0})
@ExperimentalComposeApi
public interface SnapshotContextElement extends d.b {

    /* JADX INFO: renamed from: Key, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: SnapshotContextElement.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <R> R fold(@NotNull SnapshotContextElement snapshotContextElement, R r10, @NotNull p<? super R, ? super d.b, ? extends R> pVar) {
            tn.p.k(pVar, "operation");
            return (R) d.b.a.a(snapshotContextElement, r10, pVar);
        }

        @Nullable
        public static <E extends d.b> E get(@NotNull SnapshotContextElement snapshotContextElement, @NotNull d.c<E> cVar) {
            tn.p.k(cVar, "key");
            return (E) d.b.a.b(snapshotContextElement, cVar);
        }

        @NotNull
        public static d minusKey(@NotNull SnapshotContextElement snapshotContextElement, @NotNull d.c<?> cVar) {
            tn.p.k(cVar, "key");
            return d.b.a.c(snapshotContextElement, cVar);
        }

        @NotNull
        public static d plus(@NotNull SnapshotContextElement snapshotContextElement, @NotNull d dVar) {
            tn.p.k(dVar, GAMConfig.KEY_CONTEXT);
            return d.b.a.d(snapshotContextElement, dVar);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotContextElement$Key, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SnapshotContextElement.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotContextElement$Key;", "Lkotlin/coroutines/d$c;", "Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion implements d.c<SnapshotContextElement> {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Override // kotlin.coroutines.d
    /* synthetic */ <R> R fold(R r10, @NotNull p<? super R, ? super d.b, ? extends R> pVar);

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @Nullable
    /* synthetic */ <E extends d.b> E get(@NotNull d.c<E> cVar);

    @Override // kotlin.coroutines.d.b
    @NotNull
    /* synthetic */ d.c<?> getKey();

    @Override // kotlin.coroutines.d
    @NotNull
    /* synthetic */ d minusKey(@NotNull d.c<?> cVar);

    @Override // kotlin.coroutines.d
    @NotNull
    /* synthetic */ d plus(@NotNull d dVar);
}
