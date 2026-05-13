package com.facebook.ads.redexgen.core;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C16107o {
    public static final AudioAttributes A00 = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int A00(int i10, int i11) {
        for (int i12 = 8; i12 > 0; i12--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(AbstractC15184a.A01(i12)).build(), A00)) {
                return i12;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int[] A01() {
        C14491h c14491hA01 = AbstractC1673Am.A01();
        AbstractC3240pg it = C16117p.A06.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), A00)) {
                c14491hA01.A04(Integer.valueOf(iIntValue));
            }
        }
        c14491hA01.A04(2);
        return AD.A0C(c14491hA01.A05());
    }
}
