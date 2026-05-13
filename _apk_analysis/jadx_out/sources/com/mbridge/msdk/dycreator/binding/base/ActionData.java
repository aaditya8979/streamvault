package com.mbridge.msdk.dycreator.binding.base;

import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.viewdata.base.a;

/* JADX INFO: loaded from: classes9.dex */
public class ActionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f37119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EAction f37120b;

    public a getBaseViewData() {
        return this.f37119a;
    }

    public EAction geteAction() {
        return this.f37120b;
    }

    public void setBaseViewData(a aVar) {
        this.f37119a = aVar;
    }

    public void seteAction(EAction eAction) {
        this.f37120b = eAction;
    }
}
