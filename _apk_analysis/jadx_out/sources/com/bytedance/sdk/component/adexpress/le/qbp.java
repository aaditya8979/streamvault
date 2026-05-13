package com.bytedance.sdk.component.adexpress.le;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qbp extends th {
    private TextView ouw;

    public qbp(@NonNull Context context, View view, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context, view, i10, i11, i12, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.le.th, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.sdk.component.adexpress.le.th, android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.le.th
    public final void ouw(View view) {
        addView(view);
        this.ouw = (TextView) findViewById(2097610747);
    }

    @Override // com.bytedance.sdk.component.adexpress.le.th
    public void setShakeText(String str) {
        if (this.ouw == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.ouw.setText(str);
            return;
        }
        try {
            this.ouw.setText(com.bytedance.sdk.component.utils.vpp.vt(this.ouw.getContext(), "tt_splash_default_click_shake"));
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ko.fkw("shakeClickView", e10.getMessage());
        }
    }
}
