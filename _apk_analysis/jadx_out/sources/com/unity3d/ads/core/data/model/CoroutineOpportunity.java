package com.unity3d.ads.core.data.model;

import com.google.protobuf.ByteString;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: CoroutineOpportunity.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class CoroutineOpportunity implements d.b {

    @NotNull
    public static final Key Key = new Key(null);

    @NotNull
    private final ByteString value;

    /* JADX INFO: compiled from: CoroutineOpportunity.kt */
    public static final class Key implements d.c<CoroutineOpportunity> {
        private Key() {
        }

        public /* synthetic */ Key(i iVar) {
            this();
        }
    }

    public CoroutineOpportunity(@NotNull ByteString byteString) {
        p.k(byteString, "value");
        this.value = byteString;
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r10, @NotNull sn.p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) d.b.a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @Nullable
    public <E extends d.b> E get(@NotNull d.c<E> cVar) {
        return (E) d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    @NotNull
    public d.c<?> getKey() {
        return Key;
    }

    @NotNull
    public final ByteString getValue() {
        return this.value;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public d minusKey(@NotNull d.c<?> cVar) {
        return d.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public d plus(@NotNull d dVar) {
        return d.b.a.d(this, dVar);
    }
}
