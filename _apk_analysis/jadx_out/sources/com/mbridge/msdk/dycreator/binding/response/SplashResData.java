package com.mbridge.msdk.dycreator.binding.response;

import com.mbridge.msdk.dycreator.binding.response.base.BaseRespData;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.viewdata.base.a;

/* JADX INFO: loaded from: classes7.dex */
public class SplashResData extends BaseRespData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f37122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EAction f37123b;

    public a getBaseViewData() {
        return this.f37122a;
    }

    public EAction geteAction() {
        return this.f37123b;
    }

    public void setBaseViewData(a aVar) {
        this.f37122a = aVar;
    }

    public void seteAction(EAction eAction) {
        this.f37123b = eAction;
    }
}
