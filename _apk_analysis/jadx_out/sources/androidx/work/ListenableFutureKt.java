package androidx.work;

import androidx.annotation.RestrictTo;
import bn.r;
import c8.i;
import hn.c;
import java.util.concurrent.ExecutionException;
import jn.f;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.n;

/* JADX INFO: compiled from: ListenableFuture.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087Hø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"R", "Lc8/i;", "await", "(Lc8/i;Lhn/c;)Ljava/lang/Object;", "work-runtime-ktx_release"}, k = 2, mv = {1, 7, 1})
public final class ListenableFutureKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public static final <R> Object await(@NotNull i<R> iVar, @NotNull c<? super R> cVar) throws Throwable {
        if (iVar.isDone()) {
            try {
                return iVar.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        }
        kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        cVar2.K();
        iVar.addListener(new ListenableFutureKt$await$2$1(cVar2, iVar), DirectExecutor.INSTANCE);
        cVar2.P(new ListenableFutureKt$await$2$2(iVar));
        Object objB = cVar2.B();
        if (objB == in.a.g()) {
            f.c(cVar);
        }
        return objB;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private static final <R> Object await$$forInline(i<R> iVar, c<? super R> cVar) throws Throwable {
        if (iVar.isDone()) {
            try {
                return iVar.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw e10;
            }
        }
        n.c(0);
        kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        cVar2.K();
        iVar.addListener(new ListenableFutureKt$await$2$1(cVar2, iVar), DirectExecutor.INSTANCE);
        cVar2.P(new ListenableFutureKt$await$2$2(iVar));
        r rVar = r.f5635a;
        Object objB = cVar2.B();
        if (objB == in.a.g()) {
            f.c(cVar);
        }
        n.c(1);
        return objB;
    }
}
