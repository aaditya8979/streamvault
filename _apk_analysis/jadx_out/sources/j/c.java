package j;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.yk.e.object.MainParams;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.LogUtil;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1 f71825b;

    public c(y1 y1Var) {
        this.f71825b = y1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        JSONObject jSONObject = (JSONObject) message.obj;
        y1 y1Var = this.f71825b;
        y1Var.ILL = false;
        y1Var.f3400Ll1 = false;
        y1Var.f3401L11I = false;
        y1Var.f3404lIiI = false;
        y1Var.f3409il = false;
        y1Var.f3398IiL = false;
        y1Var.f3396ILl = false;
        y1Var.f72043Lil = false;
        y1Var.LlLI1 = false;
        y1Var.f3407llL1ii = false;
        y1Var.f3406lIlii = false;
        y1Var.iIi1 = false;
        y1Var.iIlLiL = false;
        try {
            y1Var.platform = jSONObject.optString("platform");
            y1Var.f34131 = jSONObject.optString(VastAttributes.AD_ID);
            y1Var.f3402LlLLL = jSONObject.optString("sourceID");
            String strOptString = jSONObject.optString("offline_adv");
            if (Constant.platform.equals(y1Var.platform) || !TextUtils.isEmpty(strOptString)) {
                MainParams mainParams = y1Var.f3411l;
                mainParams.platform = y1Var.platform;
                mainParams.adID = y1Var.f34131;
                mainParams.sourceID = y1Var.f3402LlLLL;
                mainParams.logoUrl = jSONObject.optString("logoUrl");
                y1Var.f3411l.title = jSONObject.optString("title");
                y1Var.f3411l.name = jSONObject.optString("name");
                y1Var.f3411l.summary = jSONObject.optString("summary");
                y1Var.f3411l.type = jSONObject.optInt("type");
                y1Var.f3411l.clickUrl = jSONObject.optString("clickUrl");
                y1Var.f3411l.webUrl = jSONObject.optString("webUrl");
                y1Var.f3411l.packageName = jSONObject.optString("package");
                y1Var.f3411l.imgUrl = jSONObject.optString("imgUrl");
                y1Var.f3411l.videoUrl = jSONObject.optString(UnifiedMediationParams.KEY_VIDEO_URL);
                y1Var.f3411l.countDownTime = jSONObject.optInt("countDownTime");
                y1Var.f3411l.skipTime = jSONObject.optInt("skipTime");
                y1Var.f3411l.adAreaType = jSONObject.optInt("adAreaType");
                y1Var.f3411l.materialId = jSONObject.optString("materialId");
                y1Var.f3411l.videoWidth = jSONObject.optInt("videoWidth");
                y1Var.f3411l.videoHeight = jSONObject.optInt("videoHeight");
                y1Var.f3411l.adTitle = jSONObject.optString("adTitle");
                y1Var.f3411l.adDes = jSONObject.optString("adDes");
                y1Var.f3411l.adContent = jSONObject.optString("adContent");
                MainParams mainParams2 = y1Var.f3411l;
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("adTags");
                ArrayList arrayList = new ArrayList();
                if (jSONArrayOptJSONArray != null) {
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        String strOptString2 = jSONArrayOptJSONArray.optString(i10);
                        if (!TextUtils.isEmpty(strOptString2)) {
                            arrayList.add(strOptString2);
                        }
                    }
                }
                mainParams2.adTags = arrayList;
                y1Var.f3411l.forceClick = jSONObject.optInt("forceClick");
                y1Var.f3411l.fcDelayTime = jSONObject.optInt("fcDelayTime");
                y1Var.f3411l.m3u8Url = jSONObject.optString("m3u8Url");
                y1Var.f3411l.playable = jSONObject.optString("playable");
                y1Var.f3411l.playableUrl = jSONObject.optString("playable_url");
                y1Var.f3411l.webPrice = jSONObject.optString("webPrice", "0");
                y1.IL1Iii(y1Var.adPlcID, y1Var.f3411l.materialId);
                Activity activity = y1Var.IL1Iii;
                String str = y1Var.curAdType;
                String str2 = y1Var.f34131;
                AdLog.i("addAdShowCountData");
                String str3 = Constant.fileAdShowCount;
                HashMap<String, List<String>> map = Constant.adShowCountMap;
                bp.g.b(activity, str.toLowerCase(Locale.getDefault()), str2, str3, map);
                AdLog.d("Constant.adShowCountMap " + map.toString());
            } else {
                i.e eVar = new i.e();
                y1Var.thirdParams = eVar;
                eVar.f63659a = jSONObject.optString("thirdAppID");
                y1Var.thirdParams.f63660b = jSONObject.optString("thirdAppKey");
                y1Var.thirdParams.f63661c = jSONObject.optString("thirdPosID");
                y1Var.thirdParams.f63662d = jSONObject.optInt("gWidth", 0);
                y1Var.thirdParams.f63663e = jSONObject.optInt("gHeight", 0);
                y1Var.thirdParams.f63664f = jSONObject.optString("thirdUnitID", "");
                y1Var.thirdParams.f63665g = jSONObject.optString("webPrice", "0");
                y1Var.thirdParams.f63666h = jSONObject.optString("autoFlush", "0");
            }
        } catch (Exception e10) {
            LogUtil.printException(e10);
        }
        this.f71825b.IL1Iii(jSONObject);
        return false;
    }
}
