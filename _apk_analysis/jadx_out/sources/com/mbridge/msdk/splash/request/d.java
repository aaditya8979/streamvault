package com.mbridge.msdk.splash.request;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: SplashResponseHandler.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class d extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f39957c = "d";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39959b;

    /* JADX INFO: compiled from: SplashResponseHandler.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f39960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f39961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f39962c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f39963d;

        /* JADX INFO: renamed from: com.mbridge.msdk.splash.request.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SplashResponseHandler.java */
        public class RunnableC0501a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CampaignUnit f39965a;

            public RunnableC0501a(CampaignUnit campaignUnit) {
                this.f39965a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f39965a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f39965a.getAds().size() > 0) {
                    a aVar = a.this;
                    d.this.a(aVar.f39962c, this.f39965a);
                    d.this.saveRequestTime(this.f39965a.getAds().size());
                } else {
                    CampaignUnit campaignUnit2 = this.f39965a;
                    String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                    if (TextUtils.isEmpty(msg)) {
                        msg = a.this.f39961b.optString(NotificationCompat.CATEGORY_MESSAGE);
                    }
                    a aVar2 = a.this;
                    d.this.a(aVar2.f39963d, msg);
                }
            }
        }

        public a(String str, JSONObject jSONObject, List list, int i10) {
            this.f39960a = str;
            this.f39961b = jSONObject;
            this.f39962c = list;
            this.f39963d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0501a("v5".equals(this.f39960a) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(this.f39961b.optJSONObject("data"), d.this.f39959b) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(this.f39961b.optJSONObject("data"), d.this.f39959b)));
        }
    }

    private void a(List<g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        CampaignUnit v5CampaignUnit = "v5".equals(jSONObject.optString("version")) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.f39959b) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject("data"), this.f39959b);
        if (v5CampaignUnit != null && v5CampaignUnit.getListFrames() != null && v5CampaignUnit.getListFrames().size() > 0) {
            List<Frame> listFrames = v5CampaignUnit.getListFrames();
            a(listFrames);
            saveRequestTime(listFrames.size());
        } else {
            String msg = v5CampaignUnit != null ? v5CampaignUnit.getMsg() : null;
            if (TextUtils.isEmpty(msg)) {
                msg = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
            }
            a(iOptInt, msg);
        }
    }

    private void b(List<g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(jSONObject.optString("version"), jSONObject, list, iOptInt));
    }

    public abstract void a(int i10, String str);

    public void a(String str) {
        this.f39959b = str;
    }

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.b(f39957c, "errorCode = " + aVar.f37792a);
        a(aVar.f37792a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        super.onSuccess(eVar);
        if (eVar == null || (aVar = eVar.f37790b) == null) {
            return;
        }
        int i10 = this.f39958a;
        if (i10 == 0) {
            b(aVar.f37813b, eVar.f37791c);
        } else if (i10 == 1) {
            a(aVar.f37813b, eVar.f37791c);
        }
    }
}
