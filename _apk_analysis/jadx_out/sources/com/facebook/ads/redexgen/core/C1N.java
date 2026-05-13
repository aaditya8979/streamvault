package com.facebook.ads.redexgen.core;

import android.media.AudioAttributes;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1N, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1N {
    public final AudioAttributes A00;

    public C1N(C3212oy c3212oy) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c3212oy.A02).setFlags(c3212oy.A03).setUsage(c3212oy.A05);
        if (AbstractC15184a.A02 >= 29) {
            C1L.A00(usage, c3212oy.A01);
        }
        if (AbstractC15184a.A02 >= 32) {
            C1M.A00(usage, c3212oy.A04);
        }
        this.A00 = usage.build();
    }
}
