package hc;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import com.mgs.carparking.netbean.RecommandVideosEntity;

/* JADX INFO: compiled from: ITEMGUSSVIDEOVIEWMODEL.java */
/* JADX INFO: loaded from: classes3.dex */
public class s1 extends np.c<VIDEOPLAYDETAILVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecommandVideosEntity f63355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f63356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<SpannableString> f63357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<String> f63358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pp.b f63359f;

    public s1(@NonNull VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel, RecommandVideosEntity recommandVideosEntity) {
        super(videoplaydetailviewmodel);
        this.f63357d = new ObservableField<>();
        this.f63358e = new ObservableField<>();
        this.f63359f = new pp.b(new pp.a() { // from class: hc.r1
            @Override // pp.a
            public final void call() {
                this.f63344a.b();
            }
        });
        this.f63355b = recommandVideosEntity;
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!zp.o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f63357d.set(ed.e.m(recommandVideosEntity.getVod_douban_score()));
            }
        } else if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f63358e.set(recommandVideosEntity.getCollection_new_title() + "");
        } else if (recommandVideosEntity.getVod_isend() == 1) {
            this.f63358e.set(recommandVideosEntity.getVod_total() + zp.r.b().getResources().getString(R.string.text_colections));
        } else {
            this.f63358e.set(zp.r.b().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f63356c = ContextCompat.getDrawable(videoplaydetailviewmodel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f63356c = ContextCompat.getDrawable(videoplaydetailviewmodel.getApplication(), R.drawable.ic_video_high_score);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        ((VIDEOPLAYDETAILVIEWMODEL) this.f75954a).Z0(this.f63355b.getId());
    }
}
