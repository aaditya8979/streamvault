package com.mgs.carparking.ui.mine;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import com.dramarush.shortin.R;
import com.mgs.carparking.adapter.PagerAdapter1;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityDownloadBinding;
import com.mgs.carparking.model.DOWNLOADVIEWMODEL;
import ic.x;
import java.util.ArrayList;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;
import zp.n;
import zp.r;

/* JADX INFO: loaded from: classes3.dex */
public class DownloadActivity extends BaseActivity<ActivityDownloadBinding, DOWNLOADVIEWMODEL> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PagerAdapter1 f44811t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList<BaseFragment> f44812u = new ArrayList<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList<String> f44813v = new ArrayList<>();

    public class a implements ViewPager.OnPageChangeListener {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i10) {
            Log.i("wangyi", "现在位置为：" + i10);
            if (i10 == 0) {
                ((DOWNLOADVIEWMODEL) DownloadActivity.this.f42501p).f43947q.set(Boolean.TRUE);
                ((DOWNLOADVIEWMODEL) DownloadActivity.this.f42501p).f43948r.set(Boolean.FALSE);
            } else {
                ((DOWNLOADVIEWMODEL) DownloadActivity.this.f42501p).f43947q.set(Boolean.FALSE);
                ((DOWNLOADVIEWMODEL) DownloadActivity.this.f42501p).f43948r.set(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(Void r42) {
        op.a.a().b(new x(((ActivityDownloadBinding) this.f42500o).f42550f.getCurrentItem(), ((DOWNLOADVIEWMODEL) this.f42501p).f43949s));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(Void r42) {
        op.a.a().b(new x(((ActivityDownloadBinding) this.f42500o).f42550f.getCurrentItem(), ((DOWNLOADVIEWMODEL) this.f42501p).f43950t));
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_download;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        V v10 = this.f42500o;
        ((ActivityDownloadBinding) v10).f42549e.addTab(((ActivityDownloadBinding) v10).f42549e.newTab().setText(r.b().getResources().getString(R.string.text_mine_download_is_download)));
        this.f44813v.add(r.b().getResources().getString(R.string.text_mine_download_is_download));
        this.f44812u.add(DownloadVideoActivity.newInstance(1));
        V v11 = this.f42500o;
        ((ActivityDownloadBinding) v11).f42549e.addTab(((ActivityDownloadBinding) v11).f42549e.newTab().setText(r.b().getResources().getString(R.string.text_mine_download_complete_download)));
        this.f44813v.add(r.b().getResources().getString(R.string.text_mine_download_complete_download));
        this.f44812u.add(DownloadCompleteFragment.newInstance(2));
        ((ActivityDownloadBinding) this.f42500o).f42549e.setTabMode(0);
        this.f44811t = new PagerAdapter1(getSupportFragmentManager());
        V v12 = this.f42500o;
        ((ActivityDownloadBinding) v12).f42549e.setupWithViewPager(((ActivityDownloadBinding) v12).f42550f);
        this.f44811t.a(this.f44812u);
        this.f44811t.b(this.f44813v);
        ((ActivityDownloadBinding) this.f42500o).f42550f.setAdapter(this.f44811t);
        ((ActivityDownloadBinding) this.f42500o).f42550f.addOnPageChangeListener(new a());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public DOWNLOADVIEWMODEL initViewModel() {
        return new DOWNLOADVIEWMODEL(BaseApplication.getInstance(), tb.a.a());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        ((DOWNLOADVIEWMODEL) this.f42501p).f43951u.observe(this, new Observer() { // from class: vc.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f85952b.t((Void) obj);
            }
        });
        ((DOWNLOADVIEWMODEL) this.f42501p).f43952v.observe(this, new Observer() { // from class: vc.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f85954b.u((Void) obj);
            }
        });
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
    }
}
