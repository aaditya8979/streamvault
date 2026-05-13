package com.bytedance.adsdk.vt.lh.lh;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.vt.tlj;
import com.bytedance.adsdk.vt.zin;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class lh extends yu {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public String f12005cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final LinearLayout.LayoutParams f12006jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final List<String> f12007ko;
    private LinearLayout mwh;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private final List<TextView> f12008rn;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public lh(com.bytedance.adsdk.vt.bly r7, com.bytedance.adsdk.vt.lh.lh.fkw r8, android.content.Context r9) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.lh.lh.lh.<init>(com.bytedance.adsdk.vt.bly, com.bytedance.adsdk.vt.lh.lh.fkw, android.content.Context):void");
    }

    private static void ouw(View view, int i10, int i11) {
        view.layout(0, 0, i10, i11);
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    private static void ouw(TextView textView, tlj.ouw ouwVar, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setText("");
        } else {
            textView.setText(str);
        }
        if (!TextUtils.isEmpty(ouwVar.f12197lh)) {
            textView.setTextColor(Color.parseColor(ouwVar.f12197lh));
        }
        if (!TextUtils.isEmpty(ouwVar.yu)) {
            textView.setBackgroundColor(Color.parseColor(ouwVar.yu));
        }
        textView.setGravity(17);
        textView.setTextSize(ouwVar.fkw);
    }

    private List<String> yu() {
        com.bytedance.adsdk.vt.bly blyVar;
        List<tlj.ouw> list;
        com.bytedance.adsdk.vt.tlj tljVar = ((yu) this).ryl;
        if (tljVar == null || (blyVar = this.vt) == null || blyVar.f11933rn == null) {
            return null;
        }
        String str = tljVar.f12193le;
        if ((!TextUtils.isEmpty(str) || !TextUtils.isEmpty(this.f12005cf)) && (list = ((yu) this).ryl.f12195ra) != null) {
            String strOuw = this.f12005cf;
            if (TextUtils.isEmpty(strOuw)) {
                strOuw = zin.ouw(str);
            }
            if (!TextUtils.isEmpty(strOuw)) {
                int length = strOuw.length();
                this.f12007ko.clear();
                for (int i10 = 0; i10 < list.size(); i10++) {
                    tlj.ouw ouwVar = list.get(i10);
                    int iMax = ouwVar.ouw;
                    int iMax2 = ouwVar.vt;
                    if (iMax < 0) {
                        iMax = Math.max(iMax + length, 0);
                    }
                    if (iMax2 < 0) {
                        iMax2 = Math.max(iMax2 + length, 0);
                    }
                    if (iMax + iMax2 > length) {
                        this.f12007ko.add("");
                    } else {
                        if (list.size() == 1 && iMax == 0 && iMax2 == 0) {
                            iMax2 = length;
                        }
                        this.f12007ko.add(strOuw.substring(iMax, iMax2 + iMax));
                    }
                }
                return this.f12007ko;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.yu, com.bytedance.adsdk.vt.lh.lh.ouw
    public final void vt(Canvas canvas, Matrix matrix, int i10) {
        List<tlj.ouw> list;
        if (this.mwh == null) {
            super.vt(canvas, matrix, i10);
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        ouw(i10);
        float f10 = this.tlj;
        com.bytedance.adsdk.vt.tlj tljVar = ((yu) this).ryl;
        if (tljVar != null && (list = tljVar.f12195ra) != null && list.size() > 0) {
            this.mwh.setOrientation(0);
            this.mwh.setGravity(17);
            if (this.mwh.getChildCount() > 0) {
                LinearLayout linearLayout = (LinearLayout) this.mwh.getChildAt(0);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(80);
                this.mwh.removeAllViews();
                if (linearLayout.getChildCount() == list.size()) {
                    List<String> listYu = yu();
                    this.f12008rn.clear();
                    int i11 = 0;
                    while (i11 < list.size()) {
                        tlj.ouw ouwVar = list.get(i11);
                        TextView textView = (TextView) linearLayout.getChildAt(i11);
                        this.f12008rn.add(textView);
                        ouw(textView, ouwVar, (listYu == null || i11 >= listYu.size()) ? "" : listYu.get(i11));
                        i11++;
                    }
                    linearLayout.removeAllViews();
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        tlj.ouw ouwVar2 = list.get(i12);
                        TextView textView2 = this.f12008rn.get(i12);
                        textView2.setAlpha(f10);
                        linearLayout.setAlpha(f10);
                        int i13 = ouwVar2.f12196le;
                        if (i13 != 0) {
                            this.f12006jg.bottomMargin = (int) (i13 * com.bytedance.adsdk.vt.le.pno.ouw());
                            linearLayout.addView(textView2, this.f12006jg);
                        } else {
                            linearLayout.addView(textView2);
                        }
                    }
                    this.mwh.setAlpha(f10);
                    this.mwh.addView(linearLayout);
                    float fOuw = com.bytedance.adsdk.vt.le.pno.ouw();
                    LinearLayout linearLayout2 = this.mwh;
                    com.bytedance.adsdk.vt.tlj tljVar2 = ((yu) this).ryl;
                    ouw(linearLayout2, (int) (tljVar2.ouw * fOuw), (int) (tljVar2.vt * fOuw));
                }
            }
        }
        this.mwh.draw(canvas);
        canvas.restore();
    }
}
