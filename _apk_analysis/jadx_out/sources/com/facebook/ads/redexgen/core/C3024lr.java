package com.facebook.ads.redexgen.core;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3024lr<K, V> extends AbstractSet<Map.Entry<K, V>> {
    public static String[] A01 = {"ttZbCw840LiCmMMagoH7x1ccnhXQbEM1", "MpxecthRuEJqGUuoNQ5A37YBhHZeOVcm", "F5DHcgT", "zg8RxjbDPuahNU47bDpYXJZcrKLRzeUW", "lK8l2vp", "Hs2vTdzQZwjFS6KGav0LYTLDhx5JGetB", "dmVTdLfQWkJOIA8zEGmBV6szkdy3co89", "IVYzXJf67D23TQo71K1DHnZqVzwcGU9Z"};
    public final /* synthetic */ C3028lv A00;

    public C3024lr(C3028lv c3028lv) {
        this.A00 = c3028lv;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        Map<K, V> mapA0h = this.A00.A0h();
        if (mapA0h != null) {
            return mapA0h.entrySet().contains(obj);
        }
        boolean z10 = obj instanceof Map.Entry;
        if (A01[5].charAt(2) != '2') {
            throw new RuntimeException();
        }
        A01[3] = "ECwcYxYjSLCNiUqu2ExsZmnTntzmdq50";
        if (!z10) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int iA07 = this.A00.A07(entry.getKey());
        return iA07 != -1 && BX.A01(this.A00.A0F(iA07), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return this.A00.A0d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        int iA00;
        int iA06;
        Map<K, V> mapA0h = this.A00.A0h();
        if (mapA0h != null) {
            return mapA0h.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.A00.A0p() || (iA06 = AbstractC3031ly.A06(entry.getKey(), entry.getValue(), (iA00 = this.A00.A00()), this.A00.A0C(), this.A00.A0T(), this.A00.A0V(), this.A00.A0W())) == -1) {
            return false;
        }
        this.A00.A0n(iA06, iA00);
        if (A01[7].charAt(30) == 'S') {
            throw new RuntimeException();
        }
        A01[7] = "padFRdr7QgkeMqaUt5IwgmGjkWqeexUC";
        C3028lv.A04(this.A00);
        this.A00.A0j();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size();
    }
}
