package com.mgs.carparking.ui.login;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.lifecycle.Observer;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityRegisterBinding;
import com.mgs.carparking.model.REGISTERVIEWMODEL;
import ed.s;
import me.goldze.mvvmhabit.base.BaseApplication;
import zp.n;
import zp.o;

/* JADX INFO: loaded from: classes3.dex */
public class RegisterActivity extends BaseActivity<ActivityRegisterBinding, REGISTERVIEWMODEL> {

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (o.b(((REGISTERVIEWMODEL) RegisterActivity.this.f42501p).f44118q.get()) || o.b(((REGISTERVIEWMODEL) RegisterActivity.this.f42501p).f44119r.get()) || o.b(((REGISTERVIEWMODEL) RegisterActivity.this.f42501p).f44120s.get())) {
                ((ActivityRegisterBinding) RegisterActivity.this.f42500o).f42712c.setBackground(RegisterActivity.this.getResources().getDrawable(R.drawable.shape_login_submit_no_click));
                ((ActivityRegisterBinding) RegisterActivity.this.f42500o).f42712c.setEnabled(false);
            } else {
                ((ActivityRegisterBinding) RegisterActivity.this.f42500o).f42712c.setBackground(RegisterActivity.this.getResources().getDrawable(R.drawable.shape_login_submit_click));
                ((ActivityRegisterBinding) RegisterActivity.this.f42500o).f42712c.setEnabled(true);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(Void r22) {
        if (((ActivityRegisterBinding) this.f42500o).f42713d.getInputType() == 129) {
            ((ActivityRegisterBinding) this.f42500o).f42713d.setInputType(128);
            ((ActivityRegisterBinding) this.f42500o).f42716g.setImageResource(R.drawable.ic_login_password_show);
            if (o.b(((ActivityRegisterBinding) this.f42500o).f42713d.getText().toString().trim())) {
                return;
            }
            V v10 = this.f42500o;
            ((ActivityRegisterBinding) v10).f42713d.setSelection(((ActivityRegisterBinding) v10).f42713d.getText().toString().trim().length());
            return;
        }
        ((ActivityRegisterBinding) this.f42500o).f42713d.setInputType(129);
        ((ActivityRegisterBinding) this.f42500o).f42716g.setImageResource(R.drawable.ic_login_password_hint);
        if (o.b(((ActivityRegisterBinding) this.f42500o).f42713d.getText().toString().trim())) {
            return;
        }
        V v11 = this.f42500o;
        ((ActivityRegisterBinding) v11).f42713d.setSelection(((ActivityRegisterBinding) v11).f42713d.getText().toString().trim().length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(Void r22) {
        if (((ActivityRegisterBinding) this.f42500o).f42714e.getInputType() == 129) {
            ((ActivityRegisterBinding) this.f42500o).f42714e.setInputType(128);
            ((ActivityRegisterBinding) this.f42500o).f42717h.setImageResource(R.drawable.ic_login_password_show);
            if (o.b(((ActivityRegisterBinding) this.f42500o).f42714e.getText().toString().trim())) {
                return;
            }
            V v10 = this.f42500o;
            ((ActivityRegisterBinding) v10).f42714e.setSelection(((ActivityRegisterBinding) v10).f42714e.getText().toString().trim().length());
            return;
        }
        ((ActivityRegisterBinding) this.f42500o).f42714e.setInputType(129);
        ((ActivityRegisterBinding) this.f42500o).f42717h.setImageResource(R.drawable.ic_login_password_hint);
        if (o.b(((ActivityRegisterBinding) this.f42500o).f42714e.getText().toString().trim())) {
            return;
        }
        V v11 = this.f42500o;
        ((ActivityRegisterBinding) v11).f42714e.setSelection(((ActivityRegisterBinding) v11).f42714e.getText().toString().trim().length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(Void r12) {
        s.b().a(this);
        ((REGISTERVIEWMODEL) this.f42501p).v();
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_register;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        s.b().d(((ActivityRegisterBinding) this.f42500o).f42715f);
        a aVar = new a();
        ((ActivityRegisterBinding) this.f42500o).f42715f.addTextChangedListener(aVar);
        ((ActivityRegisterBinding) this.f42500o).f42713d.addTextChangedListener(aVar);
        ((ActivityRegisterBinding) this.f42500o).f42714e.addTextChangedListener(aVar);
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public REGISTERVIEWMODEL initViewModel() {
        return new REGISTERVIEWMODEL(BaseApplication.getInstance(), tb.a.a());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        ((REGISTERVIEWMODEL) this.f42501p).f44116o.observe(this, new Observer() { // from class: sc.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f79606b.x((Void) obj);
            }
        });
        ((REGISTERVIEWMODEL) this.f42501p).f44117p.observe(this, new Observer() { // from class: sc.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f79607b.y((Void) obj);
            }
        });
        ((REGISTERVIEWMODEL) this.f42501p).f44121t.observe(this, new Observer() { // from class: sc.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f79608b.z((Void) obj);
            }
        });
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
    }
}
