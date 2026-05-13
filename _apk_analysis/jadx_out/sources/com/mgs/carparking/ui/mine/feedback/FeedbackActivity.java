package com.mgs.carparking.ui.mine.feedback;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.Observer;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityFeedbackBinding;
import com.mgs.carparking.model.FEEDBACKVIEWMODEL;
import com.tbruyelle.rxpermissions2.RxPermissions;
import dm.g;
import ed.f0;
import ed.s;
import ic.n;
import java.io.File;
import me.goldze.mvvmhabit.base.BaseApplication;
import sd.a;
import zp.o;
import zp.r;

/* JADX INFO: loaded from: classes5.dex */
public class FeedbackActivity extends BaseActivity<ActivityFeedbackBinding, FEEDBACKVIEWMODEL> implements f0.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f44867t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f44868u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public sd.a f44869v;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((FEEDBACKVIEWMODEL) FeedbackActivity.this.f42501p).f43995p.set(editable.toString().trim());
            ((FEEDBACKVIEWMODEL) FeedbackActivity.this.f42501p).f43994o.set(editable.toString().length() + "/200");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class b implements a.d {
        public b() {
        }

        @Override // sd.a.d
        public void a(int i10) {
            FeedbackActivity.this.camera(i10);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((ActivityFeedbackBinding) FeedbackActivity.this.f42500o).f42633h.scrollTo(0, 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(int i10, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            if (i10 == 2) {
                z(1, 101);
            } else if (i10 == 1) {
                z(2, 102);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(n nVar) throws Exception {
        ((FEEDBACKVIEWMODEL) this.f42501p).f43996q.set(Boolean.valueOf(nVar.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(Void r42) {
        s.b().a(this);
        if (this.f44869v == null) {
            this.f44869v = new sd.a(this);
        }
        this.f44869v.showAtLocation(((ActivityFeedbackBinding) this.f42500o).f42628c, 80, 0, 0);
        this.f44869v.a(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(String str) {
        ed.a.a(this, str);
    }

    public void camera(final int i10) {
        k(new RxPermissions(this).request("android.permission.CAMERA").subscribe(new g() { // from class: xc.a
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f86894b.v(i10, (Boolean) obj);
            }
        }));
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_feedback;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        this.f44867t = getIntent().getStringExtra("content");
        int intExtra = getIntent().getIntExtra("flag", 0);
        this.f44868u = intExtra;
        if (intExtra == 1 && !o.b(this.f44867t)) {
            ((ActivityFeedbackBinding) this.f42500o).f42628c.setText(this.f44867t + "  " + r.b().getResources().getString(R.string.str_txt_feed_find_movie));
            V v10 = this.f42500o;
            ((ActivityFeedbackBinding) v10).f42628c.setSelection(((ActivityFeedbackBinding) v10).f42628c.length());
            ((FEEDBACKVIEWMODEL) this.f42501p).f43995p.set(this.f44867t + "  " + r.b().getResources().getString(R.string.str_txt_feed_find_movie));
        } else if (this.f44868u == 3) {
            ((ActivityFeedbackBinding) this.f42500o).f42628c.setHint(r.b().getResources().getString(R.string.str_account_input));
        } else if (!o.b(this.f44867t)) {
            ((ActivityFeedbackBinding) this.f42500o).f42628c.setText(this.f44867t + "  " + r.b().getResources().getString(R.string.str_txt_feed_play_movie));
            V v11 = this.f42500o;
            ((ActivityFeedbackBinding) v11).f42628c.setSelection(((ActivityFeedbackBinding) v11).f42628c.length());
            ((FEEDBACKVIEWMODEL) this.f42501p).f43995p.set(this.f44867t + "  " + r.b().getResources().getString(R.string.str_txt_feed_play_movie));
        }
        ((ActivityFeedbackBinding) this.f42500o).f42628c.requestFocus();
        new f0(((ActivityFeedbackBinding) this.f42500o).f42633h).a(this);
        ((FEEDBACKVIEWMODEL) this.f42501p).getType(this.f44868u);
        ((ActivityFeedbackBinding) this.f42500o).f42628c.addTextChangedListener(new a());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public FEEDBACKVIEWMODEL initViewModel() {
        return new FEEDBACKVIEWMODEL(BaseApplication.getInstance(), tb.a.a());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        k(op.a.a().e(n.class).subscribe(new g() { // from class: xc.b
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f86896b.w((n) obj);
            }
        }));
        ((FEEDBACKVIEWMODEL) this.f42501p).f43997r.observe(this, new Observer() { // from class: xc.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f86897b.x((Void) obj);
            }
        });
        ((FEEDBACKVIEWMODEL) this.f42501p).f44000u.observe(this, new Observer() { // from class: xc.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f86898b.y((String) obj);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @RequiresApi(api = 26)
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 != -1) {
            return;
        }
        if (i10 == 101 && intent != null) {
            String stringExtra = intent.getStringExtra("result");
            if (o.b(stringExtra)) {
                return;
            }
            File file = new File(stringExtra);
            ((ActivityFeedbackBinding) this.f42500o).f42630e.setImageURI(Uri.fromFile(file));
            ((FEEDBACKVIEWMODEL) this.f42501p).f43998s.set(Boolean.TRUE);
            ((FEEDBACKVIEWMODEL) this.f42501p).z(file);
            Log.v("wht获取返回的图片路径--1", stringExtra);
            return;
        }
        if (i10 != 102 || intent == null) {
            return;
        }
        for (String str : intent.getStringArrayListExtra("result")) {
            Log.v("wht获取返回的图片路径--2", str);
            if (!o.b(str)) {
                File file2 = new File(str);
                ((ActivityFeedbackBinding) this.f42500o).f42630e.setImageURI(Uri.fromFile(file2));
                ((FEEDBACKVIEWMODEL) this.f42501p).f43998s.set(Boolean.TRUE);
                ((FEEDBACKVIEWMODEL) this.f42501p).z(file2);
            }
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zp.n.a(this);
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        sd.a aVar = this.f44869v;
        if (aVar != null) {
            if (aVar.isShowing()) {
                this.f44869v.dismiss();
            }
            this.f44869v = null;
        }
    }

    @Override // ed.f0.a
    public void onSoftKeyboardClosed() {
    }

    @Override // ed.f0.a
    public void onSoftKeyboardOpened(int i10) {
        u();
    }

    public final void u() {
        new Handler().postDelayed(new c(), 100L);
    }

    public final void z(int i10, int i11) {
    }
}
