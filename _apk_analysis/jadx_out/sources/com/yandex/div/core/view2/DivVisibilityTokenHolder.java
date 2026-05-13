package com.yandex.div.core.view2;

import ah.c9;
import androidx.annotation.AnyThread;
import bn.r;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: DivVisibilityTokenHolder.kt */
/* JADX INFO: loaded from: classes10.dex */
@AnyThread
public final class DivVisibilityTokenHolder {

    @NotNull
    private final ConcurrentLinkedQueue<Map<CompositeLogId, c9>> tokens = new ConcurrentLinkedQueue<>();

    public final boolean add(@NotNull Map<CompositeLogId, c9> map) {
        return this.tokens.add(map);
    }

    @Nullable
    public final CompositeLogId getLogId(@NotNull CompositeLogId compositeLogId) {
        Object next;
        Set setKeySet;
        Iterator<T> it = this.tokens.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Map) next).containsKey(compositeLogId)) {
                break;
            }
        }
        Map map = (Map) next;
        if (map == null || (setKeySet = map.keySet()) == null) {
            return null;
        }
        CompositeLogId[] compositeLogIdArr = (CompositeLogId[]) setKeySet.toArray(new CompositeLogId[0]);
        if (compositeLogIdArr == null) {
            return null;
        }
        for (CompositeLogId compositeLogId2 : compositeLogIdArr) {
            if (p.f(compositeLogId2, compositeLogId)) {
                return compositeLogId2;
            }
        }
        return null;
    }

    public final void remove(@NotNull CompositeLogId compositeLogId, @NotNull l<? super Map<CompositeLogId, ? extends c9>, r> lVar) {
        Object next;
        Iterator<T> it = this.tokens.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Map) next).remove(compositeLogId) != null) {
                    break;
                }
            }
        }
        Map map = (Map) next;
        if (map != null && map.isEmpty()) {
            lVar.invoke(map);
            this.tokens.remove(map);
        }
    }
}
