package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C5013oe extends ECommerceEvent {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f67448d = 6;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f67449e = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final C5063qe f67451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4700c8 f67452c;

    public C5013oe(int i10, @NonNull ECommerceOrder eCommerceOrder) {
        this(i10, new C5063qe(eCommerceOrder), new C5038pe());
    }

    @VisibleForTesting
    public C5013oe(int i10, @NonNull C5063qe c5063qe, @NonNull InterfaceC4700c8 interfaceC4700c8) {
        this.f67450a = i10;
        this.f67451b = c5063qe;
        this.f67452c = interfaceC4700c8;
    }

    @NonNull
    @VisibleForTesting
    public final InterfaceC4700c8 a() {
        return this.f67452c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "order info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Lf
    public final List<Ei> toProto() {
        return (List) this.f67452c.fromModel(this);
    }

    public final String toString() {
        return "OrderInfoEvent{eventType=" + this.f67450a + ", order=" + this.f67451b + ", converter=" + this.f67452c + '}';
    }
}
