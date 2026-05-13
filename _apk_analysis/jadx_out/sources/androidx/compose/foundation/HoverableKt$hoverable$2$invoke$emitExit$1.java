package androidx.compose.foundation;

import androidx.compose.foundation.HoverableKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Hoverable.kt */
/* JADX INFO: loaded from: classes6.dex */
@jn.d(c = "androidx.compose.foundation.HoverableKt$hoverable$2", f = "Hoverable.kt", l = {70}, m = "invoke$emitExit")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
public final class HoverableKt$hoverable$2$invoke$emitExit$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public HoverableKt$hoverable$2$invoke$emitExit$1(hn.c<? super HoverableKt$hoverable$2$invoke$emitExit$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HoverableKt.AnonymousClass2.invoke$emitExit(null, null, this);
    }
}
