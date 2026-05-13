package yads;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class mm1 implements af, he2 {
    public boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f92440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oe0 f92441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlaybackSession f92442c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f92448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PlaybackMetrics.Builder f92449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f92450k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public be2 f92453n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public lm1 f92454o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public lm1 f92455p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public lm1 f92456q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public mx0 f92457r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public mx0 f92458s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public mx0 f92459t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f92460u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f92461v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f92462w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f92463x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f92464y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f92465z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r63 f92444e = new r63();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p63 f92445f = new p63();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f92447h = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f92446g = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f92443d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f92451l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f92452m = 0;

    public mm1(Context context, PlaybackSession playbackSession) {
        this.f92440a = context.getApplicationContext();
        this.f92442c = playbackSession;
        oe0 oe0Var = new oe0();
        this.f92441b = oe0Var;
        oe0Var.a(this);
    }

    public final void a() {
        PlaybackMetrics.Builder builder = this.f92449j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.f92465z);
            this.f92449j.setVideoFramesDropped(this.f92463x);
            this.f92449j.setVideoFramesPlayed(this.f92464y);
            Long l10 = (Long) this.f92446g.get(this.f92448i);
            this.f92449j.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.f92447h.get(this.f92448i);
            this.f92449j.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f92449j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f92442c.reportPlaybackMetrics(this.f92449j.build());
        }
        this.f92449j = null;
        this.f92448i = null;
        this.f92465z = 0;
        this.f92463x = 0;
        this.f92464y = 0;
        this.f92457r = null;
        this.f92458s = null;
        this.f92459t = null;
        this.A = false;
    }

    public final void a(int i10, long j10, mx0 mx0Var, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.f92443d);
        if (mx0Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            int i12 = 3;
            if (i11 == 1) {
                i12 = 2;
            } else if (i11 != 2) {
                i12 = i11 != 3 ? 1 : 4;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i12);
            String str = mx0Var.f92609l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = mx0Var.f92610m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = mx0Var.f92607j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i13 = mx0Var.f92606i;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = mx0Var.f92615r;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = mx0Var.f92616s;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = mx0Var.f92623z;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = mx0Var.A;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str4 = mx0Var.f92601d;
            if (str4 != null) {
                int i18 = ib3.f90737a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = mx0Var.f92617t;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.f92442c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0668 A[PHI: r2
      0x0668: PHI (r2v88 int) = (r2v87 int), (r2v86 int) binds: [B:404:0x0663, B:394:0x0647] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x004a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r23v0, types: [yads.mm1] */
    /* JADX WARN: Type inference failed for: r2v95, types: [android.media.metrics.NetworkEvent$Builder] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27, types: [int] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30, types: [int] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33, types: [int] */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36, types: [int] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(yads.oe2 r24, yads.ze r25) {
        /*
            Method dump skipped, instruction units count: 1834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.mm1.a(yads.oe2, yads.ze):void");
    }

    public final void a(s63 s63Var, ym1 ym1Var) {
        int iA;
        PlaybackMetrics.Builder builder = this.f92449j;
        if (ym1Var == null || (iA = s63Var.a(ym1Var.f94492a)) == -1) {
            return;
        }
        int i10 = 0;
        s63Var.a(iA, this.f92445f, false);
        s63Var.a(this.f92445f.f93449d, this.f92444e, 0L);
        am1 am1Var = this.f92444e.f94301d.f89625c;
        if (am1Var != null) {
            int iA2 = ib3.a(am1Var.f97653a, am1Var.f97654b);
            i10 = iA2 != 0 ? iA2 != 1 ? iA2 != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i10);
        r63 r63Var = this.f92444e;
        if (r63Var.f94312o != -9223372036854775807L && !r63Var.f94310m && !r63Var.f94307j && !r63Var.a()) {
            builder.setMediaDurationMillis(ib3.b(this.f92444e.f94312o));
        }
        builder.setPlaybackType(this.f92444e.a() ? 2 : 1);
        this.A = true;
    }

    public final void a(ye yeVar, String str) {
        ym1 ym1Var = yeVar.f97093d;
        if (ym1Var == null || !ym1Var.a()) {
            a();
            this.f92448i = str;
            this.f92449j = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.1");
            a(yeVar.f97091b, yeVar.f97093d);
        }
    }

    public final boolean a(lm1 lm1Var) {
        String str;
        if (lm1Var != null) {
            String str2 = lm1Var.f92034c;
            oe0 oe0Var = this.f92441b;
            synchronized (oe0Var) {
                str = oe0Var.f93201g;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void b(ye yeVar, String str) {
        ym1 ym1Var = yeVar.f97093d;
        if ((ym1Var == null || !ym1Var.a()) && str.equals(this.f92448i)) {
            a();
        }
        this.f92446g.remove(str);
        this.f92447h.remove(str);
    }
}
