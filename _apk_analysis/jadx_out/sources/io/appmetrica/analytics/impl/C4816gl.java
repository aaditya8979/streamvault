package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4816gl extends ECommerceEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final C4737dj f66844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4700c8 f66845b;

    public C4816gl(@NonNull ECommerceScreen eCommerceScreen) {
        this(new C4737dj(eCommerceScreen), new C4842hl());
    }

    @VisibleForTesting
    public C4816gl(@NonNull C4737dj c4737dj, @NonNull InterfaceC4700c8 interfaceC4700c8) {
        this.f66844a = c4737dj;
        this.f66845b = interfaceC4700c8;
    }

    @NonNull
    @VisibleForTesting
    public final InterfaceC4700c8 a() {
        return this.f66845b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Lf
    public final List<Ei> toProto() {
        return (List) this.f66845b.fromModel(this);
    }

    public final String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f66844a + ", converter=" + this.f66845b + '}';
    }
}
