package com.luck.picture.lib.adapter.holder;

import ab.d;
import ab.q;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.style.SelectMainStyle;

/* JADX INFO: loaded from: classes12.dex */
public class AudioViewHolder extends BaseRecyclerMediaHolder {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f34852w;

    public AudioViewHolder(@NonNull View view, PictureSelectionConfig pictureSelectionConfig) {
        super(view, pictureSelectionConfig);
        TextView textView = (TextView) view.findViewById(R$id.tv_duration);
        this.f34852w = textView;
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.T0.c();
        int i10 = selectMainStyleC.i();
        if (q.c(i10)) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, 0, 0, 0);
        }
        int iL = selectMainStyleC.l();
        if (q.b(iL)) {
            textView.setTextSize(iL);
        }
        int iK = selectMainStyleC.k();
        if (q.c(iK)) {
            textView.setTextColor(iK);
        }
        int iH = selectMainStyleC.h();
        if (q.c(iH)) {
            textView.setBackgroundResource(iH);
        }
        int[] iArrJ = selectMainStyleC.j();
        if (q.a(iArrJ) && (textView.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            ((RelativeLayout.LayoutParams) textView.getLayoutParams()).removeRule(12);
            for (int i11 : iArrJ) {
                ((RelativeLayout.LayoutParams) this.f34852w.getLayoutParams()).addRule(i11);
            }
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder
    public void e(LocalMedia localMedia, int i10) {
        super.e(localMedia, i10);
        this.f34852w.setText(d.b(localMedia.o()));
    }

    @Override // com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder
    public void i(String str) {
        this.f34860l.setImageResource(R$drawable.ps_audio_placeholder);
    }
}
