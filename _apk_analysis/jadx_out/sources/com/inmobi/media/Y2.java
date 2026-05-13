package com.inmobi.media;

import android.content.ContentValues;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Y2 {
    public static final ContentValues a(S2 s22) {
        String string;
        tn.p.k(s22, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(s22.f26274a));
        contentValues.put("url", s22.f26275b);
        contentValues.put("pending_attempts", Integer.valueOf(s22.f26279f));
        contentValues.put("ts", Long.valueOf(s22.f26280g));
        contentValues.put("created_ts", Long.valueOf(s22.f26281h));
        contentValues.put("follow_redirect", Boolean.valueOf(s22.f26277d));
        contentValues.put("ping_in_webview", Boolean.valueOf(s22.f26278e));
        Map map = s22.f26276c;
        if (map != null && !map.isEmpty()) {
            try {
                Map map2 = s22.f26276c;
                tn.p.i(map2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                string = new JSONObject(map2).toString();
            } catch (Exception unused) {
                string = "";
            }
            tn.p.h(string);
            contentValues.put("track_extras", string);
        }
        return contentValues;
    }
}
