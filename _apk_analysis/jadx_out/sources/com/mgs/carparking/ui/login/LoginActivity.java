package com.mgs.carparking.ui.login;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.lifecycle.Observer;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityLoginBinding;
import com.mgs.carparking.model.LOGINVIEWMODEL;
import dm.g;
import ic.c0;
import me.goldze.mvvmhabit.base.BaseApplication;
import zp.n;
import zp.o;

/* JADX INFO: loaded from: classes11.dex */
public class LoginActivity extends BaseActivity<ActivityLoginBinding, LOGINVIEWMODEL> {

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (((LOGINVIEWMODEL) LoginActivity.this.f42501p).f44041f.get().length() <= 0 || ((LOGINVIEWMODEL) LoginActivity.this.f42501p).f44042g.get().length() <= 0) {
                ((ActivityLoginBinding) LoginActivity.this.f42500o).f42669b.setEnabled(false);
                ((ActivityLoginBinding) LoginActivity.this.f42500o).f42669b.setBackground(LoginActivity.this.getResources().getDrawable(R.drawable.shape_login_submit_no_click));
            } else {
                ((ActivityLoginBinding) LoginActivity.this.f42500o).f42669b.setEnabled(true);
                ((ActivityLoginBinding) LoginActivity.this.f42500o).f42669b.setBackground(LoginActivity.this.getResources().getDrawable(R.drawable.shape_login_submit_click));
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
    public /* synthetic */ void v(c0 c0Var) throws Exception {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(Void r22) {
        if (((ActivityLoginBinding) this.f42500o).f42670c.getInputType() == 129) {
            ((ActivityLoginBinding) this.f42500o).f42670c.setInputType(128);
            ((ActivityLoginBinding) this.f42500o).f42672e.setImageResource(R.drawable.ic_login_password_show);
            if (o.b(((ActivityLoginBinding) this.f42500o).f42670c.getText().toString().trim())) {
                return;
            }
            V v10 = this.f42500o;
            ((ActivityLoginBinding) v10).f42670c.setSelection(((ActivityLoginBinding) v10).f42670c.getText().toString().trim().length());
            return;
        }
        ((ActivityLoginBinding) this.f42500o).f42670c.setInputType(129);
        ((ActivityLoginBinding) this.f42500o).f42672e.setImageResource(R.drawable.ic_login_password_hint);
        if (o.b(((ActivityLoginBinding) this.f42500o).f42670c.getText().toString().trim())) {
            return;
        }
        V v11 = this.f42500o;
        ((ActivityLoginBinding) v11).f42670c.setSelection(((ActivityLoginBinding) v11).f42670c.getText().toString().trim().length());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_login;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        a aVar = new a();
        ((ActivityLoginBinding) this.f42500o).f42671d.addTextChangedListener(aVar);
        ((ActivityLoginBinding) this.f42500o).f42670c.addTextChangedListener(aVar);
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public LOGINVIEWMODEL initViewModel() {
        return new LOGINVIEWMODEL(BaseApplication.getInstance(), tb.a.a());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        k(op.a.a().d(c0.class).subscribe(new g() { // from class: sc.a
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f79604b.v((c0) obj);
            }
        }));
        ((LOGINVIEWMODEL) this.f42501p).f44043h.observe(this, new Observer() { // from class: sc.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f79605b.w((Void) obj);
            }
        });
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
    }
}
