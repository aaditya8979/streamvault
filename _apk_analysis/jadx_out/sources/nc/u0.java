package nc;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.HomeContentMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeContentMultipleListItemNoTitleViewModel.java */
/* JADX INFO: loaded from: classes11.dex */
public class u0 extends np.c<HomeContentMultipleListViewModel> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecommandVideosEntity f75828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f75829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f75830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<SpannableString> f75831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f75832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pp.b f75833g;

    public u0(@NonNull HomeContentMultipleListViewModel homeContentMultipleListViewModel, RecommandVideosEntity recommandVideosEntity, int i10) {
        super(homeContentMultipleListViewModel);
        this.f75831e = new ObservableField<>();
        this.f75832f = new ObservableField<>();
        this.f75833g = new pp.b(new pp.a() { // from class: nc.t0
            @Override // pp.a
            public final void call() {
                this.f75826a.b();
            }
        });
        this.f75828b = recommandVideosEntity;
        this.f75829c = i10;
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!zp.o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f75831e.set(ed.e.m(recommandVideosEntity.getVod_douban_score()));
            }
        } else if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f75832f.set(recommandVideosEntity.getCollection_new_title() + "");
        } else if (recommandVideosEntity.getVod_isend() == 1) {
            this.f75832f.set(recommandVideosEntity.getVod_total() + zp.r.b().getResources().getString(R.string.text_colections));
        } else {
            this.f75832f.set(zp.r.b().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f75830d = ContextCompat.getDrawable(homeContentMultipleListViewModel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f75830d = ContextCompat.getDrawable(homeContentMultipleListViewModel.getApplication(), R.drawable.ic_video_high_score);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f75828b.setModule_id(this.f75829c);
        ((HomeContentMultipleListViewModel) this.f75954a).f44607m.setValue(this.f75828b);
    }
}
