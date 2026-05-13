package androidx.compose.material;

import androidx.compose.runtime.State;
import bn.r;
import hn.c;
import in.a;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.l;
import sn.q;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@d(c = "androidx.compose.material.SliderKt$Slider$3$drag$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
public final class SliderKt$Slider$3$drag$1$1 extends SuspendLambda implements q<l0, Float, c<? super r>, Object> {
    public final /* synthetic */ State<l<Float, r>> $gestureEndAction;
    public /* synthetic */ float F$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$Slider$3$drag$1$1(State<? extends l<? super Float, r>> state, c<? super SliderKt$Slider$3$drag$1$1> cVar) {
        super(3, cVar);
        this.$gestureEndAction = state;
    }

    @Nullable
    public final Object invoke(@NotNull l0 l0Var, float f10, @Nullable c<? super r> cVar) {
        SliderKt$Slider$3$drag$1$1 sliderKt$Slider$3$drag$1$1 = new SliderKt$Slider$3$drag$1$1(this.$gestureEndAction, cVar);
        sliderKt$Slider$3$drag$1$1.F$0 = f10;
        return sliderKt$Slider$3$drag$1$1.invokeSuspend(r.f5635a);
    }

    @Override // sn.q
    public /* bridge */ /* synthetic */ Object invoke(l0 l0Var, Float f10, c<? super r> cVar) {
        return invoke(l0Var, f10.floatValue(), cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        this.$gestureEndAction.getValue().invoke(jn.a.c(this.F$0));
        return r.f5635a;
    }
}
