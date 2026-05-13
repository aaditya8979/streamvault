package coil;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import hn.c;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RealImageLoader.kt */
/* JADX INFO: loaded from: classes7.dex */
@d(c = "coil.RealImageLoader", f = "RealImageLoader.kt", l = {169, BaseTransientBottomBar.ANIMATION_FADE_DURATION, 184}, m = "executeMain")
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class RealImageLoader$executeMain$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$executeMain$1(RealImageLoader realImageLoader, c<? super RealImageLoader$executeMain$1> cVar) {
        super(cVar);
        this.this$0 = realImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.h(null, 0, this);
    }
}
