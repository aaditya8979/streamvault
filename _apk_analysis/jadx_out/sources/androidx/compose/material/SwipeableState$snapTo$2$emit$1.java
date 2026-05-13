package androidx.compose.material;

import androidx.compose.material.SwipeableState;
import bn.r;
import hn.c;
import java.util.Map;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes6.dex */
@d(c = "androidx.compose.material.SwipeableState$snapTo$2", f = "Swipeable.kt", l = {316}, m = "emit")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
public final class SwipeableState$snapTo$2$emit$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SwipeableState.C13042 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$snapTo$2$emit$1(SwipeableState.C13042 c13042, c<? super SwipeableState$snapTo$2$emit$1> cVar) {
        super(cVar);
        this.this$0 = c13042;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Map) null, (c<? super r>) this);
    }
}
