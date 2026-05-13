package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2259Xm extends LinearLayout {
    public static int A00 = (int) (AbstractC2232Wl.A02 * 56.0f);
    public static int A01 = (int) (AbstractC2232Wl.A02 * 56.0f);

    public AbstractC2259Xm(Context context) {
        super(context);
    }

    public abstract void A06();

    public abstract void A07();

    public abstract void A08();

    public abstract void A09(float f10, int i10);

    public abstract void A0A(C1992My c1992My, boolean z10);

    public abstract boolean A0B();

    public abstract int getToolbarActionMode();

    public abstract int getToolbarHeight();

    public abstract InterfaceC2258Xl getToolbarListener();

    public abstract void setAdReportingVisible(boolean z10);

    public abstract void setCTAClickListener(View.OnClickListener onClickListener);

    public abstract void setCTAClickListener(KE ke2);

    public abstract void setFullscreen(boolean z10);

    public abstract void setPageDetails(N9 n92, String str, int i10, NF nf2);

    public abstract void setPageDetailsVisible(boolean z10);

    public abstract void setProgress(float f10);

    public abstract void setProgressClickListener(View.OnClickListener onClickListener);

    public abstract void setProgressImage(XX xx);

    public abstract void setProgressImmediate(float f10);

    public abstract void setProgressSpinnerInvisible(boolean z10);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(int i10);

    public abstract void setToolbarListener(InterfaceC2258Xl interfaceC2258Xl);
}
