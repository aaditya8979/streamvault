package com.mgs.carparking.ui.mine;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import chuangyuan.ycj.videolibrary.widget.VideoPlayerView;
import com.dramarush.shortin.R;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.source.TrackGroup;
import com.google.android.exoplayer.source.TrackGroupArray;
import com.google.android.exoplayer.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer.trackselection.b;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityDownloadVideoPlayBinding;
import com.mgs.carparking.db.AdNumShowDao;
import com.mgs.carparking.db.VideoAdLookDao;
import com.mgs.carparking.db.VideoLookHistoryDao;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import com.mgs.carparking.model.DOWNLOADVIDEOPLAYVIEWMODEL;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.mgs.carparking.widgets.dialog.b;
import com.mgs.carparking.widgets.dialog.g;
import ed.a0;
import ed.l0;
import fd.h;
import ic.f0;
import java.util.ArrayList;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseApplication;
import sd.l;
import t.j;
import t.k;
import w.e;
import zp.o;
import zp.p;
import zp.r;

/* JADX INFO: loaded from: classes8.dex */
public class DownloadVideoPlayActivity extends BaseActivity<ActivityDownloadVideoPlayBinding, DOWNLOADVIDEOPLAYVIEWMODEL> implements View.OnClickListener {
    public VideoLookHistoryEntry A;
    public boolean B;
    public LinearLayout C;
    public LinearLayout D;
    public LinearLayout E;
    public TextView F;
    public ImageView G;
    public TextView H;
    public g I;
    public ImageView J;
    public l K;
    public com.mgs.carparking.widgets.dialog.downloadcomplete.a L;
    public com.mgs.carparking.widgets.dialog.downloadcomplete.b M;
    public h R;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public w.a f44821t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ProgressBar f44822u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ProgressBar f44823v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ImageView f44824w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ImageView f44825x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public com.mgs.carparking.widgets.dialog.b f44826y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public VideoDownloadEntity f44827z;
    public List<VideoDownloadEntity> list = new ArrayList();
    public int N = 0;
    public String O = "";
    public String P = "";
    public Handler Q = new Handler();
    public long S = System.currentTimeMillis();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadVideoPlayActivity.this.finish();
        }
    }

    public class b implements t.h {
        public b() {
        }

        @Override // t.h
        public void a(int i10) {
            ((ActivityDownloadVideoPlayBinding) DownloadVideoPlayActivity.this.f42500o).f42581b.getGestureFastForwardLayout().setVisibility(0);
            DownloadVideoPlayActivity downloadVideoPlayActivity = DownloadVideoPlayActivity.this;
            ud.c.b(downloadVideoPlayActivity, R.drawable.ic_video_fast, downloadVideoPlayActivity.f44824w, true);
            DownloadVideoPlayActivity.this.f44821t.a0(2.0f, 1.0f);
        }
    }

    public class c implements j {
        public c() {
        }

        @Override // t.j
        public void a(int i10, int i11) {
            ((ActivityDownloadVideoPlayBinding) DownloadVideoPlayActivity.this.f42500o).f42581b.getGestureAudioLayout().setVisibility(0);
            DownloadVideoPlayActivity.this.f44822u.setMax(i10);
            DownloadVideoPlayActivity.this.f44822u.setProgress(i11);
        }
    }

    public class d implements t.g {
        public d() {
        }

        @Override // t.g
        public void b(int i10, int i11) {
            ((ActivityDownloadVideoPlayBinding) DownloadVideoPlayActivity.this.f42500o).f42581b.getGestureBrightnessLayout().setVisibility(0);
            DownloadVideoPlayActivity.this.f44823v.setMax(i10);
            DownloadVideoPlayActivity.this.f44823v.setProgress(i11);
        }
    }

    public class e implements k {
        public e() {
        }

        @Override // t.k
        public void a(long j10) {
            DefaultTrackSelector defaultTrackSelector = (DefaultTrackSelector) DownloadVideoPlayActivity.this.f44821t.D().Q();
            b.a aVarG = defaultTrackSelector.g();
            if (aVarG != null) {
                for (int i10 = 0; i10 < aVarG.c(); i10++) {
                    TrackGroupArray trackGroupArrayE = aVarG.e(i10);
                    if (1 == aVarG.d(i10)) {
                        for (int i11 = 0; i11 < trackGroupArrayE.f20392b; i11++) {
                            TrackGroup trackGroupB = trackGroupArrayE.b(i11);
                            Log.d("checkAudio", trackGroupB.b(0).toString());
                            if (i11 == 0 && DownloadVideoPlayActivity.this.O.equals("") && !o.b(trackGroupB.b(0).B)) {
                                DownloadVideoPlayActivity.this.O = trackGroupB.b(0).B;
                            }
                        }
                    } else if (3 == aVarG.d(i10)) {
                        for (int i12 = 0; i12 < trackGroupArrayE.f20392b; i12++) {
                            TrackGroup trackGroupB2 = trackGroupArrayE.b(i12);
                            Log.d("checkSubTitle", trackGroupB2.b(0).toString());
                            if (i12 == 0 && DownloadVideoPlayActivity.this.P.equals("") && !o.b(trackGroupB2.b(0).B)) {
                                DownloadVideoPlayActivity.this.P = trackGroupB2.b(0).B;
                            }
                        }
                    }
                }
            }
            defaultTrackSelector.L(defaultTrackSelector.v().g().j(DownloadVideoPlayActivity.this.P).i(DownloadVideoPlayActivity.this.O));
        }

        @Override // t.k
        public void b(@Nullable ExoPlaybackException exoPlaybackException) {
        }

        @Override // t.k
        public void c() {
        }

        @Override // t.k
        public void d() {
            List<VideoDownloadEntity> list = DownloadVideoPlayActivity.this.list;
            if (list == null || list.size() <= 0 || DownloadVideoPlayActivity.this.N == DownloadVideoPlayActivity.this.list.size() - 1) {
                return;
            }
            DownloadVideoPlayActivity.this.loadVideoNext();
        }

        @Override // t.k
        public void e(boolean z10) {
        }
    }

    public class f implements b.c {
        public f() {
        }

        @Override // com.mgs.carparking.widgets.dialog.b.c
        public void a(String str) {
            DownloadVideoPlayActivity.this.P = str;
        }

        @Override // com.mgs.carparking.widgets.dialog.b.c
        public void b(String str) {
            DownloadVideoPlayActivity.this.O = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(f0 f0Var) throws Exception {
        this.N = f0Var.a();
        if (this.f44827z.getVideoType() == 3) {
            setNumPlay(f0Var.a());
        } else if (this.f44827z.getVideoType() == 2 || this.f44827z.getVideoType() == 4) {
            setNumPlay(f0Var.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(ic.e eVar) throws Exception {
        if (((ActivityDownloadVideoPlayBinding) this.f42500o).f42581b.getAdRewardVisibilty()) {
            ((ActivityDownloadVideoPlayBinding) this.f42500o).f42581b.e(8);
            if (this.f44821t != null) {
                if (!eVar.a()) {
                    this.f44821t.h0();
                    return;
                }
                this.f44821t.M();
                if (eVar.b()) {
                    return;
                }
                this.S = System.currentTimeMillis();
                l0.i1(l0.k());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(ic.c cVar) throws Exception {
        this.S = System.currentTimeMillis();
        VideoAdLookDao.getInstance().insertVideoAd(this.f44827z.getId() + "" + this.f44827z.getCollection());
    }

    public void adPlayWx(boolean z10, boolean z11, AdInfoDetailEntry adInfoDetailEntry, Activity activity, VideoPlayerView videoPlayerView, int i10, int i11, View view, Handler handler, w.a aVar, int i12) {
        if (z11 && adInfoDetailEntry.getNew_user_has_ad() != 1) {
            this.f44821t.h0();
            return;
        }
        h hVar = new h(this, adInfoDetailEntry);
        this.R = hVar;
        a0.c(z10, hVar, adInfoDetailEntry, activity, videoPlayerView, i10, i11, view, handler, i12, "");
    }

    public void clearAd() {
        if (((ActivityDownloadVideoPlayBinding) this.f42500o).f42581b.getAdRewardVisibilty()) {
            ((ActivityDownloadVideoPlayBinding) this.f42500o).f42581b.e(8);
        }
        h hVar = this.R;
        if (hVar != null) {
            hVar.a();
            this.R = null;
        }
    }

    public void enterLoadAd() {
        if (l0.x() == 0) {
            loadAdPlay(false, false, this, ((ActivityDownloadVideoPlayBinding) this.f42500o).f42581b, this.f44827z.getId(), this.f44827z.getCollection(), this.F, this.Q, this.f44821t);
        } else if (l0.X() >= l0.k()) {
            loadAdPlay(false, false, this, ((ActivityDownloadVideoPlayBinding) this.f42500o).f42581b, this.f44827z.getId(), this.f44827z.getCollection(), this.F, this.Q, this.f44821t);
        } else {
            this.f44821t.h0();
        }
    }

    public void enterLoadAdNew() {
        if (l0.x() == 0) {
            loadAdPlay(false, true, this, ((ActivityDownloadVideoPlayBinding) this.f42500o).f42581b, this.f44827z.getId(), this.f44827z.getCollection(), this.F, this.Q, this.f44821t);
        } else if (l0.X() >= l0.k()) {
            loadAdPlay(false, true, this, ((ActivityDownloadVideoPlayBinding) this.f42500o).f42581b, this.f44827z.getId(), this.f44827z.getCollection(), this.F, this.Q, this.f44821t);
        } else {
            this.f44821t.h0();
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_download_video_play;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        String url;
        super.initData();
        this.f44827z = (VideoDownloadEntity) getIntent().getSerializableExtra("videoDownloadEntry");
        this.list = (List) getIntent().getSerializableExtra("videoDownloadList");
        this.B = getIntent().getBooleanExtra("flag", false);
        this.F = (TextView) findViewById(R.id.tv_speed);
        this.C = (LinearLayout) findViewById(R.id.rl_speed);
        this.E = (LinearLayout) findViewById(R.id.ll_set_num);
        this.D = (LinearLayout) findViewById(R.id.ll_audio_subtitle);
        this.C.setOnClickListener(this);
        this.D.setOnClickListener(this);
        ImageView imageView = (ImageView) findViewById(R.id.iv_video_more);
        this.J = imageView;
        imageView.setOnClickListener(this);
        ArrayList<VideoLookHistoryEntry> arrayListQueryItemHistory = VideoLookHistoryDao.getInstance().queryItemHistory(this.f44827z.getId());
        if (arrayListQueryItemHistory.size() > 0) {
            for (int i10 = 0; i10 < arrayListQueryItemHistory.size(); i10++) {
                if (this.f44827z.getComplete_name().equals(arrayListQueryItemHistory.get(i10).getName())) {
                    VideoLookHistoryEntry videoLookHistoryEntry = arrayListQueryItemHistory.get(i10);
                    this.A = videoLookHistoryEntry;
                    this.O = videoLookHistoryEntry.getAudiotype();
                    this.P = this.A.getSubtitletype();
                }
            }
        }
        if (this.list != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.list.size()) {
                    break;
                }
                if (this.f44827z.getStreamid().equals(this.list.get(i11).getStreamid())) {
                    this.N = i11;
                    break;
                }
                i11++;
            }
        }
        this.f44825x = (ImageView) findViewById(R.id.exo_controls_back);
        this.f44823v = (ProgressBar) findViewById(R.id.exo_video_audio_brightness_pro_my);
        this.f44822u = (ProgressBar) findViewById(R.id.exo_video_audio_pro_my);
        this.f44824w = (ImageView) findViewById(R.id.exo_video_fast_img_my);
        this.G = (ImageView) findViewById(R.id.iv_exo_next);
        this.H = (TextView) findViewById(R.id.tv_set_num);
        this.G.setOnClickListener(this);
        this.E.setOnClickListener(this);
        if (this.B) {
            this.G.setVisibility(0);
            this.E.setVisibility(0);
        }
        this.f44825x.setOnClickListener(new a());
        this.f44821t = new e.b(this, 1, R.id.exo_play_context_id).d(new x.a(this)).h(true).i(false).k(false).j(this.f44827z.getComplete_name()).e(new d()).g(new c()).f(new b()).b();
        if (o.b(this.f44827z.getOrginal_url())) {
            url = this.f44827z.getUrl();
        } else if (this.f44827z.getOrginal_url().endsWith(".mp4")) {
            url = "http://127.0.0.1:" + AppApplication.port + "/resource.mp4?src=" + ed.f.a(this.f44827z.getOrginal_url());
        } else {
            url = "http://127.0.0.1:" + AppApplication.port + "/resource.m3u8?src=" + ed.f.a(this.f44827z.getOrginal_url());
        }
        if (!o.b(url)) {
            this.f44821t.Z(url);
            VideoLookHistoryEntry videoLookHistoryEntry2 = this.A;
            if (videoLookHistoryEntry2 != null) {
                this.f44821t.c0(videoLookHistoryEntry2.getContentPosition());
            }
            Log.i("wangyi", "播放链接为：" + this.f44827z.getUrl());
        }
        ed.e.a();
        if (l0.z() || l0.H() >= l0.C()) {
            this.f44821t.h0();
        } else {
            if (VideoAdLookDao.getInstance().isExist(this.f44827z.getId() + "" + this.f44827z.getCollection())) {
                if (l0.Q() == 0) {
                    this.f44821t.h0();
                } else if (l0.h() == 1) {
                    enterLoadAd();
                } else {
                    enterLoadAdNew();
                }
            } else if (l0.h() == 1) {
                enterLoadAd();
            } else {
                enterLoadAdNew();
            }
        }
        this.f44821t.v(new e());
        ((ActivityDownloadVideoPlayBinding) this.f42500o).f42581b.O(true);
        setRequestedOrientation(0);
        getWindow().getDecorView().setSystemUiVisibility(0);
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public DOWNLOADVIDEOPLAYVIEWMODEL initViewModel() {
        return new DOWNLOADVIDEOPLAYVIEWMODEL(BaseApplication.getInstance(), tb.a.a());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        k(op.a.a().d(f0.class).subscribe(new dm.g() { // from class: vc.h
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f85965b.C((ic.f0) obj);
            }
        }));
        k(op.a.a().d(ic.e.class).subscribe(new dm.g() { // from class: vc.i
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f85967b.D((ic.e) obj);
            }
        }));
        k(op.a.a().d(ic.c.class).subscribe(new dm.g() { // from class: vc.j
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f85969b.E((ic.c) obj);
            }
        }));
    }

    public void insertHistory() {
        if (this.f44821t.D() == null || this.f44821t.D().getContentPosition() <= 0) {
            return;
        }
        VideoLookHistoryEntry videoLookHistoryEntry = new VideoLookHistoryEntry();
        videoLookHistoryEntry.setId(this.f44827z.getId());
        if (this.f44827z.getVideoType() == 2 || this.f44827z.getVideoType() == 4 || this.f44827z.getVideoType() == 3) {
            videoLookHistoryEntry.setName(this.f44827z.getComplete_name());
        } else {
            videoLookHistoryEntry.setName(this.f44827z.getName());
        }
        videoLookHistoryEntry.setCoverUrl(this.f44827z.getCoverUrl());
        videoLookHistoryEntry.setVideoDesc("");
        videoLookHistoryEntry.setVideoType(this.f44827z.getVideoType());
        videoLookHistoryEntry.setUrl(this.f44827z.getUrl());
        videoLookHistoryEntry.setUpdateTime(System.currentTimeMillis());
        videoLookHistoryEntry.setCurrent(this.f44827z.getVideo_position());
        videoLookHistoryEntry.setContentPosition(this.f44821t.D().getContentPosition());
        videoLookHistoryEntry.setDuration(this.f44821t.A());
        videoLookHistoryEntry.setAudiotype(this.O);
        videoLookHistoryEntry.setSubtitletype(this.P);
        VideoLookHistoryDao.getInstance().insertHistory(videoLookHistoryEntry);
    }

    public void loadAdPlay(boolean z10, boolean z11, Activity activity, VideoPlayerView videoPlayerView, int i10, int i11, View view, Handler handler, w.a aVar) {
        if (AppApplication.adInfoEntry.getAd_position_4() == null || AppApplication.adInfoEntry.getAd_position_4().size() <= 0) {
            this.f44821t.h0();
            return;
        }
        List<AdInfoDetailEntry> ad_position_4 = AppApplication.adInfoEntry.getAd_position_4();
        int num = AdNumShowDao.getInstance().getNum(23);
        if (num >= ad_position_4.size() - 1) {
            if (!z11) {
                showAdAwardPlayerType(z10, z11, ad_position_4, activity, videoPlayerView, i10, i11, view, handler, this.f44821t, 0);
                return;
            }
            if (ad_position_4.get(0).getNew_user_has_ad() != 1) {
                clearAd();
            } else if (((ActivityDownloadVideoPlayBinding) this.f42500o).f42581b.getAdRewardVisibilty()) {
                return;
            }
            showAdAwardPlayerType(z10, z11, ad_position_4, activity, videoPlayerView, i10, i11, view, handler, this.f44821t, 0);
            return;
        }
        if (!z11) {
            showAdAwardPlayerType(z10, z11, ad_position_4, activity, videoPlayerView, i10, i11, view, handler, this.f44821t, num + 1);
            return;
        }
        int i12 = num + 1;
        if (ad_position_4.get(i12).getNew_user_has_ad() != 1) {
            clearAd();
        } else if (((ActivityDownloadVideoPlayBinding) this.f42500o).f42581b.getAdRewardVisibilty()) {
            return;
        }
        showAdAwardPlayerType(z10, z11, ad_position_4, activity, videoPlayerView, i10, i11, view, handler, this.f44821t, i12);
    }

    public void loadVideoNext() {
        String url;
        if (this.list.size() > 0) {
            if (this.N >= this.list.size() - 1) {
                p.b(r.b().getResources().getString(R.string.str_play_last_tip));
                return;
            }
            int i10 = this.N + 1;
            this.N = i10;
            VideoDownloadEntity videoDownloadEntity = this.list.get(i10);
            this.f44827z = videoDownloadEntity;
            if (o.b(videoDownloadEntity.getOrginal_url())) {
                url = this.f44827z.getUrl();
            } else if (this.f44827z.getOrginal_url().endsWith(".mp4")) {
                url = "http://127.0.0.1:" + AppApplication.port + "/resource.mp4?src=" + ed.f.a(this.f44827z.getOrginal_url());
            } else {
                url = "http://127.0.0.1:" + AppApplication.port + "/resource.m3u8?src=" + ed.f.a(this.f44827z.getOrginal_url());
            }
            this.f44821t.S();
            this.f44821t.Z(url);
            ((ActivityDownloadVideoPlayBinding) this.f42500o).f42581b.setTitle(this.f44827z.getComplete_name());
            this.f44821t.c0(0L);
            this.f44821t.h0();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        w.a aVar = this.f44821t;
        if (aVar == null || !aVar.I()) {
            finish();
        } else {
            finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_exo_next /* 2131362737 */:
                if (this.f44821t != null) {
                    loadVideoNext();
                }
                break;
            case R.id.iv_video_more /* 2131362781 */:
                l lVar = new l(this, this, ((ActivityDownloadVideoPlayBinding) this.f42500o).f42581b);
                this.K = lVar;
                lVar.showAtLocation(((ActivityDownloadVideoPlayBinding) this.f42500o).f42581b, 5, 0, 0);
                break;
            case R.id.ll_audio_subtitle /* 2131362829 */:
                if (this.f44826y == null) {
                    com.mgs.carparking.widgets.dialog.b bVar = new com.mgs.carparking.widgets.dialog.b(this, this.f44821t, this.O, this.P);
                    this.f44826y = bVar;
                    bVar.b(new f());
                }
                this.f44826y.showAtLocation(((ActivityDownloadVideoPlayBinding) this.f42500o).f42581b, 5, 0, 0);
                break;
            case R.id.ll_set_num /* 2131362846 */:
                VideoDownloadEntity videoDownloadEntity = this.f44827z;
                if (videoDownloadEntity != null) {
                    if (videoDownloadEntity.getVideoType() == 2 || this.f44827z.getVideoType() == 4) {
                        com.mgs.carparking.widgets.dialog.downloadcomplete.a aVar = new com.mgs.carparking.widgets.dialog.downloadcomplete.a(this, this.list, this.N);
                        this.L = aVar;
                        aVar.showAtLocation(((ActivityDownloadVideoPlayBinding) this.f42500o).f42581b, 5, 0, 0);
                    } else if (this.f44827z.getVideoType() == 3) {
                        com.mgs.carparking.widgets.dialog.downloadcomplete.b bVar2 = new com.mgs.carparking.widgets.dialog.downloadcomplete.b(this, this.list, this.N);
                        this.M = bVar2;
                        bVar2.showAtLocation(((ActivityDownloadVideoPlayBinding) this.f42500o).f42581b, 5, 0, 0);
                    }
                }
                break;
            case R.id.rl_speed /* 2131363423 */:
                if (this.I == null) {
                    this.I = new g(this, this.f44821t, this.F);
                }
                this.I.showAtLocation(((ActivityDownloadVideoPlayBinding) this.f42500o).f42581b, 5, 0, 0);
                break;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        w.a aVar = this.f44821t;
        if (aVar != null) {
            aVar.J(configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zp.l.d(this, false, R.color.black);
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        w.a aVar = this.f44821t;
        if (aVar != null) {
            aVar.K();
        }
        if (this.I != null) {
            this.I = null;
        }
        if (this.K != null) {
            this.K = null;
        }
        if (this.L != null) {
            this.L = null;
        }
        if (this.M != null) {
            this.M = null;
        }
    }

    @Override // com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        insertHistory();
        w.a aVar = this.f44821t;
        if (aVar != null) {
            aVar.L();
        }
    }

    @Override // com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        w.a aVar = this.f44821t;
        if (aVar != null) {
            aVar.M();
        }
    }

    public void setNumPlay(int i10) {
        String url;
        VideoDownloadEntity videoDownloadEntity = this.list.get(i10);
        this.f44827z = videoDownloadEntity;
        if (o.b(videoDownloadEntity.getOrginal_url())) {
            url = this.f44827z.getUrl();
        } else if (this.f44827z.getOrginal_url().endsWith(".mp4")) {
            url = "http://127.0.0.1:" + AppApplication.port + "/resource.mp4?src=" + ed.f.a(this.f44827z.getOrginal_url());
        } else {
            url = "http://127.0.0.1:" + AppApplication.port + "/resource.m3u8?src=" + ed.f.a(this.f44827z.getOrginal_url());
        }
        this.f44821t.S();
        this.f44821t.Z(url);
        ((ActivityDownloadVideoPlayBinding) this.f42500o).f42581b.setTitle(this.f44827z.getComplete_name());
        this.f44821t.c0(0L);
        this.f44821t.h0();
    }

    public void showAdAwardPlayerType(boolean z10, boolean z11, List<AdInfoDetailEntry> list, Activity activity, VideoPlayerView videoPlayerView, int i10, int i11, View view, Handler handler, w.a aVar, int i12) {
        AdInfoDetailEntry adInfoDetailEntry = AppApplication.adInfoEntry.getAd_position_4().get(i12);
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() <= 0) {
                adPlayWx(z10, z11, adInfoDetailEntry, activity, videoPlayerView, i10, i11, view, handler, aVar, i12);
                return;
            }
            if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(8)) {
                adPlayWx(z10, z11, adInfoDetailEntry, activity, videoPlayerView, i10, i11, view, handler, aVar, i12);
                return;
            }
            int i13 = i12 + 1;
            if (i13 == list.size()) {
                i13 = 0;
            }
            showAdAwardPlayerType(z10, z11, list, activity, videoPlayerView, i10, i11, view, handler, aVar, i13);
        }
    }
}
