package s7;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.f;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: BundleableUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    public static void a(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) m0.j(c.class.getClassLoader()));
        }
    }

    public static <T extends com.google.android.exoplayer2.f> ImmutableList<T> b(f.a<T> aVar, List<Bundle> list) {
        ImmutableList.a aVarBuilder = ImmutableList.builder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarBuilder.a(aVar.fromBundle((Bundle) a.e(list.get(i10))));
        }
        return aVarBuilder.m();
    }

    public static <T extends com.google.android.exoplayer2.f> SparseArray<T> c(f.a<T> aVar, SparseArray<Bundle> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            parcelableSparseArray.put(sparseArray.keyAt(i10), aVar.fromBundle(sparseArray.valueAt(i10)));
        }
        return parcelableSparseArray;
    }

    public static <T extends com.google.android.exoplayer2.f> ArrayList<Bundle> d(Collection<T> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toBundle());
        }
        return arrayList;
    }

    public static <T extends com.google.android.exoplayer2.f> SparseArray<Bundle> e(SparseArray<T> sparseArray) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10).toBundle());
        }
        return sparseArray2;
    }
}
