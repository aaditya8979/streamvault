package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import io.bidmachine.ads.networks.adaptiverendering.measurer.AdMeasurerFactory;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class p7 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f9548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f9550d;

    private p7(String str, List list, String str2, Set set) {
        this.f9547a = str;
        this.f9548b = list;
        this.f9549c = str2;
        this.f9550d = set;
    }

    public static p7 a(p8 p8Var, s7 s7Var, com.applovin.impl.sdk.k kVar) {
        try {
            String str = (String) p8Var.a().get("vendor");
            p8 p8VarB = p8Var.b(VastTagName.VERIFICATION_PARAMETERS);
            String strD = p8VarB != null ? p8VarB.d() : null;
            List listA = p8Var.a(VastTagName.JAVA_SCRIPT_RESOURCE);
            ArrayList arrayList = new ArrayList(listA.size());
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                v7 v7VarA = v7.a((p8) it.next(), kVar);
                if (v7VarA != null) {
                    arrayList.add(v7VarA);
                }
            }
            HashMap map = new HashMap();
            a8.a(p8Var, map, s7Var, kVar);
            return new p7(str, arrayList, strD, (Set) map.get("verificationNotExecuted"));
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastAdVerification", "Error occurred while initializing", th2);
            }
            kVar.D().a("VastAdVerification", th2);
            return null;
        }
    }

    public static p7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "vendor_id", null);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "javascript_resources", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            v7 v7VarA = v7.a(JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), kVar);
            if (v7VarA != null) {
                arrayList.add(v7VarA);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, AdMeasurerFactory.VERIFICATION_PARAMETERS, null);
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "error_event_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            y7 y7VarA = y7.a(JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null), kVar);
            if (y7VarA != null) {
                hashSet.add(y7VarA);
            }
        }
        return new p7(string, arrayList, string2, hashSet);
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "vendor_id", this.f9547a);
        if (this.f9548b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f9548b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((v7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "javascript_resources", jSONArray);
        }
        JsonUtils.putString(jSONObject, AdMeasurerFactory.VERIFICATION_PARAMETERS, this.f9549c);
        if (this.f9550d != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f9550d.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((y7) it2.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_event_trackers", jSONArray2);
        }
        return jSONObject;
    }

    public Set b() {
        return this.f9550d;
    }

    public List c() {
        return this.f9548b;
    }

    public String d() {
        return this.f9547a;
    }

    public String e() {
        return this.f9549c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p7 p7Var = (p7) obj;
        String str = this.f9547a;
        if (str == null ? p7Var.f9547a != null : !str.equals(p7Var.f9547a)) {
            return false;
        }
        List list = this.f9548b;
        if (list == null ? p7Var.f9548b != null : !list.equals(p7Var.f9548b)) {
            return false;
        }
        String str2 = this.f9549c;
        if (str2 == null ? p7Var.f9549c != null : !str2.equals(p7Var.f9549c)) {
            return false;
        }
        Set set = this.f9550d;
        Set set2 = p7Var.f9550d;
        return set != null ? set.equals(set2) : set2 == null;
    }

    public int hashCode() {
        String str = this.f9547a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f9548b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f9549c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set set = this.f9550d;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f9547a + "'javascriptResources='" + this.f9548b + "'verificationParameters='" + this.f9549c + "'errorEventTrackers='" + this.f9550d + "'}";
    }
}
