package com.inmobi.media;

import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class G6 {
    public static final JSONObject a(F6 f62) throws JSONException {
        tn.p.k(f62, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(VastAttributes.HORIZONTAL_POSITION, Float.valueOf(F3.a(f62.f25415a)));
        jSONObject.put(VastAttributes.VERTICAL_POSITION, Float.valueOf(F3.a(f62.f25416b)));
        jSONObject.put("width", f62.f25417c);
        jSONObject.put("height", f62.f25418d);
        return jSONObject;
    }
}
