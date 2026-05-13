package com.bytedance.sdk.openadsdk.core.ryl;

import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.ryl.lh.ouw;
import com.bytedance.sdk.openadsdk.core.ryl.vt.lh;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class lh {
    public String bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public vpp f13925cf;
    public String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> f13926le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public ouw.EnumC0241ouw f13927lh;
    public int ouw;
    public String pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> f13928ra;
    private final AtomicBoolean ryl = new AtomicBoolean(false);
    public String tlj = "endcard_click";
    public int vt;
    public ouw.vt yu;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ryl.lh$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[ouw.vt.values().length];
            ouw = iArr;
            try {
                iArr[ouw.vt.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[ouw.vt.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ouw[ouw.vt.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public lh(int i10, int i11, ouw.EnumC0241ouw enumC0241ouw, ouw.vt vtVar, String str, List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list, List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list2, String str2) {
        this.f13926le = new ArrayList();
        this.f13928ra = new ArrayList();
        this.ouw = i10;
        this.vt = i11;
        this.f13927lh = enumC0241ouw;
        this.yu = vtVar;
        this.fkw = str;
        this.f13926le = list;
        this.f13928ra = list2;
        this.pno = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float ouw(int r1, int r2, int r3, int r4, com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt r5, com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0241ouw r6) {
        /*
            r0 = 0
            if (r2 == 0) goto L4b
            if (r4 != 0) goto L6
            goto L4b
        L6:
            float r1 = (float) r1
            float r2 = (float) r2
            float r2 = r1 / r2
            float r3 = (float) r3
            float r4 = (float) r4
            float r4 = r3 / r4
            float r2 = r2 - r4
            float r2 = java.lang.Math.abs(r2)
            float r3 = r1 - r3
            float r3 = r3 / r1
            float r1 = java.lang.Math.abs(r3)
            float r2 = r2 + r1
            int[] r1 = com.bytedance.sdk.openadsdk.core.ryl.lh.AnonymousClass1.ouw
            int r3 = r5.ordinal()
            r1 = r1[r3]
            r3 = 1
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r1 == r3) goto L35
            r3 = 2
            if (r1 == r3) goto L31
            r3 = 3
            if (r1 == r3) goto L2f
            goto L49
        L2f:
            r0 = r4
            goto L49
        L31:
            r0 = 1067030938(0x3f99999a, float:1.2)
            goto L49
        L35:
            com.bytedance.sdk.openadsdk.core.ryl.lh.ouw$ouw r1 = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0241ouw.JAVASCRIPT
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L3e
            goto L2f
        L3e:
            com.bytedance.sdk.openadsdk.core.ryl.lh.ouw$ouw r1 = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0241ouw.IMAGE
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L49
            r0 = 1061997773(0x3f4ccccd, float:0.8)
        L49:
            float r2 = r2 + r4
            float r0 = r0 / r2
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ryl.lh.ouw(int, int, int, int, com.bytedance.sdk.openadsdk.core.ryl.lh.ouw$vt, com.bytedance.sdk.openadsdk.core.ryl.lh.ouw$ouw):float");
    }

    public static lh vt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("width");
        int iOptInt2 = jSONObject.optInt("height");
        String strOptString = jSONObject.optString("creativeType", ouw.EnumC0241ouw.NONE.toString());
        String strOptString2 = jSONObject.optString("resourceType", ouw.vt.HTML_RESOURCE.toString());
        String strOptString3 = jSONObject.optString("contentUrl");
        String strOptString4 = jSONObject.optString("clickThroughUri");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            arrayList.add(new lh.ouw(jSONArrayOptJSONArray.optString(i10)).ouw());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
            arrayList2.add(new lh.ouw(jSONArrayOptJSONArray2.optString(i11)).ouw());
        }
        return new lh(iOptInt, iOptInt2, ouw.EnumC0241ouw.valueOf(strOptString), ouw.vt.valueOf(strOptString2), strOptString3, arrayList, arrayList2, strOptString4);
    }

    public final String fkw() {
        if (this.yu == ouw.vt.STATIC_RESOURCE && this.f13927lh == ouw.EnumC0241ouw.IMAGE) {
            return this.fkw;
        }
        return null;
    }

    public final String le() {
        return this.fkw;
    }

    public final int lh() {
        return this.vt;
    }

    public JSONObject ouw() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", this.ouw);
        jSONObject.put("height", this.vt);
        jSONObject.put("creativeType", this.f13927lh.toString());
        jSONObject.put("resourceType", this.yu.toString());
        jSONObject.put("contentUrl", this.fkw);
        jSONObject.put("clickThroughUri", this.pno);
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.f13926le));
        jSONObject.put("creativeViewTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.f13928ra));
        return jSONObject;
    }

    public final void ouw(long j10) {
        com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(null, this.f13926le, null, j10, this.bly, new lh.vt(this.tlj, this.f13925cf), null);
    }

    public final int vt() {
        return this.ouw;
    }

    public final void vt(long j10) {
        if (this.ryl.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.ryl.vt.lh.vt(null, this.f13928ra, null, j10, this.bly, null);
        }
    }

    public final String yu() {
        int i10 = AnonymousClass1.ouw[this.yu.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return this.fkw;
            }
            if (i10 != 3) {
                return null;
            }
            return "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.ouw + "\" height=\"" + this.vt + "\" src=\"" + this.fkw + "\"></iframe>";
        }
        ouw.EnumC0241ouw enumC0241ouw = this.f13927lh;
        if (enumC0241ouw == ouw.EnumC0241ouw.IMAGE) {
            return "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.fkw + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
        }
        if (enumC0241ouw != ouw.EnumC0241ouw.JAVASCRIPT) {
            return null;
        }
        return "<script src=\"" + this.fkw + "\"></script>";
    }
}
