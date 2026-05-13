package hc;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import com.dramarush.shortin.R;
import com.mgs.carparking.model.HOMECONTENTSEARCHLISTVIEWMODEL;
import com.mgs.carparking.netbean.RecommandVideosEntity;

/* JADX INFO: compiled from: ITEMSEARCHLISTTVVIEWMODEL.java */
/* JADX INFO: loaded from: classes4.dex */
public class p2 extends np.e<HOMECONTENTSEARCHLISTVIEWMODEL> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HOMECONTENTSEARCHLISTVIEWMODEL f63311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecommandVideosEntity f63312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<SpannableString> f63313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f63314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<SpannableString> f63315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f63316h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<String> f63317i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<SpannableString> f63318j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObservableField<String> f63319k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableList<u2> f63320l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public aq.c<u2> f63321m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f63322n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<SpannableString> f63323o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<String> f63324p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<Boolean> f63325q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public pp.b f63326r;

    public p2(@NonNull HOMECONTENTSEARCHLISTVIEWMODEL homecontentsearchlistviewmodel, RecommandVideosEntity recommandVideosEntity, String str, String str2) {
        super(homecontentsearchlistviewmodel);
        this.f63313e = new ObservableField<>();
        this.f63314f = new ObservableField<>(zp.r.b().getResources().getString(R.string.text_tv));
        this.f63315g = new ObservableField<>();
        this.f63316h = new ObservableField<>("");
        this.f63317i = new ObservableField<>("");
        this.f63318j = new ObservableField<>();
        this.f63319k = new ObservableField<>();
        this.f63320l = new ObservableArrayList();
        this.f63321m = aq.c.d(new aq.d() { // from class: hc.n2
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_search_tv_set_num);
            }
        });
        this.f63323o = new ObservableField<>();
        this.f63324p = new ObservableField<>();
        Boolean bool = Boolean.FALSE;
        this.f63325q = new ObservableField<>(bool);
        this.f63326r = new pp.b(new pp.a() { // from class: hc.o2
            @Override // pp.a
            public final void call() {
                this.f63300a.e();
            }
        });
        this.f63311c = homecontentsearchlistviewmodel;
        this.f75958b = str;
        this.f63312d = recommandVideosEntity;
        this.f63313e.set(ed.e.w(recommandVideosEntity.getVod_name(), str2));
        if (zp.o.b(recommandVideosEntity.getVod_director())) {
            this.f63315g.set(new SpannableString(zp.r.b().getResources().getString(R.string.text_director) + "：" + zp.r.b().getResources().getString(R.string.text_unknow)));
        } else {
            this.f63315g.set(ed.e.w(zp.r.b().getResources().getString(R.string.text_director) + "：" + recommandVideosEntity.getVod_director(), str2));
        }
        this.f63316h.set(recommandVideosEntity.getVod_area() + " · " + recommandVideosEntity.getVod_year());
        if (zp.o.b(recommandVideosEntity.getVod_actor())) {
            this.f63318j.set(new SpannableString(zp.r.b().getResources().getString(R.string.text_actor) + "：" + zp.r.b().getResources().getString(R.string.text_unknow)));
        } else {
            this.f63318j.set(ed.e.w(zp.r.b().getResources().getString(R.string.text_actor) + "：" + recommandVideosEntity.getVod_actor(), str2));
        }
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f63322n = ContextCompat.getDrawable(homecontentsearchlistviewmodel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f63322n = ContextCompat.getDrawable(homecontentsearchlistviewmodel.getApplication(), R.drawable.ic_video_high_score);
        }
        if (recommandVideosEntity.getVod_isend() == 1) {
            this.f63319k.set(recommandVideosEntity.getVod_total() + zp.r.b().getResources().getString(R.string.text_colections));
        } else {
            this.f63319k.set(zp.r.b().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (TextUtils.isEmpty(recommandVideosEntity.getAudio_language_tag())) {
            this.f63325q.set(bool);
        } else {
            this.f63325q.set(Boolean.TRUE);
            this.f63324p.set(recommandVideosEntity.getAudio_language_tag());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.f75954a).f44028p.setValue(this.f63312d);
    }
}
