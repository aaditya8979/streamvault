package t7;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.c;
import com.google.android.exoplayer2.video.MediaCodecVideoDecoderException;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import com.google.android.gms.common.Scopes;
import com.google.common.collect.ImmutableList;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.di.ServiceProvider;
import d6.u1;
import d6.z0;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import s7.k0;
import s7.m0;
import t7.v;

/* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
/* JADX INFO: loaded from: classes7.dex */
public class g extends MediaCodecRenderer {

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final int[] f85115q1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static boolean f85116r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static boolean f85117s1;
    public final Context H0;
    public final k I0;
    public final v.a J0;
    public final long K0;
    public final int L0;
    public final boolean M0;
    public b N0;
    public boolean O0;
    public boolean P0;

    @Nullable
    public Surface Q0;

    @Nullable
    public PlaceholderSurface R0;
    public boolean S0;
    public int T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    public long X0;
    public long Y0;
    public long Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f85118a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f85119b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public int f85120c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public long f85121d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public long f85122e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public long f85123f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public int f85124g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public int f85125h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f85126i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public int f85127j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public float f85128k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    @Nullable
    public x f85129l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public boolean f85130m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public int f85131n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    @Nullable
    public c f85132o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @Nullable
    public i f85133p1;

    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    @RequiresApi(26)
    public static final class a {
        @DoNotInline
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr()) {
                return false;
            }
            for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i10 == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f85134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f85135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f85136c;

        public b(int i10, int i11, int i12) {
            this.f85134a = i10;
            this.f85135b = i11;
            this.f85136c = i12;
        }
    }

    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    @RequiresApi(23)
    public final class c implements c.InterfaceC0302c, Handler.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f85137b;

        public c(com.google.android.exoplayer2.mediacodec.c cVar) {
            Handler handlerV = m0.v(this);
            this.f85137b = handlerV;
            cVar.a(this, handlerV);
        }

        @Override // com.google.android.exoplayer2.mediacodec.c.InterfaceC0302c
        public void a(com.google.android.exoplayer2.mediacodec.c cVar, long j10, long j11) {
            if (m0.f79487a >= 30) {
                b(j10);
            } else {
                this.f85137b.sendMessageAtFrontOfQueue(Message.obtain(this.f85137b, 0, (int) (j10 >> 32), (int) j10));
            }
        }

        public final void b(long j10) {
            g gVar = g.this;
            if (this != gVar.f85132o1) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                gVar.y1();
                return;
            }
            try {
                gVar.x1(j10);
            } catch (ExoPlaybackException e10) {
                g.this.M0(e10);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(m0.N0(message.arg1, message.arg2));
            return true;
        }
    }

    public g(Context context, c.b bVar, com.google.android.exoplayer2.mediacodec.e eVar, long j10, boolean z10, @Nullable Handler handler, @Nullable v vVar, int i10) {
        this(context, bVar, eVar, j10, z10, handler, vVar, i10, 30.0f);
    }

    public g(Context context, c.b bVar, com.google.android.exoplayer2.mediacodec.e eVar, long j10, boolean z10, @Nullable Handler handler, @Nullable v vVar, int i10, float f10) {
        super(2, bVar, eVar, z10, f10);
        this.K0 = j10;
        this.L0 = i10;
        Context applicationContext = context.getApplicationContext();
        this.H0 = applicationContext;
        this.I0 = new k(applicationContext);
        this.J0 = new v.a(handler, vVar);
        this.M0 = d1();
        this.Y0 = -9223372036854775807L;
        this.f85125h1 = -1;
        this.f85126i1 = -1;
        this.f85128k1 = -1.0f;
        this.T0 = 1;
        this.f85131n1 = 0;
        a1();
    }

    @RequiresApi(29)
    public static void C1(com.google.android.exoplayer2.mediacodec.c cVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        cVar.setParameters(bundle);
    }

    @RequiresApi(21)
    public static void c1(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    public static boolean d1() {
        return "NVIDIA".equals(m0.f79489c);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean f1() {
        String str;
        int i10 = m0.f79487a;
        byte b10 = 28;
        if (i10 <= 28) {
            String str2 = m0.f79488b;
            str2.hashCode();
            switch (str2) {
            }
            return true;
        }
        if (i10 <= 27 && "HWEML".equals(m0.f79488b)) {
            return true;
        }
        str = m0.f79490d;
        str.hashCode();
        switch (str) {
            case "AFTJMST12":
            case "AFTKMST12":
            case "AFTA":
            case "AFTN":
            case "AFTR":
            case "AFTEU011":
            case "AFTEU014":
            case "AFTSO001":
            case "AFTEUFF014":
                break;
            default:
                if (i10 <= 26) {
                    String str3 = m0.f79488b;
                    str3.hashCode();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            b10 = !str3.equals("GIONEE_SWW1609") ? (byte) -1 : (byte) 0;
                            break;
                        case -2144781185:
                            b10 = !str3.equals("GIONEE_SWW1627") ? (byte) -1 : (byte) 1;
                            break;
                        case -2144781160:
                            b10 = !str3.equals("GIONEE_SWW1631") ? (byte) -1 : (byte) 2;
                            break;
                        case -2097309513:
                            b10 = !str3.equals("K50a40") ? (byte) -1 : (byte) 3;
                            break;
                        case -2022874474:
                            b10 = !str3.equals("CP8676_I02") ? (byte) -1 : (byte) 4;
                            break;
                        case -1978993182:
                            b10 = !str3.equals("NX541J") ? (byte) -1 : (byte) 5;
                            break;
                        case -1978990237:
                            b10 = !str3.equals("NX573J") ? (byte) -1 : (byte) 6;
                            break;
                        case -1936688988:
                            b10 = !str3.equals("PGN528") ? (byte) -1 : (byte) 7;
                            break;
                        case -1936688066:
                            b10 = !str3.equals("PGN610") ? (byte) -1 : (byte) 8;
                            break;
                        case -1936688065:
                            b10 = !str3.equals("PGN611") ? (byte) -1 : (byte) 9;
                            break;
                        case -1931988508:
                            b10 = !str3.equals("AquaPowerM") ? (byte) -1 : (byte) 10;
                            break;
                        case -1885099851:
                            b10 = !str3.equals("RAIJIN") ? (byte) -1 : (byte) 11;
                            break;
                        case -1696512866:
                            b10 = !str3.equals("XT1663") ? (byte) -1 : (byte) 12;
                            break;
                        case -1680025915:
                            b10 = !str3.equals("ComioS1") ? (byte) -1 : (byte) 13;
                            break;
                        case -1615810839:
                            b10 = !str3.equals("Phantom6") ? (byte) -1 : (byte) 14;
                            break;
                        case -1600724499:
                            b10 = !str3.equals("pacificrim") ? (byte) -1 : (byte) 15;
                            break;
                        case -1554255044:
                            b10 = !str3.equals("vernee_M5") ? (byte) -1 : (byte) 16;
                            break;
                        case -1481772737:
                            b10 = !str3.equals("panell_dl") ? (byte) -1 : (byte) 17;
                            break;
                        case -1481772730:
                            b10 = !str3.equals("panell_ds") ? (byte) -1 : (byte) 18;
                            break;
                        case -1481772729:
                            b10 = !str3.equals("panell_dt") ? (byte) -1 : (byte) 19;
                            break;
                        case -1320080169:
                            b10 = !str3.equals("GiONEE_GBL7319") ? (byte) -1 : (byte) 20;
                            break;
                        case -1217592143:
                            b10 = !str3.equals("BRAVIA_ATV2") ? (byte) -1 : (byte) 21;
                            break;
                        case -1180384755:
                            b10 = !str3.equals("iris60") ? (byte) -1 : (byte) 22;
                            break;
                        case -1139198265:
                            b10 = !str3.equals("Slate_Pro") ? (byte) -1 : (byte) 23;
                            break;
                        case -1052835013:
                            b10 = !str3.equals("namath") ? (byte) -1 : (byte) 24;
                            break;
                        case -993250464:
                            b10 = !str3.equals("A10-70F") ? (byte) -1 : (byte) 25;
                            break;
                        case -993250458:
                            b10 = !str3.equals("A10-70L") ? (byte) -1 : (byte) 26;
                            break;
                        case -965403638:
                            b10 = !str3.equals("s905x018") ? (byte) -1 : (byte) 27;
                            break;
                        case -958336948:
                            if (!str3.equals("ELUGA_Ray_X")) {
                                b10 = -1;
                            }
                            break;
                        case -879245230:
                            b10 = !str3.equals("tcl_eu") ? (byte) -1 : (byte) 29;
                            break;
                        case -842500323:
                            b10 = !str3.equals("nicklaus_f") ? (byte) -1 : (byte) 30;
                            break;
                        case -821392978:
                            b10 = !str3.equals("A7000-a") ? (byte) -1 : (byte) 31;
                            break;
                        case -797483286:
                            b10 = !str3.equals("SVP-DTV15") ? (byte) -1 : (byte) 32;
                            break;
                        case -794946968:
                            b10 = !str3.equals("watson") ? (byte) -1 : (byte) 33;
                            break;
                        case -788334647:
                            b10 = !str3.equals("whyred") ? (byte) -1 : (byte) 34;
                            break;
                        case -782144577:
                            b10 = !str3.equals("OnePlus5T") ? (byte) -1 : (byte) 35;
                            break;
                        case -575125681:
                            b10 = !str3.equals("GiONEE_CBL7513") ? (byte) -1 : (byte) 36;
                            break;
                        case -521118391:
                            b10 = !str3.equals("GIONEE_GBL7360") ? (byte) -1 : (byte) 37;
                            break;
                        case -430914369:
                            b10 = !str3.equals("Pixi4-7_3G") ? (byte) -1 : (byte) 38;
                            break;
                        case -290434366:
                            b10 = !str3.equals("taido_row") ? (byte) -1 : (byte) 39;
                            break;
                        case -282781963:
                            b10 = !str3.equals("BLACK-1X") ? (byte) -1 : (byte) 40;
                            break;
                        case -277133239:
                            b10 = !str3.equals("Z12_PRO") ? (byte) -1 : (byte) 41;
                            break;
                        case -173639913:
                            b10 = !str3.equals("ELUGA_A3_Pro") ? (byte) -1 : ExifInterface.START_CODE;
                            break;
                        case -56598463:
                            b10 = !str3.equals("woods_fn") ? (byte) -1 : (byte) 43;
                            break;
                        case 2126:
                            b10 = !str3.equals("C1") ? (byte) -1 : (byte) 44;
                            break;
                        case 2564:
                            b10 = !str3.equals("Q5") ? (byte) -1 : (byte) 45;
                            break;
                        case 2715:
                            b10 = !str3.equals("V1") ? (byte) -1 : (byte) 46;
                            break;
                        case 2719:
                            b10 = !str3.equals("V5") ? (byte) -1 : (byte) 47;
                            break;
                        case 3091:
                            b10 = !str3.equals("b5") ? (byte) -1 : (byte) 48;
                            break;
                        case 3483:
                            b10 = !str3.equals("mh") ? (byte) -1 : (byte) 49;
                            break;
                        case 73405:
                            b10 = !str3.equals("JGZ") ? (byte) -1 : (byte) 50;
                            break;
                        case 75537:
                            b10 = !str3.equals("M04") ? (byte) -1 : (byte) 51;
                            break;
                        case 75739:
                            b10 = !str3.equals("M5c") ? (byte) -1 : (byte) 52;
                            break;
                        case 76779:
                            b10 = !str3.equals("MX6") ? (byte) -1 : (byte) 53;
                            break;
                        case 78669:
                            b10 = !str3.equals("P85") ? (byte) -1 : (byte) 54;
                            break;
                        case 79305:
                            b10 = !str3.equals("PLE") ? (byte) -1 : (byte) 55;
                            break;
                        case 80618:
                            b10 = !str3.equals("QX1") ? (byte) -1 : (byte) 56;
                            break;
                        case 88274:
                            b10 = !str3.equals("Z80") ? (byte) -1 : (byte) 57;
                            break;
                        case 98846:
                            b10 = !str3.equals("cv1") ? (byte) -1 : (byte) 58;
                            break;
                        case 98848:
                            b10 = !str3.equals("cv3") ? (byte) -1 : (byte) 59;
                            break;
                        case 99329:
                            b10 = !str3.equals("deb") ? (byte) -1 : (byte) 60;
                            break;
                        case 101481:
                            b10 = !str3.equals("flo") ? (byte) -1 : (byte) 61;
                            break;
                        case 1513190:
                            b10 = !str3.equals("1601") ? (byte) -1 : (byte) 62;
                            break;
                        case 1514184:
                            b10 = !str3.equals("1713") ? (byte) -1 : (byte) 63;
                            break;
                        case 1514185:
                            b10 = !str3.equals("1714") ? (byte) -1 : (byte) 64;
                            break;
                        case 2133089:
                            b10 = !str3.equals("F01H") ? (byte) -1 : (byte) 65;
                            break;
                        case 2133091:
                            b10 = !str3.equals("F01J") ? (byte) -1 : (byte) 66;
                            break;
                        case 2133120:
                            b10 = !str3.equals("F02H") ? (byte) -1 : (byte) 67;
                            break;
                        case 2133151:
                            b10 = !str3.equals("F03H") ? (byte) -1 : (byte) 68;
                            break;
                        case 2133182:
                            b10 = !str3.equals("F04H") ? (byte) -1 : (byte) 69;
                            break;
                        case 2133184:
                            b10 = !str3.equals("F04J") ? (byte) -1 : (byte) 70;
                            break;
                        case 2436959:
                            b10 = !str3.equals("P681") ? (byte) -1 : (byte) 71;
                            break;
                        case 2463773:
                            b10 = !str3.equals("Q350") ? (byte) -1 : (byte) 72;
                            break;
                        case 2464648:
                            b10 = !str3.equals("Q427") ? (byte) -1 : (byte) 73;
                            break;
                        case 2689555:
                            b10 = !str3.equals("XE2X") ? (byte) -1 : (byte) 74;
                            break;
                        case 3154429:
                            b10 = !str3.equals("fugu") ? (byte) -1 : (byte) 75;
                            break;
                        case 3284551:
                            b10 = !str3.equals("kate") ? (byte) -1 : (byte) 76;
                            break;
                        case 3351335:
                            b10 = !str3.equals("mido") ? (byte) -1 : (byte) 77;
                            break;
                        case 3386211:
                            b10 = !str3.equals("p212") ? (byte) -1 : (byte) 78;
                            break;
                        case 41325051:
                            b10 = !str3.equals("MEIZU_M5") ? (byte) -1 : (byte) 79;
                            break;
                        case 51349633:
                            b10 = !str3.equals("601LV") ? (byte) -1 : (byte) 80;
                            break;
                        case 51350594:
                            b10 = !str3.equals("602LV") ? (byte) -1 : (byte) 81;
                            break;
                        case 55178625:
                            b10 = !str3.equals("Aura_Note_2") ? (byte) -1 : (byte) 82;
                            break;
                        case 61542055:
                            b10 = !str3.equals("A1601") ? (byte) -1 : (byte) 83;
                            break;
                        case 65355429:
                            b10 = !str3.equals("E5643") ? (byte) -1 : (byte) 84;
                            break;
                        case 66214468:
                            b10 = !str3.equals("F3111") ? (byte) -1 : (byte) 85;
                            break;
                        case 66214470:
                            b10 = !str3.equals("F3113") ? (byte) -1 : (byte) 86;
                            break;
                        case 66214473:
                            b10 = !str3.equals("F3116") ? (byte) -1 : (byte) 87;
                            break;
                        case 66215429:
                            b10 = !str3.equals("F3211") ? (byte) -1 : (byte) 88;
                            break;
                        case 66215431:
                            b10 = !str3.equals("F3213") ? (byte) -1 : (byte) 89;
                            break;
                        case 66215433:
                            b10 = !str3.equals("F3215") ? (byte) -1 : (byte) 90;
                            break;
                        case 66216390:
                            b10 = !str3.equals("F3311") ? (byte) -1 : (byte) 91;
                            break;
                        case 76402249:
                            b10 = !str3.equals("PRO7S") ? (byte) -1 : (byte) 92;
                            break;
                        case 76404105:
                            b10 = !str3.equals("Q4260") ? (byte) -1 : (byte) 93;
                            break;
                        case 76404911:
                            b10 = !str3.equals("Q4310") ? (byte) -1 : (byte) 94;
                            break;
                        case 80963634:
                            b10 = !str3.equals("V23GB") ? (byte) -1 : (byte) 95;
                            break;
                        case 82882791:
                            b10 = !str3.equals("X3_HK") ? (byte) -1 : (byte) 96;
                            break;
                        case 98715550:
                            b10 = !str3.equals("i9031") ? (byte) -1 : (byte) 97;
                            break;
                        case 101370885:
                            b10 = !str3.equals("l5460") ? (byte) -1 : (byte) 98;
                            break;
                        case 102844228:
                            b10 = !str3.equals("le_x6") ? (byte) -1 : (byte) 99;
                            break;
                        case 165221241:
                            b10 = !str3.equals("A2016a40") ? (byte) -1 : (byte) 100;
                            break;
                        case 182191441:
                            b10 = !str3.equals("CPY83_I00") ? (byte) -1 : (byte) 101;
                            break;
                        case 245388979:
                            b10 = !str3.equals("marino_f") ? (byte) -1 : (byte) 102;
                            break;
                        case 287431619:
                            b10 = !str3.equals("griffin") ? (byte) -1 : (byte) 103;
                            break;
                        case 307593612:
                            b10 = !str3.equals("A7010a48") ? (byte) -1 : (byte) 104;
                            break;
                        case 308517133:
                            b10 = !str3.equals("A7020a48") ? (byte) -1 : (byte) 105;
                            break;
                        case 316215098:
                            b10 = !str3.equals("TB3-730F") ? (byte) -1 : (byte) 106;
                            break;
                        case 316215116:
                            b10 = !str3.equals("TB3-730X") ? (byte) -1 : (byte) 107;
                            break;
                        case 316246811:
                            b10 = !str3.equals("TB3-850F") ? (byte) -1 : (byte) 108;
                            break;
                        case 316246818:
                            b10 = !str3.equals("TB3-850M") ? (byte) -1 : (byte) 109;
                            break;
                        case 407160593:
                            b10 = !str3.equals("Pixi5-10_4G") ? (byte) -1 : (byte) 110;
                            break;
                        case 507412548:
                            b10 = !str3.equals("QM16XE_U") ? (byte) -1 : (byte) 111;
                            break;
                        case 793982701:
                            b10 = !str3.equals("GIONEE_WBL5708") ? (byte) -1 : (byte) 112;
                            break;
                        case 794038622:
                            b10 = !str3.equals("GIONEE_WBL7365") ? (byte) -1 : (byte) 113;
                            break;
                        case 794040393:
                            b10 = !str3.equals("GIONEE_WBL7519") ? (byte) -1 : (byte) 114;
                            break;
                        case 835649806:
                            b10 = !str3.equals("manning") ? (byte) -1 : (byte) 115;
                            break;
                        case 917340916:
                            b10 = !str3.equals("A7000plus") ? (byte) -1 : (byte) 116;
                            break;
                        case 958008161:
                            b10 = !str3.equals("j2xlteins") ? (byte) -1 : (byte) 117;
                            break;
                        case 1060579533:
                            b10 = !str3.equals("panell_d") ? (byte) -1 : (byte) 118;
                            break;
                        case 1150207623:
                            b10 = !str3.equals("LS-5017") ? (byte) -1 : (byte) 119;
                            break;
                        case 1176899427:
                            b10 = !str3.equals("itel_S41") ? (byte) -1 : (byte) 120;
                            break;
                        case 1280332038:
                            b10 = !str3.equals("hwALE-H") ? (byte) -1 : (byte) 121;
                            break;
                        case 1306947716:
                            b10 = !str3.equals("EverStar_S") ? (byte) -1 : (byte) 122;
                            break;
                        case 1349174697:
                            b10 = !str3.equals("htc_e56ml_dtul") ? (byte) -1 : (byte) 123;
                            break;
                        case 1522194893:
                            b10 = !str3.equals("woods_f") ? (byte) -1 : (byte) 124;
                            break;
                        case 1691543273:
                            b10 = !str3.equals("CPH1609") ? (byte) -1 : (byte) 125;
                            break;
                        case 1691544261:
                            b10 = !str3.equals("CPH1715") ? (byte) -1 : (byte) 126;
                            break;
                        case 1709443163:
                            b10 = !str3.equals("iball8735_9806") ? (byte) -1 : (byte) 127;
                            break;
                        case 1865889110:
                            b10 = !str3.equals("santoni") ? (byte) -1 : (byte) 128;
                            break;
                        case 1906253259:
                            b10 = !str3.equals("PB2-670M") ? (byte) -1 : (byte) 129;
                            break;
                        case 1977196784:
                            b10 = !str3.equals("Infinix-X572") ? (byte) -1 : (byte) 130;
                            break;
                        case 2006372676:
                            b10 = !str3.equals("BRAVIA_ATV3_4K") ? (byte) -1 : (byte) 131;
                            break;
                        case 2019281702:
                            b10 = !str3.equals("DM-01K") ? (byte) -1 : (byte) 132;
                            break;
                        case 2029784656:
                            b10 = !str3.equals("HWBLN-H") ? (byte) -1 : (byte) 133;
                            break;
                        case 2030379515:
                            b10 = !str3.equals("HWCAM-H") ? (byte) -1 : (byte) 134;
                            break;
                        case 2033393791:
                            b10 = !str3.equals("ASUS_X00AD_2") ? (byte) -1 : (byte) 135;
                            break;
                        case 2047190025:
                            b10 = !str3.equals("ELUGA_Note") ? (byte) -1 : (byte) 136;
                            break;
                        case 2047252157:
                            b10 = !str3.equals("ELUGA_Prim") ? (byte) -1 : (byte) 137;
                            break;
                        case 2048319463:
                            b10 = !str3.equals("HWVNS-H") ? (byte) -1 : (byte) 138;
                            break;
                        case 2048855701:
                            b10 = !str3.equals("HWWAS-H") ? (byte) -1 : (byte) 139;
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        default:
                            str.hashCode();
                            if (!str.equals("JSN-L21")) {
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case 89:
                        case 90:
                        case 91:
                        case 92:
                        case 93:
                        case 94:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case 115:
                        case 116:
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                        case 124:
                        case 125:
                        case 126:
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                        case MRAID_JS_WRITE_FAILED_VALUE:
                        case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                        case OMSDK_JS_WRITE_FAILED_VALUE:
                        case 134:
                        case 135:
                        case 136:
                        case TPAT_RETRY_FAILED_VALUE:
                        case 138:
                        case 139:
                            return true;
                    }
                }
                break;
        }
        return true;
    }

    public static int g1(com.google.android.exoplayer2.mediacodec.d dVar, com.google.android.exoplayer2.m mVar) {
        int iIntValue;
        int i10 = mVar.f21756r;
        int i11 = mVar.f21757s;
        if (i10 == -1 || i11 == -1) {
            return -1;
        }
        String str = mVar.f21751m;
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> pairQ = MediaCodecUtil.q(mVar);
            str = (pairQ == null || !((iIntValue = ((Integer) pairQ.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.hashCode();
        switch (str) {
            case "video/3gpp":
            case "video/av01":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                return l1(i10 * i11, 2);
            case "video/hevc":
                return Math.max(2097152, l1(i10 * i11, 2));
            case "video/avc":
                String str2 = m0.f79490d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(m0.f79489c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && dVar.f21860g)))) {
                    return -1;
                }
                return l1(m0.l(i10, 16) * m0.l(i11, 16) * 16 * 16, 2);
            case "video/x-vnd.on2.vp9":
                return l1(i10 * i11, 4);
            default:
                return -1;
        }
    }

    @Nullable
    public static Point h1(com.google.android.exoplayer2.mediacodec.d dVar, com.google.android.exoplayer2.m mVar) {
        int i10 = mVar.f21757s;
        int i11 = mVar.f21756r;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : f85115q1) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (m0.f79487a >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point pointB = dVar.b(i15, i13);
                if (dVar.u(pointB.x, pointB.y, mVar.f21758t)) {
                    return pointB;
                }
            } else {
                try {
                    int iL = m0.l(i13, 16) * 16;
                    int iL2 = m0.l(i14, 16) * 16;
                    if (iL * iL2 <= MediaCodecUtil.N()) {
                        int i16 = z10 ? iL2 : iL;
                        if (!z10) {
                            iL = iL2;
                        }
                        return new Point(i16, iL);
                    }
                } catch (MediaCodecUtil.DecoderQueryException unused) {
                }
            }
        }
        return null;
    }

    public static List<com.google.android.exoplayer2.mediacodec.d> j1(Context context, com.google.android.exoplayer2.mediacodec.e eVar, com.google.android.exoplayer2.m mVar, boolean z10, boolean z11) throws MediaCodecUtil.DecoderQueryException {
        String str = mVar.f21751m;
        if (str == null) {
            return ImmutableList.of();
        }
        List<com.google.android.exoplayer2.mediacodec.d> decoderInfos = eVar.getDecoderInfos(str, z10, z11);
        String strM = MediaCodecUtil.m(mVar);
        if (strM == null) {
            return ImmutableList.copyOf((Collection) decoderInfos);
        }
        List<com.google.android.exoplayer2.mediacodec.d> decoderInfos2 = eVar.getDecoderInfos(strM, z10, z11);
        return (m0.f79487a < 26 || !"video/dolby-vision".equals(mVar.f21751m) || decoderInfos2.isEmpty() || a.a(context)) ? ImmutableList.builder().k(decoderInfos).k(decoderInfos2).m() : ImmutableList.copyOf((Collection) decoderInfos2);
    }

    public static int k1(com.google.android.exoplayer2.mediacodec.d dVar, com.google.android.exoplayer2.m mVar) {
        if (mVar.f21752n == -1) {
            return g1(dVar, mVar);
        }
        int size = mVar.f21753o.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += mVar.f21753o.get(i10).length;
        }
        return mVar.f21752n + length;
    }

    public static int l1(int i10, int i11) {
        return (i10 * 3) / (i11 * 2);
    }

    public static boolean n1(long j10) {
        return j10 < -30000;
    }

    public static boolean o1(long j10) {
        return j10 < -500000;
    }

    public void A1(com.google.android.exoplayer2.mediacodec.c cVar, int i10, long j10) {
        t1();
        k0.a("releaseOutputBuffer");
        cVar.releaseOutputBuffer(i10, true);
        k0.c();
        this.f85122e1 = SystemClock.elapsedRealtime() * 1000;
        this.C0.f62100e++;
        this.f85119b1 = 0;
        r1();
    }

    @RequiresApi(21)
    public void B1(com.google.android.exoplayer2.mediacodec.c cVar, int i10, long j10, long j11) {
        t1();
        k0.a("releaseOutputBuffer");
        cVar.releaseOutputBuffer(i10, j11);
        k0.c();
        this.f85122e1 = SystemClock.elapsedRealtime() * 1000;
        this.C0.f62100e++;
        this.f85119b1 = 0;
        r1();
    }

    public final void D1() {
        this.Y0 = this.K0 > 0 ? SystemClock.elapsedRealtime() + this.K0 : -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [t7.k] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.exoplayer2.e, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, t7.g] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.exoplayer2.video.PlaceholderSurface] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void E1(@Nullable Object obj) throws ExoPlaybackException {
        ?? D = obj instanceof Surface ? (Surface) obj : 0;
        if (D == 0) {
            PlaceholderSurface placeholderSurface = this.R0;
            if (placeholderSurface != null) {
                D = placeholderSurface;
            } else {
                com.google.android.exoplayer2.mediacodec.d dVarW = W();
                if (dVarW != null && J1(dVarW)) {
                    D = PlaceholderSurface.d(this.H0, dVarW.f21860g);
                    this.R0 = D;
                }
            }
        }
        if (this.Q0 == D) {
            if (D == 0 || D == this.R0) {
                return;
            }
            v1();
            u1();
            return;
        }
        this.Q0 = D;
        this.I0.m(D);
        this.S0 = false;
        int state = getState();
        com.google.android.exoplayer2.mediacodec.c cVarV = V();
        if (cVarV != null) {
            if (m0.f79487a < 23 || D == 0 || this.O0) {
                D0();
                n0();
            } else {
                F1(cVarV, D);
            }
        }
        if (D == 0 || D == this.R0) {
            a1();
            Z0();
            return;
        }
        v1();
        Z0();
        if (state == 2) {
            D1();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    public void F0() {
        super.F0();
        this.f85120c1 = 0;
    }

    @RequiresApi(23)
    public void F1(com.google.android.exoplayer2.mediacodec.c cVar, Surface surface) {
        cVar.setOutputSurface(surface);
    }

    public boolean G1(long j10, long j11, boolean z10) {
        return o1(j10) && !z10;
    }

    public boolean H1(long j10, long j11, boolean z10) {
        return n1(j10) && !z10;
    }

    public boolean I1(long j10, long j11) {
        return n1(j10) && j11 > 100000;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public MediaCodecDecoderException J(Throwable th2, @Nullable com.google.android.exoplayer2.mediacodec.d dVar) {
        return new MediaCodecVideoDecoderException(th2, dVar, this.Q0);
    }

    public final boolean J1(com.google.android.exoplayer2.mediacodec.d dVar) {
        return m0.f79487a >= 23 && !this.f85130m1 && !b1(dVar.f21854a) && (!dVar.f21860g || PlaceholderSurface.c(this.H0));
    }

    public void K1(com.google.android.exoplayer2.mediacodec.c cVar, int i10, long j10) {
        k0.a("skipVideoBuffer");
        cVar.releaseOutputBuffer(i10, false);
        k0.c();
        this.C0.f62101f++;
    }

    public void L1(int i10, int i11) {
        g6.e eVar = this.C0;
        eVar.f62103h += i10;
        int i12 = i10 + i11;
        eVar.f62102g += i12;
        this.f85118a1 += i12;
        int i13 = this.f85119b1 + i12;
        this.f85119b1 = i13;
        eVar.f62104i = Math.max(i13, eVar.f62104i);
        int i14 = this.L0;
        if (i14 <= 0 || this.f85118a1 < i14) {
            return;
        }
        q1();
    }

    public void M1(long j10) {
        this.C0.a(j10);
        this.f85123f1 += j10;
        this.f85124g1++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean P0(com.google.android.exoplayer2.mediacodec.d dVar) {
        return this.Q0 != null || J1(dVar);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public int S0(com.google.android.exoplayer2.mediacodec.e eVar, com.google.android.exoplayer2.m mVar) throws MediaCodecUtil.DecoderQueryException {
        boolean z10;
        int i10 = 0;
        if (!s7.u.o(mVar.f21751m)) {
            return u1.create(0);
        }
        boolean z11 = mVar.f21754p != null;
        List<com.google.android.exoplayer2.mediacodec.d> listJ1 = j1(this.H0, eVar, mVar, z11, false);
        if (z11 && listJ1.isEmpty()) {
            listJ1 = j1(this.H0, eVar, mVar, false, false);
        }
        if (listJ1.isEmpty()) {
            return u1.create(1);
        }
        if (!MediaCodecRenderer.T0(mVar)) {
            return u1.create(2);
        }
        com.google.android.exoplayer2.mediacodec.d dVar = listJ1.get(0);
        boolean zM = dVar.m(mVar);
        if (zM) {
            z10 = true;
        } else {
            for (int i11 = 1; i11 < listJ1.size(); i11++) {
                com.google.android.exoplayer2.mediacodec.d dVar2 = listJ1.get(i11);
                if (dVar2.m(mVar)) {
                    z10 = false;
                    zM = true;
                    dVar = dVar2;
                    break;
                }
            }
            z10 = true;
        }
        int i12 = zM ? 4 : 3;
        int i13 = dVar.p(mVar) ? 16 : 8;
        int i14 = dVar.f21861h ? 64 : 0;
        int i15 = z10 ? 128 : 0;
        if (m0.f79487a >= 26 && "video/dolby-vision".equals(mVar.f21751m) && !a.a(this.H0)) {
            i15 = 256;
        }
        if (zM) {
            List<com.google.android.exoplayer2.mediacodec.d> listJ12 = j1(this.H0, eVar, mVar, z11, true);
            if (!listJ12.isEmpty()) {
                com.google.android.exoplayer2.mediacodec.d dVar3 = MediaCodecUtil.u(listJ12, mVar).get(0);
                if (dVar3.m(mVar) && dVar3.p(mVar)) {
                    i10 = 32;
                }
            }
        }
        return u1.create(i12, i13, i10, i14, i15);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean X() {
        return this.f85130m1 && m0.f79487a < 23;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public float Y(float f10, com.google.android.exoplayer2.m mVar, com.google.android.exoplayer2.m[] mVarArr) {
        float fMax = -1.0f;
        for (com.google.android.exoplayer2.m mVar2 : mVarArr) {
            float f11 = mVar2.f21758t;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    public final void Z0() {
        com.google.android.exoplayer2.mediacodec.c cVarV;
        this.U0 = false;
        if (m0.f79487a < 23 || !this.f85130m1 || (cVarV = V()) == null) {
            return;
        }
        this.f85132o1 = new c(cVarV);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public List<com.google.android.exoplayer2.mediacodec.d> a0(com.google.android.exoplayer2.mediacodec.e eVar, com.google.android.exoplayer2.m mVar, boolean z10) throws MediaCodecUtil.DecoderQueryException {
        return MediaCodecUtil.u(j1(this.H0, eVar, mVar, z10, this.f85130m1), mVar);
    }

    public final void a1() {
        this.f85129l1 = null;
    }

    public boolean b1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (g.class) {
            if (!f85116r1) {
                f85117s1 = f1();
                f85116r1 = true;
            }
        }
        return f85117s1;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @TargetApi(17)
    public c.a c0(com.google.android.exoplayer2.mediacodec.d dVar, com.google.android.exoplayer2.m mVar, @Nullable MediaCrypto mediaCrypto, float f10) {
        PlaceholderSurface placeholderSurface = this.R0;
        if (placeholderSurface != null && placeholderSurface.f22938b != dVar.f21860g) {
            z1();
        }
        String str = dVar.f21856c;
        b bVarI1 = i1(dVar, mVar, l());
        this.N0 = bVarI1;
        MediaFormat mediaFormatM1 = m1(mVar, str, bVarI1, f10, this.M0, this.f85130m1 ? this.f85131n1 : 0);
        if (this.Q0 == null) {
            if (!J1(dVar)) {
                throw new IllegalStateException();
            }
            if (this.R0 == null) {
                this.R0 = PlaceholderSurface.d(this.H0, dVar.f21860g);
            }
            this.Q0 = this.R0;
        }
        return c.a.b(dVar, mediaFormatM1, mVar, this.Q0, mediaCrypto);
    }

    public void e1(com.google.android.exoplayer2.mediacodec.c cVar, int i10, long j10) {
        k0.a("dropVideoBuffer");
        cVar.releaseOutputBuffer(i10, false);
        k0.c();
        L1(0, 1);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @TargetApi(29)
    public void f0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        if (this.P0) {
            ByteBuffer byteBuffer = (ByteBuffer) s7.a.e(decoderInputBuffer.f21433g);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        C1(V(), bArr);
                    }
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.y, d6.u1
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.w.b
    public void handleMessage(int i10, @Nullable Object obj) throws ExoPlaybackException {
        if (i10 == 1) {
            E1(obj);
            return;
        }
        if (i10 == 7) {
            this.f85133p1 = (i) obj;
            return;
        }
        if (i10 == 10) {
            int iIntValue = ((Integer) obj).intValue();
            if (this.f85131n1 != iIntValue) {
                this.f85131n1 = iIntValue;
                if (this.f85130m1) {
                    D0();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                super.handleMessage(i10, obj);
                return;
            } else {
                this.I0.o(((Integer) obj).intValue());
                return;
            }
        }
        this.T0 = ((Integer) obj).intValue();
        com.google.android.exoplayer2.mediacodec.c cVarV = V();
        if (cVarV != null) {
            cVarV.setVideoScalingMode(this.T0);
        }
    }

    public b i1(com.google.android.exoplayer2.mediacodec.d dVar, com.google.android.exoplayer2.m mVar, com.google.android.exoplayer2.m[] mVarArr) {
        int iG1;
        int iMax = mVar.f21756r;
        int iMax2 = mVar.f21757s;
        int iK1 = k1(dVar, mVar);
        if (mVarArr.length == 1) {
            if (iK1 != -1 && (iG1 = g1(dVar, mVar)) != -1) {
                iK1 = Math.min((int) (iK1 * 1.5f), iG1);
            }
            return new b(iMax, iMax2, iK1);
        }
        int length = mVarArr.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            com.google.android.exoplayer2.m mVarE = mVarArr[i10];
            if (mVar.f21763y != null && mVarE.f21763y == null) {
                mVarE = mVarE.b().J(mVar.f21763y).E();
            }
            if (dVar.e(mVar, mVarE).f62113d != 0) {
                int i11 = mVarE.f21756r;
                z10 |= i11 == -1 || mVarE.f21757s == -1;
                iMax = Math.max(iMax, i11);
                iMax2 = Math.max(iMax2, mVarE.f21757s);
                iK1 = Math.max(iK1, k1(dVar, mVarE));
            }
        }
        if (z10) {
            s7.q.i("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + VastAttributes.HORIZONTAL_POSITION + iMax2);
            Point pointH1 = h1(dVar, mVar);
            if (pointH1 != null) {
                iMax = Math.max(iMax, pointH1.x);
                iMax2 = Math.max(iMax2, pointH1.y);
                iK1 = Math.max(iK1, g1(dVar, mVar.b().j0(iMax).Q(iMax2).E()));
                s7.q.i("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + VastAttributes.HORIZONTAL_POSITION + iMax2);
            }
        }
        return new b(iMax, iMax2, iK1);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.y
    public boolean isReady() {
        PlaceholderSurface placeholderSurface;
        if (super.isReady() && (this.U0 || (((placeholderSurface = this.R0) != null && this.Q0 == placeholderSurface) || V() == null || this.f85130m1))) {
            this.Y0 = -9223372036854775807L;
            return true;
        }
        if (this.Y0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.Y0) {
            return true;
        }
        this.Y0 = -9223372036854775807L;
        return false;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    public MediaFormat m1(com.google.android.exoplayer2.m mVar, String str, b bVar, float f10, boolean z10, int i10) {
        Pair<Integer, Integer> pairQ;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", mVar.f21756r);
        mediaFormat.setInteger("height", mVar.f21757s);
        s7.t.e(mediaFormat, mVar.f21753o);
        s7.t.c(mediaFormat, "frame-rate", mVar.f21758t);
        s7.t.d(mediaFormat, "rotation-degrees", mVar.f21759u);
        s7.t.b(mediaFormat, mVar.f21763y);
        if ("video/dolby-vision".equals(mVar.f21751m) && (pairQ = MediaCodecUtil.q(mVar)) != null) {
            s7.t.d(mediaFormat, Scopes.PROFILE, ((Integer) pairQ.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar.f85134a);
        mediaFormat.setInteger("max-height", bVar.f85135b);
        s7.t.d(mediaFormat, "max-input-size", bVar.f85136c);
        if (m0.f79487a >= 23) {
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
            c1(mediaFormat, i10);
        }
        return mediaFormat;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public void n() {
        a1();
        Z0();
        this.S0 = false;
        this.f85132o1 = null;
        try {
            super.n();
        } finally {
            this.J0.m(this.C0);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public void o(boolean z10, boolean z11) throws ExoPlaybackException {
        super.o(z10, z11);
        boolean z12 = h().f59707a;
        s7.a.g((z12 && this.f85131n1 == 0) ? false : true);
        if (this.f85130m1 != z12) {
            this.f85130m1 = z12;
            D0();
        }
        this.J0.o(this.C0);
        this.V0 = z11;
        this.W0 = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public void p(long j10, boolean z10) throws ExoPlaybackException {
        super.p(j10, z10);
        Z0();
        this.I0.j();
        this.f85121d1 = -9223372036854775807L;
        this.X0 = -9223372036854775807L;
        this.f85119b1 = 0;
        if (z10) {
            D1();
        } else {
            this.Y0 = -9223372036854775807L;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void p0(Exception exc) {
        s7.q.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.J0.C(exc);
    }

    public boolean p1(long j10, boolean z10) throws ExoPlaybackException {
        int iW = w(j10);
        if (iW == 0) {
            return false;
        }
        if (z10) {
            g6.e eVar = this.C0;
            eVar.f62099d += iW;
            eVar.f62101f += this.f85120c1;
        } else {
            this.C0.f62105j++;
            L1(iW, this.f85120c1);
        }
        S();
        return true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    @TargetApi(17)
    public void q() {
        try {
            super.q();
        } finally {
            if (this.R0 != null) {
                z1();
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void q0(String str, c.a aVar, long j10, long j11) {
        this.J0.k(str, j10, j11);
        this.O0 = b1(str);
        this.P0 = ((com.google.android.exoplayer2.mediacodec.d) s7.a.e(W())).n();
        if (m0.f79487a < 23 || !this.f85130m1) {
            return;
        }
        this.f85132o1 = new c((com.google.android.exoplayer2.mediacodec.c) s7.a.e(V()));
    }

    public final void q1() {
        if (this.f85118a1 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.J0.n(this.f85118a1, jElapsedRealtime - this.Z0);
            this.f85118a1 = 0;
            this.Z0 = jElapsedRealtime;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public void r() {
        super.r();
        this.f85118a1 = 0;
        this.Z0 = SystemClock.elapsedRealtime();
        this.f85122e1 = SystemClock.elapsedRealtime() * 1000;
        this.f85123f1 = 0L;
        this.f85124g1 = 0;
        this.I0.k();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void r0(String str) {
        this.J0.l(str);
    }

    public void r1() {
        this.W0 = true;
        if (this.U0) {
            return;
        }
        this.U0 = true;
        this.J0.A(this.Q0);
        this.S0 = true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public void s() {
        this.Y0 = -9223372036854775807L;
        q1();
        s1();
        this.I0.l();
        super.s();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @Nullable
    public g6.g s0(z0 z0Var) throws ExoPlaybackException {
        g6.g gVarS0 = super.s0(z0Var);
        this.J0.p(z0Var.f59724b, gVarS0);
        return gVarS0;
    }

    public final void s1() {
        int i10 = this.f85124g1;
        if (i10 != 0) {
            this.J0.B(this.f85123f1, i10);
            this.f85123f1 = 0L;
            this.f85124g1 = 0;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.y
    public void setPlaybackSpeed(float f10, float f11) throws ExoPlaybackException {
        super.setPlaybackSpeed(f10, f11);
        this.I0.i(f10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void t0(com.google.android.exoplayer2.m mVar, @Nullable MediaFormat mediaFormat) {
        com.google.android.exoplayer2.mediacodec.c cVarV = V();
        if (cVarV != null) {
            cVarV.setVideoScalingMode(this.T0);
        }
        if (this.f85130m1) {
            this.f85125h1 = mVar.f21756r;
            this.f85126i1 = mVar.f21757s;
        } else {
            s7.a.e(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f85125h1 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.f85126i1 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f10 = mVar.f21760v;
        this.f85128k1 = f10;
        if (m0.f79487a >= 21) {
            int i10 = mVar.f21759u;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f85125h1;
                this.f85125h1 = this.f85126i1;
                this.f85126i1 = i11;
                this.f85128k1 = 1.0f / f10;
            }
        } else {
            this.f85127j1 = mVar.f21759u;
        }
        this.I0.g(mVar.f21758t);
    }

    public final void t1() {
        int i10 = this.f85125h1;
        if (i10 == -1 && this.f85126i1 == -1) {
            return;
        }
        x xVar = this.f85129l1;
        if (xVar != null && xVar.f85196b == i10 && xVar.f85197c == this.f85126i1 && xVar.f85198d == this.f85127j1 && xVar.f85199e == this.f85128k1) {
            return;
        }
        x xVar2 = new x(this.f85125h1, this.f85126i1, this.f85127j1, this.f85128k1);
        this.f85129l1 = xVar2;
        this.J0.D(xVar2);
    }

    public final void u1() {
        if (this.S0) {
            this.J0.A(this.Q0);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    public void v0(long j10) {
        super.v0(j10);
        if (this.f85130m1) {
            return;
        }
        this.f85120c1--;
    }

    public final void v1() {
        x xVar = this.f85129l1;
        if (xVar != null) {
            this.J0.D(xVar);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void w0() {
        super.w0();
        Z0();
    }

    public final void w1(long j10, long j11, com.google.android.exoplayer2.m mVar) {
        i iVar = this.f85133p1;
        if (iVar != null) {
            iVar.a(j10, j11, mVar, Z());
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    public void x0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        boolean z10 = this.f85130m1;
        if (!z10) {
            this.f85120c1++;
        }
        if (m0.f79487a >= 23 || !z10) {
            return;
        }
        x1(decoderInputBuffer.f21432f);
    }

    public void x1(long j10) throws ExoPlaybackException {
        W0(j10);
        t1();
        this.C0.f62100e++;
        r1();
        v0(j10);
    }

    public final void y1() {
        L0();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public g6.g z(com.google.android.exoplayer2.mediacodec.d dVar, com.google.android.exoplayer2.m mVar, com.google.android.exoplayer2.m mVar2) {
        g6.g gVarE = dVar.e(mVar, mVar2);
        int i10 = gVarE.f62114e;
        int i11 = mVar2.f21756r;
        b bVar = this.N0;
        if (i11 > bVar.f85134a || mVar2.f21757s > bVar.f85135b) {
            i10 |= 256;
        }
        if (k1(dVar, mVar2) > this.N0.f85136c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new g6.g(dVar.f21854a, mVar, mVar2, i12 != 0 ? 0 : gVarE.f62113d, i12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean z0(long j10, long j11, @Nullable com.google.android.exoplayer2.mediacodec.c cVar, @Nullable ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, com.google.android.exoplayer2.m mVar) throws ExoPlaybackException {
        boolean z12;
        long j13;
        s7.a.e(cVar);
        if (this.X0 == -9223372036854775807L) {
            this.X0 = j10;
        }
        if (j12 != this.f85121d1) {
            this.I0.h(j12);
            this.f85121d1 = j12;
        }
        long jD0 = d0();
        long j14 = j12 - jD0;
        if (z10 && !z11) {
            K1(cVar, i10, j14);
            return true;
        }
        double dE0 = e0();
        boolean z13 = getState() == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j15 = (long) ((j12 - j10) / dE0);
        if (z13) {
            j15 -= jElapsedRealtime - j11;
        }
        if (this.Q0 == this.R0) {
            if (!n1(j15)) {
                return false;
            }
            K1(cVar, i10, j14);
            M1(j15);
            return true;
        }
        long j16 = jElapsedRealtime - this.f85122e1;
        if (this.W0 ? this.U0 : !(z13 || this.V0)) {
            j13 = j16;
            z12 = false;
        } else {
            z12 = true;
            j13 = j16;
        }
        if (this.Y0 == -9223372036854775807L && j10 >= jD0 && (z12 || (z13 && I1(j15, j13)))) {
            long jNanoTime = System.nanoTime();
            w1(j14, jNanoTime, mVar);
            if (m0.f79487a >= 21) {
                B1(cVar, i10, j14, jNanoTime);
            } else {
                A1(cVar, i10, j14);
            }
            M1(j15);
            return true;
        }
        if (z13 && j10 != this.X0) {
            long jNanoTime2 = System.nanoTime();
            long jB = this.I0.b((j15 * 1000) + jNanoTime2);
            long j17 = (jB - jNanoTime2) / 1000;
            boolean z14 = this.Y0 != -9223372036854775807L;
            if (G1(j17, j11, z11) && p1(j10, z14)) {
                return false;
            }
            if (H1(j17, j11, z11)) {
                if (z14) {
                    K1(cVar, i10, j14);
                } else {
                    e1(cVar, i10, j14);
                }
                M1(j17);
                return true;
            }
            if (m0.f79487a >= 21) {
                if (j17 < ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) {
                    w1(j14, jB, mVar);
                    B1(cVar, i10, j14, jB);
                    M1(j17);
                    return true;
                }
            } else if (j17 < 30000) {
                if (j17 > 11000) {
                    try {
                        Thread.sleep((j17 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                w1(j14, jB, mVar);
                A1(cVar, i10, j14);
                M1(j17);
                return true;
            }
        }
        return false;
    }

    @RequiresApi(17)
    public final void z1() {
        Surface surface = this.Q0;
        PlaceholderSurface placeholderSurface = this.R0;
        if (surface == placeholderSurface) {
            this.Q0 = null;
        }
        placeholderSurface.release();
        this.R0 = null;
    }
}
