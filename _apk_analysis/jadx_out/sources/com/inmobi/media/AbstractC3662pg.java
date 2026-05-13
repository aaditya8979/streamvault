package com.inmobi.media;

import android.content.ContentValues;
import androidx.appcompat.widget.ActivityChooserModel;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.pg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC3662pg {
    public static final ContentValues a(Rf rf2) throws JSONException {
        tn.p.k(rf2, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", rf2.f26249b);
        contentValues.put("url", rf2.f26248a);
        Map map = rf2.f26250c;
        tn.p.k(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
        }
        contentValues.put("headers", jSONObject.toString());
        contentValues.put("allow_redirects", String.valueOf(rf2.f26251d));
        contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, rf2.f26252e);
        contentValues.put("ack_required", String.valueOf(rf2.f26253f));
        contentValues.put("time_created", Long.valueOf(rf2.f26256i));
        contentValues.put("retry_count", Integer.valueOf(rf2.f26254g));
        contentValues.put("owner", rf2.f26255h);
        Long l10 = rf2.f26257j;
        contentValues.put("retryAfter", Long.valueOf(l10 != null ? l10.longValue() : 0L));
        C3440gi c3440gi = rf2.f26258k;
        if (c3440gi != null) {
            String string = new JSONObject().put("plType", c3440gi.f27230a.f28306f).put("plId", c3440gi.f27230a.f28301a).put("adType", c3440gi.f27230a.f28305e).put("markupType", c3440gi.f27231b).put("networkType", C3850x5.m()).put("creativeType", c3440gi.f27235f).put("creativeId", c3440gi.f27236g).put("isRewarded", c3440gi.f27237h).put("adPosition", c3440gi.f27238i).put("metadataBlob", c3440gi.f27233d).put("impressionId", c3440gi.f27232c).toString();
            tn.p.j(string, "toString(...)");
            contentValues.put("telemetry_metadata", string);
        }
        return contentValues;
    }

    public static final Rf a(ContentValues contentValues) throws JSONException {
        String str;
        long j10;
        C3440gi c3440gi;
        JSONObject jSONObject;
        String string;
        String string2;
        tn.p.k(contentValues, "<this>");
        String asString = contentValues.getAsString("id");
        String asString2 = contentValues.getAsString("url");
        JSONObject jSONObject2 = new JSONObject(contentValues.getAsString("headers"));
        tn.p.k(jSONObject2, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject2.keys();
        tn.p.j(itKeys, "keys(...)");
        while (true) {
            String str2 = "";
            if (!itKeys.hasNext()) {
                break;
            }
            String next = itKeys.next();
            String string3 = jSONObject2.getString(next);
            if (string3 != null) {
                str2 = string3;
            }
            linkedHashMap.put(next, str2);
        }
        boolean z10 = Boolean.parseBoolean(contentValues.getAsString("allow_redirects"));
        String asString3 = contentValues.getAsString(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        boolean z11 = Boolean.parseBoolean(contentValues.getAsString("ack_required"));
        Integer asInteger = contentValues.getAsInteger("retry_count");
        int iIntValue = asInteger != null ? asInteger.intValue() : 0;
        String asString4 = contentValues.getAsString("owner");
        if (asString4 == null) {
            asString4 = "unknown";
        }
        String str3 = asString4;
        Long asLong = contentValues.getAsLong("retryAfter");
        Long asLong2 = contentValues.getAsLong("time_created");
        tn.p.h(asString2);
        tn.p.h(asString);
        tn.p.h(asString3);
        tn.p.h(asLong2);
        long jLongValue = asLong2.longValue();
        String asString5 = contentValues.getAsString("telemetry_metadata");
        if (asString5 != null) {
            tn.p.k(asString5, "json");
            try {
                jSONObject = new JSONObject(asString5);
                string = jSONObject.getString("adType");
                tn.p.j(string, "getString(...)");
                j10 = jLongValue;
                try {
                    tn.p.k(string, "mAdType");
                    string2 = UUID.randomUUID().toString();
                    tn.p.j(string2, "toString(...)");
                    str = str3;
                } catch (JSONException unused) {
                    str = str3;
                }
            } catch (JSONException unused2) {
                str = str3;
                j10 = jLongValue;
            }
            try {
                long j11 = jSONObject.getLong("plId");
                if (j11 == Long.MIN_VALUE) {
                    throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
                }
                C3795v0 c3795v0 = new C3795v0(j11, "", string, null);
                c3795v0.f28304d = null;
                c3795v0.f28303c = null;
                tn.p.k("", "<set-?>");
                c3795v0.f28308h = "";
                tn.p.k(ActivityChooserModel.ATTRIBUTE_ACTIVITY, "<set-?>");
                c3795v0.f28309i = ActivityChooserModel.ATTRIBUTE_ACTIVITY;
                c3795v0.f28307g = string2;
                c3795v0.f28310j = false;
                c3795v0.f28311k = null;
                String string4 = jSONObject.getString("markupType");
                tn.p.j(string4, "getString(...)");
                String string5 = jSONObject.getString("impressionId");
                tn.p.j(string5, "getString(...)");
                String strOptString = jSONObject.optString("metadataBlob", "");
                tn.p.j(strOptString, "optString(...)");
                String string6 = jSONObject.getString("creativeType");
                tn.p.j(string6, "getString(...)");
                String string7 = jSONObject.getString("creativeId");
                tn.p.j(string7, "getString(...)");
                c3440gi = new C3440gi(c3795v0, string4, string5, strOptString, 0, string6, string7, jSONObject.getBoolean("isRewarded"), jSONObject.getInt("adPosition"), null, null, null, null);
            } catch (JSONException unused3) {
                c3440gi = null;
            }
        } else {
            str = str3;
            j10 = jLongValue;
            c3440gi = null;
        }
        return new Rf(asString2, asString, linkedHashMap, z10, asString3, z11, iIntValue, str, j10, asLong, c3440gi);
    }
}
