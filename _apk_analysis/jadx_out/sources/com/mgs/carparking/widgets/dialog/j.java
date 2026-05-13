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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.inmobi.unification.sdk.InitializationStatus;
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
import com.mgs.carparking.widgets.dialog.VarietyDownnloadAdapter;
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

/* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
/* JADX INFO: loaded from: classes7.dex */
public class j extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f45527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VIDEOPLAYDETAILVIEWMODEL f45528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f45529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f45530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public VarietyDownnloadAdapter f45531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RelativeLayout f45532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RelativeLayout f45533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f45534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f45535i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f45536j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<VideoDownloadEntity> f45537k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<DownloadInfoEntry> f45538l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<VideoBean> f45539m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Dialog f45540n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f45541o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f45542p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f45543q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Handler f45544r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f45545s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public k f45546t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f45547u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f45548v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f45549w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f45550x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List<VideoBean> f45551y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f45552z;

    /* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
    public class a implements j.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f45553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RecommandVideosEntity f45554b;

        public a(int i10, RecommandVideosEntity recommandVideosEntity) {
            this.f45553a = i10;
            this.f45554b = recommandVideosEntity;
        }

        @Override // ed.j.c
        public void a() {
            j.this.f45528b.O(((VideoBean) j.this.f45551y.get(this.f45553a)).is_p2p() == 1 ? ((VideoBean) j.this.f45551y.get(this.f45553a)).getVod_url() : ((VideoBean) j.this.f45551y.get(this.f45553a)).getOrginal_url(), (VideoBean) j.this.f45551y.get(this.f45553a), this.f45554b, j.this.f45552z);
        }
    }

    /* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (j.this.f45530d.isEnabled()) {
                j.this.f45530d.setEnabled(false);
                j.this.f45530d.setText(r.b().getResources().getString(R.string.str_order));
            } else {
                j.this.f45530d.setEnabled(true);
                j.this.f45530d.setText(r.b().getResources().getString(R.string.str_reverse_order));
            }
            Collections.reverse(j.this.f45551y);
            j.this.f45531e.notifyDataSetChanged();
            j.this.f45529c.scrollToPosition(0);
        }
    }

    /* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
    public class c implements VarietyDownnloadAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f45557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f45558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ RecommandVideosEntity f45559c;

        public c(Context context, Activity activity, RecommandVideosEntity recommandVideosEntity) {
            this.f45557a = context;
            this.f45558b = activity;
            this.f45559c = recommandVideosEntity;
        }

        @Override // com.mgs.carparking.widgets.dialog.VarietyDownnloadAdapter.c
        public void a(int i10, TextView textView) {
            if (ed.e.q()) {
                return;
            }
            if (!tp.b.a(this.f45557a)) {
                p.b(r.b().getResources().getString(R.string.text_toast_nonet));
                return;
            }
            j.this.f45547u = i10;
            if (((VideoBean) j.this.f45551y.get(i10)).isDownload()) {
                if (((VideoBean) j.this.f45551y.get(i10)).isCompleteDownload()) {
                    p.b(r.b().getResources().getString(R.string.str_downloaded));
                    return;
                }
                String vod_url = ((VideoBean) j.this.f45551y.get(i10)).is_p2p() == 1 ? ((VideoBean) j.this.f45551y.get(i10)).getVod_url() : ((VideoBean) j.this.f45551y.get(i10)).getOrginal_url();
                for (int i11 = 0; i11 < j.this.f45537k.size(); i11++) {
                    if (vod_url.equals(j.this.f45537k.get(i11).getUrl())) {
                        j jVar = j.this;
                        jVar.f45549w = jVar.f45537k.get(i11).getStreamid();
                    }
                }
                j.this.q("http://127.0.0.1:" + AppApplication.port + "/control?msg=download_info", this.f45557a, i10);
                return;
            }
            if (l0.z() || AppApplication.adInfoEntry.getAd_position_5() == null || AppApplication.adInfoEntry.getAd_position_5().size() <= 0) {
                j.this.r(this.f45559c.getId(), ((VideoBean) j.this.f45551y.get(i10)).getCollection(), i10, textView, this.f45559c);
                return;
            }
            if (l0.D() > 0) {
                j.this.r(this.f45559c.getId(), ((VideoBean) j.this.f45551y.get(i10)).getCollection(), i10, textView, this.f45559c);
                return;
            }
            List<AdInfoDetailEntry> ad_position_5 = AppApplication.adInfoEntry.getAd_position_5();
            int num = AdNumShowDao.getInstance().getNum(24);
            int i12 = num >= ad_position_5.size() - 1 ? 0 : num + 1;
            if (l0.h() == 1) {
                j.this.u(ad_position_5, this.f45557a, this.f45558b, this.f45559c, i10, textView, i12, false);
            } else {
                j.this.u(ad_position_5, this.f45557a, this.f45558b, this.f45559c, i10, textView, i12, true);
            }
        }
    }

    /* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VIDEOPLAYDETAILVIEWMODEL f45561b;

        public d(VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel) {
            this.f45561b = videoplaydetailviewmodel;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.dismiss();
            this.f45561b.startActivity(DownloadActivity.class);
        }
    }

    /* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
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
                j.this.f45545s = response.body().string();
                j jVar = j.this;
                Handler handler = jVar.f45544r;
                if (handler != null) {
                    handler.removeCallbacks(jVar.f45546t);
                    j jVar2 = j.this;
                    jVar2.f45544r.postDelayed(jVar2.f45546t, 500L);
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.f45540n.dismiss();
        }
    }

    /* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j jVar = j.this;
            jVar.f45531e.g(jVar.f45551y, j.this.f45547u);
            j.this.f45540n.dismiss();
            if (o.b(j.this.f45549w)) {
                return;
            }
            j jVar2 = j.this;
            jVar2.s(jVar2.f45549w);
        }
    }

    /* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
    public class i implements x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f45567a;

        public i(String str) {
            this.f45567a = str;
        }

        @Override // ed.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
        }

        @Override // ed.x.b
        public void b(Response response) {
            Log.i("wangyi", InitializationStatus.SUCCESS);
            VideoDownloadDao.getInstance().deleteHistory(this.f45567a);
        }
    }

    /* JADX INFO: renamed from: com.mgs.carparking.widgets.dialog.j$j, reason: collision with other inner class name */
    /* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
    public class C0548j implements u<BaseResponse<String>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f45569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f45570c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RecommandVideosEntity f45571d;

        public C0548j(int i10, TextView textView, RecommandVideosEntity recommandVideosEntity) {
            this.f45569b = i10;
            this.f45570c = textView;
            this.f45571d = recommandVideosEntity;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (baseResponse.isOk()) {
                j.this.p(this.f45569b, this.f45570c, this.f45571d);
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

    /* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
    public class k implements Runnable {

        /* JADX INFO: compiled from: VideoDetailVarietyDownloadPop.java */
        public class a extends j8.a<List<DownloadInfoEntry>> {
            public a() {
            }
        }

        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ed.k.d(j.this.f45545s, DownloadInfoEntry.class)) {
                j jVar = j.this;
                jVar.f45538l = (List) ed.k.c(jVar.f45545s, new a().getType());
                if (j.this.f45538l.size() > 0) {
                    j jVar2 = j.this;
                    jVar2.t(jVar2.f45527a, j.this.f45538l);
                }
            }
        }
    }

    public j(Activity activity, Context context, List<VideoBean> list, String str, int i10, RecommandVideosEntity recommandVideosEntity, VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel) {
        super(context);
        this.f45537k = new ArrayList();
        this.f45538l = new ArrayList();
        this.f45544r = new Handler();
        this.f45549w = "";
        this.f45550x = "";
        this.f45551y = new ArrayList();
        this.f45552z = 0;
        this.f45527a = context;
        this.f45528b = videoplaydetailviewmodel;
        this.f45548v = recommandVideosEntity.getId();
        this.f45546t = new k();
        this.f45539m = list;
        ArrayList<VideoDownloadEntity> arrayListQueryHistory = VideoDownloadDao.getInstance().queryHistory();
        this.f45537k = arrayListQueryHistory;
        if (arrayListQueryHistory.size() > 0) {
            for (int i11 = 0; i11 < this.f45537k.size(); i11++) {
                if (this.f45537k.get(i11).getId() == recommandVideosEntity.getId() && this.f45537k.get(i11).getAudio_type() == recommandVideosEntity.getAudio_type()) {
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if ((list.get(i12).is_p2p() == 1 ? list.get(i12).getVod_url() : list.get(i12).getOrginal_url()).equals(this.f45537k.get(i11).getUrl())) {
                            list.get(i12).setDownload(true);
                            if (this.f45537k.get(i11).getComplete() == 1) {
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
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_detail_variety_download, (ViewGroup) null);
        this.f45532f = (RelativeLayout) viewInflate.findViewById(R.id.rl_view);
        this.f45529c = (RecyclerView) viewInflate.findViewById(R.id.rv_list);
        this.f45530d = (TextView) viewInflate.findViewById(R.id.tv_sort);
        this.f45534h = (TextView) viewInflate.findViewById(R.id.tv_already_used);
        this.f45535i = (TextView) viewInflate.findViewById(R.id.tv_available);
        this.f45536j = (TextView) viewInflate.findViewById(R.id.tv_open_download);
        this.f45533g = (RelativeLayout) viewInflate.findViewById(R.id.rl_open_cache);
        this.f45529c.setLayoutManager(new LinearLayoutManager(context));
        this.f45534h.setText(r.b().getResources().getString(R.string.text_use_space) + g0.b(context) + "，");
        this.f45535i.setText(r.b().getResources().getString(R.string.text_unuse_space, g0.c(context)));
        for (int i14 = 0; i14 < list.size(); i14++) {
            if (i10 == i14) {
                list.get(i14).setCheck(true);
            } else {
                list.get(i14).setCheck(false);
            }
        }
        this.f45551y.addAll(list);
        VarietyDownnloadAdapter varietyDownnloadAdapter = new VarietyDownnloadAdapter(context, this.f45551y, str);
        this.f45531e = varietyDownnloadAdapter;
        this.f45529c.setAdapter(varietyDownnloadAdapter);
        this.f45529c.scrollToPosition(i10);
        viewInflate.findViewById(R.id.ll_sort).setOnClickListener(new b());
        this.f45531e.f(new c(context, activity, recommandVideosEntity));
        this.f45533g.setOnClickListener(new d(videoplaydetailviewmodel));
        viewInflate.findViewById(R.id.rl_top).setOnClickListener(new e());
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(true);
        setAnimationStyle(R.style.pop_shop_anim);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background));
    }

    public void p(int i10, TextView textView, RecommandVideosEntity recommandVideosEntity) {
        if (l0.D() > 0) {
            l0.M0(l0.D() - 1);
        }
        this.f45531e.h(this.f45551y, i10);
        for (int i11 = 0; i11 < this.f45539m.size(); i11++) {
            if (this.f45551y.get(i10).getCollection() == this.f45539m.get(i11).getCollection()) {
                this.f45552z = i11;
            }
        }
        new ed.j(this.f45527a, this.f45532f).f(textView).g(this.f45536j).e(R.drawable.ic_video_download_icon).d(new a(i10, recommandVideosEntity));
    }

    public void q(String str, Context context, int i10) {
        Log.i("wangyi", "下载链接为：" + str);
        x.a(str, new f());
    }

    public void r(int i10, int i11, int i12, TextView textView, RecommandVideosEntity recommandVideosEntity) {
        HashMap map = new HashMap();
        map.put("vod_id", Integer.valueOf(i10));
        map.put("collection_id", Integer.valueOf(i11));
        tb.a.a().R(map).e(new hc.l()).e(new hc.c()).c(new C0548j(i12, textView, recommandVideosEntity));
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
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + ed.e.n(this.f45527a));
        super.showAsDropDown(view);
    }

    public void t(Context context, List<DownloadInfoEntry> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (this.f45549w.equals(list.get(i10).getResource())) {
                this.f45550x = list.get(i10).getDownload_percent() + "";
            }
        }
        if (this.f45540n == null) {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_download_info_movies, (ViewGroup) null);
            this.f45541o = (TextView) viewInflate.findViewById(R.id.tv_message);
            this.f45542p = (TextView) viewInflate.findViewById(R.id.tv_cancel);
            this.f45543q = (TextView) viewInflate.findViewById(R.id.tv_sure);
            Dialog dialogA = sd.h.a(context, viewInflate, true);
            this.f45540n = dialogA;
            dialogA.setCanceledOnTouchOutside(false);
        }
        if (o.b(this.f45550x)) {
            this.f45541o.setText(r.b().getResources().getString(R.string.str_downloading_tip));
        } else {
            this.f45541o.setText(r.b().getResources().getString(R.string.str_downloading_tip));
        }
        this.f45542p.setOnClickListener(new g());
        this.f45543q.setOnClickListener(new h());
        this.f45540n.show();
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
            r(recommandVideosEntity.getId(), this.f45551y.get(i11).getCollection(), i11, textView, recommandVideosEntity);
            return;
        }
        dismiss();
        AdNumShowDao.getInstance().updateDownloadIndex(i10);
        fd.h hVar = new fd.h(activity, adInfoDetailEntry);
        a0.a(hVar, this.f45532f, adInfoDetailEntry, new sd.c(context, hVar), context, recommandVideosEntity.getId(), this.f45551y.get(i11).getCollection());
    }
}
