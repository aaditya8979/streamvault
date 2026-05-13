package com.mbridge.msdk.dycreator.bridge;

import com.mbridge.msdk.dycreator.viewdata.base.a;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes12.dex */
public class MBSplashData implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DyOption f37124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f37126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f37127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f37128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CampaignEx f37129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f37130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f37131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f37132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f37133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f37134k = 0;

    public MBSplashData(DyOption dyOption) {
        this.f37124a = dyOption;
        this.f37129f = dyOption.getCampaignEx();
    }

    public String getAdClickText() {
        return this.f37126c;
    }

    public String getAppInfo() {
        return this.f37125b;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public CampaignEx getBindData() {
        return this.f37129f;
    }

    public int getClickType() {
        return this.f37134k;
    }

    public String getCountDownText() {
        return this.f37127d;
    }

    public DyOption getDyOption() {
        return this.f37124a;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public DyOption getEffectData() {
        return this.f37124a;
    }

    public int getLogoImage() {
        return this.f37131h;
    }

    public String getLogoText() {
        return this.f37128e;
    }

    public int getNoticeImage() {
        return this.f37130g;
    }

    public float getxInScreen() {
        return this.f37132i;
    }

    public float getyInScreen() {
        return this.f37133j;
    }

    public void setAdClickText(String str) {
        this.f37126c = str;
    }

    public void setAppInfo(String str) {
        this.f37125b = str;
    }

    public void setClickType(int i10) {
        this.f37134k = i10;
    }

    public void setCountDownText(String str) {
        this.f37127d = str;
    }

    public void setLogoImage(int i10) {
        this.f37131h = i10;
    }

    public void setLogoText(String str) {
        this.f37128e = str;
    }

    public void setNoticeImage(int i10) {
        this.f37130g = i10;
    }

    public void setxInScreen(float f10) {
        this.f37132i = f10;
    }

    public void setyInScreen(float f10) {
        this.f37133j = f10;
    }
}
