package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import sn.l;

/* JADX INFO: compiled from: LazySemantics.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
public /* synthetic */ class LazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1$key$1 extends FunctionReferenceImpl implements l<Integer, Object> {
    public LazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1$key$1(Object obj) {
        super(1, obj, LazyGridItemProvider.class, "getKey", "getKey(I)Ljava/lang/Object;", 0);
    }

    @NotNull
    public final Object invoke(int i10) {
        return ((LazyGridItemProvider) this.receiver).getKey(i10);
    }

    @Override // sn.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }
}
