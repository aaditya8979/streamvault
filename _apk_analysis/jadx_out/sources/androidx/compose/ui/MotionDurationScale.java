package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;

/* JADX INFO: compiled from: MotionDurationScale.kt */
/* JADX INFO: loaded from: classes6.dex */
@Stable
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/MotionDurationScale;", "Lkotlin/coroutines/d$b;", "", "getScaleFactor", "()F", "scaleFactor", "Lkotlin/coroutines/d$c;", "getKey", "()Lkotlin/coroutines/d$c;", "key", "Key", "ui_release"}, k = 1, mv = {1, 6, 0})
public interface MotionDurationScale extends d.b {

    /* JADX INFO: renamed from: Key, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: MotionDurationScale.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <R> R fold(@NotNull MotionDurationScale motionDurationScale, R r10, @NotNull p<? super R, ? super d.b, ? extends R> pVar) {
            tn.p.k(pVar, "operation");
            return (R) d.b.a.a(motionDurationScale, r10, pVar);
        }

        @Nullable
        public static <E extends d.b> E get(@NotNull MotionDurationScale motionDurationScale, @NotNull d.c<E> cVar) {
            tn.p.k(cVar, "key");
            return (E) d.b.a.b(motionDurationScale, cVar);
        }

        @NotNull
        public static d minusKey(@NotNull MotionDurationScale motionDurationScale, @NotNull d.c<?> cVar) {
            tn.p.k(cVar, "key");
            return d.b.a.c(motionDurationScale, cVar);
        }

        @NotNull
        public static d plus(@NotNull MotionDurationScale motionDurationScale, @NotNull d dVar) {
            tn.p.k(dVar, GAMConfig.KEY_CONTEXT);
            return d.b.a.d(motionDurationScale, dVar);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.MotionDurationScale$Key, reason: from kotlin metadata */
    /* JADX INFO: compiled from: MotionDurationScale.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/MotionDurationScale$Key;", "Lkotlin/coroutines/d$c;", "Landroidx/compose/ui/MotionDurationScale;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion implements d.c<MotionDurationScale> {
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
    default d.c<?> getKey() {
        return INSTANCE;
    }

    float getScaleFactor();

    @Override // kotlin.coroutines.d
    @NotNull
    /* synthetic */ d minusKey(@NotNull d.c<?> cVar);

    @Override // kotlin.coroutines.d
    @NotNull
    /* synthetic */ d plus(@NotNull d dVar);
}
