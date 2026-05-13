package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import bn.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import p000do.w0;
import sn.p;

/* JADX INFO: compiled from: PausingDispatcher.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class PausingDispatcherKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2, reason: invalid class name */
    /* JADX INFO: compiled from: PausingDispatcher.kt */
    @jn.d(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = {203}, m = "invokeSuspend")
    public static final class AnonymousClass2<T> extends SuspendLambda implements p<l0, hn.c<? super T>, Object> {
        public final /* synthetic */ p<l0, hn.c<? super T>, Object> $block;
        public final /* synthetic */ Lifecycle.State $minState;
        public final /* synthetic */ Lifecycle $this_whenStateAtLeast;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Lifecycle lifecycle, Lifecycle.State state, p<? super l0, ? super hn.c<? super T>, ? extends Object> pVar, hn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$this_whenStateAtLeast = lifecycle;
            this.$minState = state;
            this.$block = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_whenStateAtLeast, this.$minState, this.$block, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super T> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            LifecycleController lifecycleController;
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lifecycleController = (LifecycleController) this.L$0;
                try {
                    kotlin.c.b(obj);
                    lifecycleController.finish();
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    lifecycleController.finish();
                    throw th;
                }
            }
            kotlin.c.b(obj);
            kotlinx.coroutines.g gVar = (kotlinx.coroutines.g) ((l0) this.L$0).getCoroutineContext().get(kotlinx.coroutines.g.H8);
            if (gVar == null) {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
            PausingDispatcher pausingDispatcher = new PausingDispatcher();
            LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, gVar);
            try {
                p<l0, hn.c<? super T>, Object> pVar = this.$block;
                this.L$0 = lifecycleController2;
                this.label = 1;
                obj = p000do.g.g(pausingDispatcher, pVar, this);
                if (obj == objG) {
                    return objG;
                }
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                return obj;
            } catch (Throwable th3) {
                th = th3;
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                throw th;
            }
        }
    }

    @Nullable
    public static final <T> Object whenCreated(@NotNull Lifecycle lifecycle, @NotNull p<? super l0, ? super hn.c<? super T>, ? extends Object> pVar, @NotNull hn.c<? super T> cVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, pVar, cVar);
    }

    @Nullable
    public static final <T> Object whenCreated(@NotNull LifecycleOwner lifecycleOwner, @NotNull p<? super l0, ? super hn.c<? super T>, ? extends Object> pVar, @NotNull hn.c<? super T> cVar) {
        return whenCreated(lifecycleOwner.getLifecycle(), pVar, cVar);
    }

    @Nullable
    public static final <T> Object whenResumed(@NotNull Lifecycle lifecycle, @NotNull p<? super l0, ? super hn.c<? super T>, ? extends Object> pVar, @NotNull hn.c<? super T> cVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, pVar, cVar);
    }

    @Nullable
    public static final <T> Object whenResumed(@NotNull LifecycleOwner lifecycleOwner, @NotNull p<? super l0, ? super hn.c<? super T>, ? extends Object> pVar, @NotNull hn.c<? super T> cVar) {
        return whenResumed(lifecycleOwner.getLifecycle(), pVar, cVar);
    }

    @Nullable
    public static final <T> Object whenStarted(@NotNull Lifecycle lifecycle, @NotNull p<? super l0, ? super hn.c<? super T>, ? extends Object> pVar, @NotNull hn.c<? super T> cVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, pVar, cVar);
    }

    @Nullable
    public static final <T> Object whenStarted(@NotNull LifecycleOwner lifecycleOwner, @NotNull p<? super l0, ? super hn.c<? super T>, ? extends Object> pVar, @NotNull hn.c<? super T> cVar) {
        return whenStarted(lifecycleOwner.getLifecycle(), pVar, cVar);
    }

    @Nullable
    public static final <T> Object whenStateAtLeast(@NotNull Lifecycle lifecycle, @NotNull Lifecycle.State state, @NotNull p<? super l0, ? super hn.c<? super T>, ? extends Object> pVar, @NotNull hn.c<? super T> cVar) {
        return p000do.g.g(w0.c().M(), new AnonymousClass2(lifecycle, state, pVar, null), cVar);
    }
}
