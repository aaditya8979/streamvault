package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingClient f64555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f64556b = new LinkedHashSet();

    public d(BillingClient billingClient) {
        this.f64555a = billingClient;
    }

    public final void a(Object obj) {
        this.f64556b.remove(obj);
        if (this.f64556b.size() == 0) {
            this.f64555a.endConnection();
        }
    }
}
