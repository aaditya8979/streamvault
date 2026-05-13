package androidx.compose.ui.platform;

import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InfiniteAnimationPolicy.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/InfiniteAnimationPolicy;", "Lkotlin/coroutines/d$b;", "R", "Lkotlin/Function1;", "Lhn/c;", "", "block", "onInfiniteOperation", "(Lsn/l;Lhn/c;)Ljava/lang/Object;", "Lkotlin/coroutines/d$c;", "getKey", "()Lkotlin/coroutines/d$c;", "key", "Key", "ui_release"}, k = 1, mv = {1, 6, 0})
public interface InfiniteAnimationPolicy extends d.b {

    /* JADX INFO: renamed from: Key, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: InfiniteAnimationPolicy.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <R> R fold(@NotNull InfiniteAnimationPolicy infiniteAnimationPolicy, R r10, @NotNull sn.p<? super R, ? super d.b, ? extends R> pVar) {
            tn.p.k(pVar, "operation");
            return (R) d.b.a.a(infiniteAnimationPolicy, r10, pVar);
        }

        @Nullable
        public static <E extends d.b> E get(@NotNull InfiniteAnimationPolicy infiniteAnimationPolicy, @NotNull d.c<E> cVar) {
            tn.p.k(cVar, "key");
            return (E) d.b.a.b(infiniteAnimationPolicy, cVar);
        }

        @Deprecated
        @NotNull
        public static d.c<?> getKey(@NotNull InfiniteAnimationPolicy infiniteAnimationPolicy) {
            return InfiniteAnimationPolicy.super.getKey();
        }

        @NotNull
        public static kotlin.coroutines.d minusKey(@NotNull InfiniteAnimationPolicy infiniteAnimationPolicy, @NotNull d.c<?> cVar) {
            tn.p.k(cVar, "key");
            return d.b.a.c(infiniteAnimationPolicy, cVar);
        }

        @NotNull
        public static kotlin.coroutines.d plus(@NotNull InfiniteAnimationPolicy infiniteAnimationPolicy, @NotNull kotlin.coroutines.d dVar) {
            tn.p.k(dVar, GAMConfig.KEY_CONTEXT);
            return d.b.a.d(infiniteAnimationPolicy, dVar);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.InfiniteAnimationPolicy$Key, reason: from kotlin metadata */
    /* JADX INFO: compiled from: InfiniteAnimationPolicy.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/InfiniteAnimationPolicy$Key;", "Lkotlin/coroutines/d$c;", "Landroidx/compose/ui/platform/InfiniteAnimationPolicy;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion implements d.c<InfiniteAnimationPolicy> {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Override // kotlin.coroutines.d
    /* synthetic */ <R> R fold(R r10, @NotNull sn.p<? super R, ? super d.b, ? extends R> pVar);

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @Nullable
    /* synthetic */ <E extends d.b> E get(@NotNull d.c<E> cVar);

    @Override // kotlin.coroutines.d.b
    @NotNull
    default d.c<?> getKey() {
        return INSTANCE;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    /* synthetic */ kotlin.coroutines.d minusKey(@NotNull d.c<?> cVar);

    @Nullable
    <R> Object onInfiniteOperation(@NotNull sn.l<? super hn.c<? super R>, ? extends Object> lVar, @NotNull hn.c<? super R> cVar);

    @Override // kotlin.coroutines.d
    @NotNull
    /* synthetic */ kotlin.coroutines.d plus(@NotNull kotlin.coroutines.d dVar);
}
