package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4713cl extends ECommerceEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final If f66544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final C4737dj f66545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4700c8 f66546c;

    public C4713cl(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommerceScreen eCommerceScreen) {
        this(new If(eCommerceProduct), new C4737dj(eCommerceScreen), new C4739dl());
    }

    @VisibleForTesting
    public C4713cl(@NonNull If r12, @NonNull C4737dj c4737dj, @NonNull InterfaceC4700c8 interfaceC4700c8) {
        this.f66544a = r12;
        this.f66545b = c4737dj;
        this.f66546c = interfaceC4700c8;
    }

    @NonNull
    @VisibleForTesting
    public final InterfaceC4700c8 a() {
        return this.f66546c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown product card info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Lf
    public final List<Ei> toProto() {
        return (List) this.f66546c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductCardInfoEvent{product=" + this.f66544a + ", screen=" + this.f66545b + ", converter=" + this.f66546c + '}';
    }
}
