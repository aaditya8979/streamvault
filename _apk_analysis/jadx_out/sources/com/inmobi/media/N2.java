package com.inmobi.media;

import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoWcdma;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class N2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25982c;

    public N2() {
    }

    public N2(CellInfo cellInfo, String str, String str2, int i10) {
        tn.p.k(str, "mcc");
        tn.p.k(str2, "mnc");
        if (cellInfo instanceof CellInfoGsm) {
            this.f25982c = i10;
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            this.f25981b = cellInfoGsm.getCellSignalStrength().getDbm();
            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            tn.p.j(cellIdentity, "getCellIdentity(...)");
            this.f25980a = a(str, str2, cellIdentity.getLac(), cellIdentity.getCid(), -1, Integer.MAX_VALUE);
            return;
        }
        if (cellInfo instanceof CellInfoCdma) {
            this.f25982c = i10;
            CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
            this.f25981b = cellInfoCdma.getCellSignalStrength().getDbm();
            CellIdentityCdma cellIdentity2 = cellInfoCdma.getCellIdentity();
            tn.p.j(cellIdentity2, "getCellIdentity(...)");
            this.f25980a = a(str, cellIdentity2.getSystemId(), cellIdentity2.getNetworkId(), cellIdentity2.getBasestationId());
            return;
        }
        if (cellInfo instanceof CellInfoWcdma) {
            this.f25982c = i10;
            CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
            this.f25981b = cellInfoWcdma.getCellSignalStrength().getDbm();
            CellIdentityWcdma cellIdentity3 = cellInfoWcdma.getCellIdentity();
            tn.p.j(cellIdentity3, "getCellIdentity(...)");
            this.f25980a = a(str, str2, cellIdentity3.getLac(), cellIdentity3.getCid(), cellIdentity3.getPsc(), Integer.MAX_VALUE);
        }
    }

    public static String a(String str, int i10, int i11, int i12) {
        tn.p.k(str, "mcc");
        return str + "#" + i10 + "#" + i11 + "#" + i12;
    }

    public static String a(String str, String str2, int i10, int i11, int i12, int i13) {
        tn.p.k(str, "mcc");
        tn.p.k(str2, "mnc");
        return str + "#" + str2 + "#" + i10 + "#" + i11 + "#" + (i12 == -1 ? "" : Integer.valueOf(i12)) + "#" + (i13 != Integer.MAX_VALUE ? Integer.valueOf(i13) : "");
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f25980a);
            int i10 = this.f25981b;
            if (i10 != Integer.MAX_VALUE) {
                jSONObject.put("ss", i10);
            }
            jSONObject.put("nt", this.f25982c);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
