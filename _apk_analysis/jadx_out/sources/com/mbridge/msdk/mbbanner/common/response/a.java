package com.mbridge.msdk.mbbanner.common.response;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: BannerResponseHandler.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends c<JSONObject> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f38512b = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38513a = "";

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.response.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BannerResponseHandler.java */
    public class RunnableC0459a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f38515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f38516c;

        /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.response.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BannerResponseHandler.java */
        public class RunnableC0460a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CampaignUnit f38518a;

            public RunnableC0460a(CampaignUnit campaignUnit) {
                this.f38518a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f38518a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f38518a.getAds().size() > 0) {
                    a.this.a(this.f38518a);
                    if (!TextUtils.isEmpty(a.this.f38513a)) {
                        a.this.saveHbState(1);
                    }
                    a.this.saveRequestTime(this.f38518a.getAds().size());
                    return;
                }
                CampaignUnit campaignUnit2 = this.f38518a;
                String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = RunnableC0459a.this.f38515b.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                RunnableC0459a runnableC0459a = RunnableC0459a.this;
                a.this.a(runnableC0459a.f38516c, msg);
            }
        }

        public RunnableC0459a(String str, JSONObject jSONObject, int i10) {
            this.f38514a = str;
            this.f38515b = jSONObject;
            this.f38516c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0460a("v5".equals(this.f38514a) ? b.parseV5CampaignUnit(this.f38515b.optJSONObject("data"), a.this.f38513a) : b.parseCampaignUnit(this.f38515b.optJSONObject("data"), a.this.f38513a)));
        }
    }

    private void a(List<g> list, JSONObject jSONObject) {
        q0.c(f38512b, "parseLoad content = " + jSONObject);
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new RunnableC0459a(jSONObject.optString("version"), jSONObject, iOptInt));
    }

    public abstract void a(int i10, String str);

    public abstract void a(CampaignUnit campaignUnit);

    public void a(String str) {
        this.f38513a = str;
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.c(f38512b, "onFailed errorCode = " + aVar.f37792a);
        a(aVar.f37792a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<JSONObject> eVar) {
        super.onSuccess(eVar);
        a(eVar.f37790b.f37813b, eVar.f37791c);
    }
}
