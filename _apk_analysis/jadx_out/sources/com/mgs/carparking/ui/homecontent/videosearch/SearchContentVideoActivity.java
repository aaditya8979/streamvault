package com.mgs.carparking.ui.homecontent.videosearch;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import com.dramarush.shortin.R;
import com.mgs.carparking.adapter.MyPagerListAdapter;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivitySearchVideoBinding;
import com.mgs.carparking.databinding.DialogSearchHistoryClearBinding;
import com.mgs.carparking.db.SearchHistoryDao;
import com.mgs.carparking.dbtable.SearchHistoryEntity;
import com.mgs.carparking.model.SEARCHCONTENTVIDEOVIEWMODEL;
import dm.q;
import ed.s;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;
import sd.h;
import xl.k;
import xl.p;
import xl.r;
import zp.n;
import zp.o;

/* JADX INFO: loaded from: classes6.dex */
public class SearchContentVideoActivity extends BaseActivity<ActivitySearchVideoBinding, SEARCHCONTENTVIDEOVIEWMODEL> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public MyPagerListAdapter f44780t;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LinearLayout.LayoutParams f44784x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public DialogSearchHistoryClearBinding f44785y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Dialog f44786z;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList<BaseFragment> f44781u = new ArrayList<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList<String> f44782v = new ArrayList<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List<SearchHistoryEntity> f44783w = new ArrayList();
    public Handler A = new Handler();
    public String B = "";

    public class a implements TextView.OnEditorActionListener {
        public a() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            if (i10 != 3) {
                return false;
            }
            ((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f42501p).D.b();
            return true;
        }
    }

    public class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class c implements r<String> {
        public c() {
        }

        @Override // xl.r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(String str) {
            SearchContentVideoActivity.this.B = str.trim();
            if (!((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f42501p).f44136o.get().equals(SearchContentVideoActivity.this.B)) {
                ((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f42501p).f44133l.set(false);
                ((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f42501p).f44132k.set(true);
            }
            if (o.b(SearchContentVideoActivity.this.B)) {
                ((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f42501p).f44128g.set(SearchContentVideoActivity.this.getResources().getString(R.string.text_cannel));
                ((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f42501p).f44134m.set(Boolean.FALSE);
                return;
            }
            if (((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f42501p).f44133l.get()) {
                ((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f42501p).f44128g.set(SearchContentVideoActivity.this.getResources().getString(R.string.text_cannel));
            } else {
                ((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f42501p).f44128g.set(SearchContentVideoActivity.this.getResources().getString(R.string.text_home_videosearch_search));
            }
            ((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f42501p).f44134m.set(Boolean.TRUE);
            ((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f42501p).F(SearchContentVideoActivity.this.B);
        }

        @Override // xl.r
        public void onComplete() {
        }

        @Override // xl.r
        public void onError(Throwable th2) {
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
        }
    }

    public class d implements dm.o<x9.c, p<String>> {
        public d() {
        }

        @Override // dm.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p<String> apply(x9.c cVar) throws Exception {
            String string = cVar.e().toString();
            ec.b.c(cVar.e().toString());
            return k.just(string);
        }
    }

    public class e implements q<x9.c> {
        public e() {
        }

        @Override // dm.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(x9.c cVar) throws Exception {
            cVar.e().toString();
            return true;
        }
    }

    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SearchHistoryEntity f44792b;

        public f(SearchHistoryEntity searchHistoryEntity) {
            this.f44792b = searchHistoryEntity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f42501p).f44129h.set(this.f44792b.getContent());
            ((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f42501p).D.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(String str) {
        SearchHistoryEntity searchHistoryEntity = new SearchHistoryEntity();
        searchHistoryEntity.setCreateTime(System.currentTimeMillis());
        searchHistoryEntity.setContent(str);
        addItemHistory(searchHistoryEntity, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(String str) {
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f42501p).f44132k.set(false);
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f42501p).f44133l.set(true);
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f42501p).f44128g.set(zp.r.b().getResources().getString(R.string.text_cannel));
        this.f44780t.a(((ActivitySearchVideoBinding) this.f42500o).f42735g);
        this.f44781u.clear();
        this.f44781u.add(HomeContentSearchListFragment.newInstance(0, str));
        this.f44781u.add(HomeContentSearchListFragment.newInstance(2, str));
        this.f44781u.add(HomeContentSearchListFragment.newInstance(1, str));
        this.f44780t.b(this.f44781u);
        ((ActivitySearchVideoBinding) this.f42500o).f42735g.setAdapter(this.f44780t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(Void r22) {
        s.c((EditText) ((ActivitySearchVideoBinding) this.f42500o).getRoot().findViewById(R.id.et_search));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(Boolean bool) {
        if (bool == null || this.f44783w == null) {
            return;
        }
        toggleClearHistoryDialog(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(Boolean bool) {
        if (((ActivitySearchVideoBinding) this.f42500o).f42731c != null) {
            ((SEARCHCONTENTVIDEOVIEWMODEL) this.f42501p).f44143v.set(Boolean.FALSE);
            ((ActivitySearchVideoBinding) this.f42500o).f42731c.removeAllViews();
            SearchHistoryDao.getInstance().clearHistory();
        }
        Dialog dialog = this.f44786z;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(Void r22) {
        Log.i("wangyi", "内容为：" + ((SEARCHCONTENTVIDEOVIEWMODEL) this.f42501p).f44129h.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(Void r22) {
        if (AppApplication.adInfoEntry.getAd_position_3() == null || AppApplication.adInfoEntry.getAd_position_3().size() <= 0) {
            return;
        }
        ed.b.i(this, ((ActivitySearchVideoBinding) this.f42500o).f42732d, AppApplication.adInfoEntry.getAd_position_3());
    }

    public void addHistory(List<SearchHistoryEntity> list) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.f44784x = layoutParams;
        layoutParams.setMargins(10, 10, 10, 10);
        V v10 = this.f42500o;
        if (((ActivitySearchVideoBinding) v10).f42731c != null) {
            ((ActivitySearchVideoBinding) v10).f42731c.removeAllViews();
        }
        if (list.size() > 0) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                addItemHistory(list.get(i10), false);
            }
        }
    }

    public void addItemHistory(SearchHistoryEntity searchHistoryEntity, boolean z10) {
        if (z10 && SearchHistoryDao.getInstance().insertHistory(searchHistoryEntity) == 0) {
            return;
        }
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f42501p).f44143v.set(Boolean.TRUE);
        TextView textView = (TextView) LayoutInflater.from(this).inflate(R.layout.item_history_search, (ViewGroup) ((ActivitySearchVideoBinding) this.f42500o).f42731c, false).findViewById(R.id.tv_name);
        textView.setText(searchHistoryEntity.getContent());
        textView.setOnClickListener(new f(searchHistoryEntity));
        ((ActivitySearchVideoBinding) this.f42500o).f42731c.addView(textView, 0, this.f44784x);
        if (((ActivitySearchVideoBinding) this.f42500o).f42731c.getChildCount() == 11) {
            ((ActivitySearchVideoBinding) this.f42500o).f42731c.removeViewAt(10);
        }
    }

    public void ext(EditText editText) {
        x9.b.a(editText).debounce(500L, TimeUnit.MILLISECONDS).filter(new e()).flatMap(new d()).subscribe(new c());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_search_video;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        DialogSearchHistoryClearBinding dialogSearchHistoryClearBinding = (DialogSearchHistoryClearBinding) DataBindingUtil.inflate(LayoutInflater.from(zp.r.b()), R.layout.dialog_search_history_clear, null, false);
        this.f44785y = dialogSearchHistoryClearBinding;
        dialogSearchHistoryClearBinding.b((SEARCHCONTENTVIDEOVIEWMODEL) this.f42501p);
        ArrayList<SearchHistoryEntity> arrayListQueryHistory = SearchHistoryDao.getInstance().queryHistory();
        this.f44783w = arrayListQueryHistory;
        if (arrayListQueryHistory.size() == 0) {
            ((SEARCHCONTENTVIDEOVIEWMODEL) this.f42501p).f44143v.set(Boolean.FALSE);
        }
        addHistory(this.f44783w);
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f42501p).E();
        for (int i10 = 0; i10 < 5; i10++) {
            if (i10 == 0) {
                V v10 = this.f42500o;
                ((ActivitySearchVideoBinding) v10).f42734f.addTab(((ActivitySearchVideoBinding) v10).f42734f.newTab().setText(zp.r.b().getResources().getString(R.string.text_video_type_all)));
                this.f44782v.add(zp.r.b().getResources().getString(R.string.text_video_type_all));
            } else if (i10 == 1) {
                V v11 = this.f42500o;
                ((ActivitySearchVideoBinding) v11).f42734f.addTab(((ActivitySearchVideoBinding) v11).f42734f.newTab().setText(zp.r.b().getResources().getString(R.string.text_tv)));
                this.f44782v.add(zp.r.b().getResources().getString(R.string.text_tv));
            } else if (i10 == 2) {
                V v12 = this.f42500o;
                ((ActivitySearchVideoBinding) v12).f42734f.addTab(((ActivitySearchVideoBinding) v12).f42734f.newTab().setText(zp.r.b().getResources().getString(R.string.text_movie)));
                this.f44782v.add(zp.r.b().getResources().getString(R.string.text_movie));
            }
        }
        ((ActivitySearchVideoBinding) this.f42500o).f42734f.setTabMode(0);
        this.f44780t = new MyPagerListAdapter(getSupportFragmentManager());
        V v13 = this.f42500o;
        ((ActivitySearchVideoBinding) v13).f42734f.setupWithViewPager(((ActivitySearchVideoBinding) v13).f42735g);
        this.f44780t.b(this.f44781u);
        this.f44780t.c(this.f44782v);
        ((ActivitySearchVideoBinding) this.f42500o).f42735g.setAdapter(this.f44780t);
        s.b().d(((ActivitySearchVideoBinding) this.f42500o).f42730b);
        ((ActivitySearchVideoBinding) this.f42500o).f42730b.setOnEditorActionListener(new a());
        ext(((ActivitySearchVideoBinding) this.f42500o).f42730b);
        ((ActivitySearchVideoBinding) this.f42500o).f42730b.addTextChangedListener(new b());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public SEARCHCONTENTVIDEOVIEWMODEL initViewModel() {
        return new SEARCHCONTENTVIDEOVIEWMODEL(BaseApplication.getInstance(), tb.a.a());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f42501p).f44138q.observe(this, new Observer() { // from class: rc.j
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78887b.J((String) obj);
            }
        });
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f42501p).f44140s.observe(this, new Observer() { // from class: rc.k
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78888b.K((String) obj);
            }
        });
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f42501p).f44139r.observe(this, new Observer() { // from class: rc.l
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78889b.L((Void) obj);
            }
        });
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f42501p).f44141t.observe(this, new Observer() { // from class: rc.m
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78890b.M((Boolean) obj);
            }
        });
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f42501p).f44142u.observe(this, new Observer() { // from class: rc.n
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78891b.N((Boolean) obj);
            }
        });
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f42501p).f44137p.observe(this, new Observer() { // from class: rc.o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78892b.O((Void) obj);
            }
        });
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f42501p).f44144w.observe(this, new Observer() { // from class: rc.p
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78893b.P((Void) obj);
            }
        });
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f44786z != null) {
            this.f44786z = null;
        }
        Handler handler = this.A;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.A = null;
        }
    }

    public void toggleClearHistoryDialog(boolean z10) {
        if (z10) {
            if (this.f44786z == null) {
                this.f44786z = h.a(this, this.f44785y.getRoot(), true);
            }
            this.f44786z.show();
        } else {
            Dialog dialog = this.f44786z;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }
}
