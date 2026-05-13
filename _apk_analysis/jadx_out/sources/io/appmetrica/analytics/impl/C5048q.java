package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5048q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f67544a = new WeakHashMap();

    public final boolean a(Activity activity, EnumC5023p enumC5023p) {
        if (activity != null && this.f67544a.get(activity) == enumC5023p) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f67544a.put(activity, enumC5023p);
        return true;
    }
}
