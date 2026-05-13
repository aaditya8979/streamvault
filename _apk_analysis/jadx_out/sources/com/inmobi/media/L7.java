package com.inmobi.media;

import android.view.Surface;

/* JADX INFO: loaded from: classes8.dex */
public final class L7 implements Ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f25859a;

    public L7(N7 n72) {
        this.f25859a = n72;
    }

    @Override // com.inmobi.media.Ij
    public final void a() {
        this.f25859a.d();
    }

    @Override // com.inmobi.media.Ij
    public final void b() {
        this.f25859a.c();
    }

    @Override // com.inmobi.media.Ij
    public final void c() {
        Surface surface;
        N7 n72 = this.f25859a;
        if (n72.f26008q != null) {
            C3629o8 c3629o8 = n72.f26017z;
            if (c3629o8.f27765g || (surface = c3629o8.f27763e) == null) {
                return;
            }
            c3629o8.f27765g = true;
            c3629o8.f27760b.setVideoSurface(surface);
        }
    }
}
