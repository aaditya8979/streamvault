package com.fyber.inneractive.sdk.web;

import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f19687a;

    public o(i0 i0Var) {
        this.f19687a = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/o;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.g.f53142p, view);
        safedk_o_onClick_c06d7a4dcd7b0368031f607e07fcfe21(view);
    }

    public void safedk_o_onClick_c06d7a4dcd7b0368031f607e07fcfe21(View view) {
        this.f19687a.o();
    }
}
