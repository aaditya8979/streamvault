package com.mgs.carparking.model;

import android.app.Application;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import aq.c;
import com.dramarush.shortin.R;
import com.inmobi.unification.sdk.InitializationStatus;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.db.VideoDownloadDao;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import ed.g0;
import ed.x;
import hc.c1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.goldze.mvvmhabit.base.BaseViewModel;
import okhttp3.Response;
import pp.b;
import zp.r;

/* JADX INFO: loaded from: classes12.dex */
public class DOWNLOADCOMPLETEVIEWMODEL extends BaseViewModel<yb.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f43908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<String> f43909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableBoolean f43910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<String> f43911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<Boolean> f43912j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObservableArrayList<c1> f43913k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableArrayList<c1> f43914l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c<c1> f43915m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f43916n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f43917o;

    public class a implements x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f43918a;

        public a(String str) {
            this.f43918a = str;
        }

        @Override // ed.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
        }

        @Override // ed.x.b
        public void b(Response response) {
            Log.i("wangyi", InitializationStatus.SUCCESS);
            VideoDownloadDao.getInstance().deleteHistory(this.f43918a);
            if (DOWNLOADCOMPLETEVIEWMODEL.this.f43914l.size() == 0) {
                DOWNLOADCOMPLETEVIEWMODEL.this.f43912j.set(Boolean.TRUE);
            }
        }
    }

    public DOWNLOADCOMPLETEVIEWMODEL(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f43908f = new ObservableField<>();
        this.f43909g = new ObservableField<>();
        this.f43910h = new ObservableBoolean(false);
        this.f43911i = new ObservableField<>(getApplication().getResources().getString(R.string.text_all_select));
        this.f43912j = new ObservableField<>(Boolean.TRUE);
        this.f43913k = new ObservableArrayList<>();
        this.f43914l = new ObservableArrayList<>();
        this.f43915m = c.c(7, R.layout.item_downnload_complete_video);
        this.f43916n = new b(new pp.a() { // from class: hc.o
            @Override // pp.a
            public final void call() {
                this.f63289a.p();
            }
        });
        this.f43917o = new b(new pp.a() { // from class: hc.p
            @Override // pp.a
            public final void call() {
                this.f63304a.q();
            }
        });
        this.f43908f.set(r.b().getResources().getString(R.string.text_use_space) + g0.b(application) + "，");
        this.f43909g.set(r.b().getResources().getString(R.string.text_unuse_space, g0.c(application)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        if (!this.f43911i.get().equals(getApplication().getResources().getString(R.string.text_all_select))) {
            Iterator<c1> it = this.f43914l.iterator();
            while (it.hasNext()) {
                it.next().f63149b.set(Boolean.FALSE);
                this.f43913k.clear();
            }
            this.f43911i.set(getApplication().getResources().getString(R.string.text_all_select));
            return;
        }
        for (c1 c1Var : this.f43914l) {
            c1Var.f63149b.set(Boolean.TRUE);
            this.f43913k.add(c1Var);
        }
        this.f43911i.set(getApplication().getResources().getString(R.string.text_unall_select));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        Iterator<c1> it = this.f43913k.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            c1 next = it.next();
            this.f43914l.remove(next);
            if (next.f63151d.size() > 1) {
                for (int i10 = 0; i10 < next.f63151d.size(); i10++) {
                    o(next.f63151d.get(i10).getStreamid());
                }
            } else {
                o(next.f63151d.get(0).getStreamid());
            }
        }
        if (this.f43914l.size() == 0) {
            this.f43910h.set(false);
        }
    }

    @RequiresApi(api = 24)
    public void n(List<VideoDownloadEntity> list) {
        this.f43912j.set(Boolean.FALSE);
        for (int i10 = 0; i10 < list.size(); i10++) {
            for (int size = list.size() - 1; size > i10; size--) {
                if (list.get(i10).getStreamid().equals(list.get(size).getStreamid())) {
                    list.remove(size);
                }
            }
        }
        ArrayList<VideoDownloadEntity> arrayList = new ArrayList();
        this.f43914l.clear();
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (list.get(i11).getComplete() == 1) {
                arrayList.add(list.get(i11));
            }
        }
        if (arrayList.size() > 0) {
            HashMap map = new HashMap();
            for (VideoDownloadEntity videoDownloadEntity : arrayList) {
                List arrayList2 = (List) map.get(Integer.valueOf(videoDownloadEntity.getId()));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    map.put(Integer.valueOf(videoDownloadEntity.getId()), arrayList2);
                }
                arrayList2.add(videoDownloadEntity);
            }
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                this.f43914l.add(new c1(this, (List) ((Map.Entry) it.next()).getValue()));
            }
        }
    }

    public void o(String str) {
        String str2 = "http://127.0.0.1:" + AppApplication.port + "/download_control?resource=" + str + "&type=5";
        Log.i("wangyi", "删除链接为：" + str2);
        x.a(str2, new a(str));
    }
}
