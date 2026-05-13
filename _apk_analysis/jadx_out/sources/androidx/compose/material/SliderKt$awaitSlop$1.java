package androidx.compose.material;

import hn.c;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes5.dex */
@d(c = "androidx.compose.material.SliderKt", f = "Slider.kt", l = {795}, m = "awaitSlop-8vUncbI")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
public final class SliderKt$awaitSlop$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public SliderKt$awaitSlop$1(c<? super SliderKt$awaitSlop$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SliderKt.m1142awaitSlop8vUncbI(null, 0L, 0, this);
    }
}
