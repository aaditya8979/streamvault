package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;

/* JADX INFO: loaded from: classes11.dex */
public final class t implements com.fyber.inneractive.sdk.network.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f16642a;

    public t(u uVar) {
        this.f16642a = uVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        String str = (String) obj;
        IAlog.a("IAVideoContentLoader : Remote ui template callback onNetworkResult from cache: %s", Boolean.valueOf(z10));
        if (exc instanceof com.fyber.inneractive.sdk.network.g) {
            return;
        }
        u uVar = this.f16642a;
        uVar.getClass();
        if (TextUtils.isEmpty(str) && z10) {
            uVar.a(exc, "Fetched cached template is ".concat(str == null ? "null" : "empty"), true);
            return;
        }
        com.fyber.inneractive.sdk.player.ui.remote.g gVarJ = uVar.j();
        if (gVarJ == null) {
            uVar.a(null, "Flow Manager is null", z10);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            boolean z11 = gVarJ.f19068a.f19047i;
            StringBuilder sb2 = new StringBuilder("Unknown error while receiving template: templateContent is: ");
            sb2.append(TextUtils.isEmpty(str) ? "null or empty" : "not null and not empty");
            sb2.append(" isFromCache: ");
            sb2.append(z11);
            uVar.a(exc, sb2.toString(), z11);
            return;
        }
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = gVarJ.f19068a;
        dVar.f19047i = z10;
        IAlog.a("%s : schedule UI load timeout task with delay: %d", "RemoteUIWebviewController", 10000);
        com.fyber.inneractive.sdk.util.r.f19556b.postDelayed(dVar.f19049k, 10000);
        try {
            DTExchangeNetworkBridge.webviewLoadData(dVar.f19040b, str, "text/html", "UTF-8");
        } catch (Throwable th2) {
            IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
            com.fyber.inneractive.sdk.util.r.f19556b.removeCallbacks(dVar.f19049k);
            dVar.a(com.fyber.inneractive.sdk.network.events.b.WEB_VIEW_CRASH_ERROR, "Unable load data: " + th2.getMessage(), true, null);
        }
    }
}
