package sd;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import chuangyuan.ycj.videolibrary.widget.VideoPlayerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.ui.mine.DownloadVideoPlayActivity;

/* JADX INFO: compiled from: VideoDownloadSetMorePop.java */
/* JADX INFO: loaded from: classes11.dex */
public class l extends PopupWindow implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f79706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DownloadVideoPlayActivity f79707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f79708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f79709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f79710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f79711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public VideoPlayerView f79712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SeekBar f79713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SeekBar f79714j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AudioManager f79715k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f79716l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f79717m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f79718n;

    /* JADX INFO: compiled from: VideoDownloadSetMorePop.java */
    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            l.this.f79715k.setStreamVolume(3, (i10 * l.this.f79716l) / 100, 4);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: compiled from: VideoDownloadSetMorePop.java */
    public class b implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f79720b;

        public b(Context context) {
            this.f79720b = context;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            l.this.c(this.f79720b, i10);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public l(DownloadVideoPlayActivity downloadVideoPlayActivity, Context context, VideoPlayerView videoPlayerView) {
        super(context);
        this.f79717m = -1;
        this.f79718n = -1.0f;
        this.f79707c = downloadVideoPlayActivity;
        this.f79706b = context;
        this.f79712h = videoPlayerView;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        this.f79715k = audioManager;
        this.f79716l = audioManager.getStreamMaxVolume(3);
        this.f79717m = this.f79715k.getStreamVolume(3);
        float f10 = downloadVideoPlayActivity.getWindow().getAttributes().screenBrightness;
        this.f79718n = f10;
        if (f10 <= 0.0f) {
            this.f79718n = 0.5f;
        } else if (f10 < 0.01f) {
            this.f79718n = 0.01f;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_download_set_more, (ViewGroup) null);
        this.f79708d = (TextView) viewInflate.findViewById(R.id.tv_normal);
        this.f79709e = (TextView) viewInflate.findViewById(R.id.tv_fill);
        this.f79710f = (TextView) viewInflate.findViewById(R.id.tv_size_16);
        this.f79711g = (TextView) viewInflate.findViewById(R.id.tv_size_4);
        this.f79713i = (SeekBar) viewInflate.findViewById(R.id.seekBarVolume);
        this.f79714j = (SeekBar) viewInflate.findViewById(R.id.seekBarBright);
        this.f79708d.setOnClickListener(this);
        this.f79709e.setOnClickListener(this);
        this.f79710f.setOnClickListener(this);
        this.f79711g.setOnClickListener(this);
        if (videoPlayerView.getResizeMode() == 4) {
            this.f79708d.setTextColor(context.getResources().getColor(R.color.color_42BD56));
        } else if (videoPlayerView.getResizeMode() == 2) {
            this.f79709e.setTextColor(context.getResources().getColor(R.color.color_42BD56));
        } else if (videoPlayerView.getResizeMode() == 0) {
            this.f79710f.setTextColor(context.getResources().getColor(R.color.color_42BD56));
        } else if (videoPlayerView.getResizeMode() == 1) {
            this.f79711g.setTextColor(context.getResources().getColor(R.color.color_42BD56));
        }
        this.f79713i.setProgress((this.f79717m * 100) / this.f79716l);
        this.f79714j.setProgress((int) (this.f79718n * 255.0f));
        this.f79713i.setOnSeekBarChangeListener(new a());
        this.f79714j.setOnSeekBarChangeListener(new b(context));
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

    public void c(Context context, int i10) {
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
            case R.id.tv_fill /* 2131363705 */:
                if (this.f79712h.getResizeMode() != 3) {
                    this.f79708d.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79709e.setTextColor(this.f79706b.getResources().getColor(R.color.color_42BD56));
                    this.f79710f.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79711g.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79712h.setResizeMode(3);
                } else {
                    this.f79708d.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79709e.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79710f.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79711g.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79712h.setResizeMode(4);
                }
                break;
            case R.id.tv_normal /* 2131363727 */:
                if (this.f79712h.getResizeMode() != 4) {
                    this.f79708d.setTextColor(this.f79706b.getResources().getColor(R.color.color_42BD56));
                    this.f79709e.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79710f.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79711g.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79712h.setResizeMode(4);
                } else {
                    this.f79708d.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79709e.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79710f.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79711g.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79712h.setResizeMode(4);
                }
                break;
            case R.id.tv_size_16 /* 2131363745 */:
                if (this.f79712h.getResizeMode() != 0) {
                    this.f79708d.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79709e.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79710f.setTextColor(this.f79706b.getResources().getColor(R.color.color_42BD56));
                    this.f79711g.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79712h.setResizeMode(0);
                } else {
                    this.f79708d.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79709e.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79710f.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79711g.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79712h.setResizeMode(4);
                }
                break;
            case R.id.tv_size_4 /* 2131363746 */:
                if (this.f79712h.getResizeMode() != 1) {
                    this.f79708d.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79709e.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79710f.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79711g.setTextColor(this.f79706b.getResources().getColor(R.color.color_42BD56));
                    this.f79712h.setResizeMode(1);
                } else {
                    this.f79708d.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79709e.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79710f.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79711g.setTextColor(this.f79706b.getResources().getColor(R.color.white));
                    this.f79712h.setResizeMode(4);
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
