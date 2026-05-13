package pc;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeRecommendMultipleListItemMultipleViewModel.java */
/* JADX INFO: loaded from: classes7.dex */
public class a0 extends np.c<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecommandVideosEntity f77170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f77171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f77172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<SpannableString> f77173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f77174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pp.b f77175g;

    public a0(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, RecommandVideosEntity recommandVideosEntity, int i10) {
        super(homeRecommendMultipleListViewModel);
        this.f77173e = new ObservableField<>();
        this.f77174f = new ObservableField<>();
        this.f77175g = new pp.b(new pp.a() { // from class: pc.z
            @Override // pp.a
            public final void call() {
                this.f77269a.b();
            }
        });
        this.f77170b = recommandVideosEntity;
        this.f77171c = i10;
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!zp.o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f77173e.set(ed.e.m(recommandVideosEntity.getVod_douban_score()));
            }
        } else if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f77174f.set(recommandVideosEntity.getCollection_new_title() + "");
        } else if (recommandVideosEntity.getVod_isend() == 1) {
            this.f77174f.set(recommandVideosEntity.getVod_total() + zp.r.b().getResources().getString(R.string.text_colections));
        } else {
            this.f77174f.set(zp.r.b().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f77172d = ContextCompat.getDrawable(homeRecommendMultipleListViewModel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f77172d = ContextCompat.getDrawable(homeRecommendMultipleListViewModel.getApplication(), R.drawable.ic_video_high_score);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f77170b.setModule_id(this.f77171c);
        ((HomeRecommendMultipleListViewModel) this.f75954a).f44684p.setValue(this.f77170b);
    }
}
