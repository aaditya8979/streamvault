package androidx.compose.ui.platform;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: compiled from: WindowInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@jn.d(c = "androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1", f = "WindowInfo.kt", l = {47}, m = "invokeSuspend")
public final class WindowInfoKt$WindowFocusObserver$1$1 extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {
    public final /* synthetic */ State<sn.l<Boolean, bn.r>> $callback;
    public final /* synthetic */ WindowInfo $windowInfo;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WindowInfoKt$WindowFocusObserver$1$1(WindowInfo windowInfo, State<? extends sn.l<? super Boolean, bn.r>> state, hn.c<? super WindowInfoKt$WindowFocusObserver$1$1> cVar) {
        super(2, cVar);
        this.$windowInfo = windowInfo;
        this.$callback = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final hn.c<bn.r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
        return new WindowInfoKt$WindowFocusObserver$1$1(this.$windowInfo, this.$callback, cVar);
    }

    @Override // sn.p
    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super bn.r> cVar) {
        return ((WindowInfoKt$WindowFocusObserver$1$1) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            final WindowInfo windowInfo = this.$windowInfo;
            go.d dVarSnapshotFlow = SnapshotStateKt.snapshotFlow(new sn.a<Boolean>() { // from class: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // sn.a
                @NotNull
                public final Boolean invoke() {
                    return Boolean.valueOf(windowInfo.isWindowFocused());
                }
            });
            final State<sn.l<Boolean, bn.r>> state = this.$callback;
            go.e<Boolean> eVar = new go.e<Boolean>() { // from class: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1.2
                @Override // go.e
                public /* bridge */ /* synthetic */ Object emit(Boolean bool, hn.c cVar) {
                    return emit(bool.booleanValue(), (hn.c<? super bn.r>) cVar);
                }

                @Nullable
                public final Object emit(boolean z10, @NotNull hn.c<? super bn.r> cVar) {
                    bn.r rVarInvoke = state.getValue().invoke(jn.a.a(z10));
                    return rVarInvoke == in.a.g() ? rVarInvoke : bn.r.f5635a;
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
        return bn.r.f5635a;
    }
}
