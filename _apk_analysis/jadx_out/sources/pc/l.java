package pc;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeRecommendGussLikeViewModel.java */
/* JADX INFO: loaded from: classes12.dex */
public class l extends np.e<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecommandVideosEntity f77220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<SpannableString> f77221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<SpannableString> f77222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f77223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<Boolean> f77224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f77225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public pp.b f77226i;

    public l(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, RecommandVideosEntity recommandVideosEntity, String str) {
        super(homeRecommendMultipleListViewModel);
        this.f77221d = new ObservableField<>();
        this.f77222e = new ObservableField<>();
        this.f77223f = new ObservableField<>();
        this.f77224g = new ObservableField<>();
        this.f77226i = new pp.b(new pp.a() { // from class: pc.k
            @Override // pp.a
            public final void call() {
                this.f77213a.c();
            }
        });
        this.f77220c = recommandVideosEntity;
        this.f75958b = str;
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f77225h = ContextCompat.getDrawable(homeRecommendMultipleListViewModel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f77225h = ContextCompat.getDrawable(homeRecommendMultipleListViewModel.getApplication(), R.drawable.ic_video_high_score);
        }
        if (recommandVideosEntity.getType_pid() == 1) {
            this.f77221d.set(ed.h0.a(homeRecommendMultipleListViewModel.getApplication(), recommandVideosEntity.getVod_actor(), R.drawable.ic_video_movie));
        } else if (recommandVideosEntity.getType_pid() == 2) {
            this.f77221d.set(ed.h0.a(homeRecommendMultipleListViewModel.getApplication(), recommandVideosEntity.getVod_actor(), R.drawable.ic_video_tv));
        } else if (recommandVideosEntity.getType_pid() == 4) {
            this.f77221d.set(ed.h0.a(homeRecommendMultipleListViewModel.getApplication(), recommandVideosEntity.getVod_actor(), R.drawable.ic_video_comic));
        } else if (recommandVideosEntity.getType_pid() == 3) {
            this.f77221d.set(ed.h0.a(homeRecommendMultipleListViewModel.getApplication(), recommandVideosEntity.getVod_actor(), R.drawable.ic_video_variety));
        }
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!zp.o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f77222e.set(ed.e.m(recommandVideosEntity.getVod_douban_score()));
            }
        } else if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f77223f.set(recommandVideosEntity.getCollection_new_title() + "");
        } else if (recommandVideosEntity.getVod_isend() == 1) {
            this.f77223f.set(recommandVideosEntity.getVod_total() + zp.r.b().getResources().getString(R.string.text_colections));
        } else {
            this.f77223f.set(zp.r.b().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (zp.o.b(recommandVideosEntity.getRemarks())) {
            this.f77224g.set(Boolean.FALSE);
        } else {
            this.f77224g.set(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        ((HomeRecommendMultipleListViewModel) this.f75954a).f44684p.setValue(this.f77220c);
    }
}
