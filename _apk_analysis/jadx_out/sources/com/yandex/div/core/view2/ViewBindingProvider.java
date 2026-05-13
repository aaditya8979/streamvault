package com.yandex.div.core.view2;

import bn.r;
import com.yandex.div.DivDataTag;
import com.yandex.div2.DivData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: ViewBindingProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ViewBindingProvider {

    @NotNull
    private Binding current = new Binding(DivDataTag.INVALID, null);

    @NotNull
    private final List<l<Binding, r>> observers = new ArrayList();

    public final void observeAndGet(@NotNull l<? super Binding, r> lVar) {
        lVar.invoke(this.current);
        this.observers.add(lVar);
    }

    public final void update(@NotNull DivDataTag divDataTag, @Nullable DivData divData) {
        if (p.f(divDataTag, this.current.getTag()) && this.current.getData() == divData) {
            return;
        }
        this.current = new Binding(divDataTag, divData);
        Iterator<T> it = this.observers.iterator();
        while (it.hasNext()) {
            ((l) it.next()).invoke(this.current);
        }
    }
}
