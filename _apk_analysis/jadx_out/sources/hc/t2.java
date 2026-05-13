package hc;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.mgs.carparking.model.HOMECONTENTSEARCHLISTVIEWMODEL;
import com.mgs.carparking.netbean.RecommandVideosEntity;

/* JADX INFO: compiled from: ITEMSEARCHLISTVARIETYVIEWMODEL.java */
/* JADX INFO: loaded from: classes3.dex */
public class t2 extends np.e<HOMECONTENTSEARCHLISTVIEWMODEL> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HOMECONTENTSEARCHLISTVIEWMODEL f63367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecommandVideosEntity f63368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<SpannableString> f63369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f63370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<SpannableString> f63371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f63372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<String> f63373i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<SpannableString> f63374j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObservableField<String> f63375k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableField<String> f63376l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableField<Boolean> f63377m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ObservableField<String> f63378n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f63379o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<SpannableString> f63380p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<String> f63381q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ObservableField<Boolean> f63382r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public pp.b f63383s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public pp.b f63384t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public pp.b f63385u;

    public t2(@NonNull HOMECONTENTSEARCHLISTVIEWMODEL homecontentsearchlistviewmodel, RecommandVideosEntity recommandVideosEntity, String str, String str2) {
        super(homecontentsearchlistviewmodel);
        this.f63369e = new ObservableField<>();
        this.f63370f = new ObservableField<>(zp.r.b().getResources().getString(R.string.text_zongyi));
        this.f63371g = new ObservableField<>();
        this.f63372h = new ObservableField<>("");
        this.f63373i = new ObservableField<>("");
        this.f63374j = new ObservableField<>();
        this.f63375k = new ObservableField<>("");
        this.f63376l = new ObservableField<>("");
        Boolean bool = Boolean.FALSE;
        this.f63377m = new ObservableField<>(bool);
        this.f63378n = new ObservableField<>();
        this.f63380p = new ObservableField<>();
        this.f63381q = new ObservableField<>();
        this.f63382r = new ObservableField<>(bool);
        this.f63383s = new pp.b(new pp.a() { // from class: hc.q2
            @Override // pp.a
            public final void call() {
                this.f63339a.e();
            }
        });
        this.f63384t = new pp.b(new pp.a() { // from class: hc.r2
            @Override // pp.a
            public final void call() {
                this.f63345a.f();
            }
        });
        this.f63385u = new pp.b(new pp.a() { // from class: hc.s2
            @Override // pp.a
            public final void call() {
                this.f63360a.g();
            }
        });
        this.f63367c = homecontentsearchlistviewmodel;
        this.f75958b = str;
        this.f63368d = recommandVideosEntity;
        this.f63369e.set(ed.e.w(recommandVideosEntity.getVod_name(), str2));
        if (zp.o.b(recommandVideosEntity.getVod_director())) {
            this.f63371g.set(new SpannableString(zp.r.b().getResources().getString(R.string.text_director) + "：" + zp.r.b().getResources().getString(R.string.text_unknow)));
        } else {
            this.f63371g.set(ed.e.w(zp.r.b().getResources().getString(R.string.text_director) + "：" + recommandVideosEntity.getVod_director(), str2));
        }
        this.f63378n.set(recommandVideosEntity.getCollection_new_title());
        this.f63372h.set(recommandVideosEntity.getVod_area() + " · " + recommandVideosEntity.getVod_year());
        if (zp.o.b(recommandVideosEntity.getVod_actor())) {
            this.f63374j.set(new SpannableString(zp.r.b().getResources().getString(R.string.text_actor) + "：" + zp.r.b().getResources().getString(R.string.text_unknow)));
        } else {
            this.f63374j.set(ed.e.w(zp.r.b().getResources().getString(R.string.text_actor) + "：" + recommandVideosEntity.getVod_actor(), str2));
        }
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f63379o = ContextCompat.getDrawable(homecontentsearchlistviewmodel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f63379o = ContextCompat.getDrawable(homecontentsearchlistviewmodel.getApplication(), R.drawable.ic_video_high_score);
        }
        if (!zp.o.b(recommandVideosEntity.getVod_douban_score())) {
            this.f63380p.set(ed.e.m(recommandVideosEntity.getVod_douban_score()));
        }
        if (TextUtils.isEmpty(recommandVideosEntity.getAudio_language_tag())) {
            this.f63382r.set(bool);
        } else {
            this.f63382r.set(Boolean.TRUE);
            this.f63381q.set(recommandVideosEntity.getAudio_language_tag());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.f75954a).f44028p.setValue(this.f63368d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.f75954a).f44030r.setValue(this.f63368d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.f75954a).f44031s.setValue(this.f63368d);
    }
}
