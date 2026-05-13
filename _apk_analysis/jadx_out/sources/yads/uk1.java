package yads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: loaded from: classes4.dex */
public final class uk1 implements sk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaCodecInfo[] f95699b;

    public uk1(boolean z10, boolean z11) {
        this.f95698a = (z10 || z11) ? 1 : 0;
    }

    @Override // yads.sk1
    public final int a() {
        if (this.f95699b == null) {
            this.f95699b = new MediaCodecList(this.f95698a).getCodecInfos();
        }
        return this.f95699b.length;
    }

    @Override // yads.sk1
    public final MediaCodecInfo a(int i10) {
        if (this.f95699b == null) {
            this.f95699b = new MediaCodecList(this.f95698a).getCodecInfos();
        }
        return this.f95699b[i10];
    }

    @Override // yads.sk1
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // yads.sk1
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // yads.sk1
    public final boolean b() {
        return true;
    }
}
