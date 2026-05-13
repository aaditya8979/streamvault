package androidx.compose.runtime;

import androidx.compose.runtime.BroadcastFrameClock;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import com.ironsource.C3978d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import hn.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import jn.f;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: BroadcastFrameClock.kt */
/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001%B\u0019\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J-\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0011\u001a\u00020\u00042\f\b\u0002\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fR\u001c\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0011\u0010\"\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "", "cause", "Lbn/r;", C3978d4.g.f31293e, "", "timeNanos", "sendFrame", "R", "Lkotlin/Function1;", "onFrame", "withFrameNanos", "(Lsn/l;Lhn/c;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancellationException", "cancel", "Lkotlin/Function0;", "onNewAwaiters", "Lsn/a;", "", "lock", "Ljava/lang/Object;", "failureCause", "Ljava/lang/Throwable;", "", "Landroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter;", "awaiters", "Ljava/util/List;", "spareList", "", "getHasAwaiters", "()Z", "hasAwaiters", "<init>", "(Lsn/a;)V", "FrameAwaiter", "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class BroadcastFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;

    @NotNull
    private List<FrameAwaiter<?>> awaiters;

    @Nullable
    private Throwable failureCause;

    @NotNull
    private final Object lock;

    @Nullable
    private final a<r> onNewAwaiters;

    @NotNull
    private List<FrameAwaiter<?>> spareList;

    /* JADX INFO: compiled from: BroadcastFrameClock.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter;", "R", "", "", "timeNanos", "Lbn/r;", CampaignEx.JSON_NATIVE_VIDEO_RESUME, "Lkotlin/Function1;", "onFrame", "Lsn/l;", "getOnFrame", "()Lsn/l;", "Lhn/c;", "continuation", "Lhn/c;", "getContinuation", "()Lhn/c;", "<init>", "(Lsn/l;Lhn/c;)V", "runtime_release"}, k = 1, mv = {1, 6, 0})
    public static final class FrameAwaiter<R> {

        @NotNull
        private final c<R> continuation;

        @NotNull
        private final l<Long, R> onFrame;

        /* JADX WARN: Multi-variable type inference failed */
        public FrameAwaiter(@NotNull l<? super Long, ? extends R> lVar, @NotNull c<? super R> cVar) {
            p.k(lVar, "onFrame");
            p.k(cVar, "continuation");
            this.onFrame = lVar;
            this.continuation = cVar;
        }

        @NotNull
        public final c<R> getContinuation() {
            return this.continuation;
        }

        @NotNull
        public final l<Long, R> getOnFrame() {
            return this.onFrame;
        }

        public final void resume(long j10) {
            Object objM7534constructorimpl;
            c<R> cVar = this.continuation;
            try {
                Result.a aVar = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(this.onFrame.invoke(Long.valueOf(j10)));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            cVar.resumeWith(objM7534constructorimpl);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BroadcastFrameClock() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public BroadcastFrameClock(@Nullable a<r> aVar) {
        this.onNewAwaiters = aVar;
        this.lock = new Object();
        this.awaiters = new ArrayList();
        this.spareList = new ArrayList();
    }

    public /* synthetic */ BroadcastFrameClock(a aVar, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : aVar);
    }

    public static /* synthetic */ void cancel$default(BroadcastFrameClock broadcastFrameClock, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = new CancellationException("clock cancelled");
        }
        broadcastFrameClock.cancel(cancellationException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fail(Throwable th2) {
        synchronized (this.lock) {
            if (this.failureCause != null) {
                return;
            }
            this.failureCause = th2;
            List<FrameAwaiter<?>> list = this.awaiters;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                c<?> continuation = list.get(i10).getContinuation();
                Result.a aVar = Result.Companion;
                continuation.resumeWith(Result.m7534constructorimpl(kotlin.c.a(th2)));
            }
            this.awaiters.clear();
            r rVar = r.f5635a;
        }
    }

    public final void cancel(@NotNull CancellationException cancellationException) {
        p.k(cancellationException, "cancellationException");
        fail(cancellationException);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.d
    public <R> R fold(R r10, @NotNull sn.p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r10, pVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.d.b, kotlin.coroutines.d
    @Nullable
    public <E extends d.b> E get(@NotNull d.c<E> cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    public final boolean getHasAwaiters() {
        boolean z10;
        synchronized (this.lock) {
            z10 = !this.awaiters.isEmpty();
        }
        return z10;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.d
    @NotNull
    public d minusKey(@NotNull d.c<?> cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.d
    @NotNull
    public d plus(@NotNull d dVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, dVar);
    }

    public final void sendFrame(long j10) {
        synchronized (this.lock) {
            List<FrameAwaiter<?>> list = this.awaiters;
            this.awaiters = this.spareList;
            this.spareList = list;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).resume(j10);
            }
            list.clear();
            r rVar = r.f5635a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, androidx.compose.runtime.BroadcastFrameClock$FrameAwaiter] */
    @Override // androidx.compose.runtime.MonotonicFrameClock
    @Nullable
    public <R> Object withFrameNanos(@NotNull l<? super Long, ? extends R> lVar, @NotNull c<? super R> cVar) {
        FrameAwaiter frameAwaiter;
        kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        cVar2.K();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (this.lock) {
            Throwable th2 = this.failureCause;
            if (th2 != null) {
                Result.a aVar = Result.Companion;
                cVar2.resumeWith(Result.m7534constructorimpl(kotlin.c.a(th2)));
            } else {
                ref$ObjectRef.element = new FrameAwaiter(lVar, cVar2);
                boolean z10 = !this.awaiters.isEmpty();
                List list = this.awaiters;
                T t10 = ref$ObjectRef.element;
                if (t10 == 0) {
                    p.C("awaiter");
                    frameAwaiter = null;
                } else {
                    frameAwaiter = (FrameAwaiter) t10;
                }
                list.add(frameAwaiter);
                boolean z11 = !z10;
                cVar2.P(new l<Throwable, r>() { // from class: androidx.compose.runtime.BroadcastFrameClock$withFrameNanos$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ r invoke(Throwable th3) {
                        invoke2(th3);
                        return r.f5635a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Throwable th3) {
                        BroadcastFrameClock.FrameAwaiter frameAwaiter2;
                        Object obj = this.this$0.lock;
                        BroadcastFrameClock broadcastFrameClock = this.this$0;
                        Ref$ObjectRef<BroadcastFrameClock.FrameAwaiter<R>> ref$ObjectRef2 = ref$ObjectRef;
                        synchronized (obj) {
                            List list2 = broadcastFrameClock.awaiters;
                            Object obj2 = ref$ObjectRef2.element;
                            if (obj2 == null) {
                                p.C("awaiter");
                                frameAwaiter2 = null;
                            } else {
                                frameAwaiter2 = (BroadcastFrameClock.FrameAwaiter) obj2;
                            }
                            list2.remove(frameAwaiter2);
                            r rVar = r.f5635a;
                        }
                    }
                });
                if (z11 && this.onNewAwaiters != null) {
                    try {
                        this.onNewAwaiters.invoke();
                    } catch (Throwable th3) {
                        fail(th3);
                    }
                }
            }
        }
        Object objB = cVar2.B();
        if (objB == in.a.g()) {
            f.c(cVar);
        }
        return objB;
    }
}
