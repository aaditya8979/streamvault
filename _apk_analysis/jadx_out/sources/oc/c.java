package oc;

import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.netbean.VideoMoreEntry;
import ec.e;
import ed.c0;
import hc.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.http.BaseResponse;
import xl.u;

/* JADX INFO: compiled from: VideoMoreImp.java */
/* JADX INFO: loaded from: classes11.dex */
public class c implements oc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f76330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f76331b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f76332c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<RecommandVideosEntity> f76333d = new ArrayList();

    /* JADX INFO: compiled from: VideoMoreImp.java */
    public class a implements u<BaseResponse<VideoMoreEntry>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f76334b;

        public a(boolean z10) {
            this.f76334b = z10;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<VideoMoreEntry> baseResponse) {
            if (!baseResponse.isOk() || e.a(baseResponse.getResult().getVod_list())) {
                if (e.a(c.this.f76333d)) {
                    return;
                }
                c.this.f76330a.resetNoMoreData();
                return;
            }
            if (e.a(baseResponse.getResult().getVod_list())) {
                c.this.f76330a.resetNoMoreData();
                return;
            }
            if (c.this.f76330a != null) {
                c.this.f76330a.isLoading(false);
            }
            if (this.f76334b) {
                c.this.f76333d.clear();
                c.this.f76331b = 0;
            }
            for (RecommandVideosEntity recommandVideosEntity : baseResponse.getResult().getVod_list()) {
                c.e(c.this);
                c.this.f76333d.add(recommandVideosEntity);
                if (c.this.f76331b == 2 && AppApplication.adInfoEntry.getAd_position_17() != null && AppApplication.adInfoEntry.getAd_position_17().size() > 0 && AppApplication.adInfoEntry.getAd_position_17() != null && AppApplication.adInfoEntry.getAd_position_17().size() > 0) {
                    c.this.f76333d.add(null);
                }
            }
            c.f(c.this);
            if (c.this.f76330a != null) {
                c.this.f76330a.showData(c.this.f76333d);
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            if (c.this.f76330a != null) {
                c.this.f76330a.isLoading(false);
                c.this.f76330a.loadNoNet(true);
            }
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    public c(b bVar) {
        this.f76330a = bVar;
    }

    public static /* synthetic */ int e(c cVar) {
        int i10 = cVar.f76331b;
        cVar.f76331b = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int f(c cVar) {
        int i10 = cVar.f76332c;
        cVar.f76332c = i10 + 1;
        return i10;
    }

    public void g(boolean z10, int i10) {
        if (z10) {
            this.f76332c = 1;
        }
        HashMap map = new HashMap();
        map.put("pn", Integer.valueOf(this.f76332c));
        map.put("topic_id", Integer.valueOf(i10));
        tb.a.a().a(map).k(new c0()).e(new l()).e(new hc.c()).c(new a(z10));
    }

    @Override // oc.a
    public void onClick(RecommandVideosEntity recommandVideosEntity) {
        b bVar = this.f76330a;
        if (bVar != null) {
            bVar.onClick(recommandVideosEntity);
        }
    }
}
