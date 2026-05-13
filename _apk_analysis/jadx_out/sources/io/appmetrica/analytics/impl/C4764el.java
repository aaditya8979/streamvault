package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.el, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4764el extends ECommerceEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final If f66687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final C5264yg f66688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4700c8 f66689c;

    public C4764el(@NonNull ECommerceProduct eCommerceProduct, @Nullable ECommerceReferrer eCommerceReferrer) {
        this(new If(eCommerceProduct), eCommerceReferrer == null ? null : new C5264yg(eCommerceReferrer), new C4790fl());
    }

    @VisibleForTesting
    public C4764el(@NonNull If r12, @Nullable C5264yg c5264yg, @NonNull InterfaceC4700c8 interfaceC4700c8) {
        this.f66687a = r12;
        this.f66688b = c5264yg;
        this.f66689c = interfaceC4700c8;
    }

    @NonNull
    @VisibleForTesting
    public final InterfaceC4700c8 a() {
        return this.f66689c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown product details info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Lf
    public final List<Ei> toProto() {
        return (List) this.f66689c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.f66687a + ", referrer=" + this.f66688b + ", converter=" + this.f66689c + '}';
    }
}
