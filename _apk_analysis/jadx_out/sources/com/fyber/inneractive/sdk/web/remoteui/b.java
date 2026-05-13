package com.fyber.inneractive.sdk.web.remoteui;

import android.view.MotionEvent;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.m;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends m implements a, com.fyber.inneractive.sdk.player.ui.remote.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f19698h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.remote.a f19699i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f19700j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f19701k;

    public b() {
        c cVar = new c(this, this);
        this.f19701k = cVar;
        setWebViewClient(cVar);
        getSettings().setJavaScriptEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
        setBackgroundColor(0);
    }

    @Override // com.fyber.inneractive.sdk.web.remoteui.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, boolean z10, HashMap map) {
        this.f19700j = false;
        a aVar = this.f19698h;
        if (aVar != null) {
            aVar.a(bVar, str, z10, map);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.remote.a
    public final void a(String str, HashMap map) {
        com.fyber.inneractive.sdk.player.ui.remote.a aVar = this.f19699i;
        if (aVar != null) {
            aVar.a(str, map);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.m, android.webkit.WebView
    public final void destroy() {
        this.f19698h = null;
        this.f19699i = null;
        c cVar = this.f19701k;
        cVar.getClass();
        IAlog.a("%s: destroy()", "RemoteUiWebViewClient");
        cVar.f19703b = null;
        cVar.f19702a = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.web.m, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53142p, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.fyber.inneractive.sdk.web.m, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setCommandHandler(com.fyber.inneractive.sdk.player.ui.remote.a aVar) {
        this.f19699i = aVar;
    }

    public void setResultFailureListener(a aVar) {
        this.f19698h = aVar;
    }

    public void setUiReady(boolean z10) {
        this.f19700j = z10;
    }
}
