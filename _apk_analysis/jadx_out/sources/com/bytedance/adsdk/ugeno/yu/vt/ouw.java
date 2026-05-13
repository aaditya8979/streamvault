package com.bytedance.adsdk.ugeno.yu.vt;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.yu.le;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ouw {
    public static final HashSet<String> ouw = new HashSet<>(Arrays.asList("convert", "dislike", "openAppPermission", "openAppPolicy", "openPrivacy", "openAppFunction", "close", "skip", "videoControl", "pauseVideo", "resumeVideo", FyberMediationAdapter.KEY_MUTE_VIDEO, "preventEvent"));
    public String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public Map<String, String> f11903le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.adsdk.ugeno.vt.lh f11904lh;
    public String pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public String f11905ra;
    public le.ouw vt;
    public String yu;

    public ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, le.ouw ouwVar) {
        this.f11904lh = lhVar;
        this.vt = ouwVar;
        this.f11905ra = str;
        if (ouwVar != null) {
            this.yu = ouwVar.f11902lh;
            this.fkw = ouwVar.yu;
            Map<String, String> map = ouwVar.fkw;
            this.f11903le = map;
            if (map == null || map.isEmpty() || !this.f11903le.containsKey("emitCustomEvent")) {
                return;
            }
            this.pno = this.f11903le.get("emitCustomEvent");
        }
    }

    private boolean yu() {
        return !TextUtils.isEmpty(this.pno);
    }

    public final void lh() {
        if (yu()) {
            le.ouw ouwVar = new le.ouw();
            ouwVar.f11902lh = "custom";
            ouwVar.yu = "emit";
            HashMap map = new HashMap();
            map.put("name", this.pno);
            ouwVar.fkw = map;
            new vt(this.f11904lh, this.fkw, ouwVar).ouw();
        }
    }

    public abstract void ouw();

    public void vt() {
        lh();
    }
}
