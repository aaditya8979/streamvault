package io.appmetrica.analytics.idsync.impl;

import cn.f0;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements JsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f64873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64874b = "id_sync";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f64875c = "id_sync";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f64876d = "launch_delay_seconds";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f64877e = "requests";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f64878f = "type";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f64879g = "url";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f64880h = "headers";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f64881i = "resend_interval_for_valid_response";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f64882j = "resend_interval_for_invalid_response";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f64883k = "valid_response_codes";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f64884l = "preconditions";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f64885m = "network";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f64886n = "cell";

    public c(@NotNull e eVar) {
        this.f64873a = eVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig parse(@NotNull JSONObject jSONObject) {
        m[] mVarArr;
        JSONArray jSONArray;
        int i10;
        k[] kVarArr;
        JSONArray jSONArray2;
        int i11;
        JSONObject jSONObject2;
        byte[][] bArr;
        int[] iArr;
        int[] iArrF1;
        int i12;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(this.f64875c);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        o oVar = new o();
        oVar.f64919a = RemoteConfigJsonUtils.extractFeature(jSONObject, this.f64874b, oVar.f64919a);
        n nVar = new n();
        nVar.f64914a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject, this.f64876d, nVar.f64914a);
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(this.f64877e);
        int i13 = 0;
        if (jSONArrayOptJSONArray == null) {
            mVarArr = new m[0];
        } else {
            int length = jSONArrayOptJSONArray.length();
            m[] mVarArr2 = new m[length];
            int i14 = 0;
            while (i14 < length) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i14);
                m mVar = new m();
                if (jSONObjectOptJSONObject2 == null) {
                    jSONArray = jSONArrayOptJSONArray;
                    i10 = length;
                    i12 = i13;
                } else {
                    String strOptString = jSONObjectOptJSONObject2.optString(this.f64878f);
                    Charset charset = bo.c.f5639b;
                    mVar.f64906a = strOptString.getBytes(charset);
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(this.f64884l);
                    l lVar = new l();
                    if (jSONObjectOptJSONObject3 != null && tn.p.f(jSONObjectOptJSONObject3.optString(this.f64885m), this.f64886n)) {
                        lVar.f64904a = 1;
                    }
                    mVar.f64907b = lVar;
                    mVar.f64908c = jSONObjectOptJSONObject2.optString(this.f64879g).getBytes(charset);
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject2.optJSONObject(this.f64880h);
                    if (jSONObjectOptJSONObject4 == null) {
                        kVarArr = new k[i13];
                        jSONArray = jSONArrayOptJSONArray;
                        i10 = length;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        Iterator<String> itKeys = jSONObjectOptJSONObject4.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            k kVar = new k();
                            kVar.f64901a = next.getBytes(bo.c.f5639b);
                            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject4.optJSONArray(next);
                            if (jSONArrayOptJSONArray2 == null) {
                                bArr = new byte[i13][];
                                jSONArray2 = jSONArrayOptJSONArray;
                                i11 = length;
                                jSONObject2 = jSONObjectOptJSONObject4;
                            } else {
                                int length2 = jSONArrayOptJSONArray2.length();
                                byte[][] bArr2 = new byte[length2][];
                                jSONArray2 = jSONArrayOptJSONArray;
                                int i15 = 0;
                                while (i15 < length2) {
                                    bArr2[i15] = jSONArrayOptJSONArray2.optString(i15).getBytes(bo.c.f5639b);
                                    i15++;
                                    length = length;
                                    jSONObjectOptJSONObject4 = jSONObjectOptJSONObject4;
                                }
                                i11 = length;
                                jSONObject2 = jSONObjectOptJSONObject4;
                                bArr = bArr2;
                            }
                            kVar.f64902b = bArr;
                            arrayList.add(kVar);
                            jSONArrayOptJSONArray = jSONArray2;
                            length = i11;
                            jSONObjectOptJSONObject4 = jSONObject2;
                            i13 = 0;
                        }
                        jSONArray = jSONArrayOptJSONArray;
                        i10 = length;
                        Object[] array = arrayList.toArray(new k[i13]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        kVarArr = (k[]) array;
                    }
                    mVar.f64909d = kVarArr;
                    mVar.f64910e = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject2, this.f64881i, mVar.f64910e);
                    mVar.f64911f = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject2, this.f64882j, mVar.f64911f);
                    JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray(this.f64883k);
                    if (jSONArrayOptJSONArray3 == null) {
                        iArr = new int[0];
                    } else {
                        int length3 = jSONArrayOptJSONArray3.length();
                        int[] iArr2 = new int[length3];
                        for (int i16 = 0; i16 < length3; i16++) {
                            iArr2[i16] = jSONArrayOptJSONArray3.optInt(i16);
                        }
                        iArr = iArr2;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i17 : iArr) {
                        if (i17 != 0) {
                            arrayList2.add(Integer.valueOf(i17));
                        }
                    }
                    if (!(!arrayList2.isEmpty())) {
                        arrayList2 = null;
                    }
                    if (arrayList2 == null || (iArrF1 = f0.f1(arrayList2)) == null) {
                        i12 = 0;
                        iArrF1 = new int[]{200};
                    } else {
                        i12 = 0;
                    }
                    mVar.f64912g = iArrF1;
                }
                mVarArr2[i14] = mVar;
                i14++;
                i13 = i12;
                jSONArrayOptJSONArray = jSONArray;
                length = i10;
            }
            mVarArr = mVarArr2;
        }
        nVar.f64915b = mVarArr;
        oVar.f64920b = nVar;
        return this.f64873a.toModel(oVar);
    }

    @Nullable
    public final IdSyncConfig b(@NotNull JSONObject jSONObject) {
        return (IdSyncConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (IdSyncConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
