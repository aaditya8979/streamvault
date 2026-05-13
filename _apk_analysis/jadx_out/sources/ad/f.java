package ad;

import android.text.SpannableString;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.ranklist.RankContentListViewModel;
import ed.i0;
import zp.r;

/* JADX INFO: compiled from: ItemRankContentMutipleNextViewModel.java */
/* JADX INFO: loaded from: classes4.dex */
public class f extends np.e<RankContentListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecommandVideosEntity f3725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f3728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<String> f3729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f3730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<String> f3731i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<String> f3732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObservableField<String> f3733k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableField<String> f3734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableField<SpannableString> f3735m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ObservableField<String> f3736n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableBoolean f3737o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<String> f3738p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<Boolean> f3739q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public pp.b f3740r;

    public f(@NonNull RankContentListViewModel rankContentListViewModel, RecommandVideosEntity recommandVideosEntity, String str, int i10, int i11, int i12, VideoLookHistoryEntry videoLookHistoryEntry) {
        super(rankContentListViewModel);
        this.f3728f = new ObservableField<>("");
        this.f3729g = new ObservableField<>("");
        this.f3730h = new ObservableField<>("");
        this.f3731i = new ObservableField<>("");
        this.f3732j = new ObservableField<>("");
        this.f3733k = new ObservableField<>("");
        this.f3734l = new ObservableField<>();
        this.f3735m = new ObservableField<>();
        this.f3736n = new ObservableField<>();
        this.f3737o = new ObservableBoolean(false);
        this.f3738p = new ObservableField<>();
        Boolean bool = Boolean.FALSE;
        this.f3739q = new ObservableField<>(bool);
        this.f3740r = new pp.b(new pp.a() { // from class: ad.e
            @Override // pp.a
            public final void call() {
                this.f3724a.c();
            }
        });
        this.f75958b = str;
        this.f3725c = recommandVideosEntity;
        this.f3726d = i10;
        this.f3727e = i11;
        if (videoLookHistoryEntry != null) {
            this.f3737o.set(true);
            this.f3736n.set(i0.d(videoLookHistoryEntry.getContentPosition(), videoLookHistoryEntry.getDuration()));
        } else {
            this.f3737o.set(false);
        }
        this.f3733k.set((i11 + 1 + ((i10 - 1) * 20)) + "");
        if (zp.o.b(recommandVideosEntity.getVod_director())) {
            this.f3728f.set(r.b().getResources().getString(R.string.text_director) + "：" + r.b().getResources().getString(R.string.text_unknow));
        } else {
            this.f3728f.set(r.b().getResources().getString(R.string.text_director) + "：" + recommandVideosEntity.getVod_director());
        }
        if (zp.o.b(recommandVideosEntity.getVod_actor())) {
            this.f3729g.set(r.b().getResources().getString(R.string.text_actor) + "：" + r.b().getResources().getString(R.string.text_unknow));
        } else {
            this.f3729g.set(r.b().getResources().getString(R.string.text_actor) + "：" + recommandVideosEntity.getVod_actor());
        }
        if (zp.o.b(recommandVideosEntity.getVod_tag())) {
            this.f3732j.set(r.b().getResources().getString(R.string.text_unknow));
        } else {
            this.f3732j.set(recommandVideosEntity.getVod_tag());
        }
        if (zp.o.b(recommandVideosEntity.getVod_year())) {
            this.f3731i.set(r.b().getResources().getString(R.string.text_unknow));
        } else {
            this.f3731i.set(recommandVideosEntity.getVod_year());
        }
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!zp.o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f3735m.set(ed.e.m(recommandVideosEntity.getVod_douban_score()));
            }
        } else if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f3734l.set(recommandVideosEntity.getCollection_new_title() + "");
        } else if (recommandVideosEntity.getVod_isend() == 1) {
            this.f3734l.set(recommandVideosEntity.getVod_total() + r.b().getResources().getString(R.string.text_colections));
        } else {
            this.f3734l.set(r.b().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (TextUtils.isEmpty(recommandVideosEntity.getAudio_language_tag())) {
            this.f3739q.set(bool);
        } else {
            this.f3739q.set(Boolean.TRUE);
            this.f3738p.set(recommandVideosEntity.getAudio_language_tag());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        ((RankContentListViewModel) this.f75954a).f44925r.setValue(this.f3725c);
    }
}
