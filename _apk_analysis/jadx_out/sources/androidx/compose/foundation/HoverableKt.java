package androidx.compose.foundation;

import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import bn.r;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.l;
import sn.p;
import sn.q;

/* JADX INFO: compiled from: Hoverable.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"hoverable", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class HoverableKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2, reason: invalid class name */
    /* JADX INFO: compiled from: Hoverable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass2 extends Lambda implements q<Modifier, Composer, Integer, Modifier> {
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;

        /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Hoverable.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @jn.d(c = "androidx.compose.foundation.HoverableKt$hoverable$2$2", f = "Hoverable.kt", l = {88}, m = "invokeSuspend")
        public static final class C00102 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
            public final /* synthetic */ boolean $enabled;
            public final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
            public final /* synthetic */ MutableInteractionSource $interactionSource;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00102(boolean z10, MutableState<HoverInteraction.Enter> mutableState, MutableInteractionSource mutableInteractionSource, hn.c<? super C00102> cVar) {
                super(2, cVar);
                this.$enabled = z10;
                this.$hoverInteraction$delegate = mutableState;
                this.$interactionSource = mutableInteractionSource;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
                return new C00102(this.$enabled, this.$hoverInteraction$delegate, this.$interactionSource, cVar);
            }

            @Override // sn.p
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
                return ((C00102) create(l0Var, cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = in.a.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    if (!this.$enabled) {
                        MutableState<HoverInteraction.Enter> mutableState = this.$hoverInteraction$delegate;
                        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                        this.label = 1;
                        if (AnonymousClass2.invoke$emitExit(mutableState, mutableInteractionSource, this) == objG) {
                            return objG;
                        }
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

        /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3, reason: invalid class name */
        /* JADX INFO: compiled from: Hoverable.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @jn.d(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3", f = "Hoverable.kt", l = {102}, m = "invokeSuspend")
        public static final class AnonymousClass3 extends SuspendLambda implements p<PointerInputScope, hn.c<? super r>, Object> {
            public final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
            public final /* synthetic */ MutableInteractionSource $interactionSource;
            public final /* synthetic */ l0 $scope;
            private /* synthetic */ Object L$0;
            public int label;

            /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1, reason: invalid class name */
            /* JADX INFO: compiled from: Hoverable.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @jn.d(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1", f = "Hoverable.kt", l = {104}, m = "invokeSuspend")
            public static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, hn.c<? super r>, Object> {
                public final /* synthetic */ kotlin.coroutines.d $currentContext;
                public final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
                public final /* synthetic */ MutableInteractionSource $interactionSource;
                public final /* synthetic */ l0 $scope;
                private /* synthetic */ Object L$0;
                public int label;

                /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: Hoverable.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @jn.d(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1", f = "Hoverable.kt", l = {106}, m = "invokeSuspend")
                public static final class C00111 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
                    public final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
                    public final /* synthetic */ MutableInteractionSource $interactionSource;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00111(MutableInteractionSource mutableInteractionSource, MutableState<HoverInteraction.Enter> mutableState, hn.c<? super C00111> cVar) {
                        super(2, cVar);
                        this.$interactionSource = mutableInteractionSource;
                        this.$hoverInteraction$delegate = mutableState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
                        return new C00111(this.$interactionSource, this.$hoverInteraction$delegate, cVar);
                    }

                    @Override // sn.p
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
                        return ((C00111) create(l0Var, cVar)).invokeSuspend(r.f5635a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object objG = in.a.g();
                        int i10 = this.label;
                        if (i10 == 0) {
                            kotlin.c.b(obj);
                            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                            MutableState<HoverInteraction.Enter> mutableState = this.$hoverInteraction$delegate;
                            this.label = 1;
                            if (AnonymousClass2.invoke$emitEnter(mutableInteractionSource, mutableState, this) == objG) {
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

                /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: Hoverable.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @jn.d(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2", f = "Hoverable.kt", l = {107}, m = "invokeSuspend")
                public static final class C00122 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
                    public final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
                    public final /* synthetic */ MutableInteractionSource $interactionSource;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00122(MutableState<HoverInteraction.Enter> mutableState, MutableInteractionSource mutableInteractionSource, hn.c<? super C00122> cVar) {
                        super(2, cVar);
                        this.$hoverInteraction$delegate = mutableState;
                        this.$interactionSource = mutableInteractionSource;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
                        return new C00122(this.$hoverInteraction$delegate, this.$interactionSource, cVar);
                    }

                    @Override // sn.p
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
                        return ((C00122) create(l0Var, cVar)).invokeSuspend(r.f5635a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object objG = in.a.g();
                        int i10 = this.label;
                        if (i10 == 0) {
                            kotlin.c.b(obj);
                            MutableState<HoverInteraction.Enter> mutableState = this.$hoverInteraction$delegate;
                            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                            this.label = 1;
                            if (AnonymousClass2.invoke$emitExit(mutableState, mutableInteractionSource, this) == objG) {
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
                public AnonymousClass1(kotlin.coroutines.d dVar, l0 l0Var, MutableInteractionSource mutableInteractionSource, MutableState<HoverInteraction.Enter> mutableState, hn.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.$currentContext = dVar;
                    this.$scope = l0Var;
                    this.$interactionSource = mutableInteractionSource;
                    this.$hoverInteraction$delegate = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$scope, this.$interactionSource, this.$hoverInteraction$delegate, cVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // sn.p
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final Object mo2invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable hn.c<? super r> cVar) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, cVar)).invokeSuspend(r.f5635a);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003b -> B:15:0x0040). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
                    /*
                        r14 = this;
                        java.lang.Object r0 = in.a.g()
                        int r1 = r14.label
                        r2 = 1
                        r3 = 0
                        if (r1 == 0) goto L1f
                        if (r1 != r2) goto L17
                        java.lang.Object r1 = r14.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.c.b(r15)
                        r4 = r1
                        r1 = r0
                        r0 = r14
                        goto L40
                    L17:
                        java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r15.<init>(r0)
                        throw r15
                    L1f:
                        kotlin.c.b(r15)
                        java.lang.Object r15 = r14.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r15 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r15
                        r1 = r15
                        r15 = r14
                    L28:
                        kotlin.coroutines.d r4 = r15.$currentContext
                        boolean r4 = p000do.t1.p(r4)
                        if (r4 == 0) goto L85
                        r15.L$0 = r1
                        r15.label = r2
                        java.lang.Object r4 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r1, r3, r15, r2, r3)
                        if (r4 != r0) goto L3b
                        return r0
                    L3b:
                        r13 = r0
                        r0 = r15
                        r15 = r4
                        r4 = r1
                        r1 = r13
                    L40:
                        androidx.compose.ui.input.pointer.PointerEvent r15 = (androidx.compose.ui.input.pointer.PointerEvent) r15
                        int r15 = r15.getType()
                        androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.ui.input.pointer.PointerEventType.INSTANCE
                        int r6 = r5.m2943getEnter7fucELk()
                        boolean r6 = androidx.compose.ui.input.pointer.PointerEventType.m2939equalsimpl0(r15, r6)
                        if (r6 == 0) goto L65
                        do.l0 r7 = r0.$scope
                        r8 = 0
                        r9 = 0
                        androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1 r10 = new androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1
                        androidx.compose.foundation.interaction.MutableInteractionSource r15 = r0.$interactionSource
                        androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.HoverInteraction$Enter> r5 = r0.$hoverInteraction$delegate
                        r10.<init>(r15, r5, r3)
                        r11 = 3
                        r12 = 0
                        p000do.g.d(r7, r8, r9, r10, r11, r12)
                        goto L81
                    L65:
                        int r5 = r5.m2944getExit7fucELk()
                        boolean r15 = androidx.compose.ui.input.pointer.PointerEventType.m2939equalsimpl0(r15, r5)
                        if (r15 == 0) goto L81
                        do.l0 r5 = r0.$scope
                        r6 = 0
                        r7 = 0
                        androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2 r8 = new androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2
                        androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.HoverInteraction$Enter> r15 = r0.$hoverInteraction$delegate
                        androidx.compose.foundation.interaction.MutableInteractionSource r9 = r0.$interactionSource
                        r8.<init>(r15, r9, r3)
                        r9 = 3
                        r10 = 0
                        p000do.g.d(r5, r6, r7, r8, r9, r10)
                    L81:
                        r15 = r0
                        r0 = r1
                        r1 = r4
                        goto L28
                    L85:
                        bn.r r15 = bn.r.f5635a
                        return r15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableKt.AnonymousClass2.AnonymousClass3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(l0 l0Var, MutableInteractionSource mutableInteractionSource, MutableState<HoverInteraction.Enter> mutableState, hn.c<? super AnonymousClass3> cVar) {
                super(2, cVar);
                this.$scope = l0Var;
                this.$interactionSource = mutableInteractionSource;
                this.$hoverInteraction$delegate = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$scope, this.$interactionSource, this.$hoverInteraction$delegate, cVar);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // sn.p
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo2invoke(@NotNull PointerInputScope pointerInputScope, @Nullable hn.c<? super r> cVar) {
                return ((AnonymousClass3) create(pointerInputScope, cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = in.a.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(getContext(), this.$scope, this.$interactionSource, this.$hoverInteraction$delegate, null);
                    this.label = 1;
                    if (pointerInputScope.awaitPointerEventScope(anonymousClass1, this) == objG) {
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
        public AnonymousClass2(MutableInteractionSource mutableInteractionSource, boolean z10) {
            super(3);
            this.$interactionSource = mutableInteractionSource;
            this.$enabled = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final java.lang.Object invoke$emitEnter(androidx.compose.foundation.interaction.MutableInteractionSource r4, androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.HoverInteraction.Enter> r5, hn.c<? super bn.r> r6) {
            /*
                boolean r0 = r6 instanceof androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1
                if (r0 == 0) goto L13
                r0 = r6
                androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1 r0 = (androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1 r0 = new androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = in.a.g()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r4 = r0.L$1
                androidx.compose.foundation.interaction.HoverInteraction$Enter r4 = (androidx.compose.foundation.interaction.HoverInteraction.Enter) r4
                java.lang.Object r5 = r0.L$0
                androidx.compose.runtime.MutableState r5 = (androidx.compose.runtime.MutableState) r5
                kotlin.c.b(r6)
                goto L55
            L31:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L39:
                kotlin.c.b(r6)
                androidx.compose.foundation.interaction.HoverInteraction$Enter r6 = m208invoke$lambda1(r5)
                if (r6 != 0) goto L58
                androidx.compose.foundation.interaction.HoverInteraction$Enter r6 = new androidx.compose.foundation.interaction.HoverInteraction$Enter
                r6.<init>()
                r0.L$0 = r5
                r0.L$1 = r6
                r0.label = r3
                java.lang.Object r4 = r4.emit(r6, r0)
                if (r4 != r1) goto L54
                return r1
            L54:
                r4 = r6
            L55:
                m209invoke$lambda2(r5, r4)
            L58:
                bn.r r4 = bn.r.f5635a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableKt.AnonymousClass2.invoke$emitEnter(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.MutableState, hn.c):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final java.lang.Object invoke$emitExit(androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.HoverInteraction.Enter> r4, androidx.compose.foundation.interaction.MutableInteractionSource r5, hn.c<? super bn.r> r6) {
            /*
                boolean r0 = r6 instanceof androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1
                if (r0 == 0) goto L13
                r0 = r6
                androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1 r0 = (androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1 r0 = new androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = in.a.g()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r4 = r0.L$0
                androidx.compose.runtime.MutableState r4 = (androidx.compose.runtime.MutableState) r4
                kotlin.c.b(r6)
                goto L4e
            L2d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L35:
                kotlin.c.b(r6)
                androidx.compose.foundation.interaction.HoverInteraction$Enter r6 = m208invoke$lambda1(r4)
                if (r6 == 0) goto L52
                androidx.compose.foundation.interaction.HoverInteraction$Exit r2 = new androidx.compose.foundation.interaction.HoverInteraction$Exit
                r2.<init>(r6)
                r0.L$0 = r4
                r0.label = r3
                java.lang.Object r5 = r5.emit(r2, r0)
                if (r5 != r1) goto L4e
                return r1
            L4e:
                r5 = 0
                m209invoke$lambda2(r4, r5)
            L52:
                bn.r r4 = bn.r.f5635a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableKt.AnonymousClass2.invoke$emitExit(androidx.compose.runtime.MutableState, androidx.compose.foundation.interaction.MutableInteractionSource, hn.c):java.lang.Object");
        }

        /* JADX INFO: renamed from: invoke$lambda-1, reason: not valid java name */
        private static final HoverInteraction.Enter m208invoke$lambda1(MutableState<HoverInteraction.Enter> mutableState) {
            return mutableState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$tryEmitExit(MutableState<HoverInteraction.Enter> mutableState, MutableInteractionSource mutableInteractionSource) {
            HoverInteraction.Enter enterM208invoke$lambda1 = m208invoke$lambda1(mutableState);
            if (enterM208invoke$lambda1 != null) {
                mutableInteractionSource.tryEmit(new HoverInteraction.Exit(enterM208invoke$lambda1));
                mutableState.setValue(null);
            }
        }

        @Composable
        @NotNull
        public final Modifier invoke(@NotNull Modifier modifier, @Nullable Composer composer, int i10) {
            Modifier modifierPointerInput;
            tn.p.k(modifier, "$this$composed");
            composer.startReplaceableGroup(1294013553);
            composer.startReplaceableGroup(773894976);
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            l0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue2;
            final MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            EffectsKt.DisposableEffect(mutableInteractionSource, new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.HoverableKt.hoverable.2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                @NotNull
                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                    tn.p.k(disposableEffectScope, "$this$DisposableEffect");
                    final MutableState<HoverInteraction.Enter> mutableState2 = mutableState;
                    final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.HoverableKt$hoverable$2$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            HoverableKt.AnonymousClass2.invoke$tryEmitExit(mutableState2, mutableInteractionSource2);
                        }
                    };
                }
            }, composer, 0);
            EffectsKt.LaunchedEffect(Boolean.valueOf(this.$enabled), new C00102(this.$enabled, mutableState, this.$interactionSource, null), composer, 0);
            if (this.$enabled) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
                modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, mutableInteractionSource2, new AnonymousClass3(coroutineScope, mutableInteractionSource2, mutableState, null));
            } else {
                modifierPointerInput = Modifier.INSTANCE;
            }
            composer.endReplaceableGroup();
            return modifierPointerInput;
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }
    }

    @NotNull
    public static final Modifier hoverable(@NotNull Modifier modifier, @NotNull final MutableInteractionSource mutableInteractionSource, final boolean z10) {
        tn.p.k(modifier, "<this>");
        tn.p.k(mutableInteractionSource, "interactionSource");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, r>() { // from class: androidx.compose.foundation.HoverableKt$hoverable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                tn.p.k(inspectorInfo, "$this$null");
                inspectorInfo.setName("hoverable");
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new AnonymousClass2(mutableInteractionSource, z10));
    }

    public static /* synthetic */ Modifier hoverable$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return hoverable(modifier, mutableInteractionSource, z10);
    }
}
