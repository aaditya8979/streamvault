package f6;

import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.m;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import s7.a0;
import s7.m0;
import s7.z;

/* JADX INFO: compiled from: Ac3Util.java */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f61475a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f61476b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f61477c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f61478d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f61479e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f61480f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: f6.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Ac3Util.java */
    public static final class C0762b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f61481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f61482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f61483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f61484d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f61485e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f61486f;

        public C0762b(@Nullable String str, int i10, int i11, int i12, int i13, int i14) {
            this.f61481a = str;
            this.f61482b = i10;
            this.f61484d = i11;
            this.f61483c = i12;
            this.f61485e = i13;
            this.f61486f = i14;
        }
    }

    public static int a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i10 = iPosition; i10 <= iLimit; i10++) {
            if ((m0.F(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - iPosition;
            }
        }
        return -1;
    }

    public static int b(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f61476b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f61480f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f61479e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static com.google.android.exoplayer2.m c(a0 a0Var, String str, String str2, @Nullable DrmInitData drmInitData) {
        int i10 = f61476b[(a0Var.D() & 192) >> 6];
        int iD = a0Var.D();
        int i11 = f61478d[(iD & 56) >> 3];
        if ((iD & 4) != 0) {
            i11++;
        }
        return new m.b().S(str).e0("audio/ac3").H(i11).f0(i10).M(drmInitData).V(str2).E();
    }

    public static int d(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f61475a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static C0762b e(z zVar) {
        int iB;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int iH;
        int i14;
        int i15;
        int i16;
        int i17;
        int iE = zVar.e();
        zVar.r(40);
        boolean z10 = zVar.h(5) > 10;
        zVar.p(iE);
        int i18 = -1;
        if (z10) {
            zVar.r(16);
            int iH2 = zVar.h(2);
            if (iH2 == 0) {
                i18 = 0;
            } else if (iH2 == 1) {
                i18 = 1;
            } else if (iH2 == 2) {
                i18 = 2;
            }
            zVar.r(3);
            iB = (zVar.h(11) + 1) * 2;
            int iH3 = zVar.h(2);
            if (iH3 == 3) {
                i10 = f61477c[zVar.h(2)];
                i14 = 6;
                iH = 3;
            } else {
                iH = zVar.h(2);
                i14 = f61475a[iH];
                i10 = f61476b[iH3];
            }
            i11 = i14 * 256;
            int iH4 = zVar.h(3);
            boolean zG = zVar.g();
            i12 = f61478d[iH4] + (zG ? 1 : 0);
            zVar.r(10);
            if (zVar.g()) {
                zVar.r(8);
            }
            if (iH4 == 0) {
                zVar.r(5);
                if (zVar.g()) {
                    zVar.r(8);
                }
            }
            if (i18 == 1 && zVar.g()) {
                zVar.r(16);
            }
            if (zVar.g()) {
                if (iH4 > 2) {
                    zVar.r(2);
                }
                if ((iH4 & 1) == 0 || iH4 <= 2) {
                    i16 = 6;
                } else {
                    i16 = 6;
                    zVar.r(6);
                }
                if ((iH4 & 4) != 0) {
                    zVar.r(i16);
                }
                if (zG && zVar.g()) {
                    zVar.r(5);
                }
                if (i18 == 0) {
                    if (zVar.g()) {
                        i17 = 6;
                        zVar.r(6);
                    } else {
                        i17 = 6;
                    }
                    if (iH4 == 0 && zVar.g()) {
                        zVar.r(i17);
                    }
                    if (zVar.g()) {
                        zVar.r(i17);
                    }
                    int iH5 = zVar.h(2);
                    if (iH5 == 1) {
                        zVar.r(5);
                    } else if (iH5 == 2) {
                        zVar.r(12);
                    } else if (iH5 == 3) {
                        int iH6 = zVar.h(5);
                        if (zVar.g()) {
                            zVar.r(5);
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                if (zVar.g()) {
                                    zVar.r(4);
                                }
                                if (zVar.g()) {
                                    zVar.r(4);
                                }
                            }
                        }
                        if (zVar.g()) {
                            zVar.r(5);
                            if (zVar.g()) {
                                zVar.r(7);
                                if (zVar.g()) {
                                    zVar.r(8);
                                }
                            }
                        }
                        zVar.r((iH6 + 2) * 8);
                        zVar.c();
                    }
                    if (iH4 < 2) {
                        if (zVar.g()) {
                            zVar.r(14);
                        }
                        if (iH4 == 0 && zVar.g()) {
                            zVar.r(14);
                        }
                    }
                    if (zVar.g()) {
                        if (iH == 0) {
                            zVar.r(5);
                        } else {
                            for (int i19 = 0; i19 < i14; i19++) {
                                if (zVar.g()) {
                                    zVar.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (zVar.g()) {
                zVar.r(5);
                if (iH4 == 2) {
                    zVar.r(4);
                }
                if (iH4 >= 6) {
                    zVar.r(2);
                }
                if (zVar.g()) {
                    zVar.r(8);
                }
                if (iH4 == 0 && zVar.g()) {
                    zVar.r(8);
                }
                if (iH3 < 3) {
                    zVar.q();
                }
            }
            if (i18 == 0 && iH != 3) {
                zVar.q();
            }
            if (i18 == 2 && (iH == 3 || zVar.g())) {
                i15 = 6;
                zVar.r(6);
            } else {
                i15 = 6;
            }
            str = (zVar.g() && zVar.h(i15) == 1 && zVar.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i13 = i18;
        } else {
            zVar.r(32);
            int iH7 = zVar.h(2);
            String str2 = iH7 == 3 ? null : "audio/ac3";
            iB = b(iH7, zVar.h(6));
            zVar.r(8);
            int iH8 = zVar.h(3);
            if ((iH8 & 1) != 0 && iH8 != 1) {
                zVar.r(2);
            }
            if ((iH8 & 4) != 0) {
                zVar.r(2);
            }
            if (iH8 == 2) {
                zVar.r(2);
            }
            int[] iArr = f61476b;
            i10 = iH7 < iArr.length ? iArr[iH7] : -1;
            i11 = 1536;
            i12 = f61478d[iH8] + (zVar.g() ? 1 : 0);
            i13 = -1;
            str = str2;
        }
        return new C0762b(str, i13, i12, i10, iB, i11);
    }

    public static int f(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return b((b10 & 192) >> 6, b10 & 63);
    }

    public static com.google.android.exoplayer2.m g(a0 a0Var, String str, String str2, @Nullable DrmInitData drmInitData) {
        a0Var.Q(2);
        int i10 = f61476b[(a0Var.D() & 192) >> 6];
        int iD = a0Var.D();
        int i11 = f61478d[(iD & 14) >> 1];
        if ((iD & 1) != 0) {
            i11++;
        }
        if (((a0Var.D() & 30) >> 1) > 0 && (2 & a0Var.D()) != 0) {
            i11 += 2;
        }
        return new m.b().S(str).e0((a0Var.a() <= 0 || (a0Var.D() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").H(i11).f0(i10).M(drmInitData).V(str2).E();
    }

    public static int h(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int i(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                return 40 << ((bArr[(b10 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
