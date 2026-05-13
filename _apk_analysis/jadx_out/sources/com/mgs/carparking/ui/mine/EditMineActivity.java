package com.mgs.carparking.ui.mine;

import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.Observer;
import com.dramarush.shortin.R;
import com.luck.picture.lib.entity.LocalMedia;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityEditMineBinding;
import com.mgs.carparking.model.EDITMINEVIEWMODEL;
import com.tbruyelle.rxpermissions2.RxPermissions;
import dm.g;
import ed.s;
import ic.p;
import java.io.File;
import java.util.List;
import ma.e;
import me.goldze.mvvmhabit.base.BaseApplication;
import sd.a;
import sd.b;
import zp.n;
import zp.r;

/* JADX INFO: loaded from: classes8.dex */
public class EditMineActivity extends BaseActivity<ActivityEditMineBinding, EDITMINEVIEWMODEL> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public sd.a f44834t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public sd.b f44835u;

    public class a implements a.d {
        public a() {
        }

        @Override // sd.a.d
        public void a(int i10) {
            EditMineActivity.this.camera(i10);
        }
    }

    public class b implements b.f {
        public b() {
        }

        @Override // sd.b.f
        public void a(int i10) {
            if (i10 == 1) {
                ((EDITMINEVIEWMODEL) EditMineActivity.this.f42501p).f43959s.set(r.b().getResources().getString(R.string.str_man));
            } else if (i10 == 2) {
                ((EDITMINEVIEWMODEL) EditMineActivity.this.f42501p).f43959s.set(r.b().getResources().getString(R.string.str_women));
            } else if (i10 == 3) {
                ((EDITMINEVIEWMODEL) EditMineActivity.this.f42501p).f43959s.set(r.b().getResources().getString(R.string.str_secrecy));
            }
        }
    }

    public class c implements ud.b {
        public c() {
        }

        @Override // ud.b
        public void a(List<LocalMedia> list, int i10) {
            String strG;
            if (sb.b.a(list) || (strG = ud.d.g(0, list)) == null) {
                return;
            }
            ((ActivityEditMineBinding) EditMineActivity.this.f42500o).f42591f.setImageURI(Uri.parse(strG));
            ((EDITMINEVIEWMODEL) EditMineActivity.this.f42501p).w(new File(strG));
        }
    }

    public class d implements ud.b {
        public d() {
        }

        @Override // ud.b
        public void a(List<LocalMedia> list, int i10) {
            String strG;
            if (sb.b.a(list) || (strG = ud.d.g(0, list)) == null) {
                return;
            }
            ((ActivityEditMineBinding) EditMineActivity.this.f42500o).f42591f.setImageURI(Uri.parse(strG));
            ((EDITMINEVIEWMODEL) EditMineActivity.this.f42501p).w(new File(strG));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(int i10, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            if (i10 == 1) {
                z();
            } else if (i10 == 2) {
                A();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(Void r42) {
        s.b().a(this);
        if (this.f44834t == null) {
            this.f44834t = new sd.a(this);
        }
        this.f44834t.showAtLocation(((ActivityEditMineBinding) this.f42500o).f42592g, 80, 0, 0);
        this.f44834t.a(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(Void r42) {
        s.b().a(this);
        if (this.f44835u == null) {
            this.f44835u = new sd.b(this, ((EDITMINEVIEWMODEL) this.f42501p).f43959s.get());
        }
        this.f44835u.showAtLocation(((ActivityEditMineBinding) this.f42500o).f42592g, 80, 0, 0);
        this.f44835u.d(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(Void r42) {
        ((EDITMINEVIEWMODEL) this.f42501p).p(((ActivityEditMineBinding) this.f42500o).f42588c.getText().toString(), ((ActivityEditMineBinding) this.f42500o).f42590e.getText().toString(), ((ActivityEditMineBinding) this.f42500o).f42589d.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(p pVar) throws Exception {
        ((EDITMINEVIEWMODEL) this.f42501p).f43962v.set(pVar.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x001c -> B:32:0x0035). Please report as a decompilation issue!!! */
    @androidx.annotation.RequiresApi(api = 26)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String fileToBase64(java.io.File r3) throws java.lang.Throwable {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24 java.io.FileNotFoundException -> L2b
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24 java.io.FileNotFoundException -> L2b
            int r3 = r1.available()     // Catch: java.io.FileNotFoundException -> L20 java.io.IOException -> L25 java.lang.Throwable -> L36
            byte[] r3 = new byte[r3]     // Catch: java.io.FileNotFoundException -> L20 java.io.IOException -> L25 java.lang.Throwable -> L36
            r1.read(r3)     // Catch: java.io.FileNotFoundException -> L20 java.io.IOException -> L25 java.lang.Throwable -> L36
            java.util.Base64$Encoder r2 = java.util.Base64.getEncoder()     // Catch: java.io.FileNotFoundException -> L20 java.io.IOException -> L25 java.lang.Throwable -> L36
            java.lang.String r0 = r2.encodeToString(r3)     // Catch: java.io.FileNotFoundException -> L20 java.io.IOException -> L25 java.lang.Throwable -> L36
            r1.close()     // Catch: java.io.IOException -> L1b
            goto L35
        L1b:
            r3 = move-exception
            r3.printStackTrace()
            goto L35
        L20:
            r3 = move-exception
            goto L2d
        L22:
            r3 = move-exception
            goto L38
        L24:
            r1 = r0
        L25:
            if (r1 == 0) goto L35
            r1.close()     // Catch: java.io.IOException -> L1b
            goto L35
        L2b:
            r3 = move-exception
            r1 = r0
        L2d:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L35
            r1.close()     // Catch: java.io.IOException -> L1b
        L35:
            return r0
        L36:
            r3 = move-exception
            r0 = r1
        L38:
            if (r0 == 0) goto L42
            r0.close()     // Catch: java.io.IOException -> L3e
            goto L42
        L3e:
            r0 = move-exception
            r0.printStackTrace()
        L42:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.ui.mine.EditMineActivity.fileToBase64(java.io.File):java.lang.String");
    }

    public final void A() {
        ud.d.c().i(this, new c());
    }

    public void camera(final int i10) {
        String[] strArrA = xa.b.a(e.c());
        int length = strArrA.length + 1;
        String[] strArr = new String[length];
        System.arraycopy(strArrA, 0, strArr, 0, strArrA.length);
        strArr[length - 1] = "android.permission.CAMERA";
        k(new RxPermissions(this).request(strArr).subscribe(new g() { // from class: vc.o
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f86015b.B(i10, (Boolean) obj);
            }
        }));
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_edit_mine;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        ((ActivityEditMineBinding) this.f42500o).f42587b.f42537g.setTextColor(getResources().getColor(R.color.color_42BD56));
        ((EDITMINEVIEWMODEL) this.f42501p).x();
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public EDITMINEVIEWMODEL initViewModel() {
        return new EDITMINEVIEWMODEL(BaseApplication.getInstance(), tb.a.a());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        ((EDITMINEVIEWMODEL) this.f42501p).f43955o.observe(this, new Observer() { // from class: vc.k
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f86011b.C((Void) obj);
            }
        });
        ((EDITMINEVIEWMODEL) this.f42501p).f43956p.observe(this, new Observer() { // from class: vc.l
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f86012b.D((Void) obj);
            }
        });
        ((EDITMINEVIEWMODEL) this.f42501p).f43957q.observe(this, new Observer() { // from class: vc.m
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f86013b.E((Void) obj);
            }
        });
        k(op.a.a().d(p.class).subscribe(new g() { // from class: vc.n
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f86014b.F((ic.p) obj);
            }
        }));
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f44834t != null) {
            this.f44834t = null;
        }
        if (this.f44835u != null) {
            this.f44835u = null;
        }
    }

    public final void z() {
        ud.d.c().h(this, new d());
    }
}
