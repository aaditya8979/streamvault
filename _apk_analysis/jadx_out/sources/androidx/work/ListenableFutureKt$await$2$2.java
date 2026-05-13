package androidx.work;

import bn.r;
import c8.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import sn.l;

/* JADX INFO: compiled from: ListenableFuture.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lbn/r;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class ListenableFutureKt$await$2$2 extends Lambda implements l<Throwable, r> {
    public final /* synthetic */ i<R> $this_await;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListenableFutureKt$await$2$2(i<R> iVar) {
        super(1);
        this.$this_await = iVar;
    }

    @Override // sn.l
    public /* bridge */ /* synthetic */ r invoke(Throwable th2) {
        invoke2(th2);
        return r.f5635a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th2) {
        this.$this_await.cancel(false);
    }
}
