package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.Image;
import java.util.Comparator;

/* JADX INFO: renamed from: com.inmobi.media.yj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3889yj implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28601a;

    public C3889yj(int i10) {
        this.f28601a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return fn.b.d(Integer.valueOf(Math.abs(((Image) obj).getWidth() - this.f28601a)), Integer.valueOf(Math.abs(((Image) obj2).getWidth() - this.f28601a)));
    }
}
