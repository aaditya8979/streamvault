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

/* JADX INFO: compiled from: ITEMSEARCHLISTCOMICVIEWMODEL.java */
/* JADX INFO: loaded from: classes4.dex */
public class k2 extends np.e<HOMECONTENTSEARCHLISTVIEWMODEL> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HOMECONTENTSEARCHLISTVIEWMODEL f63238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecommandVideosEntity f63239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<SpannableString> f63240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f63241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<SpannableString> f63242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f63243h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<String> f63244i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<SpannableString> f63245j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f63246k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableField<String> f63247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableList<u2> f63248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public aq.c<u2> f63249n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<String> f63250o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<Boolean> f63251p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public pp.b f63252q;

    public k2(@NonNull HOMECONTENTSEARCHLISTVIEWMODEL homecontentsearchlistviewmodel, RecommandVideosEntity recommandVideosEntity, String str, String str2) {
        super(homecontentsearchlistviewmodel);
        this.f63240e = new ObservableField<>();
        this.f63241f = new ObservableField<>(zp.r.b().getResources().getString(R.string.text_dongman));
        this.f63242g = new ObservableField<>();
        this.f63243h = new ObservableField<>("");
        this.f63244i = new ObservableField<>("");
        this.f63245j = new ObservableField<>();
        this.f63247l = new ObservableField<>();
        this.f63248m = new ObservableArrayList();
        this.f63249n = aq.c.d(new aq.d() { // from class: hc.i2
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_search_tv_set_num);
            }
        });
        this.f63250o = new ObservableField<>();
        Boolean bool = Boolean.FALSE;
        this.f63251p = new ObservableField<>(bool);
        this.f63252q = new pp.b(new pp.a() { // from class: hc.j2
            @Override // pp.a
            public final void call() {
                this.f63232a.e();
            }
        });
        this.f63238c = homecontentsearchlistviewmodel;
        this.f75958b = str;
        this.f63239d = recommandVideosEntity;
        this.f63240e.set(ed.e.w(recommandVideosEntity.getVod_name(), str2));
        if (zp.o.b(recommandVideosEntity.getVod_director())) {
            this.f63242g.set(new SpannableString(zp.r.b().getResources().getString(R.string.text_director) + "：" + zp.r.b().getResources().getString(R.string.text_unknow)));
        } else {
            this.f63242g.set(ed.e.w(zp.r.b().getResources().getString(R.string.text_director) + "：" + recommandVideosEntity.getVod_director(), str2));
        }
        this.f63243h.set(recommandVideosEntity.getVod_area() + " · " + recommandVideosEntity.getVod_year());
        if (zp.o.b(recommandVideosEntity.getVod_actor())) {
            this.f63245j.set(new SpannableString(zp.r.b().getResources().getString(R.string.text_actor) + "：" + zp.r.b().getResources().getString(R.string.text_unknow)));
        } else {
            this.f63245j.set(ed.e.w(zp.r.b().getResources().getString(R.string.text_actor) + "：" + recommandVideosEntity.getVod_actor(), str2));
        }
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f63246k = ContextCompat.getDrawable(homecontentsearchlistviewmodel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f63246k = ContextCompat.getDrawable(homecontentsearchlistviewmodel.getApplication(), R.drawable.ic_video_high_score);
        }
        if (recommandVideosEntity.getVod_isend() == 1) {
            this.f63247l.set(recommandVideosEntity.getVod_total() + zp.r.b().getResources().getString(R.string.text_colections));
        } else {
            this.f63247l.set(zp.r.b().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (TextUtils.isEmpty(recommandVideosEntity.getAudio_language_tag())) {
            this.f63251p.set(bool);
        } else {
            this.f63251p.set(Boolean.TRUE);
            this.f63250o.set(recommandVideosEntity.getAudio_language_tag());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.f75954a).f44028p.setValue(this.f63239d);
    }
}
