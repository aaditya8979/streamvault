package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import bn.r;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.p;
import sn.q;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@jn.d(c = "androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1", f = "Clickable.kt", l = {318}, m = "invokeSuspend")
public final class ClickableKt$combinedClickable$4$gesture$1 extends SuspendLambda implements p<PointerInputScope, hn.c<? super r>, Object> {
    public final /* synthetic */ State<sn.a<Boolean>> $delayPressInteraction;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ boolean $hasDoubleClick;
    public final /* synthetic */ boolean $hasLongClick;
    public final /* synthetic */ MutableInteractionSource $interactionSource;
    public final /* synthetic */ State<sn.a<r>> $onClickState;
    public final /* synthetic */ State<sn.a<r>> $onDoubleClickState;
    public final /* synthetic */ State<sn.a<r>> $onLongClickState;
    public final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: Clickable.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @jn.d(c = "androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$3", f = "Clickable.kt", l = {331}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements q<PressGestureScope, Offset, hn.c<? super r>, Object> {
        public final /* synthetic */ State<sn.a<Boolean>> $delayPressInteraction;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
        public /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(boolean z10, MutableInteractionSource mutableInteractionSource, MutableState<PressInteraction.Press> mutableState, State<? extends sn.a<Boolean>> state, hn.c<? super AnonymousClass3> cVar) {
            super(3, cVar);
            this.$enabled = z10;
            this.$interactionSource = mutableInteractionSource;
            this.$pressedInteraction = mutableState;
            this.$delayPressInteraction = state;
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, hn.c<? super r> cVar) {
            return m195invoked4ec7I(pressGestureScope, offset.getPackedValue(), cVar);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m195invoked4ec7I(@NotNull PressGestureScope pressGestureScope, long j10, @Nullable hn.c<? super r> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$enabled, this.$interactionSource, this.$pressedInteraction, this.$delayPressInteraction, cVar);
            anonymousClass3.L$0 = pressGestureScope;
            anonymousClass3.J$0 = j10;
            return anonymousClass3.invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                long j10 = this.J$0;
                if (this.$enabled) {
                    MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                    MutableState<PressInteraction.Press> mutableState = this.$pressedInteraction;
                    State<sn.a<Boolean>> state = this.$delayPressInteraction;
                    this.label = 1;
                    if (ClickableKt.m190handlePressInteractionEPk0efs(pressGestureScope, j10, mutableInteractionSource, mutableState, state, this) == objG) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ClickableKt$combinedClickable$4$gesture$1(boolean z10, boolean z11, boolean z12, State<? extends sn.a<r>> state, State<? extends sn.a<r>> state2, MutableInteractionSource mutableInteractionSource, MutableState<PressInteraction.Press> mutableState, State<? extends sn.a<Boolean>> state3, State<? extends sn.a<r>> state4, hn.c<? super ClickableKt$combinedClickable$4$gesture$1> cVar) {
        super(2, cVar);
        this.$hasDoubleClick = z10;
        this.$enabled = z11;
        this.$hasLongClick = z12;
        this.$onDoubleClickState = state;
        this.$onLongClickState = state2;
        this.$interactionSource = mutableInteractionSource;
        this.$pressedInteraction = mutableState;
        this.$delayPressInteraction = state3;
        this.$onClickState = state4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
        ClickableKt$combinedClickable$4$gesture$1 clickableKt$combinedClickable$4$gesture$1 = new ClickableKt$combinedClickable$4$gesture$1(this.$hasDoubleClick, this.$enabled, this.$hasLongClick, this.$onDoubleClickState, this.$onLongClickState, this.$interactionSource, this.$pressedInteraction, this.$delayPressInteraction, this.$onClickState, cVar);
        clickableKt$combinedClickable$4$gesture$1.L$0 = obj;
        return clickableKt$combinedClickable$4$gesture$1;
    }

    @Override // sn.p
    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(@NotNull PointerInputScope pointerInputScope, @Nullable hn.c<? super r> cVar) {
        return ((ClickableKt$combinedClickable$4$gesture$1) create(pointerInputScope, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        l<Offset, r> lVar;
        l<Offset, r> lVar2;
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            if (this.$hasDoubleClick && this.$enabled) {
                final State<sn.a<r>> state = this.$onDoubleClickState;
                lVar = new l<Offset, r>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ r invoke(Offset offset) {
                        m193invokek4lQ0M(offset.getPackedValue());
                        return r.f5635a;
                    }

                    /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                    public final void m193invokek4lQ0M(long j10) {
                        sn.a<r> value = state.getValue();
                        if (value != null) {
                            value.invoke();
                        }
                    }
                };
            } else {
                lVar = null;
            }
            if (this.$hasLongClick && this.$enabled) {
                final State<sn.a<r>> state2 = this.$onLongClickState;
                lVar2 = new l<Offset, r>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ r invoke(Offset offset) {
                        m194invokek4lQ0M(offset.getPackedValue());
                        return r.f5635a;
                    }

                    /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                    public final void m194invokek4lQ0M(long j10) {
                        sn.a<r> value = state2.getValue();
                        if (value != null) {
                            value.invoke();
                        }
                    }
                };
            } else {
                lVar2 = null;
            }
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$enabled, this.$interactionSource, this.$pressedInteraction, this.$delayPressInteraction, null);
            final boolean z10 = this.$enabled;
            final State<sn.a<r>> state3 = this.$onClickState;
            l<Offset, r> lVar3 = new l<Offset, r>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(Offset offset) {
                    m196invokek4lQ0M(offset.getPackedValue());
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m196invokek4lQ0M(long j10) {
                    if (z10) {
                        state3.getValue().invoke();
                    }
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures(pointerInputScope, lVar, lVar2, anonymousClass3, lVar3, this) == objG) {
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
