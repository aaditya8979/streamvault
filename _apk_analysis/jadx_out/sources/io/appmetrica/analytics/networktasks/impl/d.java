package io.appmetrica.analytics.networktasks.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkTask f68259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68260b;

    public d(NetworkTask networkTask) {
        this.f68259a = networkTask;
        this.f68260b = networkTask.description();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f68260b.equals(((d) obj).f68260b);
    }

    public final int hashCode() {
        return this.f68260b.hashCode();
    }
}
