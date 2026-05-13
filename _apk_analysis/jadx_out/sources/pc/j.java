package pc;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeRcommendMultipleListItemHotViewModel.java */
/* JADX INFO: loaded from: classes12.dex */
public class j extends np.c<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecommandVideosEntity f77206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f77207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<SpannableString> f77208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<String> f77209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f77210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pp.b f77211g;

    public j(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, RecommandVideosEntity recommandVideosEntity, int i10) {
        super(homeRecommendMultipleListViewModel);
        this.f77208d = new ObservableField<>();
        this.f77209e = new ObservableField<>();
        this.f77211g = new pp.b(new pp.a() { // from class: pc.i
            @Override // pp.a
            public final void call() {
                this.f77204a.b();
            }
        });
        this.f77206b = recommandVideosEntity;
        this.f77210f = i10;
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!zp.o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f77208d.set(ed.e.m(recommandVideosEntity.getVod_douban_score()));
            }
        } else if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f77209e.set(recommandVideosEntity.getCollection_new_title() + "");
        } else if (recommandVideosEntity.getVod_isend() == 1) {
            this.f77209e.set(recommandVideosEntity.getVod_total() + zp.r.b().getResources().getString(R.string.text_colections));
        } else {
            this.f77209e.set(zp.r.b().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f77207c = ContextCompat.getDrawable(homeRecommendMultipleListViewModel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f77207c = ContextCompat.getDrawable(homeRecommendMultipleListViewModel.getApplication(), R.drawable.ic_video_high_score);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f77206b.setModule_id(this.f77210f);
        ((HomeRecommendMultipleListViewModel) this.f75954a).f44684p.setValue(this.f77206b);
    }
}
