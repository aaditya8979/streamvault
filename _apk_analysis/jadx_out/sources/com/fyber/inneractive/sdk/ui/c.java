package com.fyber.inneractive.sdk.ui;

import android.view.View;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FyberAdIdentifierLocal f19489a;

    public c(FyberAdIdentifierLocal fyberAdIdentifierLocal) {
        this.f19489a = fyberAdIdentifierLocal;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f19489a.f19467q = this.f19489a.f19464n.getWidth() + r1.f19464n.getWidth();
        FyberAdIdentifierLocal fyberAdIdentifierLocal = this.f19489a;
        IFyberAdIdentifier.Corner corner = fyberAdIdentifierLocal.f19485k;
        if (corner == IFyberAdIdentifier.Corner.TOP_LEFT || corner == IFyberAdIdentifier.Corner.BOTTOM_LEFT) {
            fyberAdIdentifierLocal.f19467q *= -1.0f;
        }
        fyberAdIdentifierLocal.f19464n.setTranslationX(fyberAdIdentifierLocal.f19467q);
        FyberAdIdentifierLocal fyberAdIdentifierLocal2 = this.f19489a;
        if (fyberAdIdentifierLocal2.f19465o) {
            fyberAdIdentifierLocal2.a();
        }
    }
}
