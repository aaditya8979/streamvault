package androidx.compose.runtime;

import bn.r;
import hn.c;
import in.a;
import jn.f;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0003J\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/ProduceFrameSignal;", "", "lock", "Lbn/r;", "awaitFrameRequest", "(Ljava/lang/Object;Lhn/c;)Ljava/lang/Object;", "takeFrameRequestLocked", "Lhn/c;", "requestFrameLocked", "pendingFrameContinuation", "Ljava/lang/Object;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 6, 0})
final class ProduceFrameSignal {

    @Nullable
    private Object pendingFrameContinuation;

    @Nullable
    public final Object awaitFrameRequest(@NotNull Object obj, @NotNull c<? super r> cVar) {
        kotlinx.coroutines.c cVar2;
        synchronized (obj) {
            if (this.pendingFrameContinuation == RecomposerKt.ProduceAnotherFrame) {
                this.pendingFrameContinuation = RecomposerKt.FramePending;
                return r.f5635a;
            }
            r rVar = r.f5635a;
            kotlinx.coroutines.c cVar3 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
            cVar3.K();
            synchronized (obj) {
                if (this.pendingFrameContinuation == RecomposerKt.ProduceAnotherFrame) {
                    this.pendingFrameContinuation = RecomposerKt.FramePending;
                    cVar2 = cVar3;
                } else {
                    this.pendingFrameContinuation = cVar3;
                    cVar2 = null;
                }
            }
            if (cVar2 != null) {
                Result.a aVar = Result.Companion;
                cVar2.resumeWith(Result.m7534constructorimpl(r.f5635a));
            }
            Object objB = cVar3.B();
            if (objB == a.g()) {
                f.c(cVar);
            }
            return objB == a.g() ? objB : r.f5635a;
        }
    }

    @Nullable
    public final c<r> requestFrameLocked() {
        Object obj = this.pendingFrameContinuation;
        if (obj instanceof c) {
            this.pendingFrameContinuation = RecomposerKt.FramePending;
            return (c) obj;
        }
        if (p.f(obj, RecomposerKt.ProduceAnotherFrame) ? true : p.f(obj, RecomposerKt.FramePending)) {
            return null;
        }
        if (obj == null) {
            this.pendingFrameContinuation = RecomposerKt.ProduceAnotherFrame;
            return null;
        }
        throw new IllegalStateException(("invalid pendingFrameContinuation " + obj).toString());
    }

    public final void takeFrameRequestLocked() {
        if (!(this.pendingFrameContinuation == RecomposerKt.FramePending)) {
            throw new IllegalStateException("frame not pending".toString());
        }
        this.pendingFrameContinuation = null;
    }
}
