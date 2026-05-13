package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.utils.a;
import com.mbridge.msdk.dycreator.utils.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.l;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MBButton extends Button implements InterBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f36797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Boolean> f36798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36799c;

    public MBButton(Context context) {
        super(context);
        this.f36799c = "";
    }

    public MBButton(Context context, AttributeSet attributeSet) {
        super(context);
        this.f36799c = "";
        this.f36797a = c.a(context, attributeSet);
        a.a(this, attributeSet);
        c.a(this.f36797a, this);
    }

    public MBButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f36799c = "";
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53141o, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f36797a;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f36797a.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f36797a;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f36797a.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f36797a;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f36797a.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f36797a;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f36797a.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f36797a;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f36797a.get("mbridgeStrategy");
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f36798b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f36798b.get("mbridgeAttached").booleanValue()) {
            new l.b("mbridgeAttached").a().b(this.f36799c);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f36798b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f36798b.get("mbridgeDetached").booleanValue()) {
            new l.b("mbridgeDetached").a().b(this.f36799c);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f36798b = c.a(str);
        if (campaignEx != null) {
            this.f36799c = campaignEx.getCampaignUnitId();
        }
    }
}
