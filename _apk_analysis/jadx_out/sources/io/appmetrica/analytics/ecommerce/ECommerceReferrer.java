package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class ECommerceReferrer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f64822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f64823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ECommerceScreen f64824c;

    @Nullable
    public String getIdentifier() {
        return this.f64823b;
    }

    @Nullable
    public ECommerceScreen getScreen() {
        return this.f64824c;
    }

    @Nullable
    public String getType() {
        return this.f64822a;
    }

    @NonNull
    public ECommerceReferrer setIdentifier(@Nullable String str) {
        this.f64823b = str;
        return this;
    }

    @NonNull
    public ECommerceReferrer setScreen(@Nullable ECommerceScreen eCommerceScreen) {
        this.f64824c = eCommerceScreen;
        return this;
    }

    @NonNull
    public ECommerceReferrer setType(@Nullable String str) {
        this.f64822a = str;
        return this;
    }

    public String toString() {
        return "ECommerceReferrer{type='" + this.f64822a + "', identifier='" + this.f64823b + "', screen=" + this.f64824c + '}';
    }
}
