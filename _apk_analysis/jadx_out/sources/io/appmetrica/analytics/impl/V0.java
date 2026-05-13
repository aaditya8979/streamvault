package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* JADX INFO: loaded from: classes6.dex */
public final class V0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f66019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f66020b;

    public V0(C5149u1 c5149u1, UserProfile userProfile) {
        this.f66020b = c5149u1;
        this.f66019a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5149u1.a(this.f66020b).reportUserProfile(this.f66019a);
    }
}
