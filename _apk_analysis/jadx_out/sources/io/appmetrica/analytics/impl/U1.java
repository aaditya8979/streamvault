package io.appmetrica.analytics.impl;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class U1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f65971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5250y2 f65972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f65973c;

    public U1(List list, C5250y2 c5250y2, List list2) {
        this.f65971a = list;
        this.f65972b = c5250y2;
        this.f65973c = list2;
    }

    public final String toString() {
        return "AppPermissionsState{mPermissionStateList=" + this.f65971a + ", mBackgroundRestrictionsState=" + this.f65972b + ", mAvailableProviders=" + this.f65973c + '}';
    }
}
