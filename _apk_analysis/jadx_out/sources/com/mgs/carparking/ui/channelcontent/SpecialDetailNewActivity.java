package com.mgs.carparking.ui.channelcontent;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.bumptech.glide.Glide;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivitySpecialDetailNewBinding;
import com.mgs.carparking.model.SPECIALDETAILNEWVIEWMODEL;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.ClassicsHeader;
import me.goldze.mvvmhabit.base.BaseApplication;
import oe.f;
import qe.e;
import qe.g;
import zp.n;

/* JADX INFO: loaded from: classes3.dex */
public class SpecialDetailNewActivity extends BaseActivity<ActivitySpecialDetailNewBinding, SPECIALDETAILNEWVIEWMODEL> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f44563t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f44564u;

    public class a implements g {
        public a() {
        }

        @Override // qe.g
        public void d(@NonNull f fVar) {
            ((SPECIALDETAILNEWVIEWMODEL) SpecialDetailNewActivity.this.f42501p).x(SpecialDetailNewActivity.this.f44563t, true);
        }
    }

    public class b implements e {
        public b() {
        }

        @Override // qe.e
        public void a(@NonNull f fVar) {
            ((SPECIALDETAILNEWVIEWMODEL) SpecialDetailNewActivity.this.f42501p).x(SpecialDetailNewActivity.this.f44563t, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(Void r12) {
        ((ActivitySpecialDetailNewBinding) this.f42500o).f42778d.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(Void r32) {
        ((SPECIALDETAILNEWVIEWMODEL) this.f42501p).x(this.f44563t, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(Integer num) {
        ((SPECIALDETAILNEWVIEWMODEL) this.f42501p).z(this.f44563t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(Void r12) {
        ((ActivitySpecialDetailNewBinding) this.f42500o).f42778d.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(Void r12) {
        ((ActivitySpecialDetailNewBinding) this.f42500o).f42778d.n();
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_special_detail_new;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        this.f44563t = getIntent().getIntExtra("id", 0);
        int intExtra = getIntent().getIntExtra("flag", 0);
        this.f44564u = intExtra;
        ((SPECIALDETAILNEWVIEWMODEL) this.f42501p).f44163g = intExtra;
        v();
        ((SPECIALDETAILNEWVIEWMODEL) this.f42501p).x(this.f44563t, true);
        Glide.with((FragmentActivity) this).load(Integer.valueOf(R.drawable.ic_is_loading)).into(((ActivitySpecialDetailNewBinding) this.f42500o).f42777c);
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public SPECIALDETAILNEWVIEWMODEL initViewModel() {
        return new SPECIALDETAILNEWVIEWMODEL(BaseApplication.getInstance(), tb.a.a());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        ((SPECIALDETAILNEWVIEWMODEL) this.f42501p).f44173q.observe(this, new Observer() { // from class: lc.g
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f73774b.w((Void) obj);
            }
        });
        ((SPECIALDETAILNEWVIEWMODEL) this.f42501p).f44174r.observe(this, new Observer() { // from class: lc.h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f73775b.x((Integer) obj);
            }
        });
        ((SPECIALDETAILNEWVIEWMODEL) this.f42501p).f44175s.observe(this, new Observer() { // from class: lc.i
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f73776b.y((Void) obj);
            }
        });
        ((SPECIALDETAILNEWVIEWMODEL) this.f42501p).f44177u.observe(this, new Observer() { // from class: lc.j
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f73777b.z((Void) obj);
            }
        });
        ((SPECIALDETAILNEWVIEWMODEL) this.f42501p).f44176t.observe(this, new Observer() { // from class: lc.k
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f73778b.A((Void) obj);
            }
        });
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
    }

    public final void v() {
        ((ActivitySpecialDetailNewBinding) this.f42500o).f42778d.H(true);
        ClassicsHeader classicsHeader = new ClassicsHeader(this);
        ((ActivitySpecialDetailNewBinding) this.f42500o).f42778d.I(true);
        classicsHeader.u(12.0f);
        new ClassicsFooter(this).u(12.0f);
        ((ActivitySpecialDetailNewBinding) this.f42500o).f42778d.L(new a());
        ((ActivitySpecialDetailNewBinding) this.f42500o).f42778d.K(new b());
    }
}
