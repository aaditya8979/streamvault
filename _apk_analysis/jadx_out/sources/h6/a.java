package h6;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s7.m0;

/* JADX INFO: compiled from: ClearKeyUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static byte[] a(byte[] bArr) {
        return m0.f79487a >= 27 ? bArr : m0.h0(c(m0.A(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (m0.f79487a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(m0.A(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(StringUtils.COMMA);
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(d(jSONObject2.getString(CampaignEx.JSON_KEY_AD_K)));
                sb2.append("\",\"kid\":\"");
                sb2.append(d(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return m0.h0(sb2.toString());
        } catch (JSONException e10) {
            s7.q.d("ClearKeyUtil", "Failed to adjust response data: " + m0.A(bArr), e10);
            return bArr;
        }
    }

    public static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    public static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
