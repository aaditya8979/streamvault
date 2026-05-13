package com.mgs.carparking.model;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.ironsource.C3978d4;
import com.mgs.carparking.netbean.MineUserInfo;
import com.mgs.carparking.netbean.UploadFileEntry;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import ed.l0;
import hc.l;
import ic.m;
import java.io.File;
import java.util.HashMap;
import java.util.regex.Pattern;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import xl.u;
import zp.o;
import zp.p;
import zp.r;

/* JADX INFO: loaded from: classes2.dex */
public class EDITMINEVIEWMODEL extends ToolbarViewModel<yb.a> {
    public pp.b A;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SingleLiveEvent<Void> f43955o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SingleLiveEvent<Void> f43956p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SingleLiveEvent<Void> f43957q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ObservableField<String> f43958r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ObservableField<String> f43959s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ObservableField<String> f43960t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ObservableField<String> f43961u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ObservableField<String> f43962v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ObservableField<String> f43963w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f43964x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f43965y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public pp.b f43966z;

    public class a implements u<BaseResponse<UploadFileEntry>> {
        public a() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<UploadFileEntry> baseResponse) {
            if (!baseResponse.isOk() || baseResponse.getResult() == null) {
                return;
            }
            EDITMINEVIEWMODEL editmineviewmodel = EDITMINEVIEWMODEL.this;
            editmineviewmodel.f43965y = false;
            editmineviewmodel.f43964x = baseResponse.getResult().getFile_name();
            p.b(r.b().getResources().getString(R.string.str_success));
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            EDITMINEVIEWMODEL.this.f43965y = false;
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            EDITMINEVIEWMODEL.this.b(bVar);
        }
    }

    public class b implements u<BaseResponse<MineUserInfo>> {
        public b() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<MineUserInfo> baseResponse) {
            EDITMINEVIEWMODEL.this.c();
            if (baseResponse.isOk()) {
                p.b(baseResponse.getMessage());
                if (baseResponse.getResult() != null) {
                    l0.c1(baseResponse.getResult().getHead_img());
                    l0.g1(baseResponse.getResult().getNickname());
                    op.a.a().b(new m(baseResponse.getResult()));
                    EDITMINEVIEWMODEL.this.d();
                }
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            EDITMINEVIEWMODEL.this.c();
            p.b(r.b().getResources().getString(R.string.str_save_fail));
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            EDITMINEVIEWMODEL.this.b(bVar);
        }
    }

    public class c implements u<BaseResponse<MineUserInfo>> {
        public c() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<MineUserInfo> baseResponse) {
            EDITMINEVIEWMODEL.this.c();
            if (!baseResponse.isOk() || baseResponse.getResult() == null) {
                return;
            }
            if (baseResponse.getResult().getSex() == 1) {
                EDITMINEVIEWMODEL.this.f43959s.set(r.b().getResources().getString(R.string.str_man));
            } else if (baseResponse.getResult().getSex() == 0) {
                EDITMINEVIEWMODEL.this.f43959s.set(r.b().getResources().getString(R.string.str_women));
            } else {
                EDITMINEVIEWMODEL.this.f43959s.set(r.b().getResources().getString(R.string.str_secrecy));
            }
            if (!o.b(baseResponse.getResult().getNickname())) {
                EDITMINEVIEWMODEL.this.f43960t.set(baseResponse.getResult().getNickname());
            }
            if (!o.b(baseResponse.getResult().getPhone())) {
                EDITMINEVIEWMODEL.this.f43961u.set(baseResponse.getResult().getPhone());
            }
            if (!o.b(baseResponse.getResult().getHead_img())) {
                EDITMINEVIEWMODEL.this.f43962v.set(baseResponse.getResult().getHead_img());
            }
            if (o.b(baseResponse.getResult().getIntro())) {
                return;
            }
            EDITMINEVIEWMODEL.this.f43963w.set(baseResponse.getResult().getIntro());
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            EDITMINEVIEWMODEL.this.c();
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            EDITMINEVIEWMODEL.this.b(bVar);
        }
    }

    public EDITMINEVIEWMODEL(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f43955o = new SingleLiveEvent<>();
        this.f43956p = new SingleLiveEvent<>();
        this.f43957q = new SingleLiveEvent<>();
        this.f43958r = new ObservableField<>();
        this.f43959s = new ObservableField<>("");
        this.f43960t = new ObservableField<>();
        this.f43961u = new ObservableField<>();
        this.f43962v = new ObservableField<>();
        this.f43963w = new ObservableField<>();
        this.f43964x = "";
        this.f43965y = false;
        this.f43966z = new pp.b(new pp.a() { // from class: hc.w
            @Override // pp.a
            public final void call() {
                this.f63413a.u();
            }
        });
        this.A = new pp.b(new pp.a() { // from class: hc.x
            @Override // pp.a
            public final void call() {
                this.f63428a.v();
            }
        });
        this.f44963g.set(r.b().getResources().getString(R.string.str_edit_info));
        this.f44965i.set(true);
        this.f44964h.set(r.b().getResources().getString(R.string.str_save));
    }

    public static boolean t(String str, CharSequence charSequence) {
        return Pattern.compile(str).matcher(charSequence).find();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        this.f43955o.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        this.f43956p.call();
    }

    @Override // com.mgs.carparking.ui.toolbar.ToolbarViewModel
    public void m() {
        this.f43957q.call();
    }

    public void p(String str, String str2, String str3) {
        if (this.f43965y) {
            p.b(r.b().getResources().getString(R.string.str_header_uping));
            return;
        }
        int i10 = 0;
        if (!o.b(this.f43959s.get())) {
            if (this.f43959s.get().equals(r.b().getResources().getString(R.string.str_man))) {
                i10 = 1;
            } else if (!this.f43959s.get().equals(r.b().getResources().getString(R.string.str_women))) {
                i10 = 2;
            }
        }
        if (o.b(str)) {
            p.b(r.b().getResources().getString(R.string.str_nickname_write));
            return;
        }
        if (!o.b(str2) && !t("^((13[0-9])|(15[^4])|(18[0-9])|(17[0-8])|(147,145))\\d{8}$", str2)) {
            p.b("手机号格式不对");
            return;
        }
        j();
        HashMap map = new HashMap();
        map.put("nickname", str);
        map.put("sex", Integer.valueOf(i10));
        map.put("head_img", this.f43964x);
        if (o.b(str3)) {
            str3 = "";
        }
        map.put("intro", str3);
        ((yb.a) this.f74138b).U(map).e(new l()).e(new hc.c()).c(new b());
    }

    public void w(File file) {
        this.f43965y = true;
        ((yb.a) this.f74138b).B(MultipartBody.Part.createFormData(C3978d4.i.f31327b, file.getName(), RequestBody.create(MediaType.parse(ShareTarget.ENCODING_TYPE_MULTIPART), file))).e(new l()).e(new hc.c()).c(new a());
    }

    public void x() {
        j();
        ((yb.a) this.f74138b).d(new HashMap()).e(new l()).e(new hc.c()).c(new c());
    }
}
