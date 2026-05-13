package wc;

import android.text.TextUtils;
import com.dramarush.shortin.R;
import com.mgs.carparking.db.VideoCollectionDao;
import com.mgs.carparking.netbean.VideoCollectionBeanEntry;
import ed.c0;
import hc.l;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import me.goldze.mvvmhabit.http.BaseResponse;
import xl.u;
import zp.o;
import zp.p;
import zp.r;

/* JADX INFO: compiled from: CollectionImp.java */
/* JADX INFO: loaded from: classes9.dex */
public class c implements wc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wc.b f86357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86358b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f86359c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f86360d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<VideoCollectionBeanEntry> f86361e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<String> f86362f = new ArrayList();

    /* JADX INFO: compiled from: CollectionImp.java */
    public class a implements u<BaseResponse<List<VideoCollectionBeanEntry>>> {
        public a() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<VideoCollectionBeanEntry>> baseResponse) {
            if (!baseResponse.isOk() || sb.b.a(baseResponse.getResult())) {
                return;
            }
            c.this.f86361e.addAll(baseResponse.getResult());
            if (c.this.f86357a != null) {
                c.this.f86357a.showData(c.this.f86361e);
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            p.b(r.b().getResources().getString(R.string.str_login_fail));
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    /* JADX INFO: compiled from: CollectionImp.java */
    public class b implements u<BaseResponse<String>> {
        public b() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (baseResponse.isOk()) {
                for (String str : c.this.f86362f) {
                    for (int i10 = 0; i10 < c.this.f86361e.size(); i10++) {
                        if (TextUtils.equals(str, String.valueOf(((VideoCollectionBeanEntry) c.this.f86361e.get(i10)).getId()))) {
                            VideoCollectionDao.getInstance().delete(((VideoCollectionBeanEntry) c.this.f86361e.get(i10)).getId());
                            c.this.f86361e.remove(c.this.f86361e.get(i10));
                        }
                    }
                }
                c.this.f86362f.clear();
                if (c.this.f86357a != null) {
                    c.this.f86357a.delete();
                }
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            p.b(r.b().getResources().getString(R.string.str_login_fail));
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    public c(wc.b bVar) {
        this.f86357a = bVar;
    }

    @Override // wc.a
    public void a() {
        this.f86359c = !this.f86359c;
        this.f86362f.clear();
        wc.b bVar = this.f86357a;
        if (bVar != null) {
            bVar.setEdits(this.f86359c ? R.drawable.ic_edit_close : R.drawable.ic_edits);
        }
    }

    @Override // wc.a
    public boolean b() {
        return this.f86359c;
    }

    @Override // wc.a
    public void c() {
        if (this.f86362f.size() == this.f86361e.size()) {
            this.f86362f.clear();
            wc.b bVar = this.f86357a;
            if (bVar != null) {
                bVar.whole(r.b().getResources().getString(R.string.text_all_select));
            }
        } else {
            this.f86362f.clear();
            Iterator<VideoCollectionBeanEntry> it = this.f86361e.iterator();
            while (it.hasNext()) {
                this.f86362f.add(String.valueOf(it.next().getId()));
            }
            wc.b bVar2 = this.f86357a;
            if (bVar2 != null) {
                bVar2.whole(r.b().getResources().getString(R.string.text_unall_select));
            }
        }
        wc.b bVar3 = this.f86357a;
        if (bVar3 != null) {
            bVar3.refresh(-1);
        }
    }

    @Override // wc.a
    public void d() {
        tb.a.a().G(new HashMap()).k(new c0()).e(new l()).e(new hc.c()).c(new a());
    }

    @Override // wc.a
    public void delete() {
        if (this.f86362f.size() <= 0) {
            return;
        }
        HashMap map = new HashMap();
        String str = "";
        for (String str2 : this.f86362f) {
            str = o.c(str) ? str + str2 : str + StringUtils.COMMA + str2;
        }
        map.put("vod_ids", str);
        tb.a.a().J(map).k(new c0()).e(new l()).e(new hc.c()).c(new b());
    }

    @Override // wc.a
    public void e(String str, int i10, int i11) {
        if (!this.f86359c) {
            wc.b bVar = this.f86357a;
            if (bVar != null) {
                bVar.video(str, i10);
                return;
            }
            return;
        }
        if (this.f86362f.contains(str)) {
            this.f86362f.remove(str);
        } else {
            this.f86362f.add(str);
        }
        if (this.f86362f.size() == this.f86361e.size()) {
            wc.b bVar2 = this.f86357a;
            if (bVar2 != null) {
                bVar2.whole(r.b().getResources().getString(R.string.text_unall_select));
            }
        } else {
            wc.b bVar3 = this.f86357a;
            if (bVar3 != null) {
                bVar3.whole(r.b().getResources().getString(R.string.text_all_select));
            }
        }
        wc.b bVar4 = this.f86357a;
        if (bVar4 != null) {
            bVar4.refresh(i11);
        }
    }

    @Override // wc.a
    public void f(String str, int i10) {
        if (this.f86362f.contains(str)) {
            this.f86362f.remove(str);
        } else {
            this.f86362f.add(str);
        }
        if (this.f86362f.size() == this.f86361e.size()) {
            wc.b bVar = this.f86357a;
            if (bVar != null) {
                bVar.whole(r.b().getResources().getString(R.string.text_unall_select));
            }
        } else {
            wc.b bVar2 = this.f86357a;
            if (bVar2 != null) {
                bVar2.whole(r.b().getResources().getString(R.string.text_all_select));
            }
        }
        wc.b bVar3 = this.f86357a;
        if (bVar3 != null) {
            bVar3.refresh(i10);
        }
    }

    @Override // wc.a
    public boolean g(String str) {
        return this.f86362f.contains(str);
    }
}
