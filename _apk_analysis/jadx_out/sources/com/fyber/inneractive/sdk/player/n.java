package com.fyber.inneractive.sdk.player;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.model.vast.x;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.media.Position;
import com.iab.omid.library.fyber.adsession.media.VastProperties;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends f implements a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final k f18973x = new k();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.model.vast.b f18974p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.enums.a f18975q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f18976r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s0 f18977s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.endcard.k f18978t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.ui.remote.g f18979u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.b f18980v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f18981w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x06cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(android.content.Context r21, com.fyber.inneractive.sdk.response.g r22, com.fyber.inneractive.sdk.config.s0 r23, com.fyber.inneractive.sdk.external.InneractiveAdRequest r24, com.fyber.inneractive.sdk.flow.t0 r25, com.fyber.inneractive.sdk.measurement.e r26) {
        /*
            Method dump skipped, instruction units count: 2018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.n.<init>(android.content.Context, com.fyber.inneractive.sdk.response.g, com.fyber.inneractive.sdk.config.s0, com.fyber.inneractive.sdk.external.InneractiveAdRequest, com.fyber.inneractive.sdk.flow.t0, com.fyber.inneractive.sdk.measurement.e):void");
    }

    public static void a(com.fyber.inneractive.sdk.response.i iVar, x... xVarArr) {
        ArrayList<String> arrayList = new ArrayList();
        for (x xVar : xVarArr) {
            String strA = xVar.a();
            IAlog.a("IAVastMediaPlayerFlowManager: Firing events for type: %s", strA);
            List<String> listA = iVar.a(xVar);
            if (listA == null || listA.size() == 0) {
                IAlog.a("IAVastMediaPlayerFlowManager: no events for type: %s", strA);
            } else {
                arrayList.addAll(listA);
                IAlog.a("found %d events for type: %s", Integer.valueOf(listA.size()), strA);
                for (String str : listA) {
                    IAlog.a("   event url: %s", str);
                    if (!TextUtils.isEmpty(str)) {
                        IAlog.d("%s %s %s", "VAST_EVENT", xVar.a(), str);
                        IAlog.d("Tracking URLs array: %s", "VPAID", str);
                    }
                }
            }
        }
        for (String str2 : arrayList) {
            if (!TextUtils.isEmpty(str2)) {
                z0.b(str2);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.o
    public final void a(int i10) {
        int iC = this.f18912a.c();
        b(i10);
        int i11 = l.f18933b[this.f18975q.ordinal()];
        if (i11 == 1) {
            if (this.f18912a.f17186e != com.fyber.inneractive.sdk.player.enums.b.Buffering) {
                a(com.fyber.inneractive.sdk.player.enums.a.Started);
                com.fyber.inneractive.sdk.measurement.f fVar = this.f18916e;
                if (fVar != null) {
                    if (fVar.f16765b != null && !fVar.f16768e) {
                        IAlog.a("%s impression", "OMVideo");
                        fVar.f16768e = true;
                        try {
                            fVar.f16765b.impressionOccurred();
                        } catch (Throwable th2) {
                            fVar.a(th2);
                        }
                    }
                    com.fyber.inneractive.sdk.measurement.f fVar2 = this.f18916e;
                    long jC = this.f18912a.c();
                    float f10 = this.f18912a.g() ? 0.0f : 1.0f;
                    if (fVar2.f16766c == null || fVar2.f16767d) {
                        return;
                    }
                    fVar2.f16767d = true;
                    IAlog.a("%s start", "OMVideo");
                    try {
                        fVar2.f16766c.start(jC, f10);
                        return;
                    } catch (Throwable th3) {
                        fVar2.a(th3);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i11 == 2) {
            if (i10 > iC / 4) {
                a(com.fyber.inneractive.sdk.player.enums.a.FirstQuarter);
                com.fyber.inneractive.sdk.measurement.f fVar3 = this.f18916e;
                if (fVar3 == null || fVar3.f16766c == null) {
                    return;
                }
                IAlog.a("%s firstQuartile", "OMVideo");
                try {
                    fVar3.f16766c.firstQuartile();
                    return;
                } catch (Throwable th4) {
                    fVar3.a(th4);
                    return;
                }
            }
            return;
        }
        if (i11 == 3) {
            if (i10 > iC / 2) {
                a(com.fyber.inneractive.sdk.player.enums.a.MidPoint);
                com.fyber.inneractive.sdk.measurement.f fVar4 = this.f18916e;
                if (fVar4 == null || fVar4.f16766c == null) {
                    return;
                }
                IAlog.a("%s midpoint", "OMVideo");
                try {
                    fVar4.f16766c.midpoint();
                    return;
                } catch (Throwable th5) {
                    fVar4.a(th5);
                    return;
                }
            }
            return;
        }
        if (i11 == 4 && i10 > (iC / 4) * 3) {
            a(com.fyber.inneractive.sdk.player.enums.a.ThirdPQuarter);
            com.fyber.inneractive.sdk.measurement.f fVar5 = this.f18916e;
            if (fVar5 == null || fVar5.f16766c == null) {
                return;
            }
            IAlog.a("%s thirdQuartile", "OMVideo");
            try {
                fVar5.f16766c.thirdQuartile();
            } catch (Throwable th6) {
                fVar5.a(th6);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.f
    public final void a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject) {
        a(this.f18974p, VideoClickOrigin.InvalidOrigin, x.EVENT_ERROR);
        b(inneractiveVideoError, jSONObject);
        IAlog.f("IAMediaPlayerFlowManager: reporting error to listeners: %s", inneractiveVideoError.getPlayerError().toString());
        q qVar = this.f18923l;
        if (qVar != null) {
            try {
                ((t) qVar).a(inneractiveVideoError, jSONObject, false);
            } catch (Exception e10) {
                if (IAlog.f19500a <= 3) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.a aVar) {
        if (this.f18975q == aVar) {
            return;
        }
        if (aVar == com.fyber.inneractive.sdk.player.enums.a.Started) {
            this.f18976r = false;
            if (this.f18981w.compareAndSet(false, true)) {
                a(this.f18974p, VideoClickOrigin.InvalidOrigin, x.EVENT_IMPRESSION, x.EVENT_START);
            } else {
                IAlog.a("%sreportPlayStartEvents called, but start events was already reported", IAlog.a(this));
            }
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.FirstQuarter) {
            a(this.f18974p, VideoClickOrigin.InvalidOrigin, x.EVENT_FIRSTQ);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.MidPoint) {
            a(this.f18974p, VideoClickOrigin.InvalidOrigin, x.EVENT_MID);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.ThirdPQuarter) {
            a(this.f18974p, VideoClickOrigin.InvalidOrigin, x.EVENT_THIRDQ);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.Completed && !this.f18976r) {
            this.f18976r = true;
            a(this.f18974p, VideoClickOrigin.InvalidOrigin, x.EVENT_COMPLETE);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.Restarted) {
            a(this.f18974p, VideoClickOrigin.InvalidOrigin, x.EVENT_REWIND);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.Progress) {
            a(this.f18974p, VideoClickOrigin.InvalidOrigin, x.EVENT_PROGRESS);
        }
        this.f18975q = aVar;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        boolean zA;
        String str;
        int i10;
        int i11;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.response.e eVar2;
        com.fyber.inneractive.sdk.response.e eVar3;
        s0 s0Var;
        IAlog.a("IAMediaPlayerFlowManager: onPlayerStateChanged with - %s", bVar);
        p pVar = this.f18917f;
        if (pVar != null && bVar != com.fyber.inneractive.sdk.player.enums.b.Prepared) {
            pVar.a(bVar);
        } else if (bVar == com.fyber.inneractive.sdk.player.enums.b.Prepared && pVar != null) {
            pVar.f18986d = true;
        }
        int i12 = d.f17232a[bVar.ordinal()];
        if (i12 == 1) {
            IAlog.a("IAMediaPlayerFlowManager: onPlayerPrepared called", new Object[0]);
            if (this.f18920i) {
                IAlog.a("IMediaPlayerFlowManager: onPlayerPrepared is called, but object is already destroyed?? ignore", new Object[0]);
            } else {
                this.f18919h = true;
                if (this.f18916e != null && this.f18913b != null && (s0Var = this.f18977s) != null) {
                    int iIntValue = ((r0) s0Var).f16098f.f16156h.value().intValue();
                    boolean zA2 = f.a(this.f18912a.c(), ((com.fyber.inneractive.sdk.response.g) this.f18913b.f16696b).f19405y, this.f18977s);
                    boolean zBooleanValue = ((r0) this.f18977s).f16098f.f16149a.booleanValue();
                    com.fyber.inneractive.sdk.measurement.f fVar = this.f18916e;
                    if (!zA2) {
                        iIntValue = 0;
                    }
                    if (fVar.f16765b != null) {
                        try {
                            fVar.f16765b.loaded(zA2 ? VastProperties.createVastPropertiesForSkippableMedia(iIntValue, zBooleanValue, Position.STANDALONE) : VastProperties.createVastPropertiesForNonSkippableMedia(zBooleanValue, Position.STANDALONE));
                        } catch (Throwable th2) {
                            fVar.a(th2);
                        }
                    }
                }
                if (this.f18923l != null) {
                    t0 t0Var = this.f18913b;
                    if (t0Var == null || (eVar3 = t0Var.f16696b) == null) {
                        zA = false;
                    } else {
                        zA = f.a(this.f18912a.c(), eVar3.f19405y, this.f18977s);
                        eVar3.f19400t.setVideo(new ImpressionData.Video(zA, (int) TimeUnit.MILLISECONDS.toSeconds(this.f18912a.c())));
                    }
                    try {
                        t0 t0Var2 = this.f18913b;
                        com.fyber.inneractive.sdk.response.g gVar = t0Var2 != null ? (com.fyber.inneractive.sdk.response.g) t0Var2.f16696b : null;
                        u uVar = u.EVENT_READY_ON_CLIENT;
                        InneractiveAdRequest inneractiveAdRequest = this.f18914c;
                        t0 t0Var3 = this.f18913b;
                        JSONArray jSONArrayB = t0Var3 == null ? null : t0Var3.f16697c.b();
                        w wVar = new w(gVar);
                        wVar.f17078c = uVar;
                        wVar.f17076a = inneractiveAdRequest;
                        wVar.f17079d = jSONArrayB;
                        if (this.f18925n != null && gVar != null) {
                            IAlog.a("Video content loader: Vast load took: " + (System.currentTimeMillis() - gVar.N) + " msec", new Object[0]);
                            t0 t0Var4 = this.f18913b;
                            if (t0Var4 == null || (eVar2 = t0Var4.f16696b) == null || ((com.fyber.inneractive.sdk.response.g) eVar2).O == null) {
                                str = "";
                                i10 = 0;
                                i11 = 0;
                            } else {
                                i10 = ((com.fyber.inneractive.sdk.response.g) eVar2).O.f16829i;
                                i11 = ((com.fyber.inneractive.sdk.response.g) eVar2).O.f16830j;
                                str = ((com.fyber.inneractive.sdk.response.g) eVar2).O.f16821a;
                            }
                            String str2 = "0";
                            if (t0Var4 != null && (eVar = t0Var4.f16696b) != null && !TextUtils.isEmpty(((com.fyber.inneractive.sdk.response.g) eVar).E)) {
                                str2 = ((com.fyber.inneractive.sdk.response.g) this.f18913b.f16696b).E;
                            }
                            com.fyber.inneractive.sdk.network.x xVar = new com.fyber.inneractive.sdk.network.x();
                            xVar.a(Integer.valueOf(this.f18912a.c() / 1000), "duration").a(this.f18925n.f16892g, "url").a(this.f18925n.f16890e, VastAttributes.BITRATE).a(TextUtils.isEmpty(this.f18925n.f16889d) ? "na" : this.f18925n.f16889d, "mime").a(this.f18925n.f16886a, "delivery").a(Long.valueOf(System.currentTimeMillis() - gVar.N), "load_time").a(Integer.valueOf(this.f18922k), "media_file_index").a(this.f18912a.d(), "player").a(Boolean.valueOf(zA), "is_video_skippable").a(Integer.valueOf(i10), "supported_media_files").a(Integer.valueOf(i11), "total_media_files").a(str, "vast_version");
                            if (str2 != null && str2.equals("1")) {
                                xVar.a(str2, "hide_endcard");
                            }
                            wVar.f17081f.put(xVar.f17083a);
                        }
                        wVar.a((String) null);
                    } catch (Exception unused) {
                    }
                    t tVar = (t) this.f18923l;
                    if (!tVar.f18994g) {
                        tVar.f18994g = true;
                        s sVar = tVar.f18991d;
                        if (sVar != null) {
                            sVar.c();
                        }
                    }
                }
            }
        } else if (i12 == 2) {
            IAlog.a("IAMediaPlayerFlowManager: onPlayerBuffering", new Object[0]);
        } else if (i12 == 3) {
            this.f18912a.b();
        }
        int i13 = l.f18932a[bVar.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                if (this.f18975q.equals(com.fyber.inneractive.sdk.player.enums.a.Completed)) {
                    a(com.fyber.inneractive.sdk.player.enums.a.Restarted);
                    return;
                }
                return;
            } else {
                if (i13 != 3) {
                    return;
                }
                b(this.f18912a.c());
                a(com.fyber.inneractive.sdk.player.enums.a.Completed);
                return;
            }
        }
        com.fyber.inneractive.sdk.model.vast.b bVar2 = this.f18974p;
        if (bVar2 == null || bVar2.f16833m.size() == 0) {
            return;
        }
        int iC = this.f18912a.c();
        for (com.fyber.inneractive.sdk.model.vast.e eVar4 : this.f18974p.f16833m) {
            int i14 = -1;
            if (eVar4.f16848c == -1) {
                if (!TextUtils.isEmpty(eVar4.f16847b)) {
                    String str3 = eVar4.f16847b;
                    i14 = Integer.parseInt(str3.substring(0, str3.length() - 1));
                }
                eVar4.f16848c = (i14 * iC) / 100;
            }
        }
        Collections.sort(this.f18974p.f16833m, new com.fyber.inneractive.sdk.model.vast.d());
    }

    @Override // com.fyber.inneractive.sdk.player.f
    public final void a(com.fyber.inneractive.sdk.response.i iVar, VideoClickOrigin videoClickOrigin, x... xVarArr) {
        if (xVarArr.length == 0) {
            IAlog.f("IAVastMediaPlayerFlowManager: eventTypes array is empty", new Object[0]);
            return;
        }
        if (iVar == null) {
            IAlog.f("IAVastMediaPlayerFlowManager: parser is null", new Object[0]);
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (x xVar : xVarArr) {
            String strA = xVar.a();
            IAlog.a("IAVastMediaPlayerFlowManager: Firing events for type: %s", strA);
            List<String> listA = iVar.a(xVar);
            if (listA == null || listA.isEmpty()) {
                IAlog.a("IAVastMediaPlayerFlowManager: no events for type: %s", strA);
            } else {
                arrayList.addAll(listA);
                IAlog.a("found %d events for type: %s, url: %s", Integer.valueOf(listA.size()), strA, listA.get(0));
                for (String str : listA) {
                    IAlog.a("   event url: %s", str);
                    if (!TextUtils.isEmpty(str)) {
                        IAlog.d("%s %s %s", "VAST_EVENT", xVar.a(), str);
                        IAlog.d("Tracking URLs array: %s", "VPAID", str);
                    }
                }
            }
            if (xVar == x.EVENT_CLICK) {
                for (Map.Entry entry : f18973x.entrySet()) {
                    String str2 = (String) entry.getKey();
                    String strA2 = ((m) entry.getValue()).a(this.f18912a, videoClickOrigin);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        String str3 = (String) arrayList.get(i10);
                        if (str3.contains(str2)) {
                            arrayList.set(i10, str3.replace(str2, strA2));
                        }
                    }
                }
            }
        }
        for (String str4 : arrayList) {
            if (!TextUtils.isEmpty(str4)) {
                z0.b(str4);
            }
        }
    }

    public final void b(int i10) {
        com.fyber.inneractive.sdk.model.vast.b bVar = this.f18974p;
        if (bVar == null || bVar.f16833m.isEmpty()) {
            return;
        }
        while (this.f18974p.f16833m.size() > 0 && i10 >= ((com.fyber.inneractive.sdk.model.vast.e) this.f18974p.f16833m.get(0)).f16848c) {
            com.fyber.inneractive.sdk.model.vast.e eVar = (com.fyber.inneractive.sdk.model.vast.e) this.f18974p.f16833m.get(0);
            String str = eVar.f16846a;
            if (!TextUtils.isEmpty(str)) {
                IAlog.a("IAVastMediaPlayerFlowManager: Firing event for type: progress", new Object[0]);
                z0.b(str);
            }
            this.f18974p.f16833m.remove(eVar);
        }
    }

    public final void b(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject) {
        try {
            if (this.f18925n != null && inneractiveVideoError.getPlayerError() != InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES) {
                jSONObject.put("url", this.f18925n.f16892g);
                jSONObject.put(VastAttributes.BITRATE, this.f18925n.f16890e);
                jSONObject.put("mime", this.f18925n.f16889d);
                jSONObject.put("delivery", this.f18925n.f16886a);
            }
            com.fyber.inneractive.sdk.player.controller.q qVar = this.f18912a;
            jSONObject.put("player", qVar != null ? qVar.d() : "");
            if (inneractiveVideoError.getCause() != null) {
                jSONObject.put("exception", inneractiveVideoError.getCause().getClass().getName());
                jSONObject.put("message", inneractiveVideoError.getCause().getMessage() == null ? "empty" : inneractiveVideoError.getCause().getMessage());
            }
        } catch (Exception unused) {
            IAlog.a("onReportError: Failed creating Json object from media file!", new Object[0]);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void d() {
    }
}
