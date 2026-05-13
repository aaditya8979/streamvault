package b6;

import a6.h0;
import a6.k0;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import b6.q;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer.video.DummySurface;
import com.google.android.gms.common.Scopes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.di.ServiceProvider;
import e4.f0;
import e4.q0;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends MediaCodecRenderer {

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final int[] f5414k1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static boolean f5415l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static boolean f5416m1;
    public final int A0;
    public final boolean B0;
    public final long[] C0;
    public final long[] D0;
    public a E0;
    public boolean F0;
    public boolean G0;
    public Surface H0;
    public Surface I0;
    public int J0;
    public boolean K0;
    public long L0;
    public long M0;
    public long N0;
    public int O0;
    public int P0;
    public int Q0;
    public long R0;
    public int S0;
    public float T0;

    @Nullable
    public MediaFormat U0;
    public int V0;
    public int W0;
    public int X0;
    public float Y0;
    public int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f5417a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f5418b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public float f5419c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f5420d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public int f5421e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    @Nullable
    public b f5422f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public long f5423g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public long f5424h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f5425i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    @Nullable
    public g f5426j1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Context f5427w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final h f5428x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final q.a f5429y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final long f5430z0;

    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f5433c;

        public a(int i10, int i11, int i12) {
            this.f5431a = i10;
            this.f5432b = i11;
            this.f5433c = i12;
        }
    }

    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    @TargetApi(23)
    public final class b implements MediaCodec.OnFrameRenderedListener, Handler.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f5434b;

        public b(MediaCodec mediaCodec) {
            Handler handler = new Handler(this);
            this.f5434b = handler;
            mediaCodec.setOnFrameRenderedListener(this, handler);
        }

        public final void a(long j10) {
            d dVar = d.this;
            if (this != dVar.f5422f1) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                dVar.g1();
            } else {
                dVar.f1(j10);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a(k0.J0(message.arg1, message.arg2));
            return true;
        }

        @Override // android.media.MediaCodec.OnFrameRenderedListener
        public void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
            if (k0.f3574a >= 30) {
                a(j10);
            } else {
                this.f5434b.sendMessageAtFrontOfQueue(Message.obtain(this.f5434b, 0, (int) (j10 >> 32), (int) j10));
            }
        }
    }

    @Deprecated
    public d(Context context, com.google.android.exoplayer.mediacodec.b bVar, long j10, @Nullable com.google.android.exoplayer.drm.a<j4.j> aVar, boolean z10, boolean z11, @Nullable Handler handler, @Nullable q qVar, int i10) {
        super(2, bVar, aVar, z10, z11, 30.0f);
        this.f5430z0 = j10;
        this.A0 = i10;
        Context applicationContext = context.getApplicationContext();
        this.f5427w0 = applicationContext;
        this.f5428x0 = new h(applicationContext);
        this.f5429y0 = new q.a(handler, qVar);
        this.B0 = O0();
        this.C0 = new long[10];
        this.D0 = new long[10];
        this.f5424h1 = -9223372036854775807L;
        this.f5423g1 = -9223372036854775807L;
        this.M0 = -9223372036854775807L;
        this.V0 = -1;
        this.W0 = -1;
        this.Y0 = -1.0f;
        this.T0 = -1.0f;
        this.J0 = 1;
        L0();
    }

    @TargetApi(21)
    public static void N0(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    public static boolean O0() {
        return "NVIDIA".equals(k0.f3576c);
    }

    public static int Q0(com.google.android.exoplayer.mediacodec.a aVar, String str, int i10, int i11) {
        int i12;
        int iK;
        if (i10 == -1 || i11 == -1) {
            return -1;
        }
        str.hashCode();
        i12 = 4;
        switch (str) {
            case "video/3gpp":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                iK = i10 * i11;
                i12 = 2;
                break;
            case "video/hevc":
            case "video/x-vnd.on2.vp9":
                iK = i10 * i11;
                break;
            case "video/avc":
                String str2 = k0.f3577d;
                if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(k0.f3576c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !aVar.f20210g)))) {
                    iK = k0.k(i10, 16) * k0.k(i11, 16) * 16 * 16;
                    i12 = 2;
                    break;
                }
                break;
        }
        return -1;
    }

    public static Point R0(com.google.android.exoplayer.mediacodec.a aVar, Format format) {
        int i10 = format.f19933p;
        int i11 = format.f19932o;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : f5414k1) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (k0.f3574a >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point pointB = aVar.b(i15, i13);
                if (aVar.t(pointB.x, pointB.y, format.f19934q)) {
                    return pointB;
                }
            } else {
                try {
                    int iK = k0.k(i13, 16) * 16;
                    int iK2 = k0.k(i14, 16) * 16;
                    if (iK * iK2 <= MediaCodecUtil.H()) {
                        int i16 = z10 ? iK2 : iK;
                        if (!z10) {
                            iK = iK2;
                        }
                        return new Point(i16, iK);
                    }
                } catch (MediaCodecUtil.DecoderQueryException unused) {
                }
            }
        }
        return null;
    }

    public static List<com.google.android.exoplayer.mediacodec.a> T0(com.google.android.exoplayer.mediacodec.b bVar, Format format, boolean z10, boolean z11) throws MediaCodecUtil.DecoderQueryException {
        Pair<Integer, Integer> pairL;
        String str = format.f19927j;
        if (str == null) {
            return Collections.emptyList();
        }
        List<com.google.android.exoplayer.mediacodec.a> listP = MediaCodecUtil.p(bVar.getDecoderInfos(str, z10, z11), format);
        if ("video/dolby-vision".equals(str) && (pairL = MediaCodecUtil.l(format)) != null) {
            int iIntValue = ((Integer) pairL.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                listP.addAll(bVar.getDecoderInfos("video/hevc", z10, z11));
            } else if (iIntValue == 512) {
                listP.addAll(bVar.getDecoderInfos("video/avc", z10, z11));
            }
        }
        return Collections.unmodifiableList(listP);
    }

    public static int U0(com.google.android.exoplayer.mediacodec.a aVar, Format format) {
        if (format.f19928k == -1) {
            return Q0(aVar, format.f19927j, format.f19932o, format.f19933p);
        }
        int size = format.f19929l.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += format.f19929l.get(i10).length;
        }
        return format.f19928k + length;
    }

    public static boolean W0(long j10) {
        return j10 < -30000;
    }

    public static boolean X0(long j10) {
        return j10 < -500000;
    }

    @TargetApi(29)
    public static void k1(MediaCodec mediaCodec, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        mediaCodec.setParameters(bundle);
    }

    @TargetApi(23)
    public static void m1(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    public boolean D0(com.google.android.exoplayer.mediacodec.a aVar) {
        return this.H0 != null || r1(aVar);
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    public int F0(com.google.android.exoplayer.mediacodec.b bVar, @Nullable com.google.android.exoplayer.drm.a<j4.j> aVar, Format format) throws MediaCodecUtil.DecoderQueryException {
        int i10 = 0;
        if (!a6.p.n(format.f19927j)) {
            return q0.create(0);
        }
        DrmInitData drmInitData = format.f19930m;
        boolean z10 = drmInitData != null;
        List<com.google.android.exoplayer.mediacodec.a> listT0 = T0(bVar, format, z10, false);
        if (z10 && listT0.isEmpty()) {
            listT0 = T0(bVar, format, false, false);
        }
        if (listT0.isEmpty()) {
            return q0.create(1);
        }
        if (!(drmInitData == null || j4.j.class.equals(format.D) || (format.D == null && e4.e.w(aVar, drmInitData)))) {
            return q0.create(2);
        }
        com.google.android.exoplayer.mediacodec.a aVar2 = listT0.get(0);
        boolean zL = aVar2.l(format);
        int i11 = aVar2.n(format) ? 16 : 8;
        if (zL) {
            List<com.google.android.exoplayer.mediacodec.a> listT02 = T0(bVar, format, z10, true);
            if (!listT02.isEmpty()) {
                com.google.android.exoplayer.mediacodec.a aVar3 = listT02.get(0);
                if (aVar3.l(format) && aVar3.n(format)) {
                    i10 = 32;
                }
            }
        }
        return q0.create(zL ? 4 : 3, i11, i10);
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    public void H(com.google.android.exoplayer.mediacodec.a aVar, MediaCodec mediaCodec, Format format, @Nullable MediaCrypto mediaCrypto, float f10) {
        String str = aVar.f20206c;
        a aVarS0 = S0(aVar, format, k());
        this.E0 = aVarS0;
        MediaFormat mediaFormatV0 = V0(format, str, aVarS0, f10, this.B0, this.f5421e1);
        if (this.H0 == null) {
            a6.a.f(r1(aVar));
            if (this.I0 == null) {
                this.I0 = DummySurface.f(this.f5427w0, aVar.f20210g);
            }
            this.H0 = this.I0;
        }
        mediaCodec.configure(mediaFormatV0, this.H0, mediaCrypto, 0);
        if (k0.f3574a < 23 || !this.f5420d1) {
            return;
        }
        this.f5422f1 = new b(mediaCodec);
    }

    public final void K0() {
        MediaCodec mediaCodecQ;
        this.K0 = false;
        if (k0.f3574a < 23 || !this.f5420d1 || (mediaCodecQ = Q()) == null) {
            return;
        }
        this.f5422f1 = new b(mediaCodecQ);
    }

    public final void L0() {
        this.Z0 = -1;
        this.f5417a1 = -1;
        this.f5419c1 = -1.0f;
        this.f5418b1 = -1;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0653 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0658 A[Catch: all -> 0x0660, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x001c, B:426:0x065a, B:12:0x0020, B:14:0x0026, B:16:0x002e, B:19:0x0036, B:20:0x003c, B:401:0x0617, B:404:0x061d, B:425:0x0658, B:411:0x0633, B:414:0x063d, B:417:0x0646, B:403:0x061b, B:22:0x0041, B:25:0x004d, B:28:0x0059, B:31:0x0065, B:34:0x006f, B:37:0x007b, B:40:0x0087, B:43:0x0093, B:46:0x009f, B:49:0x00ab, B:52:0x00b7, B:55:0x00c3, B:58:0x00cf, B:61:0x00db, B:64:0x00e7, B:67:0x00f3, B:70:0x00ff, B:73:0x010b, B:76:0x0117, B:79:0x0123, B:82:0x012f, B:85:0x013b, B:88:0x0147, B:91:0x0153, B:94:0x015f, B:97:0x016b, B:100:0x0177, B:103:0x0183, B:106:0x018f, B:109:0x019b, B:112:0x01a7, B:115:0x01b3, B:118:0x01bf, B:121:0x01cb, B:124:0x01d7, B:127:0x01e3, B:130:0x01ef, B:133:0x01fb, B:136:0x0206, B:139:0x0212, B:142:0x021e, B:145:0x022a, B:148:0x0236, B:151:0x0242, B:154:0x024e, B:157:0x025a, B:160:0x0266, B:163:0x0272, B:166:0x027e, B:169:0x028a, B:172:0x0296, B:175:0x02a2, B:178:0x02ae, B:181:0x02ba, B:184:0x02c6, B:187:0x02d1, B:190:0x02dd, B:193:0x02e9, B:196:0x02f5, B:199:0x0301, B:202:0x030d, B:205:0x0319, B:208:0x0325, B:211:0x0331, B:214:0x033d, B:217:0x0349, B:220:0x0354, B:223:0x035f, B:226:0x036a, B:229:0x0376, B:232:0x0382, B:235:0x038e, B:238:0x039a, B:241:0x03a6, B:244:0x03b2, B:247:0x03be, B:250:0x03ca, B:253:0x03d6, B:256:0x03e2, B:259:0x03ee, B:262:0x03fa, B:265:0x0406, B:268:0x0412, B:271:0x041e, B:274:0x042a, B:277:0x0436, B:280:0x0442, B:283:0x044e, B:286:0x045a, B:289:0x0466, B:292:0x0472, B:295:0x047e, B:298:0x048a, B:301:0x0496, B:304:0x04a2, B:307:0x04ae, B:310:0x04ba, B:313:0x04c5, B:316:0x04d1, B:319:0x04dd, B:322:0x04e9, B:325:0x04f5, B:328:0x0500, B:331:0x050b, B:334:0x0517, B:337:0x0523, B:340:0x052f, B:343:0x053b, B:346:0x0547, B:349:0x0553, B:352:0x055f, B:355:0x056b, B:358:0x0577, B:361:0x0583, B:364:0x058f, B:367:0x059b, B:370:0x05a7, B:373:0x05b3, B:376:0x05be, B:379:0x05c9, B:382:0x05d4, B:385:0x05df, B:388:0x05ea, B:391:0x05f5, B:394:0x0600, B:397:0x060b, B:427:0x065c), top: B:433:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean M0(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 2398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.d.M0(java.lang.String):boolean");
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    @CallSuper
    public boolean O() {
        try {
            return super.O();
        } finally {
            this.Q0 = 0;
        }
    }

    public void P0(MediaCodec mediaCodec, int i10, long j10) {
        h0.a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i10, false);
        h0.c();
        t1(1);
    }

    public a S0(com.google.android.exoplayer.mediacodec.a aVar, Format format, Format[] formatArr) {
        int iQ0;
        int iMax = format.f19932o;
        int iMax2 = format.f19933p;
        int iU0 = U0(aVar, format);
        if (formatArr.length == 1) {
            if (iU0 != -1 && (iQ0 = Q0(aVar, format.f19927j, format.f19932o, format.f19933p)) != -1) {
                iU0 = Math.min((int) (iU0 * 1.5f), iQ0);
            }
            return new a(iMax, iMax2, iU0);
        }
        boolean z10 = false;
        for (Format format2 : formatArr) {
            if (aVar.o(format, format2, false)) {
                int i10 = format2.f19932o;
                z10 |= i10 == -1 || format2.f19933p == -1;
                iMax = Math.max(iMax, i10);
                iMax2 = Math.max(iMax2, format2.f19933p);
                iU0 = Math.max(iU0, U0(aVar, format2));
            }
        }
        if (z10) {
            a6.m.h("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + VastAttributes.HORIZONTAL_POSITION + iMax2);
            Point pointR0 = R0(aVar, format);
            if (pointR0 != null) {
                iMax = Math.max(iMax, pointR0.x);
                iMax2 = Math.max(iMax2, pointR0.y);
                iU0 = Math.max(iU0, Q0(aVar, format.f19927j, iMax, iMax2));
                a6.m.h("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + VastAttributes.HORIZONTAL_POSITION + iMax2);
            }
        }
        return new a(iMax, iMax2, iU0);
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    public boolean T() {
        return this.f5420d1 && k0.f3574a < 23;
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    public float U(float f10, Format format, Format[] formatArr) {
        float fMax = -1.0f;
        for (Format format2 : formatArr) {
            float f11 = format2.f19934q;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    public List<com.google.android.exoplayer.mediacodec.a> V(com.google.android.exoplayer.mediacodec.b bVar, Format format, boolean z10) throws MediaCodecUtil.DecoderQueryException {
        return T0(bVar, format, z10, this.f5420d1);
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat V0(Format format, String str, a aVar, float f10, boolean z10, int i10) {
        Pair<Integer, Integer> pairL;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", format.f19932o);
        mediaFormat.setInteger("height", format.f19933p);
        v4.e.e(mediaFormat, format.f19929l);
        v4.e.c(mediaFormat, "frame-rate", format.f19934q);
        v4.e.d(mediaFormat, "rotation-degrees", format.f19935r);
        v4.e.b(mediaFormat, format.f19939v);
        if ("video/dolby-vision".equals(format.f19927j) && (pairL = MediaCodecUtil.l(format)) != null) {
            v4.e.d(mediaFormat, Scopes.PROFILE, ((Integer) pairL.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f5431a);
        mediaFormat.setInteger("max-height", aVar.f5432b);
        v4.e.d(mediaFormat, "max-input-size", aVar.f5433c);
        if (k0.f3574a >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            N0(mediaFormat, i10);
        }
        return mediaFormat;
    }

    public boolean Y0(MediaCodec mediaCodec, int i10, long j10, long j11, boolean z10) throws ExoPlaybackException {
        int iV = v(j11);
        if (iV == 0) {
            return false;
        }
        i4.d dVar = this.f20181u0;
        dVar.f63709i++;
        int i11 = this.Q0 + iV;
        if (z10) {
            dVar.f63706f += i11;
        } else {
            t1(i11);
        }
        N();
        return true;
    }

    public final void Z0() {
        if (this.O0 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f5429y0.j(this.O0, jElapsedRealtime - this.N0);
            this.O0 = 0;
            this.N0 = jElapsedRealtime;
        }
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    public void a0(i4.e eVar) throws ExoPlaybackException {
        if (this.G0) {
            ByteBuffer byteBuffer = (ByteBuffer) a6.a.e(eVar.f63714f);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4 && b12 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    k1(Q(), bArr);
                }
            }
        }
    }

    public void a1() {
        if (this.K0) {
            return;
        }
        this.K0 = true;
        this.f5429y0.t(this.H0);
    }

    public final void b1() {
        int i10 = this.V0;
        if (i10 == -1 && this.W0 == -1) {
            return;
        }
        if (this.Z0 == i10 && this.f5417a1 == this.W0 && this.f5418b1 == this.X0 && this.f5419c1 == this.Y0) {
            return;
        }
        this.f5429y0.u(i10, this.W0, this.X0, this.Y0);
        this.Z0 = this.V0;
        this.f5417a1 = this.W0;
        this.f5418b1 = this.X0;
        this.f5419c1 = this.Y0;
    }

    public final void c1() {
        if (this.K0) {
            this.f5429y0.t(this.H0);
        }
    }

    public final void d1() {
        int i10 = this.Z0;
        if (i10 == -1 && this.f5417a1 == -1) {
            return;
        }
        this.f5429y0.u(i10, this.f5417a1, this.f5418b1, this.f5419c1);
    }

    public final void e1(long j10, long j11, Format format, MediaFormat mediaFormat) {
        g gVar = this.f5426j1;
        if (gVar != null) {
            gVar.a(j10, j11, format, mediaFormat);
        }
    }

    public void f1(long j10) {
        Format formatI0 = I0(j10);
        if (formatI0 != null) {
            h1(Q(), formatI0.f19932o, formatI0.f19933p);
        }
        b1();
        this.f20181u0.f63705e++;
        a1();
        m0(j10);
    }

    public final void g1() {
        A0();
    }

    public final void h1(MediaCodec mediaCodec, int i10, int i11) {
        this.V0 = i10;
        this.W0 = i11;
        float f10 = this.T0;
        this.Y0 = f10;
        if (k0.f3574a >= 21) {
            int i12 = this.S0;
            if (i12 == 90 || i12 == 270) {
                this.V0 = i11;
                this.W0 = i10;
                this.Y0 = 1.0f / f10;
            }
        } else {
            this.X0 = this.S0;
        }
        mediaCodec.setVideoScalingMode(this.J0);
    }

    @Override // e4.e, e4.o0.b
    public void handleMessage(int i10, @Nullable Object obj) throws ExoPlaybackException {
        if (i10 == 1) {
            n1((Surface) obj);
            return;
        }
        if (i10 != 4) {
            if (i10 == 6) {
                this.f5426j1 = (g) obj;
                return;
            } else {
                super.handleMessage(i10, obj);
                return;
            }
        }
        this.J0 = ((Integer) obj).intValue();
        MediaCodec mediaCodecQ = Q();
        if (mediaCodecQ != null) {
            mediaCodecQ.setVideoScalingMode(this.J0);
        }
    }

    public void i1(MediaCodec mediaCodec, int i10, long j10) {
        b1();
        h0.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, true);
        h0.c();
        this.R0 = SystemClock.elapsedRealtime() * 1000;
        this.f20181u0.f63705e++;
        this.P0 = 0;
        a1();
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer, e4.p0
    public boolean isReady() {
        Surface surface;
        if (super.isReady() && (this.K0 || (((surface = this.I0) != null && this.H0 == surface) || Q() == null || this.f5420d1))) {
            this.M0 = -9223372036854775807L;
            return true;
        }
        if (this.M0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.M0) {
            return true;
        }
        this.M0 = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    public void j0(String str, long j10, long j11) {
        this.f5429y0.h(str, j10, j11);
        this.F0 = M0(str);
        this.G0 = ((com.google.android.exoplayer.mediacodec.a) a6.a.e(S())).m();
    }

    @TargetApi(21)
    public void j1(MediaCodec mediaCodec, int i10, long j10, long j11) {
        b1();
        h0.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, j11);
        h0.c();
        this.R0 = SystemClock.elapsedRealtime() * 1000;
        this.f20181u0.f63705e++;
        this.P0 = 0;
        a1();
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    public void k0(f0 f0Var) throws ExoPlaybackException {
        super.k0(f0Var);
        Format format = f0Var.f60107c;
        this.f5429y0.l(format);
        this.T0 = format.f19936s;
        this.S0 = format.f19935r;
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    public void l0(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.U0 = mediaFormat;
        boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        h1(mediaCodec, z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width"), z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height"));
    }

    public final void l1() {
        this.M0 = this.f5430z0 > 0 ? SystemClock.elapsedRealtime() + this.f5430z0 : -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    @CallSuper
    public void m0(long j10) {
        if (!this.f5420d1) {
            this.Q0--;
        }
        while (true) {
            int i10 = this.f5425i1;
            if (i10 == 0 || j10 < this.D0[0]) {
                return;
            }
            long[] jArr = this.C0;
            this.f5424h1 = jArr[0];
            int i11 = i10 - 1;
            this.f5425i1 = i11;
            System.arraycopy(jArr, 1, jArr, 0, i11);
            long[] jArr2 = this.D0;
            System.arraycopy(jArr2, 1, jArr2, 0, this.f5425i1);
            K0();
        }
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer, e4.e
    public void n() {
        this.f5423g1 = -9223372036854775807L;
        this.f5424h1 = -9223372036854775807L;
        this.f5425i1 = 0;
        this.U0 = null;
        L0();
        K0();
        this.f5428x0.d();
        this.f5422f1 = null;
        try {
            super.n();
        } finally {
            this.f5429y0.i(this.f20181u0);
        }
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    @CallSuper
    public void n0(i4.e eVar) {
        if (!this.f5420d1) {
            this.Q0++;
        }
        this.f5423g1 = Math.max(eVar.f63713e, this.f5423g1);
        if (k0.f3574a >= 23 || !this.f5420d1) {
            return;
        }
        f1(eVar.f63713e);
    }

    public final void n1(Surface surface) throws ExoPlaybackException {
        if (surface == null) {
            Surface surface2 = this.I0;
            if (surface2 != null) {
                surface = surface2;
            } else {
                com.google.android.exoplayer.mediacodec.a aVarS = S();
                if (aVarS != null && r1(aVarS)) {
                    surface = DummySurface.f(this.f5427w0, aVarS.f20210g);
                    this.I0 = surface;
                }
            }
        }
        if (this.H0 == surface) {
            if (surface == null || surface == this.I0) {
                return;
            }
            d1();
            c1();
            return;
        }
        this.H0 = surface;
        int state = getState();
        MediaCodec mediaCodecQ = Q();
        if (mediaCodecQ != null) {
            if (k0.f3574a < 23 || surface == null || this.F0) {
                u0();
                g0();
            } else {
                m1(mediaCodecQ, surface);
            }
        }
        if (surface == null || surface == this.I0) {
            L0();
            K0();
            return;
        }
        d1();
        K0();
        if (state == 2) {
            l1();
        }
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer, e4.e
    public void o(boolean z10) throws ExoPlaybackException {
        super.o(z10);
        int i10 = this.f5421e1;
        int i11 = h().f60216a;
        this.f5421e1 = i11;
        this.f5420d1 = i11 != 0;
        if (i11 != i10) {
            u0();
        }
        this.f5429y0.k(this.f20181u0);
        this.f5428x0.e();
    }

    public boolean o1(long j10, long j11, boolean z10) {
        return X0(j10) && !z10;
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer, e4.e
    public void p(long j10, boolean z10) throws ExoPlaybackException {
        super.p(j10, z10);
        K0();
        this.L0 = -9223372036854775807L;
        this.P0 = 0;
        this.f5423g1 = -9223372036854775807L;
        int i10 = this.f5425i1;
        if (i10 != 0) {
            this.f5424h1 = this.C0[i10 - 1];
            this.f5425i1 = 0;
        }
        if (z10) {
            l1();
        } else {
            this.M0 = -9223372036854775807L;
        }
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    public boolean p0(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10, boolean z11, Format format) throws ExoPlaybackException {
        if (this.L0 == -9223372036854775807L) {
            this.L0 = j10;
        }
        long j13 = j12 - this.f5424h1;
        if (z10 && !z11) {
            s1(mediaCodec, i10, j13);
            return true;
        }
        long j14 = j12 - j10;
        if (this.H0 == this.I0) {
            if (!W0(j14)) {
                return false;
            }
            s1(mediaCodec, i10, j13);
            return true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j15 = jElapsedRealtime - this.R0;
        boolean z12 = getState() == 2;
        if (this.M0 == -9223372036854775807L && j10 >= this.f5424h1 && (!this.K0 || (z12 && q1(j14, j15)))) {
            long jNanoTime = System.nanoTime();
            e1(j13, jNanoTime, format, this.U0);
            if (k0.f3574a >= 21) {
                j1(mediaCodec, i10, j13, jNanoTime);
                return true;
            }
            i1(mediaCodec, i10, j13);
            return true;
        }
        if (z12 && j10 != this.L0) {
            long jNanoTime2 = System.nanoTime();
            long jB = this.f5428x0.b(j12, ((j14 - (jElapsedRealtime - j11)) * 1000) + jNanoTime2);
            long j16 = (jB - jNanoTime2) / 1000;
            boolean z13 = this.M0 != -9223372036854775807L;
            if (o1(j16, j11, z11) && Y0(mediaCodec, i10, j13, j10, z13)) {
                return false;
            }
            if (p1(j16, j11, z11)) {
                if (z13) {
                    s1(mediaCodec, i10, j13);
                    return true;
                }
                P0(mediaCodec, i10, j13);
                return true;
            }
            if (k0.f3574a >= 21) {
                if (j16 < ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) {
                    e1(j13, jB, format, this.U0);
                    j1(mediaCodec, i10, j13, jB);
                    return true;
                }
            } else if (j16 < 30000) {
                if (j16 > 11000) {
                    try {
                        Thread.sleep((j16 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                e1(j13, jB, format, this.U0);
                i1(mediaCodec, i10, j13);
                return true;
            }
        }
        return false;
    }

    public boolean p1(long j10, long j11, boolean z10) {
        return W0(j10) && !z10;
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer, e4.e
    public void q() {
        try {
            super.q();
            Surface surface = this.I0;
            if (surface != null) {
                if (this.H0 == surface) {
                    this.H0 = null;
                }
                surface.release();
                this.I0 = null;
            }
        } catch (Throwable th2) {
            if (this.I0 != null) {
                Surface surface2 = this.H0;
                Surface surface3 = this.I0;
                if (surface2 == surface3) {
                    this.H0 = null;
                }
                surface3.release();
                this.I0 = null;
            }
            throw th2;
        }
    }

    public boolean q1(long j10, long j11) {
        return W0(j10) && j11 > 100000;
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer, e4.e
    public void r() {
        super.r();
        this.O0 = 0;
        this.N0 = SystemClock.elapsedRealtime();
        this.R0 = SystemClock.elapsedRealtime() * 1000;
    }

    public final boolean r1(com.google.android.exoplayer.mediacodec.a aVar) {
        return k0.f3574a >= 23 && !this.f5420d1 && !M0(aVar.f20204a) && (!aVar.f20210g || DummySurface.e(this.f5427w0));
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer, e4.e
    public void s() {
        this.M0 = -9223372036854775807L;
        Z0();
        super.s();
    }

    public void s1(MediaCodec mediaCodec, int i10, long j10) {
        h0.a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i10, false);
        h0.c();
        this.f20181u0.f63706f++;
    }

    @Override // e4.e
    public void t(Format[] formatArr, long j10) throws ExoPlaybackException {
        if (this.f5424h1 == -9223372036854775807L) {
            this.f5424h1 = j10;
        } else {
            int i10 = this.f5425i1;
            if (i10 == this.C0.length) {
                a6.m.h("MediaCodecVideoRenderer", "Too many stream changes, so dropping offset: " + this.C0[this.f5425i1 - 1]);
            } else {
                this.f5425i1 = i10 + 1;
            }
            long[] jArr = this.C0;
            int i11 = this.f5425i1;
            jArr[i11 - 1] = j10;
            this.D0[i11 - 1] = this.f5423g1;
        }
        super.t(formatArr, j10);
    }

    public void t1(int i10) {
        i4.d dVar = this.f20181u0;
        dVar.f63707g += i10;
        this.O0 += i10;
        int i11 = this.P0 + i10;
        this.P0 = i11;
        dVar.f63708h = Math.max(i11, dVar.f63708h);
        int i12 = this.A0;
        if (i12 <= 0 || this.O0 < i12) {
            return;
        }
        Z0();
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    @CallSuper
    public void u0() {
        try {
            super.u0();
        } finally {
            this.Q0 = 0;
        }
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    public int x(MediaCodec mediaCodec, com.google.android.exoplayer.mediacodec.a aVar, Format format, Format format2) {
        if (!aVar.o(format, format2, true)) {
            return 0;
        }
        int i10 = format2.f19932o;
        a aVar2 = this.E0;
        if (i10 > aVar2.f5431a || format2.f19933p > aVar2.f5432b || U0(aVar, format2) > this.E0.f5433c) {
            return 0;
        }
        return format.F(format2) ? 3 : 2;
    }
}
