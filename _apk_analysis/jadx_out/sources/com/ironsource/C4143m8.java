package com.ironsource;

import android.webkit.JavascriptInterface;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: renamed from: com.ironsource.m8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4143m8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C4199p8 f32292a;

    public C4143m8(C4199p8 c4199p8) {
        this.f32292a = c4199p8;
    }

    @JavascriptInterface
    public void receiveMessageFromExternal(String str) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/m8;->receiveMessageFromExternal(Ljava/lang/String;)V");
        CreativeInfoManager.onReceiveMessageFromExternal(com.safedk.android.utils.g.f53132f, this, str);
        safedk_m8_receiveMessageFromExternal_f6df2e67e8e3a157bd953b642618ebc9(str);
    }

    @JavascriptInterface
    public void safedk_m8_receiveMessageFromExternal_f6df2e67e8e3a157bd953b642618ebc9(String str) {
        this.f32292a.handleMessageFromAd(str);
    }
}
