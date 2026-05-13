package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.Image;
import java.util.Comparator;

/* JADX INFO: renamed from: com.inmobi.media.zj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3914zj implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28662a;

    public C3914zj(int i10) {
        this.f28662a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return fn.b.d(Integer.valueOf(Math.abs(((Image) obj).getWidth() - this.f28662a)), Integer.valueOf(Math.abs(((Image) obj2).getWidth() - this.f28662a)));
    }
}
