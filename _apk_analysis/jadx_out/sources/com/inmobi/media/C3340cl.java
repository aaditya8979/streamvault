package com.inmobi.media;

import okhttp3.Call;

/* JADX INFO: renamed from: com.inmobi.media.cl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3340cl implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Call f26997a;

    public C3340cl(Call call) {
        this.f26997a = call;
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        this.f26997a.cancel();
        return bn.r.f5635a;
    }
}
