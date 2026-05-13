package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f17154a;

    public d0(f0 f0Var) {
        this.f17154a = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/player/controller/d0;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.g.f53142p, view);
        safedk_d0_onClick_551b6fca0ffcd85e1039d424c1c59acc(view);
    }

    public void safedk_d0_onClick_551b6fca0ffcd85e1039d424c1c59acc(View view) {
        this.f17154a.f17169b.dismiss();
        v vVar = this.f17154a.f17168a;
        vVar.f17202b.d(vVar.f17201a);
    }
}
