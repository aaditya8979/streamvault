package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import bn.r;
import go.e;
import hn.c;
import in.a;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: AnimatedVisibility.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@d(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1", f = "AnimatedVisibility.kt", l = {748}, m = "invokeSuspend")
public final class AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
    public final /* synthetic */ Transition<EnterExitState> $childTransition;
    public final /* synthetic */ MutableState<Boolean> $isAnimationVisible;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(Transition<EnterExitState> transition, MutableState<Boolean> mutableState, c<? super AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1> cVar) {
        super(2, cVar);
        this.$childTransition = transition;
        this.$isAnimationVisible = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(this.$childTransition, this.$isAnimationVisible, cVar);
    }

    @Override // sn.p
    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
        return ((AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            final Transition<EnterExitState> transition = this.$childTransition;
            go.d dVarSnapshotFlow = SnapshotStateKt.snapshotFlow(new sn.a<Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // sn.a
                @NotNull
                public final Boolean invoke() {
                    EnterExitState currentState = transition.getCurrentState();
                    EnterExitState enterExitState = EnterExitState.Visible;
                    return Boolean.valueOf(currentState == enterExitState || transition.getTargetState() == enterExitState);
                }
            });
            final MutableState<Boolean> mutableState = this.$isAnimationVisible;
            e<Boolean> eVar = new e<Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1.2
                @Override // go.e
                public /* bridge */ /* synthetic */ Object emit(Boolean bool, c cVar) {
                    return emit(bool.booleanValue(), (c<? super r>) cVar);
                }

                @Nullable
                public final Object emit(boolean z10, @NotNull c<? super r> cVar) {
                    mutableState.setValue(jn.a.a(z10));
                    return r.f5635a;
                }
            };
            this.label = 1;
            if (dVarSnapshotFlow.collect(eVar, this) == objG) {
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
