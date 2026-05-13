package chuangyuan.ycj.videolibrary.widget;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.os.Message;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.content.ContextCompat;
import chuangyuan.ycj.videolibrary.R$color;
import chuangyuan.ycj.videolibrary.R$drawable;
import chuangyuan.ycj.videolibrary.R$id;
import chuangyuan.ycj.videolibrary.R$layout;
import chuangyuan.ycj.videolibrary.R$styleable;
import com.google.android.exoplayer.ui.ExoPlayerView;
import com.google.android.exoplayer.ui.PlayerControlView;
import com.google.android.exoplayer.ui.PlayerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import t.f;

/* JADX INFO: loaded from: classes2.dex */
abstract class BaseView extends FrameLayout {
    public static final String R = VideoPlayerView.class.getName();
    public static WeakHashMap<String, Long> S = new WeakHashMap<>();
    public static WeakHashMap<String, Integer> T = new WeakHashMap<>();
    public f A;
    public View.OnClickListener B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public ArrayList<String> J;
    public AnimationDrawable K;
    public final View.OnTouchListener L;
    public final View.OnTouchListener M;
    public OrientationEventListener N;
    public int O;
    public int P;
    public Handler Q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f6599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExoPlayerView f6600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f6601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f6602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f6603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f6604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f6605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f6606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f6607j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f6608k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f6609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f6610m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f6611n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final GestureControlView f6612o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ActionControlView f6613p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final chuangyuan.ycj.videolibrary.widget.c f6614q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final chuangyuan.ycj.videolibrary.widget.a f6615r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final PlayerControlView f6616s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public chuangyuan.ycj.videolibrary.widget.b f6617t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AlertDialog f6618u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public t.c f6619v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6620w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6621x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6622y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @DrawableRes
    public int f6623z;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f6624b;

        public a(ViewGroup viewGroup) {
            this.f6624b = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup viewGroup = this.f6624b;
            if (viewGroup != null) {
                viewGroup.removeView(BaseView.this.f6600c);
            }
            BaseView baseView = BaseView.this;
            baseView.addView(baseView.f6600c);
        }
    }

    public class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                BaseView baseView = BaseView.this;
                if (baseView.f6619v == null) {
                    return false;
                }
                if (baseView.B != null) {
                    BaseView.this.B.onClick(view);
                } else {
                    BaseView.this.f6619v.f();
                }
            }
            return false;
        }
    }

    public class c implements View.OnTouchListener {
        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!BaseView.this.H || BaseView.this.f6614q.d() || !BaseView.this.D) {
                return false;
            }
            if (BaseView.this.A != null) {
                BaseView.this.A.onTouchEvent(motionEvent);
            }
            if ((motionEvent.getAction() & 255) == 1 && BaseView.this.A != null) {
                BaseView.this.A.q();
            }
            return false;
        }
    }

    public class d extends Handler {
        public d() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            BaseView baseView = BaseView.this;
            OrientationEventListener orientationEventListener = baseView.N;
            if (orientationEventListener != null) {
                baseView.O = -2;
                orientationEventListener.enable();
            }
        }
    }

    public class e extends OrientationEventListener {
        public e(Context context) {
            super(context);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            BaseView baseView = BaseView.this;
            if (baseView.O == -2) {
                baseView.O = i10;
            }
            baseView.P = Math.abs(baseView.O - i10);
            BaseView baseView2 = BaseView.this;
            if (baseView2.P > 40) {
                baseView2.O = i10;
                if (v.c.b(baseView2.f6599b)) {
                    if (BaseView.this.f6599b.getRequestedOrientation() == 4) {
                        return;
                    }
                    BaseView.this.f6599b.setRequestedOrientation(4);
                    return;
                }
                if (BaseView.this.f6599b.getRequestedOrientation() == 4) {
                    if (BaseView.this.getResources().getConfiguration().orientation == 2) {
                        BaseView.this.f6599b.setRequestedOrientation(0);
                        return;
                    } else {
                        BaseView.this.f6599b.setRequestedOrientation(1);
                        return;
                    }
                }
                if (BaseView.this.f6599b.getRequestedOrientation() != 1) {
                    if (i10 > 45 && i10 < 135) {
                        if (BaseView.this.f6599b.getRequestedOrientation() != 8) {
                            BaseView.this.f6599b.setRequestedOrientation(8);
                        }
                    } else {
                        if (i10 <= 225 || i10 >= 315 || BaseView.this.f6599b.getRequestedOrientation() == 0) {
                            return;
                        }
                        BaseView.this.f6599b.setRequestedOrientation(0);
                    }
                }
            }
        }
    }

    public BaseView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11;
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(context, attributeSet, i10);
        int i12 = 0;
        this.f6622y = 0;
        this.f6623z = R$drawable.ic_exo_back;
        this.C = true;
        this.H = true;
        this.L = new b();
        this.M = new c();
        this.Q = new d();
        this.f6599b = v.e.n(context);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ExoPlayerView exoPlayerView = new ExoPlayerView(getContext(), attributeSet, i10);
        this.f6600c = exoPlayerView;
        this.f6616s = exoPlayerView.getControllerView();
        this.f6615r = new chuangyuan.ycj.videolibrary.widget.a(getContext(), attributeSet, i10, this);
        this.f6612o = new GestureControlView(getContext(), attributeSet, i10);
        this.f6613p = new ActionControlView(getContext(), attributeSet, i10);
        this.f6614q = new chuangyuan.ycj.videolibrary.widget.c(getContext(), attributeSet, i10, this);
        addView(exoPlayerView, layoutParams);
        int resourceId4 = R$layout.simple_exo_play_load;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R$styleable.VideoPlayerView, 0, 0);
            try {
                this.f6623z = typedArrayObtainStyledAttributes.getResourceId(R$styleable.VideoPlayerView_player_back_image_cine, this.f6623z);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.VideoPlayerView_user_watermark, 0);
                this.E = typedArrayObtainStyledAttributes.getBoolean(R$styleable.VideoPlayerView_player_list_cine, false);
                resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.VideoPlayerView_default_artwork_cine, 0);
                resourceId4 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.VideoPlayerView_player_load_layout_id, resourceId4);
                resourceId3 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.VideoPlayerView_player_preview_layout_id, 0);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.VideoPlayerView_player_custom_layout_id, 0);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.VideoPlayerView_controller_layout_id_cine, R$layout.simple_exo_playback_control_view);
                if (resourceId3 == 0 && (resourceId6 == R$layout.simple_exo_playback_list_view || resourceId6 == R$layout.simple_exo_playback_top_view)) {
                    resourceId3 = R$layout.exo_default_preview_layout;
                }
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.VideoPlayerView_player_custom_top_ad_id, 0);
                typedArrayObtainStyledAttributes.recycle();
                i11 = resourceId7;
                i12 = resourceId5;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i11 = 0;
            resourceId = 0;
            resourceId2 = 0;
            resourceId3 = 0;
        }
        if (i12 != 0) {
            this.f6605h = View.inflate(context, i12, null);
        }
        this.f6602e = View.inflate(context, resourceId4, null);
        if (resourceId3 != 0) {
            this.f6603f = View.inflate(context, resourceId3, null);
        }
        if (i11 != 0) {
            this.f6606i = View.inflate(context, i11, null);
        }
        h();
        g(resourceId, resourceId2);
    }

    public void A(int i10) {
        if (i10 == 0) {
            H();
            this.f6600c.j();
            E(8);
            t(0, true);
            C(8);
            B(8);
            D(8);
            x(8);
        } else {
            J();
        }
        this.f6613p.f(i10);
    }

    public void B(int i10) {
        if (i10 == 0) {
            x(8);
            E(8);
            C(8);
            A(8);
        }
        View view = this.f6602e;
        if (view != null) {
            view.setVisibility(i10);
        }
    }

    public void C(int i10) {
        this.f6614q.g(i10);
    }

    public void D(int i10) {
        View view = this.f6603f;
        if (view == null || view.getVisibility() == i10) {
            return;
        }
        this.f6603f.setVisibility(i10);
        ExoPlayerView exoPlayerView = this.f6600c;
        int i11 = R$id.exo_preview_play;
        if (exoPlayerView.findViewById(i11) != null) {
            this.f6600c.findViewById(i11).setVisibility(i10);
        }
    }

    public void E(int i10) {
        if (i10 == 0) {
            this.f6616s.G();
            x(8);
            v(8);
            D(8);
            C(8);
            B(8);
            u(0);
            A(8);
            t(0, true);
        }
        this.f6613p.g(i10);
    }

    public void F(int i10) {
        ActionControlView actionControlView = this.f6613p;
        if (actionControlView != null) {
            actionControlView.i(i10);
        }
    }

    public void G() {
        OrientationEventListener orientationEventListener = this.N;
        if (orientationEventListener != null) {
            orientationEventListener.enable();
        }
    }

    public void H() {
        AnimationDrawable animationDrawable = this.K;
        if (animationDrawable == null || animationDrawable.isRunning()) {
            return;
        }
        this.K.start();
    }

    public void I() {
        this.N = new e(this.f6599b);
    }

    public void J() {
        AnimationDrawable animationDrawable = this.K;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
    }

    public void K() {
        OrientationEventListener orientationEventListener = this.N;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
    }

    public void e(int i10) {
        ActionControlView actionControlView = this.f6613p;
        if (actionControlView != null) {
            actionControlView.b(i10);
        }
    }

    public void f(int i10) {
        ActionControlView actionControlView = this.f6613p;
        if (actionControlView != null) {
            actionControlView.h(i10);
        }
    }

    public void g(int i10, int i11) {
        if (i10 != 0) {
            this.f6607j.setImageResource(i10);
        }
        if (i11 != 0) {
            setPreviewImage(BitmapFactory.decodeResource(getResources(), i11));
        }
    }

    public boolean getAdRewardVisibilty() {
        ActionControlView actionControlView = this.f6613p;
        return actionControlView != null && actionControlView.getExoPlayAdRewardLayout().getVisibility() == 0;
    }

    @NonNull
    public chuangyuan.ycj.videolibrary.widget.a getAdTopControlView() {
        return this.f6615r;
    }

    @NonNull
    public View getErrorLayout() {
        return this.f6613p.getExoPlayErrorLayout();
    }

    public AppCompatCheckBox getExoFullscreen() {
        return this.f6616s.getExoFullscreen();
    }

    @NonNull
    public View getExoLoadFirst() {
        return this.f6611n;
    }

    @NonNull
    public View getGestureAudioLayout() {
        return this.f6612o.getExoAudioLayout();
    }

    @NonNull
    public View getGestureBrightnessLayout() {
        return this.f6612o.getExoBrightnessLayout();
    }

    @NonNull
    public View getGestureFastForwardLayout() {
        return this.f6612o.getExoFastForwardLayout();
    }

    @NonNull
    public View getGestureProgressLayout() {
        return this.f6612o.getDialogProLayout();
    }

    public boolean getLeLinkVisibilty() {
        ActionControlView actionControlView = this.f6613p;
        return actionControlView != null && actionControlView.getExoPlayerLelinkLayout().getVisibility() == 0;
    }

    @NonNull
    public View getLoadLayout() {
        return this.f6602e;
    }

    @NonNull
    public chuangyuan.ycj.videolibrary.widget.c getLockControlView() {
        return this.f6614q;
    }

    public ArrayList<String> getNameSwitch() {
        ArrayList<String> arrayList = this.J;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        this.J = arrayList2;
        return arrayList2;
    }

    @NonNull
    public View getPlayHintLayout() {
        return this.f6613p.getPlayBtnHintLayout();
    }

    @NonNull
    public PlayerControlView getPlaybackControlView() {
        return this.f6616s;
    }

    @NonNull
    public PlayerView getPlayerView() {
        return this.f6600c;
    }

    @NonNull
    public ImageView getPreviewImage() {
        return this.f6608k;
    }

    @NonNull
    public View getReplayLayout() {
        return this.f6613p.getPlayReplayLayout();
    }

    public boolean getShareStateVisibilty() {
        ActionControlView actionControlView = this.f6613p;
        return actionControlView != null && actionControlView.getExoPlayShareLayout().getVisibility() == 0;
    }

    public int getSwitchIndex() {
        return this.f6621x;
    }

    @NonNull
    public TextView getSwitchText() {
        return this.f6616s.getSwitchText();
    }

    @NonNull
    public ExoDefaultTimeBar getTimeBar() {
        return (ExoDefaultTimeBar) this.f6616s.getTimeBar();
    }

    public final void h() {
        ImageView imageView = new ImageView(getContext());
        this.f6610m = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int iA = v.e.a(getContext(), 7.0f);
        this.f6610m.setId(R$id.exo_controls_back);
        this.f6610m.setImageDrawable(ContextCompat.getDrawable(getContext(), this.f6623z));
        this.f6610m.setPadding(iA, iA, iA, iA);
        FrameLayout contentFrameLayout = this.f6600c.getContentFrameLayout();
        contentFrameLayout.setBackgroundColor(ContextCompat.getColor(getContext(), R$color.exo_player_background_color));
        this.f6602e.setBackgroundColor(0);
        this.f6602e.setVisibility(8);
        this.f6602e.setClickable(true);
        contentFrameLayout.addView(this.f6612o, contentFrameLayout.getChildCount());
        contentFrameLayout.addView(this.f6613p, contentFrameLayout.getChildCount());
        contentFrameLayout.addView(this.f6614q, contentFrameLayout.getChildCount());
        View view = this.f6603f;
        if (view != null) {
            contentFrameLayout.addView(view, contentFrameLayout.getChildCount());
        }
        contentFrameLayout.addView(this.f6602e, contentFrameLayout.getChildCount());
        contentFrameLayout.addView(this.f6610m, contentFrameLayout.getChildCount(), new FrameLayout.LayoutParams(v.e.a(getContext(), 38.0f), v.e.a(getContext(), 60.0f)));
        int iIndexOfChild = contentFrameLayout.indexOfChild(findViewById(R$id.exo_controller_barrage));
        if (this.f6605h != null) {
            contentFrameLayout.removeViewAt(iIndexOfChild);
            this.f6605h.setBackgroundColor(0);
            contentFrameLayout.addView(this.f6605h, iIndexOfChild);
        }
        this.f6607j = (ImageView) this.f6600c.findViewById(R$id.exo_player_watermark);
        this.f6601d = (TextView) this.f6600c.findViewById(R$id.exo_loading_show_text);
        this.f6609l = (ImageView) this.f6600c.findViewById(R$id.exo_preview_image_bottom);
        ImageView imageView2 = (ImageView) this.f6600c.findViewById(R$id.exo_load_first);
        this.f6611n = imageView2;
        if (imageView2 != null) {
            this.K = (AnimationDrawable) imageView2.getBackground();
        }
        ExoPlayerView exoPlayerView = this.f6600c;
        int i10 = R$id.exo_preview_image;
        if (exoPlayerView.findViewById(i10) != null) {
            ImageView imageView3 = (ImageView) this.f6600c.findViewById(i10);
            this.f6608k = imageView3;
            imageView3.setBackgroundResource(R.color.transparent);
        } else {
            this.f6608k = this.f6609l;
        }
        this.f6622y = this.f6599b.getWindow().getDecorView().getSystemUiVisibility();
        this.f6604g = this.f6600c.findViewById(R$id.exo_preview_play);
        contentFrameLayout.addView(this.f6615r, contentFrameLayout.getChildCount());
        this.f6615r.setVisibility(8);
    }

    public boolean i() {
        return this.D;
    }

    public boolean j() {
        return this.E;
    }

    public boolean k() {
        return this.f6602e.getVisibility() == 0;
    }

    public boolean l() {
        return this.F;
    }

    public boolean m() {
        return this.I;
    }

    public boolean n() {
        return this.G;
    }

    public void o() {
        AlertDialog alertDialog = this.f6618u;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        ImageView imageView = this.f6610m;
        if (imageView != null && imageView.animate() != null) {
            this.f6610m.animate().cancel();
        }
        chuangyuan.ycj.videolibrary.widget.c cVar = this.f6614q;
        if (cVar != null) {
            cVar.e();
        }
        Activity activity = this.f6599b;
        if (activity != null && activity.isDestroyed()) {
            S.clear();
            T.clear();
            this.f6617t = null;
            this.f6618u = null;
        }
        this.J = null;
    }

    public void p(x5.b bVar) {
        PlayerControlView playerControlView = this.f6616s;
        if (playerControlView == null || bVar == null) {
            return;
        }
        playerControlView.setPlayTimeListener(bVar);
    }

    public void q() {
        if (getTag() != null) {
            S.put(getTag().toString(), Long.valueOf(getPlayerView().getPlayer().getCurrentPosition()));
            T.put(getTag().toString(), Integer.valueOf(getPlayerView().getPlayer().getCurrentWindowIndex()));
        }
        this.f6614q.f();
        View view = this.f6602e;
        if (view != null) {
            view.setVisibility(8);
        }
        ActionControlView actionControlView = this.f6613p;
        if (actionControlView != null) {
            actionControlView.a();
        }
        getPlaybackControlView().V();
    }

    public void r() {
        if (m()) {
            s();
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f6599b.findViewById(R.id.content);
        ViewGroup viewGroup2 = (ViewGroup) this.f6600c.getParent();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.f6600c);
        }
        if (this.D) {
            viewGroup.addView(this.f6600c, layoutParams);
        } else {
            addView(this.f6600c, layoutParams);
        }
    }

    public final void s() {
        ViewGroup viewGroup = (ViewGroup) this.f6599b.findViewById(R.id.content);
        ViewGroup viewGroup2 = (ViewGroup) this.f6600c.getParent();
        if (!this.D) {
            new FrameLayout.LayoutParams(-1, -1);
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(600L);
            TransitionManager.beginDelayedTransition(viewGroup, changeBounds);
            ViewGroup.LayoutParams layoutParams = this.f6600c.getLayoutParams();
            layoutParams.width = getWidth();
            layoutParams.height = getHeight();
            this.f6600c.setLayoutParams(layoutParams);
            postDelayed(new a(viewGroup2), 600L);
            return;
        }
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.f6600c);
        }
        viewGroup.addView(this.f6600c, new FrameLayout.LayoutParams(getWidth(), getHeight()));
        ChangeBounds changeBounds2 = new ChangeBounds();
        changeBounds2.setDuration(600L);
        TransitionManager.beginDelayedTransition(viewGroup, changeBounds2);
        ViewGroup.LayoutParams layoutParams2 = this.f6600c.getLayoutParams();
        layoutParams2.height = -1;
        layoutParams2.width = -1;
        this.f6600c.setLayoutParams(layoutParams2);
    }

    public void setExoPlayWatermarkImg(int i10) {
        ImageView imageView = this.f6607j;
        if (imageView != null) {
            imageView.setImageResource(i10);
        }
    }

    public void setExoPlayerListener(t.c cVar) {
        this.f6619v = cVar;
    }

    public void setFullscreenStyle(@DrawableRes int i10) {
        this.f6616s.setFullscreenStyle(i10);
    }

    public void setLand(boolean z10) {
        this.D = z10;
    }

    public void setLeLinkState(int i10) {
        ActionControlView actionControlView = this.f6613p;
        if (actionControlView != null) {
            actionControlView.e(i10);
        }
    }

    public void setNameSwitch(ArrayList<String> arrayList) {
        this.J = arrayList;
    }

    public void setOnEndGestureListener(f fVar) {
        this.A = fVar;
    }

    public void setOnPlayClickListener(@Nullable View.OnClickListener onClickListener) {
        this.B = onClickListener;
    }

    public void setOpenLock(boolean z10) {
        this.f6614q.setOpenLock(z10);
    }

    public void setOpenProgress2(boolean z10) {
        this.f6614q.setProgress(z10);
    }

    public void setPlayerGestureOnTouch(boolean z10) {
        this.H = z10;
    }

    public void setPreviewImage(Bitmap bitmap) {
        this.f6608k.setImageBitmap(bitmap);
    }

    public void setShowBack(boolean z10) {
        this.C = z10;
    }

    public void setShowVideoSwitch(boolean z10) {
        this.F = z10;
    }

    public void setTitle(@NonNull String str) {
        this.f6616s.setTitle(str);
    }

    public void setVerticalFullScreen(boolean z10) {
        this.I = z10;
    }

    public void setWGh(boolean z10) {
        this.G = z10;
    }

    public void t(int i10, boolean z10) {
        ImageView imageView = this.f6610m;
        if (imageView != null) {
            if (!this.C && !this.D) {
                imageView.setVisibility(8);
                return;
            }
            if (j() && !this.D) {
                this.f6610m.setVisibility(8);
                return;
            }
            if (i10 == 0 && z10) {
                this.f6610m.setTranslationY(0.0f);
                this.f6610m.setAlpha(1.0f);
            }
            this.f6610m.setVisibility(i10);
        }
    }

    public void u(int i10) {
        this.f6609l.setVisibility(i10);
        if (i10 == 0) {
            this.f6609l.setImageDrawable(this.f6608k.getDrawable());
        }
    }

    public void v(int i10) {
        if (i10 == 0) {
            E(8);
            x(8);
            D(8);
            B(8);
            A(8);
            t(0, true);
        }
        this.f6613p.c(i10);
    }

    public void w(int i10) {
        if (this.f6616s.getExo_controller_top_status() != null) {
            if (this.D) {
                this.f6616s.getExo_controller_top_status().setVisibility(0);
            } else {
                this.f6616s.getExo_controller_top_status().setVisibility(8);
            }
        }
    }

    public void x(int i10) {
        if (i10 == 0) {
            this.f6600c.j();
            E(8);
            t(0, true);
            C(8);
            B(8);
            D(8);
            A(8);
        }
        this.f6613p.d(i10);
    }

    public void y(int i10) {
        if (j()) {
            if (i10 == 0) {
                this.f6610m.setVisibility(0);
                this.f6620w = this.f6616s.getExoControllerTop().getPaddingLeft();
                this.f6616s.getExoControllerTop().setPadding(v.e.a(getContext(), 35.0f), 0, 0, 0);
            } else {
                this.f6616s.getExoControllerTop().setPadding(this.f6620w, 0, 0, 0);
            }
            t(i10, false);
        }
    }

    public void z(boolean z10) {
        View view = this.f6602e;
        if (view != null) {
            view.setClickable(z10);
        }
    }
}
