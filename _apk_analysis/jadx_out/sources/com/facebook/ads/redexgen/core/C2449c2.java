package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2449c2 {
    public final String A00;
    public final ArrayList<String> A01;
    public final ArrayList<String> A02;
    public final ArrayList<String> A03;
    public final JSONObject A04;
    public final boolean A05;

    public C2449c2(JSONObject jSONObject, String str, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, boolean z10) {
        this.A04 = jSONObject;
        this.A00 = str;
        this.A02 = arrayList;
        this.A03 = arrayList2;
        this.A01 = arrayList3;
        this.A05 = z10;
    }
}
