package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5172v implements InterfaceC5197w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f67795a;

    public C5172v(@NotNull Context context) {
        this.f67795a = context;
    }

    @Nullable
    public final String a() {
        C4696c4 c4696c4L = C4696c4.l();
        Context context = this.f67795a;
        N9 n92 = c4696c4L.f66470t;
        if (n92 == null) {
            synchronized (c4696c4L) {
                n92 = c4696c4L.f66470t;
                if (n92 == null) {
                    n92 = new N9(context);
                    c4696c4L.f66470t = n92;
                }
            }
        }
        Bundle applicationMetaData = n92.f65635d.getApplicationMetaData(n92.f65632a);
        if (applicationMetaData != null) {
            return applicationMetaData.getString("io.appmetrica.analytics.plugin_supported_ad_revenue_sources");
        }
        return null;
    }
}
