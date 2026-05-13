package com.yandex.div.core.view2.items;

import androidx.recyclerview.widget.RecyclerView;
import bn.r;
import kotlin.jvm.internal.FunctionReferenceImpl;
import sn.p;

/* JADX INFO: compiled from: DivViewWithItems.kt */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class DivViewWithItemsKt$scrollTo$scroll$2 extends FunctionReferenceImpl implements p<Integer, Integer, r> {
    public DivViewWithItemsKt$scrollTo$scroll$2(Object obj) {
        super(2, obj, RecyclerView.class, "scrollBy", "scrollBy(II)V", 0);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ r mo2invoke(Integer num, Integer num2) {
        invoke(num.intValue(), num2.intValue());
        return r.f5635a;
    }

    public final void invoke(int i10, int i11) {
        ((RecyclerView) this.receiver).scrollBy(i10, i11);
    }
}
