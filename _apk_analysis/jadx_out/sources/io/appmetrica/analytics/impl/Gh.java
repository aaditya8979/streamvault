package io.appmetrica.analytics.impl;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.internal.CounterConfiguration;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class Gh extends I3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public E8 f65283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C5188vf f65284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f65285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f65286f;

    public Gh(@NonNull Cf cf2, @NonNull CounterConfiguration counterConfiguration, @NonNull E8 e82) {
        this(cf2, counterConfiguration, e82, null);
    }

    public Gh(@NonNull Cf cf2, @NonNull CounterConfiguration counterConfiguration, @NonNull E8 e82, @Nullable String str) {
        super(cf2, counterConfiguration);
        this.f65285e = true;
        this.f65286f = str;
        this.f65283c = e82;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        this.f65350b.toBundle(bundle);
        Cf cf2 = this.f65349a;
        synchronized (cf2) {
            bundle.putParcelable("PROCESS_CFG_OBJ", cf2);
        }
        return bundle;
    }

    @Nullable
    public final synchronized String d() {
        E8 e82;
        e82 = this.f65283c;
        return e82.f65188a.isEmpty() ? null : new JSONObject(e82.f65188a).toString();
    }

    @Nullable
    public final synchronized String e() {
        return this.f65286f;
    }

    public boolean f() {
        return this.f65285e;
    }
}
