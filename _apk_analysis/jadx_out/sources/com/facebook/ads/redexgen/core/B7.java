package com.facebook.ads.redexgen.core;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class B7<K, V> extends C3028lv<K, V>.Itr<Map.Entry<K, V>> {
    public final /* synthetic */ C3028lv A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B7(C3028lv c3028lv) {
        super(c3028lv, null);
        this.A00 = c3028lv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Map.Entry<K, V> A03(int i10) {
        return new B5(this.A00, i10);
    }
}
