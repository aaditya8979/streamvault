package chuangyuan.ycj.videolibrary.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import chuangyuan.ycj.videolibrary.R$layout;
import chuangyuan.ycj.videolibrary.R$styleable;

/* JADX INFO: loaded from: classes7.dex */
public class ActionControlView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f6591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f6592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f6593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f6594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f6595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f6596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f6597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f6598i;

    public ActionControlView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11;
        super(context, attributeSet, i10);
        int resourceId = R$layout.simple_exo_play_replay;
        int resourceId2 = R$layout.simple_exo_play_error;
        int resourceId3 = R$layout.simple_exo_play_share;
        int i12 = R$layout.simple_exo_play_ad_reward;
        int resourceId4 = R$layout.simple_exo_play_vip_my;
        int resourceId5 = R$layout.simple_exo_play_btn_hint;
        int resourceId6 = R$layout.simple_exo_play_load_first;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.VideoPlayerView, 0, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.VideoPlayerView_player_replay_layout_id, resourceId);
                resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.VideoPlayerView_player_error_layout_id, resourceId2);
                resourceId3 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.VideoPlayerView_player_share_layout_id, resourceId3);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.VideoPlayerView_player_ad_reward_layout_id, i12);
                resourceId4 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.VideoPlayerView_player_vip_layout_id, resourceId4);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.VideoPlayerView_player_lelink_layout_id, i12);
                resourceId5 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.VideoPlayerView_player_hint_layout_id, resourceId5);
                resourceId6 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.VideoPlayerView_player_load_first_id, resourceId6);
                typedArrayObtainStyledAttributes.recycle();
                i11 = resourceId8;
                i12 = resourceId7;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i11 = i12;
        }
        this.f6591b = View.inflate(context, resourceId2, null);
        this.f6592c = View.inflate(context, resourceId3, null);
        this.f6593d = View.inflate(context, i12, null);
        this.f6594e = View.inflate(context, resourceId4, null);
        this.f6595f = View.inflate(context, i11, null);
        this.f6596g = View.inflate(context, resourceId, null);
        this.f6597h = View.inflate(context, resourceId5, null);
        this.f6598i = View.inflate(context, resourceId6, null);
        this.f6591b.setVisibility(8);
        this.f6592c.setVisibility(8);
        this.f6593d.setVisibility(8);
        this.f6594e.setVisibility(8);
        this.f6595f.setVisibility(8);
        this.f6596g.setVisibility(8);
        this.f6597h.setVisibility(8);
        this.f6598i.setVisibility(8);
        addView(this.f6591b, getChildCount());
        addView(this.f6596g, getChildCount());
        addView(this.f6597h, getChildCount());
        addView(this.f6598i, getChildCount());
        addView(this.f6592c, getChildCount());
        addView(this.f6593d, getChildCount());
        addView(this.f6594e, getChildCount());
        addView(this.f6595f, getChildCount());
    }

    public void a() {
        this.f6597h.setVisibility(8);
        this.f6591b.setVisibility(8);
        this.f6596g.setVisibility(8);
        this.f6592c.setVisibility(8);
    }

    public void b(int i10) {
        View view = this.f6593d;
        if (view != null) {
            view.setVisibility(i10);
        }
    }

    public void c(int i10) {
        View view = this.f6597h;
        if (view != null) {
            view.setVisibility(i10);
        }
    }

    public void d(int i10) {
        View view = this.f6591b;
        if (view != null) {
            view.setVisibility(i10);
        }
    }

    public void e(int i10) {
        View view = this.f6595f;
        if (view != null) {
            view.setVisibility(i10);
        }
    }

    public void f(int i10) {
        View view = this.f6598i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }

    public void g(int i10) {
        View view = this.f6596g;
        if (view != null) {
            view.setVisibility(i10);
        }
    }

    public View getExoPlayAdRewardLayout() {
        return this.f6593d;
    }

    public View getExoPlayErrorLayout() {
        return this.f6591b;
    }

    public View getExoPlayShareLayout() {
        return this.f6592c;
    }

    public View getExoPlayerLelinkLayout() {
        return this.f6595f;
    }

    public View getPlayBtnHintLayout() {
        return this.f6597h;
    }

    public View getPlayReplayLayout() {
        return this.f6596g;
    }

    public void h(int i10) {
        View view = this.f6592c;
        if (view != null) {
            view.setVisibility(i10);
        }
    }

    public void i(int i10) {
        View view = this.f6594e;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
