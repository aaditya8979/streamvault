package com.applovin.impl;

import androidx.arch.core.util.Function;
import androidx.core.util.Consumer;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f8419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8420b = new Object();

    public h5(JSONObject jSONObject) {
        this.f8419a = jSONObject;
    }

    public float a(String str, float f10) {
        float f11;
        synchronized (this.f8420b) {
            f11 = JsonUtils.getFloat(this.f8419a, str, f10);
        }
        return f11;
    }

    public int a(String str, int i10) {
        int i11;
        synchronized (this.f8420b) {
            i11 = JsonUtils.getInt(this.f8419a, str, i10);
        }
        return i11;
    }

    public long a(String str, long j10) {
        long j11;
        synchronized (this.f8420b) {
            j11 = JsonUtils.getLong(this.f8419a, str, j10);
        }
        return j11;
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f8420b) {
            bool2 = JsonUtils.getBoolean(this.f8419a, str, bool);
        }
        return bool2;
    }

    public Object a(Function function) {
        Object objApply;
        synchronized (this.f8420b) {
            objApply = function.apply(this);
        }
        return objApply;
    }

    public String a(String str, String str2) {
        String string;
        synchronized (this.f8420b) {
            string = JsonUtils.getString(this.f8419a, str, str2);
        }
        return string;
    }

    public List a(String str, List list) {
        List<Integer> integerList;
        synchronized (this.f8420b) {
            integerList = JsonUtils.getIntegerList(this.f8419a, str, list);
        }
        return integerList;
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f8420b) {
            jSONArray2 = JsonUtils.getJSONArray(this.f8419a, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject a() {
        JSONObject jSONObjectDeepCopy;
        synchronized (this.f8420b) {
            jSONObjectDeepCopy = JsonUtils.deepCopy(this.f8419a);
        }
        return jSONObjectDeepCopy;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f8420b) {
            jSONObject2 = JsonUtils.getJSONObject(this.f8419a, str, jSONObject);
        }
        return jSONObject2;
    }

    public void a(Consumer consumer) {
        synchronized (this.f8420b) {
            consumer.accept(this);
        }
    }

    public void a(String str, Object obj) {
        synchronized (this.f8420b) {
            JsonUtils.putObject(this.f8419a, str, obj);
        }
    }

    public void a(String str, boolean z10) {
        synchronized (this.f8420b) {
            JsonUtils.putBoolean(this.f8419a, str, z10);
        }
    }

    public boolean a(String str) {
        boolean zHas;
        synchronized (this.f8420b) {
            zHas = this.f8419a.has(str);
        }
        return zHas;
    }

    public Object b(String str) {
        Object objOpt;
        synchronized (this.f8420b) {
            objOpt = this.f8419a.opt(str);
        }
        return objOpt;
    }

    public List b(String str, List list) {
        List<String> stringList;
        synchronized (this.f8420b) {
            stringList = JsonUtils.getStringList(this.f8419a, str, list);
        }
        return stringList;
    }

    public void b(String str, int i10) {
        synchronized (this.f8420b) {
            JsonUtils.putInt(this.f8419a, str, i10);
        }
    }

    public void b(String str, long j10) {
        synchronized (this.f8420b) {
            JsonUtils.putLong(this.f8419a, str, j10);
        }
    }

    public void b(String str, String str2) {
        synchronized (this.f8420b) {
            JsonUtils.putString(this.f8419a, str, str2);
        }
    }

    public void c(String str) {
        synchronized (this.f8420b) {
            this.f8419a.remove(str);
        }
    }

    public String toString() {
        String string;
        synchronized (this.f8420b) {
            string = this.f8419a.toString();
        }
        return string;
    }
}
