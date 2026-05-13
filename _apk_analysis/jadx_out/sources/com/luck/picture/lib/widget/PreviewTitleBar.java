package com.luck.picture.lib.widget;

import ab.q;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.style.TitleBarStyle;

/* JADX INFO: loaded from: classes7.dex */
public class PreviewTitleBar extends TitleBar {
    public PreviewTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreviewTitleBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // com.luck.picture.lib.widget.TitleBar
    public void d() {
        super.d();
        TitleBarStyle titleBarStyleD = PictureSelectionConfig.T0.d();
        if (q.c(titleBarStyleD.d())) {
            setBackgroundColor(titleBarStyleD.d());
        } else if (q.b(titleBarStyleD.g())) {
            setBackgroundColor(titleBarStyleD.g());
        }
        if (q.c(titleBarStyleD.e())) {
            this.f35290c.setImageResource(titleBarStyleD.e());
        }
        this.f35289b.setOnClickListener(null);
        this.f35296i.setOnClickListener(null);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f35289b.getLayoutParams();
        layoutParams.removeRule(17);
        layoutParams.addRule(14);
        this.f35289b.setBackgroundResource(R$drawable.ps_ic_trans_1px);
        this.f35294g.setVisibility(8);
        this.f35291d.setVisibility(8);
        this.f35296i.setVisibility(8);
    }
}
