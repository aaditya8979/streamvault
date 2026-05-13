package chuangyuan.ycj.videolibrary.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import chuangyuan.ycj.videolibrary.R$drawable;
import chuangyuan.ycj.videolibrary.R$id;
import chuangyuan.ycj.videolibrary.R$layout;
import chuangyuan.ycj.videolibrary.R$styleable;

/* JADX INFO: loaded from: classes4.dex */
public class GestureControlView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f6642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f6643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f6644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f6645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AppCompatImageView f6646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AppCompatImageView f6647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ProgressBar f6648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ProgressBar f6649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AppCompatTextView f6650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AppCompatImageView f6651k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AppCompatImageView f6652l;

    public GestureControlView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GestureControlView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11;
        super(context, attributeSet, i10);
        setBackgroundColor(0);
        int resourceId = R$layout.simple_exo_video_progress_dialog;
        int i12 = R$layout.simple_video_audio_brightness_dialog;
        int resourceId2 = R$layout.simple_video_fast_forward_dialog;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.GestureControlView, 0, 0);
            try {
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.GestureControlView_player_gesture_audio_layout_id, i12);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.GestureControlView_player_gesture_progress_layout_id, resourceId);
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.GestureControlView_player_gesture_bright_layout_id, i12);
                resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.GestureControlView_player_gesture_longclick_layout_id, resourceId2);
                typedArrayObtainStyledAttributes.recycle();
                i11 = resourceId4;
                i12 = resourceId3;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i11 = i12;
        }
        a(i12, i11, resourceId, resourceId2);
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f6643c = View.inflate(getContext(), i10, null);
        this.f6644d = View.inflate(getContext(), i11, null);
        this.f6642b = View.inflate(getContext(), i12, null);
        this.f6645e = View.inflate(getContext(), i13, null);
        this.f6642b.setVisibility(8);
        this.f6643c.setVisibility(8);
        this.f6644d.setVisibility(8);
        this.f6645e.setVisibility(8);
        addView(this.f6642b, getChildCount());
        addView(this.f6643c, getChildCount());
        addView(this.f6644d, getChildCount());
        addView(this.f6645e, getChildCount());
        int i14 = R$layout.simple_video_audio_brightness_dialog;
        if (i10 == i14) {
            this.f6646f = (AppCompatImageView) this.f6643c.findViewById(R$id.exo_video_audio_brightness_img);
            this.f6648h = (ProgressBar) this.f6643c.findViewById(R$id.exo_video_audio_brightness_pro);
        }
        if (i11 == i14) {
            this.f6647g = (AppCompatImageView) this.f6644d.findViewById(R$id.exo_video_audio_brightness_img);
            this.f6649i = (ProgressBar) this.f6644d.findViewById(R$id.exo_video_audio_brightness_pro);
        }
        if (i12 == R$layout.simple_exo_video_progress_dialog) {
            this.f6650j = (AppCompatTextView) this.f6642b.findViewById(R$id.exo_video_dialog_pro_text);
            this.f6651k = (AppCompatImageView) this.f6642b.findViewById(R$id.exo_video_dialog_pro_img);
        }
        if (i13 == R$layout.simple_video_fast_forward_dialog) {
            this.f6652l = (AppCompatImageView) this.f6645e.findViewById(R$id.exo_video_fast_img);
        }
    }

    public void b(int i10, int i11) {
        View view = this.f6644d;
        if (view != null) {
            if (view.getVisibility() != 0) {
                this.f6649i.setMax(i10);
                this.f6647g.setImageResource(R$drawable.ic_brightness_6_white_48px);
            }
            this.f6644d.setVisibility(0);
            this.f6649i.setProgress(i11);
        }
    }

    public void c(boolean z10, @NonNull SpannableString spannableString) {
        View view = this.f6642b;
        if (view != null) {
            view.setVisibility(0);
            this.f6650j.setText(spannableString);
            if (z10) {
                this.f6651k.setImageResource(R$drawable.ic_video_go);
            } else {
                this.f6651k.setImageResource(R$drawable.ic_video_go_back);
            }
        }
    }

    public void d(int i10, int i11) {
        View view = this.f6643c;
        if (view != null) {
            if (view.getVisibility() != 0) {
                this.f6648h.setMax(i10);
            }
            this.f6643c.setVisibility(0);
            this.f6648h.setProgress(i11);
            this.f6646f.setImageResource(i11 == 0 ? R$drawable.ic_volume_off_white_48px : R$drawable.ic_volume_up_white_48px);
        }
    }

    public void e(int i10) {
        View view = this.f6643c;
        if (view != null) {
            view.setVisibility(i10);
        }
        View view2 = this.f6644d;
        if (view2 != null) {
            view2.setVisibility(i10);
        }
        View view3 = this.f6642b;
        if (view3 != null) {
            view3.setVisibility(i10);
        }
        View view4 = this.f6645e;
        if (view4 != null) {
            view4.setVisibility(i10);
        }
    }

    public View getDialogProLayout() {
        return this.f6642b;
    }

    public View getExoAudioLayout() {
        return this.f6643c;
    }

    public View getExoBrightnessLayout() {
        return this.f6644d;
    }

    public View getExoFastForwardLayout() {
        return this.f6645e;
    }

    public void setFastForwardPosition(int i10) {
        if (this.f6645e != null) {
            this.f6652l.setImageResource(R$drawable.ic_video_fast);
        }
    }
}
