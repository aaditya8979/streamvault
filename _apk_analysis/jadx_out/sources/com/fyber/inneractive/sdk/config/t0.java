package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.b1;
import com.fyber.inneractive.sdk.util.c1;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f16149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f16150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f16151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f16152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Orientation f16153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f16154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f16155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Skip f16156h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TapAction f16157i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public UnitDisplayType f16158j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f16159k;

    public t0() {
        Boolean bool = Boolean.TRUE;
        this.f16149a = bool;
        this.f16150b = 5000;
        this.f16151c = 0;
        this.f16152d = bool;
        this.f16154f = 0;
        this.f16155g = 2048;
        this.f16156h = Skip.fromValue(0);
        this.f16159k = new ArrayList();
    }

    @Override // com.fyber.inneractive.sdk.util.b1
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        c1.a(jSONObject, "autoPlay", this.f16149a);
        c1.a(jSONObject, VastAttributes.MAX_BITRATE, this.f16150b);
        c1.a(jSONObject, VastAttributes.MIN_BITRATE, this.f16151c);
        c1.a(jSONObject, "muted", this.f16152d);
        c1.a(jSONObject, "orientation", this.f16153e);
        c1.a(jSONObject, VastAttributes.PADDING, this.f16154f);
        c1.a(jSONObject, "pivotBitrate", this.f16155g);
        c1.a(jSONObject, "skip", this.f16156h);
        c1.a(jSONObject, "tapAction", this.f16157i);
        c1.a(jSONObject, "unitDisplayType", this.f16158j);
        JSONArray jSONArray = new JSONArray();
        List<Integer> list = this.f16159k;
        if (list != null) {
            for (Integer num : list) {
                if (num != null) {
                    jSONArray.put(num);
                }
            }
        }
        c1.a(jSONObject, "filterApi", jSONArray);
        return jSONObject;
    }
}
