package com.fyber.inneractive.sdk.player.ui.remote;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.player.ui.n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.r;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements com.fyber.inneractive.sdk.web.remoteui.a, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.web.remoteui.a f19039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.web.remoteui.b f19040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f19041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f19042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f19043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f19044f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19047i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.g f19048j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19045g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f19046h = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f19049k = new b(this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f19050l = new c(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f19051m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f19052n = false;

    public d(Context context, t0 t0Var, String str) {
        this.f19041c = t0Var;
        this.f19044f = str;
        com.fyber.inneractive.sdk.web.remoteui.b bVar = new com.fyber.inneractive.sdk.web.remoteui.b();
        this.f19040b = bVar;
        this.f19042d = new e(this);
        bVar.setCommandHandler(this);
        bVar.setResultFailureListener(this);
        bVar.setCommandHandler(this);
        this.f19048j = new com.fyber.inneractive.sdk.flow.g(context, true, t0Var != null ? t0Var.f16695a : null, b(), null);
    }

    public final void a() {
        this.f19046h = true;
        this.f19043e = null;
        e eVar = this.f19042d;
        eVar.f19054b.clear();
        eVar.f19053a = null;
        IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
        r.f19556b.removeCallbacks(this.f19049k);
        this.f19040b.setVisibility(8);
        this.f19040b.setUiReady(false);
        this.f19040b.destroy();
        this.f19048j = null;
    }

    @Override // com.fyber.inneractive.sdk.web.remoteui.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, boolean z10, HashMap map) {
        IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
        r.f19556b.removeCallbacks(this.f19049k);
        String str2 = (map == null || !map.containsKey("failedURL")) ? this.f19044f : (String) map.get("failedURL");
        if (z10) {
            if (b() != null) {
                b().L = false;
            }
            a();
            t tVar = t.VAST_ERROR_DVC_FAILURE;
            t0 t0Var = this.f19041c;
            com.fyber.inneractive.sdk.network.events.a.a(tVar, bVar, t0Var != null ? t0Var.f16695a : null, b(), str, str2, Boolean.valueOf(this.f19047i));
        } else {
            t tVar2 = t.VAST_ERROR_DVC_FAILURE;
            String strName = bVar.name();
            t0 t0Var2 = this.f19041c;
            com.fyber.inneractive.sdk.network.events.a.a(tVar2, strName, str2, t0Var2 != null ? t0Var2.f16695a : null, b(), map, Boolean.valueOf(this.f19047i));
        }
        com.fyber.inneractive.sdk.web.remoteui.a aVar = this.f19039a;
        if (aVar != null) {
            aVar.a(bVar, str, z10, map);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.remote.a
    public final void a(String str, HashMap map) {
        g1 lastClickedLocation;
        e eVar;
        d dVar;
        com.fyber.inneractive.sdk.flow.g gVar;
        lastClickedLocation = this.f19040b.getLastClickedLocation();
        eVar = this.f19042d;
        eVar.getClass();
        str.getClass();
        switch (str) {
            case "clickSkip":
                eVar.a(6, lastClickedLocation);
                break;
            case "expandCollapseClick":
                eVar.a(5, lastClickedLocation);
                break;
            case "appInfoClick":
                eVar.a(10, lastClickedLocation);
                break;
            case "shouldSkipUpdateUi.true":
                d dVar2 = eVar.f19053a;
                if (dVar2 != null) {
                    dVar2.f19051m = true;
                    break;
                }
                break;
            case "onGeneralError":
                d dVar3 = eVar.f19053a;
                if (dVar3 != null) {
                    dVar3.a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_GENERAL_ERROR, (String) map.get("error"), "true".equalsIgnoreCase((String) map.get("shouldFailUi")), map);
                    break;
                }
                break;
            case "ctaClick":
                eVar.a(3, lastClickedLocation);
                break;
            case "isSkipEnabled.false":
                d dVar4 = eVar.f19053a;
                if (dVar4 != null) {
                    dVar4.f19052n = false;
                    break;
                }
                break;
            case "clickMuteUnmute":
                eVar.a(1, lastClickedLocation);
                break;
            case "DOMLoaded":
                String str2 = eVar.f19055c ? "FyberRemoteUiBridge.setMute()" : "FyberRemoteUiBridge.setUnmute()";
                d dVar5 = eVar.f19053a;
                if (dVar5 != null) {
                    dVar5.f19040b.a(str2);
                }
                Iterator it = eVar.f19054b.keySet().iterator();
                while (it.hasNext()) {
                    String str3 = (String) eVar.f19054b.get((String) it.next());
                    if (!TextUtils.isEmpty(str3) && (dVar = eVar.f19053a) != null) {
                        dVar.f19040b.a(str3);
                    }
                }
                eVar.f19054b.clear();
                d dVar6 = eVar.f19053a;
                if (dVar6 != null) {
                    IAlog.a("%s : remote UI loaded successfully", "RemoteUIWebviewController");
                    IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
                    r.f19556b.removeCallbacks(dVar6.f19049k);
                    dVar6.f19045g = false;
                    dVar6.f19040b.setUiReady(true);
                    if (dVar6.b() != null) {
                        dVar6.b().L = true;
                    }
                    dVar6.f19040b.setVisibility(0);
                    break;
                }
                break;
            case "adIdentifierClick":
                d dVar7 = eVar.f19053a;
                if (dVar7 != null && (gVar = dVar7.f19048j) != null) {
                    gVar.a();
                    break;
                }
                break;
            case "shouldSkipUpdateUi.false":
                d dVar8 = eVar.f19053a;
                if (dVar8 != null) {
                    dVar8.f19051m = false;
                    break;
                }
                break;
            case "isSkipEnabled.true":
                d dVar9 = eVar.f19053a;
                if (dVar9 != null) {
                    dVar9.f19052n = true;
                    break;
                }
                break;
            case "onVideoClick":
                eVar.a(7, lastClickedLocation);
                break;
            case "onResourceError":
                d dVar10 = eVar.f19053a;
                if (dVar10 != null) {
                    dVar10.a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_RESOURCE_ERROR, (String) map.get("error"), true, map);
                    break;
                }
                break;
            default:
                IAlog.a("%s: unknown command: %s", "RemoteUiCommandHandler", str);
                break;
        }
        d dVar11 = eVar.f19053a;
        if (dVar11 != null) {
            dVar11.f19040b.a("FyberRemoteUiBridge.nativeCallComplete()");
        }
    }

    public final com.fyber.inneractive.sdk.response.e b() {
        t0 t0Var = this.f19041c;
        if (t0Var != null) {
            return t0Var.f16696b;
        }
        return null;
    }
}
