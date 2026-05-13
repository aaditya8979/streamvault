package com.bytedance.adsdk.ugeno.yu.vt;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.yu.le;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class fkw extends ouw {
    public fkw(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, le.ouw ouwVar) {
        super(lhVar, str, ouwVar);
    }

    private void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        if (lhVar == null) {
            return;
        }
        for (String str : this.f11903le.keySet()) {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "id")) {
                lhVar.ouw(str, this.f11903le.get(str));
            }
        }
        lhVar.ouw(this.f11903le.containsKey("width"), this.f11903le.containsKey("height"));
        lhVar.vt();
    }

    @Override // com.bytedance.adsdk.ugeno.yu.vt.ouw
    public final void ouw() {
        Map<String, String> map = this.f11903le;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.f11903le.get("id");
        if (TextUtils.isEmpty(str)) {
            ouw(this.f11904lh);
            return;
        }
        com.bytedance.adsdk.ugeno.vt.lh lhVarVt = com.bytedance.adsdk.ugeno.vt.lh.vt(this.f11904lh);
        if (lhVarVt == null) {
            return;
        }
        ouw(lhVarVt.fkw(str));
    }
}
