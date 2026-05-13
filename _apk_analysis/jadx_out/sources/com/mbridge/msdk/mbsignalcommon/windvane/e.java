package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import com.mbridge.msdk.interstitial.signalcommon.interstitial;
import com.mbridge.msdk.mbsignalcommon.communication.BannerSignalPlugin;
import com.mbridge.msdk.mbsignalcommon.mraid.MraidSignalCommunication;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebGLCheckSignal;
import com.mbridge.msdk.splash.signal.SplashSignal;
import com.mbridge.msdk.video.signal.communication.RewardSignal;
import com.mbridge.msdk.video.signal.communication.VideoCommunication;
import java.util.HashMap;

/* JADX INFO: compiled from: WindVaneApiManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static HashMap<String, Class> f38931d = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f38932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f38933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WindVaneWebView f38934c;

    public e(Context context, WindVaneWebView windVaneWebView) {
        this.f38932a = context;
        this.f38934c = windVaneWebView;
        a();
    }

    private Object a(String str, WindVaneWebView windVaneWebView, Context context) {
        Class cls = f38931d.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!g.class.isAssignableFrom(cls)) {
                return null;
            }
            g gVar = (g) cls.newInstance();
            gVar.initialize(context, windVaneWebView);
            gVar.initialize(this.f38933b, windVaneWebView);
            return gVar;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public Object a(String str) {
        if (f38931d == null) {
            f38931d = new HashMap<>();
        }
        return a(str, this.f38934c, this.f38932a);
    }

    public void a() {
        try {
            int i10 = interstitial.f38316i;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f38804a, interstitial.class);
        } catch (ClassNotFoundException unused) {
        }
        try {
            int i11 = RewardSignal.f41909i;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f38805b, RewardSignal.class);
        } catch (ClassNotFoundException unused2) {
        }
        try {
            int i12 = VideoCommunication.f41935j;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f38806c, VideoCommunication.class);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            int i13 = MraidSignalCommunication.f38875h;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f38808e, MraidSignalCommunication.class);
        } catch (ClassNotFoundException unused4) {
        }
        try {
            int i14 = BannerSignalPlugin.f38863i;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f38809f, BannerSignalPlugin.class);
        } catch (ClassNotFoundException unused5) {
        }
        try {
            int i15 = SplashSignal.f39989i;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f38810g, SplashSignal.class);
        } catch (ClassNotFoundException unused6) {
        }
        try {
            int i16 = WebGLCheckSignal.f38887g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f38811h, WebGLCheckSignal.class);
        } catch (ClassNotFoundException unused7) {
        }
        try {
            if (com.mbridge.msdk.util.b.a()) {
                Class<?> cls = Class.forName("com.mbridge.msdk.mbsignalcommon.confirmation.bridge.ConfirmationJsBridgePlugin");
                a(cls.getSimpleName(), cls);
            }
        } catch (Exception unused8) {
        }
    }

    public void a(Context context) {
        this.f38932a = context;
    }

    public void a(Object obj) {
        this.f38933b = obj;
    }

    public void a(String str, Class cls) {
        if (f38931d == null) {
            f38931d = new HashMap<>();
        }
        f38931d.put(str, cls);
    }
}
