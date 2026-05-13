package com.applovin.impl.mediation;

import android.text.TextUtils;
import com.applovin.impl.k3;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import com.safedk.android.utils.SdksMapping;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f9130c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f9128a = Collections.synchronizedMap(new HashMap(16));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f9131d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f9132e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f9133f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f9134g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f9135h = new HashSet();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final MaxAdFormat f9138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final JSONObject f9139d;

        public a(String str, String str2, y2 y2Var, com.applovin.impl.sdk.k kVar) {
            this.f9136a = str;
            this.f9137b = str2;
            JSONObject jSONObject = new JSONObject();
            this.f9139d = jSONObject;
            JsonUtils.putString(jSONObject, SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (y2Var == null) {
                this.f9138c = null;
            } else {
                this.f9138c = y2Var.getFormat();
                JsonUtils.putString(jSONObject, "format", y2Var.getFormat().getLabel());
            }
        }

        public JSONObject a() {
            return this.f9139d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f9136a.equals(aVar.f9136a) || !this.f9137b.equals(aVar.f9137b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.f9138c;
            MaxAdFormat maxAdFormat2 = aVar.f9138c;
            return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
        }

        public int hashCode() {
            int iHashCode = ((this.f9136a.hashCode() * 31) + this.f9137b.hashCode()) * 31;
            MaxAdFormat maxAdFormat = this.f9138c;
            return iHashCode + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.f9136a + "', operationTag='" + this.f9137b + "', format=" + this.f9138c + '}';
        }
    }

    public g(com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f9129b = kVar;
        this.f9130c = kVar.O();
    }

    private h a(k3 k3Var, Class cls, boolean z10) {
        try {
            return new h(k3Var, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.f9129b.y0()), z10, this.f9129b);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("MediationAdapterManager", "Failed to load adapter: " + k3Var, th2);
            return null;
        }
    }

    private Class a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            com.applovin.impl.sdk.o.h("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public h a(k3 k3Var) {
        return a(k3Var, false);
    }

    public h a(k3 k3Var, boolean z10) {
        Class clsA;
        h hVar;
        if (k3Var == null) {
            throw new IllegalArgumentException("No adapter spec specified");
        }
        String strC = k3Var.c();
        String strB = k3Var.b();
        if (TextUtils.isEmpty(strC)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9130c.b("MediationAdapterManager", "No adapter name provided for " + strB + ", not loading the adapter ");
            }
            return null;
        }
        if (TextUtils.isEmpty(strB)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9130c.b("MediationAdapterManager", "Unable to find default className for '" + strC + "'");
            }
            return null;
        }
        if (z10 && (hVar = (h) this.f9128a.get(strB)) != null) {
            return hVar;
        }
        synchronized (this.f9131d) {
            if (this.f9133f.contains(strB)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9130c.a("MediationAdapterManager", "Not attempting to load " + strC + " due to prior errors");
                }
                return null;
            }
            if (this.f9132e.containsKey(strB)) {
                clsA = (Class) this.f9132e.get(strB);
            } else {
                clsA = a(strB);
                if (clsA == null) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f9130c.k("MediationAdapterManager", "Adapter " + strC + " could not be loaded, class " + strB + " not found");
                    }
                    this.f9133f.add(strB);
                    return null;
                }
            }
            h hVarA = a(k3Var, clsA, z10);
            if (hVarA == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9130c.b("MediationAdapterManager", "Failed to load " + strC);
                }
                this.f9133f.add(strB);
                return null;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f9130c.a("MediationAdapterManager", "Loaded " + strC);
            }
            this.f9132e.put(strB, clsA);
            if (z10) {
                this.f9128a.put(k3Var.b(), hVarA);
            }
            return hVarA;
        }
    }

    public Collection a() {
        ArrayList arrayList;
        synchronized (this.f9134g) {
            arrayList = new ArrayList(this.f9135h.size());
            Iterator it = this.f9135h.iterator();
            while (it.hasNext()) {
                arrayList.add(((a) it.next()).a());
            }
        }
        return arrayList;
    }

    public void a(String str, String str2, y2 y2Var) {
        synchronized (this.f9134g) {
            this.f9129b.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f9129b.O().b("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
            }
            this.f9135h.add(new a(str, str2, y2Var, this.f9129b));
        }
    }

    public Collection b() {
        Set setUnmodifiableSet;
        synchronized (this.f9131d) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f9133f);
        }
        return setUnmodifiableSet;
    }

    public Collection c() {
        Set setUnmodifiableSet;
        synchronized (this.f9131d) {
            HashSet hashSet = new HashSet(this.f9132e.size());
            Iterator it = this.f9132e.values().iterator();
            while (it.hasNext()) {
                hashSet.add(((Class) it.next()).getName());
            }
            setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        }
        return setUnmodifiableSet;
    }
}
