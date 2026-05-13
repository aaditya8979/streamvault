package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.ironsource.C3978d4;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Pg extends Sg {
    public Pg(Y4 y42) {
        super(y42);
    }

    public static boolean a(String str, String str2, C4976n2 c4976n2) {
        Object obj;
        if ("reattribution".equals(str) && "1".equals(str2)) {
            return true;
        }
        if (c4976n2 == null) {
            return false;
        }
        for (Pair pair : c4976n2.f67319a) {
            if (mo.a(pair.first, str) && ((obj = pair.second) == null || ((C4951m2) obj).f67254a.equals(str2))) {
                return true;
            }
        }
        return false;
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q52) {
        String value = q52.getValue();
        if (TextUtils.isEmpty(value)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(value);
            if (!"open".equals(jSONObject.optString("type"))) {
                return false;
            }
            yo yoVar = this.f65880a.f66233t;
            synchronized (yoVar) {
                yoVar.c(yoVar.b() + 1);
            }
            if (!a(jSONObject.optString("link"))) {
                return false;
            }
            q52.f65801n = Boolean.TRUE;
            b();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    C4976n2 c4976n2 = this.f65880a.t().f66870y;
                    for (String str2 : Uri.decode(queryParameter).split(C3978d4.j.f31381c)) {
                        String strDecode = Uri.decode(str2);
                        int iIndexOf = strDecode.indexOf("=");
                        if (iIndexOf >= 0 && a(Uri.decode(strDecode.substring(0, iIndexOf)), Uri.decode(strDecode.substring(iIndexOf + 1)), c4976n2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public final void b() {
        yo yoVar = this.f65880a.f66233t;
        synchronized (yoVar) {
            yoVar.a(yoVar.a() + 1);
        }
        this.f65880a.z();
        N8 n82 = this.f65880a.f66225l;
        if (n82.f65631c == null) {
            n82.a();
        }
        P8 p82 = n82.f65631c;
        p82.getClass();
        p82.f65742b = new HashSet();
        p82.f65744d = 0;
        P8 p83 = n82.f65631c;
        p83.f65741a = true;
        S8 s82 = n82.f65630b;
        IBinaryDataHelper iBinaryDataHelper = s82.f65872c;
        R8 r82 = s82.f65871b;
        s82.f65870a.getClass();
        iBinaryDataHelper.insert("event_hashes", r82.toByteArray(Q8.a(p83)));
    }
}
