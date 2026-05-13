package ml;

import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: CopyOnWriteHashMap.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class b<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f74326a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, VideoLookHistoryEntry.CURRNET);

    @NotNull
    private volatile /* synthetic */ Object current = kotlin.collections.a.j();

    @Nullable
    public final V a(@NotNull K k10) {
        p.k(k10, "key");
        return (V) ((Map) this.current).get(k10);
    }
}
