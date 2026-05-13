package yads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes4.dex */
public final class lk1 extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f92011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ik1 f92012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f92013e;

    public lk1(int i10, mx0 mx0Var, rk1 rk1Var, boolean z10) {
        this("Decoder init failed: [" + i10 + "], " + mx0Var, rk1Var, mx0Var.f92610m, z10, null, a(i10));
    }

    public lk1(String str, Throwable th2, String str2, boolean z10, ik1 ik1Var, String str3) {
        super(str, th2);
        this.f92010b = str2;
        this.f92011c = z10;
        this.f92012d = ik1Var;
        this.f92013e = str3;
    }

    public static String a(int i10) {
        return "com.monetization.ads.exoplayer2.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
    }

    public static String a(Exception exc) {
        if (exc instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) exc).getDiagnosticInfo();
        }
        return null;
    }
}
