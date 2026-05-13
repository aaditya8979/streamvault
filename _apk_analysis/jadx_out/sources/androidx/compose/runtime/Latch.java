package androidx.compose.runtime;

import bn.r;
import hn.c;
import in.a;
import java.util.ArrayList;
import java.util.List;
import jn.f;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.k;
import sn.l;
import tn.n;
import tn.p;

/* JADX INFO: compiled from: Latch.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J\u0013\u0010\n\u001a\u00020\u0007H\u0086@ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/Latch;", "", "R", "Lkotlin/Function0;", "block", "withClosed", "(Lsn/a;)Ljava/lang/Object;", "Lbn/r;", "closeLatch", "openLatch", "await", "(Lhn/c;)Ljava/lang/Object;", "lock", "Ljava/lang/Object;", "", "Lhn/c;", "awaiters", "Ljava/util/List;", "spareList", "", "_isOpen", "Z", "isOpen", "()Z", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class Latch {

    @NotNull
    private final Object lock = new Object();

    @NotNull
    private List<c<r>> awaiters = new ArrayList();

    @NotNull
    private List<c<r>> spareList = new ArrayList();
    private boolean _isOpen = true;

    @Nullable
    public final Object await(@NotNull c<? super r> cVar) {
        if (isOpen()) {
            return r.f5635a;
        }
        final kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        cVar2.K();
        synchronized (this.lock) {
            this.awaiters.add(cVar2);
        }
        cVar2.P(new l<Throwable, r>() { // from class: androidx.compose.runtime.Latch$await$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Throwable th2) {
                invoke2(th2);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th2) {
                Object obj = this.this$0.lock;
                Latch latch = this.this$0;
                k<r> kVar = cVar2;
                synchronized (obj) {
                    latch.awaiters.remove(kVar);
                    r rVar = r.f5635a;
                }
            }
        });
        Object objB = cVar2.B();
        if (objB == a.g()) {
            f.c(cVar);
        }
        return objB == a.g() ? objB : r.f5635a;
    }

    public final void closeLatch() {
        synchronized (this.lock) {
            this._isOpen = false;
            r rVar = r.f5635a;
        }
    }

    public final boolean isOpen() {
        boolean z10;
        synchronized (this.lock) {
            z10 = this._isOpen;
        }
        return z10;
    }

    public final void openLatch() {
        synchronized (this.lock) {
            if (isOpen()) {
                return;
            }
            List<c<r>> list = this.awaiters;
            this.awaiters = this.spareList;
            this.spareList = list;
            this._isOpen = true;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                c<r> cVar = list.get(i10);
                Result.a aVar = Result.Companion;
                cVar.resumeWith(Result.m7534constructorimpl(r.f5635a));
            }
            list.clear();
            r rVar = r.f5635a;
        }
    }

    public final <R> R withClosed(@NotNull sn.a<? extends R> block) {
        p.k(block, "block");
        closeLatch();
        try {
            return block.invoke();
        } finally {
            n.b(1);
            openLatch();
            n.a(1);
        }
    }
}
