package com.mbridge.msdk.reward.request;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: RewardResponseHandler.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f39577d = "c";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.metrics.c f39580c;

    /* JADX INFO: compiled from: RewardResponseHandler.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f39581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f39582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f39583c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f39584d;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.request.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RewardResponseHandler.java */
        public class RunnableC0492a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CampaignUnit f39586a;

            public RunnableC0492a(CampaignUnit campaignUnit) {
                this.f39586a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f39586a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f39586a.getAds().size() > 0) {
                    this.f39586a.setMetricsData(c.this.f39580c);
                    a aVar = a.this;
                    c.this.a(aVar.f39583c, this.f39586a);
                    c.this.saveRequestTime(this.f39586a.getAds().size());
                    return;
                }
                CampaignUnit campaignUnit2 = this.f39586a;
                String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = a.this.f39582b.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                a aVar2 = a.this;
                c cVar = c.this;
                cVar.a(aVar2.f39584d, msg, cVar.f39580c);
            }
        }

        public a(String str, JSONObject jSONObject, List list, int i10) {
            this.f39581a = str;
            this.f39582b = jSONObject;
            this.f39583c = list;
            this.f39584d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0492a("v5".equals(this.f39581a) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(this.f39582b.optJSONObject("data"), c.this.f39579b) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(this.f39582b.optJSONObject("data"), c.this.f39579b)));
        }
    }

    private void a(List<g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            a(list, jSONObject, iOptInt, this.f39580c);
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        CampaignUnit v5CampaignUnit = "v5".equals(jSONObject.optString("version")) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.f39579b) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject("data"), this.f39579b);
        if (v5CampaignUnit != null && v5CampaignUnit.getListFrames() != null && v5CampaignUnit.getListFrames().size() > 0) {
            List<Frame> listFrames = v5CampaignUnit.getListFrames();
            a(listFrames);
            saveRequestTime(listFrames.size());
        } else {
            String msg = v5CampaignUnit != null ? v5CampaignUnit.getMsg() : null;
            if (TextUtils.isEmpty(msg)) {
                msg = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
            }
            a(iOptInt, msg, this.f39580c);
        }
    }

    private void a(List<g> list, JSONObject jSONObject, int i10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        String strB = "";
        if (list != null && list.size() > 0) {
            for (g gVar : list) {
                if (gVar != null) {
                    String strA = gVar.a();
                    if (!TextUtils.isEmpty(strA) && strA.equals("data_res_type")) {
                        strB = gVar.b();
                    }
                }
            }
        }
        String strL = "errorCode: 3507 errorMessage: data load failed, errorMsg is " + jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
        if (TextUtils.isEmpty(strB) || !strB.equals("1")) {
            com.mbridge.msdk.foundation.error.b bVarA = i10 == -1 ? com.mbridge.msdk.foundation.error.a.a(880017, strL) : com.mbridge.msdk.foundation.error.a.a(880003, strL);
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.c(false);
                if (TextUtils.isEmpty(strL)) {
                    strL = bVarA.l();
                }
            }
            a(i10, strL, cVar);
            return;
        }
        com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880018, strL);
        if (cVar != null) {
            cVar.a(bVarA2);
            cVar.c(true);
            if (TextUtils.isEmpty(strL)) {
                strL = bVarA2.l();
            }
        }
        a(i10, strL, cVar);
    }

    private void b(List<g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            a(list, jSONObject, iOptInt, this.f39580c);
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(jSONObject.optString("version"), jSONObject, list, iOptInt));
    }

    public abstract void a(int i10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar);

    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        this.f39580c = cVar;
    }

    public void a(String str) {
        this.f39579b = str;
    }

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.b(f39577d, "errorCode = " + aVar.f37792a);
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(aVar.f37792a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
        bVar.a("campaign_request_error", aVar);
        bVar.a(aVar.f37793b);
        this.f39580c.a(bVar);
        a(aVar.f37792a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar), this.f39580c);
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<JSONObject> eVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        super.onSuccess(eVar);
        if (eVar == null || (aVar = eVar.f37790b) == null) {
            return;
        }
        int i10 = this.f39578a;
        if (i10 == 0) {
            b(aVar.f37813b, eVar.f37791c);
        } else if (i10 == 1) {
            a(aVar.f37813b, eVar.f37791c);
        }
    }
}
