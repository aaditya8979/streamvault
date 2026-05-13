package io.appmetrica.analytics.impl;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4882ja implements O9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8 f67028a = new K8();

    @NotNull
    public final C4727d9[] a(@Nullable byte[] bArr) {
        int i10 = 0;
        if (bArr == null) {
            return new C4727d9[0];
        }
        Map<String, byte[]> model = this.f67028a.toModel(bArr);
        C4727d9[] c4727d9Arr = new C4727d9[model.size()];
        for (Object obj : model.entrySet()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                cn.w.w();
            }
            Map.Entry entry = (Map.Entry) obj;
            C4727d9 c4727d9 = new C4727d9();
            c4727d9.f66593a = ((String) entry.getKey()).getBytes(bo.c.f5639b);
            c4727d9.f66594b = (byte[]) entry.getValue();
            c4727d9Arr[i10] = c4727d9;
            i10 = i11;
        }
        return c4727d9Arr;
    }
}
