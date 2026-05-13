package com.mgs.carparking.ui.mine;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.databinding.ActivityDownloadVideoBinding;
import com.mgs.carparking.db.VideoDownloadDao;
import com.mgs.carparking.model.DOWNLOADVIDEOVIEWMODEL;
import com.mgs.carparking.netbean.DownloadInfoEntry;
import dm.g;
import ed.d0;
import ed.k;
import ed.x;
import ic.j;
import ic.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;
import okhttp3.Response;

/* JADX INFO: loaded from: classes11.dex */
public class DownloadVideoActivity extends BaseFragment<ActivityDownloadVideoBinding, DOWNLOADVIDEOVIEWMODEL> {
    private DownloadingAdapter adapter;
    private String json;
    private b resultTask;
    private List<DownloadInfoEntry> downloadInfos = new ArrayList();
    private d0 rxTimer = new d0();
    private Handler mHandler = new Handler();

    public class a implements x.b {
        public a() {
        }

        @Override // ed.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
        }

        @Override // ed.x.b
        public void b(Response response) {
            try {
                DownloadVideoActivity.this.json = response.body().string();
                Log.i("wangyi", "json：" + DownloadVideoActivity.this.json);
                if (DownloadVideoActivity.this.mHandler != null) {
                    DownloadVideoActivity.this.mHandler.removeCallbacks(DownloadVideoActivity.this.resultTask);
                    DownloadVideoActivity.this.mHandler.postDelayed(DownloadVideoActivity.this.resultTask, 500L);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public class b implements Runnable {

        public class a extends j8.a<List<DownloadInfoEntry>> {
            public a() {
            }
        }

        /* JADX INFO: renamed from: com.mgs.carparking.ui.mine.DownloadVideoActivity$b$b, reason: collision with other inner class name */
        public class C0540b implements Comparator<DownloadInfoEntry> {
            public C0540b() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(DownloadInfoEntry downloadInfoEntry, DownloadInfoEntry downloadInfoEntry2) {
                return downloadInfoEntry2.getDownload_time().compareTo(downloadInfoEntry.getDownload_time());
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k.d(DownloadVideoActivity.this.json, DownloadInfoEntry.class)) {
                DownloadVideoActivity downloadVideoActivity = DownloadVideoActivity.this;
                downloadVideoActivity.downloadInfos = (List) k.c(downloadVideoActivity.json, new a().getType());
                Collections.sort(DownloadVideoActivity.this.downloadInfos, new C0540b());
                ((DOWNLOADVIDEOVIEWMODEL) DownloadVideoActivity.this.viewModel).p(DownloadVideoActivity.this.downloadInfos, DownloadVideoActivity.this.adapter);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$0(l lVar) throws Exception {
        ((DOWNLOADVIDEOVIEWMODEL) this.viewModel).f43927k = true;
        getDownloadInfo("http://127.0.0.1:" + AppApplication.port + "/control?msg=download_info");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$1(ic.k kVar) throws Exception {
        ((DOWNLOADVIDEOVIEWMODEL) this.viewModel).f43924h = VideoDownloadDao.getInstance().queryHistory();
        op.a.a().b(new j(((DOWNLOADVIDEOVIEWMODEL) this.viewModel).f43924h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$2(ic.x xVar) throws Exception {
        if (xVar.a() == 0) {
            if (((DOWNLOADVIDEOVIEWMODEL) this.viewModel).f43938v.size() <= 0 || !xVar.b().get()) {
                ((DOWNLOADVIDEOVIEWMODEL) this.viewModel).f43922f.set(false);
            } else {
                ((DOWNLOADVIDEOVIEWMODEL) this.viewModel).f43922f.set(true);
            }
        }
    }

    public static DownloadVideoActivity newInstance(int i10) {
        DownloadVideoActivity downloadVideoActivity = new DownloadVideoActivity();
        Bundle bundle = new Bundle();
        bundle.putInt("resourceType", i10);
        downloadVideoActivity.setArguments(bundle);
        return downloadVideoActivity;
    }

    public void getDownloadInfo(String str) {
        Log.i("wangyi", "下载链接为：" + str);
        x.a(str, new a());
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.activity_download_video;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initData() {
        super.initData();
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recycledViewPool.setMaxRecycledViews(0, 10);
        ((ActivityDownloadVideoBinding) this.binding).f42568b.setRecycledViewPool(recycledViewPool);
        ((ActivityDownloadVideoBinding) this.binding).f42568b.getItemAnimator().setChangeDuration(0L);
        ((SimpleItemAnimator) ((ActivityDownloadVideoBinding) this.binding).f42568b.getItemAnimator()).setSupportsChangeAnimations(false);
        DownloadingAdapter downloadingAdapter = new DownloadingAdapter();
        this.adapter = downloadingAdapter;
        ((ActivityDownloadVideoBinding) this.binding).f42568b.setAdapter(downloadingAdapter);
        this.resultTask = new b();
        if (AppApplication.port > 0) {
            getDownloadInfo("http://127.0.0.1:" + AppApplication.port + "/control?msg=download_info");
        }
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initVariableId() {
        return 7;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public DOWNLOADVIDEOVIEWMODEL initViewModel() {
        return new DOWNLOADVIDEOVIEWMODEL(BaseApplication.getInstance(), tb.a.a(), this.rxTimer, this);
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    @RequiresApi(api = 24)
    public void initViewObservable() {
        super.initViewObservable();
        addSubscribe(op.a.a().d(l.class).subscribe(new g() { // from class: vc.e
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f85959b.lambda$initViewObservable$0((ic.l) obj);
            }
        }));
        addSubscribe(op.a.a().d(ic.k.class).subscribe(new g() { // from class: vc.f
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f85961b.lambda$initViewObservable$1((ic.k) obj);
            }
        }));
        addSubscribe(op.a.a().d(ic.x.class).subscribe(new g() { // from class: vc.g
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f85963b.lambda$initViewObservable$2((ic.x) obj);
            }
        }));
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment, com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.rxTimer.b();
        if (((DOWNLOADVIDEOVIEWMODEL) this.viewModel).f43938v.size() > 0) {
            for (int i10 = 0; i10 < ((DOWNLOADVIDEOVIEWMODEL) this.viewModel).f43938v.size(); i10++) {
                ((DOWNLOADVIDEOVIEWMODEL) this.viewModel).f43938v.get(i10).f44268c.b();
                ((DOWNLOADVIDEOVIEWMODEL) this.viewModel).f43938v.get(i10).f44269d.removeCallbacks(((DOWNLOADVIDEOVIEWMODEL) this.viewModel).f43938v.get(i10).f44272g);
            }
        }
        super.onDestroy();
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.resultTask);
            this.mHandler = null;
        }
    }
}
