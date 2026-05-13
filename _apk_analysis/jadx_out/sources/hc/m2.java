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

/* JADX INFO: compiled from: ITEMSEARCHLISTMOVIEVIEWMODEL.java */
/* JADX INFO: loaded from: classes4.dex */
public class m2 extends np.e<HOMECONTENTSEARCHLISTVIEWMODEL> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HOMECONTENTSEARCHLISTVIEWMODEL f63268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecommandVideosEntity f63269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<SpannableString> f63270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f63271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<SpannableString> f63272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f63273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<String> f63274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<SpannableString> f63275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f63276k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableField<SpannableString> f63277l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableField<String> f63278m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ObservableField<Boolean> f63279n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public pp.b f63280o;

    public m2(@NonNull HOMECONTENTSEARCHLISTVIEWMODEL homecontentsearchlistviewmodel, RecommandVideosEntity recommandVideosEntity, String str, String str2) {
        super(homecontentsearchlistviewmodel);
        this.f63270e = new ObservableField<>();
        this.f63271f = new ObservableField<>(zp.r.b().getResources().getString(R.string.text_movie));
        this.f63272g = new ObservableField<>();
        this.f63273h = new ObservableField<>("");
        this.f63274i = new ObservableField<>("");
        this.f63275j = new ObservableField<>();
        this.f63277l = new ObservableField<>();
        this.f63278m = new ObservableField<>();
        Boolean bool = Boolean.FALSE;
        this.f63279n = new ObservableField<>(bool);
        this.f63280o = new pp.b(new pp.a() { // from class: hc.l2
            @Override // pp.a
            public final void call() {
                this.f63262a.c();
            }
        });
        this.f63268c = homecontentsearchlistviewmodel;
        this.f75958b = str;
        this.f63269d = recommandVideosEntity;
        this.f63270e.set(ed.e.w(recommandVideosEntity.getVod_name(), str2));
        if (zp.o.b(recommandVideosEntity.getVod_director())) {
            this.f63272g.set(new SpannableString(zp.r.b().getResources().getString(R.string.text_director) + "：" + zp.r.b().getResources().getString(R.string.text_unknow)));
        } else {
            this.f63272g.set(ed.e.w(zp.r.b().getResources().getString(R.string.text_director) + "：" + recommandVideosEntity.getVod_director(), str2));
        }
        this.f63273h.set(recommandVideosEntity.getVod_year());
        if (zp.o.b(recommandVideosEntity.getVod_actor())) {
            this.f63275j.set(new SpannableString(zp.r.b().getResources().getString(R.string.text_actor) + "：" + zp.r.b().getResources().getString(R.string.text_unknow)));
        } else {
            this.f63275j.set(ed.e.w(zp.r.b().getResources().getString(R.string.text_actor) + "：" + recommandVideosEntity.getVod_actor(), str2));
        }
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f63276k = ContextCompat.getDrawable(homecontentsearchlistviewmodel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f63276k = ContextCompat.getDrawable(homecontentsearchlistviewmodel.getApplication(), R.drawable.ic_video_high_score);
        }
        if (!zp.o.b(recommandVideosEntity.getVod_douban_score())) {
            this.f63277l.set(ed.e.m(recommandVideosEntity.getVod_douban_score()));
        }
        if (TextUtils.isEmpty(recommandVideosEntity.getAudio_language_tag())) {
            this.f63279n.set(bool);
        } else {
            this.f63279n.set(Boolean.TRUE);
            this.f63278m.set(recommandVideosEntity.getAudio_language_tag());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.f75954a).f44028p.setValue(this.f63269d);
    }
}
