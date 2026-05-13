package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4850i3 extends ECommerceEvent {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f66953d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f66954e = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final C4927l3 f66956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4700c8 f66957c;

    public C4850i3(int i10, @NonNull ECommerceCartItem eCommerceCartItem) {
        this(i10, new C4927l3(eCommerceCartItem), new C4875j3());
    }

    @VisibleForTesting
    public C4850i3(int i10, @NonNull C4927l3 c4927l3, @NonNull InterfaceC4700c8 interfaceC4700c8) {
        this.f66955a = i10;
        this.f66956b = c4927l3;
        this.f66957c = interfaceC4700c8;
    }

    @NonNull
    @VisibleForTesting
    public final InterfaceC4700c8 a() {
        return this.f66957c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        int i10 = this.f66955a;
        return i10 != 4 ? i10 != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Lf
    public final List<Ei> toProto() {
        return (List) this.f66957c.fromModel(this);
    }

    @NonNull
    public final String toString() {
        return "CartActionInfoEvent{eventType=" + this.f66955a + ", cartItem=" + this.f66956b + ", converter=" + this.f66957c + '}';
    }
}
