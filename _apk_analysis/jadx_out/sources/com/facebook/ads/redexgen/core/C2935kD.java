package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2935kD<K, V> implements Iterator<Map.Entry<K, Collection<V>>> {
    public static byte[] A03;

    @CheckForNull
    public Collection<V> A00;
    public final Iterator<Map.Entry<K, Collection<V>>> A01;
    public final /* synthetic */ BG A02;

    static {
        A02();
    }

    public C2935kD(BG bg2) {
        this.A02 = bg2;
        this.A01 = this.A02.A00.entrySet().iterator();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 47);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final Map.Entry<K, Collection<V>> next() {
        Map.Entry<K, Collection<V>> next = this.A01.next();
        this.A00 = next.getValue();
        return this.A02.A0A(next);
    }

    public static void A02() {
        A03 = new byte[]{13, 14, -65, 2, 0, 11, 11, 18, -65, 19, 14, -65, 13, 4, 23, 19, -57, -56, -65, 18, 8, 13, 2, 4, -65, 19, 7, 4, -65, 11, 0, 18, 19, -65, 2, 0, 11, 11, -65, 19, 14, -65, 17, 4, 12, 14, 21, 4, -57, -56};
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC2871jA.A0F(this.A00 != null, A00(0, 50, 112));
        this.A01.remove();
        AbstractC14501i.A03(this.A02.A01, this.A00.size());
        this.A00.clear();
        this.A00 = null;
    }
}
