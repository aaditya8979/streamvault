package hc;

import android.text.SpannableString;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.mgs.carparking.model.LOOKCHANNELVIEWMODEL;
import com.mgs.carparking.netbean.RecommandVideosEntity;

/* JADX INFO: compiled from: ITEMLOOKCHANNELSEARCHRESULTVIEWMODEL.java */
/* JADX INFO: loaded from: classes3.dex */
public class y1 extends np.c<LOOKCHANNELVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecommandVideosEntity f63459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObservableField<SpannableString> f63460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<String> f63461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<String> f63462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f63463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<Boolean> f63464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public pp.b f63465h;

    public y1(@NonNull LOOKCHANNELVIEWMODEL lookchannelviewmodel, RecommandVideosEntity recommandVideosEntity) {
        super(lookchannelviewmodel);
        this.f63460c = new ObservableField<>();
        this.f63461d = new ObservableField<>();
        this.f63462e = new ObservableField<>();
        this.f63463f = new ObservableField<>();
        Boolean bool = Boolean.FALSE;
        this.f63464g = new ObservableField<>(bool);
        this.f63465h = new pp.b(new pp.a() { // from class: hc.x1
            @Override // pp.a
            public final void call() {
                this.f63429a.b();
            }
        });
        this.f63459b = recommandVideosEntity;
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!zp.o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f63460c.set(ed.e.m(recommandVideosEntity.getVod_douban_score()));
            }
        } else if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f63461d.set(recommandVideosEntity.getCollection_new_title() + "");
        } else if (recommandVideosEntity.getVod_isend() == 1) {
            this.f63461d.set(recommandVideosEntity.getVod_total() + zp.r.b().getResources().getString(R.string.text_colections));
        } else {
            this.f63461d.set(zp.r.b().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (TextUtils.isEmpty(recommandVideosEntity.getAudio_language_tag())) {
            this.f63464g.set(bool);
        } else {
            this.f63464g.set(Boolean.TRUE);
            this.f63463f.set(recommandVideosEntity.getAudio_language_tag());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        ((LOOKCHANNELVIEWMODEL) this.f75954a).W(this.f63459b);
    }
}
