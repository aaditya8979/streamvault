package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class P1 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ InterfaceC2031On A00;
    public final /* synthetic */ C0B A01;

    public P1(C0B c0b, InterfaceC2031On interfaceC2031On) {
        this.A01 = c0b;
        this.A00 = interfaceC2031On;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return (WindowInsets) PK.A01(this.A00.ACL(view, PK.A00(windowInsets)));
    }
}
