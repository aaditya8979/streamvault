package io.ktor.client.call;

import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SavedCall.kt */
/* JADX INFO: loaded from: classes7.dex */
@d(c = "io.ktor.client.call.SavedCallKt", f = "SavedCall.kt", l = {36}, m = "save")
public final class SavedCallKt$save$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public SavedCallKt$save$1(c<? super SavedCallKt$save$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SavedCallKt.a(null, this);
    }
}
