package com.mbridge.msdk.video.signal.impl;

import android.content.res.Configuration;
import android.util.Base64;
import android.webkit.WebView;
import com.ironsource.C3978d4;
import org.json.JSONObject;

/* JADX INFO: compiled from: JSActivityProxy.java */
/* JADX INFO: loaded from: classes2.dex */
public class i extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f42240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42241b = 0;

    public i(WebView webView) {
        this.f42240a = webView;
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public int a() {
        return this.f42241b;
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void a(int i10) {
        super.a(i10);
        this.f42241b = i10;
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void a(Configuration configuration) {
        super.a(configuration);
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", C3978d4.i.C);
            } else {
                jSONObject.put("orientation", C3978d4.i.D);
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f42240a, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void b() {
        super.b();
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f42240a, "onSystemDestory", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void d() {
        super.d();
        this.f42241b = 0;
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f42240a, "onSystemResume", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void e() {
        super.e();
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f42240a, "onSystemBackPressed", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void g() {
        super.g();
        this.f42241b = 1;
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f42240a, "onSystemPause", "");
    }
}
