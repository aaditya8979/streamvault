package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.UUID;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC4309w0 f29478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final NetworkSettings f29479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final bn.g f29480c;

    public static final class a extends Lambda implements sn.a<BaseAdAdapter<?, ?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ W0 f29481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ H f29482b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(W0 w02, H h10) {
            super(0);
            this.f29481a = w02;
            this.f29482b = h10;
        }

        @Override // sn.a
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseAdAdapter<?, ?> invoke() {
            return this.f29481a.a(this.f29482b.e(), this.f29482b.a(), this.f29482b.d());
        }
    }

    public H(@NotNull W0 w02, @NotNull AbstractC4309w0 abstractC4309w0, @NotNull NetworkSettings networkSettings) {
        tn.p.k(w02, "adTools");
        tn.p.k(abstractC4309w0, "adUnitData");
        tn.p.k(networkSettings, "providerSettings");
        this.f29478a = abstractC4309w0;
        this.f29479b = networkSettings;
        this.f29480c = kotlin.b.b(new a(w02, this));
    }

    @NotNull
    public final IronSource.a a() {
        return this.f29478a.b().a();
    }

    @Nullable
    public final BaseAdAdapter<?, ?> b() {
        return (BaseAdAdapter) this.f29480c.getValue();
    }

    @NotNull
    public final String c() {
        String providerName = this.f29479b.getProviderName();
        tn.p.j(providerName, "providerSettings.providerName");
        return providerName;
    }

    @NotNull
    public final UUID d() {
        return this.f29478a.b().b();
    }

    @NotNull
    public final NetworkSettings e() {
        return this.f29479b;
    }
}
