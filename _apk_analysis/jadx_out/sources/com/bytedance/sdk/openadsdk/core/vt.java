package com.bytedance.sdk.openadsdk.core;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.core.model.fkw;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.ryl.ouw.vt;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.internal.partials.PangleVideoBridge;
import io.bidmachine.ads.networks.gam.GAMConfig;
import io.bidmachine.unified.UnifiedMediationParams;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class vt {

    public static class ouw {
        public String ouw;
        public int vt;

        public ouw(String str, int i10) {
            this.ouw = str;
            this.vt = i10;
        }
    }

    private static FilterWord lh(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("options");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    FilterWord filterWordLh = lh(jSONArrayOptJSONArray.optJSONObject(i10));
                    if (filterWordLh != null && filterWordLh.isValid()) {
                        filterWord.addOption(filterWordLh);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static int ouw(com.bytedance.sdk.openadsdk.core.model.ryl rylVar) {
        if (rylVar == null) {
            return 200;
        }
        if (TextUtils.isEmpty(rylVar.ouw)) {
            return 403;
        }
        if (TextUtils.isEmpty(rylVar.vt)) {
            return 404;
        }
        int i10 = rylVar.f13710lh;
        return (i10 == 1 || i10 == 2) ? 200 : 405;
    }

    private static int ouw(List<com.bytedance.sdk.openadsdk.core.model.zih> list) {
        if (list == null) {
            return 409;
        }
        if (list.size() <= 0) {
            return 410;
        }
        for (com.bytedance.sdk.openadsdk.core.model.zih zihVar : list) {
            if (zihVar == null) {
                return 411;
            }
            if (TextUtils.isEmpty(zihVar.ouw)) {
                return TTAdConstant.IMAGE_URL_CODE;
            }
        }
        return 200;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a3 A[Catch: all -> 0x0332, TryCatch #0 {all -> 0x0332, blocks: (B:5:0x0008, B:8:0x004b, B:10:0x0062, B:12:0x006b, B:15:0x0073, B:17:0x0079, B:22:0x0092, B:164:0x025f, B:166:0x026d, B:169:0x0278, B:171:0x0286, B:175:0x0290, B:176:0x0293, B:181:0x02a7, B:165:0x0269, B:177:0x029a, B:179:0x02a2, B:180:0x02a4, B:24:0x0099, B:26:0x00a7, B:29:0x00b2, B:31:0x00b8, B:33:0x00bc, B:35:0x00c0, B:36:0x00c4, B:37:0x00c7, B:40:0x00cf, B:42:0x00d7, B:43:0x00e3, B:44:0x00e9, B:46:0x00ee, B:61:0x0108, B:74:0x0132, B:65:0x0115, B:69:0x0122, B:75:0x0137, B:77:0x0141, B:78:0x0146, B:80:0x0150, B:82:0x015a, B:84:0x0164, B:86:0x016a, B:95:0x017a, B:107:0x019e, B:99:0x0183, B:102:0x018e, B:109:0x01a3, B:111:0x01a9, B:113:0x01b1, B:116:0x01bd, B:118:0x01c7, B:120:0x01d3, B:157:0x024b, B:129:0x01e3, B:131:0x01e7, B:132:0x01ef, B:134:0x01f7, B:136:0x01ff, B:137:0x0207, B:139:0x020f, B:140:0x0216, B:142:0x021e, B:143:0x0225, B:145:0x022b, B:147:0x0233, B:160:0x0253, B:182:0x02ad, B:184:0x02b1, B:187:0x02b8, B:190:0x02c7, B:192:0x02cd, B:197:0x02d8, B:199:0x02df, B:201:0x02e5, B:203:0x02ec, B:205:0x02f7, B:206:0x02f9, B:208:0x0303, B:211:0x030d, B:212:0x0310, B:213:0x0316, B:215:0x031b, B:217:0x0321, B:218:0x032c), top: B:223:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0225 A[Catch: all -> 0x0332, TryCatch #0 {all -> 0x0332, blocks: (B:5:0x0008, B:8:0x004b, B:10:0x0062, B:12:0x006b, B:15:0x0073, B:17:0x0079, B:22:0x0092, B:164:0x025f, B:166:0x026d, B:169:0x0278, B:171:0x0286, B:175:0x0290, B:176:0x0293, B:181:0x02a7, B:165:0x0269, B:177:0x029a, B:179:0x02a2, B:180:0x02a4, B:24:0x0099, B:26:0x00a7, B:29:0x00b2, B:31:0x00b8, B:33:0x00bc, B:35:0x00c0, B:36:0x00c4, B:37:0x00c7, B:40:0x00cf, B:42:0x00d7, B:43:0x00e3, B:44:0x00e9, B:46:0x00ee, B:61:0x0108, B:74:0x0132, B:65:0x0115, B:69:0x0122, B:75:0x0137, B:77:0x0141, B:78:0x0146, B:80:0x0150, B:82:0x015a, B:84:0x0164, B:86:0x016a, B:95:0x017a, B:107:0x019e, B:99:0x0183, B:102:0x018e, B:109:0x01a3, B:111:0x01a9, B:113:0x01b1, B:116:0x01bd, B:118:0x01c7, B:120:0x01d3, B:157:0x024b, B:129:0x01e3, B:131:0x01e7, B:132:0x01ef, B:134:0x01f7, B:136:0x01ff, B:137:0x0207, B:139:0x020f, B:140:0x0216, B:142:0x021e, B:143:0x0225, B:145:0x022b, B:147:0x0233, B:160:0x0253, B:182:0x02ad, B:184:0x02b1, B:187:0x02b8, B:190:0x02c7, B:192:0x02cd, B:197:0x02d8, B:199:0x02df, B:201:0x02e5, B:203:0x02ec, B:205:0x02f7, B:206:0x02f9, B:208:0x0303, B:211:0x030d, B:212:0x0310, B:213:0x0316, B:215:0x031b, B:217:0x0321, B:218:0x032c), top: B:223:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x024b A[Catch: all -> 0x0332, TryCatch #0 {all -> 0x0332, blocks: (B:5:0x0008, B:8:0x004b, B:10:0x0062, B:12:0x006b, B:15:0x0073, B:17:0x0079, B:22:0x0092, B:164:0x025f, B:166:0x026d, B:169:0x0278, B:171:0x0286, B:175:0x0290, B:176:0x0293, B:181:0x02a7, B:165:0x0269, B:177:0x029a, B:179:0x02a2, B:180:0x02a4, B:24:0x0099, B:26:0x00a7, B:29:0x00b2, B:31:0x00b8, B:33:0x00bc, B:35:0x00c0, B:36:0x00c4, B:37:0x00c7, B:40:0x00cf, B:42:0x00d7, B:43:0x00e3, B:44:0x00e9, B:46:0x00ee, B:61:0x0108, B:74:0x0132, B:65:0x0115, B:69:0x0122, B:75:0x0137, B:77:0x0141, B:78:0x0146, B:80:0x0150, B:82:0x015a, B:84:0x0164, B:86:0x016a, B:95:0x017a, B:107:0x019e, B:99:0x0183, B:102:0x018e, B:109:0x01a3, B:111:0x01a9, B:113:0x01b1, B:116:0x01bd, B:118:0x01c7, B:120:0x01d3, B:157:0x024b, B:129:0x01e3, B:131:0x01e7, B:132:0x01ef, B:134:0x01f7, B:136:0x01ff, B:137:0x0207, B:139:0x020f, B:140:0x0216, B:142:0x021e, B:143:0x0225, B:145:0x022b, B:147:0x0233, B:160:0x0253, B:182:0x02ad, B:184:0x02b1, B:187:0x02b8, B:190:0x02c7, B:192:0x02cd, B:197:0x02d8, B:199:0x02df, B:201:0x02e5, B:203:0x02ec, B:205:0x02f7, B:206:0x02f9, B:208:0x0303, B:211:0x030d, B:212:0x0310, B:213:0x0316, B:215:0x031b, B:217:0x0321, B:218:0x032c), top: B:223:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x029a A[Catch: all -> 0x0332, TryCatch #0 {all -> 0x0332, blocks: (B:5:0x0008, B:8:0x004b, B:10:0x0062, B:12:0x006b, B:15:0x0073, B:17:0x0079, B:22:0x0092, B:164:0x025f, B:166:0x026d, B:169:0x0278, B:171:0x0286, B:175:0x0290, B:176:0x0293, B:181:0x02a7, B:165:0x0269, B:177:0x029a, B:179:0x02a2, B:180:0x02a4, B:24:0x0099, B:26:0x00a7, B:29:0x00b2, B:31:0x00b8, B:33:0x00bc, B:35:0x00c0, B:36:0x00c4, B:37:0x00c7, B:40:0x00cf, B:42:0x00d7, B:43:0x00e3, B:44:0x00e9, B:46:0x00ee, B:61:0x0108, B:74:0x0132, B:65:0x0115, B:69:0x0122, B:75:0x0137, B:77:0x0141, B:78:0x0146, B:80:0x0150, B:82:0x015a, B:84:0x0164, B:86:0x016a, B:95:0x017a, B:107:0x019e, B:99:0x0183, B:102:0x018e, B:109:0x01a3, B:111:0x01a9, B:113:0x01b1, B:116:0x01bd, B:118:0x01c7, B:120:0x01d3, B:157:0x024b, B:129:0x01e3, B:131:0x01e7, B:132:0x01ef, B:134:0x01f7, B:136:0x01ff, B:137:0x0207, B:139:0x020f, B:140:0x0216, B:142:0x021e, B:143:0x0225, B:145:0x022b, B:147:0x0233, B:160:0x0253, B:182:0x02ad, B:184:0x02b1, B:187:0x02b8, B:190:0x02c7, B:192:0x02cd, B:197:0x02d8, B:199:0x02df, B:201:0x02e5, B:203:0x02ec, B:205:0x02f7, B:206:0x02f9, B:208:0x0303, B:211:0x030d, B:212:0x0310, B:213:0x0316, B:215:0x031b, B:217:0x0321, B:218:0x032c), top: B:223:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0108 A[Catch: all -> 0x0332, TryCatch #0 {all -> 0x0332, blocks: (B:5:0x0008, B:8:0x004b, B:10:0x0062, B:12:0x006b, B:15:0x0073, B:17:0x0079, B:22:0x0092, B:164:0x025f, B:166:0x026d, B:169:0x0278, B:171:0x0286, B:175:0x0290, B:176:0x0293, B:181:0x02a7, B:165:0x0269, B:177:0x029a, B:179:0x02a2, B:180:0x02a4, B:24:0x0099, B:26:0x00a7, B:29:0x00b2, B:31:0x00b8, B:33:0x00bc, B:35:0x00c0, B:36:0x00c4, B:37:0x00c7, B:40:0x00cf, B:42:0x00d7, B:43:0x00e3, B:44:0x00e9, B:46:0x00ee, B:61:0x0108, B:74:0x0132, B:65:0x0115, B:69:0x0122, B:75:0x0137, B:77:0x0141, B:78:0x0146, B:80:0x0150, B:82:0x015a, B:84:0x0164, B:86:0x016a, B:95:0x017a, B:107:0x019e, B:99:0x0183, B:102:0x018e, B:109:0x01a3, B:111:0x01a9, B:113:0x01b1, B:116:0x01bd, B:118:0x01c7, B:120:0x01d3, B:157:0x024b, B:129:0x01e3, B:131:0x01e7, B:132:0x01ef, B:134:0x01f7, B:136:0x01ff, B:137:0x0207, B:139:0x020f, B:140:0x0216, B:142:0x021e, B:143:0x0225, B:145:0x022b, B:147:0x0233, B:160:0x0253, B:182:0x02ad, B:184:0x02b1, B:187:0x02b8, B:190:0x02c7, B:192:0x02cd, B:197:0x02d8, B:199:0x02df, B:201:0x02e5, B:203:0x02ec, B:205:0x02f7, B:206:0x02f9, B:208:0x0303, B:211:0x030d, B:212:0x0310, B:213:0x0316, B:215:0x031b, B:217:0x0321, B:218:0x032c), top: B:223:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0137 A[Catch: all -> 0x0332, TryCatch #0 {all -> 0x0332, blocks: (B:5:0x0008, B:8:0x004b, B:10:0x0062, B:12:0x006b, B:15:0x0073, B:17:0x0079, B:22:0x0092, B:164:0x025f, B:166:0x026d, B:169:0x0278, B:171:0x0286, B:175:0x0290, B:176:0x0293, B:181:0x02a7, B:165:0x0269, B:177:0x029a, B:179:0x02a2, B:180:0x02a4, B:24:0x0099, B:26:0x00a7, B:29:0x00b2, B:31:0x00b8, B:33:0x00bc, B:35:0x00c0, B:36:0x00c4, B:37:0x00c7, B:40:0x00cf, B:42:0x00d7, B:43:0x00e3, B:44:0x00e9, B:46:0x00ee, B:61:0x0108, B:74:0x0132, B:65:0x0115, B:69:0x0122, B:75:0x0137, B:77:0x0141, B:78:0x0146, B:80:0x0150, B:82:0x015a, B:84:0x0164, B:86:0x016a, B:95:0x017a, B:107:0x019e, B:99:0x0183, B:102:0x018e, B:109:0x01a3, B:111:0x01a9, B:113:0x01b1, B:116:0x01bd, B:118:0x01c7, B:120:0x01d3, B:157:0x024b, B:129:0x01e3, B:131:0x01e7, B:132:0x01ef, B:134:0x01f7, B:136:0x01ff, B:137:0x0207, B:139:0x020f, B:140:0x0216, B:142:0x021e, B:143:0x0225, B:145:0x022b, B:147:0x0233, B:160:0x0253, B:182:0x02ad, B:184:0x02b1, B:187:0x02b8, B:190:0x02c7, B:192:0x02cd, B:197:0x02d8, B:199:0x02df, B:201:0x02e5, B:203:0x02ec, B:205:0x02f7, B:206:0x02f9, B:208:0x0303, B:211:0x030d, B:212:0x0310, B:213:0x0316, B:215:0x031b, B:217:0x0321, B:218:0x032c), top: B:223:0x0008 }] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<com.bytedance.sdk.openadsdk.core.model.ouw, java.util.ArrayList<java.lang.Integer>> ouw(org.json.JSONObject r16, com.bytedance.sdk.openadsdk.AdSlot r17, com.bytedance.sdk.openadsdk.core.model.ksc r18) {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.vt.ouw(org.json.JSONObject, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.core.model.ksc):android.util.Pair");
    }

    @Nullable
    private static com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt ouw(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, boolean z10) {
        if (jSONObject == null) {
            return null;
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = new com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt();
        vtVar.ouw = jSONObject.optInt("cover_height");
        vtVar.vt = jSONObject.optInt("cover_width");
        vtVar.fkw = jSONObject.optString("resolution");
        vtVar.f11284lh = jSONObject.optLong("size");
        double dOptDouble = jSONObject.optDouble("video_duration", 0.0d);
        vtVar.yu = dOptDouble;
        int i10 = 1;
        int iOptInt = jSONObject.optInt("replay_time", 1);
        if (dOptDouble <= 15.0d && vppVar.rn() != 1 && com.bytedance.sdk.openadsdk.core.model.vpp.fkw(vppVar)) {
            i10 = iOptInt;
        }
        vtVar.ouw(i10);
        vtVar.f11283le = jSONObject.optString("cover_url");
        vtVar.f11285ra = jSONObject.optString("video_url");
        vtVar.pno = jSONObject.optString(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
        vtVar.bly = jSONObject.optString("playable_download_url");
        vtVar.tlj = jSONObject.optString("file_hash");
        vtVar.f11281jg = jSONObject.optInt("if_playable_loading_show", 0);
        vtVar.f11282ko = jSONObject.optInt("remove_loading_page_type", 0);
        vtVar.f11280cf = jSONObject.optInt("fallback_endcard_judge", 0);
        vtVar.f11288vm = jSONObject.optInt("video_preload_size", 307200);
        vtVar.f11286rn = jSONObject.optInt("reward_video_cached_type", 0);
        vtVar.zih = jSONObject.optInt("execute_cached_type", 0);
        vtVar.ryl = z10 ? jSONObject.optInt("endcard_render", 0) : jSONObject.optInt("endcard_render", -1);
        return vtVar;
    }

    @Nullable
    public static com.bytedance.sdk.openadsdk.core.model.vpp ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return ouw(jSONObject, null, null, null, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r3v89 */
    /* JADX WARN: Type inference failed for: r3v90 */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r3v92 */
    /* JADX WARN: Type inference failed for: r3v93, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v94 */
    /* JADX WARN: Type inference failed for: r3v95 */
    /* JADX WARN: Type inference failed for: r3v96 */
    /* JADX WARN: Type inference failed for: r3v97 */
    @Nullable
    public static com.bytedance.sdk.openadsdk.core.model.vpp ouw(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ksc kscVar, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, int i10) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar;
        JSONObject jSONObject2;
        com.bytedance.sdk.openadsdk.core.model.le leVar;
        String str7;
        com.bytedance.sdk.openadsdk.core.model.ryl rylVar;
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVarOuw;
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVarOuw2;
        int i11;
        int i12;
        int iYu;
        int iLe;
        Pair pair;
        com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar2;
        vt.ouw ouwVar3;
        String str8;
        String str9;
        int i13;
        com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar4;
        ?? r32;
        boolean z10;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar5;
        com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar6;
        JSONObject jSONObjectOptJSONObject3;
        AdSlot adSlot2 = adSlot;
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = new com.bytedance.sdk.openadsdk.core.model.vpp();
        if (ouwVar != null) {
            vppVar2.f13800vm = ouwVar;
            if (ouwVar.yu()) {
                int iOptInt = jSONObject.optInt("interaction_method");
                if (iOptInt == 30 || iOptInt == 39 || iOptInt == 40 || iOptInt == 41 || iOptInt == 43 || iOptInt == 44) {
                    vppVar2.tpk = true;
                } else {
                    ouwVar.bly = 0;
                    vppVar2.tpk = false;
                }
            }
        }
        vppVar2.jqy = i10;
        int iOptInt2 = jSONObject.optInt("iv_skip_time", -1);
        int iOptInt3 = jSONObject.optInt("rv_skip_time", -1);
        if (iOptInt2 != -1) {
            vppVar2.yu(iOptInt2);
        }
        if (iOptInt3 != -1) {
            vppVar2.fkw(iOptInt3);
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("multi_ad_scene");
        if (jSONObjectOptJSONObject4 != null) {
            vppVar2.ccd = com.bytedance.sdk.openadsdk.core.model.tc.ouw(jSONObjectOptJSONObject4);
        }
        if (jSONObject.has("raw_response_info")) {
            vppVar2.f13753bo = jSONObject.optString("raw_response_info");
        }
        vppVar2.myk = jSONObject.optInt("proportion_watching", -1);
        vppVar2.f13804zn = jSONObject.optBoolean("mate_disable_cache", false);
        vppVar2.f13782pd = jSONObject.optInt("interaction_type");
        vppVar2.f13759ej = jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.vpp.yu, 0);
        vppVar2.uy = jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.vpp.f13750lh, 0);
        vppVar2.jcd = jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.vpp.fkw, 0);
        vppVar2.osn = jSONObject.optString("target_url");
        vppVar2.pv = jSONObject.optString(CreativeInfo.f52474c);
        vppVar2.yib = jSONObject.optString("app_log_url");
        vppVar2.mwh = jSONObject.optString("settings_url");
        vppVar2.f13798vh = jSONObject.optString("source");
        vppVar2.f13794ub = jSONObject.optString("app_name");
        vppVar2.f13778ng = jSONObject.optInt("dislike_control", 0);
        vppVar2.mwe = jSONObject.optInt("play_bar_show_time", AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES);
        vppVar2.f13767ki = jSONObject.optString("gecko_id");
        if (jSONObject.has("set_click_type")) {
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("set_click_type");
            str = "interaction_method";
            double dOptDouble = jSONObjectOptJSONObject5.optDouble("cta", 2.0d);
            if (dOptDouble == 2.0d || dOptDouble == 1.0d) {
                vppVar2.lai = (int) dOptDouble;
            } else {
                vppVar2.lai = 2;
            }
            double dOptDouble2 = jSONObjectOptJSONObject5.optDouble("other", 1.0d);
            if (dOptDouble2 == 2.0d || dOptDouble2 == 1.0d) {
                vppVar2.ajl = (int) dOptDouble2;
            } else {
                vppVar2.ajl = 1;
            }
        } else {
            str = "interaction_method";
        }
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("extension");
        vppVar2.hsa = jSONObjectOptJSONObject6;
        if (jSONObjectOptJSONObject6 != null) {
            vppVar2.f13751ak = new com.bytedance.sdk.openadsdk.core.model.rn(jSONObjectOptJSONObject6);
        }
        JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("icon");
        vppVar2.odc = jSONObject.optBoolean("screenshot", false);
        vppVar2.qld = jSONObject.optInt("play_bar_style", 0);
        vppVar2.lgp = jSONObject.optString("market_url", "");
        vppVar2.wbf = jSONObject.optInt("video_adaptation", 0);
        vppVar2.f13774ln = jSONObject.optInt("feed_video_opentype", 0);
        vppVar2.qni = jSONObject.optJSONObject("session_params");
        JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("dynamic_configs");
        vppVar2.smu = jSONObjectOptJSONObject8;
        if (jSONObjectOptJSONObject8 != null && (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject8.optJSONObject("speed_config")) != null) {
            com.bytedance.sdk.openadsdk.core.model.cd cdVar = new com.bytedance.sdk.openadsdk.core.model.cd();
            cdVar.ouw = (float) jSONObjectOptJSONObject3.optDouble("speed", 1.0d);
            cdVar.vt = jSONObjectOptJSONObject3.optInt("type", 0);
            vppVar2 = vppVar2;
            vppVar2.f13793tj = cdVar;
        }
        vppVar2.ehk = jSONObject.optString("auction_price", "");
        vppVar2.f13785rh = jSONObject.optInt("mrc_report", 0);
        if (jSONObject.optBoolean("isMrcReportFinish", false)) {
            vppVar2.vrp = true;
        }
        JSONObject jSONObjectOptJSONObject9 = jSONObject.optJSONObject("render");
        if (jSONObjectOptJSONObject9 != null) {
            vppVar2.kfa = jSONObjectOptJSONObject9.optInt("render_sequence", 0);
            vppVar2.yw = jSONObjectOptJSONObject9.optInt("backup_render_control", 1);
            vppVar2.f13795uj = Math.max(0, jSONObjectOptJSONObject9.optInt("reserve_time", 100));
            vppVar2.f13773lk = jSONObjectOptJSONObject9.optInt("render_thread", 0);
        }
        vppVar2.zvq = jSONObject.optInt("render_control", kscVar != null ? kscVar.bly : 1);
        if (jSONObjectOptJSONObject7 != null) {
            com.bytedance.sdk.openadsdk.core.model.zih zihVar = new com.bytedance.sdk.openadsdk.core.model.zih();
            zihVar.ouw = jSONObjectOptJSONObject7.optString("url");
            zihVar.f13812lh = jSONObjectOptJSONObject7.optInt("height");
            zihVar.vt = jSONObjectOptJSONObject7.optInt("width");
            vppVar2.ouw(zihVar);
        }
        JSONObject jSONObjectOptJSONObject10 = jSONObject.optJSONObject("reward_data");
        if (jSONObjectOptJSONObject10 != null) {
            vppVar2.xdk = jSONObjectOptJSONObject10.optInt(CampaignEx.JSON_KEY_REWARD_AMOUNT, 0);
            vppVar2.mt = jSONObjectOptJSONObject10.optString(CampaignEx.JSON_KEY_REWARD_NAME, "");
        }
        JSONObject jSONObjectOptJSONObject11 = jSONObject.optJSONObject("cover_image");
        if (jSONObjectOptJSONObject11 != null) {
            com.bytedance.sdk.openadsdk.core.model.zih zihVar2 = new com.bytedance.sdk.openadsdk.core.model.zih();
            zihVar2.ouw = jSONObjectOptJSONObject11.optString("url");
            zihVar2.f13812lh = jSONObjectOptJSONObject11.optInt("height");
            zihVar2.vt = jSONObjectOptJSONObject11.optInt("width");
            vppVar2.uoy = zihVar2;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("image");
        if (jSONArrayOptJSONArray != null) {
            for (int i14 = 0; i14 < jSONArrayOptJSONArray.length(); i14++) {
                com.bytedance.sdk.openadsdk.core.model.zih zihVar3 = new com.bytedance.sdk.openadsdk.core.model.zih();
                JSONObject jSONObjectOptJSONObject12 = jSONArrayOptJSONArray.optJSONObject(i14);
                zihVar3.ouw = jSONObjectOptJSONObject12.optString("url");
                zihVar3.f13812lh = jSONObjectOptJSONObject12.optInt("height");
                zihVar3.vt = jSONObjectOptJSONObject12.optInt("width");
                zihVar3.fkw = jSONObjectOptJSONObject12.optBoolean("image_preview");
                zihVar3.f13811le = jSONObjectOptJSONObject12.optString("image_key");
                vppVar2.f13791tc.add(zihVar3);
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("show_url");
        if (jSONArrayOptJSONArray2 != null) {
            for (int i15 = 0; i15 < jSONArrayOptJSONArray2.length(); i15++) {
                vppVar2.rrs.add(jSONArrayOptJSONArray2.optString(i15));
            }
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("click_url");
        if (jSONArrayOptJSONArray3 != null) {
            for (int i16 = 0; i16 < jSONArrayOptJSONArray3.length(); i16++) {
                vppVar2.jvy.add(jSONArrayOptJSONArray3.optString(i16));
            }
        }
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("play_start");
        if (jSONArrayOptJSONArray4 != null) {
            for (int i17 = 0; i17 < jSONArrayOptJSONArray4.length(); i17++) {
                vppVar2.ksc.add(jSONArrayOptJSONArray4.optString(i17));
            }
        }
        JSONObject jSONObjectOptJSONObject13 = jSONObject.optJSONObject("click_area");
        if (jSONObjectOptJSONObject13 != null) {
            com.bytedance.sdk.openadsdk.core.model.tlj tljVar = new com.bytedance.sdk.openadsdk.core.model.tlj();
            tljVar.ouw = jSONObjectOptJSONObject13.optBoolean("click_upper_content_area", true);
            tljVar.vt = jSONObjectOptJSONObject13.optBoolean("click_upper_non_content_area", true);
            tljVar.f13742lh = jSONObjectOptJSONObject13.optBoolean("click_lower_content_area", true);
            tljVar.yu = jSONObjectOptJSONObject13.optBoolean("click_lower_non_content_area", true);
            tljVar.fkw = jSONObjectOptJSONObject13.optBoolean("click_button_area", true);
            tljVar.f13741le = jSONObjectOptJSONObject13.optBoolean("click_video_area", true);
            vppVar2.f13777ms = tljVar;
        }
        JSONObject jSONObjectOptJSONObject14 = jSONObject.optJSONObject("adslot");
        if (jSONObjectOptJSONObject14 != null) {
            String strOptString = jSONObjectOptJSONObject14.optString("mCodeId", "");
            int iOptInt4 = jSONObjectOptJSONObject14.optInt("mImgAcceptedWidth", 0);
            int iOptInt5 = jSONObjectOptJSONObject14.optInt("mImgAcceptedHeight", 0);
            float fOptDouble = (float) jSONObjectOptJSONObject14.optDouble("mExpressViewAcceptedWidth", 0.0d);
            float fOptDouble2 = (float) jSONObjectOptJSONObject14.optDouble("mExpressViewAcceptedHeight", 0.0d);
            int iOptInt6 = jSONObjectOptJSONObject14.optInt("mAdCount", 6);
            str6 = "height";
            boolean zOptBoolean = jSONObjectOptJSONObject14.optBoolean("mSupportDeepLink", true);
            String strOptString2 = jSONObjectOptJSONObject14.optString("mRewardName", "");
            str2 = "width";
            str4 = "url";
            int iOptInt7 = jSONObjectOptJSONObject14.optInt("mRewardAmount", 0);
            String strOptString3 = jSONObjectOptJSONObject14.optString("mMediaExtra", "");
            str3 = "app_name";
            String strOptString4 = jSONObjectOptJSONObject14.optString("mUserID", "");
            jSONObjectOptJSONObject14.optInt("mOrientation", 2);
            str5 = "";
            AdSlot adSlotBuild = new AdSlot.Builder().setCodeId(strOptString).setImageAcceptedSize(iOptInt4, iOptInt5).setExpressViewAcceptedSize(fOptDouble, fOptDouble2).setAdCount(iOptInt6).setSupportDeepLink(zOptBoolean).setRewardName(strOptString2).setRewardAmount(iOptInt7).setMediaExtra(strOptString3).setUserID(strOptString4).setNativeAdType(jSONObjectOptJSONObject14.optInt("mNativeAdType", 0)).setIsAutoPlay(jSONObjectOptJSONObject14.optBoolean("mIsAutoPlay", false)).isExpressAd(jSONObjectOptJSONObject14.optBoolean("mIsExpressAd", false)).withBid(jSONObjectOptJSONObject14.optString("mBidAdm", "")).setDurationSlotType(jSONObjectOptJSONObject14.optInt("mDurationSlotType", 0)).build();
            vppVar = vppVar2;
            vppVar.yiz = adSlotBuild;
            adSlot2 = adSlot;
        } else {
            str2 = "width";
            str3 = "app_name";
            str4 = "url";
            str5 = "";
            str6 = "height";
            vppVar = vppVar2;
            vppVar.yiz = adSlot2;
        }
        if (adSlot2 != null) {
            Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
            if (requestExtraMap != null && requestExtraMap.containsKey("admob_watermark")) {
                vppVar.pev = String.valueOf(requestExtraMap.get("admob_watermark"));
            }
            jSONObject2 = jSONObject;
        } else {
            jSONObject2 = jSONObject;
            vppVar.pev = jSONObject2.optString("identificationOverlayContent");
        }
        vppVar.ixm = jSONObject2.optInt("intercept_flag", 0);
        vppVar.ey = jSONObject2.optString("phone_num");
        vppVar.fqk = jSONObject2.optString("title");
        vppVar.hun = jSONObject2.optString(UnifiedMediationParams.KEY_DESCRIPTION);
        vppVar.ux = jSONObject2.optString("button_text");
        vppVar.zrz = jSONObject2.optInt("ad_logo", 1);
        vppVar.yhj = jSONObject2.optString("ext");
        vppVar.lvd = jSONObject2.optInt("cover_click_area", 0);
        vppVar.ucs = jSONObject2.optInt("image_mode");
        vppVar.f13760fg = jSONObject2.optInt("orientation", 1);
        vppVar.baa = (float) jSONObject2.optDouble("aspect_ratio", 100.0d);
        vppVar.lvd = jSONObject2.optInt("cover_click_area", 0);
        JSONObject jSONObjectOptJSONObject15 = jSONObject2.optJSONObject(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        JSONObject jSONObjectOptJSONObject16 = jSONObject2.optJSONObject(CampaignEx.JSON_KEY_DEEP_LINK_URL);
        JSONObject jSONObjectOptJSONObject17 = jSONObject2.optJSONObject("oem");
        vppVar.ouw(jSONObject2.optInt("is_web_jump_ip", 0));
        vppVar.oiz = com.bytedance.sdk.openadsdk.core.model.jae.ouw(jSONObjectOptJSONObject17);
        if (jSONObjectOptJSONObject15 == null) {
            leVar = null;
        } else {
            leVar = new com.bytedance.sdk.openadsdk.core.model.le();
            leVar.vt = jSONObjectOptJSONObject15.optString(str3);
            leVar.f13685lh = jSONObjectOptJSONObject15.optString("package_name");
            leVar.ouw = jSONObjectOptJSONObject15.optString(DownloadModel.DOWNLOAD_URL);
            double dOptDouble3 = jSONObjectOptJSONObject15.optDouble(GAMConfig.KEY_SCORE, -1.0d);
            if (dOptDouble3 < 1.0d || dOptDouble3 > 5.0d) {
                leVar.fkw = -1.0d;
            } else {
                leVar.fkw = dOptDouble3;
            }
            int iOptInt8 = jSONObjectOptJSONObject15.optInt("comment_num", -1);
            if (iOptInt8 <= 0) {
                leVar.f13684le = -1;
            } else {
                leVar.f13684le = iOptInt8;
            }
            leVar.f13686ra = jSONObjectOptJSONObject15.optInt(CampaignEx.JSON_KEY_APP_SIZE, 0);
            leVar.yu = jSONObjectOptJSONObject15.optString("app_category");
        }
        vppVar.f13802wp = leVar;
        JSONObject jSONObjectOptJSONObject18 = jSONObject2.optJSONObject("interaction_method_params");
        JSONObject jSONObjectOptJSONObject19 = jSONObject2.optJSONObject("arbitrage_interceptor_params");
        com.bytedance.sdk.openadsdk.core.model.pno pnoVar = new com.bytedance.sdk.openadsdk.core.model.pno();
        if (jSONObjectOptJSONObject19 == null) {
            pnoVar.ouw = 0;
            pnoVar.vt = 0;
            pnoVar.f13706lh = new ArrayList();
            pnoVar.yu = 0;
            pnoVar.fkw = new ArrayList();
            pnoVar.f13707ra = 0;
            pnoVar.f13705le = 0;
        } else {
            pnoVar.ouw = jSONObjectOptJSONObject19.optInt("interceptor_x", 0);
            pnoVar.vt = jSONObjectOptJSONObject19.optInt("interceptor_y", 0);
            JSONArray jSONArrayOptJSONArray5 = jSONObjectOptJSONObject19.optJSONArray("interceptor_page");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray5 != null) {
                for (int i18 = 0; i18 < jSONArrayOptJSONArray5.length(); i18++) {
                    arrayList.add(Integer.valueOf(jSONArrayOptJSONArray5.optInt(i18)));
                }
            }
            pnoVar.f13706lh = arrayList;
            pnoVar.yu = jSONObjectOptJSONObject19.optInt("interceptor_interval_time", 0);
            JSONArray jSONArrayOptJSONArray6 = jSONObjectOptJSONObject19.optJSONArray("url_regular");
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray6 != null) {
                for (int i19 = 0; i19 < jSONArrayOptJSONArray6.length(); i19++) {
                    arrayList2.add(jSONArrayOptJSONArray6.optString(i19));
                }
            }
            pnoVar.fkw = arrayList2;
            pnoVar.f13707ra = jSONObjectOptJSONObject19.optInt("boc_index", 0);
            pnoVar.f13705le = jSONObjectOptJSONObject19.optInt("is_act", 0);
        }
        vppVar.our = pnoVar;
        com.bytedance.sdk.openadsdk.core.model.qbp qbpVar = new com.bytedance.sdk.openadsdk.core.model.qbp();
        if (jSONObjectOptJSONObject18 == null) {
            qbpVar.ouw(10L);
            qbpVar.vt(20L);
            qbpVar.lh(10L);
            qbpVar.yu(20L);
            str7 = str5;
            qbpVar.fkw = str7;
        } else {
            str7 = str5;
            qbpVar.ouw(jSONObjectOptJSONObject18.optLong("onlylp_loading_maxtime", 10L));
            qbpVar.vt(jSONObjectOptJSONObject18.optLong("straight_lp_showtime", 20L));
            qbpVar.lh(jSONObjectOptJSONObject18.optLong("onlyagg_loading_maxtime", 10L));
            qbpVar.yu(jSONObjectOptJSONObject18.optLong("straight_agg_showtime", 20L));
            qbpVar.fkw = jSONObjectOptJSONObject18.optString("loading_text", str7);
        }
        vppVar.f13770kq = qbpVar;
        com.bytedance.sdk.openadsdk.core.model.vm vmVar = new com.bytedance.sdk.openadsdk.core.model.vm();
        if (jSONObjectOptJSONObject18 == null) {
            vmVar.f13748lh = 5;
            vmVar.yu = 30;
            vmVar.fkw = 70;
            vmVar.f13747le = 1;
            vmVar.f13749ra = com.bytedance.sdk.openadsdk.core.model.vm.ouw;
            vmVar.pno = 0;
            vmVar.bly = 0;
            vmVar.tlj = 3;
        } else {
            vmVar.f13748lh = jSONObjectOptJSONObject18.optInt("ceiling_time", 5);
            vmVar.yu = jSONObjectOptJSONObject18.optInt("ceiling_ratio", 30);
            vmVar.fkw = jSONObjectOptJSONObject18.optInt("expand_ratio", 70);
            vmVar.f13747le = jSONObjectOptJSONObject18.optInt("back_type", 1);
            vmVar.f13749ra = jSONObjectOptJSONObject18.optInt("boc_return_type", com.bytedance.sdk.openadsdk.core.model.vm.ouw);
            vmVar.pno = jSONObjectOptJSONObject18.optInt("pre_render_status", 0);
            vmVar.bly = jSONObjectOptJSONObject18.optInt("pre_render_use_gecko", 0);
            vmVar.tlj = jSONObjectOptJSONObject18.optInt("pre_render_add_type", 3);
        }
        vppVar.f13775mb = vmVar;
        if (jSONObjectOptJSONObject16 == null) {
            rylVar = null;
        } else {
            rylVar = new com.bytedance.sdk.openadsdk.core.model.ryl();
            rylVar.ouw = jSONObjectOptJSONObject16.optString("deeplink_url");
            rylVar.vt = jSONObjectOptJSONObject16.optString("fallback_url");
            rylVar.f13710lh = jSONObjectOptJSONObject16.optInt("fallback_type");
        }
        vppVar.f13768kn = rylVar;
        vppVar.nbp = new com.bytedance.sdk.openadsdk.core.model.od(jSONObject2);
        JSONArray jSONArrayOptJSONArray7 = jSONObject2.optJSONArray("filter_words");
        if (jSONArrayOptJSONArray7 != null) {
            for (int i20 = 0; i20 < jSONArrayOptJSONArray7.length(); i20++) {
                FilterWord filterWordLh = lh(jSONArrayOptJSONArray7.optJSONObject(i20));
                if (filterWordLh != null && filterWordLh.isValid()) {
                    vppVar.jae.add(filterWordLh);
                }
            }
        }
        vppVar.coz = jSONObject2.optInt("count_down");
        vppVar.fwd = jSONObject2.optLong(GAMConfig.KEY_EXPIRATION_TIME_SEC);
        vppVar.f13797vf = jSONObject2.optInt("video_encode_type", 0);
        vppVar.f13789sm = 0;
        JSONObject jSONObjectOptJSONObject20 = jSONObject2.optJSONObject("video");
        if (jSONObjectOptJSONObject20 != null) {
            vtVarOuw = ouw(jSONObjectOptJSONObject20, vppVar, true);
            vppVar.njr = vtVarOuw;
            vppVar.f13780ob = jSONObjectOptJSONObject20.optInt("multi_played_percent", 50);
        } else {
            vtVarOuw = null;
        }
        JSONObject jSONObjectOptJSONObject21 = jSONObject2.optJSONObject("h265_video");
        if (jSONObjectOptJSONObject21 != null) {
            vtVarOuw2 = ouw(jSONObjectOptJSONObject21, vppVar, false);
            vppVar.euf = vtVarOuw2;
        } else {
            vtVarOuw2 = null;
        }
        if (Build.VERSION.SDK_INT < 26 || vppVar.f13797vf == 0) {
            vppVar.f13788sd = vtVarOuw;
            i11 = 0;
            vppVar.f13797vf = 0;
        } else {
            if (vtVarOuw2 != null && vtVarOuw != null) {
                if (TextUtils.isEmpty(vtVarOuw2.pno)) {
                    vtVarOuw2.pno = vtVarOuw.pno;
                }
                if (TextUtils.isEmpty(vtVarOuw2.bly)) {
                    vtVarOuw2.bly = vtVarOuw.bly;
                }
                if (vtVarOuw2.ryl == -1) {
                    vtVarOuw2.ryl = vtVarOuw.ryl;
                }
            }
            if (vtVarOuw2 != null) {
                vppVar.f13788sd = vtVarOuw2;
            } else {
                vppVar.f13788sd = vtVarOuw;
            }
            i11 = 0;
        }
        JSONObject jSONObjectOptJSONObject22 = jSONObject2.optJSONObject("download_conf");
        if (jSONObjectOptJSONObject22 != null) {
            com.bytedance.sdk.openadsdk.core.model.mwh mwhVar = new com.bytedance.sdk.openadsdk.core.model.mwh();
            mwhVar.ouw = jSONObjectOptJSONObject22.optInt("if_send_click", i11);
            vppVar.xwt = mwhVar;
        }
        vppVar.npr = yu(jSONObject2.optJSONObject("media_ext"));
        JSONObject jSONObjectOptJSONObject23 = jSONObject2.optJSONObject("tpl_info");
        if (jSONObjectOptJSONObject23 != null) {
            vpp.ouw ouwVar7 = new vpp.ouw();
            ouwVar7.ouw = jSONObjectOptJSONObject23.optString("id");
            ouwVar7.vt = jSONObjectOptJSONObject23.optString("md5");
            ouwVar7.f13808lh = jSONObjectOptJSONObject23.optString(str4);
            ouwVar7.yu = jSONObjectOptJSONObject23.optString("data");
            ouwVar7.fkw = jSONObjectOptJSONObject23.optString("diff_data");
            String strOptString5 = jSONObjectOptJSONObject23.optString("dynamic_creative");
            ouwVar7.f13809ra = strOptString5;
            ouwVar7.f13807le = jSONObjectOptJSONObject23.optString("version");
            ouwVar7.f13805cf = jSONObjectOptJSONObject23.optString("media_view");
            try {
                ArrayList arrayList3 = new ArrayList();
                JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(strOptString5);
                JSONArray jSONArrayOptJSONArray8 = jSONObjectJsonObjectInit.optJSONArray("tag_ids");
                if (jSONArrayOptJSONArray8 != null) {
                    for (int i21 = 0; i21 < jSONArrayOptJSONArray8.length(); i21++) {
                        arrayList3.add(Integer.valueOf(jSONArrayOptJSONArray8.optInt(i21)));
                    }
                }
                String strOptString6 = jSONObjectJsonObjectInit.optString("music_url");
                ouwVar7.pno = arrayList3;
                ouwVar7.bly = strOptString6;
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.qbp.lh("TTAD.AdInfoFactory", e10.getMessage());
            }
            ouwVar7.tlj = jSONObjectOptJSONObject23.optString("engine_version");
            ouwVar7.ryl = jSONObjectOptJSONObject23.optString("ugen_url");
            ouwVar7.mwh = jSONObjectOptJSONObject23.optString("ugen_md5");
            ouwVar7.f13806jg = jSONObjectOptJSONObject23.optString("ugen_data");
            vppVar.f13803xn = ouwVar7;
            String strValueOf = String.valueOf(vppVar.fqk());
            com.bytedance.sdk.component.adexpress.ouw.lh.yu yuVar = new com.bytedance.sdk.component.adexpress.ouw.lh.yu();
            yuVar.ouw = ouwVar7.ouw;
            yuVar.vt = ouwVar7.vt;
            yuVar.f12428lh = ouwVar7.f13808lh;
            yuVar.yu = ouwVar7.yu;
            yuVar.fkw = ouwVar7.f13807le;
            yuVar.f12427le = strValueOf;
            if (!vppVar.th()) {
                com.bytedance.sdk.component.adexpress.ouw.vt.vt.ouw(yuVar);
            }
            if (!TextUtils.isEmpty(ouwVar7.ryl)) {
                vpp.ouw ouwVar8 = vppVar.f13803xn;
                if (ouwVar8 == null) {
                    ouwVar6 = null;
                } else {
                    String strValueOf2 = String.valueOf(vppVar.fqk());
                    ouwVar6 = new com.bytedance.sdk.openadsdk.core.cf.pno.ouw();
                    ouwVar6.ouw = ouwVar8.ouw;
                    ouwVar6.vt = ouwVar8.mwh;
                    ouwVar6.f13554lh = ouwVar8.ryl;
                    ouwVar6.yu = ouwVar8.f13806jg;
                    ouwVar6.fkw = strValueOf2;
                }
                com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw().ouw(ouwVar6, "ad");
            }
        }
        JSONObject jSONObjectOptJSONObject24 = jSONObject2.optJSONObject("tpl_info_v3");
        if (jSONObjectOptJSONObject24 != null) {
            com.bytedance.sdk.openadsdk.core.model.pd pdVarOuw = com.bytedance.sdk.openadsdk.core.model.pd.ouw(jSONObjectOptJSONObject24);
            vppVar.lht = pdVarOuw;
            if (pdVarOuw != null && !TextUtils.isEmpty(pdVarOuw.f13703lh)) {
                com.bytedance.sdk.openadsdk.core.model.pd pdVar = vppVar.lht;
                if (pdVar == null) {
                    ouwVar5 = null;
                } else {
                    ouwVar5 = new com.bytedance.sdk.openadsdk.core.cf.pno.ouw();
                    ouwVar5.ouw = pdVar.ouw;
                    ouwVar5.vt = pdVar.vt;
                    ouwVar5.f13554lh = pdVar.f13703lh;
                    ouwVar5.yu = pdVar.yu;
                    ouwVar5.fkw = vppVar.fqk() + "_v3";
                }
                com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw().ouw(ouwVar5, "adv3");
            }
        }
        JSONObject jSONObjectOptJSONObject25 = jSONObject2.optJSONObject("dynamic_creative");
        if (jSONObjectOptJSONObject25 != null) {
            vppVar.jvj = jSONObjectOptJSONObject25;
        }
        vppVar.zjp = jSONObject2.optString("creative_extra");
        vppVar.eay = jSONObject2.optInt("if_block_lp", 0);
        vppVar.f13761fn = jSONObject2.optInt("cache_sort", 1);
        vppVar.byv = jSONObject2.optInt("if_sp_cache", 0);
        JSONObject jSONObjectOptJSONObject26 = jSONObject2.optJSONObject("splash_control");
        if (jSONObjectOptJSONObject26 != null) {
            int iOptInt9 = jSONObjectOptJSONObject26.optInt("splash_clickarea", 2);
            int iOptInt10 = jSONObjectOptJSONObject26.optInt("splash_layout_id", 1);
            long jOptLong = jSONObjectOptJSONObject26.optLong("load_wait_time", 0L);
            long j10 = jOptLong >= 0 ? jOptLong : 0L;
            int iOptInt11 = jSONObjectOptJSONObject26.optInt("skip_time", -1);
            com.bytedance.sdk.openadsdk.core.model.ra raVar = new com.bytedance.sdk.openadsdk.core.model.ra();
            raVar.ouw = iOptInt9;
            raVar.vt = iOptInt10;
            raVar.f13709lh = j10;
            raVar.yu = iOptInt11;
            vppVar.qjg = raVar;
        }
        vppVar.zjq = jSONObject2.optInt("is_package_open", 1);
        vppVar.f13779nn = jSONObject2.optString("ad_info", null);
        vppVar.f13799vi = jSONObject2.optInt("ua_policy", 2);
        vppVar.eot = jSONObject2.optInt("playable_duration_time", 30);
        vppVar.f13769ko = jSONObject2.optInt("playable_close_time", -1);
        vppVar.mu = jSONObject2.optInt("playable_endcard_close_time", -1);
        vppVar.xne = jSONObject2.optInt("endcard_close_time", -1);
        vppVar.ouw(jSONObject2.optInt(str), -1);
        vppVar.vt(jSONObject2.optInt("lp_click_type", -1));
        vppVar.ouw(jSONObject2.optInt("lp_click_interval", -1));
        vppVar.swm = jSONObject2.optString("dsp_html");
        vppVar.wud = jSONObject2.optInt("image_stay", 0);
        int iOptInt12 = jSONObject2.optInt("dsp_material_type", 0);
        if (iOptInt12 < 0 || iOptInt12 > 3) {
            iOptInt12 = 0;
        }
        if (iOptInt12 == 0) {
            if (jSONObject2.optBoolean("is_vast", false)) {
                iOptInt12 = 1;
            }
            if (jSONObject2.optBoolean("is_html", false)) {
                iOptInt12 = 2;
            }
        }
        vppVar.cy = iOptInt12;
        if (iOptInt12 == 1 || iOptInt12 == 3) {
            int durationSlotType = vppVar.lna;
            if (durationSlotType < 0) {
                AdSlot adSlot3 = vppVar.yiz;
                durationSlotType = adSlot3 != null ? adSlot3.getDurationSlotType() : vppVar.uoy();
            }
            String strLh = com.bytedance.sdk.openadsdk.utils.uoy.lh(durationSlotType);
            if (jSONObject2.has("vast_json")) {
                JSONObject jSONObjectOptJSONObject27 = jSONObject2.optJSONObject("vast_json");
                if (jSONObjectOptJSONObject27 == null) {
                    ouwVar4 = null;
                } else {
                    ouwVar4 = new com.bytedance.sdk.openadsdk.core.ryl.ouw();
                    com.bytedance.sdk.openadsdk.core.ryl.yu yuVar2 = ouwVar4.ouw.ouw;
                    if (yuVar2 == null) {
                        yuVar2 = new com.bytedance.sdk.openadsdk.core.ryl.yu();
                        ouwVar4.ouw.ouw = yuVar2;
                    }
                    yuVar2.ouw(jSONObjectOptJSONObject27.optJSONObject("videoTrackers"));
                    ouwVar4.vt = com.bytedance.sdk.openadsdk.core.ryl.vt.ouw(jSONObjectOptJSONObject27.optJSONObject("vastIcon"));
                    ouwVar4.f13941lh = com.bytedance.sdk.openadsdk.core.ryl.lh.vt(jSONObjectOptJSONObject27.optJSONObject("endCard"));
                    ouwVar4.yu = jSONObjectOptJSONObject27.optString("title");
                    ouwVar4.fkw = jSONObjectOptJSONObject27.optString(UnifiedMediationParams.KEY_DESCRIPTION);
                    ouwVar4.f13940le = jSONObjectOptJSONObject27.optString("clickThroughUrl");
                    ouwVar4.f13942ra = jSONObjectOptJSONObject27.optString(UnifiedMediationParams.KEY_VIDEO_URL);
                    ouwVar4.pno = jSONObjectOptJSONObject27.optDouble("videDuration");
                    ouwVar4.bly = jSONObjectOptJSONObject27.optInt("videoWidth");
                    ouwVar4.bly = jSONObjectOptJSONObject27.optInt("videoHeight");
                    Set hashSet = ouwVar4.ouw.vt;
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        ouwVar4.ouw.vt = hashSet;
                    }
                    hashSet.addAll(com.bytedance.sdk.openadsdk.core.ryl.tlj.ouw(jSONObjectOptJSONObject27.optJSONArray("viewabilityVendor")));
                }
                str9 = str6;
                str8 = str7;
                i13 = 2;
            } else {
                String strOptString7 = jSONObject2.optString("dsp_vast");
                if (TextUtils.isEmpty(strOptString7)) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("reason_code", -1);
                        jSONObject3.put("error_code", -1);
                        com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, strLh, "load_vast_fail", jSONObject3);
                        return null;
                    } catch (Exception unused) {
                        return null;
                    }
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                int iJqy = vppVar.jqy();
                if (TextUtils.isEmpty(strOptString7)) {
                    pair = null;
                    i12 = 2;
                } else {
                    if (durationSlotType == 1 || durationSlotType == 5) {
                        i12 = 2;
                        iYu = 0;
                        iLe = 0;
                    } else {
                        iYu = com.bytedance.sdk.openadsdk.utils.osn.yu(zih.ouw());
                        iLe = com.bytedance.sdk.openadsdk.utils.osn.le(zih.ouw());
                        i12 = 2;
                        if (iJqy == 2) {
                            iLe = iYu;
                            iYu = iLe;
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.yu yuVar3 = new com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.yu(zih.ouw(), iYu, iLe);
                    pair = new Pair(yuVar3.ouw(strOptString7, (File) null, new ArrayList()), yuVar3.f13950le);
                }
                if (pair != null) {
                    ouwVar2 = (com.bytedance.sdk.openadsdk.core.ryl.ouw) pair.first;
                    ouwVar3 = (vt.ouw) pair.second;
                } else {
                    ouwVar2 = null;
                    ouwVar3 = null;
                }
                str8 = str7;
                str9 = str6;
                i13 = i12;
                com.bytedance.sdk.openadsdk.core.ryl.lh.yu.ouw(vppVar, strLh, ouwVar2, jElapsedRealtime, ouwVar3);
                ouwVar4 = ouwVar2;
            }
            if (ouwVar4 == null) {
                return null;
            }
            ouwVar4.ouw.ouw(vppVar);
            com.bytedance.sdk.openadsdk.core.ryl.vt vtVar = ouwVar4.vt;
            if (vtVar != null) {
                vtVar.f13925cf = vppVar;
            }
            com.bytedance.sdk.openadsdk.core.ryl.lh lhVar = ouwVar4.f13941lh;
            if (lhVar != null) {
                lhVar.f13925cf = vppVar;
            }
            int i22 = vppVar.f13782pd;
            if (!(i22 == i13 || i22 == 3 || i22 == 8)) {
                vppVar.f13782pd = i13;
            }
            vppVar.zvq = 1;
            vppVar.cu = ouwVar4;
            if (!TextUtils.isEmpty(ouwVar4.yu)) {
                vppVar.fqk = ouwVar4.yu;
            }
            if (!TextUtils.isEmpty(ouwVar4.fkw)) {
                vppVar.hun = ouwVar4.fkw;
            }
            vppVar.osn = ouwVar4.f13940le;
            vppVar.f13802wp = null;
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar2 = vppVar.f13788sd;
            if (vtVar2 == null) {
                vtVar2 = new com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt();
            }
            vtVar2.f11285ra = ouwVar4.f13942ra;
            vtVar2.yu = ouwVar4.pno;
            vtVar2.tlj = null;
            vtVar2.f11283le = null;
            vtVar2.pno = null;
            vppVar.f13788sd = vtVar2;
            com.bytedance.sdk.openadsdk.core.ryl.vt vtVar3 = ouwVar4.vt;
            if (vtVar3 != null && !TextUtils.isEmpty(vtVar3.fkw())) {
                com.bytedance.sdk.openadsdk.core.model.zih zihVar4 = new com.bytedance.sdk.openadsdk.core.model.zih();
                zihVar4.ouw = ouwVar4.vt.fkw();
                zihVar4.vt = ouwVar4.vt.vt();
                zihVar4.f13812lh = ouwVar4.vt.lh();
                vppVar.ouw(zihVar4);
            } else if (vppVar.fak == null) {
                com.bytedance.sdk.openadsdk.core.model.zih zihVar5 = new com.bytedance.sdk.openadsdk.core.model.zih();
                zihVar5.ouw = "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/static/images/2023620white.jpeg";
                zihVar5.vt = 98;
                zihVar5.f13812lh = 98;
                vppVar.ouw(zihVar5);
            }
        } else {
            str9 = str6;
            str8 = str7;
        }
        vppVar.lso = jSONObject2.optString("deep_link_appname", str8);
        vppVar.f13757cj = jSONObject2.optInt("landing_page_download_clicktype", 1);
        JSONObject jSONObjectOptJSONObject28 = jSONObject2.optJSONObject("dsp_style");
        if (jSONObjectOptJSONObject28 != null) {
            vppVar.kbx = new com.bytedance.sdk.openadsdk.core.model.jg(jSONObjectOptJSONObject28);
        }
        JSONObject jSONObjectOptJSONObject29 = jSONObject2.optJSONObject("dsp_adchoices");
        if (jSONObjectOptJSONObject29 != null) {
            vppVar.uz = jSONObjectOptJSONObject29.optString("adchoices_icon", str8);
            vppVar.f13766jo = jSONObjectOptJSONObject29.optString("adchoices_url", str8);
        }
        String strOptString8 = jSONObject2.optString("gdid_encrypted");
        if (!TextUtils.isEmpty(strOptString8)) {
            vppVar.f13783qg = strOptString8;
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar4 = vppVar.f13788sd;
        if (vtVar4 == null || TextUtils.isEmpty(vtVar4.pno)) {
            r32 = 1;
        } else {
            try {
                r32 = "style_id";
                try {
                    if (vppVar.f13788sd.pno.contains("style_id")) {
                        r32 = 1;
                        vppVar.hai = true;
                        vppVar.f13764jf = Uri.parse(vppVar.f13788sd.pno).getQueryParameters("style_id").get(0);
                    } else {
                        r32 = 1;
                        vppVar.hai = false;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    com.bytedance.sdk.component.utils.qbp.yu(th.getMessage(), new Object[0]);
                }
            } catch (Throwable th3) {
                th = th3;
                r32 = 1;
            }
        }
        JSONObject jSONObjectOptJSONObject30 = jSONObject2.optJSONObject("ugen");
        if (jSONObjectOptJSONObject30 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject30.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD)) != null) {
            com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVarVt = vt(jSONObjectOptJSONObject2);
            vppVar.upp = ouwVarVt;
            com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw().ouw(ouwVarVt, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
            JSONObject jSONObjectOptJSONObject31 = jSONObjectOptJSONObject2.optJSONObject("overlay");
            if (jSONObjectOptJSONObject31 != null) {
                com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVarVt2 = vt(jSONObjectOptJSONObject31);
                vppVar.nit = ouwVarVt2;
                com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw().ouw(ouwVarVt2, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
            }
        }
        vppVar.gls = jSONObject2.optInt("preload_h5_type", 0);
        vppVar.bu = jSONObject2.optBoolean("hasReportShow", false);
        vppVar.znd = jSONObject2.optString("endcard_creative", str8);
        JSONObject jSONObjectOptJSONObject32 = jSONObject2.optJSONObject("ad_label");
        com.bytedance.sdk.openadsdk.core.model.vt vtVar5 = vppVar.f13763hk;
        if (jSONObjectOptJSONObject32 != null) {
            vtVar5.ouw = jSONObjectOptJSONObject32.optString("icon");
            vtVar5.vt = jSONObjectOptJSONObject32.optString("text");
            vtVar5.f13810lh = jSONObjectOptJSONObject32.optString(CampaignEx.JSON_KEY_PRIVACY_URL);
            vtVar5.yu = jSONObjectOptJSONObject32.optString("privacy_title");
        }
        JSONObject jSONObjectOptJSONObject33 = jSONObject2.optJSONObject("ev");
        if (jSONObjectOptJSONObject33 != null) {
            vppVar.vt(jSONObjectOptJSONObject33.optBoolean(a.f32685j, com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw));
            vppVar.lh(jSONObjectOptJSONObject33.optInt("wait_time", com.bytedance.sdk.openadsdk.tc.ouw.lh.vt));
            vppVar.fkw(jSONObjectOptJSONObject33.optString("label", com.bytedance.sdk.openadsdk.tc.ouw.lh.f14273lh));
            vppVar.f13790sn = new com.bytedance.sdk.openadsdk.tc.ouw.vt(vppVar);
        }
        if (!jSONObject2.has("banner") || (jSONObjectOptJSONObject = jSONObject2.optJSONObject("banner")) == null) {
            z10 = false;
        } else {
            z10 = false;
            vppVar.bfk = new PAGBannerSize(jSONObjectOptJSONObject.optInt(str2, 0), jSONObjectOptJSONObject.optInt(str9, 0));
        }
        JSONArray jSONArrayOptJSONArray9 = jSONObject2.optJSONArray("ad_tracks");
        if (jSONArrayOptJSONArray9 != null && jSONArrayOptJSONArray9.length() > 0) {
            com.bytedance.sdk.openadsdk.core.model.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.model.fkw(jSONArrayOptJSONArray9);
            ArrayList<fkw.ouw> arrayList4 = fkwVar.ouw;
            if (((arrayList4 == null || arrayList4.isEmpty()) ? z10 : r32) != 0) {
                vppVar.ryl = fkwVar;
            }
        }
        JSONObject jSONObjectOptJSONObject34 = jSONObject2.optJSONObject("popup");
        if (jSONObjectOptJSONObject34 != null) {
            vppVar.f13765jg = new com.bytedance.sdk.openadsdk.core.model.jqy(jSONObjectOptJSONObject34);
        }
        return vppVar;
    }

    private static boolean ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        return (vppVar.cd() || vppVar.pd()) ? false : true;
    }

    private static com.bytedance.sdk.openadsdk.core.cf.pno.ouw vt(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.cf.pno.ouw();
        ouwVar.ouw = jSONObject.optString("id");
        ouwVar.vt = jSONObject.optString("md5");
        ouwVar.f13554lh = jSONObject.optString("url");
        return ouwVar;
    }

    private static Map<String, Object> yu(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.isEmpty(next)) {
                map.put(next, jSONObject.opt(next));
            }
        }
        return map;
    }
}
