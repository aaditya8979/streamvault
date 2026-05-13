package io.bidmachine.rendering.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k {
    public static final boolean a(int i10) {
        return ((i10 >> 24) & 255) == 255;
    }

    public static final int[] a(Object[] objArr, sn.l lVar) {
        tn.p.k(objArr, "<this>");
        tn.p.k(lVar, "transform");
        int[] iArr = new int[objArr.length];
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Integer num = (Integer) lVar.invoke(objArr[i10]);
            if (num != null) {
                iArr[i10] = num.intValue();
            }
        }
        return iArr;
    }
}
