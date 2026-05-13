package com.bytedance.sdk.openadsdk.lh;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.lh.tlj;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class pno extends ViewGroup implements tlj.lh {
    private final tlj ouw;

    public pno(Context context, tlj tljVar) {
        super(context);
        this.ouw = tljVar;
        tljVar.ouw(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int childCount = getChildCount();
        int i15 = i12 - i10;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i19 = i16 != 0 ? marginLayoutParams.leftMargin : 0;
            if (measuredWidth + i19 + i17 < i15) {
                i14 = i17 + i19;
            } else {
                i18 += marginLayoutParams.bottomMargin + measuredHeight;
                i14 = 0;
            }
            childAt.layout(i14, marginLayoutParams.topMargin + i18, i14 + measuredWidth, measuredHeight + i18);
            i17 = i14 + measuredWidth + marginLayoutParams.rightMargin;
            i16++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getMode(i10);
        View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        View.MeasureSpec.getSize(i11);
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < getChildCount()) {
            View childAt = getChildAt(i12);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            measureChild(childAt, i10, i11);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i15 = i12 != 0 ? marginLayoutParams.leftMargin : 0;
            int i16 = (measuredWidth + i15) + i14 < size ? i14 + i15 : 0;
            if (i16 == 0) {
                i13 += measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            i14 = i16 + measuredWidth + marginLayoutParams.rightMargin;
            i12++;
        }
        setMeasuredDimension(size, i13);
    }

    @Override // com.bytedance.sdk.openadsdk.lh.tlj.lh
    public final void ouw(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null) {
                if (tlj.ouw.equals(filterWord)) {
                    childAt.setSelected(false);
                } else {
                    childAt.setSelected(filterWord.equals(childAt.getTag()));
                }
            }
        }
    }

    public final void ouw(List<FilterWord> list) {
        if (list == null) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            FilterWord filterWord = list.get(i10);
            if (filterWord != null) {
                TextView textView = new TextView(getContext());
                textView.setTag(filterWord);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                int iOuw = osn.ouw(getContext(), 8.0f);
                marginLayoutParams.leftMargin = iOuw;
                marginLayoutParams.bottomMargin = iOuw;
                textView.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[0]}, new int[]{Color.rgb(255, 44, 85), ViewCompat.MEASURED_STATE_MASK}));
                textView.setText(filterWord.getName());
                textView.setPadding(iOuw, iOuw, iOuw, iOuw);
                GradientDrawable gradientDrawable = new GradientDrawable();
                float fOuw = osn.ouw(getContext(), 5.0f);
                gradientDrawable.setCornerRadius(fOuw);
                gradientDrawable.setColor(Color.parseColor("#0D000000"));
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setStroke(osn.ouw(getContext(), 1.0f), Color.parseColor("#FE2C55"));
                gradientDrawable2.setCornerRadius(fOuw);
                gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
                stateListDrawable.addState(new int[0], gradientDrawable);
                textView.setBackground(stateListDrawable);
                textView.setSelected(false);
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lh.pno.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/lh/pno$1;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(g.f53147u, view);
                        safedk_pno$1_onClick_00e26d484f394e07875980aa5234b92d(view);
                    }

                    public void safedk_pno$1_onClick_00e26d484f394e07875980aa5234b92d(View view) {
                        if (pno.this.ouw != null) {
                            if (view.isSelected()) {
                                pno.this.ouw.ouw(tlj.ouw);
                                return;
                            }
                            Object tag = view.getTag();
                            if (tag instanceof FilterWord) {
                                pno.this.ouw.ouw((FilterWord) tag);
                            }
                        }
                    }
                });
                textView.setSelected(false);
                textView.setLayoutParams(marginLayoutParams);
                addView(textView);
            }
        }
    }
}
