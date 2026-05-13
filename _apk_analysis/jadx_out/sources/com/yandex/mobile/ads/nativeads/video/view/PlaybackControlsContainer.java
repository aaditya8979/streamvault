package com.yandex.mobile.ads.nativeads.video.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import com.yandex.mobile.ads.R$id;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class PlaybackControlsContainer extends CorePlaybackControlsContainer {
    public PlaybackControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PlaybackControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53151y, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer, yads.gl1
    @Nullable
    public TextView getCountDownProgress() {
        View viewFindViewById = findViewById(R$id.video_count_down_control);
        if (viewFindViewById instanceof TextView) {
            return (TextView) viewFindViewById;
        }
        return null;
    }

    @Override // com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer, yads.gl1
    @Nullable
    public CheckBox getMuteControl() {
        View viewFindViewById = findViewById(R$id.video_mute_control);
        if (viewFindViewById instanceof CheckBox) {
            return (CheckBox) viewFindViewById;
        }
        return null;
    }

    @Override // com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer, yads.gl1
    @Nullable
    public ProgressBar getVideoProgress() {
        View viewFindViewById = findViewById(R$id.video_progress_control);
        if (viewFindViewById instanceof ProgressBar) {
            return (ProgressBar) viewFindViewById;
        }
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
