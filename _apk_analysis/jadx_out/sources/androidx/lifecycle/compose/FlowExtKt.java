package androidx.lifecycle.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import bn.r;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import go.u;
import hn.c;
import in.a;
import jn.d;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class FlowExtKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1, reason: invalid class name */
    /* JADX INFO: compiled from: FlowExt.kt */
    @d(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1", f = "FlowExt.kt", l = {171}, m = "invokeSuspend")
    public static final class AnonymousClass1<T> extends SuspendLambda implements p<ProduceStateScope<T>, c<? super r>, Object> {
        public final /* synthetic */ kotlin.coroutines.d $context;
        public final /* synthetic */ Lifecycle $lifecycle;
        public final /* synthetic */ Lifecycle.State $minActiveState;
        public final /* synthetic */ go.d<T> $this_collectAsStateWithLifecycle;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: FlowExt.kt */
        @d(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", l = {TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 174}, m = "invokeSuspend")
        public static final class C01091 extends SuspendLambda implements p<l0, c<? super r>, Object> {
            public final /* synthetic */ ProduceStateScope<T> $$this$produceState;
            public final /* synthetic */ kotlin.coroutines.d $context;
            public final /* synthetic */ go.d<T> $this_collectAsStateWithLifecycle;
            public int label;

            /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: FlowExt.kt */
            @d(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$2", f = "FlowExt.kt", l = {HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION}, m = "invokeSuspend")
            public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super r>, Object> {
                public final /* synthetic */ ProduceStateScope<T> $$this$produceState;
                public final /* synthetic */ go.d<T> $this_collectAsStateWithLifecycle;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass2(go.d<? extends T> dVar, ProduceStateScope<T> produceStateScope, c<? super AnonymousClass2> cVar) {
                    super(2, cVar);
                    this.$this_collectAsStateWithLifecycle = dVar;
                    this.$$this$produceState = produceStateScope;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                    return new AnonymousClass2(this.$this_collectAsStateWithLifecycle, this.$$this$produceState, cVar);
                }

                @Override // sn.p
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
                    return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
                }

                /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type hn.c to androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$2 for r4v1 'this'  hn.c
                    	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                    	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                    	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                    	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                    	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                    */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @org.jetbrains.annotations.Nullable
                public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
                    /*
                        r4 = this;
                        java.lang.Object r0 = in.a.g()
                        int r1 = r4.label
                        r2 = 1
                        if (r1 == 0) goto L17
                        if (r1 != r2) goto Lf
                        kotlin.c.b(r5)
                        goto L2c
                    Lf:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L17:
                        kotlin.c.b(r5)
                        go.d<T> r5 = r4.$this_collectAsStateWithLifecycle
                        androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$2$1 r1 = new androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$2$1
                        androidx.compose.runtime.ProduceStateScope<T> r3 = r4.$$this$produceState
                        r1.<init>()
                        r4.label = r2
                        java.lang.Object r5 = r5.collect(r1, r4)
                        if (r5 != r0) goto L2c
                        return r0
                    L2c:
                        bn.r r5 = bn.r.f5635a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.FlowExtKt.AnonymousClass1.C01091.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C01091(kotlin.coroutines.d dVar, go.d<? extends T> dVar2, ProduceStateScope<T> produceStateScope, c<? super C01091> cVar) {
                super(2, cVar);
                this.$context = dVar;
                this.$this_collectAsStateWithLifecycle = dVar2;
                this.$$this$produceState = produceStateScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                return new C01091(this.$context, this.$this_collectAsStateWithLifecycle, this.$$this$produceState, cVar);
            }

            @Override // sn.p
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
                return ((C01091) create(l0Var, cVar)).invokeSuspend(r.f5635a);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type hn.c to androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1 for r6v1 'this'  hn.c
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = in.a.g()
                    int r1 = r6.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1b
                    if (r1 == r3) goto L17
                    if (r1 != r2) goto Lf
                    goto L17
                Lf:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L17:
                    kotlin.c.b(r7)
                    goto L4f
                L1b:
                    kotlin.c.b(r7)
                    kotlin.coroutines.d r7 = r6.$context
                    kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
                    boolean r7 = tn.p.f(r7, r1)
                    if (r7 == 0) goto L3a
                    go.d<T> r7 = r6.$this_collectAsStateWithLifecycle
                    androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1 r1 = new androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1
                    androidx.compose.runtime.ProduceStateScope<T> r2 = r6.$$this$produceState
                    r1.<init>()
                    r6.label = r3
                    java.lang.Object r7 = r7.collect(r1, r6)
                    if (r7 != r0) goto L4f
                    return r0
                L3a:
                    kotlin.coroutines.d r7 = r6.$context
                    androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$2 r1 = new androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$2
                    go.d<T> r3 = r6.$this_collectAsStateWithLifecycle
                    androidx.compose.runtime.ProduceStateScope<T> r4 = r6.$$this$produceState
                    r5 = 0
                    r1.<init>(r3, r4, r5)
                    r6.label = r2
                    java.lang.Object r7 = p000do.g.g(r7, r1, r6)
                    if (r7 != r0) goto L4f
                    return r0
                L4f:
                    bn.r r7 = bn.r.f5635a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.FlowExtKt.AnonymousClass1.C01091.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, kotlin.coroutines.d dVar, go.d<? extends T> dVar2, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$lifecycle = lifecycle;
            this.$minActiveState = state;
            this.$context = dVar;
            this.$this_collectAsStateWithLifecycle = dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$lifecycle, this.$minActiveState, this.$context, this.$this_collectAsStateWithLifecycle, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull ProduceStateScope<T> produceStateScope, @Nullable c<? super r> cVar) {
            return ((AnonymousClass1) create(produceStateScope, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                Lifecycle lifecycle = this.$lifecycle;
                Lifecycle.State state = this.$minActiveState;
                C01091 c01091 = new C01091(this.$context, this.$this_collectAsStateWithLifecycle, produceStateScope, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c01091, this) == objG) {
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

    @Composable
    @NotNull
    public static final <T> State<T> collectAsStateWithLifecycle(@NotNull go.d<? extends T> dVar, T t10, @NotNull Lifecycle lifecycle, @Nullable Lifecycle.State state, @Nullable kotlin.coroutines.d dVar2, @Nullable Composer composer, int i10, int i11) {
        tn.p.k(dVar, "<this>");
        tn.p.k(lifecycle, "lifecycle");
        composer.startReplaceableGroup(1977777920);
        if ((i11 & 4) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i11 & 8) != 0) {
            dVar2 = EmptyCoroutineContext.INSTANCE;
        }
        kotlin.coroutines.d dVar3 = dVar2;
        Object[] objArr = {dVar, lifecycle, state2, dVar3};
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(lifecycle, state2, dVar3, dVar, null);
        int i12 = i10 >> 3;
        State<T> stateProduceState = SnapshotStateKt.produceState((Object) t10, objArr, (p) anonymousClass1, composer, (i12 & 14) | (i12 & 8) | 576);
        composer.endReplaceableGroup();
        return stateProduceState;
    }

    @Composable
    @NotNull
    public static final <T> State<T> collectAsStateWithLifecycle(@NotNull go.d<? extends T> dVar, T t10, @Nullable LifecycleOwner lifecycleOwner, @Nullable Lifecycle.State state, @Nullable kotlin.coroutines.d dVar2, @Nullable Composer composer, int i10, int i11) {
        tn.p.k(dVar, "<this>");
        composer.startReplaceableGroup(-1485997211);
        if ((i11 & 2) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        }
        if ((i11 & 4) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i11 & 8) != 0) {
            dVar2 = EmptyCoroutineContext.INSTANCE;
        }
        State<T> stateCollectAsStateWithLifecycle = collectAsStateWithLifecycle(dVar, t10, lifecycleOwner.getLifecycle(), state2, dVar2, composer, 33288 | (((i10 >> 3) & 8) << 3) | (i10 & 112) | (i10 & 7168), 0);
        composer.endReplaceableGroup();
        return stateCollectAsStateWithLifecycle;
    }

    @Composable
    @NotNull
    public static final <T> State<T> collectAsStateWithLifecycle(@NotNull u<? extends T> uVar, @NotNull Lifecycle lifecycle, @Nullable Lifecycle.State state, @Nullable kotlin.coroutines.d dVar, @Nullable Composer composer, int i10, int i11) {
        tn.p.k(uVar, "<this>");
        tn.p.k(lifecycle, "lifecycle");
        composer.startReplaceableGroup(-1858162195);
        if ((i11 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i11 & 4) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        State<T> stateCollectAsStateWithLifecycle = collectAsStateWithLifecycle(uVar, uVar.getValue(), lifecycle, state2, dVar, composer, ((i10 << 3) & 7168) | 33288, 0);
        composer.endReplaceableGroup();
        return stateCollectAsStateWithLifecycle;
    }

    @Composable
    @NotNull
    public static final <T> State<T> collectAsStateWithLifecycle(@NotNull u<? extends T> uVar, @Nullable LifecycleOwner lifecycleOwner, @Nullable Lifecycle.State state, @Nullable kotlin.coroutines.d dVar, @Nullable Composer composer, int i10, int i11) {
        tn.p.k(uVar, "<this>");
        composer.startReplaceableGroup(743249048);
        if ((i11 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        }
        if ((i11 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i11 & 4) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        State<T> stateCollectAsStateWithLifecycle = collectAsStateWithLifecycle(uVar, uVar.getValue(), lifecycleOwner.getLifecycle(), state2, dVar, composer, ((i10 << 3) & 7168) | 33288, 0);
        composer.endReplaceableGroup();
        return stateCollectAsStateWithLifecycle;
    }
}
