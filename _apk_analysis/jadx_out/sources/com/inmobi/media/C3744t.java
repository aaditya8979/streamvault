package com.inmobi.media;

import com.squareup.picasso.Picasso;

/* JADX INFO: renamed from: com.inmobi.media.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3744t implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3819w f28154a;

    public C3744t(C3819w c3819w) {
        this.f28154a = c3819w;
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        C3605n9 c3605n9 = this.f28154a.f28400d;
        if (c3605n9 != null) {
            c3605n9.a("AdChoiceViewManager", "invokeOnCancellation Called");
        }
        C3819w c3819w = this.f28154a;
        C3605n9 c3605n92 = c3819w.f28400d;
        if (c3605n92 != null) {
            c3605n92.a("AdChoiceViewManager", "destroy called");
        }
        Picasso picasso = Qf.f26183a;
        Qf.b(c3819w.f28397a).cancelTag(c3819w.f28401e);
        return bn.r.f5635a;
    }
}
