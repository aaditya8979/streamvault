package com.mgs.carparking.ui.homecontent.videodetail;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.media.AudioManager;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.Formatter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import chuangyuan.ycj.videolibrary.widget.VideoPlayerView;
import com.bumptech.glide.Glide;
import com.dramarush.shortin.R;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.source.TrackGroup;
import com.google.android.exoplayer.source.TrackGroupArray;
import com.google.android.exoplayer.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer.trackselection.b;
import com.google.android.exoplayer.ui.PlayerControlView;
import com.ironsource.Z7;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityVideoPlayDetailBinding;
import com.mgs.carparking.databinding.DialogClingOpenFloatBinding;
import com.mgs.carparking.databinding.PopLayoutVideoCommentItemBinding;
import com.mgs.carparking.databinding.PopLayoutVideoSeasonItemBinding;
import com.mgs.carparking.db.AdNumShowDao;
import com.mgs.carparking.db.VideoAdLookDao;
import com.mgs.carparking.db.VideoLookHistoryDao;
import com.mgs.carparking.db.VideoShareDao;
import com.mgs.carparking.db.VideoSkipDao;
import com.mgs.carparking.db.VideoStayTimeDao;
import com.mgs.carparking.dbtable.VideoCollectionEntry;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import com.mgs.carparking.dbtable.VideoShareEntry;
import com.mgs.carparking.dbtable.VideoSkipEntry;
import com.mgs.carparking.dbtable.VideoStayTimeEntry;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.mgs.carparking.netbean.BarrageListEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.netbean.VideoBean;
import com.mgs.carparking.netbean.VideoShareDataEntry;
import com.mgs.carparking.ui.MainActivity;
import com.mgs.carparking.ui.channelcontent.SpecialDetailNewActivity;
import com.mgs.carparking.ui.login.LoginActivity;
import com.mgs.carparking.ui.mine.share.ExtensionShareActivity;
import com.mgs.carparking.ui.web.WebActivity;
import com.mgs.carparking.widgets.dialog.BarrageDialog;
import com.mgs.carparking.widgets.dialog.BarrageHorizonalDialog;
import com.mgs.carparking.widgets.dialog.ClingDeviceDialog;
import com.mgs.carparking.widgets.dialog.ShareDialog;
import com.mgs.carparking.widgets.dialog.b;
import com.mgs.carparking.widgets.dialog.m;
import com.safedk.android.utils.Logger;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import ed.d0;
import ed.l0;
import ed.x;
import ep.c;
import ic.a0;
import ic.c0;
import ic.e0;
import ic.f0;
import ic.g0;
import ic.h0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.crash.CustomActivityOnCrash;
import okhttp3.Response;
import v.a;
import w.e;

/* JADX INFO: loaded from: classes7.dex */
public class VideoPlayDetailActivity extends BaseActivity<ActivityVideoPlayDetailBinding, VIDEOPLAYDETAILVIEWMODEL> implements View.OnClickListener {
    public com.mgs.carparking.widgets.dialog.b A;
    public com.mgs.carparking.widgets.dialog.f B;
    public com.mgs.carparking.widgets.dialog.c C;
    public VideoShareDataEntry C0;
    public com.mgs.carparking.widgets.dialog.m D;
    public sd.d D0;
    public com.mgs.carparking.widgets.dialog.d E;
    public sd.g E0;
    public com.mgs.carparking.widgets.dialog.e F;
    public com.mgs.carparking.widgets.dialog.h G;
    public Dialog G0;
    public com.mgs.carparking.widgets.dialog.j H;
    public Dialog H0;
    public com.mgs.carparking.widgets.dialog.l I;
    public BarrageDialog J;
    public ShareDialog K;
    public BarrageHorizonalDialog L;
    public FrameLayout L0;
    public int M;
    public PopupWindow M0;
    public int N;
    public ImageView P0;
    public VideoLookHistoryEntry Q;
    public ImageView Q0;
    public VideoSkipEntry R;
    public fd.c S;
    public DanmakuContext S0;
    public fd.h T;
    public ep.f T0;
    public LinearLayout U;
    public ip.a U0;
    public LinearLayout V;
    public LinearLayout W;
    public AdInfoDetailEntry W0;
    public ImageView X;
    public TextView X0;
    public ImageView Y;
    public TextView Y0;
    public ImageView Z;
    public LinearLayout Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ImageView f44706a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public LinearLayout f44707a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ImageView f44708b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ImageView f44710c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ImageView f44712d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public ImageView f44714e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public r0.l f44715e1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ImageView f44716f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public fd.d f44717f1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ProgressBar f44718g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ProgressBar f44719h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ImageView f44720i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public TextView f44721j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public TextView f44722k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public TextView f44723l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public TextView f44724m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public TextView f44725n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public ConstraintLayout f44726o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public RelativeLayout f44727p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public RelativeLayout f44728q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public AppCompatTextView f44729r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public AudioManager f44730s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public w.a f44731t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public CommentListAdapter f44732t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public RecommandVideosEntity f44733u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public TvAndComicAdapter f44734u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public VarietyAdapter f44736v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public sd.j f44737w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public RelativeLayout f44738w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public com.mgs.carparking.widgets.dialog.k f44739x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public PopupWindow f44740x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public com.mgs.carparking.widgets.dialog.i f44741y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public PopLayoutVideoCommentItemBinding f44742y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.mgs.carparking.widgets.dialog.g f44743z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<VideoBean> f44735v = new ArrayList();
    public int O = 0;
    public int P = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f44744z0 = false;
    public long A0 = System.currentTimeMillis();
    public boolean B0 = false;
    public d0 F0 = null;
    public DialogClingOpenFloatBinding I0 = null;
    public boolean J0 = false;
    public boolean K0 = false;
    public String N0 = "";
    public String O0 = "";
    public boolean R0 = false;
    public boolean sendDanmaku = false;
    public Handler V0 = new Handler();

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public ClingDeviceDialog f44709b1 = null;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public com.mgs.carparking.widgets.dialog.a f44711c1 = null;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f44713d1 = false;

    public class a implements t.m {
        public a() {
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (intent == null) {
                return;
            }
            context.startActivity(intent);
        }

        @Override // t.m
        public void a() {
            ((VIDEOPLAYDETAILVIEWMODEL) VideoPlayDetailActivity.this.f42501p).Z.call();
        }

        @Override // t.m
        public void b() {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(VideoPlayDetailActivity.this, new Intent(VideoPlayDetailActivity.this, (Class<?>) ExtensionShareActivity.class));
        }
    }

    public class b implements t.k {
        public b() {
        }

        @Override // t.k
        public void a(long j10) {
            Log.i("wangyi", "开始播放");
            try {
                DefaultTrackSelector defaultTrackSelector = (DefaultTrackSelector) VideoPlayDetailActivity.this.f44731t.D().Q();
                b.a aVarG = defaultTrackSelector.g();
                if (aVarG != null) {
                    for (int i10 = 0; i10 < aVarG.c(); i10++) {
                        TrackGroupArray trackGroupArrayE = aVarG.e(i10);
                        if (1 == aVarG.d(i10)) {
                            for (int i11 = 0; i11 < trackGroupArrayE.f20392b; i11++) {
                                TrackGroup trackGroupB = trackGroupArrayE.b(i11);
                                Log.d("checkAudio", trackGroupB.b(0).toString());
                                if (i11 == 0 && VideoPlayDetailActivity.this.N0.equals("") && !zp.o.b(trackGroupB.b(0).B)) {
                                    VideoPlayDetailActivity.this.N0 = trackGroupB.b(0).B;
                                }
                            }
                        } else if (3 == aVarG.d(i10)) {
                            for (int i12 = 0; i12 < trackGroupArrayE.f20392b; i12++) {
                                TrackGroup trackGroupB2 = trackGroupArrayE.b(i12);
                                Log.d("checkSubTitle", trackGroupB2.b(0).toString());
                                if (i12 == 0 && VideoPlayDetailActivity.this.O0.equals("") && !zp.o.b(trackGroupB2.b(0).B)) {
                                    VideoPlayDetailActivity.this.O0 = trackGroupB2.b(0).B;
                                }
                            }
                        }
                    }
                }
                defaultTrackSelector.L(defaultTrackSelector.v().g().j(VideoPlayDetailActivity.this.O0).i(VideoPlayDetailActivity.this.N0));
            } catch (Exception unused) {
            }
            if (VideoPlayDetailActivity.this.T0 != null) {
                VideoPlayDetailActivity videoPlayDetailActivity = VideoPlayDetailActivity.this;
                if (videoPlayDetailActivity.sendDanmaku) {
                    videoPlayDetailActivity.sendDanmaku = false;
                    return;
                }
            }
            if (VideoPlayDetailActivity.this.T0 == null || j10 < 0) {
                return;
            }
            VideoPlayDetailActivity.this.T0.g(Long.valueOf(j10));
        }

        @Override // t.k
        public void b(@Nullable ExoPlaybackException exoPlaybackException) {
            Log.i("wangyi", "onPlayerError");
            if (tp.b.a(VideoPlayDetailActivity.this) && exoPlaybackException.type == 0) {
                ((VIDEOPLAYDETAILVIEWMODEL) VideoPlayDetailActivity.this.f42501p).P(3, "", exoPlaybackException.getMessage(), VideoPlayDetailActivity.this.M, VideoPlayDetailActivity.this.N, (VideoPlayDetailActivity.this.f44731t.z() / 1000) + "");
                if (VideoPlayDetailActivity.this.f44731t.z() >= 0) {
                    VideoPlayDetailActivity.this.f44731t.c0(VideoPlayDetailActivity.this.f44731t.z() + 10000);
                } else {
                    VideoPlayDetailActivity.this.f44731t.c0(0L);
                }
            }
        }

        @Override // t.k
        public void c() {
            Log.i("wangyi", "onLoadingChanged");
        }

        @Override // t.k
        public void d() {
            if (VideoPlayDetailActivity.this.f44735v.size() <= 0 || VideoPlayDetailActivity.this.O != VideoPlayDetailActivity.this.f44735v.size() - 1) {
                VideoPlayDetailActivity.this.loadVideoNext();
            }
        }

        @Override // t.k
        public void e(boolean z10) {
            if (VideoPlayDetailActivity.this.T0 != null) {
                if (z10) {
                    VideoPlayDetailActivity.this.T0.toggle();
                    return;
                }
                VideoPlayDetailActivity videoPlayDetailActivity = VideoPlayDetailActivity.this;
                videoPlayDetailActivity.sendDanmaku = true;
                videoPlayDetailActivity.T0.pause();
            }
        }
    }

    public class c implements a.b {
        public c() {
        }

        @Override // v.a.b
        public void b(long j10, long j11, long j12) {
            if (VideoPlayDetailActivity.this.R == null || VideoPlayDetailActivity.this.R.getProgress_end() <= 5 || !VideoPlayDetailActivity.this.K0 || j12 <= 50) {
                return;
            }
            long j13 = (j12 - j10) / 1000;
            if ((j13 == VideoPlayDetailActivity.this.R.getProgress_end() || j13 == VideoPlayDetailActivity.this.R.getProgress_end() - 1) && VideoPlayDetailActivity.this.f44731t.H()) {
                VideoPlayDetailActivity.this.K0 = false;
                VideoPlayDetailActivity.this.loadVideoNext();
            }
        }
    }

    public class d implements b.c {
        public d() {
        }

        @Override // com.mgs.carparking.widgets.dialog.b.c
        public void a(String str) {
            VideoPlayDetailActivity.this.O0 = str;
        }

        @Override // com.mgs.carparking.widgets.dialog.b.c
        public void b(String str) {
            VideoPlayDetailActivity.this.N0 = str;
        }
    }

    public class e implements DialogInterface.OnDismissListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            VideoPlayDetailActivity videoPlayDetailActivity = VideoPlayDetailActivity.this;
            videoPlayDetailActivity.sendDanmaku = true;
            if (videoPlayDetailActivity.f44731t == null || VideoPlayDetailActivity.this.f44731t.D() == null) {
                return;
            }
            VideoPlayDetailActivity.this.f44731t.D().setPlayWhenReady(true);
        }
    }

    public class f implements BarrageDialog.d {
        public f() {
        }

        @Override // com.mgs.carparking.widgets.dialog.BarrageDialog.d
        public void a(String str) {
            if (VideoPlayDetailActivity.this.f44731t != null) {
                VideoPlayDetailActivity.this.J.dismiss();
                ((VIDEOPLAYDETAILVIEWMODEL) VideoPlayDetailActivity.this.f42501p).a0(VideoPlayDetailActivity.this.M, VideoPlayDetailActivity.this.N, str, VideoPlayDetailActivity.this.f44731t.z());
            }
        }
    }

    public class g implements BarrageHorizonalDialog.d {
        public g() {
        }

        @Override // com.mgs.carparking.widgets.dialog.BarrageHorizonalDialog.d
        public void a(String str) {
            if (VideoPlayDetailActivity.this.f44731t != null) {
                VideoPlayDetailActivity.this.L.dismiss();
                ((VIDEOPLAYDETAILVIEWMODEL) VideoPlayDetailActivity.this.f42501p).a0(VideoPlayDetailActivity.this.M, VideoPlayDetailActivity.this.N, str, VideoPlayDetailActivity.this.f44731t.z());
            }
        }
    }

    public class h implements qe.g {
        public h() {
        }

        @Override // qe.g
        public void d(@NonNull oe.f fVar) {
        }
    }

    public class i implements qe.e {
        public i() {
        }

        @Override // qe.e
        public void a(@NonNull oe.f fVar) {
            ((VIDEOPLAYDETAILVIEWMODEL) VideoPlayDetailActivity.this.f42501p).M0(false, VideoPlayDetailActivity.this.M);
        }
    }

    public class j implements c.d {
        public j() {
        }

        @Override // ep.c.d
        public void a() {
        }

        @Override // ep.c.d
        public void b(fp.c cVar) {
        }

        @Override // ep.c.d
        public void c() {
            VideoPlayDetailActivity.this.T0.start();
            if (VideoPlayDetailActivity.this.f44731t == null || !VideoPlayDetailActivity.this.f44731t.H()) {
                return;
            }
            VideoPlayDetailActivity.this.T0.g(Long.valueOf(VideoPlayDetailActivity.this.f44731t.z()));
        }

        @Override // ep.c.d
        public void d(fp.e eVar) {
        }
    }

    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class l implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f44756b;

        public l(List list) {
            this.f44756b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < this.f44756b.size(); i10++) {
                VideoPlayDetailActivity.this.k1(true, ((BarrageListEntry) this.f44756b.get(i10)).getContent(), ((BarrageListEntry) this.f44756b.get(i10)).getSend_time() * 1000, 1);
            }
        }
    }

    public class m extends ip.a {
        @Override // ip.a
        public fp.k e() {
            return new gp.e();
        }
    }

    public class n implements fd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f44758a;

        public n(AdInfoDetailEntry adInfoDetailEntry) {
            this.f44758a = adInfoDetailEntry;
        }

        @Override // fd.a
        public void a(String str, String str2) {
            ed.c.e(1, this.f44758a.getAd_type(), this.f44758a.getAd_source_id(), 8, this.f44758a.getAd_id(), 0, 0, 0);
            ed.c.d("adposition:8 Ad_source_id:" + this.f44758a.getAd_source_id() + " +s:" + str + " s1:" + str2);
        }

        @Override // fd.a
        public void b() {
            ed.c.e(3, this.f44758a.getAd_type(), this.f44758a.getAd_source_id(), 8, this.f44758a.getAd_id(), 1, 0, 0);
            Log.i("wangyi", "信息流广告-被点击");
        }

        @Override // fd.a
        public void c() {
            Log.i("wangyi", "关闭onADClose");
            ((ActivityVideoPlayDetailBinding) VideoPlayDetailActivity.this.f42500o).f42813s.removeAllViews();
            ((VIDEOPLAYDETAILVIEWMODEL) VideoPlayDetailActivity.this.f42501p).f44207l.set(Boolean.FALSE);
        }

        @Override // fd.a
        public void onAdShow() {
            ((VIDEOPLAYDETAILVIEWMODEL) VideoPlayDetailActivity.this.f42501p).f44207l.set(Boolean.TRUE);
            ed.c.e(2, this.f44758a.getAd_type(), this.f44758a.getAd_source_id(), 8, this.f44758a.getAd_id(), 1, 0, 0);
        }

        @Override // fd.a
        public void onSuccess() {
            ed.c.e(4, this.f44758a.getAd_type(), this.f44758a.getAd_source_id(), 8, this.f44758a.getAd_id(), 1, 0, 0);
        }
    }

    public class o implements View.OnClickListener {
        public o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MainActivity.mClingPlayControl != null) {
                ((ActivityVideoPlayDetailBinding) VideoPlayDetailActivity.this.f42500o).f42796b.setLeLinkState(8);
                VideoPlayDetailActivity.this.f44731t.U();
                op.a.a().b(new ic.y());
                if (VideoPlayDetailActivity.this.f44715e1 != null) {
                    VideoPlayDetailActivity.this.f44715e1.b(null);
                }
                if (VideoPlayDetailActivity.this.f44709b1 != null) {
                    VideoPlayDetailActivity.this.f44709b1.i();
                    VideoPlayDetailActivity.this.f44709b1 = null;
                }
                if (VideoPlayDetailActivity.this.f44711c1 != null) {
                    VideoPlayDetailActivity.this.f44711c1.f();
                    VideoPlayDetailActivity.this.f44711c1 = null;
                }
            }
        }
    }

    public class p implements View.OnClickListener {
        public p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (v.e.k(VideoPlayDetailActivity.this)) {
                VideoPlayDetailActivity.this.LeLinkHorizalPop();
            } else {
                VideoPlayDetailActivity.this.LelinkPop();
            }
        }
    }

    public class q implements ClingDeviceDialog.b {

        public class a implements r0.p<bn.r> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r0.l f44763a;

            public a(r0.l lVar) {
                this.f44763a = lVar;
            }

            @Override // r0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(bn.r rVar) {
                Log.e("setasetaseta", "onSuccess");
                this.f44763a.a("1", null);
            }

            @Override // r0.p
            public void onFailure(@NonNull String str) {
                Log.e("setasetasetaerr", str);
            }
        }

        public q() {
        }

        @Override // com.mgs.carparking.widgets.dialog.ClingDeviceDialog.b
        public void a(r0.l lVar, qr.a<?, ?, ?> aVar) {
            VideoPlayDetailActivity.this.f44715e1 = lVar;
            if (VideoPlayDetailActivity.this.f44735v == null || VideoPlayDetailActivity.this.f44735v.size() <= 0) {
                return;
            }
            if (((ActivityVideoPlayDetailBinding) VideoPlayDetailActivity.this.f42500o).f42796b != null) {
                ((ActivityVideoPlayDetailBinding) VideoPlayDetailActivity.this.f42500o).f42796b.setLeLinkState(0);
            }
            if (VideoPlayDetailActivity.this.f44731t != null) {
                VideoPlayDetailActivity.this.f44731t.O();
            }
            if (lVar != null) {
                VideoPlayDetailActivity.this.Y0.setText(aVar.m().d());
                VideoPlayDetailActivity.this.X0.setText(zp.r.b().getResources().getString(R.string.str_cling_ing));
            }
            Log.e("setasetaseta", ((VideoBean) VideoPlayDetailActivity.this.f44735v.get(VideoPlayDetailActivity.this.O)).getVod_url());
            String strReplace = ((VideoBean) VideoPlayDetailActivity.this.f44735v.get(VideoPlayDetailActivity.this.O)).getVod_url().replace("127.0.0.1", VideoPlayDetailActivity.this.getip());
            Log.e("setasetasetb", strReplace);
            lVar.c(strReplace, VideoPlayDetailActivity.this.f44733u.getVod_name(), new a(lVar));
        }
    }

    public class r implements ClingDeviceDialog.b {

        public class a implements r0.p<bn.r> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r0.l f44766a;

            public a(r0.l lVar) {
                this.f44766a = lVar;
            }

            @Override // r0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(bn.r rVar) {
                Log.e("setasetaseta", "onSuccess");
                this.f44766a.a("1", null);
            }

            @Override // r0.p
            public void onFailure(@NonNull String str) {
                Log.e("setasetasetaerr", str);
            }
        }

        public r() {
        }

        @Override // com.mgs.carparking.widgets.dialog.ClingDeviceDialog.b
        public void a(r0.l lVar, qr.a<?, ?, ?> aVar) {
            if (VideoPlayDetailActivity.this.f44735v == null || VideoPlayDetailActivity.this.f44735v.size() <= 0) {
                return;
            }
            if (((ActivityVideoPlayDetailBinding) VideoPlayDetailActivity.this.f42500o).f42796b != null) {
                ((ActivityVideoPlayDetailBinding) VideoPlayDetailActivity.this.f42500o).f42796b.setLeLinkState(0);
            }
            if (VideoPlayDetailActivity.this.f44731t != null) {
                VideoPlayDetailActivity.this.f44731t.O();
            }
            if (lVar != null) {
                VideoPlayDetailActivity.this.Y0.setText(aVar.m().d());
                VideoPlayDetailActivity.this.X0.setText(zp.r.b().getResources().getString(R.string.str_cling_ing));
            }
            String strReplace = ((VideoBean) VideoPlayDetailActivity.this.f44735v.get(VideoPlayDetailActivity.this.O)).getVod_url().replace("127.0.0.1", VideoPlayDetailActivity.this.getip());
            Log.e("setasetaseta", strReplace);
            lVar.c(strReplace, "11", new a(lVar));
        }
    }

    public class s implements x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f44768a;

        public s(String str) {
            this.f44768a = str;
        }

        @Override // ed.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get onFail：" + iOException.toString());
        }

        @Override // ed.x.b
        public void b(Response response) {
            try {
                ((VIDEOPLAYDETAILVIEWMODEL) VideoPlayDetailActivity.this.f42501p).S0(VideoPlayDetailActivity.this.M, this.f44768a, response.body().string(), VideoPlayDetailActivity.this.P);
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    public class t implements t.h {
        public t() {
        }

        @Override // t.h
        public void a(int i10) {
            ((ActivityVideoPlayDetailBinding) VideoPlayDetailActivity.this.f42500o).f42796b.getGestureFastForwardLayout().setVisibility(0);
            Glide.with((FragmentActivity) VideoPlayDetailActivity.this).load(Integer.valueOf(R.drawable.ic_video_fast)).into(VideoPlayDetailActivity.this.f44720i0);
            VideoPlayDetailActivity.this.f44731t.a0(2.0f, 1.0f);
        }
    }

    public class u implements t.j {
        public u() {
        }

        @Override // t.j
        public void a(int i10, int i11) {
            ((ActivityVideoPlayDetailBinding) VideoPlayDetailActivity.this.f42500o).f42796b.getGestureAudioLayout().setVisibility(0);
            VideoPlayDetailActivity.this.f44718g0.setMax(i10);
            VideoPlayDetailActivity.this.f44718g0.setProgress(i11);
        }
    }

    public class v implements t.g {
        public v() {
        }

        @Override // t.g
        public void b(int i10, int i11) {
            ((ActivityVideoPlayDetailBinding) VideoPlayDetailActivity.this.f42500o).f42796b.getGestureBrightnessLayout().setVisibility(0);
            VideoPlayDetailActivity.this.f44719h0.setMax(i10);
            VideoPlayDetailActivity.this.f44719h0.setProgress(i11);
        }
    }

    public class w implements PlayerControlView.d {
        public w() {
        }

        @Override // com.google.android.exoplayer.ui.PlayerControlView.d
        public void a(int i10) {
            VideoPlayDetailActivity.this.f44738w0.removeAllViews();
            if (i10 != 1) {
                VideoPlayDetailActivity.this.f44738w0.setVisibility(8);
                fd.g gVar = ed.b.f61032a;
                if (gVar != null) {
                    gVar.c();
                    return;
                }
                return;
            }
            if (l0.z() || AppApplication.adInfoEntry.getAd_position_16() == null || AppApplication.adInfoEntry.getAd_position_16().size() <= 0) {
                return;
            }
            List<AdInfoDetailEntry> ad_position_16 = AppApplication.adInfoEntry.getAd_position_16();
            VideoPlayDetailActivity videoPlayDetailActivity = VideoPlayDetailActivity.this;
            ed.b.k(videoPlayDetailActivity, videoPlayDetailActivity.f44738w0, ad_position_16);
        }
    }

    public class x implements Runnable {
        public x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((ActivityVideoPlayDetailBinding) VideoPlayDetailActivity.this.f42500o).f42820z.scrollTo(0, ((ActivityVideoPlayDetailBinding) VideoPlayDetailActivity.this.f42500o).f42815u.getTop());
        }
    }

    public class y implements m.e {
        public y() {
        }

        @Override // com.mgs.carparking.widgets.dialog.m.e
        public void a(String str, String str2) {
            VideoPlayDetailActivity.this.D.dismiss();
            ((VIDEOPLAYDETAILVIEWMODEL) VideoPlayDetailActivity.this.f42501p).P(1, str, str2, VideoPlayDetailActivity.this.f44733u.getId(), VideoPlayDetailActivity.this.N, "");
        }
    }

    public class z implements Runnable {
        public z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoPlayDetailActivity videoPlayDetailActivity = VideoPlayDetailActivity.this;
            CustomActivityOnCrash.H(videoPlayDetailActivity, CustomActivityOnCrash.t(videoPlayDetailActivity.getIntent()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A1(Void r42) {
        if (this.f44733u == null || this.f44735v.size() <= 0) {
            return;
        }
        com.mgs.carparking.widgets.dialog.m mVar = new com.mgs.carparking.widgets.dialog.m(this, this.f44733u, this.f44735v.get(this.O).getTitle());
        this.D = mVar;
        mVar.showAtLocation(((ActivityVideoPlayDetailBinding) this.f42500o).f42806l, 0, 0, 0);
        this.D.k(new y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B1(Void r32) {
        Bundle bundle = new Bundle();
        bundle.putString("web_url", l0.G() + "?vod_id=" + this.f44733u.getId() + "&collection=" + this.N);
        bundle.putString("web_title", zp.r.b().getResources().getString(R.string.str_vipweb_title));
        startActivity(WebActivity.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C1(Integer num) {
        this.D0.f79650d.stop();
        this.D0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D1(Void r10) {
        List<VideoBean> list;
        if (this.f44733u == null || (list = this.f44735v) == null || list.size() <= 0) {
            return;
        }
        if (this.f44733u.getType_pid() == 2 || this.f44733u.getType_pid() == 4) {
            com.mgs.carparking.widgets.dialog.h hVar = new com.mgs.carparking.widgets.dialog.h(this, this, this.f44735v, ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).A.get().intValue(), this.f44733u, (VIDEOPLAYDETAILVIEWMODEL) this.f42501p);
            this.G = hVar;
            hVar.showAsDropDown(((ActivityVideoPlayDetailBinding) this.f42500o).f42796b);
        } else if (this.f44733u.getType_pid() == 3) {
            com.mgs.carparking.widgets.dialog.j jVar = new com.mgs.carparking.widgets.dialog.j(this, this, this.f44735v, this.f44733u.getCoverUrl(), ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).A.get().intValue(), this.f44733u, (VIDEOPLAYDETAILVIEWMODEL) this.f42501p);
            this.H = jVar;
            jVar.showAsDropDown(((ActivityVideoPlayDetailBinding) this.f42500o).f42796b);
        } else if (this.f44733u.getType_pid() == 1 || this.f44733u.getType_pid() == 31) {
            com.mgs.carparking.widgets.dialog.l lVar = new com.mgs.carparking.widgets.dialog.l(this, this, this.f44735v, this.f44733u, (VIDEOPLAYDETAILVIEWMODEL) this.f42501p);
            this.I = lVar;
            lVar.showAsDropDown(((ActivityVideoPlayDetailBinding) this.f42500o).f42796b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E1(Void r32) {
        if (((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).C.get().booleanValue()) {
            ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).C.set(Boolean.FALSE);
            ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).B.set(ContextCompat.getDrawable(BaseApplication.getInstance(), R.drawable.ic_video_land_collection));
            VideoCollectionEntry videoCollectionEntry = new VideoCollectionEntry();
            videoCollectionEntry.setId(this.M);
            videoCollectionEntry.setType_pid(this.f44733u.getType_pid());
            videoCollectionEntry.setVod_pic(this.f44733u.getVod_pic());
            videoCollectionEntry.setVod_name(this.f44733u.getVod_name());
            ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).a1(videoCollectionEntry, this.f44733u.getType_id());
            return;
        }
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).C.set(Boolean.TRUE);
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).B.set(ContextCompat.getDrawable(BaseApplication.getInstance(), R.drawable.ic_video_land_collection_select));
        VideoCollectionEntry videoCollectionEntry2 = new VideoCollectionEntry();
        videoCollectionEntry2.setId(this.M);
        videoCollectionEntry2.setType_pid(this.f44733u.getType_pid());
        videoCollectionEntry2.setVod_pic(this.f44733u.getVod_pic());
        videoCollectionEntry2.setVod_name(this.f44733u.getVod_name());
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).b1(videoCollectionEntry2, this.f44733u.getType_id());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F1(Void r82) {
        VideoShareDataEntry videoShareDataEntry = this.C0;
        if (videoShareDataEntry == null) {
            return;
        }
        if (videoShareDataEntry.getApp_share_url().contains("inner=1")) {
            Bundle bundle = new Bundle();
            bundle.putString("web_title", zp.r.b().getResources().getString(R.string.text_share));
            bundle.putString("web_url", this.C0.getApp_share_url());
            startActivity(WebActivity.class, bundle);
            return;
        }
        if (this.K == null) {
            this.D0 = new sd.d(this);
            this.K = new ShareDialog(this, this.D0, this.f44733u, this.C0, getWindowManager().getDefaultDisplay().getWidth(), getWindowManager().getDefaultDisplay().getHeight());
        }
        this.K.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G1(Void r32) {
        sd.g gVar = new sd.g(this, this, this.M, this.N);
        this.E0 = gVar;
        gVar.showAtLocation(((ActivityVideoPlayDetailBinding) this.f42500o).f42796b, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H1(ic.v vVar) throws Exception {
        if (vVar.getType() == 1) {
            ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).L0(vVar.a(), 1);
        } else {
            ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).N0(vVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I1(View view) {
        if (view == null) {
            return;
        }
        m2(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J1(Void r12) {
        PopupWindow popupWindow = this.f44740x0;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K1(Void r12) {
        ((ActivityVideoPlayDetailBinding) this.f42500o).f42814t.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L1(Void r32) {
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).M0(true, this.M);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M1(Void r12) {
        if (l0.B() == 0) {
            startActivity(LoginActivity.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N1(c0 c0Var) throws Exception {
        if (zp.o.b(l0.S())) {
            ((ActivityVideoPlayDetailBinding) this.f42500o).f42802h.setImageResource(R.drawable.ic_avatar_login_default);
        } else {
            ud.c.c(this, l0.S(), R.drawable.ic_avatar_default, R.drawable.ic_avatar_default, ((ActivityVideoPlayDetailBinding) this.f42500o).f42802h, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O1(List list) {
        ep.f fVar = this.T0;
        if (fVar == null) {
            initBarrage(list);
            return;
        }
        fVar.release();
        this.T0 = null;
        initBarrage(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P1(String str) {
        k1(true, str, this.f44731t.z() + 50, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q1(Boolean bool) {
        if (bool.booleanValue()) {
            l0.j0(1);
            Dialog dialog = this.G0;
            if (dialog != null) {
                dialog.dismiss();
            }
            this.V0.postDelayed(new z(), 300L);
            return;
        }
        op.a.a().b(new ic.e(this.J0, false));
        Dialog dialog2 = this.G0;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R1(Boolean bool) {
        if (!bool.booleanValue()) {
            Dialog dialog = this.H0;
            if (dialog != null) {
                dialog.dismiss();
                return;
            }
            return;
        }
        Dialog dialog2 = this.H0;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
        safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(this, new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + getPackageName())), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S1(Void r12) {
        n2(((ActivityVideoPlayDetailBinding) this.f42500o).A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T1(h0 h0Var) throws Exception {
        ArrayList<VideoLookHistoryEntry> arrayListQueryItemHistory = VideoLookHistoryDao.getInstance().queryItemHistory(this.M);
        if (arrayListQueryItemHistory.size() > 0) {
            this.Q = arrayListQueryItemHistory.get(0);
        }
        getSignInfo();
        this.f44724m0.setVisibility(8);
        this.f44726o0.setVisibility(8);
        if (((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.getAdRewardVisibilty()) {
            ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.e(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U1(ic.d dVar) throws Exception {
        this.J0 = dVar.a();
        toggleErrorCodeDialog(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V1(Void r12) {
        ((ActivityVideoPlayDetailBinding) this.f42500o).f42814t.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W1(ic.e eVar) throws Exception {
        if (((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.getAdRewardVisibilty()) {
            ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.e(8);
            if (this.f44731t != null) {
                if (eVar.a()) {
                    this.f44731t.M();
                    if (!eVar.b()) {
                        this.A0 = System.currentTimeMillis();
                        l0.i1(l0.k());
                    }
                } else {
                    o2();
                }
                lookAdArrivalTime();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X1(ic.f fVar) throws Exception {
        if (this.f44731t != null) {
            o2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y1(ic.i iVar) throws Exception {
        if (((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.getLeLinkVisibilty()) {
            ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.setLeLinkState(8);
            this.f44731t.U();
            this.f44709b1 = null;
            this.f44711c1 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z1(g0 g0Var) throws Exception {
        if (g0Var.a() == null) {
            this.R = null;
        } else {
            this.K0 = true;
            this.R = g0Var.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a2(ic.b bVar) throws Exception {
        if (v.e.k(this)) {
            LeLinkHorizalPop();
        } else {
            LelinkPop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b2(VideoShareDataEntry videoShareDataEntry) {
        this.C0 = videoShareDataEntry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c2(String str) {
        ed.a.a(this, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d2(Integer num) {
        insertHistory();
        if (ed.e.q()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("id", num.intValue());
        bundle.putInt("language_type", this.P);
        startActivity(VideoPlayDetailActivity.class, bundle);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e2(e0 e0Var) throws Exception {
        this.R0 = e0Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f2(Void r22) {
        ((ActivityVideoPlayDetailBinding) this.f42500o).f42820z.post(new x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g2(a0 a0Var) throws Exception {
        Bundle bundle = new Bundle();
        bundle.putInt("id", a0Var.a());
        startActivity(VideoPlayDetailActivity.class, bundle);
        finish();
    }

    public static ip.a getDefaultDanmakuParser() {
        return new m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h2(Integer num) {
        if (ed.e.q()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("id", this.M);
        bundle.putInt("language_type", num.intValue());
        startActivity(VideoPlayDetailActivity.class, bundle);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i2(Integer num) {
        if (ed.e.q()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("id", num.intValue());
        startActivity(VideoPlayDetailActivity.class, bundle);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j2(Integer num) {
        if (ed.e.q()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("id", num.intValue());
        bundle.putInt("flag", 1);
        startActivity(SpecialDetailNewActivity.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k2(long j10) {
        if ((System.currentTimeMillis() - this.A0) + l0.X() <= (l0.d() > 0 ? l0.d() : 3600000L) || l0.H() >= l0.C()) {
            return;
        }
        this.F0.b();
        this.F0 = null;
        w.a aVar = this.f44731t;
        if (aVar == null || aVar.D() == null || !this.f44731t.H() || ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.getAdRewardVisibilty()) {
            return;
        }
        if (l0.h() == 1) {
            loadAdCenterPlay(false, true, false, this, ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b, this.M, this.N, this.f44723l0, this.V0, this.f44731t);
        } else {
            loadAdCenterPlay(false, true, true, this, ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b, this.M, this.N, this.f44723l0, this.V0, this.f44731t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n1(Void r22) {
        if (zp.o.b(l0.J())) {
            ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).e0();
            return;
        }
        if (AppApplication.port < 7000) {
            AppApplication.loadP2pSdk();
        }
        getSignInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o1(Void r12) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p1(Void r32) {
        Bundle bundle = new Bundle();
        bundle.putInt("id", ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).f44201i);
        bundle.putString("uploadNickName", ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).f44213o.get());
        bundle.putString("uploadHeadUrl", ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).f44215p.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q1(Boolean bool) {
        if (this.f44737w == null) {
            this.f44737w = new sd.j(this, this, this.f44733u);
        }
        this.f44737w.showAsDropDown(((ActivityVideoPlayDetailBinding) this.f42500o).f42796b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r1(Boolean bool) {
        if (this.f44735v != null) {
            com.mgs.carparking.widgets.dialog.i iVar = new com.mgs.carparking.widgets.dialog.i(this, this.f44735v, ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).A.get().intValue());
            this.f44741y = iVar;
            iVar.showAsDropDown(((ActivityVideoPlayDetailBinding) this.f42500o).f42796b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s1(Boolean bool) {
        if (this.f44735v != null) {
            com.mgs.carparking.widgets.dialog.k kVar = new com.mgs.carparking.widgets.dialog.k(this, this.f44735v, this.f44733u.getCoverUrl(), this.f44733u.getVod_name(), ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).A.get().intValue());
            this.f44739x = kVar;
            kVar.showAsDropDown(((ActivityVideoPlayDetailBinding) this.f42500o).f42796b);
        }
    }

    public static void safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(ComponentActivity componentActivity, Intent intent, int i10) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (intent == null) {
            return;
        }
        componentActivity.startActivityForResult(intent, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t1(RecommandVideosEntity recommandVideosEntity) {
        this.f44733u = recommandVideosEntity;
        m1(recommandVideosEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u1(Integer num) {
        Log.i("wangyi", "打开某个视频：" + num);
        if (((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.getLeLinkVisibilty()) {
            ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.setLeLinkState(8);
            op.a.a().b(new ic.y());
        }
        com.mgs.carparking.widgets.dialog.b bVar = this.A;
        if (bVar != null) {
            bVar.dismiss();
            this.A = null;
        }
        int iIntValue = num.intValue();
        this.O = iIntValue;
        this.N = this.f44735v.get(iIntValue).getCollection();
        this.f44731t.S();
        this.f44731t.Z(this.f44735v.get(this.O).getVod_url());
        VideoSkipEntry videoSkipEntry = this.R;
        if (videoSkipEntry == null || videoSkipEntry.getProgress_head() <= 0) {
            this.f44731t.c0(0L);
        } else {
            this.f44731t.c0(this.R.getProgress_head() * 1000);
        }
        ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.f(8);
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).A.set(Integer.valueOf(this.O));
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).Y0(this.f44733u.getType_pid(), this.O);
        ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.setTitle(this.f44733u.getVod_name() + Z7.f30794r + this.f44735v.get(this.O).getTitle());
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).K0(this.M, this.f44735v.get(this.O).getCollection());
        if (!((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.getAdRewardVisibilty()) {
            d0 d0Var = this.F0;
            if (d0Var != null) {
                d0Var.b();
                this.F0 = null;
            }
            lookAdArrivalTime();
        }
        RecommandVideosEntity recommandVideosEntity = this.f44733u;
        if (recommandVideosEntity != null && recommandVideosEntity.is_share() == 1 && l0.L() == 1) {
            this.f44731t.h0();
            return;
        }
        ed.e.a();
        if (l0.z() || l0.H() >= l0.C()) {
            clearAd();
            this.f44731t.h0();
            return;
        }
        if (!VideoAdLookDao.getInstance().isExist(this.M + "" + this.N)) {
            if (this.f44735v.get(this.O).is_ad() == 1) {
                noChangeAd();
                return;
            } else if (l0.h() == 1) {
                selectLoadAd();
                return;
            } else {
                selectLoadAdNew();
                return;
            }
        }
        if (l0.Q() == 0) {
            clearAd();
            this.f44731t.h0();
        } else if (l0.h() == 1) {
            selectLoadAd();
        } else {
            selectLoadAdNew();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v1(Integer num) {
        RecommandVideosEntity recommandVideosEntity = this.f44733u;
        if (recommandVideosEntity != null) {
            if (recommandVideosEntity.getType_pid() == 3) {
                ((ActivityVideoPlayDetailBinding) this.f42500o).f42819y.scrollToPosition(num.intValue());
            } else if (this.f44733u.getType_pid() == 1 || this.f44733u.getType_pid() == 2 || this.f44733u.getType_pid() == 4) {
                ((ActivityVideoPlayDetailBinding) this.f42500o).f42818x.scrollToPosition(num.intValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w1(f0 f0Var) throws Exception {
        RecommandVideosEntity recommandVideosEntity = this.f44733u;
        if (recommandVideosEntity != null) {
            if (recommandVideosEntity.getType_pid() == 3) {
                ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).W0(f0Var.a());
                ((ActivityVideoPlayDetailBinding) this.f42500o).f42819y.scrollToPosition(f0Var.a());
            } else if (this.f44733u.getType_pid() == 1 || this.f44733u.getType_pid() == 2 || this.f44733u.getType_pid() == 4) {
                ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).X0(f0Var.a());
                ((ActivityVideoPlayDetailBinding) this.f42500o).f42818x.scrollToPosition(f0Var.a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x1(ic.c cVar) throws Exception {
        this.A0 = System.currentTimeMillis();
        VideoAdLookDao.getInstance().insertVideoAd(this.M + "" + this.N);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y1(ic.o oVar) throws Exception {
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).P0(this.M, oVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z1(Void r12) {
        AppApplication.loadP2pSdk();
        getSignInfo();
    }

    public void LeLinkHorizalPop() {
        q0.a.f77565b.g(this);
        if (!this.f44713d1) {
            initLeLinkView();
            this.f44713d1 = true;
        }
        op.a.a().b(new ic.z());
        if (this.f44711c1 == null) {
            com.mgs.carparking.widgets.dialog.a aVar = new com.mgs.carparking.widgets.dialog.a(this, this, MainActivity.mBrowseRegistryListener);
            this.f44711c1 = aVar;
            aVar.e(new r());
        }
        this.f44711c1.showAtLocation(((ActivityVideoPlayDetailBinding) this.f42500o).f42806l, 5, 0, 0);
    }

    public void LelinkPop() {
        q0.a.f77565b.g(this);
        if (!this.f44713d1) {
            initLeLinkView();
            this.f44713d1 = true;
        }
        op.a.a().b(new ic.z());
        if (rb.a.c().f() != null) {
            rb.a.c().d().n(MainActivity.mBrowseRegistryListener);
            rb.a.c().g();
        }
        if (this.f44709b1 == null) {
            ClingDeviceDialog clingDeviceDialog = new ClingDeviceDialog(this, this, MainActivity.mBrowseRegistryListener);
            this.f44709b1 = clingDeviceDialog;
            clingDeviceDialog.g(new q());
        }
        this.f44709b1.show();
    }

    public void adPlayCenterGDT(boolean z10, boolean z11, boolean z12, AdInfoDetailEntry adInfoDetailEntry, Activity activity, VideoPlayerView videoPlayerView, int i10, int i11, View view, Handler handler, w.a aVar, int i12) {
        if (!z12 || adInfoDetailEntry.getNew_user_has_ad() == 1) {
            if (z11) {
                this.f44731t.L();
            }
            AdNumShowDao.getInstance().updatePlayCenterIndex(i12);
        }
    }

    public void adPlayCenterTd(boolean z10, boolean z11, boolean z12, AdInfoDetailEntry adInfoDetailEntry, Activity activity, VideoPlayerView videoPlayerView, int i10, int i11, View view, Handler handler, w.a aVar, int i12) {
        if (!z12 || adInfoDetailEntry.getNew_user_has_ad() == 1) {
            if (z11) {
                this.f44731t.L();
            }
            AdNumShowDao.getInstance().updatePlayCenterIndex(i12);
        }
    }

    public void adPlayWx(boolean z10, boolean z11, AdInfoDetailEntry adInfoDetailEntry, Activity activity, VideoPlayerView videoPlayerView, int i10, int i11, View view, Handler handler, w.a aVar, int i12) {
        d0 d0Var = this.F0;
        if (d0Var != null) {
            d0Var.b();
            this.F0 = null;
        }
        if (z11 && adInfoDetailEntry.getNew_user_has_ad() != 1) {
            o2();
            return;
        }
        this.T = new fd.h(this, adInfoDetailEntry);
        String vod_url = this.f44735v.get(this.O).getVod_url();
        ed.a0.c(z10, this.T, adInfoDetailEntry, activity, videoPlayerView, i10, i11, view, handler, i12, vod_url.contains(".mp4") ? vod_url.substring(vod_url.substring(0, vod_url.indexOf("?src=")).length() + 5, vod_url.length()) : "");
    }

    public void clearAd() {
        if (((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.getAdRewardVisibilty()) {
            ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.e(8);
        }
        fd.c cVar = this.S;
        if (cVar != null) {
            cVar.b();
            this.S = null;
        }
        fd.h hVar = this.T;
        if (hVar != null) {
            hVar.a();
            this.T = null;
        }
        fd.d dVar = this.f44717f1;
        if (dVar != null) {
            dVar.d();
            this.f44717f1 = null;
        }
    }

    public void enterLoadAd() {
        if (l0.x() == 0) {
            loadAdPlay(false, false, this, ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b, this.M, this.N, this.f44723l0, this.V0, this.f44731t);
        } else if (l0.X() >= l0.k()) {
            loadAdPlay(false, false, this, ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b, this.M, this.N, this.f44723l0, this.V0, this.f44731t);
        } else {
            o2();
        }
    }

    public void enterLoadAdNew() {
        if (l0.x() == 0) {
            loadAdPlay(false, true, this, ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b, this.M, this.N, this.f44723l0, this.V0, this.f44731t);
        } else if (l0.X() >= l0.k()) {
            loadAdPlay(false, true, this, ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b, this.M, this.N, this.f44723l0, this.V0, this.f44731t);
        } else {
            o2();
        }
    }

    public void getSignInfo() {
        if (AppApplication.port <= 0) {
            ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).D.set(Boolean.FALSE);
            ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).f44231x.set(Boolean.TRUE);
            return;
        }
        String str = System.currentTimeMillis() + "";
        ed.x.a("http://127.0.0.1:" + AppApplication.port + "/control?msg=verify&device_id=" + ec.a.a(zp.r.b()) + this.M + "&ts=" + str, new s(str));
    }

    public String getip() {
        return Formatter.formatIpAddress(((WifiManager) getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress());
    }

    public void initBarrage(List<BarrageListEntry> list) {
        HashMap map = new HashMap();
        map.put(1, 2);
        HashMap map2 = new HashMap();
        Boolean bool = Boolean.TRUE;
        map2.put(1, bool);
        map2.put(5, bool);
        this.T0 = (ep.f) findViewById(R.id.sv_danmaku);
        DanmakuContext danmakuContextA = DanmakuContext.a();
        this.S0 = danmakuContextA;
        danmakuContextA.l(2, 3.0f).m(false).q(1.2f).p(1.2f).o(map).i(map2).k(40);
        if (this.T0 != null) {
            this.U0 = getDefaultDanmakuParser();
            this.T0.setCallback(new j());
            this.T0.b(this.U0, this.S0);
            this.T0.h(true);
            if (list == null || list.size() <= 0) {
                return;
            }
            this.V0.postDelayed(new l(list), 10L);
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_video_play_detail;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        if (zp.o.b(l0.R())) {
            ed.c.h("");
        }
        this.M = getIntent().getIntExtra("id", 0);
        this.P = getIntent().getIntExtra("language_type", 0);
        this.f44719h0 = (ProgressBar) findViewById(R.id.exo_video_audio_brightness_pro_my);
        this.f44718g0 = (ProgressBar) findViewById(R.id.exo_video_audio_pro_my);
        this.f44720i0 = (ImageView) findViewById(R.id.exo_video_fast_img_my);
        this.X = (ImageView) findViewById(R.id.iv_back);
        this.Z = (ImageView) findViewById(R.id.iv_back_hint);
        this.Y = (ImageView) findViewById(R.id.iv_exo_next);
        this.f44721j0 = (TextView) findViewById(R.id.tv_speed);
        this.f44725n0 = (TextView) findViewById(R.id.tv_set_audio);
        this.f44722k0 = (TextView) findViewById(R.id.tv_set_num);
        this.L0 = (FrameLayout) findViewById(R.id.flContainer);
        this.U = (LinearLayout) findViewById(R.id.rl_speed);
        this.V = (LinearLayout) findViewById(R.id.ll_audio_subtitle);
        this.W = (LinearLayout) findViewById(R.id.ll_set_num);
        this.f44727p0 = (RelativeLayout) findViewById(R.id.rl_bottom_horizontal);
        this.f44728q0 = (RelativeLayout) findViewById(R.id.rl_bottom_land);
        this.f44706a0 = (ImageView) findViewById(R.id.iv_barrage);
        this.f44723l0 = (TextView) findViewById(R.id.tv_barrage);
        this.f44708b0 = (ImageView) findViewById(R.id.iv_barrage_horizontal);
        this.f44710c0 = (ImageView) findViewById(R.id.iv_barrage_write_horizontal);
        this.f44712d0 = (ImageView) findViewById(R.id.iv_video_more);
        this.f44724m0 = (TextView) findViewById(R.id.tv_openvip_horizontal);
        this.f44726o0 = (ConstraintLayout) findViewById(R.id.vpLayout);
        this.f44716f0 = (ImageView) findViewById(R.id.iv_lelink_horizontal);
        this.f44714e0 = (ImageView) findViewById(R.id.iv_lelink_varical);
        this.f44729r0 = (AppCompatTextView) findViewById(R.id.exo_player_restart_id);
        this.P0 = (ImageView) findViewById(R.id.icFast);
        this.Q0 = (ImageView) findViewById(R.id.icRetreat);
        this.f44716f0.setVisibility(0);
        this.f44714e0.setVisibility(0);
        this.X.setOnClickListener(this);
        this.Y.setOnClickListener(this);
        this.U.setOnClickListener(this);
        this.V.setOnClickListener(this);
        this.W.setOnClickListener(this);
        this.f44706a0.setOnClickListener(this);
        this.f44723l0.setOnClickListener(this);
        this.f44708b0.setOnClickListener(this);
        this.f44710c0.setOnClickListener(this);
        this.f44712d0.setOnClickListener(this);
        this.f44724m0.setOnClickListener(this);
        this.f44714e0.setOnClickListener(this);
        this.f44716f0.setOnClickListener(this);
        this.f44729r0.setOnClickListener(this);
        this.Q0.setOnClickListener(this);
        this.P0.setOnClickListener(this);
        Glide.with((FragmentActivity) this).load(Integer.valueOf(R.drawable.ic_is_loading)).into(((ActivityVideoPlayDetailBinding) this.f42500o).f42799e);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.flPauseAd);
        this.f44738w0 = relativeLayout;
        relativeLayout.setOnClickListener(new k());
        this.f44738w0.setVisibility(8);
        PopLayoutVideoCommentItemBinding popLayoutVideoCommentItemBinding = (PopLayoutVideoCommentItemBinding) DataBindingUtil.inflate(LayoutInflater.from(zp.r.b()), R.layout.pop_layout_video_comment_item, null, false);
        this.f44742y0 = popLayoutVideoCommentItemBinding;
        popLayoutVideoCommentItemBinding.b((VIDEOPLAYDETAILVIEWMODEL) this.f42501p);
        DialogClingOpenFloatBinding dialogClingOpenFloatBinding = (DialogClingOpenFloatBinding) DataBindingUtil.inflate(LayoutInflater.from(this), R.layout.dialog_cling_open_float, null, false);
        this.I0 = dialogClingOpenFloatBinding;
        dialogClingOpenFloatBinding.b((VIDEOPLAYDETAILVIEWMODEL) this.f42501p);
        if (zp.o.b(l0.S())) {
            ((ActivityVideoPlayDetailBinding) this.f42500o).f42802h.setImageResource(R.drawable.ic_avatar_login_default);
        } else {
            ud.c.c(this, l0.S(), R.drawable.ic_avatar_default, R.drawable.ic_avatar_default, ((ActivityVideoPlayDetailBinding) this.f42500o).f42802h, false);
        }
        TvAndComicAdapter tvAndComicAdapter = new TvAndComicAdapter(this);
        this.f44734u0 = tvAndComicAdapter;
        ((ActivityVideoPlayDetailBinding) this.f42500o).f42818x.setAdapter(tvAndComicAdapter);
        VarietyAdapter varietyAdapter = new VarietyAdapter(this);
        this.f44736v0 = varietyAdapter;
        ((ActivityVideoPlayDetailBinding) this.f42500o).f42819y.setAdapter(varietyAdapter);
        CommentListAdapter commentListAdapter = new CommentListAdapter(this);
        this.f44732t0 = commentListAdapter;
        ((ActivityVideoPlayDetailBinding) this.f42500o).f42817w.setAdapter(commentListAdapter);
        initPlayer();
        ArrayList<VideoLookHistoryEntry> arrayListQueryItemHistory = VideoLookHistoryDao.getInstance().queryItemHistory(this.M);
        if (arrayListQueryItemHistory.size() > 0) {
            VideoLookHistoryEntry videoLookHistoryEntry = arrayListQueryItemHistory.get(0);
            this.Q = videoLookHistoryEntry;
            this.N0 = videoLookHistoryEntry.getAudiotype();
            this.O0 = this.Q.getSubtitletype();
        }
        ArrayList<VideoSkipEntry> arrayListQueryItemSkipVideo = VideoSkipDao.getInstance().queryItemSkipVideo(this.M);
        if (arrayListQueryItemSkipVideo.size() > 0) {
            this.R = arrayListQueryItemSkipVideo.get(0);
            this.K0 = true;
        }
        l1();
        if (zp.o.b(l0.J())) {
            ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).e0();
        } else {
            if (AppApplication.port < 7000) {
                AppApplication.loadP2pSdk();
            }
            getSignInfo();
        }
        loadAdInfo();
        loadAdFloatViewAd();
    }

    public void initLeLinkView() {
        this.X0 = (TextView) findViewById(R.id.tv_lelink_status);
        this.Y0 = (TextView) findViewById(R.id.tv_lelink_name);
        this.f44707a1 = (LinearLayout) findViewById(R.id.ll_lelink_change);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_lelink_close);
        this.Z0 = linearLayout;
        linearLayout.setOnClickListener(new o());
        this.f44707a1.setOnClickListener(new p());
    }

    public void initPlayer() {
        w.a aVarB = new e.b(this, 1, R.id.exo_play_context_id).d(new x.a(BaseApplication.getInstance(), new hd.a(this))).h(true).i(false).k(false).e(new v()).g(new u()).f(new t()).b();
        this.f44731t = aVarB;
        aVarB.N();
        this.f44731t.d0(true);
        this.f44731t.F().I();
        this.f44731t.F().getPlaybackControlView().setFull(false);
        this.f44731t.F().getPlaybackControlView().setCallBack(new w());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public VIDEOPLAYDETAILVIEWMODEL initViewModel() {
        return new VIDEOPLAYDETAILVIEWMODEL(BaseApplication.getInstance(), tb.a.a());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).E.observe(this, new Observer() { // from class: qc.l
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78229b.n1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).G.observe(this, new Observer() { // from class: qc.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78213b.o1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).f44202i0.observe(this, new Observer() { // from class: qc.p
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78237b.z1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).N.observe(this, new Observer() { // from class: qc.b0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78210b.K1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).M.observe(this, new Observer() { // from class: qc.m0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78232b.V1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).O.observe(this, new Observer() { // from class: qc.n0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78234b.f2((Void) obj);
            }
        });
        k(op.a.a().d(a0.class).subscribe(new dm.g() { // from class: qc.o0
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f78236b.g2((ic.a0) obj);
            }
        }));
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).D0.observe(this, new Observer() { // from class: qc.p0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78238b.h2((Integer) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).f44196f0.observe(this, new Observer() { // from class: qc.q0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78240b.i2((Integer) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).f44198g0.observe(this, new Observer() { // from class: qc.r0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78242b.j2((Integer) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).f44200h0.observe(this, new Observer() { // from class: qc.w
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78251b.p1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).b0().observe(this, new Observer() { // from class: qc.h0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78222b.q1((Boolean) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).c0().observe(this, new Observer() { // from class: qc.s0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78244b.r1((Boolean) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).d0().observe(this, new Observer() { // from class: qc.t0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78246b.s1((Boolean) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).f44186a0.observe(this, new Observer() { // from class: qc.u0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78248b.t1((RecommandVideosEntity) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).F.observe(this, new Observer() { // from class: qc.v0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78250b.u1((Integer) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).f44188b0.observe(this, new Observer() { // from class: qc.w0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78252b.v1((Integer) obj);
            }
        });
        k(op.a.a().d(f0.class).subscribe(new dm.g() { // from class: qc.x0
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f78254b.w1((ic.f0) obj);
            }
        }));
        k(op.a.a().d(ic.c.class).subscribe(new dm.g() { // from class: qc.b
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f78209b.x1((ic.c) obj);
            }
        }));
        k(op.a.a().d(ic.o.class).subscribe(new dm.g() { // from class: qc.c
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f78211b.y1((ic.o) obj);
            }
        }));
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).U.observe(this, new Observer() { // from class: qc.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78215b.A1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).Z.observe(this, new Observer() { // from class: qc.f
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78217b.B1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).f44211n.observe(this, new Observer() { // from class: qc.g
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78219b.C1((Integer) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).V.observe(this, new Observer() { // from class: qc.h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78221b.D1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).W.observe(this, new Observer() { // from class: qc.i
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78223b.E1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).X.observe(this, new Observer() { // from class: qc.j
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78225b.F1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).Y.observe(this, new Observer() { // from class: qc.k
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78227b.G1((Void) obj);
            }
        });
        k(op.a.a().d(ic.v.class).subscribe(new dm.g() { // from class: qc.m
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f78231b.H1((ic.v) obj);
            }
        }));
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).R.observe(this, new Observer() { // from class: qc.n
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78233b.I1((View) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).T.observe(this, new Observer() { // from class: qc.o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78235b.J1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).P.observe(this, new Observer() { // from class: qc.q
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78239b.L1((Void) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).Q.observe(this, new Observer() { // from class: qc.r
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78241b.M1((Void) obj);
            }
        });
        k(op.a.a().d(c0.class).subscribe(new dm.g() { // from class: qc.s
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f78243b.N1((ic.c0) obj);
            }
        }));
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).f44192d0.observe(this, new Observer() { // from class: qc.t
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78245b.O1((List) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).f44194e0.observe(this, new Observer() { // from class: qc.u
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78247b.P1((String) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).V0.observe(this, new Observer() { // from class: qc.v
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78249b.Q1((Boolean) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).Y0.observe(this, new Observer() { // from class: qc.x
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78253b.R1((Boolean) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).Z0.observe(this, new Observer() { // from class: qc.y
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78255b.S1((Void) obj);
            }
        });
        k(op.a.a().d(h0.class).subscribe(new dm.g() { // from class: qc.z
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f78256b.T1((ic.h0) obj);
            }
        }));
        k(op.a.a().d(ic.d.class).subscribe(new dm.g() { // from class: qc.a0
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f78208b.U1((ic.d) obj);
            }
        }));
        k(op.a.a().d(ic.e.class).subscribe(new dm.g() { // from class: qc.c0
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f78212b.W1((ic.e) obj);
            }
        }));
        k(op.a.a().d(ic.f.class).subscribe(new dm.g() { // from class: qc.d0
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f78214b.X1((ic.f) obj);
            }
        }));
        k(op.a.a().d(ic.i.class).subscribe(new dm.g() { // from class: qc.e0
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f78216b.Y1((ic.i) obj);
            }
        }));
        k(op.a.a().d(g0.class).subscribe(new dm.g() { // from class: qc.f0
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f78218b.Z1((ic.g0) obj);
            }
        }));
        k(op.a.a().d(ic.b.class).subscribe(new dm.g() { // from class: qc.g0
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f78220b.a2((ic.b) obj);
            }
        }));
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).f44190c0.observe(this, new Observer() { // from class: qc.i0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78224b.b2((VideoShareDataEntry) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).f44205k.observe(this, new Observer() { // from class: qc.j0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78226b.c2((String) obj);
            }
        });
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).f44230w0.observe(this, new Observer() { // from class: qc.k0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78228b.d2((Integer) obj);
            }
        });
        k(op.a.a().d(e0.class).subscribe(new dm.g() { // from class: qc.l0
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f78230b.e2((ic.e0) obj);
            }
        }));
    }

    public void insertHistory() {
        w.a aVar = this.f44731t;
        if (aVar == null || aVar.D() == null || this.f44731t.D().getContentPosition() < 0 || this.f44733u == null || this.f44735v.size() <= 0) {
            return;
        }
        if (this.f44731t.D().getContentPosition() > 0 || this.B0) {
            VideoLookHistoryEntry videoLookHistoryEntry = new VideoLookHistoryEntry();
            videoLookHistoryEntry.setId(this.f44733u.getId());
            videoLookHistoryEntry.setName(this.f44733u.getVod_name() + Z7.f30794r + this.f44735v.get(this.O).getTitle());
            videoLookHistoryEntry.setCoverUrl(this.f44733u.getVod_pic());
            videoLookHistoryEntry.setVideoDesc(this.f44735v.get(this.O).getOrginal_url());
            videoLookHistoryEntry.setVideoType(this.P);
            videoLookHistoryEntry.setAudiotype(this.N0);
            videoLookHistoryEntry.setSubtitletype(this.O0);
            if (this.f44735v.get(this.O).is_p2p() == 1) {
                videoLookHistoryEntry.setUrl(this.f44735v.get(this.O).getVod_url());
            } else {
                videoLookHistoryEntry.setUrl(this.f44735v.get(this.O).getOrginal_url());
            }
            videoLookHistoryEntry.setUpdateTime(System.currentTimeMillis());
            videoLookHistoryEntry.setCurrent(this.O);
            if (this.f44731t.A() <= 0) {
                videoLookHistoryEntry.setContentPosition(0L);
                videoLookHistoryEntry.setDuration(0L);
            } else {
                videoLookHistoryEntry.setContentPosition(this.f44731t.D().getContentPosition());
                videoLookHistoryEntry.setDuration(this.f44731t.A());
            }
            VideoLookHistoryDao.getInstance().insertHistory(videoLookHistoryEntry);
        }
    }

    public void insertVideoShare() {
        RecommandVideosEntity recommandVideosEntity = this.f44733u;
        if (recommandVideosEntity == null || zp.o.b(recommandVideosEntity.getVod_name())) {
            return;
        }
        VideoShareEntry videoShareEntry = new VideoShareEntry();
        videoShareEntry.setId(this.M);
        videoShareEntry.setName(this.f44733u.getVod_name());
        VideoShareDao.getInstance().insertStayTime(videoShareEntry);
    }

    public void insertVideoStay() {
        RecommandVideosEntity recommandVideosEntity = this.f44733u;
        if (recommandVideosEntity == null || zp.o.b(recommandVideosEntity.getVod_name())) {
            return;
        }
        VideoStayTimeEntry videoStayTimeEntry = new VideoStayTimeEntry();
        videoStayTimeEntry.setId(this.M);
        videoStayTimeEntry.setName(this.f44733u.getVod_name());
        VideoStayTimeDao.getInstance().insertStayTime(videoStayTimeEntry);
    }

    public final void k1(boolean z10, String str, long j10, int i10) {
        fp.c cVarB;
        DanmakuContext danmakuContext = this.S0;
        if (danmakuContext == null || (cVarB = danmakuContext.f74049z.b(1)) == null || this.T0 == null) {
            return;
        }
        cVarB.f61778e = new HashMap(16);
        cVarB.f61776c = str;
        cVarB.f61786m = 5;
        cVarB.f61787n = (byte) 0;
        cVarB.f61798y = z10;
        cVarB.A(j10);
        cVarB.f61784k = (this.U0.b().getDensity() - 0.6f) * 15.0f;
        if (i10 == 2) {
            cVarB.f61779f = Color.parseColor("#2d72ee");
        } else {
            cVarB.f61779f = -1;
        }
        this.T0.a(cVarB);
    }

    public final void l1() {
        ((ActivityVideoPlayDetailBinding) this.f42500o).f42814t.H(true);
        ((ActivityVideoPlayDetailBinding) this.f42500o).f42814t.I(false);
        new ClassicsFooter(this).u(12.0f);
        ((ActivityVideoPlayDetailBinding) this.f42500o).f42814t.L(new h());
        ((ActivityVideoPlayDetailBinding) this.f42500o).f42814t.K(new i());
    }

    public final void l2(int i10) {
        if (l0.z() || AppApplication.adInfoEntry.getAd_position_21() == null || AppApplication.adInfoEntry.getAd_position_21().size() <= 0) {
            if (i10 == 1) {
                LeLinkHorizalPop();
                return;
            } else {
                LelinkPop();
                return;
            }
        }
        List<AdInfoDetailEntry> ad_position_21 = AppApplication.adInfoEntry.getAd_position_21();
        int num = AdNumShowDao.getInstance().getNum(108);
        int i11 = num >= ad_position_21.size() - 1 ? 0 : num + 1;
        if (l0.h() == 1) {
            loadClingAdType(ad_position_21, this, i11, false);
        } else {
            loadClingAdType(ad_position_21, this, i11, true);
        }
    }

    public void loadAdCenterPlay(boolean z10, boolean z11, boolean z12, Activity activity, VideoPlayerView videoPlayerView, int i10, int i11, View view, Handler handler, w.a aVar) {
        if (AppApplication.adInfoEntry.getAd_position_13() == null || AppApplication.adInfoEntry.getAd_position_13().size() <= 0) {
            this.f44731t.M();
            return;
        }
        List<AdInfoDetailEntry> ad_position_13 = AppApplication.adInfoEntry.getAd_position_13();
        int num = AdNumShowDao.getInstance().getNum(50);
        if (num >= ad_position_13.size() - 1) {
            if (!z12) {
                showAdAwardCenterPlayerType(z10, z11, z12, ad_position_13, activity, videoPlayerView, i10, i11, view, handler, this.f44731t, 0);
                return;
            }
            if (ad_position_13.get(0).getNew_user_has_ad() != 1) {
                clearAd();
            } else if (((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.getAdRewardVisibilty()) {
                return;
            }
            showAdAwardCenterPlayerType(z10, z11, z12, ad_position_13, activity, videoPlayerView, i10, i11, view, handler, this.f44731t, 0);
            return;
        }
        if (!z12) {
            showAdAwardCenterPlayerType(z10, z11, z12, ad_position_13, activity, videoPlayerView, i10, i11, view, handler, this.f44731t, num + 1);
            return;
        }
        int i12 = num + 1;
        if (ad_position_13.get(i12).getNew_user_has_ad() != 1) {
            clearAd();
        } else if (((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.getAdRewardVisibilty()) {
            return;
        }
        showAdAwardCenterPlayerType(z10, z11, z12, ad_position_13, activity, videoPlayerView, i10, i11, view, handler, this.f44731t, i12);
    }

    public void loadAdFloatAdOnce(List<AdInfoDetailEntry> list, int i10) {
        AdInfoDetailEntry adInfoDetailEntry = list.get(i10);
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() <= 0) {
                AdNumShowDao.getInstance().updateFloatAdIndexNum(i10);
                loadFloatAdWX(adInfoDetailEntry);
            } else if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(103)) {
                AdNumShowDao.getInstance().updateFloatAdIndexNum(i10);
                loadFloatAdWX(adInfoDetailEntry);
            } else {
                int i11 = i10 + 1;
                if (i11 == list.size()) {
                    i11 = 0;
                }
                loadAdFloatAdOnce(list, i11);
            }
        }
    }

    public void loadAdFloatViewAd() {
        if (AppApplication.adInfoEntry.getAd_position_18() == null || AppApplication.adInfoEntry.getAd_position_18().size() <= 0) {
            return;
        }
        List<AdInfoDetailEntry> ad_position_18 = AppApplication.adInfoEntry.getAd_position_18();
        int num = AdNumShowDao.getInstance().getNum(102);
        if (num >= ad_position_18.size() - 1) {
            loadAdFloatAdOnce(ad_position_18, 0);
        } else {
            loadAdFloatAdOnce(ad_position_18, num + 1);
        }
    }

    public void loadAdInfo() {
        if (AppApplication.adInfoEntry.getAd_position_8() != null && AppApplication.adInfoEntry.getAd_position_8().size() > 0) {
            List<AdInfoDetailEntry> ad_position_8 = AppApplication.adInfoEntry.getAd_position_8();
            int num = AdNumShowDao.getInstance().getNum(25);
            if (num >= ad_position_8.size() - 1) {
                loadAdPlayInfoOnce(ad_position_8, 0);
            } else {
                loadAdPlayInfoOnce(ad_position_8, num + 1);
            }
        }
        if (AppApplication.adInfoEntry.getAd_position_2() != null) {
            AppApplication.adInfoEntry.getAd_position_2().size();
        }
    }

    public void loadAdPlay(boolean z10, boolean z11, Activity activity, VideoPlayerView videoPlayerView, int i10, int i11, View view, Handler handler, w.a aVar) {
        if (AppApplication.adInfoEntry.getAd_position_4() == null || AppApplication.adInfoEntry.getAd_position_4().size() <= 0) {
            o2();
            return;
        }
        List<AdInfoDetailEntry> ad_position_4 = AppApplication.adInfoEntry.getAd_position_4();
        int num = AdNumShowDao.getInstance().getNum(23);
        if (num >= ad_position_4.size() - 1) {
            if (!z11) {
                showAdAwardPlayerType(z10, z11, ad_position_4, activity, videoPlayerView, i10, i11, view, handler, this.f44731t, 0);
                return;
            }
            if (ad_position_4.get(0).getNew_user_has_ad() != 1) {
                clearAd();
            } else if (((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.getAdRewardVisibilty()) {
                return;
            }
            showAdAwardPlayerType(z10, z11, ad_position_4, activity, videoPlayerView, i10, i11, view, handler, this.f44731t, 0);
            return;
        }
        if (!z11) {
            showAdAwardPlayerType(z10, z11, ad_position_4, activity, videoPlayerView, i10, i11, view, handler, this.f44731t, num + 1);
            return;
        }
        int i12 = num + 1;
        if (ad_position_4.get(i12).getNew_user_has_ad() != 1) {
            clearAd();
        } else if (((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.getAdRewardVisibilty()) {
            return;
        }
        showAdAwardPlayerType(z10, z11, ad_position_4, activity, videoPlayerView, i10, i11, view, handler, this.f44731t, i12);
    }

    public void loadAdPlayInfoOnce(List<AdInfoDetailEntry> list, int i10) {
        AdInfoDetailEntry adInfoDetailEntry = list.get(i10);
        this.W0 = adInfoDetailEntry;
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (this.W0.getNum() <= 0) {
                AdNumShowDao.getInstance().updatePlayInfoIndex(i10);
                loadAdWX(this.W0);
            } else if (this.W0.getNum() > AdNumShowDao.getInstance().getNum(12)) {
                AdNumShowDao.getInstance().updatePlayInfoIndex(i10);
                loadAdWX(this.W0);
            } else {
                int i11 = i10 + 1;
                if (i11 == list.size()) {
                    i11 = 0;
                }
                loadAdPlayInfoOnce(list, i11);
            }
        }
    }

    public void loadAdWX(AdInfoDetailEntry adInfoDetailEntry) {
        AdNumShowDao.getInstance().updatePlayInfoTdNum(AdNumShowDao.getInstance().getNum(12) + 1);
        fd.c cVar = new fd.c(this);
        this.S = cVar;
        cVar.a(((ActivityVideoPlayDetailBinding) this.f42500o).f42813s, adInfoDetailEntry);
        ed.c.e(7, adInfoDetailEntry.getAd_type(), adInfoDetailEntry.getAd_source_id(), 8, adInfoDetailEntry.getAd_id(), 1, 0, 0);
        this.S.c(new n(adInfoDetailEntry));
    }

    public void loadClingAdType(List<AdInfoDetailEntry> list, Activity activity, int i10, boolean z10) {
        AdInfoDetailEntry adInfoDetailEntry = list.get(i10);
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() <= 0) {
                loadClingAdWx(activity, adInfoDetailEntry, i10, z10);
                return;
            }
            if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(109)) {
                loadClingAdWx(activity, adInfoDetailEntry, i10, z10);
                return;
            }
            int i11 = i10 + 1;
            if (i11 == list.size()) {
                i11 = 0;
            }
            loadClingAdType(list, activity, i11, z10);
        }
    }

    public void loadClingAdWx(Activity activity, AdInfoDetailEntry adInfoDetailEntry, int i10, boolean z10) {
        AdNumShowDao.getInstance().updateClingRewardIndex(i10);
        fd.h hVar = new fd.h(activity, adInfoDetailEntry);
        ed.a0.b(hVar, this.f44714e0, adInfoDetailEntry, new td.a(this, hVar), this, this.f44733u.getId(), this.N);
    }

    public void loadFloatAdWX(AdInfoDetailEntry adInfoDetailEntry) {
        fd.d dVar = new fd.d(this);
        this.f44717f1 = dVar;
        dVar.c(adInfoDetailEntry);
        AdNumShowDao.getInstance().updateWxFloatAdNum(AdNumShowDao.getInstance().getNum(103) + 1);
    }

    public void loadVideoNext() {
        List<VideoBean> list = this.f44735v;
        if (list == null || list.size() <= 0) {
            return;
        }
        if (this.O >= this.f44735v.size() - 1) {
            zp.p.b(zp.r.b().getResources().getString(R.string.str_play_last_tip));
            return;
        }
        com.mgs.carparking.widgets.dialog.b bVar = this.A;
        if (bVar != null) {
            bVar.dismiss();
            this.A = null;
        }
        this.B0 = true;
        int i10 = this.O + 1;
        this.O = i10;
        this.N = this.f44735v.get(i10).getCollection();
        this.f44731t.S();
        this.f44731t.Z(this.f44735v.get(this.O).getVod_url());
        VideoSkipEntry videoSkipEntry = this.R;
        if (videoSkipEntry == null || videoSkipEntry.getProgress_head() <= 0) {
            this.f44731t.c0(0L);
        } else {
            this.f44731t.c0(this.R.getProgress_head() * 1000);
        }
        this.K0 = true;
        ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.f(8);
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).A.set(Integer.valueOf(this.O));
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).Y0(this.f44733u.getType_pid(), this.O);
        ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.setTitle(this.f44733u.getVod_name() + Z7.f30794r + this.f44735v.get(this.O).getTitle());
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).K0(this.M, this.f44735v.get(this.O).getCollection());
        if (!((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.getAdRewardVisibilty()) {
            d0 d0Var = this.F0;
            if (d0Var != null) {
                d0Var.b();
                this.F0 = null;
            }
            lookAdArrivalTime();
        }
        RecommandVideosEntity recommandVideosEntity = this.f44733u;
        if (recommandVideosEntity != null && recommandVideosEntity.is_share() == 1 && l0.L() == 1) {
            this.f44731t.h0();
            return;
        }
        ed.e.a();
        if (l0.z() || l0.H() >= l0.C()) {
            clearAd();
            this.f44731t.h0();
            return;
        }
        if (!VideoAdLookDao.getInstance().isExist(this.M + "" + this.N)) {
            if (this.f44735v.get(this.O).is_ad() == 1) {
                noChangeAd();
                return;
            } else if (l0.h() == 1) {
                selectLoadAd();
                return;
            } else {
                selectLoadAdNew();
                return;
            }
        }
        if (l0.Q() == 0) {
            clearAd();
            this.f44731t.h0();
        } else if (l0.h() == 1) {
            selectLoadAd();
        } else {
            selectLoadAdNew();
        }
    }

    public void lookAdArrivalTime() {
        if (AppApplication.adInfoEntry.getAd_position_13() == null || AppApplication.adInfoEntry.getAd_position_13().size() <= 0) {
            return;
        }
        if (this.F0 == null) {
            this.F0 = new d0();
        }
        this.F0.c(180000L, new d0.b() { // from class: qc.a
            @Override // ed.d0.b
            public final void a(long j10) {
                this.f78207a.k2(j10);
            }
        });
    }

    public final void m1(RecommandVideosEntity recommandVideosEntity) {
        this.P = recommandVideosEntity.getAudio_type();
        if (l0.j() == 1 || recommandVideosEntity.getHide_ad() == 1) {
            findViewById(R.id.video_top_ad).setVisibility(0);
        }
        if (l0.z() || l0.G().equals("none")) {
            this.f44724m0.setVisibility(8);
            this.f44726o0.setVisibility(8);
        } else {
            this.f44724m0.setVisibility(0);
            this.f44726o0.setVisibility(0);
        }
        this.f44731t.l0(recommandVideosEntity.getVod_duration_free());
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).Q0(recommandVideosEntity.getType_pid(), recommandVideosEntity.getVod_tag(), recommandVideosEntity.getVod_area());
        if (recommandVideosEntity.getVod_collection() == null || recommandVideosEntity.getVod_collection().size() <= 0) {
            return;
        }
        List<VideoBean> vod_collection = recommandVideosEntity.getVod_collection();
        this.f44735v = vod_collection;
        if (vod_collection.size() > 0) {
            for (VideoBean videoBean : this.f44735v) {
                videoBean.setOrginal_url(videoBean.getVod_url());
                if (videoBean.is_p2p() == 1) {
                    videoBean.setVod_url(ed.e.B(videoBean.getVod_url()));
                }
            }
            if (recommandVideosEntity.getType_pid() == 1 || recommandVideosEntity.getType_pid() == 2 || recommandVideosEntity.getType_pid() == 4) {
                ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).f44233y.set(Boolean.TRUE);
                ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).f44235z.set(Boolean.FALSE);
                VideoLookHistoryEntry videoLookHistoryEntry = this.Q;
                if (videoLookHistoryEntry != null) {
                    int current = videoLookHistoryEntry.getCurrent();
                    this.O = current;
                    if (current >= this.f44735v.size()) {
                        this.O = this.f44735v.size() - 1;
                    }
                    this.N = this.f44735v.get(this.O).getCollection();
                    ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).T0(this.f44735v, this.Q.getCurrent());
                    this.f44731t.c0(this.Q.getContentPosition());
                } else {
                    this.N = this.f44735v.get(0).getCollection();
                    ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).T0(this.f44735v, 0);
                }
                ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.setTitle(recommandVideosEntity.getVod_name() + Z7.f30794r + this.f44735v.get(this.O).getTitle());
            } else if (recommandVideosEntity.getType_pid() == 3) {
                ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).f44235z.set(Boolean.TRUE);
                ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).f44233y.set(Boolean.FALSE);
                VideoLookHistoryEntry videoLookHistoryEntry2 = this.Q;
                if (videoLookHistoryEntry2 != null) {
                    int current2 = videoLookHistoryEntry2.getCurrent();
                    this.O = current2;
                    if (current2 >= this.f44735v.size()) {
                        this.O = this.f44735v.size() - 1;
                    }
                    this.N = this.f44735v.get(this.O).getCollection();
                    ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).R0(this.f44735v, this.Q.getCurrent(), recommandVideosEntity.getVod_pic());
                    this.f44731t.c0(this.Q.getContentPosition());
                } else {
                    this.N = this.f44735v.get(0).getCollection();
                    ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).R0(this.f44735v, 0, recommandVideosEntity.getVod_pic());
                }
                ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.setTitle(recommandVideosEntity.getVod_name() + Z7.f30794r + this.f44735v.get(this.O).getTitle());
            } else {
                ObservableField<Boolean> observableField = ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).f44235z;
                Boolean bool = Boolean.FALSE;
                observableField.set(bool);
                ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).f44233y.set(bool);
            }
        }
        if (!this.f44744z0) {
            ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).K0(this.M, this.N);
            this.f44744z0 = true;
        }
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).M0(true, this.M);
        this.f44731t.Z(this.f44735v.get(this.O).getVod_url());
        if (VideoShareDao.getInstance().isExist(this.M)) {
            recommandVideosEntity.set_share(0);
        }
        if (recommandVideosEntity.is_share() == 1 && l0.L() == 1) {
            this.f44731t.h0();
        } else {
            ed.e.a();
            if (l0.z() || l0.H() >= l0.C()) {
                this.f44731t.h0();
            } else {
                if (VideoAdLookDao.getInstance().isExist(this.M + "" + this.N)) {
                    if (l0.Q() == 0) {
                        if (AppApplication.adInfoEntry.getAd_position_13() == null || AppApplication.adInfoEntry.getAd_position_13().size() <= 0) {
                            this.f44731t.h0();
                        } else if (l0.X() <= (l0.d() > 0 ? l0.d() : 3600000L)) {
                            this.f44731t.h0();
                        } else if (l0.h() == 1) {
                            loadAdPlay(false, false, this, ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b, this.M, this.N, this.f44723l0, this.V0, this.f44731t);
                        } else {
                            loadAdPlay(false, true, this, ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b, this.M, this.N, this.f44723l0, this.V0, this.f44731t);
                        }
                    } else if (l0.h() == 1) {
                        enterLoadAd();
                    } else {
                        enterLoadAdNew();
                    }
                } else if (this.f44735v.get(this.O).is_ad() == 1) {
                    noChangeAd();
                } else if (l0.h() == 1) {
                    enterLoadAd();
                } else {
                    enterLoadAdNew();
                }
            }
        }
        this.f44731t.w(new a());
        this.f44731t.v(new b());
        ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.getPlaybackControlView().y(new c());
    }

    public final void m2(View view) {
        if (this.f44740x0 == null) {
            this.f44740x0 = new PopupWindow(this.f44742y0.getRoot(), -2, -2, true);
        }
        this.f44740x0.showAsDropDown(view, view.getWidth() / 2, (-view.getHeight()) - zp.j.a(30.0f, zp.r.b()), 17);
        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).R.setValue(null);
    }

    public final void n2(View view) {
        PopLayoutVideoSeasonItemBinding popLayoutVideoSeasonItemBinding = (PopLayoutVideoSeasonItemBinding) DataBindingUtil.inflate(LayoutInflater.from(zp.r.b()), R.layout.pop_layout_video_season_item, null, false);
        popLayoutVideoSeasonItemBinding.b((VIDEOPLAYDETAILVIEWMODEL) this.f42501p);
        if (this.M0 == null) {
            this.M0 = new PopupWindow(popLayoutVideoSeasonItemBinding.getRoot(), -2, -2, true);
        }
        this.M0.setFocusable(true);
        this.M0.showAsDropDown(view, 0, 0, 80);
    }

    public void noChangeAd() {
        if (l0.h() != 1) {
            loadAdPlay(false, true, this, ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b, this.M, this.N, this.f44723l0, this.V0, this.f44731t);
        } else {
            if (((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.getAdRewardVisibilty()) {
                return;
            }
            loadAdPlay(false, false, this, ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b, this.M, this.N, this.f44723l0, this.V0, this.f44731t);
        }
    }

    public final void o2() {
        this.f44731t.h0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        w.a aVar = this.f44731t;
        if (aVar != null && aVar.I()) {
            finish();
        }
        ep.f fVar = this.T0;
        if (fVar != null) {
            fVar.release();
            this.T0 = null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.exo_player_restart_id /* 2131362298 */:
                ed.e.z(this);
                break;
            case R.id.icFast /* 2131362442 */:
                if (this.f44731t.z() + 10000 <= this.f44731t.A() && v.e.k(this)) {
                    w.a aVar = this.f44731t;
                    aVar.V(aVar.z() + 10000);
                    break;
                }
                break;
            case R.id.icRetreat /* 2131362443 */:
                if (this.f44731t.z() - 10000 >= 0 && v.e.k(this)) {
                    w.a aVar2 = this.f44731t;
                    aVar2.V(aVar2.z() - 10000);
                    break;
                }
                break;
            case R.id.iv_back /* 2131362722 */:
                finish();
                break;
            case R.id.iv_barrage /* 2131362724 */:
                if (!this.f44706a0.getTag().equals("select")) {
                    this.f44706a0.setImageResource(R.drawable.ic_video_detail_danmu_open);
                    this.f44723l0.setVisibility(0);
                    this.f44706a0.setTag("select");
                    this.f44708b0.setImageResource(R.drawable.ic_video_detail_danmu_open);
                    this.f44710c0.setVisibility(8);
                    this.f44708b0.setTag("select");
                    ep.f fVar = this.T0;
                    if (fVar != null) {
                        fVar.show();
                    }
                } else {
                    this.f44706a0.setImageResource(R.drawable.ic_video_detail_danmu);
                    this.f44723l0.setVisibility(8);
                    this.f44706a0.setTag("unSelect");
                    this.f44708b0.setImageResource(R.drawable.ic_video_detail_danmu);
                    this.f44708b0.setVisibility(8);
                    this.f44708b0.setTag("unSelect");
                    ep.f fVar2 = this.T0;
                    if (fVar2 != null) {
                        fVar2.hide();
                    }
                }
                break;
            case R.id.iv_barrage_horizontal /* 2131362725 */:
                if (!this.f44708b0.getTag().equals("select")) {
                    if (!this.f44744z0) {
                        ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).K0(this.M, this.N);
                        this.f44744z0 = true;
                    }
                    this.f44708b0.setImageResource(R.drawable.ic_video_detail_danmu_open);
                    this.f44710c0.setVisibility(0);
                    this.f44708b0.setTag("select");
                    this.f44706a0.setImageResource(R.drawable.ic_video_detail_danmu_open);
                    this.f44723l0.setVisibility(0);
                    this.f44706a0.setTag("select");
                    ep.f fVar3 = this.T0;
                    if (fVar3 != null) {
                        fVar3.show();
                    }
                } else {
                    this.f44708b0.setImageResource(R.drawable.ic_video_detail_danmu);
                    this.f44710c0.setVisibility(8);
                    this.f44708b0.setTag("unSelect");
                    this.f44706a0.setImageResource(R.drawable.ic_video_detail_danmu);
                    this.f44723l0.setVisibility(8);
                    this.f44706a0.setTag("unSelect");
                    ep.f fVar4 = this.T0;
                    if (fVar4 != null) {
                        fVar4.hide();
                    }
                }
                break;
            case R.id.iv_barrage_write_horizontal /* 2131362726 */:
                BarrageHorizonalDialog barrageHorizonalDialog = new BarrageHorizonalDialog(this);
                this.L = barrageHorizonalDialog;
                barrageHorizonalDialog.show();
                this.L.i(new g());
                break;
            case R.id.iv_exo_next /* 2131362737 */:
                if (this.f44731t != null) {
                    loadVideoNext();
                }
                break;
            case R.id.iv_lelink_horizontal /* 2131362751 */:
                if (!this.f44731t.F().getAdRewardVisibilty()) {
                    l2(1);
                }
                break;
            case R.id.iv_lelink_varical /* 2131362752 */:
                if (!this.f44731t.F().getAdRewardVisibilty()) {
                    l2(0);
                }
                break;
            case R.id.iv_video_more /* 2131362781 */:
                com.mgs.carparking.widgets.dialog.f fVar5 = new com.mgs.carparking.widgets.dialog.f(this, this, this.f44733u, (VIDEOPLAYDETAILVIEWMODEL) this.f42501p, ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b, this.C, this.N, this.f44735v.get(this.O).getTitle());
                this.B = fVar5;
                fVar5.showAtLocation(((ActivityVideoPlayDetailBinding) this.f42500o).f42806l, 5, 0, 0);
                break;
            case R.id.ll_audio_subtitle /* 2131362829 */:
                if (this.A == null) {
                    com.mgs.carparking.widgets.dialog.b bVar = new com.mgs.carparking.widgets.dialog.b(this, this.f44731t, this.N0, this.O0);
                    this.A = bVar;
                    bVar.b(new d());
                }
                this.A.showAtLocation(((ActivityVideoPlayDetailBinding) this.f42500o).f42806l, 5, 0, 0);
                break;
            case R.id.ll_set_num /* 2131362846 */:
                if (this.f44735v != null) {
                    if (this.f44733u.getType_pid() == 1 || this.f44733u.getType_pid() == 2 || this.f44733u.getType_pid() == 4) {
                        com.mgs.carparking.widgets.dialog.d dVar = new com.mgs.carparking.widgets.dialog.d(this, this.f44735v, ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).A.get().intValue());
                        this.E = dVar;
                        dVar.showAtLocation(((ActivityVideoPlayDetailBinding) this.f42500o).f42809o, 5, 0, 0);
                    } else if (this.f44733u.getType_pid() == 3) {
                        com.mgs.carparking.widgets.dialog.e eVar = new com.mgs.carparking.widgets.dialog.e(this, this.f44735v, this.f44733u.getCoverUrl(), this.f44733u.getVod_name(), ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).A.get().intValue());
                        this.F = eVar;
                        eVar.showAtLocation(((ActivityVideoPlayDetailBinding) this.f42500o).f42809o, 5, 0, 0);
                    }
                }
                break;
            case R.id.rl_speed /* 2131363423 */:
                if (this.f44743z == null) {
                    this.f44743z = new com.mgs.carparking.widgets.dialog.g(this, this.f44731t, this.f44721j0);
                }
                this.f44743z.showAtLocation(((ActivityVideoPlayDetailBinding) this.f42500o).f42806l, 5, 0, 0);
                break;
            case R.id.tv_barrage /* 2131363684 */:
                BarrageDialog barrageDialog = new BarrageDialog(this, this);
                this.J = barrageDialog;
                barrageDialog.show();
                w.a aVar3 = this.f44731t;
                if (aVar3 != null && aVar3.D() != null) {
                    this.f44731t.D().setPlayWhenReady(false);
                }
                this.J.setOnDismissListener(new e());
                this.J.i(new f());
                break;
            case R.id.tv_openvip_horizontal /* 2131363730 */:
                ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).Z.call();
                break;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        ImageView imageView;
        w.a aVar = this.f44731t;
        if (aVar != null) {
            aVar.J(configuration);
        }
        super.onConfigurationChanged(configuration);
        if (v.e.k(this)) {
            Log.i("wangyi", "横屏");
            w.a aVar2 = this.f44731t;
            if (aVar2 != null && aVar2.F() != null && this.f44731t.F().getPlaybackControlView() != null) {
                this.f44731t.F().getPlaybackControlView().setFull(true);
            }
            RelativeLayout relativeLayout = this.f44727p0;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
            RelativeLayout relativeLayout2 = this.f44728q0;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(0);
            }
            ImageView imageView2 = this.Z;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            ImageView imageView3 = this.X;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            LinearLayout linearLayout = this.U;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.V;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            LinearLayout linearLayout3 = this.W;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
            }
            ImageView imageView4 = this.f44708b0;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
            ImageView imageView5 = this.f44710c0;
            if (imageView5 != null) {
                imageView5.setVisibility(8);
            }
            ImageView imageView6 = this.f44714e0;
            if (imageView6 != null) {
                imageView6.setVisibility(8);
            }
            ClingDeviceDialog clingDeviceDialog = this.f44709b1;
            if (clingDeviceDialog != null && clingDeviceDialog.isShowing()) {
                this.f44709b1.dismiss();
            }
            BarrageHorizonalDialog barrageHorizonalDialog = this.L;
            if (barrageHorizonalDialog != null && barrageHorizonalDialog.isShowing()) {
                this.L.dismiss();
            }
            RecommandVideosEntity recommandVideosEntity = this.f44733u;
            if (recommandVideosEntity == null || recommandVideosEntity.getType_pid() == 0 || (imageView = this.Y) == null || this.f44722k0 == null) {
                return;
            }
            imageView.setVisibility(0);
            this.f44722k0.setVisibility(0);
            return;
        }
        Log.i("wangyi", "竖屏");
        w.a aVar3 = this.f44731t;
        if (aVar3 != null && aVar3.F() != null && this.f44731t.F().getPlaybackControlView() != null) {
            this.f44731t.F().getPlaybackControlView().setFull(false);
        }
        RelativeLayout relativeLayout3 = this.f44727p0;
        if (relativeLayout3 != null) {
            relativeLayout3.setVisibility(0);
        }
        RelativeLayout relativeLayout4 = this.f44728q0;
        if (relativeLayout4 != null) {
            relativeLayout4.setVisibility(8);
        }
        ImageView imageView7 = this.Z;
        if (imageView7 != null) {
            imageView7.setVisibility(4);
        }
        ImageView imageView8 = this.X;
        if (imageView8 != null) {
            imageView8.setVisibility(0);
        }
        ImageView imageView9 = this.Y;
        if (imageView9 != null) {
            imageView9.setVisibility(8);
        }
        LinearLayout linearLayout4 = this.U;
        if (linearLayout4 != null && this.f44722k0 != null && this.V != null && this.W != null && this.f44708b0 != null) {
            linearLayout4.setVisibility(8);
            this.f44722k0.setVisibility(8);
            this.V.setVisibility(8);
            this.W.setVisibility(8);
            this.f44708b0.setVisibility(0);
        }
        ImageView imageView10 = this.f44708b0;
        if (imageView10 != null && imageView10.getTag().equals("select")) {
            this.f44710c0.setVisibility(0);
        }
        BarrageDialog barrageDialog = this.J;
        if (barrageDialog != null && barrageDialog.isShowing()) {
            this.J.dismiss();
        }
        com.mgs.carparking.widgets.dialog.g gVar = this.f44743z;
        if (gVar != null && gVar.isShowing()) {
            this.f44743z.dismiss();
        }
        com.mgs.carparking.widgets.dialog.f fVar = this.B;
        if (fVar != null) {
            if (fVar.isShowing()) {
                this.B.dismiss();
            }
            sd.k kVar = this.B.f45458w;
            if (kVar != null && kVar.isShowing()) {
                this.B.f45458w.dismiss();
            }
        }
        com.mgs.carparking.widgets.dialog.c cVar = this.C;
        if (cVar != null && cVar.isShowing()) {
            this.C.dismiss();
        }
        com.mgs.carparking.widgets.dialog.d dVar = this.E;
        if (dVar != null && dVar.isShowing()) {
            this.E.dismiss();
        }
        com.mgs.carparking.widgets.dialog.b bVar = this.A;
        if (bVar != null && bVar.isShowing()) {
            this.A.dismiss();
        }
        com.mgs.carparking.widgets.dialog.e eVar = this.F;
        if (eVar != null && eVar.isShowing()) {
            this.F.dismiss();
        }
        com.mgs.carparking.widgets.dialog.a aVar4 = this.f44711c1;
        if (aVar4 != null && aVar4.isShowing()) {
            this.f44711c1.dismiss();
        }
        ImageView imageView11 = this.f44714e0;
        if (imageView11 != null) {
            imageView11.setVisibility(0);
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zp.l.d(this, false, R.color.black);
        this.f44730s0 = (AudioManager) getSystemService("audio");
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        w.a aVar = this.f44731t;
        if (aVar != null) {
            if (aVar.F() != null) {
                if (!((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.getLeLinkVisibilty() && MainActivity.mClingPlayControl == null) {
                    op.a.a().b(new ic.y());
                }
                this.f44731t.F().K();
            }
            this.f44731t.K();
        }
        d0 d0Var = this.F0;
        if (d0Var != null) {
            d0Var.b();
            this.F0 = null;
        }
        ep.f fVar = this.T0;
        if (fVar != null) {
            fVar.release();
            this.T0 = null;
        }
        if (this.f44737w != null) {
            this.f44737w = null;
        }
        if (this.F != null) {
            this.F = null;
        }
        if (this.E != null) {
            this.E = null;
        }
        if (this.A != null) {
            this.A = null;
        }
        com.mgs.carparking.widgets.dialog.f fVar2 = this.B;
        if (fVar2 != null) {
            if (fVar2.f45458w != null) {
                fVar2.f45458w = null;
            }
            this.B = null;
        }
        if (this.f44743z != null) {
            this.f44743z = null;
        }
        if (this.f44741y != null) {
            this.f44741y = null;
        }
        if (this.f44739x != null) {
            this.f44737w = null;
        }
        if (this.M0 != null) {
            this.M0 = null;
        }
        if (this.H != null) {
            this.H = null;
        }
        com.mgs.carparking.widgets.dialog.l lVar = this.I;
        if (lVar != null) {
            lVar.f45602t.removeCallbacks(null);
            this.I = null;
        }
        if (this.G != null) {
            this.G = null;
        }
        if (this.L != null) {
            this.L = null;
        }
        if (this.J != null) {
            this.J = null;
        }
        if (this.K != null) {
            this.K = null;
        }
        Handler handler = this.V0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.V0 = null;
        }
        if (this.D0 != null) {
            this.D0 = null;
        }
        if (this.E0 != null) {
            this.E0 = null;
        }
        if (this.G0 != null) {
            this.G0 = null;
        }
        if (this.H0 != null) {
            this.H0 = null;
        }
        if (this.f44740x0 != null) {
            this.f44740x0 = null;
        }
        ClingDeviceDialog clingDeviceDialog = this.f44709b1;
        if (clingDeviceDialog != null) {
            clingDeviceDialog.i();
            this.f44709b1 = null;
        }
        com.mgs.carparking.widgets.dialog.a aVar2 = this.f44711c1;
        if (aVar2 != null) {
            aVar2.f();
            this.f44711c1 = null;
        }
        try {
            q0.a.f77565b.s(this);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        insertHistory();
        if (this.f44731t != null) {
            if (!((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.getAdRewardVisibilty()) {
                this.f44731t.L();
            }
            d0 d0Var = this.F0;
            if (d0Var != null) {
                d0Var.b();
                this.F0 = null;
            }
        }
        ep.f fVar = this.T0;
        if (fVar == null || !fVar.d()) {
            return;
        }
        this.T0.pause();
    }

    @Override // com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Log.i("aaaaaaaaaaa", "onResume---------" + this.R0);
        this.f44730s0.requestAudioFocus(null, 3, 1);
        if (this.R0) {
            return;
        }
        if (this.f44731t != null && ((l0.L() != 1 || !((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.getShareStateVisibilty()) && !((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.getAdRewardVisibilty())) {
            this.f44731t.M();
            if (this.F0 == null) {
                lookAdArrivalTime();
            }
            RelativeLayout relativeLayout = this.f44738w0;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
                this.f44738w0.setVisibility(8);
            }
        }
        ep.f fVar = this.T0;
        if (fVar != null && fVar.d() && this.T0.isPaused()) {
            this.T0.resume();
        }
    }

    @Override // com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.A0 = System.currentTimeMillis();
    }

    @Override // com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (System.currentTimeMillis() - this.A0 >= 10000) {
            l0.i1((System.currentTimeMillis() - this.A0) + l0.X());
            w.a aVar = this.f44731t;
            if (aVar == null || aVar.D() == null || this.f44731t.D().getContentPosition() <= 0) {
                return;
            }
            ((VIDEOPLAYDETAILVIEWMODEL) this.f42501p).d1(this.M, this.N, (int) (this.f44731t.D().getContentPosition() / 1000), (int) ((System.currentTimeMillis() - this.A0) / 1000), (int) (this.f44731t.D().getDuration() / 1000));
        }
    }

    public void selectLoadAd() {
        if (l0.x() != 0 && (System.currentTimeMillis() - this.A0) + l0.X() < l0.k()) {
            clearAd();
            o2();
        } else {
            if (((ActivityVideoPlayDetailBinding) this.f42500o).f42796b.getAdRewardVisibilty()) {
                return;
            }
            loadAdPlay(false, false, this, ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b, this.M, this.N, this.f44723l0, this.V0, this.f44731t);
        }
    }

    public void selectLoadAdNew() {
        if (l0.x() == 0 || (System.currentTimeMillis() - this.A0) + l0.X() >= l0.k()) {
            loadAdPlay(false, true, this, ((ActivityVideoPlayDetailBinding) this.f42500o).f42796b, this.M, this.N, this.f44723l0, this.V0, this.f44731t);
        } else {
            clearAd();
            o2();
        }
    }

    public void showAdAwardCenterPlayerType(boolean z10, boolean z11, boolean z12, List<AdInfoDetailEntry> list, Activity activity, VideoPlayerView videoPlayerView, int i10, int i11, View view, Handler handler, w.a aVar, int i12) {
        AdInfoDetailEntry adInfoDetailEntry = AppApplication.adInfoEntry.getAd_position_13().get(i12);
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() <= 0) {
                adPlayCenterGDT(z10, z11, z12, adInfoDetailEntry, activity, videoPlayerView, i10, i11, view, handler, aVar, i12);
                return;
            } else if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(52)) {
                adPlayCenterGDT(z10, z11, z12, adInfoDetailEntry, activity, videoPlayerView, i10, i11, view, handler, aVar, i12);
                return;
            } else {
                int i13 = i12 + 1;
                showAdAwardCenterPlayerType(z10, z11, z12, list, activity, videoPlayerView, i10, i11, view, handler, aVar, i13 == list.size() ? 0 : i13);
                return;
            }
        }
        if (adInfoDetailEntry.getAd_source_id() == 4) {
            if (adInfoDetailEntry.getNum() <= 0) {
                adPlayCenterTd(z10, z11, z12, adInfoDetailEntry, activity, videoPlayerView, i10, i11, view, handler, aVar, i12);
            } else if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(52)) {
                adPlayCenterTd(z10, z11, z12, adInfoDetailEntry, activity, videoPlayerView, i10, i11, view, handler, aVar, i12);
            } else {
                int i14 = i12 + 1;
                showAdAwardCenterPlayerType(z10, z11, z12, list, activity, videoPlayerView, i10, i11, view, handler, aVar, i14 == list.size() ? 0 : i14);
            }
        }
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

    public void toggleClingOpenDialog(boolean z10) {
        if (z10) {
            if (this.H0 == null) {
                this.H0 = sd.h.a(this, this.I0.getRoot(), false);
            }
            this.H0.show();
        } else {
            Dialog dialog = this.H0;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public void toggleErrorCodeDialog(boolean z10) {
    }
}
