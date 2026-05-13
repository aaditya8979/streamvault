package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class e0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f17156a;

    public e0(f0 f0Var) {
        this.f17156a = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/player/controller/e0;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.g.f53142p, view);
        safedk_e0_onClick_4d93ab782816bfab8a321d1b641091a8(view);
    }

    public void safedk_e0_onClick_4d93ab782816bfab8a321d1b641091a8(View view) {
        this.f17156a.f17169b.dismiss();
        this.f17156a.f17168a.getClass();
    }
}
