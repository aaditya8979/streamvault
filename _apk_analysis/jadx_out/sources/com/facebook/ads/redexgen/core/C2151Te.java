package com.facebook.ads.redexgen.core;

import com.facebook.ads.redexgen.core.AbstractC2152Tf;
import com.facebook.ads.redexgen.core.C2150Td;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2151Te<T extends AbstractC2152Tf, E extends C2150Td> {
    public final Map<Class<E>, List<WeakReference<T>>> A00 = new HashMap();
    public final Queue<E> A01 = new ArrayDeque();

    private void A00(E e10) {
        List<WeakReference<T>> list;
        if (this.A00 == null || (list = this.A00.get(e10.getClass())) == null) {
            return;
        }
        A01(list);
        if (list.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            AbstractC2152Tf abstractC2152Tf = (AbstractC2152Tf) ((WeakReference) it.next()).get();
            if (abstractC2152Tf != null && abstractC2152Tf.A00(e10)) {
                abstractC2152Tf.A03(e10);
            }
        }
    }

    private void A01(List<WeakReference<T>> list) {
        if (list != null) {
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                WeakReference<T> weakReference = list.get(i11);
                if (weakReference.get() != null) {
                    list.set(i10, weakReference);
                    i10++;
                }
            }
            for (int size = list.size() - 1; size >= i10; size--) {
                list.remove(size);
            }
        }
    }

    public final synchronized void A02(E e10) {
        if (this.A01.isEmpty()) {
            this.A01.add(e10);
            while (!this.A01.isEmpty()) {
                A00(this.A01.peek());
                this.A01.remove();
            }
        } else {
            this.A01.add(e10);
        }
    }

    public final synchronized void A03(T... tArr) {
        if (tArr == null) {
            return;
        }
        for (T t10 : tArr) {
            A05(t10);
        }
    }

    public final synchronized void A04(T... tArr) {
        if (tArr == null) {
            return;
        }
        for (T t10 : tArr) {
            A06(t10);
        }
    }

    public final synchronized boolean A05(T t10) {
        if (t10 == null) {
            return false;
        }
        Class<E> clsA01 = t10.A01();
        if (this.A00.get(clsA01) == null) {
            this.A00.put(clsA01, new ArrayList());
        }
        List<WeakReference<T>> list = this.A00.get(clsA01);
        A01(list);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).get() == t10) {
                return false;
            }
        }
        return list.add(new WeakReference<>(t10));
    }

    public final synchronized boolean A06(T t10) {
        if (t10 == null) {
            return false;
        }
        List<WeakReference<T>> list = this.A00.get(t10.A01());
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).get() == t10) {
                list.get(i10).clear();
                return true;
            }
        }
        return false;
    }
}
