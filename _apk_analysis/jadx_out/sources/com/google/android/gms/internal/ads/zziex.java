package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zziex implements Iterator, un.a {
    private final /* synthetic */ Iterator zza;

    public zziex(@NotNull Iterator it) {
        p.k(it, "delegate");
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
