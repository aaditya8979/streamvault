package com.google.android.gms.internal.ads;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzifa implements Map.Entry, un.a {
    private final /* synthetic */ Map.Entry zza;

    public zzifa(@NotNull Map.Entry entry) {
        p.k(entry, "delegate");
        this.zza = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zza.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
