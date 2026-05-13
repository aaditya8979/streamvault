package hc;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.mgs.carparking.model.SPECIALDETAILNEWVIEWMODEL;
import com.mgs.carparking.netbean.RecommandVideosEntity;

/* JADX INFO: compiled from: ITEMSPECIALDETAILNEWVIEWMODEL.java */
/* JADX INFO: loaded from: classes3.dex */
public class w2 extends np.c<SPECIALDETAILNEWVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecommandVideosEntity f63415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f63416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<SpannableString> f63417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<String> f63418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f63419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<String> f63420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f63421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<String> f63422i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<String> f63423j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public pp.b f63424k;

    public w2(@NonNull SPECIALDETAILNEWVIEWMODEL specialdetailnewviewmodel, RecommandVideosEntity recommandVideosEntity) {
        super(specialdetailnewviewmodel);
        this.f63417d = new ObservableField<>();
        this.f63418e = new ObservableField<>("");
        this.f63419f = new ObservableField<>("");
        this.f63420g = new ObservableField<>("");
        this.f63421h = new ObservableField<>("");
        this.f63422i = new ObservableField<>("");
        this.f63423j = new ObservableField<>();
        this.f63424k = new pp.b(new pp.a() { // from class: hc.v2
            @Override // pp.a
            public final void call() {
                this.f63409a.b();
            }
        });
        this.f63415b = recommandVideosEntity;
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f63416c = ContextCompat.getDrawable(specialdetailnewviewmodel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f63416c = ContextCompat.getDrawable(specialdetailnewviewmodel.getApplication(), R.drawable.ic_video_high_score);
        }
        if (zp.o.b(recommandVideosEntity.getVod_director())) {
            this.f63418e.set(zp.r.b().getResources().getString(R.string.text_director) + "：" + zp.r.b().getResources().getString(R.string.text_unknow));
        } else {
            this.f63418e.set(zp.r.b().getResources().getString(R.string.text_director) + "：" + recommandVideosEntity.getVod_director());
        }
        if (zp.o.b(recommandVideosEntity.getVod_actor())) {
            this.f63419f.set(zp.r.b().getResources().getString(R.string.text_actor) + "：" + zp.r.b().getResources().getString(R.string.text_unknow));
        } else {
            this.f63419f.set(zp.r.b().getResources().getString(R.string.text_actor) + "：" + recommandVideosEntity.getVod_actor());
        }
        if (zp.o.b(recommandVideosEntity.getVod_year())) {
            this.f63421h.set(zp.r.b().getResources().getString(R.string.text_unknow));
        } else {
            this.f63421h.set(recommandVideosEntity.getVod_year());
        }
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!zp.o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f63417d.set(ed.e.m(recommandVideosEntity.getVod_douban_score()));
            }
        } else if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f63423j.set(recommandVideosEntity.getCollection_new_title() + "");
        } else if (recommandVideosEntity.getVod_isend() == 1) {
            this.f63423j.set(recommandVideosEntity.getVod_total() + zp.r.b().getResources().getString(R.string.text_colections));
        } else {
            this.f63423j.set(zp.r.b().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (zp.o.b(recommandVideosEntity.getVod_tag())) {
            this.f63422i.set(zp.r.b().getResources().getString(R.string.text_unknow));
        } else {
            this.f63422i.set(recommandVideosEntity.getVod_tag());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        ((SPECIALDETAILNEWVIEWMODEL) this.f75954a).y(this.f63415b);
    }
}
