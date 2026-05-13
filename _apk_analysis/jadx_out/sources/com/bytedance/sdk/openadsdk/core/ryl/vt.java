package com.bytedance.sdk.openadsdk.core.ryl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.core.ryl.lh.ouw;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class vt extends lh {
    private long mwh;
    private long ryl;

    public vt(int i10, int i11, long j10, long j11, ouw.EnumC0241ouw enumC0241ouw, ouw.vt vtVar, String str, List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list, List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list2, String str2) {
        super(i10, i11, enumC0241ouw, vtVar, str, list, list2, str2);
        this.ryl = j10;
        this.mwh = j11;
        this.tlj = "icon_click";
    }

    public static vt ouw(JSONObject jSONObject) {
        lh lhVarVt = lh.vt(jSONObject);
        if (lhVarVt == null) {
            return null;
        }
        return new vt(lhVarVt.ouw, lhVarVt.vt, jSONObject.optLong(TypedValues.CycleType.S_WAVE_OFFSET, -1L), jSONObject.optLong("duration", -1L), lhVarVt.f13927lh, lhVarVt.yu, lhVarVt.fkw, lhVarVt.f13926le, lhVarVt.f13928ra, lhVarVt.pno);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ryl.lh
    public final JSONObject ouw() throws JSONException {
        JSONObject jSONObjectOuw = super.ouw();
        if (jSONObjectOuw != null) {
            jSONObjectOuw.put(TypedValues.CycleType.S_WAVE_OFFSET, this.ryl);
            jSONObjectOuw.put("duration", this.mwh);
        }
        return jSONObjectOuw;
    }
}
