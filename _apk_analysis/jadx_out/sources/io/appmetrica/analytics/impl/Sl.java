package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class Sl implements NetworkResponseHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Zl f65890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W2 f65891b;

    public Sl() {
        this(new Zl(), new W2());
    }

    public Sl(Zl zl2, W2 w22) {
        this.f65890a = zl2;
        this.f65891b = w22;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4765em handle(@NonNull ResponseDataHolder responseDataHolder) {
        String strOptString;
        if (200 == responseDataHolder.getResponseCode()) {
            byte[] responseData = responseDataHolder.getResponseData();
            Map<String, List<String>> responseHeaders = responseDataHolder.getResponseHeaders();
            List list = responseHeaders != null ? (List) CollectionUtils.getFromMapIgnoreCase(responseHeaders, "Content-Encoding") : null;
            if (!mo.a((Collection) list) && "encrypted".equals(list.get(0))) {
                responseData = this.f65891b.a(responseDataHolder.getResponseData());
            }
            if (responseData != null) {
                Zl zl2 = this.f65890a;
                zl2.getClass();
                C4765em c4765em = new C4765em();
                try {
                    zl2.f66321h.getClass();
                    C4806gb c4806gb = new C4806gb(new String(responseData, "UTF-8"));
                    JSONObject jSONObjectOptJSONObject = c4806gb.optJSONObject("device_id");
                    String strOptString2 = "";
                    if (jSONObjectOptJSONObject != null) {
                        strOptString2 = jSONObjectOptJSONObject.optString("hash");
                        strOptString = jSONObjectOptJSONObject.optString("value");
                    } else {
                        strOptString = "";
                    }
                    c4765em.f66697h = strOptString;
                    c4765em.f66698i = strOptString2;
                    zl2.a(c4765em, c4806gb);
                    c4765em.f66690a = TextUtils.isEmpty(c4765em.f66698i) ? 1 : 2;
                } catch (Throwable unused) {
                    c4765em = new C4765em();
                    c4765em.f66690a = 1;
                }
                if (2 == c4765em.f66690a) {
                    return c4765em;
                }
            }
        }
        return null;
    }
}
