package com.mgs.carparking.widgets.dialog;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import chuangyuan.ycj.videolibrary.widget.VideoPlayerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.dbtable.VideoCollectionEntry;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import com.mgs.carparking.widgets.dialog.c;
import me.goldze.mvvmhabit.base.BaseApplication;
import zp.p;
import zp.r;

/* JADX INFO: compiled from: VideoDetailSetMorePop.java */
/* JADX INFO: loaded from: classes9.dex */
public class f extends PopupWindow implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f45437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public VideoPlayDetailActivity f45438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecommandVideosEntity f45439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f45441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f45442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f45443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f45444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f45445j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f45446k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f45447l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f45448m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public VIDEOPLAYDETAILVIEWMODEL f45449n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public VideoPlayerView f45450o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SeekBar f45451p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SeekBar f45452q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AudioManager f45453r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f45454s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f45455t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f45456u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public com.mgs.carparking.widgets.dialog.c f45457v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public sd.k f45458w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f45459x;

    /* JADX INFO: compiled from: VideoDetailSetMorePop.java */
    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            f.this.f45453r.setStreamVolume(3, (i10 * f.this.f45454s) / 100, 4);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: compiled from: VideoDetailSetMorePop.java */
    public class b implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f45461b;

        public b(Context context) {
            this.f45461b = context;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            f.this.g(this.f45461b, i10);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: compiled from: VideoDetailSetMorePop.java */
    public class c implements c.d {
        public c() {
        }

        @Override // com.mgs.carparking.widgets.dialog.c.d
        public void a(String str, String str2) {
            f.this.f45457v.dismiss();
            f.this.f45449n.P(1, str, str2, f.this.f45439d.getId(), f.this.f45440e, "");
        }
    }

    public f(VideoPlayDetailActivity videoPlayDetailActivity, Context context, RecommandVideosEntity recommandVideosEntity, VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel, VideoPlayerView videoPlayerView, com.mgs.carparking.widgets.dialog.c cVar, int i10, String str) {
        super(context);
        this.f45455t = -1;
        this.f45456u = -1.0f;
        this.f45438c = videoPlayDetailActivity;
        this.f45437b = context;
        this.f45439d = recommandVideosEntity;
        this.f45449n = videoplaydetailviewmodel;
        this.f45450o = videoPlayerView;
        this.f45457v = cVar;
        this.f45440e = i10;
        this.f45459x = str;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        this.f45453r = audioManager;
        this.f45454s = audioManager.getStreamMaxVolume(3);
        this.f45455t = this.f45453r.getStreamVolume(3);
        float f10 = videoPlayDetailActivity.getWindow().getAttributes().screenBrightness;
        this.f45456u = f10;
        if (f10 <= 0.0f) {
            this.f45456u = 0.5f;
        } else if (f10 < 0.01f) {
            this.f45456u = 0.01f;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_detail_set_more, (ViewGroup) null);
        this.f45441f = (LinearLayout) viewInflate.findViewById(R.id.ll_collection);
        this.f45442g = (LinearLayout) viewInflate.findViewById(R.id.ll_feedback);
        this.f45443h = (LinearLayout) viewInflate.findViewById(R.id.ll_skip);
        this.f45444i = (ImageView) viewInflate.findViewById(R.id.iv_collection);
        this.f45445j = (TextView) viewInflate.findViewById(R.id.tv_normal);
        this.f45446k = (TextView) viewInflate.findViewById(R.id.tv_fill);
        this.f45447l = (TextView) viewInflate.findViewById(R.id.tv_size_16);
        this.f45448m = (TextView) viewInflate.findViewById(R.id.tv_size_4);
        this.f45451p = (SeekBar) viewInflate.findViewById(R.id.seekBarVolume);
        this.f45452q = (SeekBar) viewInflate.findViewById(R.id.seekBarBright);
        this.f45441f.setOnClickListener(this);
        this.f45442g.setOnClickListener(this);
        this.f45443h.setOnClickListener(this);
        this.f45445j.setOnClickListener(this);
        this.f45446k.setOnClickListener(this);
        this.f45447l.setOnClickListener(this);
        this.f45448m.setOnClickListener(this);
        if (videoplaydetailviewmodel.C.get().booleanValue()) {
            this.f45444i.setImageResource(R.drawable.ic_video_land_collection_select);
        } else {
            this.f45444i.setImageResource(R.drawable.ic_video_land_collection);
        }
        if (videoPlayerView.getResizeMode() == 4) {
            this.f45445j.setTextColor(context.getResources().getColor(R.color.color_42BD56));
        } else if (videoPlayerView.getResizeMode() == 3) {
            this.f45446k.setTextColor(context.getResources().getColor(R.color.color_42BD56));
        } else if (videoPlayerView.getResizeMode() == 0) {
            this.f45447l.setTextColor(context.getResources().getColor(R.color.color_42BD56));
        } else if (videoPlayerView.getResizeMode() == 1) {
            this.f45448m.setTextColor(context.getResources().getColor(R.color.color_42BD56));
        }
        this.f45451p.setProgress((this.f45455t * 100) / this.f45454s);
        this.f45452q.setProgress((int) (this.f45456u * 255.0f));
        this.f45451p.setOnSeekBarChangeListener(new a());
        this.f45452q.setOnSeekBarChangeListener(new b(context));
        setContentView(viewInflate);
        setWidth(-2);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(false);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.translucent));
        getContentView().setSystemUiVisibility(5894);
        viewInflate.measure(0, 0);
        setSoftInputMode(3);
        update();
    }

    public void g(Context context, int i10) {
        Window window = ((Activity) context).getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (i10 == -1) {
            attributes.screenBrightness = -1.0f;
        } else {
            if (i10 <= 0) {
                i10 = 1;
            }
            attributes.screenBrightness = i10 / 255.0f;
        }
        window.setAttributes(attributes);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ll_collection /* 2131362833 */:
                if (!this.f45449n.C.get().booleanValue()) {
                    this.f45449n.C.set(Boolean.TRUE);
                    this.f45449n.B.set(ContextCompat.getDrawable(BaseApplication.getInstance(), R.drawable.ic_video_land_collection_select));
                    this.f45444i.setImageResource(R.drawable.ic_video_land_collection_select);
                    VideoCollectionEntry videoCollectionEntry = new VideoCollectionEntry();
                    videoCollectionEntry.setId(this.f45439d.getId());
                    videoCollectionEntry.setType_pid(this.f45439d.getType_pid());
                    videoCollectionEntry.setVod_pic(this.f45439d.getVod_pic());
                    this.f45449n.b1(videoCollectionEntry, this.f45439d.getType_id());
                } else {
                    p.b(r.b().getResources().getString(R.string.str_collection_can_cancel));
                }
                break;
            case R.id.ll_feedback /* 2131362836 */:
                dismiss();
                com.mgs.carparking.widgets.dialog.c cVar = new com.mgs.carparking.widgets.dialog.c(this.f45438c, this.f45439d, this.f45459x);
                this.f45457v = cVar;
                cVar.showAtLocation(this.f45446k, 0, 0, 0);
                this.f45457v.j(new c());
                break;
            case R.id.ll_skip /* 2131362849 */:
                dismiss();
                sd.k kVar = new sd.k(this.f45438c, this.f45437b, this.f45439d.getId());
                this.f45458w = kVar;
                kVar.showAtLocation(this.f45446k, 5, 0, 0);
                break;
            case R.id.tv_fill /* 2131363705 */:
                if (this.f45450o.getResizeMode() != 3) {
                    this.f45445j.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45446k.setTextColor(this.f45437b.getResources().getColor(R.color.color_42BD56));
                    this.f45447l.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45448m.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45450o.setResizeMode(3);
                } else {
                    this.f45445j.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45446k.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45447l.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45448m.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45450o.setResizeMode(4);
                }
                break;
            case R.id.tv_normal /* 2131363727 */:
                if (this.f45450o.getResizeMode() != 4) {
                    this.f45445j.setTextColor(this.f45437b.getResources().getColor(R.color.color_42BD56));
                    this.f45446k.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45447l.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45448m.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45450o.setResizeMode(4);
                } else {
                    this.f45445j.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45446k.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45447l.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45448m.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45450o.setResizeMode(4);
                }
                break;
            case R.id.tv_size_16 /* 2131363745 */:
                if (this.f45450o.getResizeMode() != 0) {
                    this.f45445j.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45446k.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45447l.setTextColor(this.f45437b.getResources().getColor(R.color.color_42BD56));
                    this.f45448m.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45450o.setResizeMode(0);
                } else {
                    this.f45445j.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45446k.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45447l.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45448m.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45450o.setResizeMode(4);
                }
                break;
            case R.id.tv_size_4 /* 2131363746 */:
                if (this.f45450o.getResizeMode() != 1) {
                    this.f45445j.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45446k.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45447l.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45448m.setTextColor(this.f45437b.getResources().getColor(R.color.color_42BD56));
                    this.f45450o.setResizeMode(1);
                } else {
                    this.f45445j.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45446k.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45447l.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45448m.setTextColor(this.f45437b.getResources().getColor(R.color.white));
                    this.f45450o.setResizeMode(4);
                }
                break;
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }
}
