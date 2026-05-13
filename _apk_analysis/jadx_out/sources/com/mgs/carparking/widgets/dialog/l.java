package com.mgs.carparking.widgets.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
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
import com.mgs.carparking.widgets.dialog.VideoDownloadAdapter;
import ed.a0;
import ed.g0;
import ed.j;
import ed.l0;
import ed.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.http.BaseResponse;
import okhttp3.Response;
import xl.u;
import zp.o;
import zp.p;
import zp.r;

/* JADX INFO: compiled from: VideoDetailVideoDownloadPop.java */
/* JADX INFO: loaded from: classes9.dex */
public class l extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f45583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VIDEOPLAYDETAILVIEWMODEL f45584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<VideoBean> f45585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f45586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public VideoDownloadAdapter f45587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RelativeLayout f45588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RelativeLayout f45589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f45590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f45591i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f45592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<VideoDownloadEntity> f45593k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Dialog f45594l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f45595m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f45596n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f45597o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<DownloadInfoEntry> f45598p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f45599q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f45600r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f45601s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Handler f45602t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f45603u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j f45604v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f45605w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f45606x;

    /* JADX INFO: compiled from: VideoDetailVideoDownloadPop.java */
    public class a implements VideoDownloadAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f45607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f45608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f45609c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RecommandVideosEntity f45610d;

        public a(Context context, List list, Activity activity, RecommandVideosEntity recommandVideosEntity) {
            this.f45607a = context;
            this.f45608b = list;
            this.f45609c = activity;
            this.f45610d = recommandVideosEntity;
        }

        @Override // com.mgs.carparking.widgets.dialog.VideoDownloadAdapter.c
        public void a(int i10, TextView textView) {
            if (ed.e.q()) {
                return;
            }
            if (!tp.b.a(this.f45607a)) {
                p.b(r.b().getResources().getString(R.string.text_toast_nonet));
                return;
            }
            l.this.f45605w = i10;
            if (((VideoBean) this.f45608b.get(i10)).isDownload()) {
                if (l.this.f45606x) {
                    p.b(r.b().getResources().getString(R.string.str_download_success));
                    return;
                }
                l.this.o("http://127.0.0.1:" + AppApplication.port + "/control?msg=download_info", this.f45607a, i10);
                return;
            }
            if (l0.z() || AppApplication.adInfoEntry.getAd_position_5() == null || AppApplication.adInfoEntry.getAd_position_5().size() <= 0) {
                l.this.p(this.f45610d.getId(), ((VideoBean) this.f45608b.get(i10)).getCollection(), i10, textView, this.f45610d);
                return;
            }
            if (l0.D() > 0) {
                l.this.p(this.f45610d.getId(), ((VideoBean) this.f45608b.get(i10)).getCollection(), i10, textView, this.f45610d);
                return;
            }
            List<AdInfoDetailEntry> ad_position_5 = AppApplication.adInfoEntry.getAd_position_5();
            int num = AdNumShowDao.getInstance().getNum(24);
            int i11 = num >= ad_position_5.size() - 1 ? 0 : num + 1;
            if (l0.h() == 1) {
                l.this.s(ad_position_5, this.f45607a, this.f45609c, this.f45610d, i10, textView, i11, false);
            } else {
                l.this.s(ad_position_5, this.f45607a, this.f45609c, this.f45610d, i10, textView, i11, true);
            }
        }
    }

    /* JADX INFO: compiled from: VideoDetailVideoDownloadPop.java */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VIDEOPLAYDETAILVIEWMODEL f45612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f45613c;

        public b(VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel, Activity activity) {
            this.f45612b = videoplaydetailviewmodel;
            this.f45613c = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l.this.dismiss();
            this.f45612b.startActivity(DownloadActivity.class);
            this.f45613c.finish();
        }
    }

    /* JADX INFO: compiled from: VideoDetailVideoDownloadPop.java */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: VideoDetailVideoDownloadPop.java */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l.this.f45594l.dismiss();
        }
    }

    /* JADX INFO: compiled from: VideoDetailVideoDownloadPop.java */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l lVar = l.this;
            lVar.f45587e.g(lVar.f45585c, l.this.f45605w);
            l.this.f45594l.dismiss();
            if (o.b(l.this.f45600r)) {
                return;
            }
            l lVar2 = l.this;
            lVar2.q(lVar2.f45600r);
        }
    }

    /* JADX INFO: compiled from: VideoDetailVideoDownloadPop.java */
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
                l.this.f45603u = response.body().string();
                l lVar = l.this;
                Handler handler = lVar.f45602t;
                if (handler != null) {
                    handler.removeCallbacks(lVar.f45604v);
                    l lVar2 = l.this;
                    lVar2.f45602t.postDelayed(lVar2.f45604v, 500L);
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: VideoDetailVideoDownloadPop.java */
    public class g implements x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f45619a;

        public g(String str) {
            this.f45619a = str;
        }

        @Override // ed.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
        }

        @Override // ed.x.b
        public void b(Response response) {
            VideoDownloadDao.getInstance().deleteHistory(this.f45619a);
        }
    }

    /* JADX INFO: compiled from: VideoDetailVideoDownloadPop.java */
    public class h implements u<BaseResponse<String>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f45621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f45622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RecommandVideosEntity f45623d;

        public h(int i10, TextView textView, RecommandVideosEntity recommandVideosEntity) {
            this.f45621b = i10;
            this.f45622c = textView;
            this.f45623d = recommandVideosEntity;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (baseResponse.isOk()) {
                l.this.n(this.f45621b, this.f45622c, this.f45623d);
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

    /* JADX INFO: compiled from: VideoDetailVideoDownloadPop.java */
    public class i implements j.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f45625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RecommandVideosEntity f45626b;

        public i(int i10, RecommandVideosEntity recommandVideosEntity) {
            this.f45625a = i10;
            this.f45626b = recommandVideosEntity;
        }

        @Override // ed.j.c
        public void a() {
            l.this.f45584b.O(((VideoBean) l.this.f45585c.get(this.f45625a)).is_p2p() == 1 ? ((VideoBean) l.this.f45585c.get(this.f45625a)).getVod_url() : ((VideoBean) l.this.f45585c.get(this.f45625a)).getOrginal_url(), (VideoBean) l.this.f45585c.get(this.f45625a), this.f45626b, this.f45625a);
        }
    }

    /* JADX INFO: compiled from: VideoDetailVideoDownloadPop.java */
    public class j implements Runnable {

        /* JADX INFO: compiled from: VideoDetailVideoDownloadPop.java */
        public class a extends j8.a<List<DownloadInfoEntry>> {
            public a() {
            }
        }

        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ed.k.d(l.this.f45603u, DownloadInfoEntry.class)) {
                l lVar = l.this;
                lVar.f45598p = (List) ed.k.c(lVar.f45603u, new a().getType());
                if (l.this.f45598p.size() > 0) {
                    l lVar2 = l.this;
                    lVar2.r(lVar2.f45583a, l.this.f45598p);
                }
            }
        }
    }

    public l(Activity activity, Context context, List<VideoBean> list, RecommandVideosEntity recommandVideosEntity, VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel) {
        super(context);
        this.f45593k = new ArrayList();
        this.f45598p = new ArrayList();
        this.f45600r = "";
        this.f45601s = "";
        this.f45602t = new Handler();
        this.f45606x = false;
        this.f45583a = context;
        this.f45584b = videoplaydetailviewmodel;
        this.f45585c = list;
        this.f45599q = recommandVideosEntity.getId();
        this.f45604v = new j();
        ArrayList<VideoDownloadEntity> arrayListQueryHistory = VideoDownloadDao.getInstance().queryHistory();
        this.f45593k = arrayListQueryHistory;
        if (arrayListQueryHistory.size() > 0) {
            for (int i10 = 0; i10 < this.f45593k.size(); i10++) {
                if (this.f45593k.get(i10).getId() == recommandVideosEntity.getId() && this.f45593k.get(i10).getAudio_type() == recommandVideosEntity.getAudio_type()) {
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if ((list.get(i11).is_p2p() == 1 ? list.get(i11).getVod_url() : list.get(i11).getOrginal_url()).equals(this.f45593k.get(i10).getUrl())) {
                            list.get(i11).setDownload(true);
                            if (this.f45593k.get(i10).getComplete() == 1) {
                                this.f45606x = true;
                                list.get(i11).setCompleteDownload(true);
                            }
                        } else {
                            list.get(i11).setDownload(false);
                        }
                    }
                }
            }
        } else {
            for (int i12 = 0; i12 < list.size(); i12++) {
                if (list.get(i12).isDownload()) {
                    list.get(i12).setDownload(false);
                }
            }
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_detail_video_download, (ViewGroup) null);
        this.f45588f = (RelativeLayout) viewInflate.findViewById(R.id.rl_view);
        this.f45586d = (RecyclerView) viewInflate.findViewById(R.id.rv_list);
        this.f45590h = (TextView) viewInflate.findViewById(R.id.tv_already_used);
        this.f45591i = (TextView) viewInflate.findViewById(R.id.tv_available);
        this.f45592j = (TextView) viewInflate.findViewById(R.id.tv_open_download);
        this.f45589g = (RelativeLayout) viewInflate.findViewById(R.id.rl_open_cache);
        this.f45586d.setLayoutManager(new LinearLayoutManager(context));
        this.f45590h.setText(r.b().getResources().getString(R.string.text_use_space) + g0.b(context) + "，");
        this.f45591i.setText(r.b().getResources().getString(R.string.text_unuse_space, g0.c(context)));
        VideoDownloadAdapter videoDownloadAdapter = new VideoDownloadAdapter(context, list, recommandVideosEntity.getVod_name());
        this.f45587e = videoDownloadAdapter;
        this.f45586d.setAdapter(videoDownloadAdapter);
        this.f45587e.f(new a(context, list, activity, recommandVideosEntity));
        this.f45589g.setOnClickListener(new b(videoplaydetailviewmodel, activity));
        viewInflate.findViewById(R.id.rl_top).setOnClickListener(new c());
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(true);
        setAnimationStyle(R.style.pop_shop_anim);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background));
    }

    public void n(int i10, TextView textView, RecommandVideosEntity recommandVideosEntity) {
        if (l0.D() > 0) {
            l0.M0(l0.D() - 1);
        }
        if (!tp.b.b(this.f45583a) && tp.b.a(this.f45583a)) {
            p.b(r.b().getResources().getString(R.string.str_download_with_traffi));
        }
        this.f45587e.h(this.f45585c, i10);
        new ed.j(this.f45583a, this.f45588f).f(textView).g(this.f45592j).e(R.drawable.ic_video_download_icon).d(new i(i10, recommandVideosEntity));
    }

    public void o(String str, Context context, int i10) {
        Log.i("wangyi", "下载链接为：" + str);
        x.a(str, new f());
    }

    public void p(int i10, int i11, int i12, TextView textView, RecommandVideosEntity recommandVideosEntity) {
        HashMap map = new HashMap();
        map.put("vod_id", Integer.valueOf(i10));
        map.put("collection_id", Integer.valueOf(i11));
        tb.a.a().R(map).e(new hc.l()).e(new hc.c()).c(new h(i12, textView, recommandVideosEntity));
    }

    public void q(String str) {
        x.a("http://127.0.0.1:" + AppApplication.port + "/download_control?resource=" + str + "&type=5", new g(str));
    }

    public void r(Context context, List<DownloadInfoEntry> list) {
        if (o.b(this.f45600r)) {
            ArrayList<VideoDownloadEntity> arrayListQueryHistory = VideoDownloadDao.getInstance().queryHistory();
            this.f45593k = arrayListQueryHistory;
            if (arrayListQueryHistory.size() > 0) {
                for (int i10 = 0; i10 < this.f45593k.size(); i10++) {
                    if (this.f45599q == this.f45593k.get(i10).getId()) {
                        this.f45600r = this.f45593k.get(i10).getStreamid();
                    }
                }
            }
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (this.f45600r.equals(list.get(i11).getResource())) {
                this.f45601s = list.get(i11).getDownload_percent() + "";
            }
        }
        if (this.f45594l == null) {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_download_info_movies, (ViewGroup) null);
            this.f45595m = (TextView) viewInflate.findViewById(R.id.tv_message);
            this.f45596n = (TextView) viewInflate.findViewById(R.id.tv_cancel);
            this.f45597o = (TextView) viewInflate.findViewById(R.id.tv_sure);
            Dialog dialogA = sd.h.a(context, viewInflate, true);
            this.f45594l = dialogA;
            dialogA.setCanceledOnTouchOutside(false);
        }
        if (o.b(this.f45601s)) {
            this.f45595m.setText(r.b().getResources().getString(R.string.str_downloading_tip));
        } else {
            this.f45595m.setText(r.b().getResources().getString(R.string.str_downloading_tip));
        }
        this.f45596n.setOnClickListener(new d());
        this.f45597o.setOnClickListener(new e());
        this.f45594l.show();
    }

    public void s(List<AdInfoDetailEntry> list, Context context, Activity activity, RecommandVideosEntity recommandVideosEntity, int i10, TextView textView, int i11, boolean z10) {
        AdInfoDetailEntry adInfoDetailEntry = list.get(i11);
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() <= 0) {
                t(context, activity, adInfoDetailEntry, i11, recommandVideosEntity, i10, textView, z10);
                return;
            }
            if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(10)) {
                t(context, activity, adInfoDetailEntry, i11, recommandVideosEntity, i10, textView, z10);
                return;
            }
            int i12 = i11 + 1;
            if (i12 == list.size()) {
                i12 = 0;
            }
            s(list, context, activity, recommandVideosEntity, i10, textView, i12, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        int iG = ed.e.g((Activity) getContentView().getContext());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        setHeight((iG - iArr[1]) - view.getHeight());
        super.showAsDropDown(view);
    }

    public void t(Context context, Activity activity, AdInfoDetailEntry adInfoDetailEntry, int i10, RecommandVideosEntity recommandVideosEntity, int i11, TextView textView, boolean z10) {
        if (z10 && adInfoDetailEntry.getNew_user_has_ad() == 0) {
            p(recommandVideosEntity.getId(), this.f45585c.get(i11).getCollection(), i11, textView, recommandVideosEntity);
            return;
        }
        dismiss();
        AdNumShowDao.getInstance().updateDownloadIndex(i10);
        fd.h hVar = new fd.h(activity, adInfoDetailEntry);
        a0.a(hVar, this.f45588f, adInfoDetailEntry, new sd.c(context, hVar), context, recommandVideosEntity.getId(), this.f45585c.get(i11).getCollection());
    }
}
