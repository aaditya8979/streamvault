package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import bn.r;
import hn.c;
import in.a;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.g;
import p000do.l0;
import p000do.s0;
import p000do.w0;
import sn.l;
import sn.p;

/* JADX INFO: compiled from: ActualAndroid.android.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/SdkStubsFallbackFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "R", "Lkotlin/Function1;", "", "onFrame", "withFrameNanos", "(Lsn/l;Lhn/c;)Ljava/lang/Object;", "DefaultFrameDelay", "J", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 6, 0})
final class SdkStubsFallbackFrameClock implements MonotonicFrameClock {
    private static final long DefaultFrameDelay = 16;

    @NotNull
    public static final SdkStubsFallbackFrameClock INSTANCE = new SdkStubsFallbackFrameClock();

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2, reason: invalid class name */
    /* JADX INFO: compiled from: ActualAndroid.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Ldo/l0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @d(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", l = {51}, m = "invokeSuspend")
    public static final class AnonymousClass2<R> extends SuspendLambda implements p<l0, c<? super R>, Object> {
        public final /* synthetic */ l<Long, R> $onFrame;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(l<? super Long, ? extends R> lVar, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$onFrame = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return new AnonymousClass2(this.$onFrame, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super R> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                this.label = 1;
                if (s0.a(16L, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return this.$onFrame.invoke(jn.a.e(System.nanoTime()));
        }
    }

    private SdkStubsFallbackFrameClock() {
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.d
    public <R> R fold(R r10, @NotNull p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r10, pVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.d.b, kotlin.coroutines.d
    @Nullable
    public <E extends d.b> E get(@NotNull d.c<E> cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.d
    @NotNull
    public kotlin.coroutines.d minusKey(@NotNull d.c<?> cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.d
    @NotNull
    public kotlin.coroutines.d plus(@NotNull kotlin.coroutines.d dVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, dVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    @Nullable
    public <R> Object withFrameNanos(@NotNull l<? super Long, ? extends R> lVar, @NotNull c<? super R> cVar) {
        return g.g(w0.c(), new AnonymousClass2(lVar, null), cVar);
    }
}
