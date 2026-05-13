package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingClient f64608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f64609b = new LinkedHashSet();

    public d(BillingClient billingClient) {
        this.f64608a = billingClient;
    }

    public final void a(Object obj) {
        this.f64609b.remove(obj);
        if (this.f64609b.size() == 0) {
            this.f64608a.endConnection();
        }
    }
}
