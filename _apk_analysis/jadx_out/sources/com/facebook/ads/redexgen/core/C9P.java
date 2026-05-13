package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.exoplayer.drm.DrmSessionEventListener;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9P, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C9P {
    public final int A00;
    public final C3053mL A01;
    public final CopyOnWriteArrayList<DrmSessionEventListener.EventDispatcher.ListenerAndHandler> A02;

    public C9P() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public C9P(CopyOnWriteArrayList<DrmSessionEventListener.EventDispatcher.ListenerAndHandler> copyOnWriteArrayList, int i10, C3053mL c3053mL) {
        this.A02 = copyOnWriteArrayList;
        this.A00 = i10;
        this.A01 = c3053mL;
    }

    public final C9P A00(int i10, C3053mL c3053mL) {
        return new C9P(this.A02, i10, c3053mL);
    }
}
