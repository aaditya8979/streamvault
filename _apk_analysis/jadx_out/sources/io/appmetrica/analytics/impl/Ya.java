package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class Ya implements Parcelable {
    public static final Parcelable.Creator<Ya> CREATOR = new Xa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResultReceiver f66255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f66256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f66257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f66258d;

    public Ya(Parcel parcel) {
        Bundle bundle = parcel.readBundle(C6.class.getClassLoader());
        if (bundle == null) {
            this.f66257c = new HashMap();
            return;
        }
        this.f66255a = (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver");
        this.f66256b = bundle.getStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList");
        this.f66257c = Gm.a(bundle.getString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification"));
        this.f66258d = bundle.getBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration");
    }

    public Ya(C6 c62, List list, Map map, boolean z10) {
        this.f66256b = list;
        this.f66255a = c62;
        this.f66257c = map == null ? new HashMap() : new HashMap(map);
        this.f66258d = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver", this.f66255a);
        if (this.f66256b != null) {
            bundle.putStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList", new ArrayList<>(this.f66256b));
        }
        HashMap map = this.f66257c;
        if (map != null) {
            bundle.putString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification", Gm.a((Map) map));
        }
        bundle.putBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration", this.f66258d);
        parcel.writeBundle(bundle);
    }
}
