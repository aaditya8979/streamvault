package com.mbridge.msdk.mbnative.service.net;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: NativeResponseHandler.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b extends c<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38784b;

    /* JADX INFO: compiled from: NativeResponseHandler.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f38786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f38787c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f38788d;

        /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.service.net.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NativeResponseHandler.java */
        public class RunnableC0469a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CampaignUnit f38790a;

            public RunnableC0469a(CampaignUnit campaignUnit) {
                this.f38790a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f38790a;
                if (campaignUnit == null || campaignUnit.getAds() == null || this.f38790a.getAds().size() <= 0) {
                    a aVar = a.this;
                    b.this.a(aVar.f38788d, aVar.f38786b.optString(NotificationCompat.CATEGORY_MESSAGE));
                } else {
                    a aVar2 = a.this;
                    b.this.a(aVar2.f38787c, this.f38790a);
                    b.this.saveRequestTime(this.f38790a.getAds().size());
                }
            }
        }

        public a(String str, JSONObject jSONObject, List list, int i10) {
            this.f38785a = str;
            this.f38786b = jSONObject;
            this.f38787c = list;
            this.f38788d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0469a("v5".equals(this.f38785a) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(this.f38786b.optJSONObject("data")) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(this.f38786b.optJSONObject("data"))));
        }
    }

    private void a(List<g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        CampaignUnit v5CampaignUnit = "v5".equals(jSONObject.optString("version")) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject("data")) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject("data"));
        if (v5CampaignUnit == null || v5CampaignUnit.getListFrames() == null || v5CampaignUnit.getListFrames().size() <= 0) {
            a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
        } else {
            a(v5CampaignUnit.getListFrames());
            saveRequestTime(v5CampaignUnit.getListFrames().size());
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

    public int a() {
        return this.f38783a;
    }

    public void a(int i10) {
        this.f38783a = i10;
    }

    public abstract void a(int i10, String str);

    public void a(String str) {
        this.f38784b = str;
    }

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    public String b() {
        return this.f38784b;
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        a(aVar.f37792a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
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
        int i10 = this.f38783a;
        if (i10 == 0) {
            b(aVar.f37813b, eVar.f37791c);
        } else if (i10 == 1) {
            a(aVar.f37813b, eVar.f37791c);
        }
    }
}
