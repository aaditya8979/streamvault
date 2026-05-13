package com.bytedance.sdk.openadsdk.zih;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.qbp;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ouw implements Comparable<ouw> {
    private int fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private long f14531jg;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f14534lh;
    public final String ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f14535ra;
    private final ArrayList<Long> vt = new ArrayList<>();
    private final ArrayList<Long> yu = new ArrayList<>();

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final ArrayList<Long> f14533le = new ArrayList<>();
    private final ArrayList<Long> pno = new ArrayList<>();
    private final HashMap<String, vt> bly = new HashMap<>();
    private int tlj = 0;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f14530cf = 0;
    private final HashMap<String, vt> ryl = new HashMap<>();
    private int mwh = 0;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final ArrayList<String> f14532ko = new ArrayList<>();

    public ouw(String str) {
        this.ouw = str;
    }

    private static void ouw(String str, JSONObject jSONObject, ArrayList<Long> arrayList, int[] iArr, long j10, JSONObject jSONObject2) throws JSONException {
        int size = arrayList.size() - 1;
        int i10 = 0;
        for (int i11 : iArr) {
            long j11 = j10 - (((long) i11) * 60000);
            while (size >= 0 && arrayList.get(size).longValue() >= j11) {
                i10++;
                size--;
            }
            if (i10 != 0) {
                jSONObject.put(str + i11, i10);
                int iOptInt = jSONObject2.optInt(str + i11) + i10;
                if (iOptInt != 0) {
                    jSONObject2.put(str + i11, iOptInt);
                }
            }
        }
        while (size >= 0) {
            arrayList.remove(0);
            size--;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0103 A[PHI: r10 r14
      0x0103: PHI (r10v3 int) = (r10v2 int), (r10v5 int), (r10v5 int) binds: [B:34:0x00e2, B:39:0x00f6, B:41:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      0x0103: PHI (r14v2 long) = (r14v1 long), (r14v4 long), (r14v4 long) binds: [B:34:0x00e2, B:39:0x00f6, B:41:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ouw(@androidx.annotation.NonNull org.json.JSONObject r25, org.json.JSONObject r26) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.zih.ouw.ouw(org.json.JSONObject, org.json.JSONObject):void");
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ouw ouwVar) {
        return ouwVar.f14534lh - this.f14534lh;
    }

    public final JSONObject ouw(JSONObject jSONObject) {
        int i10;
        int i11;
        int i12;
        JSONObject jSONObject2 = new JSONObject();
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ouw("show_c_", jSONObject2, this.vt, com.bytedance.sdk.openadsdk.le.ouw.ouw().yu, jElapsedRealtime, jSONObject);
            ouw("click_c_", jSONObject2, this.yu, com.bytedance.sdk.openadsdk.le.ouw.ouw().fkw, jElapsedRealtime, jSONObject);
            ouw("v_play_c_", jSONObject2, this.f14533le, com.bytedance.sdk.openadsdk.le.ouw.ouw().f14153le, jElapsedRealtime, jSONObject);
            ouw("dislike_c_", jSONObject2, this.pno, com.bytedance.sdk.openadsdk.le.ouw.ouw().f14150cf, jElapsedRealtime, jSONObject);
            if (com.bytedance.sdk.openadsdk.le.ouw.ouw().ouw && (i12 = this.f14534lh) != 0) {
                jSONObject2.put("show_c_s", i12);
                int iOptInt = jSONObject.optInt("show_c_s") + this.f14534lh;
                if (iOptInt != 0) {
                    jSONObject.put("show_c_s", iOptInt);
                }
            }
            if (com.bytedance.sdk.openadsdk.le.ouw.ouw().vt && (i11 = this.fkw) != 0) {
                jSONObject2.put("click_c_s", i11);
                int iOptInt2 = jSONObject.optInt("click_c_s") + this.fkw;
                if (iOptInt2 != 0) {
                    jSONObject.put("click_c_s", iOptInt2);
                }
            }
            if (com.bytedance.sdk.openadsdk.le.ouw.ouw().f14154lh && (i10 = this.f14535ra) != 0) {
                jSONObject2.put("v_play_c_s", i10);
                int iOptInt3 = jSONObject.optInt("v_play_c_s") + this.f14535ra;
                if (iOptInt3 != 0) {
                    jSONObject.put("v_play_c_s", iOptInt3);
                }
            }
            ouw(jSONObject2, jSONObject);
        } catch (Throwable th2) {
            qbp.yu(th2.getMessage(), new Object[0]);
        }
        return jSONObject2;
    }

    public final void ouw() {
        this.f14531jg = SystemClock.elapsedRealtime();
        this.f14530cf = 0;
        this.fkw = 0;
        this.f14534lh = 0;
        this.mwh = 0;
        this.tlj = 0;
        this.f14535ra = 0;
    }

    public final void ouw(@NonNull String str, @Nullable String str2) {
        vt vtVar;
        vt vtVar2;
        vt vtVar3;
        vt vtVar4;
        vt vtVar5;
        vt vtVar6;
        str.hashCode();
        switch (str) {
            case "landingContinue":
                if (!TextUtils.isEmpty(str2) && (vtVar = this.ryl.get(str2)) != null) {
                    vtVar.yu(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingPause":
                if (!TextUtils.isEmpty(str2) && (vtVar2 = this.ryl.get(str2)) != null) {
                    vtVar2.lh(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingStart":
                if (!TextUtils.isEmpty(str2) && this.ryl.get(str2) == null) {
                    vt vtVar7 = new vt();
                    this.ryl.put(str2, vtVar7);
                    vtVar7.ouw(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_over":
            case "feed_break":
            case "videoForceBreak":
            case "play_error":
                if (!TextUtils.isEmpty(str2) && (vtVar3 = this.bly.get(str2)) != null && vtVar3.f14537le != vt.fkw) {
                    vtVar3.vt(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.le.ouw.ouw().tlj) {
                        this.tlj = (int) (((long) this.tlj) + vtVar3.ouw(this.f14531jg, SystemClock.elapsedRealtime()));
                    }
                    break;
                }
                break;
            case "feed_play":
                this.f14533le.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.le.ouw.ouw().f14154lh) {
                    this.f14535ra++;
                }
                if (!TextUtils.isEmpty(str2) && this.bly.get(str2) == null) {
                    vt vtVar8 = new vt();
                    this.bly.put(str2, vtVar8);
                    vtVar8.ouw(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "show":
                this.vt.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.le.ouw.ouw().ouw) {
                    this.f14534lh++;
                    break;
                }
                break;
            case "click":
                if (!this.f14532ko.contains(str2)) {
                    if (this.f14532ko.size() > 50) {
                        this.f14532ko.subList(0, 25).clear();
                    }
                    this.f14532ko.add(str2);
                    this.yu.add(Long.valueOf(SystemClock.elapsedRealtime()));
                    if (com.bytedance.sdk.openadsdk.le.ouw.ouw().vt) {
                        this.fkw++;
                    }
                    break;
                }
                break;
            case "feed_continue":
                if (!TextUtils.isEmpty(str2) && (vtVar4 = this.bly.get(str2)) != null) {
                    vtVar4.yu(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_pause":
                if (!TextUtils.isEmpty(str2) && (vtVar5 = this.bly.get(str2)) != null) {
                    vtVar5.lh(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingFinish":
                if (!TextUtils.isEmpty(str2) && (vtVar6 = this.ryl.get(str2)) != null && vtVar6.f14537le != vt.fkw) {
                    vtVar6.vt(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.le.ouw.ouw().bly) {
                        this.mwh = (int) (((long) this.mwh) + vtVar6.ouw(this.f14531jg, SystemClock.elapsedRealtime()));
                    }
                    break;
                }
                break;
            case "videoPercent30":
                if (com.bytedance.sdk.openadsdk.le.ouw.ouw().ryl) {
                    this.f14530cf++;
                    break;
                }
                break;
            case "dislike":
                this.pno.add(Long.valueOf(SystemClock.elapsedRealtime()));
                break;
        }
    }
}
