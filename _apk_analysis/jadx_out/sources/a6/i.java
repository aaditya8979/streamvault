package a6;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.metadata.Metadata;
import com.google.android.exoplayer.source.TrackGroup;
import com.google.android.exoplayer.source.TrackGroupArray;
import com.google.android.exoplayer.trackselection.b;
import com.ironsource.C3978d4;
import e4.q0;
import e4.v0;
import e5.b0;
import f4.b;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import org.eclipse.jetty.util.security.Constraint;

/* JADX INFO: compiled from: EventLogger.java */
/* JADX INFO: loaded from: classes.dex */
public class i implements f4.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final NumberFormat f3553f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final com.google.android.exoplayer.trackselection.b f3554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0.c f3556c = new v0.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v0.b f3557d = new v0.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3558e = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f3553f = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public i(@Nullable com.google.android.exoplayer.trackselection.b bVar, String str) {
        this.f3554a = bVar;
        this.f3555b = str;
    }

    public static String O(int i10, int i11) {
        if (i10 < 2) {
            return "N/A";
        }
        if (i11 == 0) {
            return "NO";
        }
        if (i11 == 8) {
            return "YES_NOT_SEAMLESS";
        }
        if (i11 == 16) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static String P(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "?" : "INTERNAL" : "AD_INSERTION" : "SEEK_ADJUSTMENT" : "SEEK" : "PERIOD_TRANSITION";
    }

    public static String S(int i10) {
        return i10 != 0 ? i10 != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS" : Constraint.NONE;
    }

    public static String T(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "?" : "ALL" : "ONE" : "OFF";
    }

    public static String U(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE";
    }

    public static String V(long j10) {
        return j10 == -9223372036854775807L ? "?" : f3553f.format(j10 / 1000.0f);
    }

    public static String W(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "?" : "DYNAMIC" : "RESET" : "PREPARED";
    }

    public static String X(@Nullable com.google.android.exoplayer.trackselection.c cVar, TrackGroup trackGroup, int i10) {
        return Y((cVar == null || cVar.getTrackGroup() != trackGroup || cVar.indexOf(i10) == -1) ? false : true);
    }

    public static String Y(boolean z10) {
        return z10 ? "[X]" : "[ ]";
    }

    @Override // f4.b
    public void A(b.a aVar, int i10, int i11) {
        a0(aVar, "surfaceSize", i10 + ", " + i11);
    }

    @Override // f4.b
    public void B(b.a aVar, int i10) {
        a0(aVar, "playbackSuppressionReason", S(i10));
    }

    @Override // f4.b
    public void C(b.a aVar, boolean z10, int i10) {
        a0(aVar, "state", z10 + ", " + U(i10));
    }

    @Override // f4.b
    public void D(b.a aVar, boolean z10) {
        a0(aVar, "shuffleModeEnabled", Boolean.toString(z10));
    }

    @Override // f4.b
    public void E(b.a aVar, int i10) {
        int i11 = aVar.f61454b.i();
        int iP = aVar.f61454b.p();
        b0("timeline [" + R(aVar) + ", periodCount=" + i11 + ", windowCount=" + iP + ", reason=" + W(i10));
        for (int i12 = 0; i12 < Math.min(i11, 3); i12++) {
            aVar.f61454b.f(i12, this.f3557d);
            b0("  period [" + V(this.f3557d.h()) + C3978d4.j.f31385e);
        }
        if (i11 > 3) {
            b0("  ...");
        }
        for (int i13 = 0; i13 < Math.min(iP, 3); i13++) {
            aVar.f61454b.n(i13, this.f3556c);
            b0("  window [" + V(this.f3556c.c()) + ", " + this.f3556c.f60316f + ", " + this.f3556c.f60317g + C3978d4.j.f31385e);
        }
        if (iP > 3) {
            b0("  ...");
        }
        b0(C3978d4.j.f31385e);
    }

    @Override // f4.b
    public void F(b.a aVar) {
        Z(aVar, "seekStarted");
    }

    @Override // f4.b
    public void G(b.a aVar, int i10, String str, long j10) {
        a0(aVar, "decoderInitialized", k0.a0(i10) + ", " + str);
    }

    @Override // f4.b
    public void H(b.a aVar) {
        Z(aVar, "mediaPeriodCreated");
    }

    @Override // f4.b
    public void I(b.a aVar, int i10, int i11, int i12, float f10) {
        a0(aVar, "videoSize", i10 + ", " + i11);
    }

    @Override // f4.b
    public void J(b.a aVar, b0.c cVar) {
        a0(aVar, "downstreamFormat", Format.G(cVar.f60361c));
    }

    @Override // f4.b
    public void K(b.a aVar, int i10) {
        a0(aVar, "repeatMode", T(i10));
    }

    @Override // f4.b
    public void L(b.a aVar, int i10) {
        a0(aVar, "positionDiscontinuity", P(i10));
    }

    @Override // f4.b
    public void M(b.a aVar, b0.c cVar) {
        a0(aVar, "upstreamDiscarded", Format.G(cVar.f60361c));
    }

    @Override // f4.b
    public void N(b.a aVar, int i10, i4.d dVar) {
        a0(aVar, "decoderDisabled", k0.a0(i10));
    }

    public final String Q(b.a aVar, String str, @Nullable String str2, @Nullable Throwable th2) {
        String str3 = str + " [" + R(aVar);
        if (str2 != null) {
            str3 = str3 + ", " + str2;
        }
        String strE = m.e(th2);
        if (!TextUtils.isEmpty(strE)) {
            str3 = str3 + "\n  " + strE.replace("\n", "\n  ") + '\n';
        }
        return str3 + C3978d4.j.f31385e;
    }

    public final String R(b.a aVar) {
        String str = "window=" + aVar.f61455c;
        if (aVar.f61456d != null) {
            str = str + ", period=" + aVar.f61454b.b(aVar.f61456d.f60579a);
            if (aVar.f61456d.b()) {
                str = (str + ", adGroup=" + aVar.f61456d.f60580b) + ", ad=" + aVar.f61456d.f60581c;
            }
        }
        return "eventTime=" + V(aVar.f61453a - this.f3558e) + ", mediaPos=" + V(aVar.f61458f) + ", " + str;
    }

    public final void Z(b.a aVar, String str) {
        b0(Q(aVar, str, null, null));
    }

    @Override // f4.b
    public void a(b.a aVar, TrackGroupArray trackGroupArray, w5.c cVar) {
        int i10;
        com.google.android.exoplayer.trackselection.b bVar = this.f3554a;
        b.a aVarG = bVar != null ? bVar.g() : null;
        if (aVarG == null) {
            a0(aVar, "tracks", "[]");
            return;
        }
        b0("tracks [" + R(aVar));
        int iC = aVarG.c();
        int i11 = 0;
        while (true) {
            String str = "  ]";
            String str2 = " [";
            if (i11 >= iC) {
                break;
            }
            TrackGroupArray trackGroupArrayE = aVarG.e(i11);
            com.google.android.exoplayer.trackselection.c cVarA = cVar.a(i11);
            if (trackGroupArrayE.f20392b > 0) {
                StringBuilder sb2 = new StringBuilder();
                i10 = iC;
                sb2.append("  Renderer:");
                sb2.append(i11);
                sb2.append(" [");
                b0(sb2.toString());
                int i12 = 0;
                while (i12 < trackGroupArrayE.f20392b) {
                    TrackGroup trackGroupB = trackGroupArrayE.b(i12);
                    TrackGroupArray trackGroupArray2 = trackGroupArrayE;
                    String str3 = str;
                    b0("    Group:" + i12 + ", adaptive_supported=" + O(trackGroupB.f20388b, aVarG.a(i11, i12, false)) + str2);
                    int i13 = 0;
                    while (i13 < trackGroupB.f20388b) {
                        b0("      " + X(cVarA, trackGroupB, i13) + " Track:" + i13 + ", " + Format.G(trackGroupB.b(i13)) + ", supported=" + q0.f(aVarG.f(i11, i12, i13)));
                        i13++;
                        str2 = str2;
                    }
                    b0("    ]");
                    i12++;
                    trackGroupArrayE = trackGroupArray2;
                    str = str3;
                }
                String str4 = str;
                if (cVarA != null) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= cVarA.length()) {
                            break;
                        }
                        Metadata metadata = cVarA.getFormat(i14).f19925h;
                        if (metadata != null) {
                            b0("    Metadata [");
                            g0(metadata, "      ");
                            b0("    ]");
                            break;
                        }
                        i14++;
                    }
                }
                b0(str4);
            } else {
                i10 = iC;
            }
            i11++;
            iC = i10;
        }
        String str5 = " [";
        TrackGroupArray trackGroupArrayG = aVarG.g();
        if (trackGroupArrayG.f20392b > 0) {
            b0("  Renderer:None [");
            int i15 = 0;
            while (i15 < trackGroupArrayG.f20392b) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("    Group:");
                sb3.append(i15);
                String str6 = str5;
                sb3.append(str6);
                b0(sb3.toString());
                TrackGroup trackGroupB2 = trackGroupArrayG.b(i15);
                for (int i16 = 0; i16 < trackGroupB2.f20388b; i16++) {
                    b0("      " + Y(false) + " Track:" + i16 + ", " + Format.G(trackGroupB2.b(i16)) + ", supported=" + q0.f(0));
                }
                b0("    ]");
                i15++;
                str5 = str6;
            }
            b0("  ]");
        }
        b0(C3978d4.j.f31385e);
    }

    public final void a0(b.a aVar, String str, String str2) {
        b0(Q(aVar, str, str2, null));
    }

    @Override // f4.b
    public void b(b.a aVar) {
        Z(aVar, "drmKeysRestored");
    }

    public void b0(String str) {
        m.b(this.f3555b, str);
    }

    @Override // f4.b
    public void c(b.a aVar, boolean z10) {
        a0(aVar, "isPlaying", Boolean.toString(z10));
    }

    public final void c0(b.a aVar, String str, String str2, @Nullable Throwable th2) {
        e0(Q(aVar, str, str2, th2));
    }

    @Override // f4.b
    public void d(b.a aVar, Exception exc) {
        f0(aVar, "drmSessionManagerError", exc);
    }

    public final void d0(b.a aVar, String str, @Nullable Throwable th2) {
        e0(Q(aVar, str, null, th2));
    }

    @Override // f4.b
    public void e(b.a aVar) {
        Z(aVar, "mediaPeriodReleased");
    }

    public void e0(String str) {
        m.c(this.f3555b, str);
    }

    @Override // f4.b
    public void f(b.a aVar, b0.b bVar, b0.c cVar, IOException iOException, boolean z10) {
        f0(aVar, "loadError", iOException);
    }

    public final void f0(b.a aVar, String str, Exception exc) {
        c0(aVar, "internalError", str, exc);
    }

    @Override // f4.b
    public void g(b.a aVar, boolean z10) {
        a0(aVar, "loading", Boolean.toString(z10));
    }

    public final void g0(Metadata metadata, String str) {
        for (int i10 = 0; i10 < metadata.e(); i10++) {
            b0(str + metadata.d(i10));
        }
    }

    @Override // f4.b
    public void h(b.a aVar, Metadata metadata) {
        b0("metadata [" + R(aVar));
        g0(metadata, "  ");
        b0(C3978d4.j.f31385e);
    }

    @Override // f4.b
    public void i(b.a aVar, @Nullable Surface surface) {
        a0(aVar, "renderedFirstFrame", String.valueOf(surface));
    }

    @Override // f4.b
    public void j(b.a aVar, int i10, long j10, long j11) {
        c0(aVar, "audioTrackUnderrun", i10 + ", " + j10 + ", " + j11 + C3978d4.j.f31385e, null);
    }

    @Override // f4.b
    public void k(b.a aVar, b0.b bVar, b0.c cVar) {
    }

    @Override // f4.b
    public void l(b.a aVar, int i10) {
        a0(aVar, "audioSessionId", Integer.toString(i10));
    }

    @Override // f4.b
    public void m(b.a aVar) {
        Z(aVar, "mediaPeriodReadingStarted");
    }

    @Override // f4.b
    public void n(b.a aVar) {
        Z(aVar, "seekProcessed");
    }

    @Override // f4.b
    public void o(b.a aVar, b0.b bVar, b0.c cVar) {
    }

    @Override // f4.b
    public void p(b.a aVar, b0.b bVar, b0.c cVar) {
    }

    @Override // f4.b
    public void q(b.a aVar, int i10, long j10, long j11) {
    }

    @Override // f4.b
    public void r(b.a aVar) {
        Z(aVar, "drmSessionReleased");
    }

    @Override // f4.b
    public void s(b.a aVar, int i10, long j10) {
        a0(aVar, "droppedFrames", Integer.toString(i10));
    }

    @Override // f4.b
    public void t(b.a aVar, int i10, Format format) {
        a0(aVar, "decoderInputFormat", k0.a0(i10) + ", " + Format.G(format));
    }

    @Override // f4.b
    public void u(b.a aVar, e4.l0 l0Var) {
        a0(aVar, "playbackParameters", k0.y("speed=%.2f, pitch=%.2f, skipSilence=%s", Float.valueOf(l0Var.f60187a), Float.valueOf(l0Var.f60188b), Boolean.valueOf(l0Var.f60189c)));
    }

    @Override // f4.b
    public void v(b.a aVar, int i10, i4.d dVar) {
        a0(aVar, "decoderEnabled", k0.a0(i10));
    }

    @Override // f4.b
    public void w(b.a aVar, ExoPlaybackException exoPlaybackException) {
        d0(aVar, "playerFailed", exoPlaybackException);
    }

    @Override // f4.b
    public void x(b.a aVar, float f10) {
        a0(aVar, "volume", Float.toString(f10));
    }

    @Override // f4.b
    public void y(b.a aVar) {
        Z(aVar, "drmKeysLoaded");
    }

    @Override // f4.b
    public void z(b.a aVar) {
        Z(aVar, "drmSessionAcquired");
    }
}
