package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.material.internal.ParcelableSparseArray;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3S, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3S {
    public static String[] A00 = {"EztRdnRdnxII2dimpNbIGIFL", "yBPkb8rrKyWAtXIO8vHrmMLgNIFMukmC", "ruf61JzVv", "IfWYroKwc", "5HPqTBNR8piE8Sks8fUTmtRJQLpo0nUy", "FxyxfNH4TJBWtje7DU0sksr0G0lHlrNk", "mC", "vPIo9e1233jy8mUAOhcfZhe0yZqmz6aB"};

    public static <T extends C1S> SparseArray<T> A00(C1R<T> c1r, SparseArray<Bundle> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            parcelableSparseArray.put(sparseArray.keyAt(i10), c1r.A6X(sparseArray.valueAt(i10)));
        }
        return parcelableSparseArray;
    }

    public static <T extends C1S> AbstractC1673Am<T> A01(C1R<T> c1r, List<Bundle> list) {
        C14491h c14491hA01 = AbstractC1673Am.A01();
        int i10 = 0;
        while (true) {
            int size = list.size();
            if (A00[2].length() == 29) {
                throw new RuntimeException();
            }
            A00[1] = "WptazREDdEStXNqRDkkRjPq2B5lfZI6H";
            if (i10 >= size) {
                return c14491hA01.A05();
            }
            c14491hA01.A04(c1r.A6X((Bundle) C3M.A01(list.get(i10))));
            i10++;
        }
    }

    public static void A02(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) AbstractC15184a.A0f(C3S.class.getClassLoader()));
        }
    }
}
