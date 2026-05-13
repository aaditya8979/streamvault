package com.fyber.inneractive.sdk.player;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.model.vast.x;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f implements com.fyber.inneractive.sdk.player.controller.p, com.fyber.inneractive.sdk.player.controller.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.controller.q f18912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t0 f18913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InneractiveAdRequest f18914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.measurement.e f18915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.measurement.f f18916e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public q f18923l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f18924m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public com.fyber.inneractive.sdk.model.vast.r f18925n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p f18917f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18918g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18919h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f18920i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18921j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18922k = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f18926o = new c(this);

    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(android.content.Context r5, com.fyber.inneractive.sdk.config.global.r r6) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.f18917f = r0
            r1 = 1
            r4.f18918g = r1
            r1 = 0
            r4.f18919h = r1
            r4.f18920i = r1
            r4.f18921j = r1
            r4.f18922k = r1
            com.fyber.inneractive.sdk.player.c r2 = new com.fyber.inneractive.sdk.player.c
            r2.<init>(r4)
            r4.f18926o = r2
            if (r6 == 0) goto L32
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.u> r2 = com.fyber.inneractive.sdk.config.global.features.u.class
            com.fyber.inneractive.sdk.config.global.features.h r2 = r6.a(r2)     // Catch: java.lang.Throwable -> L30
            com.fyber.inneractive.sdk.config.global.features.u r2 = (com.fyber.inneractive.sdk.config.global.features.u) r2     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "use_fmp_cache_mechanism"
            java.lang.Boolean r2 = r2.c(r3)     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L32
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L30
            goto L33
        L30:
            r6 = move-exception
            goto L3a
        L32:
            r2 = r1
        L33:
            com.fyber.inneractive.sdk.player.controller.f r3 = new com.fyber.inneractive.sdk.player.controller.f     // Catch: java.lang.Throwable -> L30
            r3.<init>(r5, r2, r6)     // Catch: java.lang.Throwable -> L30
            r0 = r3
            goto L49
        L3a:
            int r2 = com.fyber.inneractive.sdk.util.IAlog.f19500a
            r3 = 3
            if (r2 > r3) goto L49
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Failed creating exo player"
            com.fyber.inneractive.sdk.util.IAlog.a(r2, r1)
            r6.printStackTrace()
        L49:
            if (r0 != 0) goto L50
            com.fyber.inneractive.sdk.player.controller.a r0 = new com.fyber.inneractive.sdk.player.controller.a
            r0.<init>(r5)
        L50:
            r4.f18912a = r0
            java.util.concurrent.CopyOnWriteArrayList r5 = r0.f17183b
            boolean r5 = r5.contains(r4)
            if (r5 != 0) goto L5f
            java.util.concurrent.CopyOnWriteArrayList r5 = r0.f17183b
            r5.add(r4)
        L5f:
            com.fyber.inneractive.sdk.player.controller.q r5 = r4.f18912a
            java.util.concurrent.CopyOnWriteArrayList r6 = r5.f17184c
            boolean r6 = r6.contains(r4)
            if (r6 != 0) goto L6e
            java.util.concurrent.CopyOnWriteArrayList r5 = r5.f17184c
            r5.add(r4)
        L6e:
            com.fyber.inneractive.sdk.player.controller.q r5 = r4.f18912a
            com.fyber.inneractive.sdk.player.c r6 = r4.f18926o
            r5.f17187f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.f.<init>(android.content.Context, com.fyber.inneractive.sdk.config.global.r):void");
    }

    public static int a(f fVar) {
        com.fyber.inneractive.sdk.response.e eVar;
        t0 t0Var = fVar.f18913b;
        if (t0Var == null || (eVar = t0Var.f16696b) == null) {
            return -1;
        }
        return ((com.fyber.inneractive.sdk.response.g) eVar).f19405y;
    }

    public static boolean a(int i10, int i11, s0 s0Var) {
        if (i11 == 1 || InneractiveAdManager.isCurrentUserAChild()) {
            return true;
        }
        if (i10 <= 15999) {
            return false;
        }
        com.fyber.inneractive.sdk.config.t0 t0Var = s0Var != null ? ((r0) s0Var).f16098f : null;
        return (t0Var == null || t0Var.f16156h == Skip.DEFAULT || t0Var.f16158j == UnitDisplayType.REWARDED) ? false : true;
    }

    public static boolean a(com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.ignite.m mVar) {
        mVar.getClass();
        if (mVar == com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP && IAConfigManager.O.E.n() && rVar != null && rVar.a(com.fyber.inneractive.sdk.config.global.features.n.class) != null) {
            Boolean boolC = ((com.fyber.inneractive.sdk.config.global.features.n) rVar.a(com.fyber.inneractive.sdk.config.global.features.n.class)).c("enable_app_info_button");
            if (boolC != null ? boolC.booleanValue() : true) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        com.fyber.inneractive.sdk.measurement.f fVar = this.f18916e;
        if (fVar != null) {
            if (fVar.f16764a != null) {
                IAlog.a("%s destroy", "OMVideo");
                try {
                    fVar.f16764a.finish();
                } catch (Throwable th2) {
                    fVar.a(th2);
                }
            }
            fVar.f16765b = null;
            fVar.f16764a = null;
            fVar.f16766c = null;
        }
    }

    public abstract void a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject);

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.mediaplayer.o oVar) {
        IAlog.a("IMediaPlayerFlowManager: onPlayerError called with: %s", oVar.getMessage());
        a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE, oVar), new JSONObject());
        if (this.f18919h) {
            IAlog.a("IMediaPlayerFlowManager: onPlayerError video was prepared. This is a critical error. Aborting!", new Object[0]);
            a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES, oVar), new JSONObject());
        }
    }

    public abstract void a(com.fyber.inneractive.sdk.response.i iVar, VideoClickOrigin videoClickOrigin, x... xVarArr);

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void c(boolean z10) {
        try {
            t0 t0Var = this.f18913b;
            com.fyber.inneractive.sdk.response.g gVar = t0Var != null ? (com.fyber.inneractive.sdk.response.g) t0Var.f16696b : null;
            u uVar = u.VAST_MEDIA_LOAD_RETRY_ATTEMPTED;
            InneractiveAdRequest inneractiveAdRequest = this.f18914c;
            t0 t0Var2 = this.f18913b;
            JSONArray jSONArrayB = t0Var2 == null ? null : t0Var2.f16697c.b();
            w wVar = new w(gVar);
            wVar.f17078c = uVar;
            wVar.f17076a = inneractiveAdRequest;
            wVar.f17079d = jSONArrayB;
            if (this.f18925n != null && gVar != null) {
                wVar.f17081f.put(new com.fyber.inneractive.sdk.network.x().a(String.valueOf(z10), "waudio").a(this.f18925n.f16892g, "url").a(this.f18925n.f16890e, VastAttributes.BITRATE).a(TextUtils.isEmpty(this.f18925n.f16889d) ? "na" : this.f18925n.f16889d, "mime").a(this.f18925n.f16886a, "delivery").a(Integer.valueOf(this.f18922k), "media_file_index").a(this.f18912a.d(), "player").f17083a);
            }
            wVar.a((String) null);
        } catch (Exception unused) {
        }
    }
}
