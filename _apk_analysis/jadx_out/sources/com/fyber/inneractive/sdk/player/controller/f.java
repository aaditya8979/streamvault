package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer;
import com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends q {
    public final boolean A;
    public final CopyOnWriteArrayList B;
    public com.fyber.inneractive.sdk.player.exoplayer2.source.u C;
    public boolean D;
    public int E;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f17157p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f17158q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f17159r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.g f17160s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f17161t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f17162u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f17163v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.a[] f17164w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Handler f17165x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b0 f17166y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f17167z;

    public f(Context context, boolean z10, com.fyber.inneractive.sdk.config.global.r rVar) {
        Integer numA;
        super(context);
        this.f17161t = 0;
        this.f17162u = 0;
        this.f17163v = false;
        this.f17167z = false;
        this.B = new CopyOnWriteArrayList();
        this.C = null;
        this.E = 0;
        this.A = z10;
        this.f17158q = rVar;
        this.f17159r = IAConfigManager.O.f15975u.f16144b.a("extractor_source_retry_count", 6, 3);
        com.fyber.inneractive.sdk.config.global.features.u uVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.u) rVar.a(com.fyber.inneractive.sdk.config.global.features.u.class) : null;
        this.f17157p = (uVar == null || (numA = uVar.a("max_tries")) == null) ? 0 : numA.intValue();
        IAlog.a("Creating IAExoPlayer2Controller", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a() {
        if (this.f17160s != null) {
            if (!this.f17167z) {
                this.f17167z = true;
                com.fyber.inneractive.sdk.util.r.f19555a.execute(new e(this));
            }
            b0 b0Var = this.f17166y;
            if (b0Var != null) {
                b0Var.f17145a.clear();
            }
            this.f17166y = null;
        }
        Iterator it = this.B.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.B.clear();
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(int i10, boolean z10) {
        IAlog.a("%sseekTo called with %d playAfterSeek = %s", IAlog.a(this), Integer.valueOf(i10), Boolean.valueOf(z10));
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f17160s;
        if (gVar == null || this.f17167z) {
            return;
        }
        gVar.a(z10);
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar2 = this.f17160s;
        gVar2.a(gVar2.a(), i10);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(Surface surface) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar;
        IAlog.a("%ssetSurface called with %s", IAlog.a(this), surface);
        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = this.f17164w;
        if (aVarArr == null || (gVar = this.f17160s) == null || this.f17167z) {
            return;
        }
        gVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.e(aVarArr[0], 1, surface));
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f17160s;
        if (gVar == null || uVar == null) {
            return;
        }
        if (!gVar.f18315m.c() || gVar.f18316n != null) {
            gVar.f18315m = com.fyber.inneractive.sdk.player.exoplayer2.x.f18911a;
            gVar.f18316n = null;
            Iterator it = gVar.f18307e.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).getClass();
            }
        }
        if (gVar.f18310h) {
            gVar.f18310h = false;
            int i10 = com.fyber.inneractive.sdk.player.exoplayer2.source.z.f18576d;
            gVar.f18317o = gVar.f18304b;
            ((com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g) gVar.f18303a).getClass();
            Iterator it2 = gVar.f18307e.iterator();
            while (it2.hasNext()) {
                ((b0) it2.next()).getClass();
            }
        }
        gVar.f18314l++;
        gVar.f18306d.f18356f.obtainMessage(0, 1, 0, uVar).sendToTarget();
        a(com.fyber.inneractive.sdk.player.enums.b.Preparing);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    @Override // com.fyber.inneractive.sdk.player.controller.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r13, int r14) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.f.a(java.lang.String, int):void");
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(boolean z10) {
        if (this.f17160s != null || this.f17167z) {
            return;
        }
        this.D = z10;
        IAlog.a("%sMediaPlayerController: creating media player", IAlog.a(this));
        b0 b0Var = this.f17166y;
        if (b0Var != null) {
            b0Var.f17145a.clear();
        }
        this.f17166y = new b0(this);
        this.f17165x = new Handler(Looper.getMainLooper());
        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.a[z10 ? 2 : 1];
        this.f17164w = aVarArr;
        aVarArr[0] = new MediaCodecVideoRenderer(this.f17165x, this.f17166y);
        if (z10) {
            this.f17164w[1] = new MediaCodecAudioRenderer();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = new com.fyber.inneractive.sdk.player.exoplayer2.g(this.f17164w, new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d(), new com.fyber.inneractive.sdk.player.exoplayer2.c());
        this.f17160s = gVar;
        gVar.f18307e.add(this.f17166y);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int b() {
        long jA;
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f17160s;
        if (gVar == null || this.f17167z) {
            return 0;
        }
        if (gVar.f18315m.c() || gVar.f18313k > 0) {
            jA = gVar.f18321s;
        } else {
            gVar.f18315m.a(gVar.f18319q.f18341a, gVar.f18309g, false);
            jA = com.fyber.inneractive.sdk.player.exoplayer2.b.a(gVar.f18319q.f18343c) + com.fyber.inneractive.sdk.player.exoplayer2.b.a(gVar.f18309g.f18834e);
        }
        return (int) jA;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void b(boolean z10) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar;
        this.f17195n = z10;
        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = this.f17164w;
        if (aVarArr == null || (gVar = this.f17160s) == null || this.f17167z || aVarArr.length < 2) {
            return;
        }
        gVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.e(aVarArr[1], 2, Float.valueOf(0.0f)));
        this.f17163v = true;
        c(true);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int c() {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f17160s;
        if (gVar == null || this.f17167z) {
            return 0;
        }
        return (int) (gVar.f18315m.c() ? -9223372036854775807L : com.fyber.inneractive.sdk.player.exoplayer2.b.a(gVar.f18315m.a(gVar.a(), gVar.f18308f).f18909f));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final String d() {
        return this.A ? "exo_c" : "exo";
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void d(boolean z10) {
        this.f17195n = z10;
        if (this.f17160s == null || this.f17167z) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.f17182a.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f10 = streamVolume / streamMaxVolume;
        IAlog.a(" unmute maxVolume = %d currentVolume = %d targetVolume = %s", Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f10));
        if (streamVolume == 0) {
            IAlog.a("Avoided unmute - Device is muted", new Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = this.f17164w;
        if (aVarArr != null && aVarArr.length >= 2) {
            this.f17160s.a(new com.fyber.inneractive.sdk.player.exoplayer2.e(aVarArr[1], 2, Float.valueOf(f10)));
        }
        this.f17163v = false;
        c(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int e() {
        return this.f17162u;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int f() {
        return this.f17161t;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final boolean g() {
        return this.f17163v;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final boolean h() {
        return (this.f17160s == null || this.f17167z || this.f17186e != com.fyber.inneractive.sdk.player.enums.b.Playing) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void i() {
        com.fyber.inneractive.sdk.player.enums.b bVar;
        com.fyber.inneractive.sdk.player.enums.b bVar2 = this.f17186e;
        if (bVar2 == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar2 == com.fyber.inneractive.sdk.player.enums.b.Completed || bVar2 == (bVar = com.fyber.inneractive.sdk.player.enums.b.Paused) || bVar2 == com.fyber.inneractive.sdk.player.enums.b.Prepared) {
            IAlog.a("%s paused called when player is in mState: %s ignoring", IAlog.a(this), bVar2);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f17160s;
        if (gVar != null && !this.f17167z) {
            gVar.a(false);
        }
        k();
        a(bVar);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void j() {
        IAlog.a("%sstart called", IAlog.a(this));
        if (h()) {
            return;
        }
        a(com.fyber.inneractive.sdk.player.enums.b.Start_in_progress);
        this.f17160s.a(true);
    }
}
