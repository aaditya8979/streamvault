package com.facebook.ads.redexgen.core;

import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class AG<E> extends C3019lm<E> implements Set<E> {
    public AG(Set<E> set, InterfaceC2872jB<? super E> interfaceC2872jB) {
        super(set, interfaceC2872jB);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        return AbstractC3209ou.A09(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC3209ou.A00(this);
    }
}
