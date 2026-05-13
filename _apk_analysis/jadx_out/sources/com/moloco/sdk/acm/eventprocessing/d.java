package com.moloco.sdk.acm.eventprocessing;

import android.util.Log;
import androidx.work.Data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class d {
    @Nullable
    public static final Data a(@NotNull Map<String, ? extends Object> map) throws Throwable {
        p.k(map, "<this>");
        try {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                arrayList.add(bn.h.a(entry.getKey(), entry.getValue()));
            }
            Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, pairArr.length);
            Data.Builder builder = new Data.Builder();
            for (Pair pair : pairArr2) {
                builder.put((String) pair.getFirst(), pair.getSecond());
            }
            Data dataBuild = builder.build();
            p.j(dataBuild, "dataBuilder.build()");
            return dataBuild;
        } catch (Exception e10) {
            Log.e("DBPeriodicRequest", e10.getMessage() + ". Data: " + map);
            return null;
        }
    }
}
