package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f19602a;

    public d(i1 i1Var) {
        this.f19602a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.f19602a;
        if (iVar.f19640k) {
            IAlog.a("No user web action detected for : %s blocking.", iVar.f19641l);
            i iVar2 = this.f19602a;
            String strC = iVar2.f19641l.c();
            String strA = this.f19602a.f19641l.a();
            j1 j1Var = iVar2.f19636g;
            if (j1Var != null) {
                j1Var.a(strC, strA);
            }
            IAlog.d("AD_AUTO_CLICK_DETECTED", new Object[0]);
            this.f19602a.f19641l.b();
            this.f19602a.i();
        } else {
            IAlog.a("User web action detected for: %s", iVar.f19641l);
            this.f19602a.f19641l.d();
        }
        this.f19602a.f19641l = null;
    }
}
