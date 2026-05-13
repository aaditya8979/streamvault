package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class V1 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5200w2 f66021a;

    public V1() {
        this(new C5200w2());
    }

    public V1(C5200w2 c5200w2) {
        this.f66021a = c5200w2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final U1 toModel(@NonNull Y1 y12) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            X1[] x1Arr = y12.f66211a;
            if (i11 >= x1Arr.length) {
                break;
            }
            X1 x12 = x1Arr[i11];
            arrayList.add(new PermissionState(x12.f66143a, x12.f66144b));
            i11++;
        }
        W1 w12 = y12.f66212b;
        C5250y2 model = w12 != null ? this.f66021a.toModel(w12) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = y12.f66213c;
            if (i10 >= strArr.length) {
                return new U1(arrayList, model, arrayList2);
            }
            arrayList2.add(strArr[i10]);
            i10++;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y1 fromModel(@NonNull U1 u12) {
        Y1 y12 = new Y1();
        y12.f66211a = new X1[u12.f65971a.size()];
        int i10 = 0;
        int i11 = 0;
        for (PermissionState permissionState : u12.f65971a) {
            X1[] x1Arr = y12.f66211a;
            X1 x12 = new X1();
            x12.f66143a = permissionState.name;
            x12.f66144b = permissionState.granted;
            x1Arr[i11] = x12;
            i11++;
        }
        C5250y2 c5250y2 = u12.f65972b;
        if (c5250y2 != null) {
            y12.f66212b = this.f66021a.fromModel(c5250y2);
        }
        y12.f66213c = new String[u12.f65973c.size()];
        Iterator it = u12.f65973c.iterator();
        while (it.hasNext()) {
            y12.f66213c[i10] = (String) it.next();
            i10++;
        }
        return y12;
    }
}
