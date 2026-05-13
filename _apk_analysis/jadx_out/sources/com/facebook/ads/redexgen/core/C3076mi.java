package com.facebook.ads.redexgen.core;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3076mi implements InterfaceC1683Aw {
    public MediaCodecInfo[] A00;
    public final int A01;

    public C3076mi(boolean z10, boolean z11) {
        this.A01 = (z10 || z11) ? 1 : 0;
    }

    @EnsuresNonNull({"mediaCodecInfos"})
    private void A00() {
        if (this.A00 == null) {
            this.A00 = new MediaCodecList(this.A01).getCodecInfos();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1683Aw
    public final int A7H() {
        A00();
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1683Aw
    public final MediaCodecInfo A7I(int i10) {
        A00();
        return this.A00[i10];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1683Aw
    public final boolean AAI(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1683Aw
    public final boolean AAJ(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1683Aw
    public final boolean AIK() {
        return true;
    }
}
