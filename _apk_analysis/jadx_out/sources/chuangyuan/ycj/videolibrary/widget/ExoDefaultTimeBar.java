package chuangyuan.ycj.videolibrary.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.google.android.exoplayer.ui.DefaultTimeBar;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes11.dex */
public class ExoDefaultTimeBar extends DefaultTimeBar {
    public boolean L;

    public ExoDefaultTimeBar(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = true;
        new DefaultTimeBar(context, attributeSet);
    }

    @Override // com.google.android.exoplayer.ui.DefaultTimeBar, com.google.android.exoplayer.ui.a
    public boolean b() {
        return this.L;
    }

    @Override // com.google.android.exoplayer.ui.DefaultTimeBar, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer.ui.DefaultTimeBar, android.view.View
    public void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setOpenSeek(boolean z10) {
        this.L = z10;
    }
}
