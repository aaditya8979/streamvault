package sg.bigo.ads.controller.b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import org.json.JSONObject;
import sg.bigo.ads.api.a.m;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final JSONObject f83088a;

    public j(@NonNull JSONObject jSONObject) {
        this.f83088a = jSONObject;
    }

    @Nullable
    private Object d(@NonNull String str) {
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length == 0) {
            return null;
        }
        JSONObject jSONObjectOptJSONObject = this.f83088a;
        for (int i10 = 0; i10 < strArrSplit.length - 1; i10++) {
            jSONObjectOptJSONObject = jSONObjectOptJSONObject.optJSONObject(strArrSplit[i10]);
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
        }
        return jSONObjectOptJSONObject.opt(strArrSplit[strArrSplit.length - 1]);
    }

    @Override // sg.bigo.ads.api.a.m
    public final int a(@NonNull String str) {
        Integer numA = sg.bigo.ads.common.utils.j.a(d(str));
        if (numA != null) {
            return numA.intValue();
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.a.m
    public final int a(@NonNull String str, int i10) {
        Integer numA = sg.bigo.ads.common.utils.j.a(d(str));
        return numA != null ? numA.intValue() : i10;
    }

    @Override // sg.bigo.ads.api.a.m
    public final m a(Map<String, String> map) {
        try {
            j jVar = new j(new JSONObject(this.f83088a.toString()));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String value = entry.getValue();
                String key = entry.getKey();
                JSONObject jSONObjectOptJSONObject = this.f83088a.optJSONObject(value);
                if (jSONObjectOptJSONObject != null) {
                    jVar.f83088a.put(key, jSONObjectOptJSONObject);
                }
                jVar.f83088a.remove(value);
                this.f83088a.remove(value);
            }
            return jVar;
        } catch (Exception unused) {
            return this;
        }
    }

    @Override // sg.bigo.ads.api.a.m
    public final float b(@NonNull String str) {
        Float fB = sg.bigo.ads.common.utils.j.b(d(str));
        if (fB != null) {
            return fB.floatValue();
        }
        return 0.0f;
    }

    @Override // sg.bigo.ads.api.a.m
    public final boolean c(@NonNull String str) {
        return a(str) == 1;
    }

    @NonNull
    public final String toString() {
        return this.f83088a.toString();
    }
}
