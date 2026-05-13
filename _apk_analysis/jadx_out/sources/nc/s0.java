package nc;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.HomeContentMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeContentMultipleListItemNewViewModel.java */
/* JADX INFO: loaded from: classes10.dex */
public class s0 extends np.c<HomeContentMultipleListViewModel> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecommandVideosEntity f75817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f75818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f75819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<SpannableString> f75820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f75821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<Boolean> f75822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f75823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public pp.b f75824i;

    public s0(@NonNull HomeContentMultipleListViewModel homeContentMultipleListViewModel, RecommandVideosEntity recommandVideosEntity, int i10) {
        super(homeContentMultipleListViewModel);
        this.f75820e = new ObservableField<>();
        this.f75821f = new ObservableField<>();
        Boolean bool = Boolean.FALSE;
        this.f75822g = new ObservableField<>(bool);
        this.f75823h = new ObservableField<>();
        this.f75824i = new pp.b(new pp.a() { // from class: nc.r0
            @Override // pp.a
            public final void call() {
                this.f75815a.b();
            }
        });
        this.f75817b = recommandVideosEntity;
        this.f75818c = i10;
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!zp.o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f75820e.set(ed.e.m(recommandVideosEntity.getVod_douban_score()));
            }
        } else if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f75823h.set(recommandVideosEntity.getCollection_new_title() + "");
        } else if (recommandVideosEntity.getVod_isend() == 1) {
            this.f75823h.set(recommandVideosEntity.getVod_total() + zp.r.b().getResources().getString(R.string.text_colections));
        } else {
            this.f75823h.set(zp.r.b().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (TextUtils.isEmpty(recommandVideosEntity.getAudio_language_tag())) {
            this.f75822g.set(bool);
        } else {
            this.f75822g.set(Boolean.TRUE);
            this.f75821f.set(recommandVideosEntity.getAudio_language_tag());
        }
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f75819d = ContextCompat.getDrawable(homeContentMultipleListViewModel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f75819d = ContextCompat.getDrawable(homeContentMultipleListViewModel.getApplication(), R.drawable.ic_video_high_score);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f75817b.setModule_id(this.f75818c);
        ((HomeContentMultipleListViewModel) this.f75954a).f44607m.setValue(this.f75817b);
    }
}
