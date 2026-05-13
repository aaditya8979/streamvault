package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f16129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f16130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f16131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Skip f16132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f16133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TapAction f16134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Orientation f16135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f16136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f16137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public UnitDisplayType f16138j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f16139k = new ArrayList();

    public static j a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        j jVar = new j();
        int iOptInt = jSONObject.optInt(VastAttributes.MAX_BITRATE, Integer.MIN_VALUE);
        Integer numValueOf = Integer.valueOf(iOptInt);
        int iOptInt2 = jSONObject.optInt(VastAttributes.MIN_BITRATE, Integer.MIN_VALUE);
        Integer numValueOf2 = Integer.valueOf(iOptInt2);
        int iOptInt3 = jSONObject.optInt("pivotBitrate", Integer.MIN_VALUE);
        Integer numValueOf3 = Integer.valueOf(iOptInt3);
        int iOptInt4 = jSONObject.optInt(VastAttributes.PADDING, Integer.MIN_VALUE);
        Integer numValueOf4 = Integer.valueOf(iOptInt4);
        if (iOptInt == Integer.MIN_VALUE) {
            numValueOf = null;
        }
        jVar.f16130b = numValueOf;
        if (iOptInt2 == Integer.MIN_VALUE) {
            numValueOf2 = null;
        }
        jVar.f16131c = numValueOf2;
        jVar.f16132d = Skip.fromValue(Integer.valueOf(jSONObject.optInt("skip", Integer.MIN_VALUE)));
        jVar.f16133e = jSONObject.has("muted") ? Boolean.valueOf(jSONObject.optBoolean("muted", true)) : null;
        jVar.f16129a = jSONObject.has("autoPlay") ? Boolean.valueOf(jSONObject.optBoolean("autoPlay", true)) : null;
        jVar.f16135g = Orientation.fromValue(jSONObject.optString("orientation"));
        jVar.f16134f = TapAction.fromValue(jSONObject.optString("tap"));
        if (iOptInt3 == Integer.MIN_VALUE) {
            numValueOf3 = null;
        }
        jVar.f16136h = numValueOf3;
        jVar.f16137i = iOptInt4 != Integer.MIN_VALUE ? numValueOf4 : null;
        jVar.f16138j = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("filterApi");
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                int iOptInt5 = jSONArrayOptJSONArray.optInt(i10, Integer.MIN_VALUE);
                if (iOptInt5 != Integer.MIN_VALUE) {
                    jVar.f16139k.add(Integer.valueOf(iOptInt5));
                }
            }
        }
        return jVar;
    }
}
