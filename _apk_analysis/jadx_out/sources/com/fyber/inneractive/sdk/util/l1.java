package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class l1 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f19540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f19541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f19542c;

    public l1(k1 k1Var, Uri uri, List list) {
        this.f19540a = k1Var;
        this.f19541b = uri;
        this.f19542c = list;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f19540a.mPriority.compareTo(((l1) obj).f19540a.mPriority);
    }
}
