package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: CommonJumpLoader.java */
/* JADX INFO: loaded from: classes11.dex */
public class e extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35602e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.task.b f35605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p f35606i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JumpLoaderResult f35599b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35600c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f35601d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g f35603f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f35604g = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Handler f35607j = new Handler(Looper.getMainLooper());

    public e(Context context) {
        this.f35605h = new com.mbridge.msdk.foundation.same.task.b(context);
        this.f35606i = new p(context);
    }

    public void a() {
        this.f35604g = false;
    }

    public void a(String str, CampaignEx campaignEx, g gVar) {
        this.f35601d = new String(campaignEx.getClickURL());
        this.f35603f = gVar;
        this.f35599b = null;
        this.f35606i.a(campaignEx.getClickURL(), gVar, CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode()), campaignEx.getId(), str, campaignEx, true, false, com.mbridge.msdk.click.retry.a.f35718p);
    }

    public void a(String str, CampaignEx campaignEx, g gVar, String str2, boolean z10, boolean z11, int i10) {
        String id2;
        this.f35601d = str2;
        this.f35603f = gVar;
        this.f35599b = null;
        this.f35602e = i10;
        if (campaignEx != null) {
            z = CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode());
            id2 = campaignEx.getId();
        } else {
            id2 = "";
        }
        this.f35606i.a(str2, gVar, z, id2, str, campaignEx, z10, z11, i10);
    }
}
