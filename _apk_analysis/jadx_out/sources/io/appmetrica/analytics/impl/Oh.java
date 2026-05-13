package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* JADX INFO: loaded from: classes.dex */
public final class Oh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f65713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4839hi f65714b;

    public Oh(C4839hi c4839hi, UserProfile userProfile) {
        this.f65714b = c4839hi;
        this.f65713a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4839hi c4839hi = this.f65714b;
        C4839hi.a(c4839hi.f66922a, c4839hi.f66925d, c4839hi.f66926e).reportUserProfile(this.f65713a);
    }
}
