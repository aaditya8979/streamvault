package com.mgs.carparking.model;

import android.app.Application;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import aq.d;
import com.dramarush.shortin.R;
import com.ironsource.C3978d4;
import com.mgs.carparking.model.FEEDBACKVIEWMODEL;
import com.mgs.carparking.netbean.FeedbackTypeEntry;
import com.mgs.carparking.netbean.UploadFileEntry;
import com.mgs.carparking.ui.mine.feedback.FeedbackRecordActivity;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import ed.l0;
import hc.l;
import hc.q1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
public class FEEDBACKVIEWMODEL extends ToolbarViewModel<yb.a> {
    public pp.b A;
    public pp.b B;
    public pp.b C;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<String> f43994o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<String> f43995p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<Boolean> f43996q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SingleLiveEvent<Void> f43997r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ObservableField<Boolean> f43998s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ObservableField<SpannableStringBuilder> f43999t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SingleLiveEvent<String> f44000u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f44001v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f44002w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ObservableList<q1> f44003x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public aq.c<q1> f44004y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public pp.b f44005z;

    public class a extends ClickableSpan {
        public a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            if (o.b(l0.Z())) {
                FEEDBACKVIEWMODEL.this.f44000u.setValue("http://dg10.tv");
            } else {
                FEEDBACKVIEWMODEL.this.f44000u.setValue(l0.Z());
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(Color.parseColor("#365899"));
            textPaint.setUnderlineText(false);
        }
    }

    public class b implements u<BaseResponse<UploadFileEntry>> {
        public b() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<UploadFileEntry> baseResponse) {
            if (!baseResponse.isOk() || baseResponse.getResult() == null) {
                return;
            }
            FEEDBACKVIEWMODEL feedbackviewmodel = FEEDBACKVIEWMODEL.this;
            feedbackviewmodel.f44001v = false;
            feedbackviewmodel.f44002w = baseResponse.getResult().getFile_name();
            p.b(r.b().getResources().getString(R.string.str_success));
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            FEEDBACKVIEWMODEL.this.f44001v = false;
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            FEEDBACKVIEWMODEL.this.b(bVar);
        }
    }

    public class c implements u<BaseResponse<String>> {
        public c() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            FEEDBACKVIEWMODEL.this.c();
            p.b(baseResponse.getMessage());
            FEEDBACKVIEWMODEL.this.d();
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            FEEDBACKVIEWMODEL.this.c();
            p.b(r.b().getResources().getString(R.string.str_fail));
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            FEEDBACKVIEWMODEL.this.b(bVar);
        }
    }

    public FEEDBACKVIEWMODEL(@NonNull Application application, yb.a aVar) {
        String str;
        super(application, aVar);
        this.f43994o = new ObservableField<>("0/200");
        this.f43995p = new ObservableField<>("");
        Boolean bool = Boolean.FALSE;
        this.f43996q = new ObservableField<>(bool);
        this.f43997r = new SingleLiveEvent<>();
        this.f43998s = new ObservableField<>(bool);
        this.f43999t = new ObservableField<>();
        this.f44000u = new SingleLiveEvent<>();
        this.f44001v = false;
        this.f44002w = "";
        this.f44003x = new ObservableArrayList();
        this.f44004y = aq.c.d(new d() { // from class: hc.c0
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_feedback_type_new);
            }
        });
        this.f44005z = new pp.b(new pp.a() { // from class: hc.d0
            @Override // pp.a
            public final void call() {
                this.f63172a.v();
            }
        });
        this.A = new pp.b(new pp.a() { // from class: hc.e0
            @Override // pp.a
            public final void call() {
                this.f63184a.w();
            }
        });
        this.B = new pp.b(new pp.a() { // from class: hc.f0
            @Override // pp.a
            public final void call() {
                this.f63192a.x();
            }
        });
        this.C = new pp.b(new pp.a() { // from class: hc.g0
            @Override // pp.a
            public final void call() {
                FEEDBACKVIEWMODEL.y();
            }
        });
        this.f44963g.set(r.b().getResources().getString(R.string.text_mine_feedback));
        this.f44965i.set(true);
        this.f44964h.set(r.b().getResources().getString(R.string.str_feedback_histroy));
        if (o.b(l0.Z())) {
            str = "如遇无法播放、闪退等问题，请点击: http://dg10.tv 下载最新版本。";
        } else {
            str = "如遇无法播放、闪退等问题，请点击: " + l0.Z() + " 下载最新版本。";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new a(), 17, str.length() - 8, 33);
        this.f43999t.set(spannableStringBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        this.f43997r.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        this.f43998s.set(Boolean.FALSE);
        this.f44002w = "";
    }

    public static /* synthetic */ void y() {
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void v() {
        if (o.b(this.f43995p.get().trim())) {
            p.b(r.b().getResources().getString(R.string.str_write_content));
            return;
        }
        if (this.f44001v) {
            p.b(r.b().getResources().getString(R.string.str_pic_uping));
            return;
        }
        String name = "";
        for (int i10 = 0; i10 < this.f44003x.size(); i10++) {
            if (this.f44003x.get(i10).f63336e.get().booleanValue()) {
                name = this.f44003x.get(i10).f63335d.getName();
            }
        }
        j();
        HashMap map = new HashMap();
        map.put("type", 1);
        map.put("content", this.f43995p.get());
        map.put("tags", name);
        map.put("imgs", this.f44002w);
        ((yb.a) this.f74138b).v(map).e(new l()).e(new hc.c()).c(new c());
    }

    public void getType(int i10) {
        List arrayList = new ArrayList();
        if (!o.b(l0.w())) {
            arrayList = Arrays.asList(l0.w().split(StringUtils.COMMA));
        }
        if (arrayList.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            if (i10 == 1) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (i11 == 1) {
                        arrayList2.add(new FeedbackTypeEntry((String) arrayList.get(i11), true));
                    } else {
                        arrayList2.add(new FeedbackTypeEntry((String) arrayList.get(i11), false));
                    }
                }
            } else if (i10 == 2) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if (i12 == 2) {
                        arrayList2.add(new FeedbackTypeEntry((String) arrayList.get(i12), true));
                    } else {
                        arrayList2.add(new FeedbackTypeEntry((String) arrayList.get(i12), false));
                    }
                }
            } else if (i10 == 3) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    if (i13 == 3) {
                        arrayList2.add(new FeedbackTypeEntry((String) arrayList.get(i13), true));
                    } else {
                        arrayList2.add(new FeedbackTypeEntry((String) arrayList.get(i13), false));
                    }
                }
            } else if (i10 == 0) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    if (i14 == 0) {
                        arrayList2.add(new FeedbackTypeEntry((String) arrayList.get(i14), true));
                    } else {
                        arrayList2.add(new FeedbackTypeEntry((String) arrayList.get(i14), false));
                    }
                }
            }
            this.f44003x.clear();
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                this.f44003x.add(new q1(this, (FeedbackTypeEntry) arrayList2.get(i15), this.f44003x, i15));
            }
        }
    }

    @Override // com.mgs.carparking.ui.toolbar.ToolbarViewModel
    public void m() {
        super.m();
        startActivity(FeedbackRecordActivity.class);
    }

    public void z(File file) {
        this.f44001v = true;
        ((yb.a) this.f74138b).B(MultipartBody.Part.createFormData(C3978d4.i.f31327b, file.getName(), RequestBody.create(MediaType.parse(ShareTarget.ENCODING_TYPE_MULTIPART), file))).e(new l()).e(new hc.c()).c(new b());
    }
}
