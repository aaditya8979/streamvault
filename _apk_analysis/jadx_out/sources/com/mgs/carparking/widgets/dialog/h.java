package com.mgs.carparking.widgets.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.db.AdNumShowDao;
import com.mgs.carparking.db.VideoDownloadDao;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.mgs.carparking.netbean.DownloadInfoEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.netbean.VideoBean;
import com.mgs.carparking.ui.mine.DownloadActivity;
import com.mgs.carparking.widgets.dialog.TvAndComicDownloadAdapter;
import ed.a0;
import ed.g0;
import ed.j;
import ed.l0;
import ed.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.http.BaseResponse;
import okhttp3.Response;
import xl.u;
import zp.o;
import zp.p;
import zp.r;

/* JADX INFO: compiled from: VideoDetailTvAndComicDownloadPop.java */
/* JADX INFO: loaded from: classes9.dex */
public class h extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f45470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VIDEOPLAYDETAILVIEWMODEL f45471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RelativeLayout f45472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RelativeLayout f45473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f45474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f45475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f45476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f45477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f45478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VideoBean> f45479j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TvAndComicDownloadAdapter f45480k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<VideoDownloadEntity> f45481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<DownloadInfoEntry> f45482m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Dialog f45483n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f45484o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f45485p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f45486q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Handler f45487r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f45488s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public k f45489t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f45490u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f45491v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f45492w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List<VideoBean> f45493x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List<VideoBean> f45494y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f45495z;

    /* JADX INFO: compiled from: VideoDetailTvAndComicDownloadPop.java */
    public class a implements j.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f45496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RecommandVideosEntity f45497b;

        public a(int i10, RecommandVideosEntity recommandVideosEntity) {
            this.f45496a = i10;
            this.f45497b = recommandVideosEntity;
        }

        @Override // ed.j.c
        public void a() {
            h.this.f45471b.O(((VideoBean) h.this.f45494y.get(this.f45496a)).is_p2p() == 1 ? ((VideoBean) h.this.f45494y.get(this.f45496a)).getVod_url() : ((VideoBean) h.this.f45494y.get(this.f45496a)).getOrginal_url(), (VideoBean) h.this.f45494y.get(this.f45496a), this.f45497b, h.this.f45495z);
        }
    }

    /* JADX INFO: compiled from: VideoDetailTvAndComicDownloadPop.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (h.this.f45474e.isEnabled()) {
                h.this.f45474e.setEnabled(false);
                h.this.f45474e.setText(r.b().getResources().getString(R.string.str_order));
            } else {
                h.this.f45474e.setEnabled(true);
                h.this.f45474e.setText(r.b().getResources().getString(R.string.str_reverse_order));
            }
            Collections.reverse(h.this.f45494y);
            h.this.f45480k.notifyDataSetChanged();
            h.this.f45475f.scrollToPosition(0);
        }
    }

    /* JADX INFO: compiled from: VideoDetailTvAndComicDownloadPop.java */
    public class c implements TvAndComicDownloadAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f45500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f45501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ RecommandVideosEntity f45502c;

        public c(Context context, Activity activity, RecommandVideosEntity recommandVideosEntity) {
            this.f45500a = context;
            this.f45501b = activity;
            this.f45502c = recommandVideosEntity;
        }

        @Override // com.mgs.carparking.widgets.dialog.TvAndComicDownloadAdapter.c
        public void a(int i10, TextView textView) {
            if (ed.e.q()) {
                return;
            }
            if (!tp.b.a(this.f45500a)) {
                p.b(r.b().getResources().getString(R.string.text_toast_nonet));
                return;
            }
            h.this.f45490u = i10;
            if (((VideoBean) h.this.f45494y.get(i10)).isDownload()) {
                if (((VideoBean) h.this.f45494y.get(i10)).isCompleteDownload()) {
                    p.b(r.b().getResources().getString(R.string.str_downloaded));
                    return;
                }
                String vod_url = ((VideoBean) h.this.f45494y.get(i10)).is_p2p() == 1 ? ((VideoBean) h.this.f45494y.get(i10)).getVod_url() : ((VideoBean) h.this.f45494y.get(i10)).getOrginal_url();
                for (int i11 = 0; i11 < h.this.f45481l.size(); i11++) {
                    if (vod_url.equals(h.this.f45481l.get(i11).getUrl())) {
                        h hVar = h.this;
                        hVar.f45491v = hVar.f45481l.get(i11).getStreamid();
                    }
                }
                h.this.q("http://127.0.0.1:" + AppApplication.port + "/control?msg=download_info", this.f45500a, i10);
                return;
            }
            if (l0.z() || AppApplication.adInfoEntry.getAd_position_5() == null || AppApplication.adInfoEntry.getAd_position_5().size() <= 0) {
                h.this.r(this.f45502c.getId(), ((VideoBean) h.this.f45494y.get(i10)).getCollection(), i10, textView, this.f45502c);
                return;
            }
            if (l0.D() > 0) {
                h.this.r(this.f45502c.getId(), ((VideoBean) h.this.f45494y.get(i10)).getCollection(), i10, textView, this.f45502c);
                return;
            }
            List<AdInfoDetailEntry> ad_position_5 = AppApplication.adInfoEntry.getAd_position_5();
            int num = AdNumShowDao.getInstance().getNum(24);
            int i12 = num >= ad_position_5.size() - 1 ? 0 : num + 1;
            if (l0.h() == 1) {
                h.this.u(ad_position_5, this.f45500a, this.f45501b, this.f45502c, i10, textView, i12, false);
            } else {
                h.this.u(ad_position_5, this.f45500a, this.f45501b, this.f45502c, i10, textView, i12, true);
            }
        }
    }

    /* JADX INFO: compiled from: VideoDetailTvAndComicDownloadPop.java */
    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VIDEOPLAYDETAILVIEWMODEL f45504b;

        public d(VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel) {
            this.f45504b = videoplaydetailviewmodel;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.dismiss();
            this.f45504b.startActivity(DownloadActivity.class);
        }
    }

    /* JADX INFO: compiled from: VideoDetailTvAndComicDownloadPop.java */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: VideoDetailTvAndComicDownloadPop.java */
    public class f implements x.b {
        public f() {
        }

        @Override // ed.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
        }

        @Override // ed.x.b
        public void b(Response response) {
            try {
                h.this.f45488s = response.body().string();
                h hVar = h.this;
                Handler handler = hVar.f45487r;
                if (handler != null) {
                    handler.removeCallbacks(hVar.f45489t);
                    h hVar2 = h.this;
                    hVar2.f45487r.postDelayed(hVar2.f45489t, 500L);
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: VideoDetailTvAndComicDownloadPop.java */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.f45483n.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.mgs.carparking.widgets.dialog.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: VideoDetailTvAndComicDownloadPop.java */
    public class ViewOnClickListenerC0547h implements View.OnClickListener {
        public ViewOnClickListenerC0547h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h hVar = h.this;
            hVar.f45480k.h(hVar.f45494y, h.this.f45490u);
            h.this.f45483n.dismiss();
            if (o.b(h.this.f45491v)) {
                return;
            }
            h hVar2 = h.this;
            hVar2.s(hVar2.f45491v);
        }
    }

    /* JADX INFO: compiled from: VideoDetailTvAndComicDownloadPop.java */
    public class i implements x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f45510a;

        public i(String str) {
            this.f45510a = str;
        }

        @Override // ed.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
        }

        @Override // ed.x.b
        public void b(Response response) {
            Log.i("wangyi", "成功");
            VideoDownloadDao.getInstance().deleteHistory(this.f45510a);
        }
    }

    /* JADX INFO: compiled from: VideoDetailTvAndComicDownloadPop.java */
    public class j implements u<BaseResponse<String>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f45512b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f45513c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RecommandVideosEntity f45514d;

        public j(int i10, TextView textView, RecommandVideosEntity recommandVideosEntity) {
            this.f45512b = i10;
            this.f45513c = textView;
            this.f45514d = recommandVideosEntity;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (baseResponse.isOk()) {
                h.this.p(this.f45512b, this.f45513c, this.f45514d);
            } else {
                p.b(baseResponse.getMessage());
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            p.b(r.b().getResources().getString(R.string.str_download_fail));
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    /* JADX INFO: compiled from: VideoDetailTvAndComicDownloadPop.java */
    public class k implements Runnable {

        /* JADX INFO: compiled from: VideoDetailTvAndComicDownloadPop.java */
        public class a extends j8.a<List<DownloadInfoEntry>> {
            public a() {
            }
        }

        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ed.k.d(h.this.f45488s, DownloadInfoEntry.class)) {
                h hVar = h.this;
                hVar.f45482m = (List) ed.k.c(hVar.f45488s, new a().getType());
                if (h.this.f45482m.size() > 0) {
                    h hVar2 = h.this;
                    hVar2.t(hVar2.f45470a, h.this.f45482m);
                }
            }
        }
    }

    public h(Activity activity, Context context, List<VideoBean> list, int i10, RecommandVideosEntity recommandVideosEntity, VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel) {
        super(context);
        this.f45481l = new ArrayList();
        this.f45482m = new ArrayList();
        this.f45487r = new Handler();
        this.f45491v = "";
        this.f45492w = "";
        this.f45493x = new ArrayList();
        this.f45494y = new ArrayList();
        this.f45495z = 0;
        this.f45470a = context;
        this.f45471b = videoplaydetailviewmodel;
        this.f45489t = new k();
        this.f45479j = list;
        ArrayList<VideoDownloadEntity> arrayListQueryHistory = VideoDownloadDao.getInstance().queryHistory();
        this.f45481l = arrayListQueryHistory;
        if (arrayListQueryHistory.size() > 0) {
            for (int i11 = 0; i11 < this.f45481l.size(); i11++) {
                if (this.f45481l.get(i11).getId() == recommandVideosEntity.getId() && this.f45481l.get(i11).getAudio_type() == recommandVideosEntity.getAudio_type()) {
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if ((list.get(i12).is_p2p() == 1 ? list.get(i12).getVod_url() : list.get(i12).getOrginal_url()).equals(this.f45481l.get(i11).getUrl())) {
                            list.get(i12).setDownload(true);
                            if (this.f45481l.get(i11).getComplete() == 1) {
                                list.get(i12).setCompleteDownload(true);
                            }
                        }
                    }
                }
            }
        } else {
            for (int i13 = 0; i13 < list.size(); i13++) {
                if (list.get(i13).isDownload()) {
                    list.get(i13).setDownload(false);
                }
            }
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_detail_tv_download, (ViewGroup) null);
        this.f45472c = (RelativeLayout) viewInflate.findViewById(R.id.rl_view);
        this.f45475f = (RecyclerView) viewInflate.findViewById(R.id.rv_list);
        this.f45474e = (TextView) viewInflate.findViewById(R.id.tv_sort);
        this.f45476g = (TextView) viewInflate.findViewById(R.id.tv_already_used);
        this.f45477h = (TextView) viewInflate.findViewById(R.id.tv_available);
        this.f45478i = (TextView) viewInflate.findViewById(R.id.tv_open_download);
        this.f45473d = (RelativeLayout) viewInflate.findViewById(R.id.rl_open_cache);
        this.f45475f.setLayoutManager(new GridLayoutManager(context, 6));
        this.f45476g.setText(r.b().getResources().getString(R.string.text_use_space) + g0.b(context) + "，");
        this.f45477h.setText(r.b().getResources().getString(R.string.text_unuse_space, g0.c(context)));
        for (int i14 = 0; i14 < list.size(); i14++) {
            if (i10 == i14) {
                list.get(i14).setCheck(true);
            } else {
                list.get(i14).setCheck(false);
            }
        }
        this.f45494y.addAll(list);
        TvAndComicDownloadAdapter tvAndComicDownloadAdapter = new TvAndComicDownloadAdapter(context, this.f45493x);
        this.f45480k = tvAndComicDownloadAdapter;
        this.f45475f.setAdapter(tvAndComicDownloadAdapter);
        viewInflate.findViewById(R.id.ll_sort).setOnClickListener(new b());
        this.f45480k.f(new c(context, activity, recommandVideosEntity));
        this.f45473d.setOnClickListener(new d(videoplaydetailviewmodel));
        viewInflate.findViewById(R.id.rl_top).setOnClickListener(new e());
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(true);
        setAnimationStyle(R.style.pop_shop_anim);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background));
        this.f45480k.g(this.f45494y, i10);
        this.f45475f.scrollToPosition(i10);
    }

    public void p(int i10, TextView textView, RecommandVideosEntity recommandVideosEntity) {
        if (l0.D() > 0) {
            l0.M0(l0.D() - 1);
        }
        this.f45480k.i(this.f45494y, i10);
        for (int i11 = 0; i11 < this.f45479j.size(); i11++) {
            if (this.f45494y.get(i10).getCollection() == this.f45479j.get(i11).getCollection()) {
                this.f45495z = i11;
            }
        }
        new ed.j(this.f45470a, this.f45472c).f(textView).g(this.f45478i).e(R.drawable.ic_video_download_icon).d(new a(i10, recommandVideosEntity));
    }

    public void q(String str, Context context, int i10) {
        Log.i("wangyi", "下载链接为：" + str);
        x.a(str, new f());
    }

    public void r(int i10, int i11, int i12, TextView textView, RecommandVideosEntity recommandVideosEntity) {
        HashMap map = new HashMap();
        map.put("vod_id", Integer.valueOf(i10));
        map.put("collection_id", Integer.valueOf(i11));
        tb.a.a().R(map).e(new hc.l()).e(new hc.c()).c(new j(i12, textView, recommandVideosEntity));
    }

    public void s(String str) {
        String str2 = "http://127.0.0.1:" + AppApplication.port + "/download_control?resource=" + str + "&type=5";
        Log.i("wangyi", "删除链接为：" + str2);
        x.a(str2, new i(str));
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + ed.e.n(this.f45470a));
        super.showAsDropDown(view);
    }

    public void t(Context context, List<DownloadInfoEntry> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!o.b(list.get(i10).getResource()) && this.f45491v.equals(list.get(i10).getResource())) {
                this.f45492w = list.get(i10).getDownload_percent() + "";
            }
        }
        if (this.f45483n == null) {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_download_info_movies, (ViewGroup) null);
            this.f45484o = (TextView) viewInflate.findViewById(R.id.tv_message);
            this.f45485p = (TextView) viewInflate.findViewById(R.id.tv_cancel);
            this.f45486q = (TextView) viewInflate.findViewById(R.id.tv_sure);
            Dialog dialogA = sd.h.a(context, viewInflate, true);
            this.f45483n = dialogA;
            dialogA.setCanceledOnTouchOutside(false);
        }
        if (o.b(this.f45492w)) {
            this.f45484o.setText(r.b().getResources().getString(R.string.str_downloading_tip));
        } else {
            this.f45484o.setText(r.b().getResources().getString(R.string.str_downloading_tip));
        }
        this.f45485p.setOnClickListener(new g());
        this.f45486q.setOnClickListener(new ViewOnClickListenerC0547h());
        this.f45483n.show();
    }

    public void u(List<AdInfoDetailEntry> list, Context context, Activity activity, RecommandVideosEntity recommandVideosEntity, int i10, TextView textView, int i11, boolean z10) {
        AdInfoDetailEntry adInfoDetailEntry = list.get(i11);
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() <= 0) {
                v(context, activity, adInfoDetailEntry, i11, recommandVideosEntity, i10, textView, z10);
                return;
            }
            if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(10)) {
                v(context, activity, adInfoDetailEntry, i11, recommandVideosEntity, i10, textView, z10);
                return;
            }
            int i12 = i11 + 1;
            if (i12 == list.size()) {
                i12 = 0;
            }
            u(list, context, activity, recommandVideosEntity, i10, textView, i12, z10);
        }
    }

    public void v(Context context, Activity activity, AdInfoDetailEntry adInfoDetailEntry, int i10, RecommandVideosEntity recommandVideosEntity, int i11, TextView textView, boolean z10) {
        if (z10 && adInfoDetailEntry.getNew_user_has_ad() == 0) {
            r(recommandVideosEntity.getId(), this.f45494y.get(i11).getCollection(), i11, textView, recommandVideosEntity);
            return;
        }
        dismiss();
        AdNumShowDao.getInstance().updateDownloadIndex(i10);
        fd.h hVar = new fd.h(activity, adInfoDetailEntry);
        a0.a(hVar, this.f45472c, adInfoDetailEntry, new sd.c(context, hVar), context, recommandVideosEntity.getId(), this.f45494y.get(i11).getCollection());
    }
}
