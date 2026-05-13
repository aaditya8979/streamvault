package com.inmobi.media;

import android.util.Base64;
import java.util.BitSet;

/* JADX INFO: loaded from: classes7.dex */
public final class D2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BitSet f25288a;

    public final void a(String str) {
        byte[] bArrDecode;
        BitSet bitSetValueOf;
        tn.p.k(str, "b64String");
        try {
            bArrDecode = Base64.decode(str, 0);
        } catch (Exception e10) {
            bn.g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
            bArrDecode = null;
        }
        if (bArrDecode != null) {
            tn.p.k(bArrDecode, "value");
            C3850x5.f28483a.getClass();
            if (C3850x5.u()) {
                bitSetValueOf = BitSet.valueOf(bArrDecode);
            } else {
                tn.p.k(bArrDecode, "<this>");
                BitSet bitSet = new BitSet(bArrDecode.length * 8);
                int i10 = 0;
                for (byte b10 : bArrDecode) {
                    int i11 = 0;
                    while (i11 < 8) {
                        boolean z10 = true;
                        int i12 = i10 + 1;
                        if (((b10 >> ((byte) i11)) & 1) != 1) {
                            z10 = false;
                        }
                        bitSet.set(i10, z10);
                        i11++;
                        i10 = i12;
                    }
                }
                bitSetValueOf = bitSet;
            }
            this.f25288a = bitSetValueOf;
        }
    }
}
