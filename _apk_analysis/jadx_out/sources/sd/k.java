package sd;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import com.dramarush.shortin.R;
import com.mgs.carparking.db.VideoSkipDao;
import com.mgs.carparking.dbtable.VideoSkipEntry;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import ic.g0;
import java.util.ArrayList;
import zp.p;
import zp.r;

/* JADX INFO: compiled from: VideoDetailSkipHeadAndEndPop.java */
/* JADX INFO: loaded from: classes8.dex */
public class k extends PopupWindow implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f79693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f79694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f79695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SeekBar f79696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SeekBar f79697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f79698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f79699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f79700i;

    /* JADX INFO: compiled from: VideoDetailSkipHeadAndEndPop.java */
    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            k.this.f79694c.setText(i10 + "");
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: compiled from: VideoDetailSkipHeadAndEndPop.java */
    public class b implements SeekBar.OnSeekBarChangeListener {
        public b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            k.this.f79695d.setText(i10 + "");
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: compiled from: VideoDetailSkipHeadAndEndPop.java */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            k.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: VideoDetailSkipHeadAndEndPop.java */
    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f79704b;

        public d(int i10) {
            this.f79704b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (Integer.parseInt(k.this.f79694c.getText().toString()) > 0 || Integer.parseInt(k.this.f79695d.getText().toString()) > 0) {
                VideoSkipEntry videoSkipEntry = new VideoSkipEntry();
                videoSkipEntry.setId(this.f79704b);
                videoSkipEntry.setProgress_head(Integer.parseInt(k.this.f79694c.getText().toString()));
                videoSkipEntry.setProgress_end(Integer.parseInt(k.this.f79695d.getText().toString()));
                VideoSkipDao.getInstance().insertSkipVideo(videoSkipEntry);
                op.a.a().b(new g0(videoSkipEntry));
                p.b(r.b().getResources().getString(R.string.str_setting_sucess));
            } else {
                if (VideoSkipDao.getInstance().isExist(this.f79704b)) {
                    VideoSkipDao.getInstance().deleteSkipVideoById(this.f79704b);
                }
                op.a.a().b(new g0(null));
            }
            k.this.dismiss();
        }
    }

    public k(VideoPlayDetailActivity videoPlayDetailActivity, Context context, int i10) {
        super(context);
        this.f79693b = context;
        this.f79700i = i10;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_detail_skip_head_end, (ViewGroup) null);
        this.f79694c = (TextView) viewInflate.findViewById(R.id.tv_head);
        this.f79695d = (TextView) viewInflate.findViewById(R.id.tv_end);
        this.f79696e = (SeekBar) viewInflate.findViewById(R.id.seekBarHead);
        this.f79697f = (SeekBar) viewInflate.findViewById(R.id.seekBarEnd);
        this.f79698g = (Button) viewInflate.findViewById(R.id.btn_cancel);
        this.f79699h = (Button) viewInflate.findViewById(R.id.bt_sure);
        ArrayList<VideoSkipEntry> arrayListQueryItemSkipVideo = VideoSkipDao.getInstance().queryItemSkipVideo(i10);
        if (arrayListQueryItemSkipVideo.size() > 0) {
            this.f79696e.setProgress(arrayListQueryItemSkipVideo.get(0).getProgress_head());
            this.f79697f.setProgress(arrayListQueryItemSkipVideo.get(0).getProgress_end());
            this.f79694c.setText(arrayListQueryItemSkipVideo.get(0).getProgress_head() + "");
            this.f79695d.setText(arrayListQueryItemSkipVideo.get(0).getProgress_end() + "");
        }
        this.f79696e.setOnSeekBarChangeListener(new a());
        this.f79697f.setOnSeekBarChangeListener(new b());
        this.f79698g.setOnClickListener(new c());
        this.f79699h.setOnClickListener(new d(i10));
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

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getId();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }
}
