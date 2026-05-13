package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import bn.r;
import fo.m;
import fo.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class FlowExtKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1, reason: invalid class name */
    /* JADX INFO: compiled from: FlowExt.kt */
    @jn.d(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {91}, m = "invokeSuspend")
    public static final class AnonymousClass1<T> extends SuspendLambda implements p<m<? super T>, hn.c<? super r>, Object> {
        public final /* synthetic */ Lifecycle $lifecycle;
        public final /* synthetic */ Lifecycle.State $minActiveState;
        public final /* synthetic */ go.d<T> $this_flowWithLifecycle;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: FlowExt.kt */
        @jn.d(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend")
        public static final class C01071 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
            public final /* synthetic */ m<T> $$this$callbackFlow;
            public final /* synthetic */ go.d<T> $this_flowWithLifecycle;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C01071(go.d<? extends T> dVar, m<? super T> mVar, hn.c<? super C01071> cVar) {
                super(2, cVar);
                this.$this_flowWithLifecycle = dVar;
                this.$$this$callbackFlow = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
                return new C01071(this.$this_flowWithLifecycle, this.$$this$callbackFlow, cVar);
            }

            @Override // sn.p
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
                return ((C01071) create(l0Var, cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = in.a.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    go.d<T> dVar = this.$this_flowWithLifecycle;
                    final m<T> mVar = this.$$this$callbackFlow;
                    go.e<? super T> eVar = new go.e() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                        @Override // go.e
                        @Nullable
                        public final Object emit(T t10, @NotNull hn.c<? super r> cVar) {
                            Object objI = mVar.I(t10, cVar);
                            return objI == in.a.g() ? objI : r.f5635a;
                        }
                    };
                    this.label = 1;
                    if (dVar.collect(eVar, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                return r.f5635a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, go.d<? extends T> dVar, hn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$lifecycle = lifecycle;
            this.$minActiveState = state;
            this.$this_flowWithLifecycle = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull m<? super T> mVar, @Nullable hn.c<? super r> cVar) {
            return ((AnonymousClass1) create(mVar, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            m mVar;
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                m mVar2 = (m) this.L$0;
                Lifecycle lifecycle = this.$lifecycle;
                Lifecycle.State state = this.$minActiveState;
                C01071 c01071 = new C01071(this.$this_flowWithLifecycle, mVar2, null);
                this.L$0 = mVar2;
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c01071, this) == objG) {
                    return objG;
                }
                mVar = mVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mVar = (m) this.L$0;
                kotlin.c.b(obj);
            }
            p.a.a(mVar, null, 1, null);
            return r.f5635a;
        }
    }

    @NotNull
    public static final <T> go.d<T> flowWithLifecycle(@NotNull go.d<? extends T> dVar, @NotNull Lifecycle lifecycle, @NotNull Lifecycle.State state) {
        tn.p.k(dVar, "<this>");
        tn.p.k(lifecycle, "lifecycle");
        tn.p.k(state, "minActiveState");
        return go.f.f(new AnonymousClass1(lifecycle, state, dVar, null));
    }

    public static /* synthetic */ go.d flowWithLifecycle$default(go.d dVar, Lifecycle lifecycle, Lifecycle.State state, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(dVar, lifecycle, state);
    }
}
