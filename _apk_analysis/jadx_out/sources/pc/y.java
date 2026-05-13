package pc;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeRecommendMultipleListItemGusslikeHorizationViewModel.java */
/* JADX INFO: loaded from: classes12.dex */
public class y extends np.c<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecommandVideosEntity f77262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f77263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f77264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<SpannableString> f77265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f77266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<Boolean> f77267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public pp.b f77268h;

    public y(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, RecommandVideosEntity recommandVideosEntity, int i10) {
        super(homeRecommendMultipleListViewModel);
        this.f77265e = new ObservableField<>();
        this.f77266f = new ObservableField<>();
        Boolean bool = Boolean.FALSE;
        this.f77267g = new ObservableField<>(bool);
        this.f77268h = new pp.b(new pp.a() { // from class: pc.x
            @Override // pp.a
            public final void call() {
                this.f77261a.b();
            }
        });
        this.f77262b = recommandVideosEntity;
        this.f77263c = i10;
        if (zp.o.b(recommandVideosEntity.getVod_name())) {
            this.f77267g.set(Boolean.TRUE);
            return;
        }
        this.f77267g.set(bool);
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!zp.o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f77265e.set(ed.e.m(recommandVideosEntity.getVod_douban_score()));
            }
        } else if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f77266f.set(recommandVideosEntity.getCollection_new_title() + "");
        } else if (recommandVideosEntity.getVod_isend() == 1) {
            this.f77266f.set(recommandVideosEntity.getVod_total() + zp.r.b().getResources().getString(R.string.text_colections));
        } else {
            this.f77266f.set(zp.r.b().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f77264d = ContextCompat.getDrawable(homeRecommendMultipleListViewModel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f77264d = ContextCompat.getDrawable(homeRecommendMultipleListViewModel.getApplication(), R.drawable.ic_video_high_score);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (zp.o.b(this.f77262b.getVod_name())) {
            ((HomeRecommendMultipleListViewModel) this.f75954a).s();
        } else {
            this.f77262b.setModule_id(this.f77263c);
            ((HomeRecommendMultipleListViewModel) this.f75954a).f44684p.setValue(this.f77262b);
        }
    }
}
