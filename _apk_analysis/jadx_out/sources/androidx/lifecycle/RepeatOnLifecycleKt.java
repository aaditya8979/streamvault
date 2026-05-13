package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import bn.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import p000do.w0;
import p000do.y1;
import sn.p;

/* JADX INFO: compiled from: RepeatOnLifecycle.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class RepeatOnLifecycleKt {

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3, reason: invalid class name */
    /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
    @jn.d(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {84}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
        public final /* synthetic */ p<l0, hn.c<? super r>, Object> $block;
        public final /* synthetic */ Lifecycle.State $state;
        public final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
        @jn.d(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {166}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
            public final /* synthetic */ l0 $$this$coroutineScope;
            public final /* synthetic */ p<l0, hn.c<? super r>, Object> $block;
            public final /* synthetic */ Lifecycle.State $state;
            public final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
            public Object L$0;
            public Object L$1;
            public Object L$2;
            public Object L$3;
            public Object L$4;
            public Object L$5;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, l0 l0Var, p<? super l0, ? super hn.c<? super r>, ? extends Object> pVar, hn.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$this_repeatOnLifecycle = lifecycle;
                this.$state = state;
                this.$$this$coroutineScope = l0Var;
                this.$block = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
                return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, cVar);
            }

            @Override // sn.p
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
                return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
            /* JADX WARN: Type inference failed for: r10v0, types: [T, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, java.lang.Object] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r17) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 221
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt.AnonymousClass3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Lifecycle lifecycle, Lifecycle.State state, p<? super l0, ? super hn.c<? super r>, ? extends Object> pVar, hn.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$block = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$this_repeatOnLifecycle, this.$state, this.$block, cVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
            return ((AnonymousClass3) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                l0 l0Var = (l0) this.L$0;
                y1 y1VarM = w0.c().M();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, l0Var, this.$block, null);
                this.label = 1;
                if (p000do.g.g(y1VarM, anonymousClass1, this) == objG) {
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

    @Nullable
    public static final Object repeatOnLifecycle(@NotNull Lifecycle lifecycle, @NotNull Lifecycle.State state, @NotNull p<? super l0, ? super hn.c<? super r>, ? extends Object> pVar, @NotNull hn.c<? super r> cVar) {
        Object objF;
        if (state != Lifecycle.State.INITIALIZED) {
            return (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED && (objF = kotlinx.coroutines.d.f(new AnonymousClass3(lifecycle, state, pVar, null), cVar)) == in.a.g()) ? objF : r.f5635a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
    }

    @Nullable
    public static final Object repeatOnLifecycle(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.State state, @NotNull p<? super l0, ? super hn.c<? super r>, ? extends Object> pVar, @NotNull hn.c<? super r> cVar) {
        Object objRepeatOnLifecycle = repeatOnLifecycle(lifecycleOwner.getLifecycle(), state, pVar, cVar);
        return objRepeatOnLifecycle == in.a.g() ? objRepeatOnLifecycle : r.f5635a;
    }
}
