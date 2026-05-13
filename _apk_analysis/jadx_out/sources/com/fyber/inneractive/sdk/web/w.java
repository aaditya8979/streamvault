package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f19736a;

    public w(x xVar) {
        this.f19736a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19736a.f19744a.getClass();
        com.fyber.inneractive.sdk.util.r.f19556b.post(new v("Image failed to download."));
        this.f19736a.f19744a.a(com.fyber.inneractive.sdk.mraid.k.STORE_PICTURE, "Error downloading and saving image file.");
        IAlog.a("failed to download and save the image file.", new Object[0]);
    }
}
